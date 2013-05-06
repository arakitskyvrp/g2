package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.jobboard.controller.JobSearchController.ColumnModel;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.services.ApplicationSOAPService;
import com.sforce.soap.services.JobOrderSOAPService;
import com.sforce.soap.services.SOAPConnectionService;

@ManagedBean(name = "jorderDetail")
@SessionScoped
public class JobOrderDetailControler implements
		Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4005006957162750068L;
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	private Ts2__Job__c jobOrder;
	private String param;
	private Boolean ws;
	private boolean testLogin = false;

	private String error;

	@SuppressWarnings("unused")
	private String jDescription;
	@SuppressWarnings("unused")
	private String jId;
	@SuppressWarnings("unused")
	private String jTitle;
	@SuppressWarnings("unused")
	private String jTitleT;
	@SuppressWarnings("unused")
	private String jFunction;
	@SuppressWarnings("unused")
	private String jFunctionT;
	@SuppressWarnings("unused")
	private String jDepartment;
	@SuppressWarnings("unused")
	private String jDepartmentT;
	@SuppressWarnings("unused")
	private String jLocation;
	@SuppressWarnings("unused")
	private String jLocationT;
	@SuppressWarnings("unused")
	private String jEmail;
	@SuppressWarnings("unused")
	private String jEmailT;

	private List<ColumnModel> descriptionColumns;

	private boolean hasNotAppliedYet;
	@ManagedProperty(value = "#{applicationSOAPService}")
	private ApplicationSOAPService applicationService;
	@ManagedProperty(value = "#{jobOrderSOAPService}")
	private JobOrderSOAPService jobOrderSOAPService;
	
	public void setRequestParam(){

			FacesContext facesContext = FacesContext.getCurrentInstance();
			String passedParameter = (String) facesContext.getExternalContext()
					.getRequestParameterMap().get("Id");

			boolean redirect = false;
			if (null != passedParameter && !(passedParameter.isEmpty())) {
	
				setParam(passedParameter);

				Ts2__Job__c help = (Ts2__Job__c) getJobOrderSOAPService().searchForElement(passedParameter);
				if (help != null) {
					this.jobOrder = help;
					ws = true;
				} else {
					ws = false;
				}
				//System.out.println("[JobOrderDetailControler] help = " + help);
				// if (jobOrder.getTs2__Job_Description__c() == null)
				if (null != jobOrder)
					jDescription = jobOrder.getTs2__Job_Description__c();
				else
					redirect = true;

			}
			else {
				redirect = true;
			}
			if (redirect) {
				// if we get null passed parameter redirect to index if redirectTo is null
				// otherwise redirect to redirectTo
				try {
					facesContext.getExternalContext().redirect("/index.xhtml");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// setTestLogin(getJobSearchController().getIsUserLoggedIn());
		}

	public Ts2__Job__c getJobOrder() {
		return jobOrder;
	}

	public void setJobOrder(Ts2__Job__c jobOrder) {
		this.jobOrder = jobOrder;
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String outcome = "jobOrderDetal.xhtml?Id=" + jobOrder.getId(); 
		
		try {
			facesContext.getExternalContext().redirect(outcome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getLabelFromName(String name) {
		String label = JobReflection.getFieldByName(name).getLabel();
		if (label == null) {
			label = name;
		}
		return label;
	}

	private void initDescriptionColumns() {
		String jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription1__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription2__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription3__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription4__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription5__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription6__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription7__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription8__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription9__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
		jobDescription = getJobSearchController().getJBSetup()
				.getTs2__JobDescription10__c();
		if (jobDescription != null) {
			getDescriptionColumns().add(
					new ColumnModel(jobDescription, jobDescription));
		}
	}

	public List<ColumnModel> getDescriptionColumns() {
		if (descriptionColumns == null) {
			descriptionColumns = new ArrayList<JobSearchController.ColumnModel>();
			initDescriptionColumns();
		}
		return descriptionColumns;
	}

	public void setDescriptionColumns(List<ColumnModel> descriptionColumns) {
		this.descriptionColumns = descriptionColumns;
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public String getjFunction() {
		return jobOrder.getTs2__Job_Function__c();
	}

	public void setjFunction(String jFunction) {
		this.jFunction = jFunction;
	}

	public String getjFunctionT() {
		return "Job Function:";
	}

	public void setjFunctionT(String jFunctionT) {
		this.jFunctionT = jFunctionT;
	}

	public String getjTitle() {
		return jobOrder.getTs2__Localized_Job_Title__c();
	}

	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}

	public String getjDepartment() {
		return jobOrder.getTs2__Department__c();
	}

	public void setjDepartment(String jDepartment) {
		this.jDepartment = jDepartment;
	}

	public String getjLocation() {
		return jobOrder.getTs2__Location__c();
	}

	public void setjLocation(String jLocation) {
		this.jLocation = jLocation;
	}

	public String getjEmail() {
		return jobOrder.getTs2__Contact_Email__c();
	}

	public void setjEmail(String jEmail) {
		this.jEmail = jEmail;
	}

	public String getjTitleT() {
		return "Job Title:";
	}

	public void setjTitleT(String jTitleT) {
		this.jTitleT = jTitleT;
	}

	public String getjDepartmentT() {
		return "Department:";
	}

	public void setjDepartmentT(String jDepartmentT) {
		this.jDepartmentT = jDepartmentT;
	}

	public String getjLocationT() {
		return "Location:";
	}

	public void setjLocationT(String jLocationT) {
		this.jLocationT = jLocationT;
	}

	public String getjEmailT() {
		return "Contact Email:";
	}

	public void setjEmailT(String jEmailT) {
		this.jEmailT = jEmailT;
	}

	public String getjId() {
		return jobOrder.getId();
	}

	public void setjId(String jId) {
		this.jId = jId;
	}

	public String getjDescription() {
		// if (jobOrder.getTs2__Job_Description__c() == null)
		// return "";
		//
		// return jobOrder.getTs2__Job_Description__c();
		return jDescription;
	}

	public void setjDescription(String jDescription) {
		this.jDescription = jDescription;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public Boolean getWs() {
		return ws;
	}

	public void setWs(Boolean ws) {
		this.ws = ws;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isTestLogin() {
		return testLogin;
	}

	public void setTestLogin(boolean testLogin) {
		this.testLogin = testLogin;
	}

	public boolean getHasNotAppliedYet() {
		hasNotAppliedYet = !getApplicationService().isApplicationAlredySent(
				getJobSearchController().getLoggedInUser().getSF_Contact_ID(),
				getJobOrder().getId());
		return hasNotAppliedYet;
	}

	public void setHasNotAppliedYet(boolean hasNotAppliedYet) {
		this.hasNotAppliedYet = hasNotAppliedYet;
	}

	public ApplicationSOAPService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationSOAPService applicationService) {
		this.applicationService = applicationService;
	}

	public JobOrderSOAPService getJobOrderSOAPService() {
		return jobOrderSOAPService;
	}

	public void setJobOrderSOAPService(JobOrderSOAPService jobOrderSOAPService) {
		this.jobOrderSOAPService = jobOrderSOAPService;
	}

}
