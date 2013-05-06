package com.jobboard.oauth.scribe.web.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.services.SOAPConnectionService;
import com.sforce.ws.ConnectionException;

@Controller
public class ScheduleController {
	
	@Autowired
	SOAPConnectionService soapConnectionService;
	
	private String convertDate(Calendar calendar){
		DateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
		String convertedDate = formatter.format(calendar.getTime());
		return convertedDate;
	}
	
	
	@RequestMapping(value={"/rss/feed.xml"}, method = RequestMethod.GET)
	public void rss(WebRequest request, HttpServletResponse response, HttpSession session) {
		
		PrintWriter out;
		try {
			response.setContentType("text/xml");
			out = response.getWriter();
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<rss xmlns:feedburner=\"http://rssnamespace.org/feedburner/ext/1.0\" version=\"2.0\">");
		    out.println("<channel>");
		    out.println("<title>JobScience JobBoard</title>");
		    out.println("<description>Your RSS feed description goes here</description>");
		    out.println("<link>http://fbjobboard.herokuapp.com/</link>");
		    out.println("<language>en</language>");
		    out.println("<copyright>JobScience JobBoard</copyright>");
		    out.println("<pubDate>Fri, 07 Dec 2007 21:58:26 CST</pubDate>");
		    out.println("<lastBuildDate>Fri, 07 Dec 2007 21:58:26 CST</lastBuildDate>");
		    out.println("<generator>JobScience JobBoard</generator>");
		    out.println("<ttl>1</ttl>");
		    out.println("<atom10:link xmlns:atom10=\"http://www.w3.org/2005/Atom\" href=\"http://fbjobboard.herokuapp.com/people/rss\" rel=\"self\" type=\"application/rss+xml\" />");
		    out.println("<image>");
		    out.println("<title>JobScience JobBoard</title>");
		    out.println("<url>http://fbjobboard.herokuapp.com/resources/img/icons/feed-icon-16.gif</url>");
		    out.println("<link>http://fbjobboard.herokuapp.com/</link>");
		    out.println("<description>This is the rss job feed</description>");
		    out.println("</image>");

		    
			QueryResult queryResult = soapConnectionService.getEnterpriseConnection()
					.query("Select Id,  Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, ts2__Account__c, ts2__Bonus__c, ts2__Burden_Pct__c, ts2__Business_Unit__c, ts2__CDate__c, ts2__Chance_this_search_will_be_filled__c, ts2__Chatter_Hash_Tags__c, ts2__Clearance_Type__c, ts2__Clearance__c, ts2__Client_Address__c, ts2__Client_Phone__c, ts2__Close_Pct__c, ts2__Closed_Reason__c, ts2__Contact_Email__c, ts2__Contact_Phone__c, ts2__Contact__c, ts2__Contract__c, ts2__Conversion_Date__c, ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee__c, ts2__Date_Filled__c, ts2__Date_Posted__c, ts2__Days_Gauge__c, ts2__Days_Open__c, ts2__Days_to_Fill__c, ts2__Department__c, ts2__Description_ID__c, ts2__Description__c, ts2__Disable_EEO__c, ts2__Employment_Type__c, ts2__Estimated_End_Date__c, ts2__Estimated_Fee__c, ts2__Estimated_Gross_Margin__c, ts2__Estimated_Hours__c, ts2__Estimated_Start_Date__c, ts2__Expiration_Date__c, ts2__Expires__c, ts2__FTE__c, ts2__Facility__c, ts2__Fee_Pct__c, ts2__First_Year_Salary__c, ts2__Forecasted_Revenue__c, ts2__Internal_Notes__c, ts2__Internal_Passing_Score__c, ts2__Internal_Question_Set__c, ts2__Job_Advertisement__c, ts2__Job_Description__c, ts2__Job_Family__c, ts2__Job_Function__c, ts2__Job_Number__c, ts2__Job_Rank__c, ts2__Job_Tag__c, ts2__Job_Title_Number__c, ts2__KPI_Count__c, ts2__Last_Modified_Date_for_S_Control__c, ts2__Legacy_JobID__c, ts2__Localized_Job_Description__c, ts2__Localized_Job_Title__c, ts2__Location__c, ts2__Manager__c, ts2__Markup_Bill__c, ts2__Markup_Pay__c, ts2__Markup_Pct__c, ts2__Markup__c, ts2__Max_Bill_Rate__c, ts2__Max_Conversion_Salary__c, ts2__Max_Pay_Rate__c, ts2__Max_Salary__c, ts2__Metro__c, ts2__Min_Bill_Rate__c, ts2__Min_Conversion_Salary__c, ts2__Min_Pay_Rate__c, ts2__Min_Salary__c, ts2__Openings__c, ts2__Order__c, ts2__Passing_Score__c, ts2__Per_Diem_Bill_Rate__c, ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem__c, ts2__Percentage_Fee__c, ts2__Post_Job__c, ts2__Post_to_Chatter__c, ts2__Posted_to_Prospects__c, ts2__Posting_Status__c, ts2__Priority__c, ts2__Project__c, ts2__Question_Set__c, ts2__Recruiter__c, ts2__Remaining__c, ts2__Screening_Requirements__c, ts2__Search_Type__c, ts2__Search__c, ts2__Secondary_Recruiter__c, ts2__Shift__c, ts2__Short_Description__c, ts2__Skill_Codes__c, ts2__Specific_Requirements__c, ts2__Stage__c, ts2__Start_Date__c, ts2__Status__c, ts2__TEST1__c, ts2__Target_Base_Salary__c, ts2__Term_Months__c, ts2__Text_Description__c, ts2__Total_KPI_Count__c, ts2__Travel__c, ts2__User__c, ts2__Waitlisted__c, ts2__Work_Class__c, ts2__referral_bonus__c, ts2__Application_Count__c, ts2__Interview_Count__c, ts2__JobNotificationsSummary__c, ts2__Offer_Count__c, ts2__Placement_Count__c, ts2__Submittal_Count__c, ts2extams__Launch_AMS__c FROM ts2__Job__c ");
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Ts2__Job__c) {
						Ts2__Job__c job = (Ts2__Job__c) sObject;
						out.println("<item>");
						out.println("<title>" + job.getName() + "</title>");
						
						// job id
						String link = null;
						if (null != job.getId()){
							link = "http://fbjobboard.herokuapp.com/jobOrderDetal.xhtml?Id=" + job.getId();
							out.println("<link>" + link + "</link>");
						}
						// employment type
						if (null != job.getTs2__Employment_Type__c())
							out.println("<type>" + job.getTs2__Employment_Type__c() + "</type>");
						// location of the job
						if (null != job.getTs2__Location__c())
							out.println("<location>" + job.getTs2__Location__c() + "</location>");
						// pubdate
						if (null != job.getCreatedDate())
							out.println("<pubDate>" + convertDate(job.getCreatedDate()) + "</pubDate>");
						// guid
						if (null != link)
							out.println("<guid>" + link + "</guid>");
						out.println("</item>");						
					}
				}
			}
		    
		    out.println("</channel>");
		    out.println("</rss>");
		} catch (ConnectionException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}