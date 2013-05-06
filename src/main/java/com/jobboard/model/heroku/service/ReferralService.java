package com.jobboard.model.heroku.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.Referral;

@ManagedBean
@SessionScoped
public class ReferralService {

	private EntityManager em = EntityManagerProvider
			.createHerokuEntityManager();
	

	public Referral saveToDatabase(Referral referral) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(referral);
		tx.commit();
		return referral;
	}
	
	@SuppressWarnings("unchecked")
	public List<Referral> getReferrals(String id) {
		List<Referral> referrals = null;
		try{
			String soqlQuery = "SELECT \"Created_Date\", \"SF_Contact_ID\", \"Referral_ID\", \"Email\", \"First_Name\", \"Last_Name\", reason, \"SF_Job_ID\" FROM jobboard.\"Referrals\" WHERE \"SF_Contact_ID\"='" + id + "';";
	        Query q = em.createNativeQuery(soqlQuery, Referral.class);
	        referrals = q.getResultList();
    	}catch (Exception e) {
    		e.printStackTrace();
		}

		return referrals;
	}
	
}
