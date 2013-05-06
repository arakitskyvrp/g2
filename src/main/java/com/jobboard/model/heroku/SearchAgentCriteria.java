package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the "SearchAgentCriteria" database table.
 * 
 */
@Entity
@Table(name="\"SearchAgentCriteria\"")
public class SearchAgentCriteria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Criteria_Field_ID\"")
	private String criteria_Field_ID;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Column(name="\"Criteria_Field_Desc\"")
	private String criteria_Field_Desc;

	@Column(name="\"Criteria_Value\"")
	private String criteria_Value;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"SearchAgent_ID\"")
	private String searchAgent_ID;

	@Column(name="\"SF_Contact_ID\"")
	private String SF_Contact_ID;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	//bi-directional many-to-one association to Candidate
	@PrimaryKeyJoinColumn(name="\"SF_Contact_ID\"")
	private Candidate candidate;

	//bi-directional many-to-one association to SFOrg
	@PrimaryKeyJoinColumn(name="\"SF_Contact_ID\"")
	private SFOrg sforg;

	//bi-directional many-to-one association to SearchAgent
	@PrimaryKeyJoinColumn(name="\"SearchAgent_ID\"")
	private SearchAgent searchAgent;

	public SearchAgentCriteria() {
	}

	public String getCriteria_Field_ID() {
		return this.criteria_Field_ID;
	}

	public void setCriteria_Field_ID(String criteria_Field_ID) {
		this.criteria_Field_ID = criteria_Field_ID;
	}

	public Date getCreated_Date() {
		return this.created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public String getCriteria_Field_Desc() {
		return this.criteria_Field_Desc;
	}

	public void setCriteria_Field_Desc(String criteria_Field_Desc) {
		this.criteria_Field_Desc = criteria_Field_Desc;
	}

	public String getCriteria_Value() {
		return this.criteria_Value;
	}

	public void setCriteria_Value(String criteria_Value) {
		this.criteria_Value = criteria_Value;
	}

	public Date getModified_Date() {
		return this.modified_Date;
	}

	public void setModified_Date(Date modified_Date) {
		this.modified_Date = modified_Date;
	}

	public String getSearchAgent_ID() {
		return this.searchAgent_ID;
	}

	public void setSearchAgent_ID(String searchAgent_ID) {
		this.searchAgent_ID = searchAgent_ID;
	}

	public String getSF_Contact_ID() {
		return this.SF_Contact_ID;
	}

	public void setSF_Contact_ID(String SF_Contact_ID) {
		this.SF_Contact_ID = SF_Contact_ID;
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

	public SearchAgent getSearchAgent() {
		return this.searchAgent;
	}

	public void setSearchAgent(SearchAgent searchAgent) {
		this.searchAgent = searchAgent;
	}

}