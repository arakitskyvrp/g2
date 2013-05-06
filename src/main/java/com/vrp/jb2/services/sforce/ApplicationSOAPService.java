package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.vrp.jb2.services.ApplicationService;
import org.apache.log4j.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about applications.
 */
@ManagedBean(name = "applicationSOAPServiceNew")
@SessionScoped
public class ApplicationSOAPService extends BaseSOAPService implements ApplicationService {

    private static final Logger LOG = Logger.getLogger(ApplicationSOAPService.class);

    public static final String QUERY_APPLICATIONS_PATTERN = "Select Id, IsDeleted, Name, RecordTypeId, CreatedDate, " +
            "CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, " +
            "ts2__Job__c, ts2__AccountContact__c, ts2__Account__c, ts2__Address__c, ts2__Agency__c, " +
            "ts2__App_Status__c, ts2__App_Tags__c, ts2__Application_Source__c, ts2__Application_Status__c, " +
            "ts2__Apply_Agency__c, ts2__Apply_Exception__c, ts2__Candidate_Contact__c, ts2__Candidate_Source__c, " +
            "ts2__Client__c, ts2__Code__c, ts2__Completed__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, " +
            "ts2__Contact__c, ts2__Cover_Letter__c, ts2__Custom_Email_Message__c, ts2__Date_Available__c, " +
            "ts2__Disposition_Value__c, ts2__EEO_Disabled_Received__c, ts2__EEO_Disabled__c, " +
            "ts2__EEO_Gender_Received__c, ts2__EEO_Gender__c, ts2__EEO_Race_Received__c, " +
            "ts2__EEO_Veteran_Status_Received__c, ts2__Email__c, ts2__Exception_Reason_Other__c, " +
            "ts2__Exception_Reason__c, ts2__Experience_Sum__c, ts2__HiringManager__c, ts2__Internally_Applied__c, " +
            "ts2__Invite_to_Apply__c, ts2__Job_Status__c, ts2__Legacy_ApplicationID__c, ts2__Mobile__c, " +
            "ts2__Overall_Reject_Reason__c, ts2__Phone__c, ts2__Prescreen_Score__c, ts2__PrimaryRecruiter__c, " +
            "ts2__Project__c, ts2__Race__c, ts2__Rank__c, ts2__Reject_Reason__c, ts2__Request_EEO__c, " +
            "ts2__Revert_Status__c, ts2__Rollover_Job_Order__c, ts2__Rollover__c, ts2__SecondaryRecruiter__c, " +
            "ts2__Stage__c, ts2__Status__c, ts2__Tracking_Source__c, ts2__Veteran_Status__c, ts2__referral_id__c, " +
            "ts2__referred_by__c, ts2extams__Action_Buttons__c, ts2extams__Communication_Buttons__c, " +
            "ts2extams__Control_Buttons__c, ts2extams__Overall_SubStatus_API_Name__c, " +
            "ts2extams__Overall_SubStatus_Id__c, ts2extams__Overall_SubStatus_Link__c, ts2extams__Resume_Uploaded__c, " +
            "ts2extams__Substatus__c FROM ts2__Application__c " +
            "{0}";

    public static final String WHERE_APPLICATIONS_PATTERN = " WHERE ts2__Candidate_Contact__c = ''{0}'' ";
    public static final String WHERE_APPLICATION_ALREDY_SENT = "WHERE ts2__Job__c = ''{0}''" +
            " AND ts2__Candidate_Contact__c = ''{1}''";

    @Override
    public List<Ts2__Application__c> getApplicationsByCandidateID(String candidateID) {
        LOG.trace("Start getApplicationsByCandidateID(), candidateID :: " + candidateID);
        return getListElementsByParam(QUERY_APPLICATIONS_PATTERN, WHERE_APPLICATIONS_PATTERN, Ts2__Application__c.class,
                candidateID);
    }

    @Override
    public boolean isApplicationAlredySent(String candidateID, String jobOrderID) {
        LOG.trace("Start isApplicationAlredySent(), candidateID :: " + candidateID + "; jobOrderID :: " + jobOrderID);
        String query = buildSqlQuery(QUERY_APPLICATIONS_PATTERN, WHERE_APPLICATION_ALREDY_SENT, jobOrderID, candidateID);
        SObject[] records = executeQuery(query);
        return (records != null && records.length > 0);
    }

    @Override
    public SaveResult save(Ts2__Application__c application) {
        LOG.trace("Start save(), application :: " + application);
        return saveToSalesforce(application);
    }
}
