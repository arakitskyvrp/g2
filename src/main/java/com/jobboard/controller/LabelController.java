package com.jobboard.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.jobboard.model.heroku.service.BilingualSTFParser.LanguageTranslationWrapper;
import com.jobboard.model.heroku.service.CandidateService;
import com.jobboard.model.heroku.service.TranslationWorkbenchService;
import com.sforce.soap.enterprise.sobject.Language__c;
import com.sforce.soap.metadata.CustomLabelTranslation;
import com.sforce.soap.services.LanguageSOAPService;
import com.sforce.soap.services.SOAPConnectionService;

@ManagedBean(name = "label")
@SessionScoped
public class LabelController implements Serializable {

	private static final long serialVersionUID = 7133922014432124194L;

	private LanguageSOAPService languageSOAPService;
	private SelectItem[] availableLanguages = null;
	private Language__c selectedLanguage;
	@ManagedProperty(value = "#{translationWorkbenchService}")
	private TranslationWorkbenchService translationWorkbenchService;
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{candidateService}")
	private CandidateService candidateService;
	@ManagedProperty(value = "#{languageController}")
	private LanguageController languageController;
	private Map<String, String> labels = new HashMap<String, String>();

	protected String firstName = "ts2__FirstName";
	protected String lastName = "ts2__LastName";
	protected String email = "ts2__EmailAddress";
	protected String OAuthInfo = "Register with OAuth";
	protected String OAuthLoginInfo = "Login with OAuth";
	protected String loginInfo = "ts2__LoginInformation";
	protected String profileInfo = "Profile Information";
	protected String required = "ts2__Required";
	protected String password = "ts2__Password";
	protected String confirmPassword = "ts2__ConfirmPassword";
	protected String personalInfo = "ts2__PersonalInformation";
	protected String phone = "ts2__Phone";
	protected String mobile = "ts2__Mobile";
	protected String street = "ts2__Street";
	protected String city = "ts2__City";
	protected String country = "ts2__Country";
	protected String stateProvice = "ts2__StateProvince";
	protected String postalCode = "ts2__PostalCode";
	protected String contactMethod = "ts2__PreferredContactMethod";
	protected String candidateSource = "ts2__HowDidYouHearAboutUs";
	protected String continueRegistration = "ts2__Continue";
	protected String none = "ts2__OptionNone";
	protected String requiredMessage = "Error: You must enter a value";
	protected String passwordTooShortError = "Error: A password must contain at least eight characters.";
	protected String passwordAlphaNumeric = "Error: A password must contain at least one alphabetic character and one number.";
	protected String passwordUserInfo = "ts2__Password_Policy";
	protected String passwordNotMatch = "Error: Passwords don't match.";
	protected String invalidEmailAddress = "Error: Invalid Email Address.";
	protected String existingProfile = "ts2__ExistingUser";
	protected String registerWithFacebook = "Register with Facebook";
	protected String registerWithLinkedin = "Register with Linkedin";
	protected String registerWithGoogle = "Register with Google";
	protected String loginWithFacebook = "Login with Facebook";
	protected String loginWithLinkedin = "Login with Linkedin";
	protected String loginWithGoogle = "Login with Google";
	protected String uploadYourResume = "Upload your resume";
	protected String browseFile = "Select file";
	protected String resumeUploaded = "Your resume was successfully uploaded";
	protected String uploadYourAdditional = "Upload your additional file";
	protected String additionalUploaded = "Your additional file was successfully uploaded";
	protected String login = "ts2__Login";
	protected String userNamePasswordNotMatch = "User name and password don't match";
	protected String message = "Message";
	protected String update = "Update";
	protected String appSubmitSuccess = "ts2__AppSubmitSuccess";
	protected String returnToJobSearch = "ts2__ReturnToJobSearch";
	protected String searchByKeyword = "ts2__SearchByKeyword";
	protected String jobsFound = "ts2__JobsFound";
	protected String searchOpenings = "ts2__SearchOpenings";
	protected String searchResults = "ts2__SearchResults";
	protected String register = "ts2__Register";
	protected String seeYourJobApplications = "ts2__SeeYourJobApplications";
	protected String seeYourReferrals = "ts2__SeeYourReferrals";
	protected String yourJobSearchAgents = "ts2__YourJobSearchAgents";
	protected String updateYourInfo = "ts2__UpdateYourInfo";
	protected String updateYourResume = "ts2__UpdateYourResume";
	protected String logOut = "ts2__LogOut";
	protected String profileUpdated = "Profile has been updated.";
	protected String alreadyApplied = "ts2__AlreadyApplied";
	protected String search = "ts2__Search";
	protected String saveAsAgent = "ts2__SaveAsAgent";
	protected String oAuthLoginWithFacebook = "Please login with your Facebook account";
	protected String oAuthLoginWithLinkedin = "Please login with your Linkedin account";
	protected String oAuthLoginWithGoogle = "Please login with your Google account";
	protected String oAuthLoginWithUsernamePassword = "Please login with your user name and password";

	private Language__c defaultLanguage;

	public String getUploadYourAdditional() {
		return translate(uploadYourAdditional);
	}
	
	public String getSaveAsAgent(){
		return translate(saveAsAgent);
	}

	public String getSearch() {
		return translate(search);
	}

	public String getAlreadyApplied() {
		return translate(alreadyApplied);
	}

	public String getLogOut() {
		return translate(logOut);
	}

	public String getUpdateYourResume() {
		return translate(updateYourResume);
	}

	public String getUpdateYourInfo() {
		return translate(updateYourInfo);
	}

	public String getYourJobSearchAgents() {
		return translate(yourJobSearchAgents);
	}

	public String getSeeYourReferrals() {
		return translate(seeYourReferrals);
	}

	public String getSeeYourJobApplications() {
		return translate(seeYourJobApplications);
	}

	public String getRegister() {
		return translate(register);
	}

	public String getSearchOpenings() {
		return translate(searchOpenings);
	}

	public String getSearchResults() {
		return translate(searchResults);
	}

	public String getJobsFound() {
		return translate(jobsFound);
	}

	public String getSearchByKeyword() {
		return translate(searchByKeyword);
	}

	public String getAdditionalUploaded() {
		return translate(additionalUploaded);
	}

	public String getResumeUploaded() {
		return translate(resumeUploaded);
	}

	public String getRegisterWithGoogle() {
		return translate(registerWithGoogle);
	}

	public String getRegisterWithLinkedin() {
		return translate(registerWithLinkedin);
	}

	public String getRegisterWithFacebook() {
		return translate(registerWithFacebook);
	}

	public String getOAuthInfo() {
		return translate(OAuthInfo);
	}

	public String getExistingProfile() {
		return translate(existingProfile);
	}

	public String getPasswordNotMatch() {
		return translate(passwordNotMatch);
	}

	public String getInvalidEmailAddress() {
		return translate(invalidEmailAddress);
	}

	public String getPasswordAlphaNumeric() {
		return translate(passwordAlphaNumeric);
	}

	public String getPasswordTooShortError() {
		return translate(passwordTooShortError);
	}

	public String getRequiredMessage() {
		return translate(requiredMessage);
	}

	public String getNone() {
		return translate(none);
	}

	public String getPhone() {
		return translate(phone);
	}

	public String getPersonalInfo() {
		return translate(personalInfo);
	}

	public String getContinueRegistration() {
		return translate(continueRegistration);
	}

	public String getCandidateSource() {
		return translate(candidateSource);
	}

	public String getContactMethod() {
		return translate(contactMethod);
	}

	public String getPostalCode() {
		return translate(postalCode);
	}

	public String getStateProvice() {
		return translate(stateProvice);
	}

	public String getCountry() {
		return translate(country);
	}

	public String getCity() {
		return translate(city);
	}

	public String getMobile() {
		return translate(mobile);
	}

	public String getStreet() {
		return translate(street);
	}

	public String getConfirmPassword() {
		return translate(confirmPassword);
	}

	public String getPassword() {
		return translate(password);
	}

	public String getRequired() {
		return translate(required);
	}

	public String getLoginInfo() {
		return translate(loginInfo);
	}

	public String getEmail() {
		return translate(email);
	}

	private String translate(String key) {
		if (labels.containsKey(key)) {
			return labels.get(key);
		}
		return key;
	}

	public String getFirstName() {
		return translate(firstName);
	}

	public String getLastName() {
		return translate(lastName);
	}

	public String getUploadYourResume() {
		return translate(uploadYourResume);
	}

	public String getBrowseFile() {
		return translate(browseFile);
	}

	public String getLogin() {
		return translate(login);
	}

	public String getUserNamePasswordNotMatch() {
		return translate(userNamePasswordNotMatch);
	}

	public String getLoginWithFacebook() {
		return translate(loginWithFacebook);
	}

	public String getLoginWithLinkedin() {
		return translate(loginWithLinkedin);
	}

	public String getLoginWithGoogle() {
		return translate(loginWithGoogle);
	}

	public String getOAuthLoginInfo() {
		return translate(OAuthLoginInfo);
	}

	public String getMessage() {
		return translate(message);
	}

	public String getPasswordUserInfo() {
		return translate(passwordUserInfo);
	}

	public String getProfileInfo() {
		return translate(profileInfo);
	}

	public String getUpdate() {
		return translate(update);
	}

	public LanguageSOAPService getLanguageSOAPService() {
		if (languageSOAPService == null) {
			languageSOAPService = new LanguageSOAPService();
			languageSOAPService
					.setConnectionService(new SOAPConnectionService());
		}
		return languageSOAPService;
	}

	public void setLanguageSOAPService(LanguageSOAPService languageSOAPService) {
		this.languageSOAPService = languageSOAPService;
	}

	public Language__c getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(Language__c selectedLanguage) {
		if (this.selectedLanguage != null
				&& selectedLanguage != null
				&& this.selectedLanguage.getId().equals(
						selectedLanguage.getId())) {
			// if the selection is the previous selected language do not fire
			// language change events
			return;
		}
		this.selectedLanguage = selectedLanguage;
		if (selectedLanguage != null) {
			loadLabels(selectedLanguage.getLanguage_Description__c());
			if (getJobSearchController().getLoggedInUser() != null) {
				getJobSearchController().getLoggedInUser().setLanguage(
						selectedLanguage.getId());
				getJobSearchController().getLoggedInUser().setLocale(
						selectedLanguage.getLanguage_Description__c());
				getCandidateService().update(
						getJobSearchController().getLoggedInUser());
			}
			reloadPage();
		}

	}

	private void reloadPage() {
		FacesContext fc = FacesContext.getCurrentInstance();
		String refreshpage = fc.getViewRoot().getViewId();
		System.out.println("to be refreshed: " + refreshpage);
		try {
			fc.getExternalContext().redirect(refreshpage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadLabels(String language) {
		if (language != null) {
			System.out.println("Language>" + language + "<");
			language = language.trim();
			labels.clear();
			if (getTranslationWorkbenchService() != null) {
				LanguageTranslationWrapper translationWrapper = getTranslationWorkbenchService()
						.getTranslation(language);
				getLanguageController().fireLanguageChangeEvent(
						translationWrapper);
				CustomLabelTranslation[] customLabelTranslations = translationWrapper
						.getTranslations().getCustomLabels();
				if (customLabelTranslations != null) {
					for (CustomLabelTranslation customLabelTranslation : customLabelTranslations) {
						if (customLabelTranslation.getLabel() != null
								&& customLabelTranslation.getName() != null) {
							labels.put(customLabelTranslation.getName(),
									customLabelTranslation.getLabel());
						} else {
							System.out.println("Error in label>"
									+ customLabelTranslation);
						}
					}
				}
			} else {
				System.out.println("TRANSlATION WORKBENCH IS NULL");
			}
		}
	}

	public SelectItem[] getAvailableLanguages() {
		if (availableLanguages == null) {
			List<SelectItem> items = new ArrayList<SelectItem>();
			List<Language__c> languages = getLanguageSOAPService()
					.listElements();
			for (Language__c language__c : languages) {
				if (getJobSearchController().getLoggedInUser() != null
						&& getJobSearchController().getLoggedInUser()
								.getLanguage() != null
						&& getJobSearchController().getLoggedInUser()
								.getLanguage().equals(language__c.getId())) {
					setSelectedLanguage(language__c);
				}
				if (language__c.getLanguage_Description__c().equals("en_US")) {
					defaultLanguage = language__c;
					items.add(new SelectItem(language__c, language__c.getName()
							+ "(Default)"));
					continue;
				}
				items.add(new SelectItem(language__c, language__c.getName()));
			}
			availableLanguages = items.toArray(new SelectItem[items.size()]);
			if (getSelectedLanguage() == null && getDefaultLanguage() != null) {
				setSelectedLanguage(getDefaultLanguage());
			}
		}
		return availableLanguages;
	}

	public void setAvailableLanguages(SelectItem[] availableLanguages) {
		this.availableLanguages = availableLanguages;
	}

	public TranslationWorkbenchService getTranslationWorkbenchService() {
		return translationWorkbenchService;
	}

	public void setTranslationWorkbenchService(
			TranslationWorkbenchService translationWorkbenchService) {
		this.translationWorkbenchService = translationWorkbenchService;
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public CandidateService getCandidateService() {
		return candidateService;
	}

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}

	public Language__c getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(Language__c defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public String getAppSubmitSuccess() {
		return translate(appSubmitSuccess);
	}

	public boolean getShowConfirmationMessage() {
		return getJobSearchController().getJBSetup()
				.getTs2__ConfirmationMessage__c() != null
				&& !getJobSearchController().getJBSetup()
						.getTs2__ConfirmationMessage__c().isEmpty();
	}

	public String getConfirmationMessage() {
		return getJobSearchController().getJBSetup()
				.getTs2__ConfirmationMessage__c();
	}

	public String getReturnToJobSearch() {
		return translate(returnToJobSearch);
	}

	public LanguageController getLanguageController() {
		return languageController;
	}

	public void setLanguageController(LanguageController languageController) {
		this.languageController = languageController;
	}

	public String getProfileUpdated() {
		return translate(profileUpdated);
	}

	public String getoAuthLoginWithFacebook() {
		return translate(oAuthLoginWithFacebook);
	}

	public String getoAuthLoginWithLinkedin() {
		return translate(oAuthLoginWithLinkedin);
	}

	public String getoAuthLoginWithGoogle() {
		return translate(oAuthLoginWithGoogle);
	}

	public String getoAuthLoginWithUsernamePassword() {
		return translate(oAuthLoginWithUsernamePassword);
	}

}
