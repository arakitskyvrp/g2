package com.jobboard.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.Cart;
import com.jobboard.model.heroku.service.CartService;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

@ManagedBean(name = "cartController")
@SessionScoped
public class CartController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6639089164037034440L;
	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{cartService}")
	private CartService cartService;

	private List<Ts2__Job__c> jobsFromCart;

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public List<Ts2__Job__c> getJobsFromCart() {
		if (jobsFromCart == null || jobsFromCart.isEmpty()) {
			refreshCart();
		}
		return jobsFromCart;
	}

	public void setJobsFromCart(List<Ts2__Job__c> jobsFromCart) {
		this.jobsFromCart = jobsFromCart;
	}

	public boolean getHaveJobsInCart() {
		return !getJobsFromCart().isEmpty();
	}

	public boolean containsJobInCart(Ts2__Job__c job) {
		JobSearchController jobSearchController = getJobSearchController();
		if (jobSearchController.getIsUserLoggedIn()) {
			List<Cart> carts = jobSearchController.getLoggedInUser()
					.getCarts();
			for (Cart cart : carts) {
				if (cart.getSF_Job_ID().equals(job.getId())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param job
	 * @return true if the job was not in cart and it is added. false otherwise
	 */
	public void addJobToCart(Ts2__Job__c job, boolean refresh) {
		System.out.println(">>adding job to cart>>" + job.getName());
		List<Cart> carts = getJobSearchController().getLoggedInUser()
				.getCarts();
		for (Cart cart : carts) {
			if (cart.getSF_Job_ID().equals(job.getId())) {
				return; // false;
			}
		}
		Cart cart = new Cart();
		cart.setCandidate(getJobSearchController().getLoggedInUser());
		cart.setSF_Contact_ID(getJobSearchController().getLoggedInUser().getSF_Contact_ID());
		cart.setStatus(true);
		cart.setSF_Job_ID(job.getId());
		getCartService().saveToDatabase(cart);
//		getJobSearchController().setLoggedInUser(getCartService().saveToDatabase(cart));
		getJobSearchController().getLoggedInUser().addCart(cart);
		if (refresh) {
			refreshCart();
		}
		// return true;

	}

	/**
	 * 
	 * @param job
	 * @return true if the job was not in cart and it is added. false otherwise
	 */
	public void addJobToCart(Ts2__Job__c job) {
		addJobToCart(job, false);
	}

	private void refreshCart() {
		Candidate loggedInUser = getJobSearchController().getLoggedInUser();
		List<Cart> carts = loggedInUser.getCarts();
		if (carts.isEmpty()) {
			jobsFromCart = new ArrayList<Ts2__Job__c>();
			return;
		}
		StringBuffer whereQuery = new StringBuffer();
		for (Cart cart : carts) {
			String id = cart.getSF_Job_ID();
			if (!whereQuery.toString().isEmpty()) {
				whereQuery.append(" OR ");
			}
			whereQuery.append("Id='" + id + "' ");
		}
		jobsFromCart = getJobSearchController().getJobOrderSOAPService()
				.queryAllWhere(whereQuery.toString());
	}

	/**
	 * 
	 * @param job
	 * @return true if the job is found in candidate cart. false otherwise
	 */
	public void removeJobToCart(Ts2__Job__c job, boolean refresh) {
		System.out.println(">>removing job to cart>>" + job.getName());
		List<Cart> carts = getJobSearchController().getLoggedInUser()
				.getCarts();
		for (Cart cart : carts) {
			if (cart.getSF_Job_ID().equals(job.getId())) {
				getJobSearchController().getLoggedInUser().getCarts()
						.remove(cart);
				getCartService().removeFromDatabase(cart);
//				getJobSearchController().setLoggedInUser(getCartService().removeFromDatabase(cart));
				if (refresh) {
					refreshCart();
				}
				return;// true;
			}
		}

		// return false;
	}

	public void removeJobToCart(Ts2__Job__c job) {
		removeJobToCart(job, false);
	}
	
	public void removeJobToCartAndRefresh(Ts2__Job__c job){
		removeJobToCart(job, true);
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

}
