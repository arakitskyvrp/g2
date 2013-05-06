package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.jobboard.controller.WorkflowController.STEP;
import com.jobboard.model.heroku.Candidate;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.services.ApplicationSOAPService;

@ManagedBean(name = "applicationController")
@SessionScoped
public class JobApplicationController implements Serializable, Submitable {

	@ManagedProperty(value = "#{workflowController}")
	private WorkflowController workflowController;
	@ManagedProperty(value = "#{applicationSOAPService}")
	private ApplicationSOAPService applicationService;
	@ManagedProperty(value = "#{jorderDetail}")
	private JobOrderDetailControler jobOrderDetailControler;
	private STEP[] steps;

	/**
	 * 
	 */
	private static final long serialVersionUID = 8005888784815453647L;

	public JobApplicationController() {
	}

	public void init() {
		workflowController.init();
		workflowController.setSubmitable(this);
		workflowController.setSteps(getSteps());
		workflowController.continueApplication();
	}

	@Override
	public void submit() {
		System.out.println(">>>>APPLICATION SUBMIT");
		Ts2__Application__c application = new Ts2__Application__c();
		Candidate loggedInUser = getWorkflowController()
				.getJobSearchController().getLoggedInUser();
		Ts2__Job__c jobOrder = getJobOrderDetailControler().getJobOrder();
		
		application.setTs2__Job__c(jobOrder.getId());
		application.setTs2__Candidate_Contact__c(loggedInUser
				.getSF_Contact_ID());
		application.setTs2__Cover_Letter__c(getWorkflowController().getCoverLetter());
		

		SaveResult saveApplicationToSalesforce = getApplicationService()
				.saveApplicationToSalesforce(application);
		System.out.println(saveApplicationToSalesforce);
		
		
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/thankYouApplication.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public WorkflowController getWorkflowController() {
		return workflowController;
	}

	public void setWorkflowController(WorkflowController workflowController) {
		this.workflowController = workflowController;
	}

	public STEP[] getSteps() {
		if (steps == null) {
			steps = new STEP[6];
			steps[0] = STEP.STANDARD_QUESTIONS;
			steps[1] = STEP.UPLOAD_RESUME;
			steps[2] = STEP.ADDITIONAL_ATTACHMENTS;
			steps[3] = STEP.SOCIAL_QUESTIONS;
			steps[4] = STEP.COVER_LETTER;
			steps[5] = STEP.CUSTOM_QUESTIONS;
		}
		return steps;
	}

	public void setSteps(STEP[] steps) {
		this.steps = steps;
	}

	public ApplicationSOAPService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationSOAPService applicationService) {
		this.applicationService = applicationService;
	}

	public JobOrderDetailControler getJobOrderDetailControler() {
		return jobOrderDetailControler;
	}

	public void setJobOrderDetailControler(JobOrderDetailControler jobOrderDetailControler) {
		this.jobOrderDetailControler = jobOrderDetailControler;
	}

}
