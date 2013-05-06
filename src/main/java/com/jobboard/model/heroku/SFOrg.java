package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "SFOrg" database table.
 * 
 */
@Entity
@Table(name="\"SFOrg\"")
public class SFOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"ORG_URL\"")
	private String orgUrl;

	private String password;

	private String token;

	private String username;

	//bi-directional many-to-one association to Candidate
	@OneToMany(mappedBy="sforg")
	private List<Candidate> candidates;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="sforg")
	private List<Cart> carts;

	//bi-directional many-to-one association to Referral
	@OneToMany(mappedBy="sforg")
	private List<Referral> referrals;

	//bi-directional many-to-one association to SearchAgent
	@OneToMany(mappedBy="sforg")
	private List<SearchAgent> searchAgents;

	//bi-directional many-to-one association to SearchAgentCriteria
	@OneToMany(mappedBy="sforg")
	private List<SearchAgentCriteria> searchAgentCriterias;

	//bi-directional many-to-one association to Template
	@OneToMany(mappedBy="sforg")
	private List<Template> templates;

	//bi-directional many-to-one association to Translation_Table
	@OneToMany(mappedBy="sforg")
	private List<Translation_Table> translationTables;

	public SFOrg() {
	}

	public String getSfOrgId() {
		return this.sfOrgId;
	}

	public void setSfOrgId(String sfOrgId) {
		this.sfOrgId = sfOrgId;
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

	public String getOrgUrl() {
		return this.orgUrl;
	}

	public void setOrgUrl(String orgUrl) {
		this.orgUrl = orgUrl;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Candidate addCandidate(Candidate candidate) {
		getCandidates().add(candidate);
		candidate.setSforg(this);

		return candidate;
	}

	public Candidate removeCandidate(Candidate candidate) {
		getCandidates().remove(candidate);
		candidate.setSforg(null);

		return candidate;
	}

	public List<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public Cart addCart(Cart cart) {
		getCarts().add(cart);
		cart.setSforg(this);

		return cart;
	}

	public Cart removeCart(Cart cart) {
		getCarts().remove(cart);
		cart.setSforg(null);

		return cart;
	}

	public List<Referral> getReferrals() {
		return this.referrals;
	}

	public void setReferrals(List<Referral> referrals) {
		this.referrals = referrals;
	}

	public Referral addReferral(Referral referral) {
		getReferrals().add(referral);
		referral.setSforg(this);

		return referral;
	}

	public Referral removeReferral(Referral referral) {
		getReferrals().remove(referral);
		referral.setSforg(null);

		return referral;
	}

	public List<SearchAgent> getSearchAgents() {
		return this.searchAgents;
	}

	public void setSearchAgents(List<SearchAgent> searchAgents) {
		this.searchAgents = searchAgents;
	}

	public SearchAgent addSearchAgent(SearchAgent searchAgent) {
		getSearchAgents().add(searchAgent);
		searchAgent.setSforg(this);

		return searchAgent;
	}

	public SearchAgent removeSearchAgent(SearchAgent searchAgent) {
		getSearchAgents().remove(searchAgent);
		searchAgent.setSforg(null);

		return searchAgent;
	}

	public List<SearchAgentCriteria> getSearchAgentCriterias() {
		return this.searchAgentCriterias;
	}

	public void setSearchAgentCriterias(List<SearchAgentCriteria> searchAgentCriterias) {
		this.searchAgentCriterias = searchAgentCriterias;
	}

	public SearchAgentCriteria addSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().add(searchAgentCriteria);
		searchAgentCriteria.setSforg(this);

		return searchAgentCriteria;
	}

	public SearchAgentCriteria removeSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().remove(searchAgentCriteria);
		searchAgentCriteria.setSforg(null);

		return searchAgentCriteria;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public Template addTemplate(Template template) {
		getTemplates().add(template);
		template.setSforg(this);

		return template;
	}

	public Template removeTemplate(Template template) {
		getTemplates().remove(template);
		template.setSforg(null);

		return template;
	}

	public List<Translation_Table> getTranslationTables() {
		return this.translationTables;
	}

	public void setTranslationTables(List<Translation_Table> translationTables) {
		this.translationTables = translationTables;
	}

	public Translation_Table addTranslationTable(Translation_Table translationTable) {
		getTranslationTables().add(translationTable);
		translationTable.setSforg(this);

		return translationTable;
	}

	public Translation_Table removeTranslationTable(Translation_Table translationTable) {
		getTranslationTables().remove(translationTable);
		translationTable.setSforg(null);

		return translationTable;
	}

}