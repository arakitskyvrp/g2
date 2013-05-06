package com.jobboard.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.services.ContactSOAPService;

@ManagedBean(name="menu")
@SessionScoped
public class MenuController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2693506155036119230L;
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	
	@ManagedProperty(value = "#{contactSOAPService}")
	private ContactSOAPService contactSOAPService;
	
	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}
	
	public boolean getIsUserLoggedIn() {
		return getJobSearchController().getIsUserLoggedIn();
	}

	public void setIsUserLoggedIn(boolean isUserLoggedIn) {
		getJobSearchController().setIsUserLoggedIn(isUserLoggedIn);
	}
	
	public String getLoggedInUserName() {
		return getContactSOAPService().getNameByID(
				getJobSearchController().getLoggedInUser().getSF_Contact_ID());
	}

	public ContactSOAPService getContactSOAPService() {
		return contactSOAPService;
	}

	public void setContactSOAPService(ContactSOAPService contactSOAPService) {
		this.contactSOAPService = contactSOAPService;
	}

}
