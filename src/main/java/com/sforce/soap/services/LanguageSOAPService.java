package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Language__c;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name="languageSOAPService")
@SessionScoped
public class LanguageSOAPService implements SOAPService<Language__c>{
	
	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	@Override
	public Language__c saveToDatabase(Language__c entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Language__c> listElements() {
		List<Language__c> languages = new ArrayList<Language__c>();
		String query = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Language_Description__c FROM Language__c ";
		try {
			QueryResult queryResult = getConnectionService().getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			for (SObject sObject : records) {
				if (sObject instanceof Language__c) {
					languages.add((Language__c) sObject);
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return languages;
	}
	
	public static void main(String[] args) {
		LanguageSOAPService service = new LanguageSOAPService();
		service.setConnectionService(new SOAPConnectionService());
		List<Language__c> listElements = service.listElements();
		for (Language__c language : listElements) {
			System.out.println(language.getLanguage_Description__c() + " "+language.getName());
		}
		
//		Locale[] availableLocales = Locale.getAvailableLocales();
//		System.out.println("locales>");
//		for (Locale locale : availableLocales) {
//			System.out.println("Locale> "+locale.getLanguage()+" <Country>"+locale.getDisplayCountry());
//		}
	}

	@Override
	public Language__c searchForElement(String id) {
		String query = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Language_Description__c FROM Language__c WHERE Id = '"+id+"'";
		try {
			QueryResult queryResult = getConnectionService().getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records!=null&&records.length>0) {
				return (Language__c) records[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
