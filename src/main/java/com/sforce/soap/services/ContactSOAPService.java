package com.sforce.soap.services;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.ws.ConnectionException;

@ManagedBean
@SessionScoped
public class ContactSOAPService implements SOAPService<Contact> {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	/**
	 * 
	 * @param email
	 * @return true if the email is used in a Contact record
	 */
	public boolean checkEmail(String email) {
		boolean result = false;
		String soqlQuery = "SELECT Name FROM contact Where email = '" + email
				+ "'";
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		try {
			QueryResult queryResult = enterpriseConnection.query(soqlQuery);
			result = queryResult.getSize() > 0;
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Contact saveToDatabase(Contact contact) {
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		Contact contacts[] = new Contact[1];
		contacts[0] = contact;
		try {
			SaveResult[] create = enterpriseConnection.create(contacts);
			if (create[0].isSuccess()) {
				contact.setId(create[0].getId());
				return contact;
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getNameByID(String contactID) {
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(
							"SELECT Name FROM contact Where Id = '" + contactID
									+ "'");
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				return ((Contact) records[0]).getName();
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Contact> listElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact searchForElement(String id) {
		
		Contact contact = null;
		
		String soqlQuery = "SELECT Id, email, firstname, lastname, phone, mobilephone, mailingstreet, mailingcountry, mailingcity, mailingpostalcode, Ts2__Contact_Method__c, Ts2__Source__c FROM contact Where id = '" + id
				+ "'";
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		try {
			QueryResult queryResult = enterpriseConnection.query(soqlQuery);
			if (queryResult.getSize() > 0) {
				contact = (Contact)queryResult.getRecords()[0];				
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return contact;
	}
	
	public boolean updateRecords(Contact[] records) {
        // update the records in Salesforce.com
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		SaveResult[] saveResults = null;
        try {
        	saveResults = enterpriseConnection.update(records);
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
        
        // return true if all records were successfully saved
        boolean isSuccess = true;
        if (null != saveResults) {
        	for (int i = 0; i<saveResults.length; i++) {
        		isSuccess = isSuccess && saveResults[i].isSuccess();
        	}
        } else {
        	isSuccess = false;
        }
        
        return isSuccess;
		
	}

}
