package com.sforce.soap.services;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.metadata.MetadataConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

@ManagedBean(name = "soapConnectionService")
@ApplicationScoped
public class SOAPConnectionService {

	private Map<String, EnterpriseConnection> enterpriseConnections = new HashMap<String, EnterpriseConnection>();
	private Map<String, MetadataConnection> metadataConnections = new HashMap<String, MetadataConnection>();

	// static final String USERNAME = "risto.kavalinovski@76demo.com";
	// static final String PASSWORD = "Jobsience1XsuSnF52H3eKf8O3nzE0R22QI";

	public SOAPConnectionService() {
		// TODO remove this line
		addORGConnection("default", "risto.kavalinovski@76demo.com",
				"Jobsience1XsuSnF52H3eKf8O3nzE0R22QI");
	}

	static final String authEndPoint = "https://login.salesforce.com/services/Soap/c/24.0/";

	public void addORGConnection(String orgID, String username, String password) {
		if (!enterpriseConnections.containsKey(orgID)) {
			try {
				EnterpriseConnection enterpriseConnection = Connector
						.newConnection(createConnectionConfig(username,
								password));
				enterpriseConnections.put(orgID, enterpriseConnection);

			} catch (ConnectionException e) {
				e.printStackTrace();
			}
		}
		if (!metadataConnections.containsKey(orgID)) {
			try {
				MetadataConnection metadataConnection = createMetadataConnection(loginToSalesforce(
						username, password, authEndPoint));
				metadataConnections.put(orgID, metadataConnection);
			} catch (ConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void removeORGConnection(String orgID) {
		if (enterpriseConnections.containsKey(orgID)) {
			enterpriseConnections.remove(orgID);
		}
		if (metadataConnections.containsKey(orgID)) {
			enterpriseConnections.remove(orgID);
		}
	}

	private ConnectorConfig createConnectionConfig(String username,
			String password) throws ConnectionException {
		ConnectorConfig connectionConfig = new ConnectorConfig();
		connectionConfig.setServiceEndpoint(authEndPoint);
		connectionConfig.setAuthEndpoint(authEndPoint);
		connectionConfig.setUsername(username);
		connectionConfig.setPassword(password);

		return connectionConfig;
	}

	public EnterpriseConnection getEnterpriseConnection(String orgID) {
		if (enterpriseConnections.containsKey(orgID)) {
			return enterpriseConnections.get(orgID);
		}
		return null;
	}

	// TODO remove 'default' the getters

	@Deprecated
	public EnterpriseConnection getEnterpriseConnection() {
		return getEnterpriseConnection("default");
	}

	@Deprecated
	public MetadataConnection getEnterpriseMetadata() {
		return getMetadataConnection("default");
	}

	public MetadataConnection getMetadataConnection(String orgID) {
		if (metadataConnections.containsKey(orgID)) {
			return metadataConnections.get(orgID);
		}
		return null;
	}

	private static LoginResult loginToSalesforce(final String username,
			final String password, final String loginUrl)
			throws ConnectionException {
		final ConnectorConfig config = new ConnectorConfig();
		config.setAuthEndpoint(loginUrl);
		config.setServiceEndpoint(loginUrl);
		config.setManualLogin(true);
		return (new EnterpriseConnection(config)).login(username, password);
	}

	private static MetadataConnection createMetadataConnection(
			final LoginResult loginResult) throws ConnectionException {
		final ConnectorConfig config = new ConnectorConfig();
		config.setServiceEndpoint(loginResult.getMetadataServerUrl());
		config.setSessionId(loginResult.getSessionId());
		return new MetadataConnection(config);
	}

}
