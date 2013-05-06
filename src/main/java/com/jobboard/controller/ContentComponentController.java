package com.jobboard.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ContentComponentController implements Serializable{

	private static final long serialVersionUID = 2348682073540235363L;
	private String userInfoLanguage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getUserInfoLanguage() {
		return userInfoLanguage;
	}

	public void setUserInfoLanguage(String userInfoLanguage) {
		if (userInfoLanguage == null) {
			// TODO retrieve this from heroku persistence
			// Candidate.getLanguage()
		}
		this.userInfoLanguage = userInfoLanguage;
	}

}
