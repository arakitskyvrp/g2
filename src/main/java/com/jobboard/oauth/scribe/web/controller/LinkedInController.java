package com.jobboard.oauth.scribe.web.controller;


import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_ACCESS_TOKEN;
import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_REQUEST_TOKEN;
import static org.springframework.web.context.request.RequestAttributes.SCOPE_SESSION;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import com.jobboard.controller.LoginController;
import com.jobboard.controller.RegisterController;
import com.jobboard.oauth.scribe.OAuthServiceProvider;

@Controller
public class LinkedInController {
	
	@Autowired
	@Qualifier("linkedInServiceProvider")
	private OAuthServiceProvider linkedInServiceProvider;
    private String firstName;
    private String lastName;
    private String email;
	
	public String getStringFromDoc(org.w3c.dom.Document doc)    {
	    DOMImplementationLS domImplementation = (DOMImplementationLS) doc.getImplementation();
	    LSSerializer lsSerializer = domImplementation.createLSSerializer();
	    return lsSerializer.writeToString(doc);   
	}
	
    private void getUserProfile(Token accessToken)
    {
		OAuthService service = linkedInServiceProvider.getService();
		OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, "http://api.linkedin.com/v1/people/~:(id,first-name,last-name,email-address)");
		service.signRequest(accessToken, oauthRequest);
		Response oauthResponse = oauthRequest.send();
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(oauthResponse.getStream());
			Node firstNameNode = doc.getElementsByTagName("first-name").item(0);
			Node lastNameNode = doc.getElementsByTagName("last-name").item(0);
			Node emailNameNode = doc.getElementsByTagName("email-address").item(0);
			
			if ( firstNameNode != null)
				firstName = firstNameNode.getTextContent();
			if ( lastNameNode != null)
				lastName = lastNameNode.getTextContent();
			if ( emailNameNode != null)
				email = emailNameNode.getTextContent();
			
			//System.out.println(getStringFromDoc(doc));
			
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
		} catch (IOException e) {
		}    	
    }
    
    private void setRegisterControllerValues(RegisterController register)
    {
		if (register != null)
		{
			register.getUserProfile().setFirstName(firstName);
			register.getUserProfile().setLastName(lastName);
			register.getUserProfile().setEmail(email);
			register.setRegistrationMethod("LINKEDIN");
		}
    }
    
	
	@RequestMapping(value={"/login-linkedin"}, method = RequestMethod.GET)
	public String login(WebRequest request, HttpSession session) {
		
		// getting request and access token from session
		Token requestToken = (Token) request.getAttribute(ATTR_OAUTH_REQUEST_TOKEN, SCOPE_SESSION);
		Token accessToken = (Token) request.getAttribute(ATTR_OAUTH_ACCESS_TOKEN, SCOPE_SESSION);
		String tokenType = (String) request.getAttribute("TOKEN-TYPE", SCOPE_SESSION);
		if(requestToken == null || accessToken == null || !tokenType.equals("LINKEDIN")) {
			// generate new request token
			OAuthService service = linkedInServiceProvider.getService();
			requestToken = service.getRequestToken();
			request.setAttribute(ATTR_OAUTH_REQUEST_TOKEN, requestToken, SCOPE_SESSION);
			request.setAttribute("TOKEN-TYPE", "LINKEDIN", SCOPE_SESSION);
			
			// redirect to linkedin auth page
			return "redirect:" + service.getAuthorizationUrl(requestToken);
		}

		getUserProfile(accessToken);
		LoginController loginCT = (LoginController) session.getAttribute("loginCT");
		// if user exists in database redirect to hidden
		if (null != loginCT) {
			String redirectHidden = loginCT.checkIfUserExists(email, "LINKEDIN");
			if (null != redirectHidden){
				return redirectHidden;
			}
		}
	
		RegisterController register = (RegisterController) session.getAttribute("register");
		setRegisterControllerValues(register);
		return "redirect:/registerWithOAuth.xhtml";
	}
	
	@RequestMapping(value={"/callback-linkedin"}, method = RequestMethod.GET)
	public ModelAndView callback(@RequestParam(value="oauth_verifier", required=false) String oauthVerifier, WebRequest request, HttpSession session) {
		try 
		{
			// getting request tocken
			OAuthService service = linkedInServiceProvider.getService();
			Token requestToken = (Token) request.getAttribute(ATTR_OAUTH_REQUEST_TOKEN, SCOPE_SESSION);
			
			// getting access token
			Verifier verifier = new Verifier(oauthVerifier);
			Token accessToken = service.getAccessToken(requestToken, verifier);
			
			// store access token as a session attribute
			request.setAttribute(ATTR_OAUTH_ACCESS_TOKEN, accessToken, SCOPE_SESSION);
			
			// getting user profile
			getUserProfile(accessToken);
			// if user exists in database redirect to hidden
			LoginController loginCT = (LoginController) session.getAttribute("loginCT");
			// if user exists in database redirect to hidden
			if (null != loginCT) {
				String redirectHidden = loginCT.checkIfUserExists(email, "LINKEDIN");
				if (null != redirectHidden){
					return new ModelAndView(redirectHidden);
				}
			}
		
			RegisterController register = (RegisterController) session.getAttribute("register");
			setRegisterControllerValues(register);
			
			return new ModelAndView("redirect:/registerWithOAuth.xhtml");
		} catch (Exception e) {
			
		}
		return new ModelAndView("redirect:/register.xhtml");
	}
}