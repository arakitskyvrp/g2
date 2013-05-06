package com.jobboard.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.Contact;



@ManagedBean
@SessionScoped
public class SfExampleController implements Serializable{

	
	/**
	 * POC Example !
	 * 
	 *  @author a.shishkin (aleksandar.shishkin@g2atechgroup.com)
	 */
	private static final long serialVersionUID = 366500877626315725L;


	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("forceDatabase");
	
	
	@PersistenceContext(unitName="forceDatabase")
	private EntityManager em = factory.createEntityManager();
	
	private List<Contact> contacts;
	private List<Account> accounts;

	@SuppressWarnings("unchecked")
	public List<Contact> getContacts() {
		try{
			String soqlQuery = "SELECT salutation, firstName, lastName, phone FROM ts2__Job_Board_Setup__c";
	        Query q = em.createNativeQuery(soqlQuery, Contact.class);
			contacts = q.getResultList();
//			contacts = em.createNamedQuery("findAllContacts").getResultList();
    	}catch (Exception e) {
//    		contacts = em.createNamedQuery("findAllContacts").getResultList();
			System.out.println(e);
//    		e.printStackTrace();
		}
		
		
		
		return contacts;
	}
	
	
	
	

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}




	@SuppressWarnings("unchecked")
	public List<Account> getAccounts() {
		try{
//			String jpqlQuery = "SELECT a " +
//	                "FROM Account a";
//	        Query qJP = em.createQuery(jpqlQuery);
			
			
			String soqlQuery = "SELECT type, accountNumber, billingCity, phone FROM Account";
	        Query q = em.createNativeQuery(soqlQuery, Account.class);
	        accounts = q.getResultList();
//	        accounts = (List<Account>) qJP.getResultList();
//			accounts = em.createNamedQuery("findAllAccounts").getResultList();
    	}catch (Exception e) {
//    		contacts = em.createNamedQuery("findAllContacts").getResultList();
			System.out.println(e);
//    		e.printStackTrace();
		}
		
		
		
		return accounts;
	}





	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
