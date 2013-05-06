package com.jobboard.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import com.jobboard.controller.Config;
import com.jobboard.controller.LabelController;
import com.sforce.soap.services.CandidateSourceSOAPService;
import com.sforce.soap.services.ContactSOAPService;

@ManagedBean(name="userProfile")
@SessionScoped
public class UserProfile {
	
	@ManagedProperty(value = "#{candidateSourceSOAPService}")
	private CandidateSourceSOAPService candidateSourceSOAPService;
	@ManagedProperty(value = "#{contactSOAPService}")
	private ContactSOAPService contactSOAPService;
	
	// Registration form fields
	protected String email;
	protected String password;
	protected String confirmPassword;
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String mobile;
	protected String street;
	protected String city;
	protected Map<String, String> countriesMap = Config.COUNTRIES;
	protected Map<String, String> statesMap = Config.STATES;
	protected Map<String, String> provincesMap = Config.PROVINCES;
	protected String countrySelect;
	protected String stateSelect;
	protected String provinceSelect;
	protected String stateProvinceInputField;
	protected String postalCode;
	protected Map<String, String> contactMethodMap = Config.CONTACT_METHOD;
	protected Map<String, String> candidateSourceMap;
	protected String contactMethod = contactMethodMap.get("Phone");
	protected String candidateSource;
	
	private boolean isUpdate = false;
	
	
	public void validateEmail(FacesContext context, UIComponent toValidate,
			Object value) {

		String message = "";
		String email = (String) value;
		LabelController lblController = new LabelController();
		String emailRegex = "([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})";
		Pattern MyPattern = Pattern.compile(emailRegex);
		Matcher MyMatcher = MyPattern.matcher(email);
		boolean isValid = MyMatcher.matches();
		if (!isValid) {
			((UIInput) toValidate).setValid(false);
			message = lblController.getInvalidEmailAddress();
			context.addMessage(toValidate.getClientId(context),
					new FacesMessage(message));
			return;
		}
		
		// If Contact with given email exists raise Existing profile error
		if (getContactSOAPService().checkEmail(email) && !isUpdate) {
			((UIInput) toValidate).setValid(false);
			context.addMessage("atsForm",
					new FacesMessage(lblController.getExistingProfile()));
			return;
		}
	}

	public void validatePassword(FacesContext context, UIComponent toValidate,
			Object value) {
		String message = "";
		String password = (String) value;
		LabelController lblController = new LabelController();
		// password must be greater than 8 characters
		if (password.length() < 8) {
			((UIInput) toValidate).setValid(false);
			message = lblController.getPasswordTooShortError();
			context.addMessage(toValidate.getClientId(context),
					new FacesMessage(message));
			return;
		}

		Pattern alpha = Pattern.compile("[a-zA-Z]+");
		Matcher alphaMatcher = alpha.matcher(password);
		Pattern num = Pattern.compile("[0-9]+");
		Matcher numMatcher = num.matcher(password);
		boolean isValid = alphaMatcher.find() && numMatcher.find();
		// password must contain alpha numeric characters
		if (!isValid) {
			((UIInput) toValidate).setValid(false);
			message = lblController.getPasswordAlphaNumeric();
			context.addMessage(toValidate.getClientId(context),
					new FacesMessage(message));
			return;
		}

	}
	
	public void validateConfirmPassword(FacesContext context,
			UIComponent toValidate, Object value) {
		String message = "";
		String confirmPassword = (String) value;
		UIInput passwordObj = (UIInput) context.getViewRoot().findComponent(
				"atsForm:password");
		UIInput confirmPasswordObj = (UIInput) toValidate;
		String password = (String) passwordObj.getValue();

		LabelController lblController = new LabelController();
		if (!confirmPassword.equals(password)) {
			((UIInput) toValidate).setValid(false);
			message = lblController.getPasswordNotMatch();
			context.addMessage(toValidate.getClientId(context),
					new FacesMessage(message));
			// clear passwords values if don't match
			passwordObj.setValue(null);
			confirmPasswordObj.setSubmittedValue(null);
			return;
		}
	}
	
	
	/**
	 * This method is used in register.xhtml to indicate if the state select list
	 * is a required user input. 
	 * @return true if user has mailing country USA
	 */

	public boolean getRequiredStateSelectList() {
		UIInput countrySelectListObj = (UIInput) FacesContext
				.getCurrentInstance().getViewRoot()
				.findComponent("atsForm:countrySelectList");
		String countrySelect = (String) countrySelectListObj.getValue();

		if ("US".equals(countrySelect)) {
			return true;
		}
		return false;
	}

	/**
	 * This method is used in register.xhtml to indicate if the province select list
	 * is a required user input. 
	 * @return true if user has mailing country Canada
	 */
	
	public boolean getRequiredProvinceSelectList() {
		UIInput countrySelectListObj = (UIInput) FacesContext
				.getCurrentInstance().getViewRoot()
				.findComponent("atsForm:countrySelectList");
		String countrySelect = (String) countrySelectListObj.getValue();

		if ("CA".equals(countrySelect)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Factory method for hashed password from user input. Is used as double hashing md5(md5(password))
	 * 
	 * @return md-5 hashed string
	 */
	
	public static String MD5(String input) {
		String inputString = new StringBuilder().append(input).append(Config.NONCE).toString();		
        byte[] inputBytes = {};
        java.security.MessageDigest MD5 = null;
        try {
            inputBytes = inputString.toString().getBytes("UTF-8");
            MD5 = java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e) {
        } catch (UnsupportedEncodingException e) {
        }
        byte[] digestBytes = MD5.digest(inputBytes);

        // Generate a 32-char hex string from the bytes. Each byte must be
        // represented by a 2-char string. For bytes whose value is less than
        // 0x10, pad string with a leading "0", e.g. "09" instead of "9"
        StringBuilder result = new StringBuilder();
        for (byte b : digestBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                result.append("0");
            }
            result.append(hex);
        }
        return result.toString();
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountrySelect() {
		return countrySelect;
	}
	public void setCountrySelect(String countrySelect) {
		this.countrySelect = countrySelect;
	}
	public String getStateSelect() {
		return stateSelect;
	}
	public void setStateSelect(String stateSelect) {
		this.stateSelect = stateSelect;
	}
	public String getProvinceSelect() {
		return provinceSelect;
	}
	public void setProvinceSelect(String provinceSelect) {
		this.provinceSelect = provinceSelect;
	}
	public String getStateProvinceInputField() {
		return stateProvinceInputField;
	}
	public void setStateProvinceInputField(String stateProvinceInputField) {
		this.stateProvinceInputField = stateProvinceInputField;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	public String getCandidateSource() {		
		return candidateSource;
	}
	public void setCandidateSource(String candidateSource) {
		this.candidateSource = candidateSource;
	}
	public CandidateSourceSOAPService getCandidateSourceSOAPService() {
		return candidateSourceSOAPService;
	}
	public void setCandidateSourceSOAPService(CandidateSourceSOAPService candidateSourceSOAPService) {
		this.candidateSourceSOAPService = candidateSourceSOAPService;
	}

	public ContactSOAPService getContactSOAPService() {
		return contactSOAPService;
	}

	public void setContactSOAPService(ContactSOAPService contactSOAPService) {
		this.contactSOAPService = contactSOAPService;
	}

	public Map<String, String> getCandidateSourceMap() {
		return getCandidateSourceSOAPService().getSources();
	}

	public Map<String, String> getCountriesMap() {
		return countriesMap;
	}

	public Map<String, String> getStatesMap() {
		return statesMap;
	}

	public Map<String, String> getProvincesMap() {
		return provincesMap;
	}

	public Map<String, String> getContactMethodMap() {
		return contactMethodMap;
	}

	/**
	 * This is internal controller variable to indicate if RegisterControler is in update or register mode
	 * 
	 * @return true if Register Controller is in update mode
	 */
	public boolean isUpdate() {
		return isUpdate;
	}

	/**
	 * Setter method for update variable 
	 * 
	 * @param isUpdate - true if RegisterController is in update mode
	 */
	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}	
	
	/**
	 * This method is used in registerWithOAuth, it may happen that the last name from OAuth is empty,
	 * while the last name is required by SalesForce for user creation. Therefore, last name is not read only
	 * if registering with oauth returns empty last name. 
	 * 
	 * @return true if last name is null or empty
	 */
	public boolean getIsLastNameReadOnly() {
		
		if (null != getLastName() && !getLastName().isEmpty())
			return true;
		else 
			return false;
		
	}
}
