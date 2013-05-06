package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.jobboard.controller.JobSearchController;
import com.jobboard.controller.JobSearchController.Criteria;
import com.jobboard.controller.JobSearchController.Keyword;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__JobOrderJobBoardAssociation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name = "jobOrderSOAPService")
@SessionScoped
public class JobOrderSOAPService implements SOAPService<Ts2__Job__c> {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public JobOrderSOAPService() {
	}

	public JobOrderSOAPService(SOAPConnectionService soapConnectionService) {
		setConnectionService(soapConnectionService);
	}

	@Override
	public Ts2__Job__c saveToDatabase(Ts2__Job__c entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ts2__Job__c> listElements() {
		List<Ts2__Job__c> jobs = new ArrayList<Ts2__Job__c>();
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection()
					.query("Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Account__c, ts2__Bonus__c, ts2__Burden_Pct__c, ts2__Business_Unit__c, ts2__CDate__c, ts2__Chance_this_search_will_be_filled__c, ts2__Chatter_Hash_Tags__c, ts2__Clearance_Type__c, ts2__Clearance__c, ts2__Client_Address__c, ts2__Client_Phone__c, ts2__Close_Pct__c, ts2__Closed_Reason__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Contract__c, ts2__Conversion_Date__c, ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee__c, ts2__Date_Filled__c, ts2__Date_Posted__c, ts2__Days_Gauge__c, ts2__Days_Open__c, ts2__Days_to_Fill__c, ts2__Department__c, ts2__Description_ID__c, ts2__Description__c, ts2__Disable_EEO__c, ts2__Employment_Type__c, ts2__Estimated_End_Date__c, ts2__Estimated_Fee__c, ts2__Estimated_Gross_Margin__c, ts2__Estimated_Hours__c, ts2__Estimated_Start_Date__c, ts2__Expiration_Date__c, ts2__Expires__c, ts2__FTE__c, ts2__Facility__c, ts2__Fee_Pct__c, ts2__First_Year_Salary__c, ts2__Forecasted_Revenue__c, ts2__Internal_Notes__c, ts2__Internal_Passing_Score__c, ts2__Internal_Question_Set__c, ts2__Job_Advertisement__c, ts2__Job_Description__c, ts2__Job_Family__c, ts2__Job_Function__c, ts2__Job_Number__c, ts2__Job_Rank__c, ts2__Job_Tag__c, ts2__Job_Title_Number__c, ts2__KPI_Count__c, ts2__Last_Modified_Date_for_S_Control__c, ts2__Legacy_JobID__c, ts2__Localized_Job_Description__c, ts2__Localized_Job_Title__c, ts2__Location__c, ts2__Manager__c, ts2__Markup_Bill__c, ts2__Markup_Pay__c, ts2__Markup_Pct__c, ts2__Markup__c, ts2__Max_Bill_Rate__c, ts2__Max_Conversion_Salary__c, ts2__Max_Pay_Rate__c, ts2__Max_Salary__c, ts2__Metro__c, ts2__Min_Bill_Rate__c, ts2__Min_Conversion_Salary__c, ts2__Min_Pay_Rate__c, ts2__Min_Salary__c, ts2__Openings__c, ts2__Order__c, ts2__Passing_Score__c, ts2__Per_Diem_Bill_Rate__c, ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem__c, ts2__Percentage_Fee__c, ts2__Post_Job__c, ts2__Post_to_Chatter__c, ts2__Posted_to_Prospects__c, ts2__Posting_Status__c, ts2__Priority__c, ts2__Project__c, ts2__Question_Set__c, ts2__Recruiter__c, ts2__Remaining__c, ts2__Screening_Requirements__c, ts2__Search_Type__c, ts2__Search__c, ts2__Secondary_Recruiter__c, ts2__Shift__c, ts2__Short_Description__c, ts2__Skill_Codes__c, ts2__Specific_Requirements__c, ts2__Stage__c, ts2__Start_Date__c, ts2__Status__c, ts2__TEST1__c, ts2__Target_Base_Salary__c, ts2__Term_Months__c, ts2__Text_Description__c, ts2__Total_KPI_Count__c, ts2__Travel__c, ts2__User__c, ts2__Waitlisted__c, ts2__Work_Class__c, ts2__referral_bonus__c, ts2__Application_Count__c, ts2__Interview_Count__c, ts2__JobNotificationsSummary__c, ts2__Offer_Count__c, ts2__Placement_Count__c, ts2__Submittal_Count__c, ts2extams__Launch_AMS__c FROM ts2__Job__c ");
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Job__c) {
						jobs.add((Ts2__Job__c) sObject);
					}
				}
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return jobs;
	}

	public List<Ts2__Job__c> listAllByJobBoard(String boardSetupID) {

		String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__JobOrder__c, ts2__JobBoardSetup__c FROM ts2__JobOrderJobBoardAssociation__c WHERE ts2__JobBoardSetup__c = '"
				+ boardSetupID + "' ";
		List<Ts2__Job__c> jobs = new ArrayList<Ts2__Job__c>();
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__JobOrderJobBoardAssociation__c) {
						Ts2__Job__c jobOrder = ((Ts2__JobOrderJobBoardAssociation__c) sObject)
								.getTs2__JobOrder__r();
						if (jobOrder != null) {
							jobs.add(jobOrder);
						} else {
							jobOrder = searchForElement(((Ts2__JobOrderJobBoardAssociation__c) sObject)
									.getTs2__JobOrder__c());
							if (jobOrder != null) {
								jobs.add(jobOrder);
							}
						}
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jobs;

	}

	@Override
	public Ts2__Job__c searchForElement(String id) {
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection()
					.query("Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Account__c, ts2__Bonus__c, ts2__Burden_Pct__c, ts2__Business_Unit__c, ts2__CDate__c, ts2__Chance_this_search_will_be_filled__c, ts2__Chatter_Hash_Tags__c, ts2__Clearance_Type__c, ts2__Clearance__c, ts2__Client_Address__c, ts2__Client_Phone__c, ts2__Close_Pct__c, ts2__Closed_Reason__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Contract__c, ts2__Conversion_Date__c, ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee__c, ts2__Date_Filled__c, ts2__Date_Posted__c, ts2__Days_Gauge__c, ts2__Days_Open__c, ts2__Days_to_Fill__c, ts2__Department__c, ts2__Description_ID__c, ts2__Description__c, ts2__Disable_EEO__c, ts2__Employment_Type__c, ts2__Estimated_End_Date__c, ts2__Estimated_Fee__c, ts2__Estimated_Gross_Margin__c, ts2__Estimated_Hours__c, ts2__Estimated_Start_Date__c, ts2__Expiration_Date__c, ts2__Expires__c, ts2__FTE__c, ts2__Facility__c, ts2__Fee_Pct__c, ts2__First_Year_Salary__c, ts2__Forecasted_Revenue__c, ts2__Internal_Notes__c, ts2__Internal_Passing_Score__c, ts2__Internal_Question_Set__c, ts2__Job_Advertisement__c, ts2__Job_Description__c, ts2__Job_Family__c, ts2__Job_Function__c, ts2__Job_Number__c, ts2__Job_Rank__c, ts2__Job_Tag__c, ts2__Job_Title_Number__c, ts2__KPI_Count__c, ts2__Last_Modified_Date_for_S_Control__c, ts2__Legacy_JobID__c, ts2__Localized_Job_Description__c, ts2__Localized_Job_Title__c, ts2__Location__c, ts2__Manager__c, ts2__Markup_Bill__c, ts2__Markup_Pay__c, ts2__Markup_Pct__c, ts2__Markup__c, ts2__Max_Bill_Rate__c, ts2__Max_Conversion_Salary__c, ts2__Max_Pay_Rate__c, ts2__Max_Salary__c, ts2__Metro__c, ts2__Min_Bill_Rate__c, ts2__Min_Conversion_Salary__c, ts2__Min_Pay_Rate__c, ts2__Min_Salary__c, ts2__Openings__c, ts2__Order__c, ts2__Passing_Score__c, ts2__Per_Diem_Bill_Rate__c, ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem__c, ts2__Percentage_Fee__c, ts2__Post_Job__c, ts2__Post_to_Chatter__c, ts2__Posted_to_Prospects__c, ts2__Posting_Status__c, ts2__Priority__c, ts2__Project__c, ts2__Question_Set__c, ts2__Recruiter__c, ts2__Remaining__c, ts2__Screening_Requirements__c, ts2__Search_Type__c, ts2__Search__c, ts2__Secondary_Recruiter__c, ts2__Shift__c, ts2__Short_Description__c, ts2__Skill_Codes__c, ts2__Specific_Requirements__c, ts2__Stage__c, ts2__Start_Date__c, ts2__Status__c, ts2__TEST1__c, ts2__Target_Base_Salary__c, ts2__Term_Months__c, ts2__Text_Description__c, ts2__Total_KPI_Count__c, ts2__Travel__c, ts2__User__c, ts2__Waitlisted__c, ts2__Work_Class__c, ts2__referral_bonus__c, ts2__Application_Count__c, ts2__Interview_Count__c, ts2__JobNotificationsSummary__c, ts2__Offer_Count__c, ts2__Placement_Count__c, ts2__Submittal_Count__c, ts2extams__Launch_AMS__c FROM ts2__Job__c WHERE Id = '"
							+ id + "'");
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Job__c) {
						return (Ts2__Job__c) sObject;
					}
				}
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return null;
	}

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	/**
	 * 
	 * @param where
	 *            the were part of the select * query
	 * @return list of queried Ts2__Job__c
	 */
	public List<Ts2__Job__c> queryAllWhere(String where) {
		List<Ts2__Job__c> jobs = new ArrayList<Ts2__Job__c>();
		if (where != null && !where.isEmpty()) {
			where = " WHERE " + where;
		}
		try {
			String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Account__c, ts2__Bonus__c, ts2__Burden_Pct__c, ts2__Business_Unit__c, ts2__CDate__c, ts2__Chance_this_search_will_be_filled__c, ts2__Chatter_Hash_Tags__c, ts2__Clearance_Type__c, ts2__Clearance__c, ts2__Client_Address__c, ts2__Client_Phone__c, ts2__Close_Pct__c, ts2__Closed_Reason__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Contract__c, ts2__Conversion_Date__c, ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee__c, ts2__Date_Filled__c, ts2__Date_Posted__c, ts2__Days_Gauge__c, ts2__Days_Open__c, ts2__Days_to_Fill__c, ts2__Department__c, ts2__Description_ID__c, ts2__Description__c, ts2__Disable_EEO__c, ts2__Employment_Type__c, ts2__Estimated_End_Date__c, ts2__Estimated_Fee__c, ts2__Estimated_Gross_Margin__c, ts2__Estimated_Hours__c, ts2__Estimated_Start_Date__c, ts2__Expiration_Date__c, ts2__Expires__c, ts2__FTE__c, ts2__Facility__c, ts2__Fee_Pct__c, ts2__First_Year_Salary__c, ts2__Forecasted_Revenue__c, ts2__Internal_Notes__c, ts2__Internal_Passing_Score__c, ts2__Internal_Question_Set__c, ts2__Job_Advertisement__c, ts2__Job_Description__c, ts2__Job_Family__c, ts2__Job_Function__c, ts2__Job_Number__c, ts2__Job_Rank__c, ts2__Job_Tag__c, ts2__Job_Title_Number__c, ts2__KPI_Count__c, ts2__Last_Modified_Date_for_S_Control__c, ts2__Legacy_JobID__c, ts2__Localized_Job_Description__c, ts2__Localized_Job_Title__c, ts2__Location__c, ts2__Manager__c, ts2__Markup_Bill__c, ts2__Markup_Pay__c, ts2__Markup_Pct__c, ts2__Markup__c, ts2__Max_Bill_Rate__c, ts2__Max_Conversion_Salary__c, ts2__Max_Pay_Rate__c, ts2__Max_Salary__c, ts2__Metro__c, ts2__Min_Bill_Rate__c, ts2__Min_Conversion_Salary__c, ts2__Min_Pay_Rate__c, ts2__Min_Salary__c, ts2__Openings__c, ts2__Order__c, ts2__Passing_Score__c, ts2__Per_Diem_Bill_Rate__c, ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem__c, ts2__Percentage_Fee__c, ts2__Post_Job__c, ts2__Post_to_Chatter__c, ts2__Posted_to_Prospects__c, ts2__Posting_Status__c, ts2__Priority__c, ts2__Project__c, ts2__Question_Set__c, ts2__Recruiter__c, ts2__Remaining__c, ts2__Screening_Requirements__c, ts2__Search_Type__c, ts2__Search__c, ts2__Secondary_Recruiter__c, ts2__Shift__c, ts2__Short_Description__c, ts2__Skill_Codes__c, ts2__Specific_Requirements__c, ts2__Stage__c, ts2__Start_Date__c, ts2__Status__c, ts2__TEST1__c, ts2__Target_Base_Salary__c, ts2__Term_Months__c, ts2__Text_Description__c, ts2__Total_KPI_Count__c, ts2__Travel__c, ts2__User__c, ts2__Waitlisted__c, ts2__Work_Class__c, ts2__referral_bonus__c, ts2__Application_Count__c, ts2__Interview_Count__c, ts2__JobNotificationsSummary__c, ts2__Offer_Count__c, ts2__Placement_Count__c, ts2__Submittal_Count__c, ts2extams__Launch_AMS__c FROM ts2__Job__c"
					+ where;
			// System.out.println("Querying database query: " + query);
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Job__c) {
						jobs.add((Ts2__Job__c) sObject);
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jobs;
	}

	public static void main(String[] args) {
		JobOrderSOAPService jobOrderSOAPService = new JobOrderSOAPService();
		jobOrderSOAPService.setConnectionService(new SOAPConnectionService());
		List<Ts2__Job__c> query = jobOrderSOAPService.queryAllWhere(""
				+ getWhereFromCriteria() + " AND " + getWhereFromKeywords());
		System.out.println(query.size());
		System.out.println("" + getWhereFromCriteria() + " AND "
				+ getWhereFromKeywords());
	}

	private static String getWhereFromCriteria() {
		StringBuffer sb = new StringBuffer();
		for (Criteria criteria : getSearchCriteriaList()) {
			if (criteria.getSelectedValue() != null
					&& !criteria.getSelectedValue()
					/* .getValue() */.toString().isEmpty()
					&& !criteria.getSelectedValue()/* .getLabel() */.equals(
							Criteria.NONE)) {
				if (!sb.toString().isEmpty()) {
					sb.append(" AND ");
				}
				sb.append(criteria.getName() + "= '"
						+ criteria.getSelectedValue()
						/* .getValue() */.toString() + "'");
			}
		}
		return sb.toString();
	}

	private static String getWhereFromKeywords() {
		StringBuffer sbName = new StringBuffer();
		StringBuffer sbDescription = new StringBuffer();
		sbName.append("(");
		sbDescription.append("(");
		for (int i = 0; i < getKeywords().size(); i++) {
			Keyword keyword = getKeywords().get(i);
			boolean addOperator = i < (getKeywords().size() - 1);
			String operator = addOperator ? keyword.getOperator() : "";
			sbName.append(" Name LIKE '%" + keyword.getKeyword() + "%' "
					+ operator);
			sbDescription.append(" ts2__Short_Description__c LIKE '%"
					+ keyword.getKeyword() + "%' " + operator);

			// Name
			// ts2__Job_Description__c

		}

		sbName.append(")");
		sbDescription.append(")");

		return sbName.toString() + " OR " + sbDescription.toString();
	}

	private static List<Keyword> getKeywords() {
		List<Keyword> keywords = new ArrayList<JobSearchController.Keyword>();
		Keyword keyword = new Keyword("order", Keyword.Operator.AND.toString());
		keywords.add(keyword);

		// Keyword keyword1 = new
		// Keyword("sample",Keyword.Operator.AND.toString());
		// keywords.add(keyword1);
		return keywords;
	}

	private static List<Criteria> getSearchCriteriaList() {
		List<JobSearchController.Criteria> criterias = new ArrayList<JobSearchController.Criteria>();
		// Criteria criteria = new Criteria("ts2__Department__c", "Department");
		// criteria.setSelectedValue("Dept ABC");
		return criterias;
	}

}
