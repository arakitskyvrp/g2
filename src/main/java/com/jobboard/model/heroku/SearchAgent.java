package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "SearchAgent" database table.
 * 
 */
@Entity
@Table(name="\"SearchAgent\"")
public class SearchAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"SearchAgent_ID\"")
	private String searchAgent_ID;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"SearchAgent_Name\"")
	private String searchAgent_Name;

	@Column(name="\"SF_Contact_ID\"")
	private String SF_Contact_ID;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Column(name="\"Status\"")
	private Boolean status;

	//bi-directional many-to-one association to Candidate
	@PrimaryKeyJoinColumn(name="\"SF_Contact_ID\"")
	private Candidate candidate;

	//bi-directional many-to-one association to SFOrg
	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	//bi-directional many-to-one association to SearchAgentCriteria
	@OneToMany(mappedBy="searchAgent")
	private List<SearchAgentCriteria> searchAgentCriterias;

	public SearchAgent() {
	}

	public String getSearchAgent_ID() {
		return this.searchAgent_ID;
	}

	public void setSearchAgent_ID(String searchAgent_ID) {
		this.searchAgent_ID = searchAgent_ID;
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

	public String getSearchAgent_Name() {
		return this.searchAgent_Name;
	}

	public void setSearchAgent_Name(String searchAgent_Name) {
		this.searchAgent_Name = searchAgent_Name;
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

	public List<SearchAgentCriteria> getSearchAgentCriterias() {
		return this.searchAgentCriterias;
	}

	public void setSearchAgentCriterias(List<SearchAgentCriteria> searchAgentCriterias) {
		this.searchAgentCriterias = searchAgentCriterias;
	}

	public SearchAgentCriteria addSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().add(searchAgentCriteria);
		searchAgentCriteria.setSearchAgent(this);

		return searchAgentCriteria;
	}

	public SearchAgentCriteria removeSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().remove(searchAgentCriteria);
		searchAgentCriteria.setSearchAgent(null);

		return searchAgentCriteria;
	}

}