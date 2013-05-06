package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jobboard.controller.WorkflowController.STEP;
import com.jobboard.model.UserProfile;
import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.service.CandidateService;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.services.ContactSOAPService;

@Component("register")
@Scope("session")
@ManagedBean(name="register")
@SessionScoped
public class RegisterController implements Serializable, Submitable {	
	
	private static final long serialVersionUID = -5120800338690135946L;

	// Service methods
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{contactSOAPService}")
	private ContactSOAPService contactSOAPService;
	@ManagedProperty(value = "#{candidateService}")
	private CandidateService candidateService;
	@ManagedProperty(value = "#{userProfile}")
	protected UserProfile userProfile;
	@ManagedProperty(value = "#{workflowController}")
	private WorkflowController workflowController;
	@ManagedProperty(value = "#{pageController}")
	private JobBoardPageController pageController;
	
	
	
	// method of registration, can be SIMPLE, FACEBOOK, LINKEDIN, GOOGLE-PLUS
	protected String registrationMethod = "SIMPLE";
	
	// Jobboard setup options
	protected boolean OAuth_on_off = true;
	protected boolean LinkedIn_on_off = true;
	protected boolean Facebook_on_off = true;
	private boolean GooglePlus_on_off = true;
	
	protected boolean General_Registration = true;
	protected boolean Ts2__Resume_Required = true;
	protected boolean Ts2__HideCoverLetter__c = true;
	protected boolean Multimedia = true;
	protected boolean Ts2_Additional_Attachments_Required = true;
	protected boolean Ts2_Standard_Questions_Required__c; 
	protected boolean Ts2_Custom_Questions_Required__c; 
	protected boolean Ts2_Social_Questions_Required__c; 
	protected boolean Ts2_Compliance_Required__c; 
	protected boolean Ts2_FormsURL_Required__c; 

	
	protected int configMaxSizeOfAttachment = 1048576;
	protected int configMaxNumberOfAttachments = 3;
	
	
	private boolean isResumeUploded = false;
	private boolean isAdditionalAttachUploded = false;


	@PostConstruct
	public void initIt() {
		setJobboardData();
	}

	/**
	 *  Saves the candidate to SF database and Heroku, is called after all registration process steps 
	 *  are completed.
	 */	
	private void saveCandidate() {
		Contact contact = new Contact();
		contact.setEmail(getUserProfile().getEmail());
		contact.setFirstName(getUserProfile().getFirstName());
		contact.setLastName(getUserProfile().getLastName());
		contact.setPhone(getUserProfile().getPhone());
		contact.setMobilePhone(getUserProfile().getMobile());
		contact.setMailingStreet(getUserProfile().getStreet());
		String mailingCountry = getUserProfile().getCountrySelect();
		contact.setMailingCountry(mailingCountry);

		if ("US".equals(mailingCountry)) {
			contact.setMailingState(getUserProfile().getStateSelect());
		} else {
			if ("CA".equals(mailingCountry)) {
				contact.setMailingState(getUserProfile().getProvinceSelect());
			} else {
				contact.setMailingState(getUserProfile().getStateProvinceInputField());
			}
		}
		
		contact.setMailingCity(getUserProfile().getCity());
		contact.setMailingPostalCode(getUserProfile().getPostalCode());
		contact.setTs2__Contact_Method__c(getUserProfile().getContactMethod());
		contact.setTs2__Source__c(getUserProfile().getCandidateSource());

		// Save record to SF
		contact = getContactSOAPService().saveToDatabase(contact);

		// Create heroku record if saving record to SF was successful		
		if (null != contact)
		{
			Candidate cnd = new Candidate();
			cnd.setSF_Contact_ID(contact.getId());
			cnd.setEmail(contact.getEmail());
			cnd.setCreated_Date(new Date());
			cnd.setUsername(contact.getEmail());
			
			if (getIsSimpleRegistration())
				cnd.setPassword(UserProfile.MD5(getUserProfile().getPassword()));
			
			cnd.setExternal_Auth_ID(registrationMethod);

			// Save record to heroku
			getCandidateService().saveToDatabase(cnd);
		}
		
	}
	
	public void populateDataForLoggedInUser() {
		getUserProfile().setUpdate(true);
		Candidate cnd = getJobSearchController().getLoggedInUser();
		if (null != cnd) {
			registrationMethod = cnd.getExternal_Auth_ID();
			Contact contact = getContactSOAPService().searchForElement(cnd.getSF_Contact_ID());
			getUserProfile().setEmail(contact.getEmail());
			getUserProfile().setFirstName(contact.getFirstName());
			getUserProfile().setLastName(contact.getLastName());
			getUserProfile().setPhone(contact.getPhone());
			getUserProfile().setMobile(contact.getMobilePhone());
			getUserProfile().setStreet(contact.getMailingStreet());
			getUserProfile().setCountrySelect(contact.getMailingCountry());
			getUserProfile().setCity(contact.getMailingCity());
			getUserProfile().setPostalCode(contact.getMailingPostalCode());
			getUserProfile().setContactMethod(contact.getTs2__Contact_Method__c());
			getUserProfile().setCandidateSource(contact.getTs2__Source__c());			
		}
	}

	public void updateProfile() {
		Candidate cnd = getJobSearchController().getLoggedInUser();
		if (null != cnd) {
			Contact contact = getContactSOAPService().searchForElement(cnd.getSF_Contact_ID());
			if (null != contact) {
				contact.setEmail(getUserProfile().getEmail());
				contact.setFirstName(getUserProfile().getFirstName());
				contact.setLastName(getUserProfile().getLastName());
				contact.setPhone(getUserProfile().getPhone());
				contact.setMobilePhone(getUserProfile().getMobile());
				contact.setMailingStreet(getUserProfile().getStreet());
				contact.setMailingCountry(getUserProfile().getCountrySelect());
				contact.setMailingCity(getUserProfile().getCity());
				contact.setMailingPostalCode(getUserProfile().getPostalCode());
				contact.setTs2__Contact_Method__c(getUserProfile().getContactMethod());
				contact.setTs2__Source__c(getUserProfile().getCandidateSource());
				Contact[] contacts = new Contact[1]; 
				contacts[0] = contact;
				if (getContactSOAPService().updateRecords(contacts))
				{
					cnd.setEmail(contact.getEmail());
					cnd.setModified_Date(new Date());
					if (getIsSimpleRegistration())
						cnd.setPassword(UserProfile.MD5(getUserProfile().getPassword()));
					// Update record to heroku
					getCandidateService().update(cnd);

					// display updated profile message to user
					LabelController lblController = new LabelController();
					FacesContext
					.getCurrentInstance().addMessage("atsForm:inputHidden",
							new FacesMessage(lblController.getProfileUpdated()));
					
				}
			}
		}
	}
		
	
	public void initRegistration() {
		
		List<STEP> steps = new ArrayList<STEP>();
		
		if (Ts2__Resume_Required) 
			steps.add(STEP.UPLOAD_RESUME);
		
		if (!Ts2__HideCoverLetter__c)
			steps.add(STEP.COVER_LETTER);

		// TODO Where is Multimedia in Workflow controller?
		//if (Multimedia)
		//	steps.add(STEP.ADDITIONAL_ATTACHMENTS);
		
		if (Ts2_Additional_Attachments_Required)
			steps.add(STEP.ADDITIONAL_ATTACHMENTS);
		
		if (Ts2_Standard_Questions_Required__c)
			steps.add(STEP.STANDARD_QUESTIONS);
		
		if (Ts2_Custom_Questions_Required__c)
			steps.add(STEP.CUSTOM_QUESTIONS);
		
		if (Ts2_Social_Questions_Required__c)
			steps.add(STEP.SOCIAL_QUESTIONS);
		
		if (Ts2_Compliance_Required__c)
			steps.add(STEP.COMPLIANCE_QUESTIONS);
	
		// TODO is FormsURL finished ?
//		if (Ts2_FormsURL_Required__c)
//			steps.add(STEP.FORMS_URL); 
		
		
		workflowController.init();
		workflowController.setSubmitable(this);
		workflowController.setSteps(steps.toArray(new STEP[1]));
		workflowController.continueApplication();
	}
	
	
	/**
	 * This method is called by the command button for registering the user
	 * account with Facebook
	 */
	public void registerWithFacebook() {
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-facebook/");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is called by the command button for registering the user
	 * account with Linkedin
	 */
	public void registerWithLinkedin() {
		
		try {			
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-linkedin/");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is called by the command button for registering the user
	 * account with Google
	 */
	public void registerWithGoogle() {
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-google-plus/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean getIsSimpleRegistration(){
		if (registrationMethod.equals("SIMPLE"))
			return true;
		else
			return false;
	}

	public boolean getIsOAuthRegistration()
	{
		if (registrationMethod.equals("FACEBOOK") || 
			registrationMethod.equals("LINKEDIN") ||
			registrationMethod.equals("GOOGLE-PLUS"))
			return true;
		else
			return false;
	}
	
	/**
	 * This method reads from JobboardSetup from SF and initializes the variables
	 * 
	 */
	private void setJobboardData(){
		Ts2__Job_Board_Setup__c jbSetup = getPageController().getJBSetup();
		if (null != jbSetup) {
			// TODO check with Shishkin
			//setOAuth_on_off(jbSetup.getOAuth_on_off__c());
			String socialNetworks = jbSetup.getSocial_Networks__c();
			
			if (null != socialNetworks){
				setIsFacebook_on_off(socialNetworks.toUpperCase().contains("FACEBOOK"));
				setIsLinkedIn_on_off(socialNetworks.toUpperCase().contains("LINKEDIN"));
				setIsGooglePlus_on_off(socialNetworks.toUpperCase().contains("GOOGLE PLUS"));
			}
			setGeneral_Registration(jbSetup.getGeneral_Registration__c());
			setTs2__Resume_Required(jbSetup.getTs2__Resume_Required__c());
			setIsTs2__HideCoverLetter__c(jbSetup.getTs2__HideCoverLetter__c());
			setMultimedia(jbSetup.getMultimedia__c());
			setTs2_Additional_Attachments_Required(jbSetup.getTs2_Additional_Attachments_Required__c());
			setIsTs2_Standard_Questions_Required__c(jbSetup.getTs2_Standard_Questions_Required__c());
			setIsTs2_Custom_Questions_Required__c(jbSetup.getTs2_Custom_Questions_Required__c());
			setIsTs2_Social_Questions_Required__c(jbSetup.getTs2_Social_Questions_Required__c());
			setIsTs2_Compliance_Required__c(jbSetup.getTs2_Compliance_Required__c());
			setIsTs2_FormsURL_Required__c(jbSetup.getTs2_FormsURL_Required__c());
		}
	}
	
	
	/**
	 * This method is called from register.xhtml and registerWithOAuth.xhtml
	 * to reset the registration process if needed.
	 * 
	 * @param method - can be SIMPLE or OAUTH
	 */
	
	public void checkRegistrationMethod(String method) {
		getUserProfile().setUpdate(false);
		
		if ((method.equals("SIMPLE") && !getIsSimpleRegistration()) ||
			(method.equals("OAUTH") && !getIsOAuthRegistration()))
		{
			try {
				registrationMethod = "SIMPLE";
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("/register.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	


	public CandidateService getCandidateService() {
		return candidateService;
	}

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}

	public ContactSOAPService getContactSOAPService() {
		return contactSOAPService;
	}

	public void setContactSOAPService(ContactSOAPService contactSOAPService) {
		this.contactSOAPService = contactSOAPService;
	}

	public String getRegistrationMethod() {
		return registrationMethod;
	}

	public void setRegistrationMethod(String registrationMethod) {
		this.registrationMethod = registrationMethod;
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public boolean isOAuth_on_off() {
		return OAuth_on_off;
	}

	public void setOAuth_on_off(boolean oAuth_on_off) {
		OAuth_on_off = oAuth_on_off;
	}

	
	public boolean isGeneral_Registration() {
		return General_Registration;
	}

	public void setGeneral_Registration(boolean general_Registration) {
		General_Registration = general_Registration;
	}

	public boolean isTs2__Resume_Required() {
		return Ts2__Resume_Required;
	}

	public void setTs2__Resume_Required(boolean ts2__Resume_Required) {
		Ts2__Resume_Required = ts2__Resume_Required;
	}

	public boolean isTs2_Additional_Attachments_Required() {
		return Ts2_Additional_Attachments_Required;
	}

	public void setTs2_Additional_Attachments_Required(
			boolean ts2_Additional_Attachments_Required) {
		Ts2_Additional_Attachments_Required = ts2_Additional_Attachments_Required;
	}

	public boolean isMultimedia() {
		return Multimedia;
	}

	public void setMultimedia(boolean multimedia) {
		Multimedia = multimedia;
	}

	public int getConfigMaxSizeOfAttachment() {
		return configMaxSizeOfAttachment;
	}

	public void setConfigMaxSizeOfAttachment(int configMaxSizeOfAttachment) {
		this.configMaxSizeOfAttachment = configMaxSizeOfAttachment;
	}

	public int getConfigMaxNumberOfAttachments() {
		return configMaxNumberOfAttachments;
	}

	public void setConfigMaxNumberOfAttachments(int configMaxNumberOfAttachments) {
		this.configMaxNumberOfAttachments = configMaxNumberOfAttachments;
	}

	public boolean getIsResumeUploded() {
		return isResumeUploded;
	}

	public void setIsResumeUploded(boolean isResumeUploded) {
		this.isResumeUploded = isResumeUploded;
	}

	public boolean getIsAdditionalAttachUploded() {
		return isAdditionalAttachUploded;
	}

	public void setIsAdditionalAttachUploded(boolean isAdditionalAttachUploded) {
		this.isAdditionalAttachUploded = isAdditionalAttachUploded;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public WorkflowController getWorkflowController() {
		return workflowController;
	}

	public void setWorkflowController(WorkflowController workflowController) {
		this.workflowController = workflowController;
	}

	public JobBoardPageController getPageController() {
		return pageController;
	}

	public void setPageController(JobBoardPageController pageController) {
		this.pageController = pageController;
	}

	public boolean getIsLinkedIn_on_off() {
		return LinkedIn_on_off;
	}

	public void setIsLinkedIn_on_off(boolean linkedIn_on_off) {
		LinkedIn_on_off = linkedIn_on_off;
	}

	public boolean getIsFacebook_on_off() {
		return Facebook_on_off;
	}

	public void setIsFacebook_on_off(boolean facebook_on_off) {
		Facebook_on_off = facebook_on_off;
	}

	public boolean getIsGooglePlus_on_off() {
		return GooglePlus_on_off;
	}

	public void setIsGooglePlus_on_off(boolean googlePlus_on_off) {
		GooglePlus_on_off = googlePlus_on_off;
	}

	public boolean getIsTs2__HideCoverLetter__c() {
		return Ts2__HideCoverLetter__c;
	}

	public void setIsTs2__HideCoverLetter__c(boolean ts2__HideCoverLetter__c) {
		Ts2__HideCoverLetter__c = ts2__HideCoverLetter__c;
	}

	public boolean getIsTs2_Standard_Questions_Required__c() {
		return Ts2_Standard_Questions_Required__c;
	}

	public void setIsTs2_Standard_Questions_Required__c(
			boolean ts2_Standard_Questions_Required__c) {
		Ts2_Standard_Questions_Required__c = ts2_Standard_Questions_Required__c;
	}

	public boolean getIsTs2_Custom_Questions_Required__c() {
		return Ts2_Custom_Questions_Required__c;
	}

	public void setIsTs2_Custom_Questions_Required__c(
			boolean ts2_Custom_Questions_Required__c) {
		Ts2_Custom_Questions_Required__c = ts2_Custom_Questions_Required__c;
	}

	public boolean getIsTs2_Social_Questions_Required__c() {
		return Ts2_Social_Questions_Required__c;
	}

	public void setIsTs2_Social_Questions_Required__c(
			boolean ts2_Social_Questions_Required__c) {
		Ts2_Social_Questions_Required__c = ts2_Social_Questions_Required__c;
	}

	public boolean getIsTs2_Compliance_Required__c() {
		return Ts2_Compliance_Required__c;
	}

	public void setIsTs2_Compliance_Required__c(boolean ts2_Compliance_Required__c) {
		Ts2_Compliance_Required__c = ts2_Compliance_Required__c;
	}

	public boolean getIsTs2_FormsURL_Required__c() {
		return Ts2_FormsURL_Required__c;
	}

	public void setIsTs2_FormsURL_Required__c(boolean ts2_FormsURL_Required__c) {
		Ts2_FormsURL_Required__c = ts2_FormsURL_Required__c;
	}

	@Override
	public void submit() {
		saveCandidate();		
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/index.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
