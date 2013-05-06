package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name = "applicationSOAPService")
@SessionScoped
public class ApplicationSOAPService {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	public List<Ts2__Application__c> getApplicationsByCandidateID(
			String candidateID) {
		List<Ts2__Application__c> applications = new ArrayList<Ts2__Application__c>();
		String where = " WHERE ts2__Candidate_Contact__c = '" + candidateID
				+ "' ";// ts2__Candidate_Contact__c
		String query = "Select Id, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Job__c, ts2__AccountContact__c, ts2__Account__c, ts2__Address__c, ts2__Agency__c, ts2__App_Status__c, ts2__App_Tags__c, ts2__Application_Source__c, ts2__Application_Status__c, ts2__Apply_Agency__c, ts2__Apply_Exception__c, ts2__Candidate_Contact__c, ts2__Candidate_Source__c, ts2__Client__c, ts2__Code__c, ts2__Completed__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Cover_Letter__c, ts2__Custom_Email_Message__c, ts2__Date_Available__c, ts2__Disposition_Value__c, ts2__EEO_Disabled_Received__c, ts2__EEO_Disabled__c, ts2__EEO_Gender_Received__c, ts2__EEO_Gender__c, ts2__EEO_Race_Received__c, ts2__EEO_Veteran_Status_Received__c, ts2__Email__c, ts2__Exception_Reason_Other__c, ts2__Exception_Reason__c, ts2__Experience_Sum__c, ts2__HiringManager__c, ts2__Internally_Applied__c, ts2__Invite_to_Apply__c, ts2__Job_Status__c, ts2__Legacy_ApplicationID__c, ts2__Mobile__c, ts2__Overall_Reject_Reason__c, ts2__Phone__c, ts2__Prescreen_Score__c, ts2__PrimaryRecruiter__c, ts2__Project__c, ts2__Race__c, ts2__Rank__c, ts2__Reject_Reason__c, ts2__Request_EEO__c, ts2__Revert_Status__c, ts2__Rollover_Job_Order__c, ts2__Rollover__c, ts2__SecondaryRecruiter__c, ts2__Stage__c, ts2__Status__c, ts2__Tracking_Source__c, ts2__Veteran_Status__c, ts2__referral_id__c, ts2__referred_by__c, ts2extams__Action_Buttons__c, ts2extams__Communication_Buttons__c, ts2extams__Control_Buttons__c, ts2extams__Overall_SubStatus_API_Name__c, ts2extams__Overall_SubStatus_Id__c, ts2extams__Overall_SubStatus_Link__c, ts2extams__Resume_Uploaded__c, ts2extams__Substatus__c FROM ts2__Application__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Application__c) {
						applications.add((Ts2__Application__c) sObject);
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return applications;
	}

	public boolean isApplicationAlredySent(String candidateID, String jobOrderID) {
		String query = "Select Id, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Job__c, ts2__AccountContact__c, ts2__Account__c, ts2__Address__c, ts2__Agency__c, ts2__App_Status__c, ts2__App_Tags__c, ts2__Application_Source__c, ts2__Application_Status__c, ts2__Apply_Agency__c, ts2__Apply_Exception__c, ts2__Candidate_Contact__c, ts2__Candidate_Source__c, ts2__Client__c, ts2__Code__c, ts2__Completed__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Cover_Letter__c, ts2__Custom_Email_Message__c, ts2__Date_Available__c, ts2__Disposition_Value__c, ts2__EEO_Disabled_Received__c, ts2__EEO_Disabled__c, ts2__EEO_Gender_Received__c, ts2__EEO_Gender__c, ts2__EEO_Race_Received__c, ts2__EEO_Veteran_Status_Received__c, ts2__Email__c, ts2__Exception_Reason_Other__c, ts2__Exception_Reason__c, ts2__Experience_Sum__c, ts2__HiringManager__c, ts2__Internally_Applied__c, ts2__Invite_to_Apply__c, ts2__Job_Status__c, ts2__Legacy_ApplicationID__c, ts2__Mobile__c, ts2__Overall_Reject_Reason__c, ts2__Phone__c, ts2__Prescreen_Score__c, ts2__PrimaryRecruiter__c, ts2__Project__c, ts2__Race__c, ts2__Rank__c, ts2__Reject_Reason__c, ts2__Request_EEO__c, ts2__Revert_Status__c, ts2__Rollover_Job_Order__c, ts2__Rollover__c, ts2__SecondaryRecruiter__c, ts2__Stage__c, ts2__Status__c, ts2__Tracking_Source__c, ts2__Veteran_Status__c, ts2__referral_id__c, ts2__referred_by__c, ts2extams__Action_Buttons__c, ts2extams__Communication_Buttons__c, ts2extams__Control_Buttons__c, ts2extams__Overall_SubStatus_API_Name__c, ts2extams__Overall_SubStatus_Id__c, ts2extams__Overall_SubStatus_Link__c, ts2extams__Resume_Uploaded__c, ts2extams__Substatus__c FROM ts2__Application__c WHERE ts2__Job__c = '"
				+ jobOrderID
				+ "' AND ts2__Candidate_Contact__c = '"
				+ candidateID + "' ";
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			return (records != null && records.length > 0);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public SaveResult saveApplicationToSalesforce(
			Ts2__Application__c application) {
		SObject[] sObjects = new SObject[1];
		sObjects[0] = application;
		try {
			SaveResult[] create = getConnectionService()
					.getEnterpriseConnection().create(sObjects);
			if (create != null && create.length > 0) {
				return create[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
