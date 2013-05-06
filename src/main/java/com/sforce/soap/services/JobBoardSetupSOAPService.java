package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name = "jobBoardSetupSOAPService")
@SessionScoped
public class JobBoardSetupSOAPService implements
		SOAPService<Ts2__Job_Board_Setup__c> {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public JobBoardSetupSOAPService() {
	}

	public JobBoardSetupSOAPService(SOAPConnectionService connectionService) {
		setConnectionService(connectionService);
	}

	@Override
	public Ts2__Job_Board_Setup__c saveToDatabase(Ts2__Job_Board_Setup__c entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Ts2__Job_Board_Setup__c getBoardSetupByName(String name) {
		String where = " WHERE Name = '" + name + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__AddThis_Username__c, ts2__Address_Validation__c, ts2__Allow_Register_Only__c, ts2__ApplicationsDisplayMode__c, ts2__Apply_Referral_Immediately__c, ts2__AutoAssociate__c, ts2__ConfirmationMessage__c, ts2__Disabled__c, ts2__EEO_Text__c, ts2__Employee_Account__c, ts2__Enable_AddThis__c, ts2__Enable_Employee_Status_Check__c, ts2__Enable_Lead_Tracking__c, ts2__Enable_Referral_Email_Notification__c, ts2__Enable_Submission_Feedback__c, ts2__Gender__c, ts2__HideContactMethod__c, ts2__HideCoverLetter__c, ts2__HideMobile__c, ts2__HidePhone__c, ts2__HideResumeBuilder__c, ts2__HideSourceQuestion__c, ts2__HomePage__c, ts2__Internal_Application_Process__c, ts2__JobDescription10__c, ts2__JobDescription1__c, ts2__JobDescription2__c, ts2__JobDescription3__c, ts2__JobDescription4__c, ts2__JobDescription5__c, ts2__JobDescription6__c, ts2__JobDescription7__c, ts2__JobDescription8__c, ts2__JobDescription9__c, ts2__Job_Board_Type__c, ts2__Jobs_Per_Page__c, ts2__LocalizedJobDescription__c, ts2__LocalizedJobName__c, ts2__Max_Number_Open_Referrals__c, ts2__Max_Number_Referrals_Per_Contact__c, ts2__Max_search_agents__c, ts2__Primary__c, ts2__Question10__c, ts2__Question11__c, ts2__Question12__c, ts2__Question13__c, ts2__Question14__c, ts2__Question15__c, ts2__Question16__c, ts2__Question17__c, ts2__Question18__c, ts2__Question19__c, ts2__Question1__c, ts2__Question20__c, ts2__Question2__c, ts2__Question3__c, ts2__Question4__c, ts2__Question5__c, ts2__Question6__c, ts2__Question7__c, ts2__Question8__c, ts2__Question9__c, ts2__Race__c, ts2__Referral_Expiration_Days__c, ts2__Register_Process__c, ts2__Require_Submission_Feedback__c, ts2__Resume_Required__c, ts2__Resume_Submission_Allowed__c, ts2__SearchByKeyword__c, ts2__SearchCriteria1__c, ts2__SearchCriteria2__c, ts2__SearchCriteria3__c, ts2__SearchCriteria4__c, ts2__SearchCriteria5__c, ts2__SearchResult1__c, ts2__SearchResult2__c, ts2__SearchResult3__c, ts2__SearchResult4__c, ts2__Show_Search_Only__c, ts2__SiteName__c, ts2__SiteURL__c, ts2__Source_Tracking_for_External_Referrals__c, ts2__Source_Tracking_for_Internal_Referrals__c, ts2__Veteran__c, Apply_with_LinkedIn__c, RSS_XML_Feeds__c, Languages__c, Countries__c, oAuth_on_off__c, Social_Networks__c, General_Registration__c, Multimedia__c, Thank_You_Page__c, Index_Resume_Upload__c, Index_Cover_Letter__c, Index_Additional_Attachments__c, Index_Multimedia__c, Index_Standard_Questions__c, Custom_Questions__c, Index_Custom_Questions__c, Index_Social_Questions__c, Index_Compliance__c, Index_Forms_URL__c, ts2_Additional_Attachments_Required__c, ts2_Standard_Questions_Required__c, ts2_Custom_Questions_Required__c, ts2_Social_Questions_Required__c, ts2_Compliance_Required__c, ts2_FormsURL_Required__c, I_Accept_Privacy_Statement_Terms_Condi__c, Document_URL__c FROM ts2__Job_Board_Setup__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				return (Ts2__Job_Board_Setup__c) records[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Ts2__Job_Board_Setup__c getBoardSetupBySiteName(String siteName) {
		String where = " WHERE ts2__SiteName__c = '" + siteName + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__AddThis_Username__c, ts2__Address_Validation__c, ts2__Allow_Register_Only__c, ts2__ApplicationsDisplayMode__c, ts2__Apply_Referral_Immediately__c, ts2__AutoAssociate__c, ts2__ConfirmationMessage__c, ts2__Disabled__c, ts2__EEO_Text__c, ts2__Employee_Account__c, ts2__Enable_AddThis__c, ts2__Enable_Employee_Status_Check__c, ts2__Enable_Lead_Tracking__c, ts2__Enable_Referral_Email_Notification__c, ts2__Enable_Submission_Feedback__c, ts2__Gender__c, ts2__HideContactMethod__c, ts2__HideCoverLetter__c, ts2__HideMobile__c, ts2__HidePhone__c, ts2__HideResumeBuilder__c, ts2__HideSourceQuestion__c, ts2__HomePage__c, ts2__Internal_Application_Process__c, ts2__JobDescription10__c, ts2__JobDescription1__c, ts2__JobDescription2__c, ts2__JobDescription3__c, ts2__JobDescription4__c, ts2__JobDescription5__c, ts2__JobDescription6__c, ts2__JobDescription7__c, ts2__JobDescription8__c, ts2__JobDescription9__c, ts2__Job_Board_Type__c, ts2__Jobs_Per_Page__c, ts2__LocalizedJobDescription__c, ts2__LocalizedJobName__c, ts2__Max_Number_Open_Referrals__c, ts2__Max_Number_Referrals_Per_Contact__c, ts2__Max_search_agents__c, ts2__Primary__c, ts2__Question10__c, ts2__Question11__c, ts2__Question12__c, ts2__Question13__c, ts2__Question14__c, ts2__Question15__c, ts2__Question16__c, ts2__Question17__c, ts2__Question18__c, ts2__Question19__c, ts2__Question1__c, ts2__Question20__c, ts2__Question2__c, ts2__Question3__c, ts2__Question4__c, ts2__Question5__c, ts2__Question6__c, ts2__Question7__c, ts2__Question8__c, ts2__Question9__c, ts2__Race__c, ts2__Referral_Expiration_Days__c, ts2__Register_Process__c, ts2__Require_Submission_Feedback__c, ts2__Resume_Required__c, ts2__Resume_Submission_Allowed__c, ts2__SearchByKeyword__c, ts2__SearchCriteria1__c, ts2__SearchCriteria2__c, ts2__SearchCriteria3__c, ts2__SearchCriteria4__c, ts2__SearchCriteria5__c, ts2__SearchResult1__c, ts2__SearchResult2__c, ts2__SearchResult3__c, ts2__SearchResult4__c, ts2__Show_Search_Only__c, ts2__SiteName__c, ts2__SiteURL__c, ts2__Source_Tracking_for_External_Referrals__c, ts2__Source_Tracking_for_Internal_Referrals__c, ts2__Veteran__c, Apply_with_LinkedIn__c, RSS_XML_Feeds__c, Languages__c, Countries__c, oAuth_on_off__c, Social_Networks__c, General_Registration__c, Multimedia__c, Thank_You_Page__c, Index_Resume_Upload__c, Index_Cover_Letter__c, Index_Additional_Attachments__c, Index_Multimedia__c, Index_Standard_Questions__c, Custom_Questions__c, Index_Custom_Questions__c, Index_Social_Questions__c, Index_Compliance__c, Index_Forms_URL__c, ts2_Additional_Attachments_Required__c, ts2_Standard_Questions_Required__c, ts2_Custom_Questions_Required__c, ts2_Social_Questions_Required__c, ts2_Compliance_Required__c, ts2_FormsURL_Required__c, I_Accept_Privacy_Statement_Terms_Condi__c, Document_URL__c FROM ts2__Job_Board_Setup__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				return (Ts2__Job_Board_Setup__c) records[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Ts2__Job_Board_Setup__c getBoardSetupBySiteURL(String siteURL) {
		String where = " WHERE ts2__SiteURL__c = '" + siteURL + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__AddThis_Username__c, ts2__Address_Validation__c, ts2__Allow_Register_Only__c, ts2__ApplicationsDisplayMode__c, ts2__Apply_Referral_Immediately__c, ts2__AutoAssociate__c, ts2__ConfirmationMessage__c, ts2__Disabled__c, ts2__EEO_Text__c, ts2__Employee_Account__c, ts2__Enable_AddThis__c, ts2__Enable_Employee_Status_Check__c, ts2__Enable_Lead_Tracking__c, ts2__Enable_Referral_Email_Notification__c, ts2__Enable_Submission_Feedback__c, ts2__Gender__c, ts2__HideContactMethod__c, ts2__HideCoverLetter__c, ts2__HideMobile__c, ts2__HidePhone__c, ts2__HideResumeBuilder__c, ts2__HideSourceQuestion__c, ts2__HomePage__c, ts2__Internal_Application_Process__c, ts2__JobDescription10__c, ts2__JobDescription1__c, ts2__JobDescription2__c, ts2__JobDescription3__c, ts2__JobDescription4__c, ts2__JobDescription5__c, ts2__JobDescription6__c, ts2__JobDescription7__c, ts2__JobDescription8__c, ts2__JobDescription9__c, ts2__Job_Board_Type__c, ts2__Jobs_Per_Page__c, ts2__LocalizedJobDescription__c, ts2__LocalizedJobName__c, ts2__Max_Number_Open_Referrals__c, ts2__Max_Number_Referrals_Per_Contact__c, ts2__Max_search_agents__c, ts2__Primary__c, ts2__Question10__c, ts2__Question11__c, ts2__Question12__c, ts2__Question13__c, ts2__Question14__c, ts2__Question15__c, ts2__Question16__c, ts2__Question17__c, ts2__Question18__c, ts2__Question19__c, ts2__Question1__c, ts2__Question20__c, ts2__Question2__c, ts2__Question3__c, ts2__Question4__c, ts2__Question5__c, ts2__Question6__c, ts2__Question7__c, ts2__Question8__c, ts2__Question9__c, ts2__Race__c, ts2__Referral_Expiration_Days__c, ts2__Register_Process__c, ts2__Require_Submission_Feedback__c, ts2__Resume_Required__c, ts2__Resume_Submission_Allowed__c, ts2__SearchByKeyword__c, ts2__SearchCriteria1__c, ts2__SearchCriteria2__c, ts2__SearchCriteria3__c, ts2__SearchCriteria4__c, ts2__SearchCriteria5__c, ts2__SearchResult1__c, ts2__SearchResult2__c, ts2__SearchResult3__c, ts2__SearchResult4__c, ts2__Show_Search_Only__c, ts2__SiteName__c, ts2__SiteURL__c, ts2__Source_Tracking_for_External_Referrals__c, ts2__Source_Tracking_for_Internal_Referrals__c, ts2__Veteran__c, Apply_with_LinkedIn__c, RSS_XML_Feeds__c, Languages__c, Countries__c, oAuth_on_off__c, Social_Networks__c, General_Registration__c, Multimedia__c, Thank_You_Page__c, Index_Resume_Upload__c, Index_Cover_Letter__c, Index_Additional_Attachments__c, Index_Multimedia__c, Index_Standard_Questions__c, Custom_Questions__c, Index_Custom_Questions__c, Index_Social_Questions__c, Index_Compliance__c, Index_Forms_URL__c, ts2_Additional_Attachments_Required__c, ts2_Standard_Questions_Required__c, ts2_Custom_Questions_Required__c, ts2_Social_Questions_Required__c, ts2_Compliance_Required__c, ts2_FormsURL_Required__c, I_Accept_Privacy_Statement_Terms_Condi__c, Document_URL__c FROM ts2__Job_Board_Setup__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				return (Ts2__Job_Board_Setup__c) records[0];
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Ts2__Job_Board_Setup__c> listElements() {
		List<Ts2__Job_Board_Setup__c> jobBoardSetups = new ArrayList<Ts2__Job_Board_Setup__c>();
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection()
					.query("Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__AddThis_Username__c, ts2__Address_Validation__c, ts2__Allow_Register_Only__c, ts2__ApplicationsDisplayMode__c, ts2__Apply_Referral_Immediately__c, ts2__AutoAssociate__c, ts2__ConfirmationMessage__c, ts2__Disabled__c, ts2__EEO_Text__c, ts2__Employee_Account__c, ts2__Enable_AddThis__c, ts2__Enable_Employee_Status_Check__c, ts2__Enable_Lead_Tracking__c, ts2__Enable_Referral_Email_Notification__c, ts2__Enable_Submission_Feedback__c, ts2__Gender__c, ts2__HideContactMethod__c, ts2__HideCoverLetter__c, ts2__HideMobile__c, ts2__HidePhone__c, ts2__HideResumeBuilder__c, ts2__HideSourceQuestion__c, ts2__HomePage__c, ts2__Internal_Application_Process__c, ts2__JobDescription10__c, ts2__JobDescription1__c, ts2__JobDescription2__c, ts2__JobDescription3__c, ts2__JobDescription4__c, ts2__JobDescription5__c, ts2__JobDescription6__c, ts2__JobDescription7__c, ts2__JobDescription8__c, ts2__JobDescription9__c, ts2__Job_Board_Type__c, ts2__Jobs_Per_Page__c, ts2__LocalizedJobDescription__c, ts2__LocalizedJobName__c, ts2__Max_Number_Open_Referrals__c, ts2__Max_Number_Referrals_Per_Contact__c, ts2__Max_search_agents__c, ts2__Primary__c, ts2__Question10__c, ts2__Question11__c, ts2__Question12__c, ts2__Question13__c, ts2__Question14__c, ts2__Question15__c, ts2__Question16__c, ts2__Question17__c, ts2__Question18__c, ts2__Question19__c, ts2__Question1__c, ts2__Question20__c, ts2__Question2__c, ts2__Question3__c, ts2__Question4__c, ts2__Question5__c, ts2__Question6__c, ts2__Question7__c, ts2__Question8__c, ts2__Question9__c, ts2__Race__c, ts2__Referral_Expiration_Days__c, ts2__Register_Process__c, ts2__Require_Submission_Feedback__c, ts2__Resume_Required__c, ts2__Resume_Submission_Allowed__c, ts2__SearchByKeyword__c, ts2__SearchCriteria1__c, ts2__SearchCriteria2__c, ts2__SearchCriteria3__c, ts2__SearchCriteria4__c, ts2__SearchCriteria5__c, ts2__SearchResult1__c, ts2__SearchResult2__c, ts2__SearchResult3__c, ts2__SearchResult4__c, ts2__Show_Search_Only__c, ts2__SiteName__c, ts2__SiteURL__c, ts2__Source_Tracking_for_External_Referrals__c, ts2__Source_Tracking_for_Internal_Referrals__c, ts2__Veteran__c, Apply_with_LinkedIn__c, RSS_XML_Feeds__c, Languages__c, Countries__c, oAuth_on_off__c, Social_Networks__c, General_Registration__c, Multimedia__c, Thank_You_Page__c, Index_Resume_Upload__c, Index_Cover_Letter__c, Index_Additional_Attachments__c, Index_Multimedia__c, Index_Standard_Questions__c, Custom_Questions__c, Index_Custom_Questions__c, Index_Social_Questions__c, Index_Compliance__c, Index_Forms_URL__c, ts2_Additional_Attachments_Required__c, ts2_Standard_Questions_Required__c, ts2_Custom_Questions_Required__c, ts2_Social_Questions_Required__c, ts2_Compliance_Required__c, ts2_FormsURL_Required__c, I_Accept_Privacy_Statement_Terms_Condi__c, Document_URL__c FROM ts2__Job_Board_Setup__c ");
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Job_Board_Setup__c) {
						jobBoardSetups.add((Ts2__Job_Board_Setup__c) sObject);
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jobBoardSetups;
	}

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	@Override
	public Ts2__Job_Board_Setup__c searchForElement(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
