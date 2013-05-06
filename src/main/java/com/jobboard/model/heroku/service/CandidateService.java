package com.jobboard.model.heroku.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.Candidate;

@ManagedBean
@SessionScoped
public class CandidateService {
	private EntityManager em = EntityManagerProvider
			.createHerokuEntityManager();

	class CandidateComparable implements Comparator<Candidate>{

		@Override
		public int compare(Candidate o1, Candidate o2) {
			return o1.getExternal_Auth_ID().compareTo(o2.getExternal_Auth_ID());
		}
	}

	public Candidate saveToDatabase(Candidate candidate) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(candidate);
		tx.commit();
		return candidate;
	}

	public Candidate findCandidateByEmailService(String email){
        CriteriaQuery<Candidate> c = em.getCriteriaBuilder().createQuery(Candidate.class);
        Root<Candidate> candidate = c.from(Candidate.class);
        Predicate predicateEmail = em.getCriteriaBuilder().equal(candidate.get("username"), email);
        c.where(predicateEmail);
        List<Candidate> resultList = em.createQuery(c).getResultList();
        if (resultList.size()>0) {
        	Collections.sort(resultList, new CandidateComparable());
        	return resultList.get(0);
        }
        else
        	return null;
	}

	public Candidate update(Candidate candidate) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		candidate.setModified_Date(new Date());
		Candidate updateCandidate = em.merge(candidate);
		tx.commit();
		return updateCandidate;
	}
	
}
