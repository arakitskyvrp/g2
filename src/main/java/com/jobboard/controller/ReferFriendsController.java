package com.jobboard.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.Referral;
import com.jobboard.model.heroku.service.ReferralService;
import com.sforce.soap.enterprise.sobject.Ts2__Referral__c;
import com.sforce.soap.services.ReferralSOAPService;

@ManagedBean(name="referFriends")
@SessionScoped
public class ReferFriendsController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7855500981992491952L;

	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{referralService}")
	private ReferralService referralService;
	@ManagedProperty(value = "#{referralSOAPService}")
	private ReferralSOAPService referralSOAPService;
	
	
	protected String email;
	protected String firstName;
	protected String lastName;
	protected String reason;
	    
    private boolean isValidationErrors()
    {
		if (!FacesContext.getCurrentInstance().getMessageList().isEmpty())
		{
			RequestContext.getCurrentInstance().addCallbackParam("validationFailed", true);
			return true;
		}
		else
		{
			RequestContext.getCurrentInstance().addCallbackParam("validationFailed", false);
			return false;
		}    	
    }
	
	public void save(String jobId){
		validateEmail();
		
		if (!isValidationErrors())
		{
			Candidate referrer = getJobSearchController().getLoggedInUser();
			
			Ts2__Referral__c sfReferral = new  Ts2__Referral__c();
			sfReferral.setTs2__job_order_id__c(jobId);
			sfReferral.setTs2__p_first_name__c(firstName);
			sfReferral.setTs2__p_last_name__c(lastName);
			sfReferral.setTs2__p_email__c(email);
			sfReferral.setTs2__message_body__c(reason);
			sfReferral.setTs2__r_contact_lookup__c(referrer.getSF_Contact_ID());
			sfReferral.setTs2__r_email__c(referrer.getEmail());
			
			sfReferral = getReferralSOAPService().saveToDatabase(sfReferral);
			// if referral object was created successfully in salesforce 
			if (null != sfReferral)
			{
				Referral referral = new Referral();
				referral.setSF_Contact_ID(referrer.getSF_Contact_ID());
				referral.setReferral_ID(sfReferral.getId());
				referral.setSF_Job_ID(jobId);
				referral.setEmail(email);
				referral.setFirst_Name(firstName);
				referral.setLast_Name(lastName);
				referral.setReason(reason);
				referral.setCreated_Date(new Date());
				
				referralService.saveToDatabase(referral);
				// clear values after save
				setEmail(null);
				setFirstName(null);
				setLastName(null);
				setReason(null);
			}
			
		}
    }

	private void validateEmail() {
		String message = "";
		LabelController lblController = new LabelController();
		String emailRegex = "([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})";
		Pattern MyPattern = Pattern.compile(emailRegex);
		Matcher MyMatcher = MyPattern.matcher(email);
		boolean isValid = MyMatcher.matches();
		if (!isValid) {
			message = lblController.getInvalidEmailAddress();			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, ""));
		}
	}
	
	public List<Referral> getReferrals(){
		String SF_Contact_Id = getJobSearchController().getLoggedInUser().getSF_Contact_ID();
		return getReferralService().getReferrals(SF_Contact_Id);
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public ReferralService getReferralService() {
		return referralService;
	}

	public void setReferralService(ReferralService referralService) {
		this.referralService = referralService;
	}

	public ReferralSOAPService getReferralSOAPService() {
		return referralSOAPService;
	}

	public void setReferralSOAPService(ReferralSOAPService referralSOAPService) {
		this.referralSOAPService = referralSOAPService;
	}
	
}
