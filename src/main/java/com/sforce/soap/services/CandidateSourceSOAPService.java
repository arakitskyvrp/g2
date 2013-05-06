package com.sforce.soap.services;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Ts2__Source__c;
import com.sforce.ws.ConnectionException;

@ManagedBean
@SessionScoped
public class CandidateSourceSOAPService {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	/**
	 * Get sources from sf database
	 * 
	 * @return
	 */

	public Map<String, String> getSources() {
		
		Map<String, String> candidateSources = null;
		
		String soqlQuery = "SELECT Id, Name FROM ts2__Source__c";
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		try {
			QueryResult queryResult = enterpriseConnection.query(soqlQuery);
			if (queryResult.getSize() > 0) {
				candidateSources = new LinkedHashMap<String, String>();
				for (int i = 0; i < queryResult.getRecords().length; i++) {
					// cast the SObject to a strongly-typed Contact
					Ts2__Source__c obj = (Ts2__Source__c) queryResult.getRecords()[i];
					candidateSources.put(obj.getName(), obj.getId());
				}
			}
		
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return candidateSources;
	}

}
