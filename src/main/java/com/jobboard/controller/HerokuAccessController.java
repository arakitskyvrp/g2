package com.jobboard.controller;

import java.util.List;

import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.Referral;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

public class HerokuAccessController {

	public static Candidate getActiveUserById(String cid) {
		Candidate activeUser = null;
		if (cid != null && !cid.isEmpty()) {
			// TODO find it in persistence
			//
		}

		return activeUser;
	}

	public static List<Referral> getOpenedReferrals(Ts2__Job__c ts2Job,
			Contact ts2CandidateContact) {
		// TODO Auto-generated method stub
		// find it in persistence
		return null;
	}
}
