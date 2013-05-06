package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Cart" database table.
 * 
 */
@Entity
@Table(name="\"Cart\"")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"CandidateCart_ID\"")
	private String candidateCart_ID;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"SF_Contact_ID\"")
	private String SF_Contact_ID;

	@Column(name="\"SF_Job_ID\"")
	private String SF_Job_ID;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Column(name="\"Status\"")
	private Boolean status;

	//bi-directional many-to-one association to Candidate
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"SF_Contact_ID\"")
	private Candidate candidate;

	//bi-directional many-to-one association to SFOrg
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	public Cart() {
	}

	public String getCandidateCart_ID() {
		return this.candidateCart_ID;
	}

	public void setCandidateCart_ID(String candidateCart_ID) {
		this.candidateCart_ID = candidateCart_ID;
	}

	public Date getCreated_Date() {
		return this.created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public Date getModified_Date() {
		return this.modified_Date;
	}

	public void setModified_Date(Date modified_Date) {
		this.modified_Date = modified_Date;
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

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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