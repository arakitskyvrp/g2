package com.jobboard.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.Referral;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.sforce.soap.enterprise.sobject.Ts2__Config__c;
import com.sforce.soap.enterprise.sobject.Ts2__JobOrderJobBoardAssociation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Order_Transalation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.enterprise.sobject.Ts2__Submittal__c;
import com.sforce.soap.enterprise.sobject.Ts2__social_settings__c;
import com.sforce.soap.services.JobBoardSetupSOAPService;
import com.sforce.soap.services.JobOrderSOAPService;
import com.sforce.soap.services.SOAPConnectionService;

@ManagedBean(name = "pageController")
@SessionScoped
public class JobBoardPageController extends ContentComponentController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1905413429142971582L;
	// TODO provide values for this
	public final String paramSessionKey = "";// =
												// ApexPages.currentPage().getParameters().get(Config.SESSION_KEY_PARAM);
	public final String paramSubmittalKey = "";// =
												// ApexPages.currentPage().getParameters().get(Config.SUBMITTAL_KEY_PARAM);
	public final String paramJobId = "";// =
										// ApexPages.currentPage().getParameters().get(Config.JOB_ID_PARAM);
	public final String paramAppId = "";// =
										// ApexPages.currentPage().getParameters().get(Config.APP_ID_PARAM);

	protected String template;
	protected Ts2__social_settings__c settingsORG;
	protected Ts2__Config__c configSetting;
	protected int configMaxNumberOfAttachments;
	protected int configRequiredNumberOfAttachments;
	protected int configMaxSizeOfAttachment;
	protected int configAllowDuplicateApplicationDays;
	protected Ts2__Job_Board_Setup__c JBSetup;
	protected Contact candidate;
	protected Candidate loggedInUser;
	protected Ts2__Job__c joborder;
	protected Ts2__Application__c application;
	protected Ts2__Submittal__c submittal;
	protected boolean isUserLoggedIn;
	protected boolean isSiteLoginEnabled;
	protected String sourceId;
	protected String extSourceId;
	protected String bBSourceId;

	@ManagedProperty(value = "#{jobBoardSetupSOAPService}")
	private JobBoardSetupSOAPService jobBoardSetupSOAPService;
	@ManagedProperty(value = "#{jobOrderSOAPService}")
	private JobOrderSOAPService jobOrderSOAPService;

	public JobBoardPageController() {
		template = "JobBoardTemplate.xhtml";
		ExternalContext externalContext = FacesContext.getCurrentInstance()
				.getExternalContext();
		Object request = externalContext.getRequest();
		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;

			if (httpServletRequest.getHeader("User-Agent").indexOf("Mobile") != -1) {
				template = "JobBoardTemplateMobile.xhtml";
			} else {
				template = "JobBoardTemplate.xhtml";
			}
		}
	}

	public class SecurityWrapper {
		public Ts2__Job__c joborderInJobBoardPage(
				Ts2__Job_Board_Setup__c JBSetup, String paramJobId) {
			Ts2__Job__c joborder = null;

			String boardId = JBSetup.getId();
			// String jobSelectSoql = Config.BASIC_JOB_ORDER_JOB_SELECT +
			// ((JBSetup!=NULL && JBSetup.LocalizedJobName__c!=NULL &&
			// !Config.BASIC_JOB_ORDER_JOB_SELECT.contains(JBSetup.LocalizedJobName__c))
			// ? ', JobOrder__r.' + JBSetup.LocalizedJobName__c + ' ' : '') +
			// 'FROM JobOrderJobBoardAssociation__c WHERE JobOrder__c
			// =:paramJobId AND JobOrder__r.Post_Job__c = true AND
			// JobBoardSetup__c =:boardId';
			String jobSelectSoql = "";// TODO soql
			List<Ts2__JobOrderJobBoardAssociation__c> jobOrderJobBoardAssociationList = null;// TODO
			// Database.query(jobSelectSoql);
			Ts2__JobOrderJobBoardAssociation__c jobOrderJobBoardAssociation = (jobOrderJobBoardAssociationList
					.size() == 1) ? jobOrderJobBoardAssociationList.get(0)
					: null;

			if (jobOrderJobBoardAssociation != null) {
				List<Ts2__Job_Order_Transalation__c> JobTranslate = null;
				// [
				// TODO SELECT
				// Job_Title__c,Job_Description__c,Job_Order__c,Short_Description__c
				// FROM Job_Order_Transalation__c
				// WHERE Job_Order__c =:paramJobId
				// AND RecordType.DeveloperName =:UserInfo.getLanguage()
				// LIMIT 1
				// ];
				if (JobTranslate.size() > 0
						&& JobTranslate.get(0).getTs2__Job_Title__c() != null) {

					jobOrderJobBoardAssociation.getTs2__JobOrder__r().setName(
							JobTranslate.get(0).getTs2__Job_Title__c());

					jobOrderJobBoardAssociation.getTs2__JobOrder__r()
							.setTs2__Job_Description__c(
									JobTranslate.get(0)
											.getTs2__Job_Description__c());

					jobOrderJobBoardAssociation.getTs2__JobOrder__r()
							.setTs2__Job_Description__c(
									JobTranslate.get(0)
											.getTs2__Short_Description__c());
				} else if (JBSetup != null
						&& JBSetup.getTs2__LocalizedJobName__c() != null) {
					// TODO check this is odd
					// jobOrderJobBoardAssociation.getTs2JobOrder().setName(
					// (String) jobOrderJobBoardAssociation
					// .getTs2JobOrder().
					// .get(JBSetup.getTs2LocalizedJobName()));
				}
				joborder = jobOrderJobBoardAssociation.getTs2__JobOrder__r();
			} else {
				// TODO add error to page
				// ApexPages.addMessage(new ApexPages.Message(
				// ApexPages.Severity.FATAL, Label.JobNotPosted));
			}
			return joborder;
		}

		public List<Account> getRecruitingAccount(
				String customSettingRecruitingAccountId) {
			// get from persistence
			// return [SELECT Id, OwnerId FROM Account WHERE Id =
			// :customSettingRecruitingAccountId];
			return null;
		}
	}

	public Ts2__Config__c getConfigSetting() {
		if (configSetting == null) {
			// TODO get the Ts2Config from the persistence
			// ConfigSetting =
			// (Config__c.getInstance(Config.CUSTOM_SETTING_NAME) != NULL) ?
			// Config__c.getInstance(Config.CUSTOM_SETTING_NAME) : new
			// Config__c(Name = Config.CUSTOM_SETTING_NAME);
		}
		return configSetting;
	}

	public void setConfigSetting(Ts2__Config__c configSetting) {
		this.configSetting = configSetting;
	}

	public Ts2__social_settings__c getSettingsORG() {
		if (settingsORG == null) {
			// TODO get from persistence
			// SocialSettings_ORG = social_settings__c.getOrgDefaults();
		}
		return settingsORG;
	}

	public void setSettingsORG(Ts2__social_settings__c settingsORG) {
		this.settingsORG = settingsORG;
	}

	public int getConfigMaxNumberOfAttachments() {
		configMaxNumberOfAttachments = new Double(getConfigSetting()
				.getTs2__Max_Number_of_Attachments__c()).intValue();

		// TODO why limit to 10?
		return configMaxNumberOfAttachments > 10 ? 10
				: configMaxNumberOfAttachments < 0 ? 0
						: configMaxNumberOfAttachments;
	}

	public void setConfigMaxNumberOfAttachments(int configMaxNumberOfAttachments) {
		this.configMaxNumberOfAttachments = configMaxNumberOfAttachments;
	}

	public int getConfigRequiredNumberOfAttachments() {
		// getConfigSetting().get
		// TODO ask why required number of attachments is not present in the
		// current SFDC persistence
		return configRequiredNumberOfAttachments;
	}

	public void setConfigRequiredNumberOfAttachments(
			int configRequiredNumberOfAttachments) {
		this.configRequiredNumberOfAttachments = configRequiredNumberOfAttachments;
	}

	public int getConfigMaxSizeOfAttachment() {
		configMaxSizeOfAttachment = new Double(getConfigSetting()
				.getTs2__Max_Attachment_Size__c()).intValue();
		// TODO why these constants?
		return configMaxSizeOfAttachment != 0 ? configMaxSizeOfAttachment * 1024
				: 25600 * 1024;
	}

	public void setConfigMaxSizeOfAttachment(int configMaxSizeOfAttachment) {
		this.configMaxSizeOfAttachment = configMaxSizeOfAttachment;
	}

	public int getConfigAllowDuplicateApplicationDays() {
		// getConfigSetting().getts2
		// TODO ask why required number of attachments is not present in the
		// current SFDC persistence
		return configAllowDuplicateApplicationDays;
	}

	public void setConfigAllowDuplicateApplicationDays(
			int configAllowDuplicateApplicationDays) {
		this.configAllowDuplicateApplicationDays = configAllowDuplicateApplicationDays;
	}

	public Ts2__Job_Board_Setup__c getJBSetup() {
		if (JBSetup == null) {
			String siteName = findSiteName();
			if (siteName != null) {
				JBSetup = getJobBoardSetupSOAPService()
						.getBoardSetupBySiteName(siteName);

				System.out.println(">> JB SETUP >>");
				System.out.println(JBSetup.getName());
				System.out.println("<< JB SETUP <<");
			}
		}
		return JBSetup;
	}

	private String findSiteName() {
		Object request = FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		if (request instanceof HttpServletRequest) {
			String url = ((HttpServletRequest) request).getRequestURL()
					.toString();
			System.out.println("Current URL>>" + url);
			if (url.contains("localhost:8080")) {
				return "careers";
			}
			String[] split = url.split("\\.");
			if (split.length > 1) {
				System.out.println(">>>BOARD SITE NAME >>" + split[1]);
				return split[1];
			}
		}
		return null;
	}

	public void setJBSetup(Ts2__Job_Board_Setup__c jBSetup) {
		JBSetup = jBSetup;
	}

	public Contact getCandidate() {
		if (candidate == null) {
			if (getLoggedInUser() != null) {
				candidate = SFDCAccessController
						.getCandidateById(getLoggedInUser().getSF_Contact_ID());
			}
			if (candidate == null) {
				candidate = SFDCAccessController
						.getCandidateBySessionKey(paramSessionKey);
			}
			if (candidate == null) {
				candidate = new Contact();
			}

		}
		return candidate;
	}

	public Ts2__Job__c getJoborder() {
		if (joborder == null) {
			if (paramJobId != null && !paramJobId.isEmpty()) {
				SecurityWrapper wrapper = new SecurityWrapper();
				joborder = wrapper.joborderInJobBoardPage(JBSetup, paramJobId);
			}
			// else {
			// ApexPages.addMessage(new
			// ApexPages.Message(ApexPages.Severity.FATAL, Label.MissingJobId));
			// }
		}
		return joborder;
	}

	public void setJoborder(Ts2__Job__c joborder) {
		this.joborder = joborder;
	}

	public Ts2__Application__c getApplication() {
		if (application == null) {
			if (paramAppId != null && !paramAppId.isEmpty()) {

				application = SFDCAccessController
						.getApplicationById(paramAppId);
			}
			if (application == null) {
				application = new Ts2__Application__c();
			}
		}
		return application;
	}

	public void setApplication(Ts2__Application__c application) {
		this.application = application;
	}

	public Ts2__Submittal__c getSubmittal() {
		if (submittal == null) {
			submittal = SFDCAccessController
					.getSubmittalByKey(paramSubmittalKey);
		}
		return submittal;
	}

	public void setSubmittal(Ts2__Submittal__c submittal) {
		this.submittal = submittal;
	}

	public Candidate getLoggedInUser() {
		// TODO implement userinfo
		// Userinfo.getUserId()
		// return (getIsUserLoggedIn()) ? HerokuAccessController
		// .getActiveUserById("test") : null;
		return this.loggedInUser;
	}

	public void setLoggedInUser(Candidate loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public boolean getIsUserLoggedIn() {
		// TODO implement this
		// return System.UserInfo.getUserType() != 'Guest' &&
		// System.UserInfo.getUserType() != 'Standard';
		return isUserLoggedIn;
	}

	public void setIsUserLoggedIn(boolean isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}

	public boolean getIsSiteLoginEnabled() {
		// TODO implement this
		// return (Site.getName() != NULL) ? Site.isLoginEnabled() :
		// (preSet_SiteLoginEnabled!=NULL ? preSet_SiteLoginEnabled : false);
		return isSiteLoginEnabled;
	}

	public void setIsSiteLoginEnabled(boolean isSiteLoginEnabled) {
		this.isSiteLoginEnabled = isSiteLoginEnabled;
	}

	public String getSourceId() {
		sourceId = getParamOrCookieProperty(Config.SOURCE_ID_PARAM);
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getExtSourceId() {
		extSourceId = getParamOrCookieProperty(Config.EXTERNAL_SOURCE_PARAM);

		return extSourceId;
	}

	public void setExtSourceId(String extSourceId) {
		this.extSourceId = extSourceId;
	}

	public String getbBSourceId() {
		// TODO implement this
		bBSourceId = getParamOrCookieProperty(Config.BB_SOURCE_PARAM);
		return bBSourceId;
	}

	private String getParamOrCookieProperty(final String key) {
		final ExternalContext externalContext = FacesContext
				.getCurrentInstance().getExternalContext();
		String property = externalContext
				.getInitParameter(Config.EXTERNAL_SOURCE_PARAM);
		if (property != null && property != "") {
			return property;
		}

		Object cookie = externalContext.getRequestCookieMap().get(
				Config.EXTERNAL_SOURCE_PARAM);
		property = ((cookie != null && cookie instanceof Cookie) ? ((Cookie) cookie)
				.getValue() : "");
		return property;
	}

	public void setbBSourceId(String bBSourceId) {
		this.bBSourceId = bBSourceId;
	}

	// Basic setup of new Application record
	public void setupNewApplication() {
		// getApplication().setts2.Job_Board__c = JBSetup.Id;
		getApplication().setTs2__Job__r(getJoborder());
		getApplication().setTs2__Candidate_Contact__r(getCandidate());
		getApplication().setTs2__Application_Source__r(
				getCandidate().getTs2__Candidate_Source__r());
		getApplication().setTs2__Status__c("Incomplete");
		getApplication().setTs2__Application_Status__c("Incomplete");
		getApplication().setTs2__App_Status__c("Incomplete");
		//
		String applicationSourceId = Util.searchSourceById(getSourceId(),
				getExtSourceId(), getbBSourceId());
		if (applicationSourceId != null) {
			getApplication().setTs2__Application_Status__c(applicationSourceId);
		}
		//
		// Set Application Record Type the same as Job Order Record Type
		Map<String, String> MapRecordTypes = Util
				.buildMapRecordTypes(getJoborder().getRecordType()
						.getDeveloperName());
		String RecordTypeApplication = "fixMe";// TODO
												// MapRecordTypes.get(Application__c.sObjectType.getDescribe().getName());MapRecordTypes.get(RecordType.SobjectTypeEnum.ts2__j);
		if (RecordTypeApplication != null) {
			// TODO find record type by ID and set it.
			// getApplication().setRecordType(RecordTypeApplication);
		}
	}

	// Complete the Application record
	public void completeApplication() {
		if (getApplication().getId() != null) {
			// Update all Existing Opened Referrals and Update Application
			// record ReferralId / ReferredBy fields
			List<Referral> OpenedReferrals = HerokuAccessController
					.getOpenedReferrals(getApplication().getTs2__Job__r(),
							getApplication().getTs2__Candidate_Contact__r());

			if (OpenedReferrals.size() > 0) {
				// TODO implement
				// getApplication().setTs2ReferralId(ts2ReferralId)
				// application.referral_id__c = OpenedReferrals[0].Id;
				// application.referred_by__c =
				// OpenedReferrals[0].r_contact_lookup__c;
				// for (Referral__c OpenedReferral : OpenedReferrals) {
				// OpenedReferral.applied__c = true;
				// OpenedReferral.application_lookup__c = application.Id;
				// OpenedReferral.Applied_Date__c = system.now();
				// }
				// SFDCAccessController.UpdateWithoutSharing(
				// OpenedReferrals,
				// 'JobBoardPageController.cls [completeApplication]',
				// new List<Schema.DescribeFieldResult> {
				// Referral__c.applied__c.getDescribe(),
				// Referral__c.application_lookup__c.getDescribe(),
				// Referral__c.Applied_Date__c.getDescribe()
				// }
				// );
			}
			// // Change the status fields of Application
			// if (application.Status__c == 'Incomplete' ||
			// application.Status__c == 'Referred' || application.Status__c ==
			// 'Invited to Apply') {
			// application.Status__c = 'New';
			// }
			// if (application.Application_Status__c == 'Incomplete' ||
			// application.Application_Status__c == 'Referred' ||
			// application.Status__c == 'Invited to Apply') {
			// application.Application_Status__c = 'Active';
			// }
			// if (application.App_Status__c == 'Incomplete' ||
			// application.App_Status__c == 'Referred' || application.Status__c
			// == 'Invited to Apply') {
			// application.App_Status__c = 'App Sent';
			// }
			// if (application.Overall_Reject_Reason__c == 'Invited to Apply' ||
			// application.Overall_Reject_Reason__c == 'Rolled Over') {
			// application.Overall_Reject_Reason__c = '';
			// application.Disposition_Value__c = '2';
			// }
			// application.Completed__c = true;
			//
			// SFDCAccessController.UpdateWithoutSharing(
			// application,
			// 'JobBoardPageController.cls [completeApplication]',
			// new List<Schema.DescribeFieldResult> {
			// Application__c.referral_id__c.getDescribe(),
			// Application__c.referred_by__c.getDescribe(),
			// Application__c.Status__c.getDescribe(),
			// Application__c.Application_Status__c.getDescribe(),
			// Application__c.App_Status__c.getDescribe(),
			// Application__c.Overall_Reject_Reason__c.getDescribe(),
			// Application__c.Disposition_Value__c.getDescribe(),
			// Application__c.Completed__c.getDescribe()
			// }
			// );
		}
	}

	public List<Cookie> cookiesFromUrl(List<String> paramsNamesList) {
		ExternalContext externalContext = FacesContext.getCurrentInstance()
				.getExternalContext();

		List<Cookie> cookiesList = new ArrayList<Cookie>();

		for (String paramName : paramsNamesList) {
			String initParameter = externalContext.getInitParameter(paramName);
			if (initParameter != null && initParameter.length() > 8) {
				Cookie cookie = new Cookie(paramName, initParameter);
				cookiesList.add(cookie);
			}
		}
		return cookiesList;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public JobBoardSetupSOAPService getJobBoardSetupSOAPService() {
		return jobBoardSetupSOAPService;
	}

	public void setJobBoardSetupSOAPService(
			JobBoardSetupSOAPService jobBoardSetupSOAPService) {
		this.jobBoardSetupSOAPService = jobBoardSetupSOAPService;
	}

	public JobOrderSOAPService getJobOrderSOAPService() {
		if (jobOrderSOAPService == null) {
			jobOrderSOAPService = new JobOrderSOAPService(
					new SOAPConnectionService());
		}
		return jobOrderSOAPService;
	}

	public void setJobOrderSOAPService(JobOrderSOAPService jobOrderSOAPService) {
		this.jobOrderSOAPService = jobOrderSOAPService;
	}

}
