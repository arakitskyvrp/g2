package com.jobboard.model;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.jobboard.model.heroku.SearchAgent;

public class SearchAgentDataModel extends ListDataModel<SearchAgent> implements SelectableDataModel<SearchAgent>{
	

	public SearchAgentDataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public SearchAgentDataModel(List<SearchAgent> searchAgents) {
		super(searchAgents);
	}

	@Override
	public SearchAgent getRowData(String searchAgentName) {
		List<SearchAgent> searchAgents = getSearchAgents();
		for (SearchAgent searchAgent : searchAgents) {
			if (searchAgent.getSearchAgent_Name().equals(searchAgentName)) {
				return searchAgent;
			}
		}
		return null;
	}

	@Override
	public Object getRowKey(SearchAgent searchAgent) {
		return searchAgent.getSearchAgent_Name();
	}
	
	@SuppressWarnings("unchecked")
	public List<SearchAgent> getSearchAgents(){
		return (List<SearchAgent>) getWrappedData();
	}

}
