package com.jobboard.oauth.scribe.web.controller;


import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_ACCESS_TOKEN;
import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_REQUEST_TOKEN;
import static org.springframework.web.context.request.RequestAttributes.SCOPE_SESSION;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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

import com.jobboard.controller.LoginController;
import com.jobboard.controller.RegisterController;
import com.jobboard.oauth.scribe.OAuthServiceProvider;

@Controller
public class FacebookController {
	
	@Autowired
	@Qualifier("facebookServiceProvider")
	private OAuthServiceProvider facebookServiceProvider;

    private static final Token EMPTY_TOKEN = null;
    private String firstName;
    private String lastName;
    private String email;
	
    private void getUserProfile(Token accessToken)
    {
		// getting user profile
		OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, "https://graph.facebook.com/me");
		OAuthService service = facebookServiceProvider.getService();
		service.signRequest(accessToken, oauthRequest);
		Response oauthResponse = oauthRequest.send();


		JSONParser parser = new JSONParser();
		 
		Object obj;

        try {
			obj = parser.parse(oauthResponse.getBody());
			JSONObject jsonObject = (JSONObject) obj;
			firstName = (String) jsonObject.get("first_name");
			lastName = (String) jsonObject.get("last_name");
			email = (String) jsonObject.get("email");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}    	
    }
    
    private void setRegisterControllerValues(RegisterController register)
    {
		if (register != null)
		{
			register.getUserProfile().setFirstName(firstName);
			register.getUserProfile().setLastName(lastName);
			register.getUserProfile().setEmail(email);
			register.setRegistrationMethod("FACEBOOK");
		}    	
    }
    
	@RequestMapping(value={"/login-facebook"}, method = RequestMethod.GET)
	public String login(WebRequest request, HttpSession session) {
		
		// getting request and access token from session
		Token accessToken = (Token) request.getAttribute(ATTR_OAUTH_ACCESS_TOKEN, SCOPE_SESSION);
		String tokenType = (String) request.getAttribute("TOKEN-TYPE", SCOPE_SESSION);
		if(accessToken == null || !tokenType.equals("FACEBOOK")) {
			// generate new request token
			OAuthService service = facebookServiceProvider.getService();
			request.setAttribute(ATTR_OAUTH_REQUEST_TOKEN, EMPTY_TOKEN, SCOPE_SESSION);
			request.setAttribute("TOKEN-TYPE", "FACEBOOK", SCOPE_SESSION);
			
			// redirect to facebook auth page
			return "redirect:" + service.getAuthorizationUrl(EMPTY_TOKEN);
		}
		
		getUserProfile(accessToken);
		LoginController loginCT = (LoginController) session.getAttribute("loginCT");
		// if user exists in database redirect to hidden
		if (null != loginCT) {
			String redirectHidden = loginCT.checkIfUserExists(email, "FACEBOOK");
			if (null != redirectHidden){
				return redirectHidden;
			}
		}
	
		RegisterController register = (RegisterController) session.getAttribute("register");
		setRegisterControllerValues(register);
		return "redirect:/registerWithOAuth.xhtml";
	}
	
	@RequestMapping(value={"/callback-facebook"}, method = RequestMethod.GET)
	public ModelAndView callback(@RequestParam(value="code", required=false) String oauthVerifier, WebRequest request, HttpSession session) {
		try 
		{
			// getting request token
			OAuthService service = facebookServiceProvider.getService();
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
				String redirectHidden = loginCT.checkIfUserExists(email, "FACEBOOK");
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