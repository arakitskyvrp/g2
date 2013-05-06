package com.jobboard.oauth.scribe;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

public class OAuthServiceProvider {
	
	private OAuthServiceConfig config;
	
	public OAuthServiceProvider() {
	}
	
	public OAuthServiceProvider(OAuthServiceConfig config) {
		this.config = config;
	}

	public OAuthService getService() {
		if (config.getScope() != null)
			return new ServiceBuilder().provider(config.getApiClass())
								.apiKey(config.getApiKey())
							    .apiSecret(config.getApiSecret())
							    .callback(config.getCallback())
							    .scope(config.getScope())
							    .build();

		return new ServiceBuilder().provider(config.getApiClass())
				.apiKey(config.getApiKey())
			    .apiSecret(config.getApiSecret())
			    .callback(config.getCallback())
			    .build();
		
	}
	
}
