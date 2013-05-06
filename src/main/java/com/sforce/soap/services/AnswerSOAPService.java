package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name = "answerSOAPService")
@SessionScoped
public class AnswerSOAPService {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	public List<Ts2__Answer__c> getAnswersForQuestion(String questionID) {
		List<Ts2__Answer__c> answers = new ArrayList<Ts2__Answer__c>();
		if (questionID != null) {
			String where = " WHERE ts2__Question__c = '" + questionID + "' ";
			String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c FROM ts2__Answer__c"
					+ where + " ORDER BY ts2__Order__c ASC";
			try {
				QueryResult queryResult = getConnectionService()
						.getEnterpriseConnection().query(query);
				SObject[] records = queryResult.getRecords();
				if (records != null) {
					for (SObject sObject : records) {
						if (sObject instanceof Ts2__Answer__c) {
							answers.add((Ts2__Answer__c) sObject);
						}
					}
				}
			} catch (ConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return answers;
	}

	public List<Ts2__Answer__c> getAnswersByID(String answersID) {
		List<Ts2__Answer__c> answers = new ArrayList<Ts2__Answer__c>();
		if (answersID != null) {
			String where = " WHERE Id = '" + answersID + "' ";
			String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c FROM ts2__Answer__c"
					+ where + " ORDER BY ts2__Order__c ASC";
			try {
				QueryResult queryResult = getConnectionService()
						.getEnterpriseConnection().query(query);
				SObject[] records = queryResult.getRecords();
				if (records != null) {
					for (SObject sObject : records) {
						if (sObject instanceof Ts2__Answer__c) {
							answers.add((Ts2__Answer__c) sObject);
						}
					}
				}
			} catch (ConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return answers;
	}

	public Answer_Translation__c getAnswerTranslation(String answerID,
			String languageID) {
		String where = " WHERE Answer__c = '" + answerID
				+ "' AND Language__c = '" + languageID + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Language__c, Question__c, Standard_Question__c, Translation__c, Answer__c FROM Answer_Translation__c "
				+ where;
		System.out.println("AnswerTranslation Query: "+query);
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				return (Answer_Translation__c) records[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
