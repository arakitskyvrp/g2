package com.jobboard.dns.dnsme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.heroku.api.Domain;
import com.heroku.api.HerokuAPI;
import com.heroku.api.request.domain.DomainAdd;
import com.jobboard.dns.IDNSManager;

/**
 * @author Chris Magers This class is responsible for the domain management for
 *         DNS Made Easy
 * 
 */
public class G2ADNSMadeEasy implements IDNSManager {
	String aesKey = "3e7ef86e-d83a-4fba-86c5-522e5c4ecced";
	String secretKey = "75413605-5990-4fba-87b6-451e690784f3";
	String httpDateFormat = "EEE, d MMM yyyy HH:mm:ss z";
	String baseURL = "http://api.dnsmadeeasy.com/V1.2/";
	String domainsURL = "domains/";
	String recordsURL = "records/";
	String secondaryURL = "/secondary";
	String mainDomain = "g2analytics.us/";
	private String publicIP;
	private String privateIP;
	private HerokuAPI herokuApi;
	private String herokuAppName = "fbjobboard";
	private String herokuApiKey = "7d2670ab-e8c0-4015-a5d4-abe455ae2332";
	public static final String HEROKU_BOARD_STATIC_DOMAN = "http://fbjobboard.herokuapp.com/";

	/**
	 * Constructor to read the properties files and set values that are needed
	 */
	public G2ADNSMadeEasy() {
		// ResourceBundle rb = null;
		// try {
		// rb = ResourceBundle.getBundle("dnsme");
		// this.setAesKey(rb.getString("dnsme.aes.key"));
		// this.setSecretKey(rb.getString("dnsme.secret.key"));
		// this.setHttpDateFormat(rb.getString("dnsme.httpdate.format"));
		// this.setBaseURL(rb.getString("dnsme.base.url"));
		// this.setDomainsURL(rb.getString("dnsme.domains.url"));
		// this.setRecordsURL(rb.getString("dnsme.records.url"));
		// this.setSecondaryURL(rb.getString("dnsme.secondary.url"));
		// this.setMainDomain(rb.getString("dnsme.main.domain"));
		// } catch (Exception e) {
		// throw new Exception(e);
		// }
	}

	/**
	 * This is called by the main method and creates the A records
	 */
	public boolean createDomain(String serverType, String company,
			String publicIP, String privateIP) throws Exception {
		try {
			/***
			 * We are no longer using this as this will create a new domain. we
			 * simply want to add an A record under g2a.cloudtrigger.com
			 * //create external DNS String response = ""; HttpURLConnection url
			 * = this.getURLConnection("PUT", this.getBaseURL() +
			 * this.getDomainsURL() + serverType + "." + company +
			 * this.getMainDomain()); response = this.getResponse(url); //create
			 * internal DNS - make sure internal IPs are enabled in DNSMadeEasy
			 * Advances settings url = this.getURLConnection("PUT",
			 * this.getBaseURL() + this.getDomainsURL() + serverType +
			 * ".internal." + company + this.getMainDomain()); response =
			 * this.getResponse(url); //now add the A record for the domain
			 */
			this.addDomainRecords(serverType, company, publicIP, privateIP);
			return true;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This is called by the createDomain and adds the A records
	 */
	private boolean addDomainRecords(String serverType, String company,
			String publicIP, String privateIP) throws Exception {
		try {
			String response = "";
			String endpoint = this.getBaseURL() + this.getDomainsURL()
					+ this.getMainDomain() + this.getRecordsURL();
			String externalJSON = "{\"name\":\"" + serverType + "." + company
					+ "\",\"type\":\"A\",\"data\":\"" + publicIP
					+ "\",\"gtdLocation\":\"Default\",\"ttl\":1800}";
			String internalJSON = "{\"name\":\"" + serverType + ".internal."
					+ company + "\",\"type\":\"A\",\"data\":\"" + privateIP
					+ "\",\"gtdLocation\":\"Default\",\"ttl\":1800}";
			System.out.println("ExternalJSON = " + externalJSON);
			System.out.println("InternalJSON = " + internalJSON);
			System.out.println("endpoint = " + endpoint);
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					System.out.println("Add A Record URL = " + endpoint);
					HttpURLConnection url = this.getURLConnection("POST",
							endpoint);
					// for A records
					// tell the WS we are sending JSON or receive HTTP 415 error
					url.setRequestProperty("Content-Type", "application/json");
					this.writeDomainRecord(url, externalJSON);
					response = this.getResponse(url);
				} else if (i == 1) {
					System.out.println("Add A Record URL = " + endpoint);
					// TODO: need to build mechanism to create internal and
					// external IPs
					HttpURLConnection url = this.getURLConnection("POST",
							endpoint);
					// for A records
					// tell the WS we are sending JSON or receive HTTP 415 error
					url.setRequestProperty("Content-Type", "application/json");
					this.writeDomainRecord(url, internalJSON);
					response = this.getResponse(url);
				}
			}
			return true;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This is called by the createDomain and adds the A records
	 */
	private boolean addDomainRecords(String serverType, String publicIP,
			String privateIP) throws Exception {
		try {
			String response = "";
			String endpoint = this.getBaseURL() + this.getDomainsURL()
					+ this.getMainDomain() + this.getRecordsURL();
			String externalJSON = "{\"name\":\"" + serverType
					+ "\",\"type\":\"A\",\"data\":\"" + publicIP
					+ "\",\"gtdLocation\":\"Default\",\"ttl\":1800}";
			String internalJSON = "{\"name\":\"" + serverType + ".internal"
					+ "\",\"type\":\"A\",\"data\":\"" + privateIP
					+ "\",\"gtdLocation\":\"Default\",\"ttl\":1800}";
			System.out.println("ExternalJSON = " + externalJSON);
			System.out.println("InternalJSON = " + internalJSON);
			System.out.println("endpoint = " + endpoint);
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					System.out.println("Add A Record URL = " + endpoint);
					HttpURLConnection url = this.getURLConnection("POST",
							endpoint);
					// for A records
					// tell the WS we are sending JSON or receive HTTP 415 error
					url.setRequestProperty("Content-Type", "application/json");
					this.writeDomainRecord(url, externalJSON);
					response = this.getResponse(url);
				} else if (i == 1) {
					System.out.println("Add A Record URL = " + endpoint);
					// TODO: need to build mechanism to create internal and
					// external IPs
					HttpURLConnection url = this.getURLConnection("POST",
							endpoint);
					// for A records
					// tell the WS we are sending JSON or receive HTTP 415 error
					url.setRequestProperty("Content-Type", "application/json");
					this.writeDomainRecord(url, internalJSON);
					response = this.getResponse(url);
				}
			}
			return true;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This is called by addDomainRecords and sends the JSON to DNS Made Easy
	 * for the A Record
	 */
	private boolean writeDomainRecord(HttpURLConnection url, String json)
			throws Exception {
		// write JSON to server for creating A record
		PrintStream ps = new PrintStream(url.getOutputStream());
		ps.print(json);
		ps.close();
		return true;
	}

	/**
	 * This is called by the main method and deletes the domains.
	 * 
	 * 
	 */
	public boolean deleteDomain(String serverType, String company)
			throws Exception {
		try {
			String response = "";
			// make sure there are values of we don't/can't delete the main
			// domain
			if (serverType.isEmpty() && company.isEmpty()) {
				throw new Exception(
						"Must pass args into method for serverType and Company");
			}
			HttpURLConnection url = this.getURLConnection("DELETE",
					this.getBaseURL() + this.getDomainsURL() + serverType + "."
							+ company + "." + this.getMainDomain());
			response = this.getResponse(url);
			url = this.getURLConnection(
					"DELETE",
					this.getBaseURL() + this.getDomainsURL() + serverType
							+ ".internal." + company + "."
							+ this.getMainDomain());
			response = this.getResponse(url);
			return true;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This is called by the main method and returns the domains Since we are
	 * not using domains,this will always return g2a.cloudtrigger.com
	 */
	public String getDomains() throws Exception {
		String domains = "";
		try {
			HttpURLConnection url = this.getURLConnection("GET",
					this.getBaseURL() + this.getDomainsURL());
			domains = this.getResponse(url);
			return domains;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This method gets the record IDs that match and then use for deleting the
	 * A records should match the record name on serverType and company
	 */
	private String[] getMatchingRecordIDs(String serverType, String company,
			String json) throws Exception {
		String sIds = "";
		String recName = "";
		String recId = "";
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(json);
			JSONArray jArr = (JSONArray) obj;
			for (int i = 0; i < jArr.size(); i++) {
				obj = parser.parse(jArr.get(i).toString());
				JSONObject jObj = (JSONObject) obj;
				recName = jObj.get("name").toString();
				recId = jObj.get("id").toString();

				if (recName.contains(company.toLowerCase())
						&& recName.contains(serverType.toLowerCase())) {
					if (sIds.length() == 0) {
						sIds = recId;
					} else {
						sIds = sIds + "," + recId;
					}
				}
			}
		} catch (ParseException pe) {
			throw new Exception(pe);
		}
		String[] ids = sIds.split(",");
		return ids;
	}

	/**
	 * This method deletes the A records using the IDs from getRecordIds IDs to
	 * then use for deleting the A records
	 */
	public boolean deleteARecords(String serverType, String company,
			String publicIP) throws Exception {
		String records = "";
		String response = "";
		try {
			HttpURLConnection url = this.getURLConnection(
					"GET",
					this.getBaseURL() + this.getDomainsURL()
							+ this.getMainDomain() + this.getRecordsURL());
			records = this.getResponse(url);
			String[] ids = this.getMatchingRecordIDs(serverType, company,
					records);
			for (int i = 0; i < ids.length; i++) {
				url = this.getURLConnection(
						"DELETE",
						this.getBaseURL() + this.getDomainsURL()
								+ this.getMainDomain() + this.getRecordsURL()
								+ ids[i]);
				response = this.getResponse(url);
			}
			return true;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * This is helper method that gets the response from the server
	 */
	private String getResponse(HttpURLConnection urlc) throws Exception {
		BufferedReader br;
		try {
			br = new BufferedReader(
					new InputStreamReader(urlc.getInputStream()));
			String rl = null;
			String ret = "";
			while ((rl = br.readLine()) != null) {
				ret = ret + rl;
			}
			return ret;
		} catch (IOException ioe) {
			throw new Exception(ioe);
		}
	}

	/**
	 * This is responsible for getting all of the connections used by the public
	 * methods. It sets the HTTP method from the value passed in
	 */
	private HttpURLConnection getURLConnection(String method, String endpoint)
			throws Exception {
		URL url = new URL(endpoint);
		HttpURLConnection urlc = null;
		urlc = (HttpURLConnection) url.openConnection();

		urlc.setDoOutput(true);
		urlc.setDoInput(true);
		urlc.setAllowUserInteraction(true);
		urlc.setRequestMethod(method.toUpperCase());

		String dateHeader = this.getDateHeader();
		urlc.setRequestProperty("x-dnsme-apiKey", this.getAesKey());
		try {
			urlc.setRequestProperty("x-dnsme-hmac",
					this.getSHA1Header(dateHeader));
		} catch (Exception e) {
			throw new Exception(e);
		}
		urlc.setRequestProperty("x-dnsme-requestDate", dateHeader);
		urlc.setRequestProperty("accept", "application/json");
		return urlc;
	}

	/**
	 * This gets the HTTP date header
	 */
	private String getDateHeader() {
		DateFormat df = new SimpleDateFormat(this.getHttpDateFormat());
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date = new Date();
		return df.format(date);
	}

	/**
	 * This gets the SHA1 HTTP header
	 */
	private String getSHA1Header(String date) throws Exception {
		try {
			Mac mac = Mac.getInstance("HmacSHA1");
			SecretKeySpec secret = new SecretKeySpec(this.getSecretKey()
					.getBytes(), "HmacSHA1");
			mac.init(secret);
			byte[] digest = mac.doFinal(date.getBytes());
			StringBuffer strbuf = new StringBuffer(digest.length * 2);
			for (int i = 0; i < digest.length; i++) {
				if (((int) digest[i] & 0xff) < 0x10)
					strbuf.append("0");
				strbuf.append(Long.toString((int) digest[i] & 0xff, 16));
			}
			return strbuf.toString();
		} catch (NoSuchAlgorithmException nsa) {
			throw new Exception(nsa);
		}
	}

	// getters/setters
	private String getAesKey() {
		return aesKey;
	}

	private void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	private String getSecretKey() {
		return secretKey;
	}

	private void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	private String getHttpDateFormat() {
		return httpDateFormat;
	}

	private void setHttpDateFormat(String httpDateFormat) {
		this.httpDateFormat = httpDateFormat;
	}

	private String getBaseURL() {
		return baseURL;
	}

	private void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}

	private String getDomainsURL() {
		return domainsURL;
	}

	private void setDomainsURL(String domainsURL) {
		this.domainsURL = domainsURL;
	}

	private String getRecordsURL() {
		return recordsURL;
	}

	private void setRecordsURL(String recordsURL) {
		this.recordsURL = recordsURL;
	}

	private String getSecondaryURL() {
		return secondaryURL;
	}

	private void setSecondaryURL(String secondaryURL) {
		this.secondaryURL = secondaryURL;
	}

	private String getMainDomain() {
		return mainDomain;
	}

	private void setMainDomain(String mainDomain) {
		this.mainDomain = mainDomain;
	}

	@Override
	public boolean createORGDomain(String orgID) {
		try {
			return addDomainRecords(orgID, getPublicIP(), getPrivateIP());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String createBoardDomain(String orgID, String boardName) {
		orgID = "demo";
		try {
			boolean domainRecordsAddedSuccessfuly = addDomainRecords(orgID,
					boardName, getPublicIP(), getPrivateIP());
			if (domainRecordsAddedSuccessfuly) {
				Domain domain = getHerokuApi().getConnection().execute(
						new DomainAdd(getHerokuAppName(), orgID + "."
								+ boardName + ".g2analytics.us"),
						getHerokuApiKey());
				if (domain != null) {
					return domain.getDomain();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// HerokuAPI api = new
		// HerokuAPI("7d2670ab-e8c0-4015-a5d4-abe455ae2332");
		// App app = api.getApp("jobboardstub");
		// Domain execute = api.getConnection().execute(new
		// DomainAdd(app.getName(), "www.kavalinovski.com"),
		// "7d2670ab-e8c0-4015-a5d4-abe455ae2332");
		// System.out.println(execute);

		// try {
		// URL url = new URL("http://fbjobboard.herokuapp.com/");
		// InetAddress[] inetAddress = InetAddress.getAllByName(url.getHost());
		// System.out.println(inetAddress[0].getHostAddress());
		// // http://107.22.249.137/
		// // 107.22.249.137
		// } catch (MalformedURLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// try {
		// boolean ret = false;
		// IDNSManager dns = new G2ADNSMadeEasy();
		//
		// // get domains
		// String domains = dns.getDomains();
		// System.out.println("From Main:  domins = " + domains);
		//
		// // delete domains
		// // ret = dns.deleteDomain("cognos", "ACME5");
		// // System.out.println("Ret from Delete = " + ret);
		//
		// // create domains and A records
		// dns.createDomain("orgid", "boardid", "54.243.160.7", "54.243.160.7");
		// } catch (Exception e) {
		// e.printStackTrace();
		// System.exit(123);
		// }

		// RunResponse runAttached = api.runAttached(app.getName(),
		// "domains:add www.kavalinovski.com/");
		// InputStream attach = runAttached.attach();
		// BufferedReader reader = new BufferedReader(new
		// InputStreamReader(attach));
		// String line = null;
		// try {
		// while ((line=reader.readLine())!=null) {
		// System.out.println(line);
		//
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public static String getPublicIP(String urlString) {
		URL url;
		try {
			url = new URL(urlString);
			InetAddress[] inetAddress = InetAddress.getAllByName(url.getHost());
			if (inetAddress != null && inetAddress.length > 0) {
				return inetAddress[0].getHostAddress();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String getPublicIP() {
		if (publicIP == null || publicIP.isEmpty()) {
			publicIP = getPublicIP(HEROKU_BOARD_STATIC_DOMAN);
		}
		return publicIP;
	}

	public void setPublicIP(String publicIP) {
		this.publicIP = publicIP;
	}

	public String getPrivateIP() {
		if (privateIP == null || privateIP.isEmpty()) {
			privateIP = getPublicIP();
		}
		return privateIP;
	}

	public void setPrivateIP(String privateIP) {
		this.privateIP = privateIP;
	}

	public HerokuAPI getHerokuApi() {
		if (herokuApi==null) {
			herokuApi = new HerokuAPI(getHerokuApiKey());
		}
		return herokuApi;
	}

	public void setHerokuApi(HerokuAPI herokuApi) {
		this.herokuApi = herokuApi;
	}

	public String getHerokuAppName() {
		return herokuAppName;
	}

	public void setHerokuAppName(String herokuAppName) {
		this.herokuAppName = herokuAppName;
	}

	public String getHerokuApiKey() {
		return herokuApiKey;
	}

	public void setHerokuKey(String herokuKey) {
		this.herokuApiKey = herokuKey;
	}

}
