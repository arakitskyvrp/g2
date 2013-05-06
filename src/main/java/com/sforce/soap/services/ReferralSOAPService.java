package com.sforce.soap.services;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.enterprise.sobject.Ts2__Referral__c;
import com.sforce.ws.ConnectionException;

@ManagedBean
@SessionScoped
public class ReferralSOAPService implements SOAPService<Ts2__Referral__c> {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	public Ts2__Referral__c saveToDatabase(Ts2__Referral__c referral) {
		EnterpriseConnection enterpriseConnection = getConnectionService()
				.getEnterpriseConnection();
		Ts2__Referral__c referrals[] = new Ts2__Referral__c[1];
		referrals[0] = referral;
		try {
			SaveResult[] create = enterpriseConnection.create(referrals);
			if (create[0].isSuccess()) {
				referral.setId(create[0].getId());
				return referral;
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Ts2__Referral__c> listElements() {
		return null;
	}

	@Override
	public Ts2__Referral__c searchForElement(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
