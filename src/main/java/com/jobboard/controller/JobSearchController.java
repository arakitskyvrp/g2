package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.html.HtmlColumn;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.jobboard.model.LanguageChangeListener;
import com.jobboard.model.heroku.SearchAgent;
import com.jobboard.model.heroku.service.BilingualSTFParser.LanguageTranslationWrapper;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.PicklistEntry;
import com.sforce.soap.enterprise.sobject.Ts2__JobOrderJobBoardAssociation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.metadata.CustomLabelTranslation;

@ManagedBean(name = "jobSearch")
public class JobSearchController extends JobBoardPageController implements
		LanguageChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5554006158992135136L;
	protected boolean isSearchPerformed;
	protected boolean hasPostedJobs;
	protected SecurityWrapper wrapper;

	@ManagedProperty(value = "#{languageController}")
	private LanguageController languageController;
	/**
	 * Current keywords used in the search
	 */
	protected List<Keyword> keywords = new ArrayList<JobSearchController.Keyword>();
	/**
	 * The search criteria constraints (dropdowns)
	 */
	protected List<Criteria> searchCriteriaList;
	/**
	 * The result display constraints
	 */
	protected List<Criteria> resultFilterList;
	/**
	 * The available job orders from the initial session
	 */
	private List<Ts2__Job__c> availableJobOrders = new ArrayList<Ts2__Job__c>();
	/**
	 * The job orders filtered with search
	 */
	private List<Ts2__Job__c> filteredJobOrders;

	// TODO remove or improve this
	private HtmlDataTable searchResultTable;
	private boolean keywordsLimit;

	private List<ColumnModel> columns = new ArrayList<ColumnModel>();

	private String searchAgentName;

	private boolean editAgent;

	private SearchAgent searchAgent;

	private LanguageTranslationWrapper languageTranslationWrapper;
	private boolean isSearchIdle;

	public JobSearchController() {
		// ExternalContext externalContext = FacesContext.getCurrentInstance()
		// .getExternalContext();
		//
		// // Object request = externalContext.getRequest();
		// // if (request instanceof HttpServletRequest) {
		// // HttpServletRequest httpServletRequest =
		// // (HttpServletRequest)externalContext.getRequest();
		// // Cookie[] cookies = httpServletRequest.getCookies();
		// // }
		// List<String> cookieParams = new ArrayList<String>();
		// cookieParams.add(Config.SOURCE_ID_PARAM);
		// cookieParams.add(Config.EXTERNAL_SOURCE_PARAM);
		// cookieParams.add(Config.BB_SOURCE_PARAM);
		//
		// List<Cookie> cookiesFromUrl = cookiesFromUrl(cookieParams);
		// Map<String, Object> cookies = externalContext.getRequestCookieMap();
		// for (Cookie cookie : cookiesFromUrl) {
		// cookies.put(cookie.getName(), cookie);
		// }

	}

	@PostConstruct
	public void initialize() {
		wrapper = new SecurityWrapper();
		setHasPostedJobs(wrapper.hasPostedJobs(getJBSetup().getId()));
		setSearchCriteriaList(wrapper.getSearchCriteriaList(getJBSetup()));
		setResultFilterList(wrapper.getResultFilterList(getJBSetup()));

		// Add the initial empty keyword
		getKeywords().add(new Keyword("", "NONE"));
		initSearch();
		setIsSearchPerformed(true);

		getLanguageController().addLanguageCHangeListener(this);
	}

	// This wrapper supports private data model for objects that are being
	// queried on JobBoard
	public class SecurityWrapper {
		public boolean hasPostedJobs(String jBSetupId) {
			List<Ts2__JobOrderJobBoardAssociation__c> PostedJobs = null;/*
																		 * SFDCAccessController
																		 * .
																		 * DDataProvider
																		 * .
																		 * getJobOrderJobBoardAssociations
																		 * ();
																		 */
			// [
			// SELECT Id
			// FROM JobOrderJobBoardAssociation__c
			// WHERE JobOrder__r.Post_Job__c = true
			// AND JobBoardSetup__c =:JBSetupId
			// LIMIT 1
			// ];
			return true;// (PostedJobs.size() > 0);
		}

		public List<Criteria> getResultFilterList(
				Ts2__Job_Board_Setup__c jobBoardSetup) {
			List<Criteria> resultFilterList = new ArrayList<JobSearchController.Criteria>();
			String searchResult = jobBoardSetup.getTs2__SearchResult1__c();
			if (jobBoardSetup.getTs2__SearchResult1__c() == null) {
				// TODO
				// resultFilterList.add(job.name)
				// resultFilterList.add(job.department)
				// resultFilterList.add(job.location)
				// resultFilterList.add(job.datePosted)
				return resultFilterList;
			} else {
				Criteria jobTitle = new Criteria("name", "name",
						getLanguageTranslationWrapper());
				resultFilterList.add(jobTitle);
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchResult);
				Criteria criteria = new Criteria(searchResult, JobReflection
						.getFieldByName(searchResult).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				resultFilterList.add(criteria);
			}

			searchResult = jobBoardSetup.getTs2__SearchResult2__c();
			if (searchResult != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchResult);
				Criteria criteria = new Criteria(searchResult, JobReflection
						.getFieldByName(searchResult).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				resultFilterList.add(criteria);
			}

			searchResult = jobBoardSetup.getTs2__SearchResult3__c();
			if (searchResult != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchResult);
				Criteria criteria = new Criteria(searchResult, JobReflection
						.getFieldByName(searchResult).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				resultFilterList.add(criteria);
			}

			searchResult = jobBoardSetup.getTs2__SearchResult4__c();
			if (searchResult != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchResult);
				Criteria criteria = new Criteria(searchResult, JobReflection
						.getFieldByName(searchResult).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				resultFilterList.add(criteria);
			}
			return resultFilterList;
		}

		public List<Criteria> getSearchCriteriaList(
				Ts2__Job_Board_Setup__c jobBoardSetup) {
			List<Criteria> searchCriteriaList = new ArrayList<JobSearchController.Criteria>();
			String searchCriteria = jobBoardSetup.getTs2__SearchCriteria1__c();
			if (searchCriteria != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchCriteria);
				Criteria criteria = new Criteria(searchCriteria, JobReflection
						.getFieldByName(searchCriteria).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				searchCriteriaList.add(criteria);
			}

			searchCriteria = jobBoardSetup.getTs2__SearchCriteria2__c();
			if (searchCriteria != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchCriteria);
				Criteria criteria = new Criteria(searchCriteria, JobReflection
						.getFieldByName(searchCriteria).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				searchCriteriaList.add(criteria);
			}

			searchCriteria = jobBoardSetup.getTs2__SearchCriteria3__c();
			if (searchCriteria != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchCriteria);
				Criteria criteria = new Criteria(searchCriteria, JobReflection
						.getFieldByName(searchCriteria).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				searchCriteriaList.add(criteria);
			}

			searchCriteria = jobBoardSetup.getTs2__SearchCriteria4__c();
			if (searchCriteria != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchCriteria);
				Criteria criteria = new Criteria(searchCriteria, JobReflection
						.getFieldByName(searchCriteria).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				searchCriteriaList.add(criteria);
			}

			searchCriteria = jobBoardSetup.getTs2__SearchCriteria5__c();
			if (searchCriteria != null) {
				List<PicklistEntry> pickListValues = JobReflection
						.getPicklistEntries(searchCriteria);
				Criteria criteria = new Criteria(searchCriteria, JobReflection
						.getFieldByName(searchCriteria).getLabel(),
						pickListValues, getLanguageTranslationWrapper());
				searchCriteriaList.add(criteria);
			}
			return searchCriteriaList;
		}
	}

	/**
	 * Keyword object is used to generate a list of keywords as search criteria
	 * */
	public static class Keyword {
		public enum Operator {
			AND, OR, NONE
		}

		private String keyword;
		private Operator operator;
		private List<String> possibleOperators;

		public Keyword() {
			this("", "NONE");
		}

		public Keyword(String keyword, String operator) {
			this.keyword = keyword;
			setOperator(operator);
		}

		public String getKeyword() {
			return keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public String getOperator() {
			return operator.toString();
		}

		public void setOperator(String operator) {
			if (null == operator) {
				return;
			}
			try {
				this.operator = Operator.valueOf(operator);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public List<String> getPossibleOperators() {
			if (possibleOperators == null) {
				possibleOperators = new ArrayList<String>();
				for (Operator op : Operator.values()) {
					if (op.toString().equals("NONE")) {
						continue;
					}
					possibleOperators.add(op.toString());
				}
			}
			return possibleOperators;
		}
	}

	/**
	 * This object is used as wrapper to generate a list of search/result
	 * criteria
	 * 
	 * @author r.kavalinovski
	 * 
	 */
	public static class Criteria {
		public static final SelectItem NONE = new SelectItem("",
				"ts2__OptionNone");
		private String name;
		private String label;
		private String selectedValue;
		private SelectItem[] possibleValues;
		private LanguageTranslationWrapper languageTranslationWrapper;
		public static final String JOB_OBJECT_NAME = "ts2__Job__c";

		public Criteria(String id, String label,
				LanguageTranslationWrapper languageTranslationWrapper) {
			this(id, label, JobReflection.getPicklistEntries(id),
					languageTranslationWrapper);
		}

		public Criteria(String id, String label, List<PicklistEntry> list,
				LanguageTranslationWrapper languageTranslationWrapper) {

			this.name = id;
			this.setLanguageTranslationWrapper(languageTranslationWrapper);

			this.label = label;
			setPossibleValues(list);
		}

		public String getName() {
			return name;
		}

		public void setName(String id) {
			this.name = id;
		}

		public String getLabel() {
			String customFieldTranslation = null;
			if (getLanguageTranslationWrapper() != null) {
				customFieldTranslation = getLanguageTranslationWrapper()
						.getCustomFieldTranslation(JOB_OBJECT_NAME, getName());
			}
			return (customFieldTranslation != null && !customFieldTranslation
					.isEmpty()) ? customFieldTranslation : label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getSelectedValue() {
			if (selectedValue == null) {
				setSelectedValue(NONE.getLabel());
			}
			return selectedValue;
		}

		public void setSelectedValue(String selectedValue) {
			this.selectedValue = selectedValue;
		}

		public SelectItem[] getPossibleValues() {
			return possibleValues;
		}

		public void setPossibleValues(List<PicklistEntry> possibleValues) {
			List<SelectItem> items = new ArrayList<SelectItem>();
			items.add(NONE);
			if (possibleValues != null) {
				for (PicklistEntry pValue : possibleValues) {
					// items.add(new SelectItem(pValue.getLabel(), pValue
					// .getLabel()));
					String value = pValue.getLabel();
					String label = getLanguageTranslationWrapper() != null ? getLanguageTranslationWrapper()
							.getPicklistValueTranslation(JOB_OBJECT_NAME,
									getName(), value) : value;
					items.add(new SelectItem(value, label));
				}
			}
			this.possibleValues = items.toArray(new SelectItem[items.size()]);
		}

		public void changeMethod() {
		}

		public LanguageTranslationWrapper getLanguageTranslationWrapper() {
			return languageTranslationWrapper;
		}

		public void setLanguageTranslationWrapper(
				LanguageTranslationWrapper languageTranslationWrapper) {
			this.languageTranslationWrapper = languageTranslationWrapper;
			refreshPicklistLabels();
		}

		private void refreshPicklistLabels() {
			if (getLanguageTranslationWrapper() != null) {
				SelectItem[] possibleValues = getPossibleValues();
				if (possibleValues != null) {
					for (SelectItem selectItem : possibleValues) {
						selectItem.setLabel(getLanguageTranslationWrapper()
								.getPicklistValueTranslation(JOB_OBJECT_NAME,
										getName(),
										selectItem.getValue().toString()));
					}
				}
			} else {
				System.out.println("refresh picklist NULL translation wrapper");
			}
		}
	}

	public static class ColumnModel implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6161219631170811459L;
		private String header;
		private String property;
		private LanguageTranslationWrapper languageTranslationWrapper;

		public ColumnModel(String header, String property) {
			this(header, property, null);
		}

		public ColumnModel(String header, String property,
				LanguageTranslationWrapper languageTranslationWrapper) {
			this.header = header;
			this.property = property;
			this.languageTranslationWrapper = languageTranslationWrapper;
		}

		public String getHeader() {
			String headerTranslation = null;
			if (getLanguageTranslationWrapper() != null) {
				headerTranslation = getLanguageTranslationWrapper()
						.getCustomFieldTranslation(Criteria.JOB_OBJECT_NAME,
								getProperty());
			}
			if (headerTranslation == null || headerTranslation.isEmpty()) {
				if (getProperty().equals("name")
						&& getLanguageTranslationWrapper() != null) {
					CustomLabelTranslation[] customLabels = getLanguageTranslationWrapper()
							.getTranslations().getCustomLabels();
					for (CustomLabelTranslation customLabelTranslation : customLabels) {
						if (customLabelTranslation.getName().equals(
								"ts2__Job_Name")) {
							headerTranslation = customLabelTranslation
									.getLabel();
							break;
						}
					}
				} else {
					Field fieldByName = JobReflection
							.getFieldByName(getProperty());
					if (fieldByName != null) {
						headerTranslation = fieldByName.getLabel();
					}
				}
			}
			return (headerTranslation != null && !headerTranslation.isEmpty()) ? headerTranslation
					: header;
		}

		public String getProperty() {
			return property;
		}

		public LanguageTranslationWrapper getLanguageTranslationWrapper() {
			return languageTranslationWrapper;
		}

		public void setLanguageTranslationWrapper(
				LanguageTranslationWrapper languageTranslationWrapper) {
			this.languageTranslationWrapper = languageTranslationWrapper;
		}
	}

	private void initSearch() {

		// setAvailableJobOrders(SFDCAccessController.DDataProvider.getJobOrders());
		// TODO list elements related to the initialized JBSetup
		setAvailableJobOrders(getJobOrderSOAPService().listAllByJobBoard(getJBSetup().getId()));

		// setFilteredJobOrders(SFDCAccessController.DDataProvider.getJobOrders());
		createDynamicColumns();
	}

	public void search() {
		String where = SearchAgentController.getWhereFromCriteriasAndKeywords(
				getSearchCriteriaList(), getKeywords());

		System.out.println(">>>SEARCH JOB WHERE>> " + where);
		setAvailableJobOrders(getJobOrderSOAPService().queryAllWhere(where));
	}

	// public void search() {
	// String where = getWhereFromCriteria();
	// String whereFromKeywords = getWhereFromKeywords();
	// if (!where.isEmpty() && !whereFromKeywords.isEmpty()) {
	// where = "("+where + ") AND (" + whereFromKeywords+")";
	// } else if (where.isEmpty() && !whereFromKeywords.isEmpty()) {
	// where = whereFromKeywords;
	// }
	// System.out.println(">>>SEARCH JOB WHERE>> " + where);
	// setAvailableJobOrders(getJobOrderSOAPService().queryAllWhere(where));
	// }
	//
	// private String getWhereFromCriteria() {
	// StringBuffer sb = new StringBuffer();
	// for (Criteria criteria : getSearchCriteriaList()) {
	// System.out.println("SEARCH CRITERIA >>> "
	// + criteria.getSelectedValue());
	// if (criteria.getSelectedValue() != null
	// && !criteria.getSelectedValue()/*.getValue().toString()*/
	// .isEmpty()
	// && !criteria.getSelectedValue()/*.getLabel()*/
	// .equals(Criteria.NONE.getLabel())) {
	// System.out.println("SEARCH CRITERIA VALUE>>> "
	// + criteria.getSelectedValue());
	// if (!sb.toString().isEmpty()) {
	// sb.append(" AND ");
	// }
	// sb.append(criteria.getName() + "= '"
	// + criteria.getSelectedValue()/*.getValue()*/.toString()
	// + "'");
	// }
	// }
	// return sb.toString();
	// }
	//
	// private String getWhereFromKeywords() {
	// StringBuffer sbName = new StringBuffer();
	// StringBuffer sbDescription = new StringBuffer();
	// sbName.append("(");
	// sbDescription.append("(");
	// for (int i = 0; i < getKeywords().size(); i++) {
	// Keyword keyword = getKeywords().get(i);
	// if (keyword.getKeyword().isEmpty()) {
	// continue;
	// }
	// // if it is the last keyword skip the operator
	// boolean addOperator = i < (getKeywords().size() - 1);
	// String operator = addOperator ? keyword.getOperator() : "";
	//
	// sbName.append(" Name LIKE '%" + keyword.getKeyword() + "%' "
	// + operator);
	// sbDescription.append(" ts2__Short_Description__c LIKE '%"
	// + keyword.getKeyword() + "%' " + operator);
	//
	// // Name
	// // ts2__Job_Description__c
	//
	// }
	//
	// sbName.append(")");
	// sbDescription.append(")");
	// // if the keywords are empty return empty string for query, else combine
	// // the two search fields with OR operator
	// String query = (sbName.toString().equals("()") && sbDescription
	// .toString().equals("()")) ? "" : sbName.toString() + " OR "
	// + sbDescription.toString();
	//
	// return query;
	// }

	public boolean resultTableCellType(String columnHeder, String source) {
		// TODO no hadcoded values
		if (source.equals("link") && !columnHeder.equals("name")) {
			return false;
		}
		if (source.equals("button") && !columnHeder.equals("name")) {
			return false;
		}
		if (source.equals("text")
				&& (columnHeder.equals("name") || columnHeder
						.equals("Job Cart"))) {
			return false;
		}
		return true;
	}

	// private Map<Ts2__Job__c, Boolean> jobsInCart = new HashMap<Ts2__Job__c,
	// Boolean>();

	public void createDynamicColumns() {
		getColumns().clear();
		for (Criteria resultFilter : getResultFilterList()) {
			getColumns().add(
					new ColumnModel(resultFilter.getLabel(), resultFilter
							.getName(), getLanguageTranslationWrapper()));
		}
		// if (getIsUserLoggedIn()) {
		// getColumns().add(new ColumnModel("Job Cart", "Job Cart"));
		// }
	}

	public boolean getIsSearchPerformed() {
		return isSearchPerformed;
	}

	public void setIsSearchPerformed(boolean isSearchPerformed) {
		this.isSearchPerformed = isSearchPerformed;
	}

	public boolean getHasPostedJobs() {
		return hasPostedJobs;
	}

	public void setHasPostedJobs(boolean hasPostedJobs) {
		this.hasPostedJobs = hasPostedJobs;
	}

	public List<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}

	public void addKeyWord() {
		getKeywords().add(new Keyword("", "NONE"));
	}

	public void removeKeyword(Keyword keyword) {
		if (getKeywords().contains(keyword)) {
			getKeywords().remove(keyword);
		}
		if (getKeywords().isEmpty()) {
			// this is the initial keyword
			addKeyWord();
		}
	}

	public void resetSearch() {
		List<Criteria> searchCriteriaList = getSearchCriteriaList();
		for (Criteria criteria : searchCriteriaList) {
			criteria.setSelectedValue("");
		}
		getKeywords().clear();
		// this is the initial keyword
		addKeyWord();
		search();
	}

	public boolean getIsSearchIdle() {
		isSearchIdle = true;
		List<Criteria> searchCriteriaList = getSearchCriteriaList();
		for (Criteria criteria : searchCriteriaList) {
			if (!(criteria.getSelectedValue() == null
					|| criteria.getSelectedValue().equals("") || criteria
					.getSelectedValue().equals(Criteria.NONE.getValue()))) {
				isSearchIdle = false;
				break;
			}
		}
		if (isSearchIdle) {
			List<Keyword> keywords = getKeywords();
			isSearchIdle = keywords.size() > 1 ? false : keywords.get(0)
					.getKeyword().isEmpty();
		}
		return isSearchIdle;
	}

	public List<Criteria> getSearchCriteriaList() {
		return searchCriteriaList;
	}

	public void setSearchCriteriaList(List<Criteria> searchCriteriaList) {
		this.searchCriteriaList = searchCriteriaList;
	}

	public List<Criteria> getResultFilterList() {
		return resultFilterList;
	}

	public void setResultFilterList(List<Criteria> resultFilterList) {
		this.resultFilterList = resultFilterList;
	}

	public List<Ts2__Job__c> getAvailableJobOrders() {
		return availableJobOrders;
	}

	public void setAvailableJobOrders(List<Ts2__Job__c> availableJobOrders) {
		this.availableJobOrders = availableJobOrders;
	}

	public List<Ts2__Job__c> getFilteredJobOrders() {
		return filteredJobOrders;
	}

	public void setFilteredJobOrders(List<Ts2__Job__c> filteredJobOrders) {
		this.filteredJobOrders = filteredJobOrders;
	}

	public HtmlDataTable getSearchResultTable() {
		if (searchResultTable == null) {
			searchResultTable = new HtmlDataTable();
			searchResultTable.setId("searchResultTable");
			refreshSearchResultsTable();
			// HtmlColumn column = new HtmlColumn();
			// column.setId("column");
			// HtmlOutputText text = new HtmlOutputText();
			// text.setId("text1");
			// text.setValue("YOO");
			// column.setHeader(text);
			// HtmlOutputText text2 = new HtmlOutputText();
			// text2.setId("text2");
			// text2.setValue("Heyy");
			// column.getChildren().add(text2);
			//
			// searchResultTable.getChildren().add(column);
		}
		return searchResultTable;
	}

	public void setSearchResultTable(HtmlDataTable searchResultTable) {
	}

	private void refreshSearchResultsTable() {
		searchResultTable.getChildren().clear();
		if (getFilteredJobOrders() != null && !getFilteredJobOrders().isEmpty()) {
			for (Ts2__Job__c jobOrder : getFilteredJobOrders()) {
				for (Criteria ct : getResultFilterList()) {
					HtmlColumn column = new HtmlColumn();
					// column.setId("column_" + new
					// Random().nextInt(20000)/*jobOrder.getJobTitle()
					// + ct.getId()*/);
					HtmlOutputText headErText = new HtmlOutputText();
					// headErText.setId("header_text_" +new
					// Random().nextInt(20000) /*jobOrder.getJobTitle()
					// + ct.getId()*/);
					headErText.setValue(ct.getLabel());

					column.setHeader(headErText);

					HtmlOutputText columnContent = new HtmlOutputText();
					// columnContent.setId("content"+new
					// Random().nextInt(20000));
					// columnContent.setValue(reflectMethodInvocation(ExampleJobOrder.class,
					// jobOrder, ct.getId()));
					columnContent.setValue("row");

					column.getChildren().add(columnContent);

					searchResultTable.getChildren().add(column);
				}
			}
		}

	}

	public boolean getKeywordsLimit() {

		// TODO retrieve this from setup
		keywordsLimit = !(getKeywords().size() < 5);
		return keywordsLimit;
	}

	public List<ColumnModel> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnModel> columns) {
		this.columns = columns;
	}

	public String getSearchAgentName() {
		return searchAgentName;
	}

	public void setSearchAgentName(String searchAgentName) {
		this.searchAgentName = searchAgentName;
	}

	public boolean getEditAgent() {
		return editAgent;
	}

	public void setEditAgent(boolean editAgent) {
		this.editAgent = editAgent;
	}

	public SearchAgent getSearchAgent() {
		return searchAgent;
	}

	public void setSearchAgent(SearchAgent searchAgent) {
		this.searchAgent = searchAgent;
	}

	public void cancelUpdate() {
		reset();

		FacesContext facesContext = FacesContext.getCurrentInstance();
		String outcome = "index.xhtml"; // Do your thing?
		try {
			facesContext.getExternalContext().redirect(outcome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void reset() {
		setEditAgent(false);
		setSearchAgentName("");
		setSearchAgent(null);

	}

	public LanguageTranslationWrapper getLanguageTranslationWrapper() {
		return languageTranslationWrapper;
	}

	public void setLanguageTranslationWrapper(
			LanguageTranslationWrapper languageTranslationWrapper) {
		this.languageTranslationWrapper = languageTranslationWrapper;
	}

	@Override
	public void languageChange(
			LanguageTranslationWrapper languageTranslationWrapper) {
		setLanguageTranslationWrapper(languageTranslationWrapper);
		List<Criteria> searchCriteriaList = getSearchCriteriaList();
		for (Criteria criteria : searchCriteriaList) {
			criteria.setLanguageTranslationWrapper(languageTranslationWrapper);
		}
		List<ColumnModel> columns = getColumns();
		for (ColumnModel columnModel : columns) {
			columnModel
					.setLanguageTranslationWrapper(languageTranslationWrapper);
		}
	}

	public LanguageController getLanguageController() {
		return languageController;
	}

	public void setLanguageController(LanguageController languageController) {
		this.languageController = languageController;
	}
}
