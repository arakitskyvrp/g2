package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.vrp.jb2.services.JobBoardSetupService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * Connects to a remote salesforce repository for information about job board.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "jobBoardSetupSOAPServiceNew")
@ApplicationScoped
public class JobBoardSetupSOAPService implements JobBoardSetupService {

    private static final Logger LOG = Logger.getLogger(JobBoardSetupSOAPService.class);

    private static final String QUERY = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, ts2__AddThis_Username__c, " +
            "ts2__Address_Validation__c, ts2__Allow_Register_Only__c, ts2__ApplicationsDisplayMode__c, " +
            "ts2__Apply_Referral_Immediately__c, ts2__AutoAssociate__c, ts2__ConfirmationMessage__c, " +
            "ts2__Disabled__c, ts2__EEO_Text__c, ts2__Employee_Account__c, ts2__Enable_AddThis__c, " +
            "ts2__Enable_Employee_Status_Check__c, ts2__Enable_Lead_Tracking__c, " +
            "ts2__Enable_Referral_Email_Notification__c, ts2__Enable_Submission_Feedback__c, ts2__Gender__c, " +
            "ts2__HideContactMethod__c, ts2__HideCoverLetter__c, ts2__HideMobile__c, ts2__HidePhone__c, " +
            "ts2__HideResumeBuilder__c, ts2__HideSourceQuestion__c, ts2__HomePage__c, " +
            "ts2__Internal_Application_Process__c, ts2__JobDescription10__c, ts2__JobDescription1__c, " +
            "ts2__JobDescription2__c, ts2__JobDescription3__c, ts2__JobDescription4__c, ts2__JobDescription5__c, " +
            "ts2__JobDescription6__c, ts2__JobDescription7__c, ts2__JobDescription8__c, ts2__JobDescription9__c, " +
            "ts2__Job_Board_Type__c, ts2__Jobs_Per_Page__c, ts2__LocalizedJobDescription__c, " +
            "ts2__LocalizedJobName__c, ts2__Max_Number_Open_Referrals__c, ts2__Max_Number_Referrals_Per_Contact__c, " +
            "ts2__Max_search_agents__c, ts2__Primary__c, ts2__Question10__c, ts2__Question11__c, ts2__Question12__c, " +
            "ts2__Question13__c, ts2__Question14__c, ts2__Question15__c, ts2__Question16__c, ts2__Question17__c, " +
            "ts2__Question18__c, ts2__Question19__c, ts2__Question1__c, ts2__Question20__c, ts2__Question2__c, " +
            "ts2__Question3__c, ts2__Question4__c, ts2__Question5__c, ts2__Question6__c, ts2__Question7__c, " +
            "ts2__Question8__c, ts2__Question9__c, ts2__Race__c, ts2__Referral_Expiration_Days__c, " +
            "ts2__Register_Process__c, ts2__Require_Submission_Feedback__c, ts2__Resume_Required__c, " +
            "ts2__Resume_Submission_Allowed__c, ts2__SearchByKeyword__c, ts2__SearchCriteria1__c, " +
            "ts2__SearchCriteria2__c, ts2__SearchCriteria3__c, ts2__SearchCriteria4__c, ts2__SearchCriteria5__c, " +
            "ts2__SearchResult1__c, ts2__SearchResult2__c, ts2__SearchResult3__c, ts2__SearchResult4__c, " +
            "ts2__Show_Search_Only__c, ts2__SiteName__c, ts2__SiteURL__c, " +
            "ts2__Source_Tracking_for_External_Referrals__c, ts2__Source_Tracking_for_Internal_Referrals__c, " +
            "ts2__Veteran__c FROM ts2__Job_Board_Setup__c " +
            "{0}";

    private static final String WHERE_NAME = " WHERE Name = ''{0}''";

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    @Override
    public Ts2__Job_Board_Setup__c getBoardSetupBySiteName(String siteName) {
        LOG.trace("Start getBoardSetupBySiteName(), siteName :: " + siteName);
        return getSfManager().getElementByParam(QUERY, WHERE_NAME, Ts2__Job_Board_Setup__c.class, siteName);
    }

}
