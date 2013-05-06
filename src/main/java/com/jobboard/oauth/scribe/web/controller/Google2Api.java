package com.jobboard.oauth.scribe.web.controller;

import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_ACCESS_TOKEN;
import static com.jobboard.oauth.scribe.web.SessionAttributes.ATTR_OAUTH_REQUEST_TOKEN;
import static org.springframework.web.context.request.RequestAttributes.SCOPE_SESSION;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.scribe.builder.api.DefaultApi20;
import org.scribe.exceptions.OAuthException;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.model.OAuthConstants;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuth20ServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.jobboard.controller.LoginController;
import com.jobboard.controller.RegisterController;

@Controller
public class Google2Api extends DefaultApi20 {

	private static final String AUTHORIZE_URL = "https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=%s&redirect_uri=%s";
	private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL
			+ "&scope=%s";

    // google oauth specific variables
	private static final Token EMPTY_TOKEN = null;
	private static final String key ="768919101912.apps.googleusercontent.com";
	private static final String secret ="52TXWXDo-rdRMOzdpbzdJecp";
	private static final String callback ="http://fbjobboard.herokuapp.com/people/callback-google-plus/";
	private static final String scope = "https://www.googleapis.com/auth/userinfo.email https://www.googleapis.com/auth/userinfo.profile";

	// profile specific variables
    private String firstName;
    private String lastName;
    private String email;
	
	private OAuthService service = createService(new OAuthConfig(key, secret, callback , null, scope, null));

	@Override
	public String getAccessTokenEndpoint() {
		return "https://accounts.google.com/o/oauth2/token";
	}

	@Override
	public AccessTokenExtractor getAccessTokenExtractor() {
		return new AccessTokenExtractor() {
			@Override
			public Token extract(String response) {
				Preconditions
						.checkEmptyString(response,
								"Response body is incorrect. Can't extract a token from an empty string");

				Matcher matcher = Pattern.compile(
						"\"access_token\" : \"([^&\"]+)\"").matcher(response);
				if (matcher.find()) {
					String token = OAuthEncoder.decode(matcher.group(1));
					return new Token(token, "", response);
				} else {
					throw new OAuthException(
							"Response body is incorrect. Can't extract a token from this: '"
									+ response + "'", null);
				}
			}
		};
	}

	@Override
	public String getAuthorizationUrl(OAuthConfig config) {		
		// Append scope if present
		if (config.hasScope()) {
			return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()),
					OAuthEncoder.encode(config.getScope()));
		} else {
			return String.format(AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()));
		}
	}

	@Override
	public Verb getAccessTokenVerb() {
		return Verb.POST;
	}

	@Override
	public OAuthService createService(OAuthConfig config) {
		return new GoogleOAuth2Service(this, config);
	}

    private void getUserProfile(Token accessToken)
    {
		OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, "https://www.googleapis.com/oauth2/v1/userinfo?alt=json");
		service.signRequest(accessToken, oauthRequest); // the access token from step 4
		Response oauthResponse = oauthRequest.send();
		
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(oauthResponse.getBody());
			JSONObject jsonObject = (JSONObject) obj;
			firstName = (String) jsonObject.get("given_name");
			lastName = (String) jsonObject.get("family_name");
			email = (String) jsonObject.get("email");
			//System.out.println(jsonObject.toString());
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
			register.setRegistrationMethod("GOOGLE-PLUS");
		}    	
    }
    
    
	@RequestMapping(value={"/login-google-plus"}, method = RequestMethod.GET)
	public String login(WebRequest request, HttpSession session) {
		
		// getting request and access token from session
		Token accessToken = (Token) request.getAttribute(ATTR_OAUTH_ACCESS_TOKEN, SCOPE_SESSION);
		String tokenType = (String) request.getAttribute("TOKEN-TYPE", SCOPE_SESSION);
		if(accessToken == null || !"GOOGLE-PLUS".equals(tokenType)) {
			// generate new request token
			request.setAttribute(ATTR_OAUTH_REQUEST_TOKEN, EMPTY_TOKEN, SCOPE_SESSION);
			request.setAttribute("TOKEN-TYPE", "GOOGLE-PLUS", SCOPE_SESSION);
			
			// redirect to facebook auth page
			return "redirect:" + service.getAuthorizationUrl(EMPTY_TOKEN);
		}
		
		getUserProfile(accessToken);
		LoginController loginCT = (LoginController) session.getAttribute("loginCT");
		// if user exists in database redirect to hidden
		if (null != loginCT) {
			String redirectHidden = loginCT.checkIfUserExists(email, "GOOGLE-PLUS");
			if (null != redirectHidden){
				return redirectHidden;
			}
		}
	
		RegisterController register = (RegisterController) session.getAttribute("register");
		setRegisterControllerValues(register);

		return "redirect:/registerWithOAuth.xhtml";
	}

	@RequestMapping(value={"/callback-google-plus"}, method = RequestMethod.GET)
	public ModelAndView callback(@RequestParam(value="code", required=false) String code,
								  @RequestParam(value="error", required=false) String error,
									WebRequest request, HttpSession session) {
		try 
		{
			// getting request token
			Token requestToken = (Token) request.getAttribute(ATTR_OAUTH_REQUEST_TOKEN, SCOPE_SESSION);
			
			// getting access token
			Verifier verifier = new Verifier(code);
			Token accessToken = service.getAccessToken(requestToken, verifier);
			
			// store access token as a session attribute
			request.setAttribute(ATTR_OAUTH_ACCESS_TOKEN, accessToken, SCOPE_SESSION);
			
			// getting user profile
			getUserProfile(accessToken);
			// if user exists in database redirect to hidden
			LoginController loginCT = (LoginController) session.getAttribute("loginCT");
			// if user exists in database redirect to hidden
			if (null != loginCT) {
				String redirectHidden = loginCT.checkIfUserExists(email, "GOOGLE-PLUS");
				if (null != redirectHidden){
					return new ModelAndView(redirectHidden);
				}
			}
		
			RegisterController register = (RegisterController) session.getAttribute("register");
			setRegisterControllerValues(register);
			
			return new ModelAndView("redirect:/registerWithOAuth.xhtml");
		}  catch (Exception e) {
			
		}
		return new ModelAndView("redirect:/register.xhtml");
	}
	
	
	private class GoogleOAuth2Service extends OAuth20ServiceImpl {

		private static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
		private static final String GRANT_TYPE = "grant_type";
		private DefaultApi20 api;
		
		
		private OAuthConfig config;
		
		public GoogleOAuth2Service(DefaultApi20 api, OAuthConfig config) {
			super(api, config);
			this.api = api;
			this.config = config;
		}

		@Override
		public Token getAccessToken(Token requestToken, Verifier verifier) {
			OAuthRequest request = new OAuthRequest(api.getAccessTokenVerb(),
					api.getAccessTokenEndpoint());
			switch (api.getAccessTokenVerb()) {
			case POST:
				request.addBodyParameter(OAuthConstants.CLIENT_ID,
						config.getApiKey());
				request.addBodyParameter(OAuthConstants.CLIENT_SECRET,
						config.getApiSecret());
				request.addBodyParameter(OAuthConstants.CODE,
						verifier.getValue());
				request.addBodyParameter(OAuthConstants.REDIRECT_URI,
						config.getCallback());
				request.addBodyParameter(GRANT_TYPE,
						GRANT_TYPE_AUTHORIZATION_CODE);
				break;
			case GET:
			default:
				request.addQuerystringParameter(OAuthConstants.CLIENT_ID,
						config.getApiKey());
				request.addQuerystringParameter(OAuthConstants.CLIENT_SECRET,
						config.getApiSecret());
				request.addQuerystringParameter(OAuthConstants.CODE,
						verifier.getValue());
				request.addQuerystringParameter(OAuthConstants.REDIRECT_URI,
						config.getCallback());
				if (config.hasScope())
					request.addQuerystringParameter(OAuthConstants.SCOPE,
							config.getScope());
			}
			Response response = request.send();
			return api.getAccessTokenExtractor().extract(response.getBody());
		}
	}

}