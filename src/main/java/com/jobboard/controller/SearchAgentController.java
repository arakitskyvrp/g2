/**
 * 
 */
package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModelEvent;
import javax.faces.model.DataModelListener;

import org.primefaces.context.RequestContext;

import com.jobboard.controller.JobSearchController.Criteria;
import com.jobboard.controller.JobSearchController.Keyword;
import com.jobboard.model.SearchAgentDataModel;
import com.jobboard.model.heroku.SearchAgent;
import com.jobboard.model.heroku.SearchAgentCriteria;
import com.jobboard.model.heroku.service.SearchAgentService;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

/**
 * @author r.kavalinovski
 * 
 */
@ManagedBean(name = "searchAgentController")
@SessionScoped
public class SearchAgentController implements Serializable, DataModelListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1392409919111195661L;
	public static final String KEYWORD_SEARCH_FIELD_DESC = "KEYWORD_SEARCH";
	public static final String KEYWORD_OPERATOR_SEPARATOR = "__OPERATOR__";

	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{searchAgentService}")
	private SearchAgentService searchAgentService;

	private SearchAgentDataModel searchAgentsModel;
	private SearchAgent selectedSearchAgent;

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public SearchAgentDataModel getSearchAgentsModel() {
		if (searchAgentsModel == null) {
			searchAgentsModel = new SearchAgentDataModel(
					getJobSearchController().getLoggedInUser()
							.getSearchAgents());
			searchAgentsModel.addDataModelListener(this);
			searchAgentsModel.setRowIndex(0);
		}
		if (searchAgentsModel.getSearchAgents().isEmpty()) {
			selectedSearchAgent = null;
		}
		return searchAgentsModel;
	}

	public void setSearchAgentsModel(SearchAgentDataModel searchAgentsModel) {
		this.searchAgentsModel = searchAgentsModel;
	}

	public int getNumberOfJobsFromAgent(SearchAgent searchAgent) {
		int numberOfJobs = 0;
		String whereQueryFromSearchAgent = getWhereQueryFromSearchAgent(searchAgent);
		List<Ts2__Job__c> queryAllWhere = getJobSearchController()
				.getJobOrderSOAPService().queryAllWhere(
						whereQueryFromSearchAgent);
		if (queryAllWhere != null) {
			numberOfJobs = queryAllWhere.size();
		}
		return numberOfJobs;
	}

	public void delete(SearchAgent searchAgent) {
		if (getSearchAgentsModel().getSearchAgents().contains(searchAgent)) {
			getSearchAgentsModel().getSearchAgents().remove(searchAgent);
		}
		removeSearchAgent(searchAgent);
	}

	public String getWhereQueryFromSearchAgent(SearchAgent searchAgent) {
		String whereQuery = "";
		List<Criteria> criterias = new ArrayList<JobSearchController.Criteria>();
		List<Keyword> keywords = new ArrayList<JobSearchController.Keyword>();
		List<SearchAgentCriteria> searchAgentCriterias = searchAgent
				.getSearchAgentCriterias();
		for (SearchAgentCriteria searchAgentCriteria : searchAgentCriterias) {
			String criteriaFieldDesc = searchAgentCriteria
					.getCriteria_Field_Desc();
			if (criteriaFieldDesc.equals(KEYWORD_SEARCH_FIELD_DESC)) {
				String[] split = searchAgentCriteria.getCriteria_Value().split(
						KEYWORD_OPERATOR_SEPARATOR);
				if (split != null && split.length == 2) {
					Keyword keyword = new Keyword(split[0], split[1]);
					keywords.add(keyword);
				}
			} else {
				Criteria criteria = new Criteria(criteriaFieldDesc,
						JobReflection.getFieldByName(criteriaFieldDesc)
								.getLabel(),getJobSearchController().getLanguageTranslationWrapper());
				criteria.setSelectedValue(searchAgentCriteria
						.getCriteria_Value());
				criterias.add(criteria);
			}
		}
		whereQuery = getWhereFromCriteriasAndKeywords(criterias, keywords);
		return whereQuery;
	}

	public List<Criteria> getSearchCriteriasFromSearchAgent(
			SearchAgent searchAgent) {

		List<Criteria> criterias = new ArrayList<JobSearchController.Criteria>();
		List<SearchAgentCriteria> searchAgentCriterias = searchAgent
				.getSearchAgentCriterias();
		for (SearchAgentCriteria searchAgentCriteria : searchAgentCriterias) {
			String criteriaFieldDesc = searchAgentCriteria
					.getCriteria_Field_Desc();
			if (criteriaFieldDesc.equals(KEYWORD_SEARCH_FIELD_DESC)) {
				continue;
			} else {
				Criteria criteria = new Criteria(criteriaFieldDesc,
						JobReflection.getFieldByName(criteriaFieldDesc)
								.getLabel(),getJobSearchController().getLanguageTranslationWrapper());
				criteria.setSelectedValue(searchAgentCriteria
						.getCriteria_Value());
				criterias.add(criteria);
			}
		}
		return criterias;
	}

	public static List<Keyword> getKeywordsFromSearchAgent(
			SearchAgent searchAgent) {
		List<Keyword> keywords = new ArrayList<JobSearchController.Keyword>();
		List<SearchAgentCriteria> searchAgentCriterias = searchAgent
				.getSearchAgentCriterias();
		for (SearchAgentCriteria searchAgentCriteria : searchAgentCriterias) {
			String criteriaFieldDesc = searchAgentCriteria
					.getCriteria_Field_Desc();
			if (criteriaFieldDesc.equals(KEYWORD_SEARCH_FIELD_DESC)) {
				String[] split = searchAgentCriteria.getCriteria_Value().split(
						KEYWORD_OPERATOR_SEPARATOR);
				if (split != null && split.length == 2) {
					Keyword keyword = new Keyword(split[0], split[1]);
					keywords.add(keyword);
				}
			}
		}
		return keywords;
	}

	public static String getWhereFromCriteria(List<Criteria> criterias) {
		StringBuffer sb = new StringBuffer();
		for (Criteria criteria : criterias) {
			if (criteria.getSelectedValue() != null
					&& !criteria.getSelectedValue()/* .getValue().toString() */
					.isEmpty() && !criteria.getSelectedValue()/* .getLabel() */
					.equals(Criteria.NONE.getLabel())) {
				if (!sb.toString().isEmpty()) {
					sb.append(" AND ");
				}
				sb.append(criteria.getName() + "= '"
						+ criteria.getSelectedValue()
						/* .getValue() */.toString() + "'");
			}
		}
		return sb.toString();
	}

	public static String getWhereFromKeywords(List<Keyword> keywords) {
		StringBuffer sbName = new StringBuffer();
		StringBuffer sbDescription = new StringBuffer();
		sbName.append("(");
		sbDescription.append("(");
		for (int i = 0; i < keywords.size(); i++) {
			Keyword keyword = keywords.get(i);
			if (keyword.getKeyword().isEmpty()) {
				continue;
			}
			// if it is the last keyword skip the operator
			boolean addOperator = i < (keywords.size() - 1);
			String operator = addOperator ? keyword.getOperator() : "";

			sbName.append(" Name LIKE '%" + keyword.getKeyword() + "%' "
					+ operator);
			sbDescription.append(" ts2__Short_Description__c LIKE '%"
					+ keyword.getKeyword() + "%' " + operator);

			// Name
			// ts2__Job_Description__c

		}

		sbName.append(")");
		sbDescription.append(")");
		// if the keywords are empty return empty string for query, else combine
		// the two search fields with OR operator
		String query = (sbName.toString().equals("()") && sbDescription
				.toString().equals("()")) ? "" : sbName.toString() + " OR "
				+ sbDescription.toString();

		return query;
	}

	public static String getWhereFromCriteriasAndKeywords(
			List<Criteria> criterias, List<Keyword> keywords) {
		String where = getWhereFromCriteria(criterias);
		String whereFromKeywords = getWhereFromKeywords(keywords);
		if (!where.isEmpty() && !whereFromKeywords.isEmpty()) {
			where = "(" + where + ") AND (" + whereFromKeywords + ")";
		} else if (where.isEmpty() && !whereFromKeywords.isEmpty()) {
			where = whereFromKeywords;
		}

		return where;
	}

	public void saveAsSearchAgent(ActionEvent event) {
		String searchAgentName = getJobSearchController().getSearchAgentName();
		if (searchAgentName == null || searchAgentName.isEmpty()) {
			searchAgentName = "ts1" + new Random().nextInt(100);
		}
		getJobSearchController().setSearchAgentName("");
		saveAsSearchAgent(getJobSearchController().getSearchCriteriaList(),
				getJobSearchController().getKeywords(), searchAgentName);
	}

	public void saveAsSearchAgent(String agentName) {
		saveAsSearchAgent(getJobSearchController().getSearchCriteriaList(),
				getJobSearchController().getKeywords(), agentName);
	}

	public void saveAsSearchAgent(List<Criteria> criterias,
			List<Keyword> keywords, String agentName) {
		SearchAgent searchAgent = new SearchAgent();
		searchAgent.setSearchAgent_Name(agentName);
		List<SearchAgentCriteria> agentCriterias = new ArrayList<SearchAgentCriteria>();
		for (Criteria criteria : criterias) {
			if (criteria.getSelectedValue() != null
					&& !criteria.getSelectedValue().isEmpty()
					&& !criteria.getSelectedValue().equals(Criteria.NONE)) {
				SearchAgentCriteria searchAgentCriteria = new SearchAgentCriteria();
				searchAgentCriteria.setCriteria_Field_Desc(criteria.getName());
				searchAgentCriteria.setCriteria_Value(criteria
						.getSelectedValue());
				agentCriterias.add(searchAgentCriteria);
			}
		}
		for (Keyword keyword : keywords) {
			if (keyword.getKeyword() != null && !keyword.getKeyword().isEmpty()) {
				SearchAgentCriteria searchAgentCriteria = new SearchAgentCriteria();
				searchAgentCriteria
						.setCriteria_Field_Desc(KEYWORD_SEARCH_FIELD_DESC);
				searchAgentCriteria.setCriteria_Value(keyword.getKeyword()
						+ KEYWORD_OPERATOR_SEPARATOR + keyword.getOperator());
				agentCriterias.add(searchAgentCriteria);
			}
		}
		searchAgent.setSearchAgentCriterias(agentCriterias);
		searchAgent.setCandidate(getJobSearchController().getLoggedInUser());
		searchAgent.setSF_Contact_ID(getJobSearchController().getLoggedInUser()
				.getSF_Contact_ID());
		getJobSearchController().getLoggedInUser().addSearchAgent(searchAgent);
		getSearchAgentService().saveToDatabase(searchAgent);
	}

	public void removeSearchAgent(SearchAgent searchAgent) {
		getJobSearchController().getLoggedInUser().removeSearchAgent(
				searchAgent);
		getSearchAgentService().removeFromDatabase(searchAgent);
		searchAgent = null;
	}

	public SearchAgentService getSearchAgentService() {
		return searchAgentService;
	}

	public void setSearchAgentService(SearchAgentService searchAgentService) {
		this.searchAgentService = searchAgentService;
	}

	public SearchAgent getSelectedSearchAgent() {
		// int rowIndex = getSearchAgentsModel().getRowIndex();
		// if (rowIndex >= 0) {
		// selectedSearchAgent = getSearchAgentsModel().getSearchAgents().get(
		// rowIndex);
		// }
		return selectedSearchAgent;
	}

	public void setSelectedSearchAgent(SearchAgent selectedSearchAgent) {
		this.selectedSearchAgent = selectedSearchAgent;
	}

	public void search() {
		syncWithSearchPage();
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String outcome = "index.xhtml"; // Do your thing?
		try {
			facesContext.getExternalContext().redirect(outcome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void syncWithSearchPage() {
		syncCriteriaList(getJobSearchController().getSearchCriteriaList(),
				getSearchCriteriaList());
		syncKeyword(getJobSearchController().getKeywords(), getKeywords());
		getJobSearchController().setSearchAgentName(
				getSelectedSearchAgent().getSearchAgent_Name());
		getJobSearchController().setEditAgent(true);
		getJobSearchController().setSearchAgent(getSelectedSearchAgent());
		getJobSearchController().search();
	}

	public void updateSearchAgent(SearchAgent searchAgent) {
		String searchAgentName = searchAgent.getSearchAgent_Name();
		removeSearchAgent(searchAgent);
		saveAsSearchAgent(searchAgentName);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String outcome = "searchAgent.xhtml"; // Do your thing?
		getJobSearchController().reset();
		try {
			facesContext.getExternalContext().redirect(outcome);
			RequestContext.getCurrentInstance().update(":sFrormId:spanelID");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void syncCriteriaList(List<Criteria> target, List<Criteria> result) {
		for (Criteria targetCT : target) {
			for (Criteria resultCT : result) {
				if (resultCT.getName().equals(targetCT.getName())) {
					targetCT.setSelectedValue(resultCT.getSelectedValue());
					break;
				}
			}
		}
	}

	private void syncKeyword(List<Keyword> target, List<Keyword> result) {
		target.clear();
		target.addAll(result);
	}

	public List<Criteria> getSearchCriteriaList() {
		if (getSelectedSearchAgent() != null) {
			return getSearchCriteriasFromSearchAgent(getSelectedSearchAgent());
		}
		return new ArrayList<JobSearchController.Criteria>();
	}

	public List<Keyword> getKeywords() {
		List<Keyword> keywords = null;
		if (getSelectedSearchAgent() != null) {
			keywords = getKeywordsFromSearchAgent(getSelectedSearchAgent());
		}
		if (keywords == null) {
			keywords = new ArrayList<JobSearchController.Keyword>();
		}
		if (keywords.isEmpty()) {
			keywords.add(new Keyword());
		}
		return keywords;
	}

	@Override
	public void rowSelected(DataModelEvent event) {
		int rowIndex = event.getRowIndex();
		if (rowIndex >= 0) {
			selectedSearchAgent = getSearchAgentsModel().getSearchAgents().get(
					rowIndex);
		}

	}

}
