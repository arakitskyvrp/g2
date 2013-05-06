package com.jobboard.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.services.ApplicationSOAPService;
import com.sforce.soap.services.JobOrderSOAPService;

@ManagedBean(name = "applicationsController")
@SessionScoped
public class ApplicationsController {

	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{applicationSOAPService}")
	private ApplicationSOAPService applicationService;
	@ManagedProperty(value = "#{jobOrderSOAPService}")
	private JobOrderSOAPService jobOrderSOAPService;

	private boolean hasApplications;

	private List<Ts2__Application__c> applications = new ArrayList<Ts2__Application__c>();

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public List<Ts2__Application__c> getApplications() {
		List<Ts2__Application__c> applicationsByCandidateID = getApplicationService()
				.getApplicationsByCandidateID(
						getJobSearchController().getLoggedInUser()
								.getSF_Contact_ID());
		applications.clear();
		applications.addAll(applicationsByCandidateID);
		findAndSetJobsForApplications(applications);
		return applications;
	}
	
	public String parseDate(GregorianCalendar calendar){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		return sdf.format(calendar.getTime());
	}

	private void findAndSetJobsForApplications(
			List<Ts2__Application__c> applications) {
		for (Ts2__Application__c application : applications) {
			Ts2__Job__c foundJob = getJobOrderSOAPService().searchForElement(
					application.getTs2__Job__c());
			application.setTs2__Job__r(foundJob);
		}
	}

	public void setApplications(List<Ts2__Application__c> applications) {
		this.applications = applications;
	}

	public ApplicationSOAPService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationSOAPService applicationService) {
		this.applicationService = applicationService;
	}

	public boolean getHasApplications() {
		hasApplications = !getApplications().isEmpty();
		return hasApplications;
	}

	public void setHasApplications(boolean hasApplications) {
		this.hasApplications = hasApplications;
	}

	public JobOrderSOAPService getJobOrderSOAPService() {
		return jobOrderSOAPService;
	}

	public void setJobOrderSOAPService(JobOrderSOAPService jobOrderSOAPService) {
		this.jobOrderSOAPService = jobOrderSOAPService;
	}

}
