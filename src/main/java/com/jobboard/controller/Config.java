package com.jobboard.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

public class Config {

	private static String NAMESPACE_PREFIX;

	public static final String CUSTOM_SETTING_NAME = "Config";
	
	//Persistence Unit Names
	public static final String PERSISTENCE_UNIT_NAME_HEROKU = "jobboard";
	public static final String PERSISTENCE_UNIT_NAME_SFDC = "forceDatabase";

	// Query Parameters
	public static final String JOB_ID_PARAM = "jobId";
	public static final String APP_ID_PARAM = "appId";
	public static final String SESSION_KEY_PARAM = "sessionKey";
	public static final String RETURN_URL_PARAM = "retURL";
	public static final String SUBMITTAL_KEY_PARAM = "key";
	public static final String SOURCE_ID_PARAM = "tSource";
	public static final String EXTERNAL_SOURCE_PARAM = "extsource";
	public static final String BB_SOURCE_PARAM = "bbsource";

	// Cookies
	public static final String CRITERIA_NAME_COOKIE = "jbsearch";

	public static final String CONTACT_RECORD_TYPE_DEVELOPER_NAME = "Candidate";
	public static final String ACCOUNT_RECORD_TYPE_DEVELOPER_NAME = CONTACT_RECORD_TYPE_DEVELOPER_NAME;
	public static final String ACCOUNT_NAME = ACCOUNT_RECORD_TYPE_DEVELOPER_NAME
			+ "s";

	// Email Temlates Naming
	public static final String EMAIL_JOB_TEMPLATE_NAME = "EmailJob";
	public static final String VERIFY_USER_TEMPLATE_NAME = "VerifyUserVF";

	public static final String BASIC_JOB_ORDER_JOB_SELECT = "SELECT JobOrder__c, JobOrder__r.Id, JobOrder__r.OwnerId, JobOrder__r.Name, JobOrder__r.Location__c, JobOrder__r.RecordTypeId, JobOrder__r.RecordType.DeveloperName, JobOrder__r.Job_Number__c, JobOrder__r.Recruiter__c, JobOrder__r.Secondary_Recruiter__c, JobOrder__r.Internal_Question_Set__c, JobOrder__r.Question_Set__c, JobOrder__r.Disable_EEO__c, JobOrder__r.Question_Set__r.Id, JobOrder__r.Question_Set__r.Business_Unit__c, JobOrder__r.Internal_Question_Set__r.Id, JobOrder__r.Internal_Question_Set__r.Business_Unit__c ";

	public static final String STANDARD_QUESTION_NAME_FORMAT = "Question{0}__c";
	public static final String STANDARD_QUESTION_RELATIONSHIP_FORMAT = "Question{0}__r";
	public static final String STANDARD_QUESTION_FIELDS_FORMAT = ("{0}.Question__c,"
			+ "{0}.Large_Question__c,"
			+ "{0}.Rich_Text_Question__c,"
			+ "{0}.Question_Size__c,"
			+ "{0}.ContactField__c,"
			+ "{0}.Required_By_Applicant__c,"
			+ "{0}.Question_Layout__c,"
			+ "{0}.TempDate__c," + "{0}.TempDateTime__c");
	public static final String STANDARD_QUESTION_REFERENCE_QUERY = "SELECT Name FROM {0} ORDER By Name LIMIT 999";

	public static final Map<String, String> COUNTRIES = new LinkedHashMap<String, String>();
	static {
		COUNTRIES.put("Afghanistan", "AF");
		COUNTRIES.put("Aland Islands", "AX");
		COUNTRIES.put("Albania", "AL");
		COUNTRIES.put("Algeria", "DZ");
		COUNTRIES.put("American Samoa", "AS");
		COUNTRIES.put("Andorra", "AD");
		COUNTRIES.put("Angola", "AO");
		COUNTRIES.put("Anguilla", "AI");
		COUNTRIES.put("Antarctica", "AQ");
		COUNTRIES.put("Antigua and Barbuda", "AG");
		COUNTRIES.put("Argentina", "AR");
		COUNTRIES.put("Armenia", "AM");
		COUNTRIES.put("Aruba", "AW");
		COUNTRIES.put("Australia", "AU");
		COUNTRIES.put("Austria", "AT");
		COUNTRIES.put("Azerbaijan", "AZ");
		COUNTRIES.put("Bahamas", "BS");
		COUNTRIES.put("Bahrain", "BH");
		COUNTRIES.put("Bangladesh", "BD");
		COUNTRIES.put("Barbados", "BB");
		COUNTRIES.put("Belarus", "BY");
		COUNTRIES.put("Belgium", "BE");
		COUNTRIES.put("Belize", "BZ");
		COUNTRIES.put("Benin", "BJ");
		COUNTRIES.put("Bermuda", "BM");
		COUNTRIES.put("Bhutan", "BT");
		COUNTRIES.put("Bolivia, Plurinational State of", "BO");
		COUNTRIES.put("Bonaire, Saint Eustatius and Saba", "BQ");
		COUNTRIES.put("Bosnia and Herzegovina", "BA");
		COUNTRIES.put("Botswana", "BW");
		COUNTRIES.put("Bouvet Island", "BV");
		COUNTRIES.put("Brazil", "BR");
		COUNTRIES.put("British Indian Ocean Territory", "IO");
		COUNTRIES.put("Brunei Darussalam", "BN");
		COUNTRIES.put("Bulgaria", "BG");
		COUNTRIES.put("Burkina Faso", "BF");
		COUNTRIES.put("Burundi", "BI");
		COUNTRIES.put("Cambodia", "KH");
		COUNTRIES.put("Cameroon", "CM");
		COUNTRIES.put("Canada", "CA");
		COUNTRIES.put("Cape Verde", "CV");
		COUNTRIES.put("Cayman Islands", "KY");
		COUNTRIES.put("Central African Republic", "CF");
		COUNTRIES.put("Chad", "TD");
		COUNTRIES.put("Chile", "CL");
		COUNTRIES.put("China", "CN");
		COUNTRIES.put("Christmas Island", "CX");
		COUNTRIES.put("Cocos (Keeling) Islands", "CC");
		COUNTRIES.put("Colombia", "CO");
		COUNTRIES.put("Comoros", "KM");
		COUNTRIES.put("Congo", "CG");
		COUNTRIES.put("Congo, The Democratic Republic of The", "CD");
		COUNTRIES.put("Cook Islands", "CK");
		COUNTRIES.put("Costa Rica", "CR");
		COUNTRIES.put("Cote d\"Ivoire", "CI");
		COUNTRIES.put("Croatia", "HR");
		COUNTRIES.put("Cuba", "CU");
		COUNTRIES.put("Curacao", "CW");
		COUNTRIES.put("Cyprus", "CY");
		COUNTRIES.put("Czech Republic", "CZ");
		COUNTRIES.put("Denmark", "DK");
		COUNTRIES.put("Djibouti", "DJ");
		COUNTRIES.put("Dominica", "DM");
		COUNTRIES.put("Dominican Republic", "DO");
		COUNTRIES.put("Ecuador", "EC");
		COUNTRIES.put("Egypt", "EG");
		COUNTRIES.put("El Salvador", "SV");
		COUNTRIES.put("Equatorial Guinea", "GQ");
		COUNTRIES.put("Eritrea", "ER");
		COUNTRIES.put("Estonia", "EE");
		COUNTRIES.put("Ethiopia", "ET");
		COUNTRIES.put("Falkland Islands (Malvinas)", "FK");
		COUNTRIES.put("Faroe Islands", "FO");
		COUNTRIES.put("Fiji", "FJ");
		COUNTRIES.put("Finland", "FI");
		COUNTRIES.put("France", "FR");
		COUNTRIES.put("French Guiana", "GF");
		COUNTRIES.put("French Polynesia", "PF");
		COUNTRIES.put("French Southern Territories", "TF");
		COUNTRIES.put("Gabon", "GA");
		COUNTRIES.put("Gambia", "GM");
		COUNTRIES.put("Georgia", "GE");
		COUNTRIES.put("Germany", "DE");
		COUNTRIES.put("Ghana", "GH");
		COUNTRIES.put("Gibraltar", "GI");
		COUNTRIES.put("Greece", "GR");
		COUNTRIES.put("Greenland", "GL");
		COUNTRIES.put("Grenada", "GD");
		COUNTRIES.put("Guadeloupe", "GP");
		COUNTRIES.put("Guam", "GU");
		COUNTRIES.put("Guatemala", "GT");
		COUNTRIES.put("Guernsey", "GG");
		COUNTRIES.put("Guinea", "GN");
		COUNTRIES.put("Guinea-Bissau", "GW");
		COUNTRIES.put("Guyana", "GY");
		COUNTRIES.put("Haiti", "HT");
		COUNTRIES.put("Heard Island and Mcdonald Islands", "HM");
		COUNTRIES.put("Holy See (Vatican City State)", "VA");
		COUNTRIES.put("Honduras", "HN");
		COUNTRIES.put("Hong Kong", "HK");
		COUNTRIES.put("Hungary", "HU");
		COUNTRIES.put("Iceland", "IS");
		COUNTRIES.put("India", "IN");
		COUNTRIES.put("Indonesia", "ID");
		COUNTRIES.put("Iran, Islamic Republic of", "IR");
		COUNTRIES.put("Iraq", "IQ");
		COUNTRIES.put("Ireland", "IE");
		COUNTRIES.put("Isle of Man", "IM");
		COUNTRIES.put("Israel", "IL");
		COUNTRIES.put("Italy", "IT");
		COUNTRIES.put("Jamaica", "JM");
		COUNTRIES.put("Japan", "JP");
		COUNTRIES.put("Jersey", "JE");
		COUNTRIES.put("Jordan", "JO");
		COUNTRIES.put("Kazakhstan", "KZ");
		COUNTRIES.put("Kenya", "KE");
		COUNTRIES.put("Kiribati", "KI");
		COUNTRIES.put("Korea, Democratic People\"s Republic of", "KP");
		COUNTRIES.put("Korea, Republic of", "KR");
		COUNTRIES.put("Kuwait", "KW");
		COUNTRIES.put("Kyrgyzstan", "KG");
		COUNTRIES.put("Lao People\"s Democratic Republic", "LA");
		COUNTRIES.put("Latvia", "LV");
		COUNTRIES.put("Lebanon", "LB");
		COUNTRIES.put("Lesotho", "LS");
		COUNTRIES.put("Liberia", "LR");
		COUNTRIES.put("Libyan Arab Jamahiriya", "LY");
		COUNTRIES.put("Liechtenstein", "LI");
		COUNTRIES.put("Lithuania", "LT");
		COUNTRIES.put("Luxembourg", "LU");
		COUNTRIES.put("Macao", "MO");
		COUNTRIES.put("Macedonia, The Former Yugoslav Republic of", "MK");
		COUNTRIES.put("Madagascar", "MG");
		COUNTRIES.put("Malawi", "MW");
		COUNTRIES.put("Malaysia", "MY");
		COUNTRIES.put("Maldives", "MV");
		COUNTRIES.put("Mali", "ML");
		COUNTRIES.put("Malta", "MT");
		COUNTRIES.put("Marshall Islands", "MH");
		COUNTRIES.put("Martinique", "MQ");
		COUNTRIES.put("Mauritania", "MR");
		COUNTRIES.put("Mauritius", "MU");
		COUNTRIES.put("Mayotte", "YT");
		COUNTRIES.put("Mexico", "MX");
		COUNTRIES.put("Micronesia, Federated States of", "FM");
		COUNTRIES.put("Moldova, Republic of", "MD");
		COUNTRIES.put("Monaco", "MC");
		COUNTRIES.put("Mongolia", "MN");
		COUNTRIES.put("Montenegro", "ME");
		COUNTRIES.put("Montserrat", "MS");
		COUNTRIES.put("Morocco", "MA");
		COUNTRIES.put("Mozambique", "MZ");
		COUNTRIES.put("Myanmar", "MM");
		COUNTRIES.put("Namibia", "NA");
		COUNTRIES.put("Nauru", "NR");
		COUNTRIES.put("Nepal", "NP");
		COUNTRIES.put("Netherlands", "NL");
		COUNTRIES.put("New Caledonia", "NC");
		COUNTRIES.put("New Zealand", "NZ");
		COUNTRIES.put("Nicaragua", "NI");
		COUNTRIES.put("Niger", "NE");
		COUNTRIES.put("Nigeria", "NG");
		COUNTRIES.put("Niue", "NU");
		COUNTRIES.put("Norfolk Island", "NF");
		COUNTRIES.put("Northern Mariana Islands", "MP");
		COUNTRIES.put("Norway", "NO");
		COUNTRIES.put("Oman", "OM");
		COUNTRIES.put("Pakistan", "PK");
		COUNTRIES.put("Palau", "PW");
		COUNTRIES.put("Palestinian Territory, Occupied", "PS");
		COUNTRIES.put("Panama", "PA");
		COUNTRIES.put("Papua New Guinea", "PG");
		COUNTRIES.put("Paraguay", "PY");
		COUNTRIES.put("Peru", "PE");
		COUNTRIES.put("Philippines", "PH");
		COUNTRIES.put("Pitcairn", "PN");
		COUNTRIES.put("Poland", "PL");
		COUNTRIES.put("Portugal", "PT");
		COUNTRIES.put("Puerto Rico", "PR");
		COUNTRIES.put("Qatar", "QA");
		COUNTRIES.put("Reunion", "RE");
		COUNTRIES.put("Romania", "RO");
		COUNTRIES.put("Russian Federation", "RU");
		COUNTRIES.put("Rwanda", "RW");
		COUNTRIES.put("Saint Barthelemy", "BL");
		COUNTRIES.put("Saint Helena, Ascension and Tristan da Cunha", "SH");
		COUNTRIES.put("Saint Kitts and Nevis", "KN");
		COUNTRIES.put("Saint Lucia", "LC");
		COUNTRIES.put("Saint Martin (French Part)", "MF");
		COUNTRIES.put("Saint Pierre and Miquelon", "PM");
		COUNTRIES.put("Saint Vincent and The Grenadines", "VC");
		COUNTRIES.put("Samoa", "WS");
		COUNTRIES.put("San Marino", "SM");
		COUNTRIES.put("Sao Tome and Principe", "ST");
		COUNTRIES.put("Saudi Arabia", "SA");
		COUNTRIES.put("Senegal", "SN");
		COUNTRIES.put("Serbia", "RS");
		COUNTRIES.put("Seychelles", "SC");
		COUNTRIES.put("Sierra Leone", "SL");
		COUNTRIES.put("Singapore", "SG");
		COUNTRIES.put("Sint Maarten (Dutch Part)", "SX");
		COUNTRIES.put("Slovakia", "SK");
		COUNTRIES.put("Slovenia", "SI");
		COUNTRIES.put("Solomon Islands", "SB");
		COUNTRIES.put("Somalia", "SO");
		COUNTRIES.put("South Africa", "ZA");
		COUNTRIES.put("South Georgia and The South Sandwich Islands", "GS");
		COUNTRIES.put("Spain", "ES");
		COUNTRIES.put("Sri Lanka", "LK");
		COUNTRIES.put("Sudan", "SD");
		COUNTRIES.put("Suriname", "SR");
		COUNTRIES.put("Svalbard and Jan Mayen", "SJ");
		COUNTRIES.put("Swaziland", "SZ");
		COUNTRIES.put("Sweden", "SE");
		COUNTRIES.put("Switzerland", "CH");
		COUNTRIES.put("Syrian Arab Republic", "SY");
		COUNTRIES.put("Taiwan, Province of China", "TW");
		COUNTRIES.put("Tajikistan", "TJ");
		COUNTRIES.put("Tanzania, United Republic of", "TZ");
		COUNTRIES.put("Thailand", "TH");
		COUNTRIES.put("Timor-Leste", "TL");
		COUNTRIES.put("Togo", "TG");
		COUNTRIES.put("Tokelau", "TK");
		COUNTRIES.put("Tonga", "TO");
		COUNTRIES.put("Trinidad and Tobago", "TT");
		COUNTRIES.put("Tunisia", "TN");
		COUNTRIES.put("Turkey", "TR");
		COUNTRIES.put("Turkmenistan", "TM");
		COUNTRIES.put("Turks and Caicos Islands", "TC");
		COUNTRIES.put("Tuvalu", "TV");
		COUNTRIES.put("Uganda", "UG");
		COUNTRIES.put("Ukraine", "UA");
		COUNTRIES.put("United Arab Emirates", "AE");
		COUNTRIES.put("United Kingdom", "GB");
		COUNTRIES.put("United States", "US");
		COUNTRIES.put("United States Minor Outlying Islands", "UM");
		COUNTRIES.put("Uruguay", "UY");
		COUNTRIES.put("Uzbekistan", "UZ");
		COUNTRIES.put("Vanuatu", "VU");
		COUNTRIES.put("Venezuela, Bolivarian Republic of", "VE");
		COUNTRIES.put("Viet Nam", "VN");
		COUNTRIES.put("Virgin Islands, British", "VG");
		COUNTRIES.put("Virgin Islands, U.S.", "VI");
		COUNTRIES.put("Wallis and Futuna", "WF");
		COUNTRIES.put("Western Sahara", "EH");
		COUNTRIES.put("Yemen", "YE");
		COUNTRIES.put("Zambia", "ZM");
		COUNTRIES.put("Zimbabwe", "ZW");
	}

	public static final Map<String, String> STATES = new LinkedHashMap<String, String>();
	static {
		STATES.put("Alabama", "AL");
		STATES.put("Alaska", "AK");
		STATES.put("American Samoa", "AS");
		STATES.put("Arizona", "AZ");
		STATES.put("Arkansas", "AR");
		STATES.put("California", "CA");
		STATES.put("Colorado", "CO");
		STATES.put("Connecticut", "CT");
		STATES.put("Delaware", "DE");
		STATES.put("DC", "DC");
		STATES.put("Florida", "FL");
		STATES.put("Georgia", "GA");
		STATES.put("Guam", "GU");
		STATES.put("Hawaii", "HI");
		STATES.put("Idaho", "ID");
		STATES.put("Illinois", "IL");
		STATES.put("Indiana", "IN");
		STATES.put("Iowa", "IA");
		STATES.put("Kansas", "KS");
		STATES.put("Kentucky", "KY");
		STATES.put("Louisiana", "LA");
		STATES.put("Maine", "ME");
		STATES.put("Maryland", "MD");
		STATES.put("Massachusetts", "MA");
		STATES.put("Michigan", "MI");
		STATES.put("Minnesota", "MN");
		STATES.put("Mississippi", "MS");
		STATES.put("Missouri", "MO");
		STATES.put("Montana", "MT");
		STATES.put("Nebraska", "NE");
		STATES.put("Nevada", "NV");
		STATES.put("New Hampshire", "NH");
		STATES.put("New Jersey", "NJ");
		STATES.put("New Mexico", "NM");
		STATES.put("New York", "NY");
		STATES.put("North Carolina", "NC");
		STATES.put("North Dakota", "ND");
		STATES.put("Northern Mariana Islands", "MP");
		STATES.put("Ohio", "OH");
		STATES.put("Oklahoma", "OK");
		STATES.put("Oregon", "OR");
		STATES.put("Pennsylvania", "PA");
		STATES.put("Puerto Rico", "PR");
		STATES.put("Rhode Island", "RI");
		STATES.put("South Carolina", "SC");
		STATES.put("South Dakota", "SD");
		STATES.put("Tennessee", "TN");
		STATES.put("Texas", "TX");
		STATES.put("US Virgin Islands", "VI");
		STATES.put("Utah", "UT");
		STATES.put("Vermont", "VT");
		STATES.put("Virginia", "VA");
		STATES.put("Washington", "WA");
		STATES.put("West Virginia", "WV");
		STATES.put("Wisconsin", "WI");
		STATES.put("Wyoming", "WY");
	}

	public static final Map<String, String> PROVINCES = new LinkedHashMap<String, String>();
	static {
		PROVINCES.put("Alberta", "AB");
		PROVINCES.put("British Columbia", "BC");
		PROVINCES.put("Manitoba", "MB");
		PROVINCES.put("New Brunswick", "NB");
		PROVINCES.put("Newfoundland and Labrador", "NL");
		PROVINCES.put("Northwest Territories", "NT");
		PROVINCES.put("Nova Scotia", "NS");
		PROVINCES.put("Nunavut", "NU");
		PROVINCES.put("Ontario", "ON");
		PROVINCES.put("Prince Edward Island", "PE");
		PROVINCES.put("Quebec", "QC");
		PROVINCES.put("Saskatchewan", "SK");
		PROVINCES.put("Yukon", "YT");
	}

	public static final Map<String, String> CONTACT_METHOD = new LinkedHashMap<String, String>();
	static {
		CONTACT_METHOD.put("Phone", "Phone");
		CONTACT_METHOD.put("Mobile", "Mobile");
		CONTACT_METHOD.put("Email", "Email");
	}

	public static final Map<String, String> CANDIDATE_SOURCE = new LinkedHashMap<String, String>();
	static {
		CANDIDATE_SOURCE.put("Career Site", "a0ei00000008oeXAAQ");
		CANDIDATE_SOURCE.put("Facebook", "a0ei00000008oerAAA");
		CANDIDATE_SOURCE.put("Indeed", "a0ei00000008oemAAA");
		CANDIDATE_SOURCE.put("Monster", "a0ei00000008oecAAA");
	}

	public static String getNAMESPACE_PREFIX() {
		FacesContext ctx = FacesContext.getCurrentInstance();
		String requestContextPath = ctx.getExternalContext()
				.getRequestContextPath();
		String prefix = "ts2";
		NAMESPACE_PREFIX = requestContextPath.contains(prefix + "__") ? prefix
				: "";

		return NAMESPACE_PREFIX;
	}

	public static void setNAMESPACE_PREFIX(String nAMESPACE_PREFIX) {
		NAMESPACE_PREFIX = nAMESPACE_PREFIX;
	}

	// random nonce to salt the passwords
	public static final String NONCE = "eSXMeJB6ChHx7g3XHjKk6D63";
}
