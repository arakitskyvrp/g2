package com.jobboard.model.heroku.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.SearchAgent;
import com.jobboard.model.heroku.SearchAgentCriteria;

@ManagedBean(name = "searchAgentService")
@SessionScoped
public class SearchAgentService {
	private EntityManager em = EntityManagerProvider
			.createHerokuEntityManager();

	public SearchAgent saveToDatabase(SearchAgent searchAgent) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		saveToDatabaseSearchAgentCriterias(searchAgent);
		searchAgent.setCreated_Date(new Date());
		em.persist(searchAgent);
		tx.commit();
		return searchAgent;
	}

	public boolean removeFromDatabase(SearchAgent searchAgent) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		removeFromDatabaseSearchAgentCriterias(searchAgent);
		em.remove(searchAgent);
		tx.commit();
		return true;
	}

	public void saveToDatabaseSearchAgentCriterias(SearchAgent searchAgent) {
		searchAgent.setSearchAgent_ID(generateID());
		List<SearchAgentCriteria> searchAgentCriterias = searchAgent
				.getSearchAgentCriterias();
		for (SearchAgentCriteria searchAgentCriteria : searchAgentCriterias) {
			searchAgentCriteria.setCreated_Date(new Date());
			searchAgentCriteria
					.setSF_Contact_ID(searchAgent.getSF_Contact_ID());
			searchAgentCriteria.setSearchAgent_ID(searchAgent.getSearchAgent_ID());
			if (searchAgentCriteria.getCriteria_Field_ID()==null|| searchAgentCriteria.getCriteria_Field_ID().isEmpty()) {
				searchAgentCriteria.setCriteria_Field_ID(generateID());
			}
			em.persist(searchAgentCriteria);
		}
	}

	public void removeFromDatabaseSearchAgentCriterias(SearchAgent searchAgent) {
		List<SearchAgentCriteria> searchAgentCriterias = searchAgent
				.getSearchAgentCriterias();
		for (SearchAgentCriteria searchAgentCriteria : searchAgentCriterias) {
			em.remove(searchAgentCriteria);
		}
	}

	private static String generateID() {
		int length = 20;
		// 97 122 65 90
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			if (random.nextBoolean()) {
				int charInt;
				while (!(isAlphabetChar(charInt = random.nextInt(122)))) {
				}
				char c =  (char) charInt;
				sb.append(c);
			} else {
				sb.append(random.nextInt(9));
			}
			
		}
		
		return sb.toString();
	}

	private static boolean isAlphabetChar(int c) {
		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
	}

}
