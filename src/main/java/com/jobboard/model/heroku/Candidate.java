package com.jobboard.model.heroku;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Candidate" database table.
 * 
 */
@Entity
@Table(name="\"Candidate\"")
public class Candidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"SF_Contact_ID\"")
	private String SF_Contact_ID;

	@Column(name="\"Active\"")
	private Boolean active;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"Extended_Auth\"")
	private String extended_Auth;

	@Column(name="\"External_Auth_ID\"")
	private String external_Auth_ID;

	@Column(name="\"Language\"")
	private String language;

	@Column(name="\"Locale\"")
	private String locale;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"Password\"")
	private String password;

	@Column(name="\"Security_Question\"")
	private String security_Question;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Column(name="\"SQ_Answer\"")
	private String SQ_Answer;

	@Column(name="\"TimeZone\"")
	private String timeZone;

	@Column(name="\"Username\"")
	private String username;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="candidate")
	private List<Cart> carts;

	//bi-directional many-to-one association to Referral
	@OneToMany(mappedBy="candidate")
	private List<Referral> referrals;

	//bi-directional many-to-one association to SearchAgent
	@OneToMany(mappedBy="candidate")
	private List<SearchAgent> searchAgents;

	//bi-directional many-to-one association to SearchAgentCriteria
	@OneToMany(mappedBy="candidate")
	private List<SearchAgentCriteria> searchAgentCriterias;
	
	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	public Candidate() {
	}

	public String getSF_Contact_ID() {
		return this.SF_Contact_ID;
	}

	public void setSF_Contact_ID(String SF_Contact_ID) {
		this.SF_Contact_ID = SF_Contact_ID;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public String getExtended_Auth() {
		return this.extended_Auth;
	}

	public void setExtended_Auth(String extended_Auth) {
		this.extended_Auth = extended_Auth;
	}

	public String getExternal_Auth_ID() {
		return this.external_Auth_ID;
	}

	public void setExternal_Auth_ID(String external_Auth_ID) {
		this.external_Auth_ID = external_Auth_ID;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Date getModified_Date() {
		return this.modified_Date;
	}

	public void setModified_Date(Date modified_Date) {
		this.modified_Date = modified_Date;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurity_Question() {
		return this.security_Question;
	}

	public void setSecurity_Question(String security_Question) {
		this.security_Question = security_Question;
	}

	public String getSfOrgId() {
		return this.sfOrgId;
	}

	public void setSfOrgId(String sfOrgId) {
		this.sfOrgId = sfOrgId;
	}

	public String getSQ_Answer() {
		return this.SQ_Answer;
	}

	public void setSQ_Answer(String SQ_Answer) {
		this.SQ_Answer = SQ_Answer;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SFOrg getSforg() {
		return this.sforg;
	}

	public void setSforg(SFOrg sforg) {
		this.sforg = sforg;
	}

	public List<Cart> getCarts() {
		if (this.carts == null) {
			carts = new ArrayList<Cart>();
		}
		return this.carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public Cart addCart(Cart cart) {
		getCarts().add(cart);
		cart.setCandidate(this);

		return cart;
	}

	public Cart removeCart(Cart cart) {
		getCarts().remove(cart);
		cart.setCandidate(null);

		return cart;
	}

	public List<Referral> getReferrals() {
		if (this.referrals == null) {
			this.referrals = new ArrayList<Referral>();
		}
		return this.referrals;
	}

	public void setReferrals(List<Referral> referrals) {
		this.referrals = referrals;
	}

	public Referral addReferral(Referral referral) {
		getReferrals().add(referral);
		referral.setCandidate(this);

		return referral;
	}

	public Referral removeReferral(Referral referral) {
		getReferrals().remove(referral);
		referral.setCandidate(null);

		return referral;
	}

	public List<SearchAgent> getSearchAgents() {
		if (this.searchAgents == null) {
			this.searchAgents = new ArrayList<SearchAgent>();
		}
		return this.searchAgents;
	}

	public void setSearchAgents(List<SearchAgent> searchAgents) {
		this.searchAgents = searchAgents;
	}

	public SearchAgent addSearchAgent(SearchAgent searchAgent) {
		getSearchAgents().add(searchAgent);
		searchAgent.setCandidate(this);

		return searchAgent;
	}

	public SearchAgent removeSearchAgent(SearchAgent searchAgent) {
		getSearchAgents().remove(searchAgent);
		searchAgent.setCandidate(null);

		return searchAgent;
	}

	public List<SearchAgentCriteria> getSearchAgentCriterias() {
		if (this.searchAgentCriterias == null) {
			this.searchAgentCriterias = new ArrayList<SearchAgentCriteria>();
		}
		return this.searchAgentCriterias;
	}

	public void setSearchAgentCriterias(List<SearchAgentCriteria> searchAgentCriterias) {
		this.searchAgentCriterias = searchAgentCriterias;
	}

	public SearchAgentCriteria addSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().add(searchAgentCriteria);
		searchAgentCriteria.setCandidate(this);

		return searchAgentCriteria;
	}

	public SearchAgentCriteria removeSearchAgentCriteria(SearchAgentCriteria searchAgentCriteria) {
		getSearchAgentCriterias().remove(searchAgentCriteria);
		searchAgentCriteria.setCandidate(null);

		return searchAgentCriteria;
	}

}