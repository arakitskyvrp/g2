package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.jobboard.model.UserProfile;
import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.service.CandidateService;

@ManagedBean(name = "loginCT")
@SessionScoped
public class LoginController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5949964403014480085L;
	
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{candidateService}")
	private CandidateService candidateService;
	
	
	protected String email;
	protected String password;
	protected String redirect;
	protected String errorMsg;

	public void login() {
		Candidate candidate = getCandidateService().findCandidateByEmailService(email);
		
		if (null != candidate){
			// is this account created with username and password?
			if (matchOAuthLoginMethod(candidate, "SIMPLE")) {
				// does password match?
				// password is md5+random nonce hashed, this is more secure because of sql injection attact			
				if (null != candidate.getPassword() && candidate.getPassword().equals(UserProfile.MD5(password)))
				{
					getJobSearchController().setIsUserLoggedIn(true);
					getJobSearchController().setLoggedInUser(candidate);
					// redirect to hidden page
					try {
						
						if (null != redirect)
						{
							String copyRedirect = redirect;
							setRedirect(null);
							FacesContext.getCurrentInstance().getExternalContext()
							.redirect(copyRedirect);					
						}
						else
						{
							FacesContext.getCurrentInstance().getExternalContext()
							.redirect("index.xhtml");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}			
				}
				else {
					// display user not found message
					LabelController lblController = new LabelController();
					FacesContext.getCurrentInstance().addMessage("atsForm",
							new FacesMessage(lblController.getUserNamePasswordNotMatch()));
				}
			}
		}
	}
	
	public void logout() {
		getJobSearchController().setIsUserLoggedIn(false);
		getJobSearchController().setLoggedInUser(null);
		// redirect to index page
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}
	
	public void checkIfUserisLoggedIn(){
		// if the user is not logged in redirect to index
		if (!getJobSearchController().isUserLoggedIn){
			try {
				FacesContext.getCurrentInstance().getExternalContext()
				.redirect("login.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}						
		}
	}

	public void checkIfUserisLoggedIn(String redirect){
		// if the user is not logged in redirect to index
		if (!getJobSearchController().isUserLoggedIn){
			try {
				this.redirect = redirect;
				FacesContext.getCurrentInstance().getExternalContext()
				.redirect("login.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}						
		}
	}
	
	/**
	 * Verify that the user is trying to log in with the method of account creation
	 * 
	 * @param candidate - user who is trying to log in
	 * @param OAuthService - string representation of the method of login
	 * @return true if the method of login is the same with the method of creation
	 */
	public boolean matchOAuthLoginMethod(Candidate candidate, String OAuthService) {
		if (!candidate.getExternal_Auth_ID().equals(OAuthService)) {
			// the candidate should be informed that this method of login is not correct
			// setting message with FacesContext fails here, because currentInstance is null
			
			LabelController lblController = new LabelController();
			if (candidate.getExternal_Auth_ID().equals("SIMPLE"))
				setErrorMsg(lblController.getoAuthLoginWithUsernamePassword());
			if (candidate.getExternal_Auth_ID().equals("FACEBOOK"))
				setErrorMsg(lblController.getoAuthLoginWithFacebook());
			if (candidate.getExternal_Auth_ID().equals("LINKEDIN"))
				setErrorMsg(lblController.getoAuthLoginWithLinkedin());
			if (candidate.getExternal_Auth_ID().equals("GOOGLE-PLUS"))
				setErrorMsg(lblController.getoAuthLoginWithGoogle());

			return false;
		}
		
		return true;
	}
	
	public String checkIfUserExists(String email, String OAuthService){
		
		Candidate candidate = getCandidateService().findCandidateByEmailService(email);
		if (null != candidate){
			// is candidate is trying to login with the oauth registration method?
			if (matchOAuthLoginMethod(candidate, OAuthService)) {
				// yes, log in the user
				getJobSearchController().setIsUserLoggedIn(true);
				getJobSearchController().setLoggedInUser(candidate);
				setEmail(candidate.getEmail());
				// redirect to hidden page
				if (null != redirect)
				{
					String copyRedirect = redirect;
					setRedirect(null);
					return "redirect:/" + copyRedirect;
				}
				else
					return "redirect:/index.xhtml";
			}
			else {
				return "redirect:/login.xhtml";
				
			}
		}
		
		return null;		
	}
	
	/**
	 * This method is called by the command button to log in the user
	 * account with Facebook
	 */
	public void loginWithFacebook() {
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-facebook/");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is called by the command button to log in the user
	 * account with Linkedin
	 */
	public void loginWithLinkedin() {
		
		try {			
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-linkedin/");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is called by the command button to log in the user
	 * account with Google
	 */
	public void loginWithGoogle() {
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/people/login-google-plus/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CandidateService getCandidateService() {
		return candidateService;
	}

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getErrorMsg() {
		// the error message is displayed one time only
		String copyErrorMsg = errorMsg;
		setErrorMsg(null);
		return copyErrorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
