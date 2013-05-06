package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the "Referrals" database table.
 * 
 */
@Entity
@Table(name="\"Referrals\"")
public class Referral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Referral_ID\"")
	private String referral_ID;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"First_Name\"")
	private String first_Name;

	@Column(name="\"Last_Name\"")
	private String last_Name;

	@Column(name="reason")
	private String reason;

	@Column(name="\"SF_Contact_ID\"")
	private String SF_Contact_ID;

	@Column(name="\"SF_Job_ID\"")
	private String SF_Job_ID;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	//bi-directional many-to-one association to Candidate
	@PrimaryKeyJoinColumn(name="\"SF_Contact_ID\"")
	private Candidate candidate;

	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	public Referral() {
	}

	public String getReferral_ID() {
		return this.referral_ID;
	}

	public void setReferral_ID(String referral_ID) {
		this.referral_ID = referral_ID;
	}

	public Date getCreated_Date() {
		return this.created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSF_Contact_ID() {
		return this.SF_Contact_ID;
	}

	public void setSF_Contact_ID(String SF_Contact_ID) {
		this.SF_Contact_ID = SF_Contact_ID;
	}

	public String getSF_Job_ID() {
		return this.SF_Job_ID;
	}

	public void setSF_Job_ID(String SF_Job_ID) {
		this.SF_Job_ID = SF_Job_ID;
	}

	public String getSfOrgId() {
		return this.sfOrgId;
	}

	public void setSfOrgId(String sfOrgId) {
		this.sfOrgId = sfOrgId;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public SFOrg getSforg() {
		return this.sforg;
	}

	public void setSforg(SFOrg sforg) {
		this.sforg = sforg;
	}

}