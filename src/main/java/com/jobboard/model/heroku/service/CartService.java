package com.jobboard.model.heroku.service;

import java.util.Date;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.Cart;

@ManagedBean(name="cartService")
@SessionScoped
public class CartService {
	private EntityManager em = EntityManagerProvider
			.createHerokuEntityManager();
	@ManagedProperty(value = "#{candidateService}")
	private CandidateService candidateService;

	public void saveToDatabase(Cart cart) {
		cart.setCandidateCart_ID(generateID());
		cart.setCreated_Date(new Date());
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		cart = em.merge(cart);
		em.persist(cart);
		tx.commit();
		cart.getCandidate().addCart(cart);
	}
	
	public void removeFromDatabase(Cart cart) {
		cart.getCandidate().removeCart(cart);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		cart = em.merge(cart);
		em.remove(cart);
		tx.commit();
	}

	public CandidateService getCandidateService() {
		return candidateService;
	}

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
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
