package com.jobboard.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;

import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Submittal__c;

@ManagedBean
public class SFDCAccessController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Ts2__Job_Board_Setup__c getJobBoardSetupBySiteName(
			final String jobSiteName) {
		Ts2__Job_Board_Setup__c jobBoardSetup = null;//DDataProvider.getJBSetup();
		if (jobSiteName != null) {
			// TODO find it persistence
			// List<Job_Board_Setup__c> JBSetupList = [
			// SELECT
			// ConfirmationMessage__c,
			// HomePage__c,
			// SiteURL__c,
			// Address_Validation__c,
			// Resume_Required__c,
			// HideResumeBuilder__c,
			// HideCoverLetter__c,
			// HidePhone__c,
			// HideMobile__c,
			// HideSourceQuestion__c,
			// HideContactMethod__c,
			// Enable_AddThis__c,
			// AddThis_Username__c,
			// Allow_Register_Only__c,
			// Job_Board_Type__c,
			// Question1__c,Question2__c,Question3__c,Question4__c,Question5__c,Question6__c,Question7__c,Question8__c,Question9__c,Question10__c,Question11__c,Question12__c,Question13__c,Question14__c,Question15__c,Question16__c,Question17__c,Question18__c,Question19__c,Question20__c,
			// Veteran__c,
			// Race__c,
			// Gender__c,
			// Disabled__c,
			// EEO_Text__c,
			// Resume_Submission_Allowed__c,
			// Referral_Expiration_Days__c,
			// Enable_Submission_Feedback__c,
			// Max_Number_Open_Referrals__c,
			// Require_Submission_Feedback__c,
			// Max_Number_Referrals_Per_Contact__c,
			// Enable_Employee_Status_Check__c,
			// Source_Tracking_for_Internal_Referrals__c,
			// Enable_Referral_Email_Notification__c,
			// Source_Tracking_for_External_Referrals__c,
			// Enable_Lead_Tracking__c,
			// Employee_Account__c,
			// LocalizedJobName__c,
			// LocalizedJobDescription__c,
			// Max_search_agents__c,
			// SearchByKeyword__c,
			// SearchResult1__c,SearchResult2__c,SearchResult3__c,SearchResult4__c,
			// SearchCriteria1__c,SearchCriteria2__c,SearchCriteria3__c,SearchCriteria4__c,SearchCriteria5__c,
			// JobDescription1__c,JobDescription2__c,JobDescription3__c,JobDescription4__c,JobDescription5__c,JobDescription6__c,JobDescription7__c,JobDescription8__c,JobDescription9__c,JobDescription10__c,
			// Jobs_Per_Page__c,
			// Show_Search_Only__c,
			// Register_Process__c,
			// ApplicationsDisplayMode__c,
			// Apply_Referral_Immediately__c,
			// Internal_Application_Process__c
			// FROM Job_Board_Setup__c
			// WHERE SiteName__c = :jobSiteName
			// ];
		}
		return jobBoardSetup;
	}

	public static Contact getCandidateById(String cid) {
		Contact candidate = null;
		if (cid != null) {
			// TODO find it persistence
			// List<Contact> contacts = [
			// SELECT
			// Id,FirstName,LastName,Email,Phone,MobilePhone,MailingStreet,MailingCity,MailingState,MailingCountry,MailingPostalCode,Contact_Method__c,Candidate_Source__c,Verified__c,OwnerId,SessionKey__c,Resume_Last_Updated__c
			// FROM Contact
			// WHERE Id = :cid
			// ];
		}
		return candidate;
	}

	public static Contact getCandidateBySessionKey(String sessionKey) {
		Contact candidate = null;
		if (sessionKey != null) {
			// TODO find it persistence
			// List<Contact> contacts = [
			// SELECT
			// Id,FirstName,LastName,Email,Phone,MobilePhone,MailingStreet,MailingCity,MailingState,MailingCountry,MailingPostalCode,Contact_Method__c,Candidate_Source__c,Verified__c,OwnerId,SessionKey__c,Resume_Last_Updated__c
			// FROM Contact
			// WHERE SessionKey__c = :sessionKey
			// ORDER BY CreatedDate DESC
			// LIMIT 1
			// ];
		}
		return candidate;
	}

	public static Ts2__Application__c getApplicationById(String cid) {
		Ts2__Application__c application = null;
		if (cid != null && !cid.isEmpty()) {
			// TODO find it persistence
			// List<Application__c> applications = [
			// SELECT Id, RecordTypeId, Job__c, Candidate_Contact__c, Status__c,
			// Application_Status__c, App_Status__c, Completed__c,
			// Overall_Reject_Reason__c, Application_Source__c, Cover_Letter__c,
			// EEO_Gender__c, Veteran_Status__c, Race__c, EEO_Disabled__c
			// FROM Application__c
			// WHERE Id =:cid
			// ];
		}
		return application;

	}

	public static Ts2__Submittal__c getSubmittalByKey(String key) {
		Ts2__Submittal__c submittal = null;
		if (key != null && !key.isEmpty()) {
			// TODO find it persistence
			// List<Submittal__c> submittals = [
			// SELECT Id, RecordTypeId, Status__c, HiringManager__r.Name,
			// Candidate__r.Name, Candidate__r.FirstName, Candidate__r.LastName,
			// Candidate__r.Experience_Summary__c, Job__r.Name,
			// Job__r.Job_Description__c, Job__r.RecordType.DeveloperName,
			// Reject_Reason__c, Related_Application__c
			// FROM Submittal__c
			// WHERE Key__c =:key
			// ORDER BY LastModifiedDate DESC
			// LIMIT 1
			// ];
		}

		return submittal;
	}

}
