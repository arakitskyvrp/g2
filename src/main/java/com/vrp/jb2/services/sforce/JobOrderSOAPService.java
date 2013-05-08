package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__JobOrderJobBoardAssociation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.vrp.jb2.services.JobOrderService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about job order.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "jobOrderSOAPServiceNew")
@ApplicationScoped
public class JobOrderSOAPService implements JobOrderService {

    private static final Logger LOG = Logger.getLogger(JobOrderSOAPService.class);

    private static final String QUERY = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Account__c, ts2__Bonus__c, " +
            "ts2__Burden_Pct__c, ts2__Business_Unit__c, ts2__CDate__c, ts2__Chance_this_search_will_be_filled__c," +
            " ts2__Chatter_Hash_Tags__c, ts2__Clearance_Type__c, ts2__Clearance__c, ts2__Client_Address__c, " +
            "ts2__Client_Phone__c, ts2__Close_Pct__c, ts2__Closed_Reason__c, ts2__Contact_Email__c, " +
            "ts2__Contact_Phone__c, ts2__Contact__c, ts2__Contract__c, ts2__Conversion_Date__c, " +
            "ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee__c, ts2__Date_Filled__c, ts2__Date_Posted__c, " +
            "ts2__Days_Gauge__c, ts2__Days_Open__c, ts2__Days_to_Fill__c, ts2__Department__c, ts2__Description_ID__c, " +
            "ts2__Description__c, ts2__Disable_EEO__c, ts2__Employment_Type__c, ts2__Estimated_End_Date__c, " +
            "ts2__Estimated_Fee__c, ts2__Estimated_Gross_Margin__c, ts2__Estimated_Hours__c, " +
            "ts2__Estimated_Start_Date__c, ts2__Expiration_Date__c, ts2__Expires__c, ts2__FTE__c, ts2__Facility__c, " +
            "ts2__Fee_Pct__c, ts2__First_Year_Salary__c, ts2__Forecasted_Revenue__c, ts2__Internal_Notes__c, " +
            "ts2__Internal_Passing_Score__c, ts2__Internal_Question_Set__c, ts2__Job_Advertisement__c, " +
            "ts2__Job_Description__c, ts2__Job_Family__c, ts2__Job_Function__c, ts2__Job_Number__c, " +
            "ts2__Job_Rank__c, ts2__Job_Tag__c, ts2__Job_Title_Number__c, ts2__KPI_Count__c, " +
            "ts2__Last_Modified_Date_for_S_Control__c, ts2__Legacy_JobID__c, ts2__Localized_Job_Description__c, " +
            "ts2__Localized_Job_Title__c, ts2__Location__c, ts2__Manager__c, ts2__Markup_Bill__c, " +
            "ts2__Markup_Pay__c, ts2__Markup_Pct__c, ts2__Markup__c, ts2__Max_Bill_Rate__c, " +
            "ts2__Max_Conversion_Salary__c, ts2__Max_Pay_Rate__c, ts2__Max_Salary__c, ts2__Metro__c, " +
            "ts2__Min_Bill_Rate__c, ts2__Min_Conversion_Salary__c, ts2__Min_Pay_Rate__c, ts2__Min_Salary__c, " +
            "ts2__Openings__c, ts2__Order__c, ts2__Passing_Score__c, ts2__Per_Diem_Bill_Rate__c, " +
            "ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem__c, ts2__Percentage_Fee__c, " +
            "ts2__Post_Job__c, ts2__Post_to_Chatter__c, ts2__Posted_to_Prospects__c, ts2__Posting_Status__c, " +
            "ts2__Priority__c, ts2__Project__c, ts2__Question_Set__c, ts2__Recruiter__c, ts2__Remaining__c, " +
            "ts2__Screening_Requirements__c, ts2__Search_Type__c, ts2__Search__c, ts2__Secondary_Recruiter__c, " +
            "ts2__Shift__c, ts2__Short_Description__c, ts2__Skill_Codes__c, ts2__Specific_Requirements__c, " +
            "ts2__Stage__c, ts2__Start_Date__c, ts2__Status__c, ts2__TEST1__c, ts2__Target_Base_Salary__c, " +
            "ts2__Term_Months__c, ts2__Text_Description__c, ts2__Total_KPI_Count__c, ts2__Travel__c, ts2__User__c, " +
            "ts2__Waitlisted__c, ts2__Work_Class__c, ts2__referral_bonus__c, ts2__Application_Count__c, " +
            "ts2__Interview_Count__c, ts2__JobNotificationsSummary__c, ts2__Offer_Count__c, ts2__Placement_Count__c, " +
            "ts2__Submittal_Count__c, ts2extams__Launch_AMS__c " +
            "FROM ts2__Job__c " +
            "{0}";

    private static final String QUERY_JOB_ORDER_BOARD = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, ts2__JobOrder__c, ts2__JobBoardSetup__c " +
            "FROM ts2__JobOrderJobBoardAssociation__c" +
            "{0} ";

    private static final String WHERE_JOB_BOARD_SETUP = "WHERE ts2__JobBoardSetup__c = ''{0}''";
    private static final String WHERE_BY_ID = " WHERE Id = ''{0}''";
    private static final String WHERE_PATTERN = " WHERE {0}";

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    @Override
    public List<Ts2__Job__c> listElements() {
        LOG.trace("Start listElements()");
        return getSfManager().getListElements(QUERY, Ts2__Job__c.class);
    }


    public List<Ts2__Job__c> listAllByJobBoard(String boardSetupID) {
        LOG.trace("Start listAllByJobBoard(), boardSetupID :: " + boardSetupID);
        List<Ts2__Job__c> jobs = new ArrayList<Ts2__Job__c>();

        List<Ts2__JobOrderJobBoardAssociation__c> listJobOrder = getSfManager().
                getListElementsByParam(QUERY_JOB_ORDER_BOARD, WHERE_JOB_BOARD_SETUP, Ts2__JobOrderJobBoardAssociation__c.class);
        for (Ts2__JobOrderJobBoardAssociation__c jobOrderJobBoardAssociation : listJobOrder) {
            Ts2__Job__c jobOrder = jobOrderJobBoardAssociation.getTs2__JobOrder__r();
            if (jobOrder != null) {
                jobs.add(jobOrder);
            } else {
                jobOrder = searchForElement(jobOrderJobBoardAssociation.getTs2__JobOrder__c());
                if (jobOrder != null) {
                    jobs.add(jobOrder);
                }
            }
        }

        return jobs;

    }

    @Override
    public Ts2__Job__c searchForElement(String id) {
        LOG.trace("Start searchForElement(), id :: " + id);
        return getSfManager().getElementByParam(QUERY, WHERE_BY_ID, Ts2__Job__c.class, id);
    }

    public List<Ts2__Job__c> queryAllWhere(String where) {
        LOG.trace("Start queryAllWhere(), where :: " + where);
//        duplicate all ' for using where by sfManager
        String whereParam = where.replace("'", "''");
        return getSfManager().getListElementsByParam(QUERY, WHERE_PATTERN + whereParam, Ts2__Job__c.class, whereParam);
    }


}
