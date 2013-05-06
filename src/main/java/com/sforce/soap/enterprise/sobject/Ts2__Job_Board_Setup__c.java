package com.sforce.soap.enterprise.sobject;

/** * Generated class, please do not edit. */
public class Ts2__Job_Board_Setup__c extends
		com.sforce.soap.enterprise.sobject.SObject {
	/** * Constructor */
	public Ts2__Job_Board_Setup__c() {
	}

	/**
	 * * element : Apply_with_LinkedIn__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo Apply_with_LinkedIn__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Apply_with_LinkedIn__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean Apply_with_LinkedIn__c__is_set = false;
	private java.lang.Boolean Apply_with_LinkedIn__c;

	public java.lang.Boolean getApply_with_LinkedIn__c() {
		return Apply_with_LinkedIn__c;
	}

	public void setApply_with_LinkedIn__c(
			java.lang.Boolean Apply_with_LinkedIn__c) {
		this.Apply_with_LinkedIn__c = Apply_with_LinkedIn__c;
		Apply_with_LinkedIn__c__is_set = true;
	}

	/**
	 * * element : Attachments of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Attachments__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Attachments",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Attachments__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Attachments;

	public com.sforce.soap.enterprise.QueryResult getAttachments() {
		return Attachments;
	}

	public void setAttachments(
			com.sforce.soap.enterprise.QueryResult Attachments) {
		this.Attachments = Attachments;
		Attachments__is_set = true;
	}

	/**
	 * * element : Countries__c of type {http://www.w3.org/2001/XMLSchema}string
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Countries__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Countries__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Countries__c__is_set = false;
	private java.lang.String Countries__c;

	public java.lang.String getCountries__c() {
		return Countries__c;
	}

	public void setCountries__c(java.lang.String Countries__c) {
		this.Countries__c = Countries__c;
		Countries__c__is_set = true;
	}

	/**
	 * * element : CreatedBy of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "CreatedBy",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean CreatedBy__is_set = false;
	private com.sforce.soap.enterprise.sobject.User CreatedBy;

	public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
		this.CreatedBy = CreatedBy;
		CreatedBy__is_set = true;
	}

	/**
	 * * element : CreatedById of type {urn:enterprise.soap.sforce.com}ID * java
	 * type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "CreatedById",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean CreatedById__is_set = false;
	private java.lang.String CreatedById;

	public java.lang.String getCreatedById() {
		return CreatedById;
	}

	public void setCreatedById(java.lang.String CreatedById) {
		this.CreatedById = CreatedById;
		CreatedById__is_set = true;
	}

	/**
	 * * element : CreatedDate of type
	 * {http://www.w3.org/2001/XMLSchema}dateTime * java type:
	 * java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "CreatedDate",
			"http://www.w3.org/2001/XMLSchema", "dateTime", 0, 1, true);
	private boolean CreatedDate__is_set = false;
	private java.util.Calendar CreatedDate;

	public java.util.Calendar getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(java.util.Calendar CreatedDate) {
		this.CreatedDate = CreatedDate;
		CreatedDate__is_set = true;
	}

	/**
	 * * element : Custom_Questions__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Custom_Questions__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Custom_Questions__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Custom_Questions__c__is_set = false;
	private java.lang.Double Custom_Questions__c;

	public java.lang.Double getCustom_Questions__c() {
		return Custom_Questions__c;
	}

	public void setCustom_Questions__c(java.lang.Double Custom_Questions__c) {
		this.Custom_Questions__c = Custom_Questions__c;
		Custom_Questions__c__is_set = true;
	}

	/**
	 * * element : Document_URL__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Document_URL__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Document_URL__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Document_URL__c__is_set = false;
	private java.lang.String Document_URL__c;

	public java.lang.String getDocument_URL__c() {
		return Document_URL__c;
	}

	public void setDocument_URL__c(java.lang.String Document_URL__c) {
		this.Document_URL__c = Document_URL__c;
		Document_URL__c__is_set = true;
	}

	/**
	 * * element : General_Registration__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo General_Registration__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"General_Registration__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean General_Registration__c__is_set = false;
	private java.lang.Boolean General_Registration__c;

	public java.lang.Boolean getGeneral_Registration__c() {
		return General_Registration__c;
	}

	public void setGeneral_Registration__c(
			java.lang.Boolean General_Registration__c) {
		this.General_Registration__c = General_Registration__c;
		General_Registration__c__is_set = true;
	}

	/**
	 * * element : Histories of type {urn:enterprise.soap.sforce.com}QueryResult
	 * * java type: com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Histories__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Histories",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Histories__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Histories;

	public com.sforce.soap.enterprise.QueryResult getHistories() {
		return Histories;
	}

	public void setHistories(com.sforce.soap.enterprise.QueryResult Histories) {
		this.Histories = Histories;
		Histories__is_set = true;
	}

	/**
	 * * element : I_Accept_Privacy_Statement_Terms_Condi__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo I_Accept_Privacy_Statement_Terms_Condi__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"I_Accept_Privacy_Statement_Terms_Condi__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean I_Accept_Privacy_Statement_Terms_Condi__c__is_set = false;
	private java.lang.Boolean I_Accept_Privacy_Statement_Terms_Condi__c;

	public java.lang.Boolean getI_Accept_Privacy_Statement_Terms_Condi__c() {
		return I_Accept_Privacy_Statement_Terms_Condi__c;
	}

	public void setI_Accept_Privacy_Statement_Terms_Condi__c(
			java.lang.Boolean I_Accept_Privacy_Statement_Terms_Condi__c) {
		this.I_Accept_Privacy_Statement_Terms_Condi__c = I_Accept_Privacy_Statement_Terms_Condi__c;
		I_Accept_Privacy_Statement_Terms_Condi__c__is_set = true;
	}

	/**
	 * * element : Index_Additional_Attachments__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Additional_Attachments__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Index_Additional_Attachments__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Additional_Attachments__c__is_set = false;
	private java.lang.Double Index_Additional_Attachments__c;

	public java.lang.Double getIndex_Additional_Attachments__c() {
		return Index_Additional_Attachments__c;
	}

	public void setIndex_Additional_Attachments__c(
			java.lang.Double Index_Additional_Attachments__c) {
		this.Index_Additional_Attachments__c = Index_Additional_Attachments__c;
		Index_Additional_Attachments__c__is_set = true;
	}

	/**
	 * * element : Index_Compliance__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Compliance__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Index_Compliance__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Compliance__c__is_set = false;
	private java.lang.Double Index_Compliance__c;

	public java.lang.Double getIndex_Compliance__c() {
		return Index_Compliance__c;
	}

	public void setIndex_Compliance__c(java.lang.Double Index_Compliance__c) {
		this.Index_Compliance__c = Index_Compliance__c;
		Index_Compliance__c__is_set = true;
	}

	/**
	 * * element : Index_Cover_Letter__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Cover_Letter__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Index_Cover_Letter__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Cover_Letter__c__is_set = false;
	private java.lang.Double Index_Cover_Letter__c;

	public java.lang.Double getIndex_Cover_Letter__c() {
		return Index_Cover_Letter__c;
	}

	public void setIndex_Cover_Letter__c(java.lang.Double Index_Cover_Letter__c) {
		this.Index_Cover_Letter__c = Index_Cover_Letter__c;
		Index_Cover_Letter__c__is_set = true;
	}

	/**
	 * * element : Index_Custom_Questions__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Custom_Questions__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Index_Custom_Questions__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean Index_Custom_Questions__c__is_set = false;
	private java.lang.Double Index_Custom_Questions__c;

	public java.lang.Double getIndex_Custom_Questions__c() {
		return Index_Custom_Questions__c;
	}

	public void setIndex_Custom_Questions__c(
			java.lang.Double Index_Custom_Questions__c) {
		this.Index_Custom_Questions__c = Index_Custom_Questions__c;
		Index_Custom_Questions__c__is_set = true;
	}

	/**
	 * * element : Index_Forms_URL__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Forms_URL__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Index_Forms_URL__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Forms_URL__c__is_set = false;
	private java.lang.Double Index_Forms_URL__c;

	public java.lang.Double getIndex_Forms_URL__c() {
		return Index_Forms_URL__c;
	}

	public void setIndex_Forms_URL__c(java.lang.Double Index_Forms_URL__c) {
		this.Index_Forms_URL__c = Index_Forms_URL__c;
		Index_Forms_URL__c__is_set = true;
	}

	/**
	 * * element : Index_Multimedia__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Multimedia__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Index_Multimedia__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Multimedia__c__is_set = false;
	private java.lang.Double Index_Multimedia__c;

	public java.lang.Double getIndex_Multimedia__c() {
		return Index_Multimedia__c;
	}

	public void setIndex_Multimedia__c(java.lang.Double Index_Multimedia__c) {
		this.Index_Multimedia__c = Index_Multimedia__c;
		Index_Multimedia__c__is_set = true;
	}

	/**
	 * * element : Index_Resume_Upload__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Resume_Upload__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Index_Resume_Upload__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean Index_Resume_Upload__c__is_set = false;
	private java.lang.Double Index_Resume_Upload__c;

	public java.lang.Double getIndex_Resume_Upload__c() {
		return Index_Resume_Upload__c;
	}

	public void setIndex_Resume_Upload__c(
			java.lang.Double Index_Resume_Upload__c) {
		this.Index_Resume_Upload__c = Index_Resume_Upload__c;
		Index_Resume_Upload__c__is_set = true;
	}

	/**
	 * * element : Index_Social_Questions__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Social_Questions__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Index_Social_Questions__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean Index_Social_Questions__c__is_set = false;
	private java.lang.Double Index_Social_Questions__c;

	public java.lang.Double getIndex_Social_Questions__c() {
		return Index_Social_Questions__c;
	}

	public void setIndex_Social_Questions__c(
			java.lang.Double Index_Social_Questions__c) {
		this.Index_Social_Questions__c = Index_Social_Questions__c;
		Index_Social_Questions__c__is_set = true;
	}

	/**
	 * * element : Index_Standard_Questions__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo Index_Standard_Questions__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Index_Standard_Questions__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean Index_Standard_Questions__c__is_set = false;
	private java.lang.Double Index_Standard_Questions__c;

	public java.lang.Double getIndex_Standard_Questions__c() {
		return Index_Standard_Questions__c;
	}

	public void setIndex_Standard_Questions__c(
			java.lang.Double Index_Standard_Questions__c) {
		this.Index_Standard_Questions__c = Index_Standard_Questions__c;
		Index_Standard_Questions__c__is_set = true;
	}

	/**
	 * * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean *
	 * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "IsDeleted",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean IsDeleted__is_set = false;
	private java.lang.Boolean IsDeleted;

	public java.lang.Boolean getIsDeleted() {
		return IsDeleted;
	}

	public void setIsDeleted(java.lang.Boolean IsDeleted) {
		this.IsDeleted = IsDeleted;
		IsDeleted__is_set = true;
	}

	/**
	 * * element : JBS_ComplianceQuestions__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo JBS_ComplianceQuestions__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"JBS_ComplianceQuestions__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean JBS_ComplianceQuestions__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult JBS_ComplianceQuestions__r;

	public com.sforce.soap.enterprise.QueryResult getJBS_ComplianceQuestions__r() {
		return JBS_ComplianceQuestions__r;
	}

	public void setJBS_ComplianceQuestions__r(
			com.sforce.soap.enterprise.QueryResult JBS_ComplianceQuestions__r) {
		this.JBS_ComplianceQuestions__r = JBS_ComplianceQuestions__r;
		JBS_ComplianceQuestions__r__is_set = true;
	}

	/**
	 * * element : JBS_SocialQuestions__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo JBS_SocialQuestions__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "JBS_SocialQuestions__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean JBS_SocialQuestions__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult JBS_SocialQuestions__r;

	public com.sforce.soap.enterprise.QueryResult getJBS_SocialQuestions__r() {
		return JBS_SocialQuestions__r;
	}

	public void setJBS_SocialQuestions__r(
			com.sforce.soap.enterprise.QueryResult JBS_SocialQuestions__r) {
		this.JBS_SocialQuestions__r = JBS_SocialQuestions__r;
		JBS_SocialQuestions__r__is_set = true;
	}

	/**
	 * * element : Languages__c of type {http://www.w3.org/2001/XMLSchema}string
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Languages__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Languages__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Languages__c__is_set = false;
	private java.lang.String Languages__c;

	public java.lang.String getLanguages__c() {
		return Languages__c;
	}

	public void setLanguages__c(java.lang.String Languages__c) {
		this.Languages__c = Languages__c;
		Languages__c__is_set = true;
	}

	/**
	 * * element : LastModifiedBy of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean LastModifiedBy__is_set = false;
	private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

	public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
		return LastModifiedBy;
	}

	public void setLastModifiedBy(
			com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
		this.LastModifiedBy = LastModifiedBy;
		LastModifiedBy__is_set = true;
	}

	/**
	 * * element : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "LastModifiedById",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean LastModifiedById__is_set = false;
	private java.lang.String LastModifiedById;

	public java.lang.String getLastModifiedById() {
		return LastModifiedById;
	}

	public void setLastModifiedById(java.lang.String LastModifiedById) {
		this.LastModifiedById = LastModifiedById;
		LastModifiedById__is_set = true;
	}

	/**
	 * * element : LastModifiedDate of type
	 * {http://www.w3.org/2001/XMLSchema}dateTime * java type:
	 * java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate",
			"http://www.w3.org/2001/XMLSchema", "dateTime", 0, 1, true);
	private boolean LastModifiedDate__is_set = false;
	private java.util.Calendar LastModifiedDate;

	public java.util.Calendar getLastModifiedDate() {
		return LastModifiedDate;
	}

	public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
		this.LastModifiedDate = LastModifiedDate;
		LastModifiedDate__is_set = true;
	}

	/**
	 * * element : Multimedia__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo Multimedia__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Multimedia__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean Multimedia__c__is_set = false;
	private java.lang.Boolean Multimedia__c;

	public java.lang.Boolean getMultimedia__c() {
		return Multimedia__c;
	}

	public void setMultimedia__c(java.lang.Boolean Multimedia__c) {
		this.Multimedia__c = Multimedia__c;
		Multimedia__c__is_set = true;
	}

	/**
	 * * element : Name of type {http://www.w3.org/2001/XMLSchema}string * java
	 * type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Name__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Name",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Name__is_set = false;
	private java.lang.String Name;

	public java.lang.String getName() {
		return Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
		Name__is_set = true;
	}

	/**
	 * * element : Notes of type {urn:enterprise.soap.sforce.com}QueryResult *
	 * java type: com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Notes",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Notes__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Notes;

	public com.sforce.soap.enterprise.QueryResult getNotes() {
		return Notes;
	}

	public void setNotes(com.sforce.soap.enterprise.QueryResult Notes) {
		this.Notes = Notes;
		Notes__is_set = true;
	}

	/**
	 * * element : NotesAndAttachments of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo NotesAndAttachments__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean NotesAndAttachments__is_set = false;
	private com.sforce.soap.enterprise.QueryResult NotesAndAttachments;

	public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
		return NotesAndAttachments;
	}

	public void setNotesAndAttachments(
			com.sforce.soap.enterprise.QueryResult NotesAndAttachments) {
		this.NotesAndAttachments = NotesAndAttachments;
		NotesAndAttachments__is_set = true;
	}

	/**
	 * * element : Owner of type {urn:sobject.enterprise.soap.sforce.com}Name *
	 * java type: com.sforce.soap.enterprise.sobject.Name
	 */
	private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Owner",
			"urn:sobject.enterprise.soap.sforce.com", "Name", 0, 1, true);
	private boolean Owner__is_set = false;
	private com.sforce.soap.enterprise.sobject.Name Owner;

	public com.sforce.soap.enterprise.sobject.Name getOwner() {
		return Owner;
	}

	public void setOwner(com.sforce.soap.enterprise.sobject.Name Owner) {
		this.Owner = Owner;
		Owner__is_set = true;
	}

	/**
	 * * element : OwnerId of type {urn:enterprise.soap.sforce.com}ID * java
	 * type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo OwnerId__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "OwnerId",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean OwnerId__is_set = false;
	private java.lang.String OwnerId;

	public java.lang.String getOwnerId() {
		return OwnerId;
	}

	public void setOwnerId(java.lang.String OwnerId) {
		this.OwnerId = OwnerId;
		OwnerId__is_set = true;
	}

	/**
	 * * element : ProcessInstances of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ProcessInstances__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ProcessInstances",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ProcessInstances__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ProcessInstances;

	public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
		return ProcessInstances;
	}

	public void setProcessInstances(
			com.sforce.soap.enterprise.QueryResult ProcessInstances) {
		this.ProcessInstances = ProcessInstances;
		ProcessInstances__is_set = true;
	}

	/**
	 * * element : ProcessSteps of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ProcessSteps__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ProcessSteps",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ProcessSteps__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ProcessSteps;

	public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
		return ProcessSteps;
	}

	public void setProcessSteps(
			com.sforce.soap.enterprise.QueryResult ProcessSteps) {
		this.ProcessSteps = ProcessSteps;
		ProcessSteps__is_set = true;
	}

	/**
	 * * element : RSS_XML_Feeds__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo RSS_XML_Feeds__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "RSS_XML_Feeds__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean RSS_XML_Feeds__c__is_set = false;
	private java.lang.Boolean RSS_XML_Feeds__c;

	public java.lang.Boolean getRSS_XML_Feeds__c() {
		return RSS_XML_Feeds__c;
	}

	public void setRSS_XML_Feeds__c(java.lang.Boolean RSS_XML_Feeds__c) {
		this.RSS_XML_Feeds__c = RSS_XML_Feeds__c;
		RSS_XML_Feeds__c__is_set = true;
	}

	/**
	 * * element : RecordType of type
	 * {urn:sobject.enterprise.soap.sforce.com}RecordType * java type:
	 * com.sforce.soap.enterprise.sobject.RecordType
	 */
	private static final com.sforce.ws.bind.TypeInfo RecordType__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "RecordType",
			"urn:sobject.enterprise.soap.sforce.com", "RecordType", 0, 1, true);
	private boolean RecordType__is_set = false;
	private com.sforce.soap.enterprise.sobject.RecordType RecordType;

	public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
		return RecordType;
	}

	public void setRecordType(
			com.sforce.soap.enterprise.sobject.RecordType RecordType) {
		this.RecordType = RecordType;
		RecordType__is_set = true;
	}

	/**
	 * * element : RecordTypeId of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo RecordTypeId__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "RecordTypeId",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean RecordTypeId__is_set = false;
	private java.lang.String RecordTypeId;

	public java.lang.String getRecordTypeId() {
		return RecordTypeId;
	}

	public void setRecordTypeId(java.lang.String RecordTypeId) {
		this.RecordTypeId = RecordTypeId;
		RecordTypeId__is_set = true;
	}

	/**
	 * * element : Setup_Questions__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Setup_Questions__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Setup_Questions__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Setup_Questions__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Setup_Questions__r;

	public com.sforce.soap.enterprise.QueryResult getSetup_Questions__r() {
		return Setup_Questions__r;
	}

	public void setSetup_Questions__r(
			com.sforce.soap.enterprise.QueryResult Setup_Questions__r) {
		this.Setup_Questions__r = Setup_Questions__r;
		Setup_Questions__r__is_set = true;
	}

	/**
	 * * element : Social_Networks__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Social_Networks__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Social_Networks__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Social_Networks__c__is_set = false;
	private java.lang.String Social_Networks__c;

	public java.lang.String getSocial_Networks__c() {
		return Social_Networks__c;
	}

	public void setSocial_Networks__c(java.lang.String Social_Networks__c) {
		this.Social_Networks__c = Social_Networks__c;
		Social_Networks__c__is_set = true;
	}

	/**
	 * * element : SystemModstamp of type
	 * {http://www.w3.org/2001/XMLSchema}dateTime * java type:
	 * java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "SystemModstamp",
			"http://www.w3.org/2001/XMLSchema", "dateTime", 0, 1, true);
	private boolean SystemModstamp__is_set = false;
	private java.util.Calendar SystemModstamp;

	public java.util.Calendar getSystemModstamp() {
		return SystemModstamp;
	}

	public void setSystemModstamp(java.util.Calendar SystemModstamp) {
		this.SystemModstamp = SystemModstamp;
		SystemModstamp__is_set = true;
	}

	/**
	 * * element : Tags of type {urn:enterprise.soap.sforce.com}QueryResult *
	 * java type: com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Tags__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Tags",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Tags__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Tags;

	public com.sforce.soap.enterprise.QueryResult getTags() {
		return Tags;
	}

	public void setTags(com.sforce.soap.enterprise.QueryResult Tags) {
		this.Tags = Tags;
		Tags__is_set = true;
	}

	/**
	 * * element : Thank_You_Page__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Thank_You_Page__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Thank_You_Page__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean Thank_You_Page__c__is_set = false;
	private java.lang.String Thank_You_Page__c;

	public java.lang.String getThank_You_Page__c() {
		return Thank_You_Page__c;
	}

	public void setThank_You_Page__c(java.lang.String Thank_You_Page__c) {
		this.Thank_You_Page__c = Thank_You_Page__c;
		Thank_You_Page__c__is_set = true;
	}

	/**
	 * * element : oAuth_on_off__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo oAuth_on_off__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "oAuth_on_off__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean oAuth_on_off__c__is_set = false;
	private java.lang.Boolean oAuth_on_off__c;

	public java.lang.Boolean getOAuth_on_off__c() {
		return oAuth_on_off__c;
	}

	public void setOAuth_on_off__c(java.lang.Boolean oAuth_on_off__c) {
		this.oAuth_on_off__c = oAuth_on_off__c;
		oAuth_on_off__c__is_set = true;
	}

	/**
	 * * element : ts2_Additional_Attachments_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_Additional_Attachments_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_Additional_Attachments_Required__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2_Additional_Attachments_Required__c__is_set = false;
	private java.lang.Boolean ts2_Additional_Attachments_Required__c;

	public java.lang.Boolean getTs2_Additional_Attachments_Required__c() {
		return ts2_Additional_Attachments_Required__c;
	}

	public void setTs2_Additional_Attachments_Required__c(
			java.lang.Boolean ts2_Additional_Attachments_Required__c) {
		this.ts2_Additional_Attachments_Required__c = ts2_Additional_Attachments_Required__c;
		ts2_Additional_Attachments_Required__c__is_set = true;
	}

	/**
	 * * element : ts2_Compliance_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_Compliance_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_Compliance_Required__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2_Compliance_Required__c__is_set = false;
	private java.lang.Boolean ts2_Compliance_Required__c;

	public java.lang.Boolean getTs2_Compliance_Required__c() {
		return ts2_Compliance_Required__c;
	}

	public void setTs2_Compliance_Required__c(
			java.lang.Boolean ts2_Compliance_Required__c) {
		this.ts2_Compliance_Required__c = ts2_Compliance_Required__c;
		ts2_Compliance_Required__c__is_set = true;
	}

	/**
	 * * element : ts2_Custom_Questions_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_Custom_Questions_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_Custom_Questions_Required__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2_Custom_Questions_Required__c__is_set = false;
	private java.lang.Boolean ts2_Custom_Questions_Required__c;

	public java.lang.Boolean getTs2_Custom_Questions_Required__c() {
		return ts2_Custom_Questions_Required__c;
	}

	public void setTs2_Custom_Questions_Required__c(
			java.lang.Boolean ts2_Custom_Questions_Required__c) {
		this.ts2_Custom_Questions_Required__c = ts2_Custom_Questions_Required__c;
		ts2_Custom_Questions_Required__c__is_set = true;
	}

	/**
	 * * element : ts2_FormsURL_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_FormsURL_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_FormsURL_Required__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2_FormsURL_Required__c__is_set = false;
	private java.lang.Boolean ts2_FormsURL_Required__c;

	public java.lang.Boolean getTs2_FormsURL_Required__c() {
		return ts2_FormsURL_Required__c;
	}

	public void setTs2_FormsURL_Required__c(
			java.lang.Boolean ts2_FormsURL_Required__c) {
		this.ts2_FormsURL_Required__c = ts2_FormsURL_Required__c;
		ts2_FormsURL_Required__c__is_set = true;
	}

	/**
	 * * element : ts2_Social_Questions_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_Social_Questions_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_Social_Questions_Required__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2_Social_Questions_Required__c__is_set = false;
	private java.lang.Boolean ts2_Social_Questions_Required__c;

	public java.lang.Boolean getTs2_Social_Questions_Required__c() {
		return ts2_Social_Questions_Required__c;
	}

	public void setTs2_Social_Questions_Required__c(
			java.lang.Boolean ts2_Social_Questions_Required__c) {
		this.ts2_Social_Questions_Required__c = ts2_Social_Questions_Required__c;
		ts2_Social_Questions_Required__c__is_set = true;
	}

	/**
	 * * element : ts2_Standard_Questions_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2_Standard_Questions_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2_Standard_Questions_Required__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2_Standard_Questions_Required__c__is_set = false;
	private java.lang.Boolean ts2_Standard_Questions_Required__c;

	public java.lang.Boolean getTs2_Standard_Questions_Required__c() {
		return ts2_Standard_Questions_Required__c;
	}

	public void setTs2_Standard_Questions_Required__c(
			java.lang.Boolean ts2_Standard_Questions_Required__c) {
		this.ts2_Standard_Questions_Required__c = ts2_Standard_Questions_Required__c;
		ts2_Standard_Questions_Required__c__is_set = true;
	}

	/**
	 * * element : ts2__AddThis_Username__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__AddThis_Username__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__AddThis_Username__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__AddThis_Username__c__is_set = false;
	private java.lang.String ts2__AddThis_Username__c;

	public java.lang.String getTs2__AddThis_Username__c() {
		return ts2__AddThis_Username__c;
	}

	public void setTs2__AddThis_Username__c(
			java.lang.String ts2__AddThis_Username__c) {
		this.ts2__AddThis_Username__c = ts2__AddThis_Username__c;
		ts2__AddThis_Username__c__is_set = true;
	}

	/**
	 * * element : ts2__Address_Validation__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Address_Validation__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Address_Validation__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Address_Validation__c__is_set = false;
	private java.lang.String ts2__Address_Validation__c;

	public java.lang.String getTs2__Address_Validation__c() {
		return ts2__Address_Validation__c;
	}

	public void setTs2__Address_Validation__c(
			java.lang.String ts2__Address_Validation__c) {
		this.ts2__Address_Validation__c = ts2__Address_Validation__c;
		ts2__Address_Validation__c__is_set = true;
	}

	/**
	 * * element : ts2__Allow_Register_Only__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Allow_Register_Only__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Allow_Register_Only__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Allow_Register_Only__c__is_set = false;
	private java.lang.Boolean ts2__Allow_Register_Only__c;

	public java.lang.Boolean getTs2__Allow_Register_Only__c() {
		return ts2__Allow_Register_Only__c;
	}

	public void setTs2__Allow_Register_Only__c(
			java.lang.Boolean ts2__Allow_Register_Only__c) {
		this.ts2__Allow_Register_Only__c = ts2__Allow_Register_Only__c;
		ts2__Allow_Register_Only__c__is_set = true;
	}

	/**
	 * * element : ts2__ApplicationsDisplayMode__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__ApplicationsDisplayMode__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__ApplicationsDisplayMode__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__ApplicationsDisplayMode__c__is_set = false;
	private java.lang.String ts2__ApplicationsDisplayMode__c;

	public java.lang.String getTs2__ApplicationsDisplayMode__c() {
		return ts2__ApplicationsDisplayMode__c;
	}

	public void setTs2__ApplicationsDisplayMode__c(
			java.lang.String ts2__ApplicationsDisplayMode__c) {
		this.ts2__ApplicationsDisplayMode__c = ts2__ApplicationsDisplayMode__c;
		ts2__ApplicationsDisplayMode__c__is_set = true;
	}

	/**
	 * * element : ts2__Apply_Referral_Immediately__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Apply_Referral_Immediately__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Apply_Referral_Immediately__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Apply_Referral_Immediately__c__is_set = false;
	private java.lang.Boolean ts2__Apply_Referral_Immediately__c;

	public java.lang.Boolean getTs2__Apply_Referral_Immediately__c() {
		return ts2__Apply_Referral_Immediately__c;
	}

	public void setTs2__Apply_Referral_Immediately__c(
			java.lang.Boolean ts2__Apply_Referral_Immediately__c) {
		this.ts2__Apply_Referral_Immediately__c = ts2__Apply_Referral_Immediately__c;
		ts2__Apply_Referral_Immediately__c__is_set = true;
	}

	/**
	 * * element : ts2__AutoAssociate__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__AutoAssociate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__AutoAssociate__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__AutoAssociate__c__is_set = false;
	private java.lang.Boolean ts2__AutoAssociate__c;

	public java.lang.Boolean getTs2__AutoAssociate__c() {
		return ts2__AutoAssociate__c;
	}

	public void setTs2__AutoAssociate__c(java.lang.Boolean ts2__AutoAssociate__c) {
		this.ts2__AutoAssociate__c = ts2__AutoAssociate__c;
		ts2__AutoAssociate__c__is_set = true;
	}

	/**
	 * * element : ts2__ConfirmationMessage__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__ConfirmationMessage__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__ConfirmationMessage__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__ConfirmationMessage__c__is_set = false;
	private java.lang.String ts2__ConfirmationMessage__c;

	public java.lang.String getTs2__ConfirmationMessage__c() {
		return ts2__ConfirmationMessage__c;
	}

	public void setTs2__ConfirmationMessage__c(
			java.lang.String ts2__ConfirmationMessage__c) {
		this.ts2__ConfirmationMessage__c = ts2__ConfirmationMessage__c;
		ts2__ConfirmationMessage__c__is_set = true;
	}

	/**
	 * * element : ts2__Disabled__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Disabled__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Disabled__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Disabled__c__is_set = false;
	private java.lang.Boolean ts2__Disabled__c;

	public java.lang.Boolean getTs2__Disabled__c() {
		return ts2__Disabled__c;
	}

	public void setTs2__Disabled__c(java.lang.Boolean ts2__Disabled__c) {
		this.ts2__Disabled__c = ts2__Disabled__c;
		ts2__Disabled__c__is_set = true;
	}

	/**
	 * * element : ts2__EEO_Text__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__EEO_Text__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__EEO_Text__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__EEO_Text__c__is_set = false;
	private java.lang.String ts2__EEO_Text__c;

	public java.lang.String getTs2__EEO_Text__c() {
		return ts2__EEO_Text__c;
	}

	public void setTs2__EEO_Text__c(java.lang.String ts2__EEO_Text__c) {
		this.ts2__EEO_Text__c = ts2__EEO_Text__c;
		ts2__EEO_Text__c__is_set = true;
	}

	/**
	 * * element : ts2__Employee_Account__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Employee_Account__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Employee_Account__c", "urn:enterprise.soap.sforce.com", "ID",
			0, 1, true);
	private boolean ts2__Employee_Account__c__is_set = false;
	private java.lang.String ts2__Employee_Account__c;

	public java.lang.String getTs2__Employee_Account__c() {
		return ts2__Employee_Account__c;
	}

	public void setTs2__Employee_Account__c(
			java.lang.String ts2__Employee_Account__c) {
		this.ts2__Employee_Account__c = ts2__Employee_Account__c;
		ts2__Employee_Account__c__is_set = true;
	}

	/**
	 * * element : ts2__Employee_Account__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}Account * java type:
	 * com.sforce.soap.enterprise.sobject.Account
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Employee_Account__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Employee_Account__r",
			"urn:sobject.enterprise.soap.sforce.com", "Account", 0, 1, true);
	private boolean ts2__Employee_Account__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Account ts2__Employee_Account__r;

	public com.sforce.soap.enterprise.sobject.Account getTs2__Employee_Account__r() {
		return ts2__Employee_Account__r;
	}

	public void setTs2__Employee_Account__r(
			com.sforce.soap.enterprise.sobject.Account ts2__Employee_Account__r) {
		this.ts2__Employee_Account__r = ts2__Employee_Account__r;
		ts2__Employee_Account__r__is_set = true;
	}

	/**
	 * * element : ts2__Enable_AddThis__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Enable_AddThis__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Enable_AddThis__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Enable_AddThis__c__is_set = false;
	private java.lang.Boolean ts2__Enable_AddThis__c;

	public java.lang.Boolean getTs2__Enable_AddThis__c() {
		return ts2__Enable_AddThis__c;
	}

	public void setTs2__Enable_AddThis__c(
			java.lang.Boolean ts2__Enable_AddThis__c) {
		this.ts2__Enable_AddThis__c = ts2__Enable_AddThis__c;
		ts2__Enable_AddThis__c__is_set = true;
	}

	/**
	 * * element : ts2__Enable_Employee_Status_Check__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Enable_Employee_Status_Check__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Enable_Employee_Status_Check__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Enable_Employee_Status_Check__c__is_set = false;
	private java.lang.Boolean ts2__Enable_Employee_Status_Check__c;

	public java.lang.Boolean getTs2__Enable_Employee_Status_Check__c() {
		return ts2__Enable_Employee_Status_Check__c;
	}

	public void setTs2__Enable_Employee_Status_Check__c(
			java.lang.Boolean ts2__Enable_Employee_Status_Check__c) {
		this.ts2__Enable_Employee_Status_Check__c = ts2__Enable_Employee_Status_Check__c;
		ts2__Enable_Employee_Status_Check__c__is_set = true;
	}

	/**
	 * * element : ts2__Enable_Lead_Tracking__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Enable_Lead_Tracking__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Enable_Lead_Tracking__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Enable_Lead_Tracking__c__is_set = false;
	private java.lang.Boolean ts2__Enable_Lead_Tracking__c;

	public java.lang.Boolean getTs2__Enable_Lead_Tracking__c() {
		return ts2__Enable_Lead_Tracking__c;
	}

	public void setTs2__Enable_Lead_Tracking__c(
			java.lang.Boolean ts2__Enable_Lead_Tracking__c) {
		this.ts2__Enable_Lead_Tracking__c = ts2__Enable_Lead_Tracking__c;
		ts2__Enable_Lead_Tracking__c__is_set = true;
	}

	/**
	 * * element : ts2__Enable_Referral_Email_Notification__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Enable_Referral_Email_Notification__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Enable_Referral_Email_Notification__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Enable_Referral_Email_Notification__c__is_set = false;
	private java.lang.Boolean ts2__Enable_Referral_Email_Notification__c;

	public java.lang.Boolean getTs2__Enable_Referral_Email_Notification__c() {
		return ts2__Enable_Referral_Email_Notification__c;
	}

	public void setTs2__Enable_Referral_Email_Notification__c(
			java.lang.Boolean ts2__Enable_Referral_Email_Notification__c) {
		this.ts2__Enable_Referral_Email_Notification__c = ts2__Enable_Referral_Email_Notification__c;
		ts2__Enable_Referral_Email_Notification__c__is_set = true;
	}

	/**
	 * * element : ts2__Enable_Submission_Feedback__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Enable_Submission_Feedback__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Enable_Submission_Feedback__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Enable_Submission_Feedback__c__is_set = false;
	private java.lang.Boolean ts2__Enable_Submission_Feedback__c;

	public java.lang.Boolean getTs2__Enable_Submission_Feedback__c() {
		return ts2__Enable_Submission_Feedback__c;
	}

	public void setTs2__Enable_Submission_Feedback__c(
			java.lang.Boolean ts2__Enable_Submission_Feedback__c) {
		this.ts2__Enable_Submission_Feedback__c = ts2__Enable_Submission_Feedback__c;
		ts2__Enable_Submission_Feedback__c__is_set = true;
	}

	/**
	 * * element : ts2__Gender__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Gender__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Gender__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Gender__c__is_set = false;
	private java.lang.Boolean ts2__Gender__c;

	public java.lang.Boolean getTs2__Gender__c() {
		return ts2__Gender__c;
	}

	public void setTs2__Gender__c(java.lang.Boolean ts2__Gender__c) {
		this.ts2__Gender__c = ts2__Gender__c;
		ts2__Gender__c__is_set = true;
	}

	/**
	 * * element : ts2__HideContactMethod__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HideContactMethod__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__HideContactMethod__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__HideContactMethod__c__is_set = false;
	private java.lang.Boolean ts2__HideContactMethod__c;

	public java.lang.Boolean getTs2__HideContactMethod__c() {
		return ts2__HideContactMethod__c;
	}

	public void setTs2__HideContactMethod__c(
			java.lang.Boolean ts2__HideContactMethod__c) {
		this.ts2__HideContactMethod__c = ts2__HideContactMethod__c;
		ts2__HideContactMethod__c__is_set = true;
	}

	/**
	 * * element : ts2__HideCoverLetter__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HideCoverLetter__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__HideCoverLetter__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__HideCoverLetter__c__is_set = false;
	private java.lang.Boolean ts2__HideCoverLetter__c;

	public java.lang.Boolean getTs2__HideCoverLetter__c() {
		return ts2__HideCoverLetter__c;
	}

	public void setTs2__HideCoverLetter__c(
			java.lang.Boolean ts2__HideCoverLetter__c) {
		this.ts2__HideCoverLetter__c = ts2__HideCoverLetter__c;
		ts2__HideCoverLetter__c__is_set = true;
	}

	/**
	 * * element : ts2__HideMobile__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HideMobile__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__HideMobile__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__HideMobile__c__is_set = false;
	private java.lang.Boolean ts2__HideMobile__c;

	public java.lang.Boolean getTs2__HideMobile__c() {
		return ts2__HideMobile__c;
	}

	public void setTs2__HideMobile__c(java.lang.Boolean ts2__HideMobile__c) {
		this.ts2__HideMobile__c = ts2__HideMobile__c;
		ts2__HideMobile__c__is_set = true;
	}

	/**
	 * * element : ts2__HidePhone__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HidePhone__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__HidePhone__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__HidePhone__c__is_set = false;
	private java.lang.Boolean ts2__HidePhone__c;

	public java.lang.Boolean getTs2__HidePhone__c() {
		return ts2__HidePhone__c;
	}

	public void setTs2__HidePhone__c(java.lang.Boolean ts2__HidePhone__c) {
		this.ts2__HidePhone__c = ts2__HidePhone__c;
		ts2__HidePhone__c__is_set = true;
	}

	/**
	 * * element : ts2__HideResumeBuilder__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HideResumeBuilder__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__HideResumeBuilder__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__HideResumeBuilder__c__is_set = false;
	private java.lang.Boolean ts2__HideResumeBuilder__c;

	public java.lang.Boolean getTs2__HideResumeBuilder__c() {
		return ts2__HideResumeBuilder__c;
	}

	public void setTs2__HideResumeBuilder__c(
			java.lang.Boolean ts2__HideResumeBuilder__c) {
		this.ts2__HideResumeBuilder__c = ts2__HideResumeBuilder__c;
		ts2__HideResumeBuilder__c__is_set = true;
	}

	/**
	 * * element : ts2__HideSourceQuestion__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HideSourceQuestion__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__HideSourceQuestion__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__HideSourceQuestion__c__is_set = false;
	private java.lang.Boolean ts2__HideSourceQuestion__c;

	public java.lang.Boolean getTs2__HideSourceQuestion__c() {
		return ts2__HideSourceQuestion__c;
	}

	public void setTs2__HideSourceQuestion__c(
			java.lang.Boolean ts2__HideSourceQuestion__c) {
		this.ts2__HideSourceQuestion__c = ts2__HideSourceQuestion__c;
		ts2__HideSourceQuestion__c__is_set = true;
	}

	/**
	 * * element : ts2__HomePage__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__HomePage__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__HomePage__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__HomePage__c__is_set = false;
	private java.lang.String ts2__HomePage__c;

	public java.lang.String getTs2__HomePage__c() {
		return ts2__HomePage__c;
	}

	public void setTs2__HomePage__c(java.lang.String ts2__HomePage__c) {
		this.ts2__HomePage__c = ts2__HomePage__c;
		ts2__HomePage__c__is_set = true;
	}

	/**
	 * * element : ts2__Internal_Application_Process__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Internal_Application_Process__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Internal_Application_Process__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Internal_Application_Process__c__is_set = false;
	private java.lang.String ts2__Internal_Application_Process__c;

	public java.lang.String getTs2__Internal_Application_Process__c() {
		return ts2__Internal_Application_Process__c;
	}

	public void setTs2__Internal_Application_Process__c(
			java.lang.String ts2__Internal_Application_Process__c) {
		this.ts2__Internal_Application_Process__c = ts2__Internal_Application_Process__c;
		ts2__Internal_Application_Process__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription10__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription10__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription10__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription10__c__is_set = false;
	private java.lang.String ts2__JobDescription10__c;

	public java.lang.String getTs2__JobDescription10__c() {
		return ts2__JobDescription10__c;
	}

	public void setTs2__JobDescription10__c(
			java.lang.String ts2__JobDescription10__c) {
		this.ts2__JobDescription10__c = ts2__JobDescription10__c;
		ts2__JobDescription10__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription1__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription1__c__is_set = false;
	private java.lang.String ts2__JobDescription1__c;

	public java.lang.String getTs2__JobDescription1__c() {
		return ts2__JobDescription1__c;
	}

	public void setTs2__JobDescription1__c(
			java.lang.String ts2__JobDescription1__c) {
		this.ts2__JobDescription1__c = ts2__JobDescription1__c;
		ts2__JobDescription1__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription2__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription2__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription2__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription2__c__is_set = false;
	private java.lang.String ts2__JobDescription2__c;

	public java.lang.String getTs2__JobDescription2__c() {
		return ts2__JobDescription2__c;
	}

	public void setTs2__JobDescription2__c(
			java.lang.String ts2__JobDescription2__c) {
		this.ts2__JobDescription2__c = ts2__JobDescription2__c;
		ts2__JobDescription2__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription3__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription3__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription3__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription3__c__is_set = false;
	private java.lang.String ts2__JobDescription3__c;

	public java.lang.String getTs2__JobDescription3__c() {
		return ts2__JobDescription3__c;
	}

	public void setTs2__JobDescription3__c(
			java.lang.String ts2__JobDescription3__c) {
		this.ts2__JobDescription3__c = ts2__JobDescription3__c;
		ts2__JobDescription3__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription4__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription4__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription4__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription4__c__is_set = false;
	private java.lang.String ts2__JobDescription4__c;

	public java.lang.String getTs2__JobDescription4__c() {
		return ts2__JobDescription4__c;
	}

	public void setTs2__JobDescription4__c(
			java.lang.String ts2__JobDescription4__c) {
		this.ts2__JobDescription4__c = ts2__JobDescription4__c;
		ts2__JobDescription4__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription5__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription5__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription5__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription5__c__is_set = false;
	private java.lang.String ts2__JobDescription5__c;

	public java.lang.String getTs2__JobDescription5__c() {
		return ts2__JobDescription5__c;
	}

	public void setTs2__JobDescription5__c(
			java.lang.String ts2__JobDescription5__c) {
		this.ts2__JobDescription5__c = ts2__JobDescription5__c;
		ts2__JobDescription5__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription6__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription6__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription6__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription6__c__is_set = false;
	private java.lang.String ts2__JobDescription6__c;

	public java.lang.String getTs2__JobDescription6__c() {
		return ts2__JobDescription6__c;
	}

	public void setTs2__JobDescription6__c(
			java.lang.String ts2__JobDescription6__c) {
		this.ts2__JobDescription6__c = ts2__JobDescription6__c;
		ts2__JobDescription6__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription7__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription7__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription7__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription7__c__is_set = false;
	private java.lang.String ts2__JobDescription7__c;

	public java.lang.String getTs2__JobDescription7__c() {
		return ts2__JobDescription7__c;
	}

	public void setTs2__JobDescription7__c(
			java.lang.String ts2__JobDescription7__c) {
		this.ts2__JobDescription7__c = ts2__JobDescription7__c;
		ts2__JobDescription7__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription8__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription8__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription8__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription8__c__is_set = false;
	private java.lang.String ts2__JobDescription8__c;

	public java.lang.String getTs2__JobDescription8__c() {
		return ts2__JobDescription8__c;
	}

	public void setTs2__JobDescription8__c(
			java.lang.String ts2__JobDescription8__c) {
		this.ts2__JobDescription8__c = ts2__JobDescription8__c;
		ts2__JobDescription8__c__is_set = true;
	}

	/**
	 * * element : ts2__JobDescription9__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobDescription9__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobDescription9__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__JobDescription9__c__is_set = false;
	private java.lang.String ts2__JobDescription9__c;

	public java.lang.String getTs2__JobDescription9__c() {
		return ts2__JobDescription9__c;
	}

	public void setTs2__JobDescription9__c(
			java.lang.String ts2__JobDescription9__c) {
		this.ts2__JobDescription9__c = ts2__JobDescription9__c;
		ts2__JobDescription9__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Board_Type__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Board_Type__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Board_Type__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Board_Type__c__is_set = false;
	private java.lang.String ts2__Job_Board_Type__c;

	public java.lang.String getTs2__Job_Board_Type__c() {
		return ts2__Job_Board_Type__c;
	}

	public void setTs2__Job_Board_Type__c(
			java.lang.String ts2__Job_Board_Type__c) {
		this.ts2__Job_Board_Type__c = ts2__Job_Board_Type__c;
		ts2__Job_Board_Type__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Order_Job_Board_Associations__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Order_Job_Board_Associations__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Order_Job_Board_Associations__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Job_Order_Job_Board_Associations__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Job_Order_Job_Board_Associations__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Job_Order_Job_Board_Associations__r() {
		return ts2__Job_Order_Job_Board_Associations__r;
	}

	public void setTs2__Job_Order_Job_Board_Associations__r(
			com.sforce.soap.enterprise.QueryResult ts2__Job_Order_Job_Board_Associations__r) {
		this.ts2__Job_Order_Job_Board_Associations__r = ts2__Job_Order_Job_Board_Associations__r;
		ts2__Job_Order_Job_Board_Associations__r__is_set = true;
	}

	/**
	 * * element : ts2__Jobs_Per_Page__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Jobs_Per_Page__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Jobs_Per_Page__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Jobs_Per_Page__c__is_set = false;
	private java.lang.String ts2__Jobs_Per_Page__c;

	public java.lang.String getTs2__Jobs_Per_Page__c() {
		return ts2__Jobs_Per_Page__c;
	}

	public void setTs2__Jobs_Per_Page__c(java.lang.String ts2__Jobs_Per_Page__c) {
		this.ts2__Jobs_Per_Page__c = ts2__Jobs_Per_Page__c;
		ts2__Jobs_Per_Page__c__is_set = true;
	}

	/**
	 * * element : ts2__LocalizedJobDescription__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__LocalizedJobDescription__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__LocalizedJobDescription__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__LocalizedJobDescription__c__is_set = false;
	private java.lang.String ts2__LocalizedJobDescription__c;

	public java.lang.String getTs2__LocalizedJobDescription__c() {
		return ts2__LocalizedJobDescription__c;
	}

	public void setTs2__LocalizedJobDescription__c(
			java.lang.String ts2__LocalizedJobDescription__c) {
		this.ts2__LocalizedJobDescription__c = ts2__LocalizedJobDescription__c;
		ts2__LocalizedJobDescription__c__is_set = true;
	}

	/**
	 * * element : ts2__LocalizedJobName__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__LocalizedJobName__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__LocalizedJobName__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__LocalizedJobName__c__is_set = false;
	private java.lang.String ts2__LocalizedJobName__c;

	public java.lang.String getTs2__LocalizedJobName__c() {
		return ts2__LocalizedJobName__c;
	}

	public void setTs2__LocalizedJobName__c(
			java.lang.String ts2__LocalizedJobName__c) {
		this.ts2__LocalizedJobName__c = ts2__LocalizedJobName__c;
		ts2__LocalizedJobName__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Number_Open_Referrals__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Number_Open_Referrals__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Max_Number_Open_Referrals__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Number_Open_Referrals__c__is_set = false;
	private java.lang.Double ts2__Max_Number_Open_Referrals__c;

	public java.lang.Double getTs2__Max_Number_Open_Referrals__c() {
		return ts2__Max_Number_Open_Referrals__c;
	}

	public void setTs2__Max_Number_Open_Referrals__c(
			java.lang.Double ts2__Max_Number_Open_Referrals__c) {
		this.ts2__Max_Number_Open_Referrals__c = ts2__Max_Number_Open_Referrals__c;
		ts2__Max_Number_Open_Referrals__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Number_Referrals_Per_Contact__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Number_Referrals_Per_Contact__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Max_Number_Referrals_Per_Contact__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Number_Referrals_Per_Contact__c__is_set = false;
	private java.lang.Double ts2__Max_Number_Referrals_Per_Contact__c;

	public java.lang.Double getTs2__Max_Number_Referrals_Per_Contact__c() {
		return ts2__Max_Number_Referrals_Per_Contact__c;
	}

	public void setTs2__Max_Number_Referrals_Per_Contact__c(
			java.lang.Double ts2__Max_Number_Referrals_Per_Contact__c) {
		this.ts2__Max_Number_Referrals_Per_Contact__c = ts2__Max_Number_Referrals_Per_Contact__c;
		ts2__Max_Number_Referrals_Per_Contact__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_search_agents__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_search_agents__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Max_search_agents__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Max_search_agents__c__is_set = false;
	private java.lang.String ts2__Max_search_agents__c;

	public java.lang.String getTs2__Max_search_agents__c() {
		return ts2__Max_search_agents__c;
	}

	public void setTs2__Max_search_agents__c(
			java.lang.String ts2__Max_search_agents__c) {
		this.ts2__Max_search_agents__c = ts2__Max_search_agents__c;
		ts2__Max_search_agents__c__is_set = true;
	}

	/**
	 * * element : ts2__Primary__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Primary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Primary__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Primary__c__is_set = false;
	private java.lang.Boolean ts2__Primary__c;

	public java.lang.Boolean getTs2__Primary__c() {
		return ts2__Primary__c;
	}

	public void setTs2__Primary__c(java.lang.Boolean ts2__Primary__c) {
		this.ts2__Primary__c = ts2__Primary__c;
		ts2__Primary__c__is_set = true;
	}

	/**
	 * * element : ts2__Question10__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question10__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question10__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question10__c__is_set = false;
	private java.lang.String ts2__Question10__c;

	public java.lang.String getTs2__Question10__c() {
		return ts2__Question10__c;
	}

	public void setTs2__Question10__c(java.lang.String ts2__Question10__c) {
		this.ts2__Question10__c = ts2__Question10__c;
		ts2__Question10__c__is_set = true;
	}

	/**
	 * * element : ts2__Question10__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question10__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question10__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question10__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question10__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question10__r() {
		return ts2__Question10__r;
	}

	public void setTs2__Question10__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question10__r) {
		this.ts2__Question10__r = ts2__Question10__r;
		ts2__Question10__r__is_set = true;
	}

	/**
	 * * element : ts2__Question11__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question11__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question11__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question11__c__is_set = false;
	private java.lang.String ts2__Question11__c;

	public java.lang.String getTs2__Question11__c() {
		return ts2__Question11__c;
	}

	public void setTs2__Question11__c(java.lang.String ts2__Question11__c) {
		this.ts2__Question11__c = ts2__Question11__c;
		ts2__Question11__c__is_set = true;
	}

	/**
	 * * element : ts2__Question11__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question11__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question11__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question11__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question11__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question11__r() {
		return ts2__Question11__r;
	}

	public void setTs2__Question11__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question11__r) {
		this.ts2__Question11__r = ts2__Question11__r;
		ts2__Question11__r__is_set = true;
	}

	/**
	 * * element : ts2__Question12__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question12__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question12__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question12__c__is_set = false;
	private java.lang.String ts2__Question12__c;

	public java.lang.String getTs2__Question12__c() {
		return ts2__Question12__c;
	}

	public void setTs2__Question12__c(java.lang.String ts2__Question12__c) {
		this.ts2__Question12__c = ts2__Question12__c;
		ts2__Question12__c__is_set = true;
	}

	/**
	 * * element : ts2__Question12__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question12__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question12__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question12__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question12__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question12__r() {
		return ts2__Question12__r;
	}

	public void setTs2__Question12__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question12__r) {
		this.ts2__Question12__r = ts2__Question12__r;
		ts2__Question12__r__is_set = true;
	}

	/**
	 * * element : ts2__Question13__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question13__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question13__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question13__c__is_set = false;
	private java.lang.String ts2__Question13__c;

	public java.lang.String getTs2__Question13__c() {
		return ts2__Question13__c;
	}

	public void setTs2__Question13__c(java.lang.String ts2__Question13__c) {
		this.ts2__Question13__c = ts2__Question13__c;
		ts2__Question13__c__is_set = true;
	}

	/**
	 * * element : ts2__Question13__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question13__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question13__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question13__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question13__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question13__r() {
		return ts2__Question13__r;
	}

	public void setTs2__Question13__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question13__r) {
		this.ts2__Question13__r = ts2__Question13__r;
		ts2__Question13__r__is_set = true;
	}

	/**
	 * * element : ts2__Question14__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question14__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question14__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question14__c__is_set = false;
	private java.lang.String ts2__Question14__c;

	public java.lang.String getTs2__Question14__c() {
		return ts2__Question14__c;
	}

	public void setTs2__Question14__c(java.lang.String ts2__Question14__c) {
		this.ts2__Question14__c = ts2__Question14__c;
		ts2__Question14__c__is_set = true;
	}

	/**
	 * * element : ts2__Question14__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question14__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question14__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question14__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question14__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question14__r() {
		return ts2__Question14__r;
	}

	public void setTs2__Question14__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question14__r) {
		this.ts2__Question14__r = ts2__Question14__r;
		ts2__Question14__r__is_set = true;
	}

	/**
	 * * element : ts2__Question15__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question15__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question15__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question15__c__is_set = false;
	private java.lang.String ts2__Question15__c;

	public java.lang.String getTs2__Question15__c() {
		return ts2__Question15__c;
	}

	public void setTs2__Question15__c(java.lang.String ts2__Question15__c) {
		this.ts2__Question15__c = ts2__Question15__c;
		ts2__Question15__c__is_set = true;
	}

	/**
	 * * element : ts2__Question15__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question15__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question15__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question15__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question15__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question15__r() {
		return ts2__Question15__r;
	}

	public void setTs2__Question15__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question15__r) {
		this.ts2__Question15__r = ts2__Question15__r;
		ts2__Question15__r__is_set = true;
	}

	/**
	 * * element : ts2__Question16__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question16__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question16__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question16__c__is_set = false;
	private java.lang.String ts2__Question16__c;

	public java.lang.String getTs2__Question16__c() {
		return ts2__Question16__c;
	}

	public void setTs2__Question16__c(java.lang.String ts2__Question16__c) {
		this.ts2__Question16__c = ts2__Question16__c;
		ts2__Question16__c__is_set = true;
	}

	/**
	 * * element : ts2__Question16__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question16__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question16__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question16__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question16__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question16__r() {
		return ts2__Question16__r;
	}

	public void setTs2__Question16__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question16__r) {
		this.ts2__Question16__r = ts2__Question16__r;
		ts2__Question16__r__is_set = true;
	}

	/**
	 * * element : ts2__Question17__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question17__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question17__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question17__c__is_set = false;
	private java.lang.String ts2__Question17__c;

	public java.lang.String getTs2__Question17__c() {
		return ts2__Question17__c;
	}

	public void setTs2__Question17__c(java.lang.String ts2__Question17__c) {
		this.ts2__Question17__c = ts2__Question17__c;
		ts2__Question17__c__is_set = true;
	}

	/**
	 * * element : ts2__Question17__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question17__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question17__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question17__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question17__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question17__r() {
		return ts2__Question17__r;
	}

	public void setTs2__Question17__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question17__r) {
		this.ts2__Question17__r = ts2__Question17__r;
		ts2__Question17__r__is_set = true;
	}

	/**
	 * * element : ts2__Question18__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question18__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question18__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question18__c__is_set = false;
	private java.lang.String ts2__Question18__c;

	public java.lang.String getTs2__Question18__c() {
		return ts2__Question18__c;
	}

	public void setTs2__Question18__c(java.lang.String ts2__Question18__c) {
		this.ts2__Question18__c = ts2__Question18__c;
		ts2__Question18__c__is_set = true;
	}

	/**
	 * * element : ts2__Question18__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question18__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question18__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question18__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question18__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question18__r() {
		return ts2__Question18__r;
	}

	public void setTs2__Question18__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question18__r) {
		this.ts2__Question18__r = ts2__Question18__r;
		ts2__Question18__r__is_set = true;
	}

	/**
	 * * element : ts2__Question19__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question19__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question19__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question19__c__is_set = false;
	private java.lang.String ts2__Question19__c;

	public java.lang.String getTs2__Question19__c() {
		return ts2__Question19__c;
	}

	public void setTs2__Question19__c(java.lang.String ts2__Question19__c) {
		this.ts2__Question19__c = ts2__Question19__c;
		ts2__Question19__c__is_set = true;
	}

	/**
	 * * element : ts2__Question19__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question19__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question19__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question19__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question19__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question19__r() {
		return ts2__Question19__r;
	}

	public void setTs2__Question19__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question19__r) {
		this.ts2__Question19__r = ts2__Question19__r;
		ts2__Question19__r__is_set = true;
	}

	/**
	 * * element : ts2__Question1__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question1__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question1__c__is_set = false;
	private java.lang.String ts2__Question1__c;

	public java.lang.String getTs2__Question1__c() {
		return ts2__Question1__c;
	}

	public void setTs2__Question1__c(java.lang.String ts2__Question1__c) {
		this.ts2__Question1__c = ts2__Question1__c;
		ts2__Question1__c__is_set = true;
	}

	/**
	 * * element : ts2__Question1__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question1__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question1__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question1__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question1__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question1__r() {
		return ts2__Question1__r;
	}

	public void setTs2__Question1__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question1__r) {
		this.ts2__Question1__r = ts2__Question1__r;
		ts2__Question1__r__is_set = true;
	}

	/**
	 * * element : ts2__Question20__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question20__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question20__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question20__c__is_set = false;
	private java.lang.String ts2__Question20__c;

	public java.lang.String getTs2__Question20__c() {
		return ts2__Question20__c;
	}

	public void setTs2__Question20__c(java.lang.String ts2__Question20__c) {
		this.ts2__Question20__c = ts2__Question20__c;
		ts2__Question20__c__is_set = true;
	}

	/**
	 * * element : ts2__Question20__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question20__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question20__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question20__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question20__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question20__r() {
		return ts2__Question20__r;
	}

	public void setTs2__Question20__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question20__r) {
		this.ts2__Question20__r = ts2__Question20__r;
		ts2__Question20__r__is_set = true;
	}

	/**
	 * * element : ts2__Question2__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question2__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question2__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question2__c__is_set = false;
	private java.lang.String ts2__Question2__c;

	public java.lang.String getTs2__Question2__c() {
		return ts2__Question2__c;
	}

	public void setTs2__Question2__c(java.lang.String ts2__Question2__c) {
		this.ts2__Question2__c = ts2__Question2__c;
		ts2__Question2__c__is_set = true;
	}

	/**
	 * * element : ts2__Question2__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question2__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question2__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question2__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question2__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question2__r() {
		return ts2__Question2__r;
	}

	public void setTs2__Question2__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question2__r) {
		this.ts2__Question2__r = ts2__Question2__r;
		ts2__Question2__r__is_set = true;
	}

	/**
	 * * element : ts2__Question3__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question3__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question3__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question3__c__is_set = false;
	private java.lang.String ts2__Question3__c;

	public java.lang.String getTs2__Question3__c() {
		return ts2__Question3__c;
	}

	public void setTs2__Question3__c(java.lang.String ts2__Question3__c) {
		this.ts2__Question3__c = ts2__Question3__c;
		ts2__Question3__c__is_set = true;
	}

	/**
	 * * element : ts2__Question3__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question3__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question3__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question3__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question3__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question3__r() {
		return ts2__Question3__r;
	}

	public void setTs2__Question3__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question3__r) {
		this.ts2__Question3__r = ts2__Question3__r;
		ts2__Question3__r__is_set = true;
	}

	/**
	 * * element : ts2__Question4__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question4__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question4__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question4__c__is_set = false;
	private java.lang.String ts2__Question4__c;

	public java.lang.String getTs2__Question4__c() {
		return ts2__Question4__c;
	}

	public void setTs2__Question4__c(java.lang.String ts2__Question4__c) {
		this.ts2__Question4__c = ts2__Question4__c;
		ts2__Question4__c__is_set = true;
	}

	/**
	 * * element : ts2__Question4__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question4__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question4__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question4__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question4__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question4__r() {
		return ts2__Question4__r;
	}

	public void setTs2__Question4__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question4__r) {
		this.ts2__Question4__r = ts2__Question4__r;
		ts2__Question4__r__is_set = true;
	}

	/**
	 * * element : ts2__Question5__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question5__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question5__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question5__c__is_set = false;
	private java.lang.String ts2__Question5__c;

	public java.lang.String getTs2__Question5__c() {
		return ts2__Question5__c;
	}

	public void setTs2__Question5__c(java.lang.String ts2__Question5__c) {
		this.ts2__Question5__c = ts2__Question5__c;
		ts2__Question5__c__is_set = true;
	}

	/**
	 * * element : ts2__Question5__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question5__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question5__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question5__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question5__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question5__r() {
		return ts2__Question5__r;
	}

	public void setTs2__Question5__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question5__r) {
		this.ts2__Question5__r = ts2__Question5__r;
		ts2__Question5__r__is_set = true;
	}

	/**
	 * * element : ts2__Question6__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question6__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question6__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question6__c__is_set = false;
	private java.lang.String ts2__Question6__c;

	public java.lang.String getTs2__Question6__c() {
		return ts2__Question6__c;
	}

	public void setTs2__Question6__c(java.lang.String ts2__Question6__c) {
		this.ts2__Question6__c = ts2__Question6__c;
		ts2__Question6__c__is_set = true;
	}

	/**
	 * * element : ts2__Question6__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question6__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question6__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question6__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question6__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question6__r() {
		return ts2__Question6__r;
	}

	public void setTs2__Question6__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question6__r) {
		this.ts2__Question6__r = ts2__Question6__r;
		ts2__Question6__r__is_set = true;
	}

	/**
	 * * element : ts2__Question7__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question7__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question7__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question7__c__is_set = false;
	private java.lang.String ts2__Question7__c;

	public java.lang.String getTs2__Question7__c() {
		return ts2__Question7__c;
	}

	public void setTs2__Question7__c(java.lang.String ts2__Question7__c) {
		this.ts2__Question7__c = ts2__Question7__c;
		ts2__Question7__c__is_set = true;
	}

	/**
	 * * element : ts2__Question7__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question7__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question7__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question7__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question7__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question7__r() {
		return ts2__Question7__r;
	}

	public void setTs2__Question7__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question7__r) {
		this.ts2__Question7__r = ts2__Question7__r;
		ts2__Question7__r__is_set = true;
	}

	/**
	 * * element : ts2__Question8__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question8__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question8__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question8__c__is_set = false;
	private java.lang.String ts2__Question8__c;

	public java.lang.String getTs2__Question8__c() {
		return ts2__Question8__c;
	}

	public void setTs2__Question8__c(java.lang.String ts2__Question8__c) {
		this.ts2__Question8__c = ts2__Question8__c;
		ts2__Question8__c__is_set = true;
	}

	/**
	 * * element : ts2__Question8__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question8__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question8__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question8__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question8__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question8__r() {
		return ts2__Question8__r;
	}

	public void setTs2__Question8__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question8__r) {
		this.ts2__Question8__r = ts2__Question8__r;
		ts2__Question8__r__is_set = true;
	}

	/**
	 * * element : ts2__Question9__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question9__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question9__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question9__c__is_set = false;
	private java.lang.String ts2__Question9__c;

	public java.lang.String getTs2__Question9__c() {
		return ts2__Question9__c;
	}

	public void setTs2__Question9__c(java.lang.String ts2__Question9__c) {
		this.ts2__Question9__c = ts2__Question9__c;
		ts2__Question9__c__is_set = true;
	}

	/**
	 * * element : ts2__Question9__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__StandardQuestion__c * java
	 * type: com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question9__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question9__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__StandardQuestion__c", 0, 1, true);
	private boolean ts2__Question9__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question9__r;

	public com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c getTs2__Question9__r() {
		return ts2__Question9__r;
	}

	public void setTs2__Question9__r(
			com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c ts2__Question9__r) {
		this.ts2__Question9__r = ts2__Question9__r;
		ts2__Question9__r__is_set = true;
	}

	/**
	 * * element : ts2__Race__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Race__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Race__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Race__c__is_set = false;
	private java.lang.Boolean ts2__Race__c;

	public java.lang.Boolean getTs2__Race__c() {
		return ts2__Race__c;
	}

	public void setTs2__Race__c(java.lang.Boolean ts2__Race__c) {
		this.ts2__Race__c = ts2__Race__c;
		ts2__Race__c__is_set = true;
	}

	/**
	 * * element : ts2__Referral_Expiration_Days__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Referral_Expiration_Days__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Referral_Expiration_Days__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Referral_Expiration_Days__c__is_set = false;
	private java.lang.Double ts2__Referral_Expiration_Days__c;

	public java.lang.Double getTs2__Referral_Expiration_Days__c() {
		return ts2__Referral_Expiration_Days__c;
	}

	public void setTs2__Referral_Expiration_Days__c(
			java.lang.Double ts2__Referral_Expiration_Days__c) {
		this.ts2__Referral_Expiration_Days__c = ts2__Referral_Expiration_Days__c;
		ts2__Referral_Expiration_Days__c__is_set = true;
	}

	/**
	 * * element : ts2__Register_Process__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Register_Process__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Register_Process__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Register_Process__c__is_set = false;
	private java.lang.String ts2__Register_Process__c;

	public java.lang.String getTs2__Register_Process__c() {
		return ts2__Register_Process__c;
	}

	public void setTs2__Register_Process__c(
			java.lang.String ts2__Register_Process__c) {
		this.ts2__Register_Process__c = ts2__Register_Process__c;
		ts2__Register_Process__c__is_set = true;
	}

	/**
	 * * element : ts2__Require_Submission_Feedback__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Require_Submission_Feedback__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Require_Submission_Feedback__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Require_Submission_Feedback__c__is_set = false;
	private java.lang.Boolean ts2__Require_Submission_Feedback__c;

	public java.lang.Boolean getTs2__Require_Submission_Feedback__c() {
		return ts2__Require_Submission_Feedback__c;
	}

	public void setTs2__Require_Submission_Feedback__c(
			java.lang.Boolean ts2__Require_Submission_Feedback__c) {
		this.ts2__Require_Submission_Feedback__c = ts2__Require_Submission_Feedback__c;
		ts2__Require_Submission_Feedback__c__is_set = true;
	}

	/**
	 * * element : ts2__Resume_Required__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Resume_Required__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Resume_Required__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Resume_Required__c__is_set = false;
	private java.lang.Boolean ts2__Resume_Required__c;

	public java.lang.Boolean getTs2__Resume_Required__c() {
		return ts2__Resume_Required__c;
	}

	public void setTs2__Resume_Required__c(
			java.lang.Boolean ts2__Resume_Required__c) {
		this.ts2__Resume_Required__c = ts2__Resume_Required__c;
		ts2__Resume_Required__c__is_set = true;
	}

	/**
	 * * element : ts2__Resume_Submission_Allowed__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Resume_Submission_Allowed__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Resume_Submission_Allowed__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Resume_Submission_Allowed__c__is_set = false;
	private java.lang.Boolean ts2__Resume_Submission_Allowed__c;

	public java.lang.Boolean getTs2__Resume_Submission_Allowed__c() {
		return ts2__Resume_Submission_Allowed__c;
	}

	public void setTs2__Resume_Submission_Allowed__c(
			java.lang.Boolean ts2__Resume_Submission_Allowed__c) {
		this.ts2__Resume_Submission_Allowed__c = ts2__Resume_Submission_Allowed__c;
		ts2__Resume_Submission_Allowed__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchByKeyword__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchByKeyword__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchByKeyword__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__SearchByKeyword__c__is_set = false;
	private java.lang.Boolean ts2__SearchByKeyword__c;

	public java.lang.Boolean getTs2__SearchByKeyword__c() {
		return ts2__SearchByKeyword__c;
	}

	public void setTs2__SearchByKeyword__c(
			java.lang.Boolean ts2__SearchByKeyword__c) {
		this.ts2__SearchByKeyword__c = ts2__SearchByKeyword__c;
		ts2__SearchByKeyword__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchCriteria1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchCriteria1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchCriteria1__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__SearchCriteria1__c__is_set = false;
	private java.lang.String ts2__SearchCriteria1__c;

	public java.lang.String getTs2__SearchCriteria1__c() {
		return ts2__SearchCriteria1__c;
	}

	public void setTs2__SearchCriteria1__c(
			java.lang.String ts2__SearchCriteria1__c) {
		this.ts2__SearchCriteria1__c = ts2__SearchCriteria1__c;
		ts2__SearchCriteria1__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchCriteria2__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchCriteria2__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchCriteria2__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__SearchCriteria2__c__is_set = false;
	private java.lang.String ts2__SearchCriteria2__c;

	public java.lang.String getTs2__SearchCriteria2__c() {
		return ts2__SearchCriteria2__c;
	}

	public void setTs2__SearchCriteria2__c(
			java.lang.String ts2__SearchCriteria2__c) {
		this.ts2__SearchCriteria2__c = ts2__SearchCriteria2__c;
		ts2__SearchCriteria2__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchCriteria3__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchCriteria3__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchCriteria3__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__SearchCriteria3__c__is_set = false;
	private java.lang.String ts2__SearchCriteria3__c;

	public java.lang.String getTs2__SearchCriteria3__c() {
		return ts2__SearchCriteria3__c;
	}

	public void setTs2__SearchCriteria3__c(
			java.lang.String ts2__SearchCriteria3__c) {
		this.ts2__SearchCriteria3__c = ts2__SearchCriteria3__c;
		ts2__SearchCriteria3__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchCriteria4__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchCriteria4__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchCriteria4__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__SearchCriteria4__c__is_set = false;
	private java.lang.String ts2__SearchCriteria4__c;

	public java.lang.String getTs2__SearchCriteria4__c() {
		return ts2__SearchCriteria4__c;
	}

	public void setTs2__SearchCriteria4__c(
			java.lang.String ts2__SearchCriteria4__c) {
		this.ts2__SearchCriteria4__c = ts2__SearchCriteria4__c;
		ts2__SearchCriteria4__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchCriteria5__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchCriteria5__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__SearchCriteria5__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__SearchCriteria5__c__is_set = false;
	private java.lang.String ts2__SearchCriteria5__c;

	public java.lang.String getTs2__SearchCriteria5__c() {
		return ts2__SearchCriteria5__c;
	}

	public void setTs2__SearchCriteria5__c(
			java.lang.String ts2__SearchCriteria5__c) {
		this.ts2__SearchCriteria5__c = ts2__SearchCriteria5__c;
		ts2__SearchCriteria5__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchResult1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchResult1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SearchResult1__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SearchResult1__c__is_set = false;
	private java.lang.String ts2__SearchResult1__c;

	public java.lang.String getTs2__SearchResult1__c() {
		return ts2__SearchResult1__c;
	}

	public void setTs2__SearchResult1__c(java.lang.String ts2__SearchResult1__c) {
		this.ts2__SearchResult1__c = ts2__SearchResult1__c;
		ts2__SearchResult1__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchResult2__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchResult2__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SearchResult2__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SearchResult2__c__is_set = false;
	private java.lang.String ts2__SearchResult2__c;

	public java.lang.String getTs2__SearchResult2__c() {
		return ts2__SearchResult2__c;
	}

	public void setTs2__SearchResult2__c(java.lang.String ts2__SearchResult2__c) {
		this.ts2__SearchResult2__c = ts2__SearchResult2__c;
		ts2__SearchResult2__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchResult3__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchResult3__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SearchResult3__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SearchResult3__c__is_set = false;
	private java.lang.String ts2__SearchResult3__c;

	public java.lang.String getTs2__SearchResult3__c() {
		return ts2__SearchResult3__c;
	}

	public void setTs2__SearchResult3__c(java.lang.String ts2__SearchResult3__c) {
		this.ts2__SearchResult3__c = ts2__SearchResult3__c;
		ts2__SearchResult3__c__is_set = true;
	}

	/**
	 * * element : ts2__SearchResult4__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SearchResult4__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SearchResult4__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SearchResult4__c__is_set = false;
	private java.lang.String ts2__SearchResult4__c;

	public java.lang.String getTs2__SearchResult4__c() {
		return ts2__SearchResult4__c;
	}

	public void setTs2__SearchResult4__c(java.lang.String ts2__SearchResult4__c) {
		this.ts2__SearchResult4__c = ts2__SearchResult4__c;
		ts2__SearchResult4__c__is_set = true;
	}

	/**
	 * * element : ts2__Search_Agents__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Search_Agents__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Search_Agents__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Search_Agents__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Search_Agents__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Search_Agents__r() {
		return ts2__Search_Agents__r;
	}

	public void setTs2__Search_Agents__r(
			com.sforce.soap.enterprise.QueryResult ts2__Search_Agents__r) {
		this.ts2__Search_Agents__r = ts2__Search_Agents__r;
		ts2__Search_Agents__r__is_set = true;
	}

	/**
	 * * element : ts2__Show_Search_Only__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Show_Search_Only__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Show_Search_Only__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Show_Search_Only__c__is_set = false;
	private java.lang.Boolean ts2__Show_Search_Only__c;

	public java.lang.Boolean getTs2__Show_Search_Only__c() {
		return ts2__Show_Search_Only__c;
	}

	public void setTs2__Show_Search_Only__c(
			java.lang.Boolean ts2__Show_Search_Only__c) {
		this.ts2__Show_Search_Only__c = ts2__Show_Search_Only__c;
		ts2__Show_Search_Only__c__is_set = true;
	}

	/**
	 * * element : ts2__SiteName__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SiteName__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SiteName__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SiteName__c__is_set = false;
	private java.lang.String ts2__SiteName__c;

	public java.lang.String getTs2__SiteName__c() {
		return ts2__SiteName__c;
	}

	public void setTs2__SiteName__c(java.lang.String ts2__SiteName__c) {
		this.ts2__SiteName__c = ts2__SiteName__c;
		ts2__SiteName__c__is_set = true;
	}

	/**
	 * * element : ts2__SiteURL__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SiteURL__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SiteURL__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SiteURL__c__is_set = false;
	private java.lang.String ts2__SiteURL__c;

	public java.lang.String getTs2__SiteURL__c() {
		return ts2__SiteURL__c;
	}

	public void setTs2__SiteURL__c(java.lang.String ts2__SiteURL__c) {
		this.ts2__SiteURL__c = ts2__SiteURL__c;
		ts2__SiteURL__c__is_set = true;
	}

	/**
	 * * element : ts2__Source_Tracking_for_External_Referrals__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Source_Tracking_for_External_Referrals__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Source_Tracking_for_External_Referrals__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Source_Tracking_for_External_Referrals__c__is_set = false;
	private java.lang.String ts2__Source_Tracking_for_External_Referrals__c;

	public java.lang.String getTs2__Source_Tracking_for_External_Referrals__c() {
		return ts2__Source_Tracking_for_External_Referrals__c;
	}

	public void setTs2__Source_Tracking_for_External_Referrals__c(
			java.lang.String ts2__Source_Tracking_for_External_Referrals__c) {
		this.ts2__Source_Tracking_for_External_Referrals__c = ts2__Source_Tracking_for_External_Referrals__c;
		ts2__Source_Tracking_for_External_Referrals__c__is_set = true;
	}

	/**
	 * * element : ts2__Source_Tracking_for_External_Referrals__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Source__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Source__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Source_Tracking_for_External_Referrals__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Source_Tracking_for_External_Referrals__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Source__c", 0, 1,
			true);
	private boolean ts2__Source_Tracking_for_External_Referrals__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Source__c ts2__Source_Tracking_for_External_Referrals__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Source__c getTs2__Source_Tracking_for_External_Referrals__r() {
		return ts2__Source_Tracking_for_External_Referrals__r;
	}

	public void setTs2__Source_Tracking_for_External_Referrals__r(
			com.sforce.soap.enterprise.sobject.Ts2__Source__c ts2__Source_Tracking_for_External_Referrals__r) {
		this.ts2__Source_Tracking_for_External_Referrals__r = ts2__Source_Tracking_for_External_Referrals__r;
		ts2__Source_Tracking_for_External_Referrals__r__is_set = true;
	}

	/**
	 * * element : ts2__Source_Tracking_for_Internal_Referrals__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Source_Tracking_for_Internal_Referrals__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Source_Tracking_for_Internal_Referrals__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Source_Tracking_for_Internal_Referrals__c__is_set = false;
	private java.lang.String ts2__Source_Tracking_for_Internal_Referrals__c;

	public java.lang.String getTs2__Source_Tracking_for_Internal_Referrals__c() {
		return ts2__Source_Tracking_for_Internal_Referrals__c;
	}

	public void setTs2__Source_Tracking_for_Internal_Referrals__c(
			java.lang.String ts2__Source_Tracking_for_Internal_Referrals__c) {
		this.ts2__Source_Tracking_for_Internal_Referrals__c = ts2__Source_Tracking_for_Internal_Referrals__c;
		ts2__Source_Tracking_for_Internal_Referrals__c__is_set = true;
	}

	/**
	 * * element : ts2__Source_Tracking_for_Internal_Referrals__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Source__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Source__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Source_Tracking_for_Internal_Referrals__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Source_Tracking_for_Internal_Referrals__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Source__c", 0, 1,
			true);
	private boolean ts2__Source_Tracking_for_Internal_Referrals__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Source__c ts2__Source_Tracking_for_Internal_Referrals__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Source__c getTs2__Source_Tracking_for_Internal_Referrals__r() {
		return ts2__Source_Tracking_for_Internal_Referrals__r;
	}

	public void setTs2__Source_Tracking_for_Internal_Referrals__r(
			com.sforce.soap.enterprise.sobject.Ts2__Source__c ts2__Source_Tracking_for_Internal_Referrals__r) {
		this.ts2__Source_Tracking_for_Internal_Referrals__r = ts2__Source_Tracking_for_Internal_Referrals__r;
		ts2__Source_Tracking_for_Internal_Referrals__r__is_set = true;
	}

	/**
	 * * element : ts2__Veteran__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Veteran__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Veteran__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Veteran__c__is_set = false;
	private java.lang.Boolean ts2__Veteran__c;

	public java.lang.Boolean getTs2__Veteran__c() {
		return ts2__Veteran__c;
	}

	public void setTs2__Veteran__c(java.lang.Boolean ts2__Veteran__c) {
		this.ts2__Veteran__c = ts2__Veteran__c;
		ts2__Veteran__c__is_set = true;
	}

	/**   */
	public void write(javax.xml.namespace.QName __element,
			com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(),
				__element.getLocalPart());
		__typeMapper.writeXsiType(__out,
				"urn:sobject.enterprise.soap.sforce.com",
				"ts2__Job_Board_Setup__c");
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}

	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		super.writeFields(__out, __typeMapper);
		__typeMapper.writeObject(__out, Apply_with_LinkedIn__c__typeInfo,
				Apply_with_LinkedIn__c, Apply_with_LinkedIn__c__is_set);
		__typeMapper.writeObject(__out, Attachments__typeInfo, Attachments,
				Attachments__is_set);
		__typeMapper.writeString(__out, Countries__c__typeInfo, Countries__c,
				Countries__c__is_set);
		__typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy,
				CreatedBy__is_set);
		__typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById,
				CreatedById__is_set);
		__typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate,
				CreatedDate__is_set);
		__typeMapper.writeObject(__out, Custom_Questions__c__typeInfo,
				Custom_Questions__c, Custom_Questions__c__is_set);
		__typeMapper.writeString(__out, Document_URL__c__typeInfo,
				Document_URL__c, Document_URL__c__is_set);
		__typeMapper.writeObject(__out, General_Registration__c__typeInfo,
				General_Registration__c, General_Registration__c__is_set);
		__typeMapper.writeObject(__out, Histories__typeInfo, Histories,
				Histories__is_set);
		__typeMapper.writeObject(__out,
				I_Accept_Privacy_Statement_Terms_Condi__c__typeInfo,
				I_Accept_Privacy_Statement_Terms_Condi__c,
				I_Accept_Privacy_Statement_Terms_Condi__c__is_set);
		__typeMapper.writeObject(__out,
				Index_Additional_Attachments__c__typeInfo,
				Index_Additional_Attachments__c,
				Index_Additional_Attachments__c__is_set);
		__typeMapper.writeObject(__out, Index_Compliance__c__typeInfo,
				Index_Compliance__c, Index_Compliance__c__is_set);
		__typeMapper.writeObject(__out, Index_Cover_Letter__c__typeInfo,
				Index_Cover_Letter__c, Index_Cover_Letter__c__is_set);
		__typeMapper.writeObject(__out, Index_Custom_Questions__c__typeInfo,
				Index_Custom_Questions__c, Index_Custom_Questions__c__is_set);
		__typeMapper.writeObject(__out, Index_Forms_URL__c__typeInfo,
				Index_Forms_URL__c, Index_Forms_URL__c__is_set);
		__typeMapper.writeObject(__out, Index_Multimedia__c__typeInfo,
				Index_Multimedia__c, Index_Multimedia__c__is_set);
		__typeMapper.writeObject(__out, Index_Resume_Upload__c__typeInfo,
				Index_Resume_Upload__c, Index_Resume_Upload__c__is_set);
		__typeMapper.writeObject(__out, Index_Social_Questions__c__typeInfo,
				Index_Social_Questions__c, Index_Social_Questions__c__is_set);
		__typeMapper.writeObject(__out, Index_Standard_Questions__c__typeInfo,
				Index_Standard_Questions__c,
				Index_Standard_Questions__c__is_set);
		__typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted,
				IsDeleted__is_set);
		__typeMapper.writeObject(__out, JBS_ComplianceQuestions__r__typeInfo,
				JBS_ComplianceQuestions__r, JBS_ComplianceQuestions__r__is_set);
		__typeMapper.writeObject(__out, JBS_SocialQuestions__r__typeInfo,
				JBS_SocialQuestions__r, JBS_SocialQuestions__r__is_set);
		__typeMapper.writeString(__out, Languages__c__typeInfo, Languages__c,
				Languages__c__is_set);
		__typeMapper.writeObject(__out, LastModifiedBy__typeInfo,
				LastModifiedBy, LastModifiedBy__is_set);
		__typeMapper.writeString(__out, LastModifiedById__typeInfo,
				LastModifiedById, LastModifiedById__is_set);
		__typeMapper.writeObject(__out, LastModifiedDate__typeInfo,
				LastModifiedDate, LastModifiedDate__is_set);
		__typeMapper.writeObject(__out, Multimedia__c__typeInfo, Multimedia__c,
				Multimedia__c__is_set);
		__typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
		__typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
		__typeMapper.writeObject(__out, NotesAndAttachments__typeInfo,
				NotesAndAttachments, NotesAndAttachments__is_set);
		__typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
		__typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId,
				OwnerId__is_set);
		__typeMapper.writeObject(__out, ProcessInstances__typeInfo,
				ProcessInstances, ProcessInstances__is_set);
		__typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps,
				ProcessSteps__is_set);
		__typeMapper.writeObject(__out, RSS_XML_Feeds__c__typeInfo,
				RSS_XML_Feeds__c, RSS_XML_Feeds__c__is_set);
		__typeMapper.writeObject(__out, RecordType__typeInfo, RecordType,
				RecordType__is_set);
		__typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId,
				RecordTypeId__is_set);
		__typeMapper.writeObject(__out, Setup_Questions__r__typeInfo,
				Setup_Questions__r, Setup_Questions__r__is_set);
		__typeMapper.writeString(__out, Social_Networks__c__typeInfo,
				Social_Networks__c, Social_Networks__c__is_set);
		__typeMapper.writeObject(__out, SystemModstamp__typeInfo,
				SystemModstamp, SystemModstamp__is_set);
		__typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
		__typeMapper.writeString(__out, Thank_You_Page__c__typeInfo,
				Thank_You_Page__c, Thank_You_Page__c__is_set);
		__typeMapper.writeObject(__out, oAuth_on_off__c__typeInfo,
				oAuth_on_off__c, oAuth_on_off__c__is_set);
		__typeMapper.writeObject(__out,
				ts2_Additional_Attachments_Required__c__typeInfo,
				ts2_Additional_Attachments_Required__c,
				ts2_Additional_Attachments_Required__c__is_set);
		__typeMapper.writeObject(__out, ts2_Compliance_Required__c__typeInfo,
				ts2_Compliance_Required__c, ts2_Compliance_Required__c__is_set);
		__typeMapper.writeObject(__out,
				ts2_Custom_Questions_Required__c__typeInfo,
				ts2_Custom_Questions_Required__c,
				ts2_Custom_Questions_Required__c__is_set);
		__typeMapper.writeObject(__out, ts2_FormsURL_Required__c__typeInfo,
				ts2_FormsURL_Required__c, ts2_FormsURL_Required__c__is_set);
		__typeMapper.writeObject(__out,
				ts2_Social_Questions_Required__c__typeInfo,
				ts2_Social_Questions_Required__c,
				ts2_Social_Questions_Required__c__is_set);
		__typeMapper.writeObject(__out,
				ts2_Standard_Questions_Required__c__typeInfo,
				ts2_Standard_Questions_Required__c,
				ts2_Standard_Questions_Required__c__is_set);
		__typeMapper.writeString(__out, ts2__AddThis_Username__c__typeInfo,
				ts2__AddThis_Username__c, ts2__AddThis_Username__c__is_set);
		__typeMapper.writeString(__out, ts2__Address_Validation__c__typeInfo,
				ts2__Address_Validation__c, ts2__Address_Validation__c__is_set);
		__typeMapper.writeObject(__out, ts2__Allow_Register_Only__c__typeInfo,
				ts2__Allow_Register_Only__c,
				ts2__Allow_Register_Only__c__is_set);
		__typeMapper.writeString(__out,
				ts2__ApplicationsDisplayMode__c__typeInfo,
				ts2__ApplicationsDisplayMode__c,
				ts2__ApplicationsDisplayMode__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Apply_Referral_Immediately__c__typeInfo,
				ts2__Apply_Referral_Immediately__c,
				ts2__Apply_Referral_Immediately__c__is_set);
		__typeMapper.writeObject(__out, ts2__AutoAssociate__c__typeInfo,
				ts2__AutoAssociate__c, ts2__AutoAssociate__c__is_set);
		__typeMapper.writeString(__out, ts2__ConfirmationMessage__c__typeInfo,
				ts2__ConfirmationMessage__c,
				ts2__ConfirmationMessage__c__is_set);
		__typeMapper.writeObject(__out, ts2__Disabled__c__typeInfo,
				ts2__Disabled__c, ts2__Disabled__c__is_set);
		__typeMapper.writeString(__out, ts2__EEO_Text__c__typeInfo,
				ts2__EEO_Text__c, ts2__EEO_Text__c__is_set);
		__typeMapper.writeString(__out, ts2__Employee_Account__c__typeInfo,
				ts2__Employee_Account__c, ts2__Employee_Account__c__is_set);
		__typeMapper.writeObject(__out, ts2__Employee_Account__r__typeInfo,
				ts2__Employee_Account__r, ts2__Employee_Account__r__is_set);
		__typeMapper.writeObject(__out, ts2__Enable_AddThis__c__typeInfo,
				ts2__Enable_AddThis__c, ts2__Enable_AddThis__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Enable_Employee_Status_Check__c__typeInfo,
				ts2__Enable_Employee_Status_Check__c,
				ts2__Enable_Employee_Status_Check__c__is_set);
		__typeMapper.writeObject(__out, ts2__Enable_Lead_Tracking__c__typeInfo,
				ts2__Enable_Lead_Tracking__c,
				ts2__Enable_Lead_Tracking__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Enable_Referral_Email_Notification__c__typeInfo,
				ts2__Enable_Referral_Email_Notification__c,
				ts2__Enable_Referral_Email_Notification__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Enable_Submission_Feedback__c__typeInfo,
				ts2__Enable_Submission_Feedback__c,
				ts2__Enable_Submission_Feedback__c__is_set);
		__typeMapper.writeObject(__out, ts2__Gender__c__typeInfo,
				ts2__Gender__c, ts2__Gender__c__is_set);
		__typeMapper.writeObject(__out, ts2__HideContactMethod__c__typeInfo,
				ts2__HideContactMethod__c, ts2__HideContactMethod__c__is_set);
		__typeMapper.writeObject(__out, ts2__HideCoverLetter__c__typeInfo,
				ts2__HideCoverLetter__c, ts2__HideCoverLetter__c__is_set);
		__typeMapper.writeObject(__out, ts2__HideMobile__c__typeInfo,
				ts2__HideMobile__c, ts2__HideMobile__c__is_set);
		__typeMapper.writeObject(__out, ts2__HidePhone__c__typeInfo,
				ts2__HidePhone__c, ts2__HidePhone__c__is_set);
		__typeMapper.writeObject(__out, ts2__HideResumeBuilder__c__typeInfo,
				ts2__HideResumeBuilder__c, ts2__HideResumeBuilder__c__is_set);
		__typeMapper.writeObject(__out, ts2__HideSourceQuestion__c__typeInfo,
				ts2__HideSourceQuestion__c, ts2__HideSourceQuestion__c__is_set);
		__typeMapper.writeString(__out, ts2__HomePage__c__typeInfo,
				ts2__HomePage__c, ts2__HomePage__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Internal_Application_Process__c__typeInfo,
				ts2__Internal_Application_Process__c,
				ts2__Internal_Application_Process__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription10__c__typeInfo,
				ts2__JobDescription10__c, ts2__JobDescription10__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription1__c__typeInfo,
				ts2__JobDescription1__c, ts2__JobDescription1__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription2__c__typeInfo,
				ts2__JobDescription2__c, ts2__JobDescription2__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription3__c__typeInfo,
				ts2__JobDescription3__c, ts2__JobDescription3__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription4__c__typeInfo,
				ts2__JobDescription4__c, ts2__JobDescription4__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription5__c__typeInfo,
				ts2__JobDescription5__c, ts2__JobDescription5__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription6__c__typeInfo,
				ts2__JobDescription6__c, ts2__JobDescription6__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription7__c__typeInfo,
				ts2__JobDescription7__c, ts2__JobDescription7__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription8__c__typeInfo,
				ts2__JobDescription8__c, ts2__JobDescription8__c__is_set);
		__typeMapper.writeString(__out, ts2__JobDescription9__c__typeInfo,
				ts2__JobDescription9__c, ts2__JobDescription9__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Board_Type__c__typeInfo,
				ts2__Job_Board_Type__c, ts2__Job_Board_Type__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Job_Order_Job_Board_Associations__r__typeInfo,
				ts2__Job_Order_Job_Board_Associations__r,
				ts2__Job_Order_Job_Board_Associations__r__is_set);
		__typeMapper.writeString(__out, ts2__Jobs_Per_Page__c__typeInfo,
				ts2__Jobs_Per_Page__c, ts2__Jobs_Per_Page__c__is_set);
		__typeMapper.writeString(__out,
				ts2__LocalizedJobDescription__c__typeInfo,
				ts2__LocalizedJobDescription__c,
				ts2__LocalizedJobDescription__c__is_set);
		__typeMapper.writeString(__out, ts2__LocalizedJobName__c__typeInfo,
				ts2__LocalizedJobName__c, ts2__LocalizedJobName__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Max_Number_Open_Referrals__c__typeInfo,
				ts2__Max_Number_Open_Referrals__c,
				ts2__Max_Number_Open_Referrals__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Max_Number_Referrals_Per_Contact__c__typeInfo,
				ts2__Max_Number_Referrals_Per_Contact__c,
				ts2__Max_Number_Referrals_Per_Contact__c__is_set);
		__typeMapper.writeString(__out, ts2__Max_search_agents__c__typeInfo,
				ts2__Max_search_agents__c, ts2__Max_search_agents__c__is_set);
		__typeMapper.writeObject(__out, ts2__Primary__c__typeInfo,
				ts2__Primary__c, ts2__Primary__c__is_set);
		__typeMapper.writeString(__out, ts2__Question10__c__typeInfo,
				ts2__Question10__c, ts2__Question10__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question10__r__typeInfo,
				ts2__Question10__r, ts2__Question10__r__is_set);
		__typeMapper.writeString(__out, ts2__Question11__c__typeInfo,
				ts2__Question11__c, ts2__Question11__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question11__r__typeInfo,
				ts2__Question11__r, ts2__Question11__r__is_set);
		__typeMapper.writeString(__out, ts2__Question12__c__typeInfo,
				ts2__Question12__c, ts2__Question12__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question12__r__typeInfo,
				ts2__Question12__r, ts2__Question12__r__is_set);
		__typeMapper.writeString(__out, ts2__Question13__c__typeInfo,
				ts2__Question13__c, ts2__Question13__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question13__r__typeInfo,
				ts2__Question13__r, ts2__Question13__r__is_set);
		__typeMapper.writeString(__out, ts2__Question14__c__typeInfo,
				ts2__Question14__c, ts2__Question14__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question14__r__typeInfo,
				ts2__Question14__r, ts2__Question14__r__is_set);
		__typeMapper.writeString(__out, ts2__Question15__c__typeInfo,
				ts2__Question15__c, ts2__Question15__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question15__r__typeInfo,
				ts2__Question15__r, ts2__Question15__r__is_set);
		__typeMapper.writeString(__out, ts2__Question16__c__typeInfo,
				ts2__Question16__c, ts2__Question16__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question16__r__typeInfo,
				ts2__Question16__r, ts2__Question16__r__is_set);
		__typeMapper.writeString(__out, ts2__Question17__c__typeInfo,
				ts2__Question17__c, ts2__Question17__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question17__r__typeInfo,
				ts2__Question17__r, ts2__Question17__r__is_set);
		__typeMapper.writeString(__out, ts2__Question18__c__typeInfo,
				ts2__Question18__c, ts2__Question18__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question18__r__typeInfo,
				ts2__Question18__r, ts2__Question18__r__is_set);
		__typeMapper.writeString(__out, ts2__Question19__c__typeInfo,
				ts2__Question19__c, ts2__Question19__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question19__r__typeInfo,
				ts2__Question19__r, ts2__Question19__r__is_set);
		__typeMapper.writeString(__out, ts2__Question1__c__typeInfo,
				ts2__Question1__c, ts2__Question1__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question1__r__typeInfo,
				ts2__Question1__r, ts2__Question1__r__is_set);
		__typeMapper.writeString(__out, ts2__Question20__c__typeInfo,
				ts2__Question20__c, ts2__Question20__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question20__r__typeInfo,
				ts2__Question20__r, ts2__Question20__r__is_set);
		__typeMapper.writeString(__out, ts2__Question2__c__typeInfo,
				ts2__Question2__c, ts2__Question2__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question2__r__typeInfo,
				ts2__Question2__r, ts2__Question2__r__is_set);
		__typeMapper.writeString(__out, ts2__Question3__c__typeInfo,
				ts2__Question3__c, ts2__Question3__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question3__r__typeInfo,
				ts2__Question3__r, ts2__Question3__r__is_set);
		__typeMapper.writeString(__out, ts2__Question4__c__typeInfo,
				ts2__Question4__c, ts2__Question4__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question4__r__typeInfo,
				ts2__Question4__r, ts2__Question4__r__is_set);
		__typeMapper.writeString(__out, ts2__Question5__c__typeInfo,
				ts2__Question5__c, ts2__Question5__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question5__r__typeInfo,
				ts2__Question5__r, ts2__Question5__r__is_set);
		__typeMapper.writeString(__out, ts2__Question6__c__typeInfo,
				ts2__Question6__c, ts2__Question6__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question6__r__typeInfo,
				ts2__Question6__r, ts2__Question6__r__is_set);
		__typeMapper.writeString(__out, ts2__Question7__c__typeInfo,
				ts2__Question7__c, ts2__Question7__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question7__r__typeInfo,
				ts2__Question7__r, ts2__Question7__r__is_set);
		__typeMapper.writeString(__out, ts2__Question8__c__typeInfo,
				ts2__Question8__c, ts2__Question8__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question8__r__typeInfo,
				ts2__Question8__r, ts2__Question8__r__is_set);
		__typeMapper.writeString(__out, ts2__Question9__c__typeInfo,
				ts2__Question9__c, ts2__Question9__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question9__r__typeInfo,
				ts2__Question9__r, ts2__Question9__r__is_set);
		__typeMapper.writeObject(__out, ts2__Race__c__typeInfo, ts2__Race__c,
				ts2__Race__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Referral_Expiration_Days__c__typeInfo,
				ts2__Referral_Expiration_Days__c,
				ts2__Referral_Expiration_Days__c__is_set);
		__typeMapper.writeString(__out, ts2__Register_Process__c__typeInfo,
				ts2__Register_Process__c, ts2__Register_Process__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Require_Submission_Feedback__c__typeInfo,
				ts2__Require_Submission_Feedback__c,
				ts2__Require_Submission_Feedback__c__is_set);
		__typeMapper.writeObject(__out, ts2__Resume_Required__c__typeInfo,
				ts2__Resume_Required__c, ts2__Resume_Required__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Resume_Submission_Allowed__c__typeInfo,
				ts2__Resume_Submission_Allowed__c,
				ts2__Resume_Submission_Allowed__c__is_set);
		__typeMapper.writeObject(__out, ts2__SearchByKeyword__c__typeInfo,
				ts2__SearchByKeyword__c, ts2__SearchByKeyword__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchCriteria1__c__typeInfo,
				ts2__SearchCriteria1__c, ts2__SearchCriteria1__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchCriteria2__c__typeInfo,
				ts2__SearchCriteria2__c, ts2__SearchCriteria2__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchCriteria3__c__typeInfo,
				ts2__SearchCriteria3__c, ts2__SearchCriteria3__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchCriteria4__c__typeInfo,
				ts2__SearchCriteria4__c, ts2__SearchCriteria4__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchCriteria5__c__typeInfo,
				ts2__SearchCriteria5__c, ts2__SearchCriteria5__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchResult1__c__typeInfo,
				ts2__SearchResult1__c, ts2__SearchResult1__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchResult2__c__typeInfo,
				ts2__SearchResult2__c, ts2__SearchResult2__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchResult3__c__typeInfo,
				ts2__SearchResult3__c, ts2__SearchResult3__c__is_set);
		__typeMapper.writeString(__out, ts2__SearchResult4__c__typeInfo,
				ts2__SearchResult4__c, ts2__SearchResult4__c__is_set);
		__typeMapper.writeObject(__out, ts2__Search_Agents__r__typeInfo,
				ts2__Search_Agents__r, ts2__Search_Agents__r__is_set);
		__typeMapper.writeObject(__out, ts2__Show_Search_Only__c__typeInfo,
				ts2__Show_Search_Only__c, ts2__Show_Search_Only__c__is_set);
		__typeMapper.writeString(__out, ts2__SiteName__c__typeInfo,
				ts2__SiteName__c, ts2__SiteName__c__is_set);
		__typeMapper.writeString(__out, ts2__SiteURL__c__typeInfo,
				ts2__SiteURL__c, ts2__SiteURL__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Source_Tracking_for_External_Referrals__c__typeInfo,
				ts2__Source_Tracking_for_External_Referrals__c,
				ts2__Source_Tracking_for_External_Referrals__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Source_Tracking_for_External_Referrals__r__typeInfo,
				ts2__Source_Tracking_for_External_Referrals__r,
				ts2__Source_Tracking_for_External_Referrals__r__is_set);
		__typeMapper.writeString(__out,
				ts2__Source_Tracking_for_Internal_Referrals__c__typeInfo,
				ts2__Source_Tracking_for_Internal_Referrals__c,
				ts2__Source_Tracking_for_Internal_Referrals__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Source_Tracking_for_Internal_Referrals__r__typeInfo,
				ts2__Source_Tracking_for_Internal_Referrals__r,
				ts2__Source_Tracking_for_Internal_Referrals__r__is_set);
		__typeMapper.writeObject(__out, ts2__Veteran__c__typeInfo,
				ts2__Veteran__c, ts2__Veteran__c__is_set);
	}

	public void load(com.sforce.ws.parser.XmlInputStream __in,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		__typeMapper.consumeStartTag(__in);
		loadFields(__in, __typeMapper);
		__typeMapper.consumeEndTag(__in);
	}

	protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		super.loadFields(__in, __typeMapper);
		__in.peekTag();
		if (__typeMapper.isElement(__in, Apply_with_LinkedIn__c__typeInfo)) {
			setApply_with_LinkedIn__c((java.lang.Boolean) __typeMapper
					.readObject(__in, Apply_with_LinkedIn__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
			setAttachments((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Attachments__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Countries__c__typeInfo)) {
			setCountries__c((java.lang.String) __typeMapper.readString(__in,
					Countries__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
			setCreatedBy((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, CreatedBy__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
			setCreatedById((java.lang.String) __typeMapper.readString(__in,
					CreatedById__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
			setCreatedDate((java.util.Calendar) __typeMapper.readObject(__in,
					CreatedDate__typeInfo, java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Custom_Questions__c__typeInfo)) {
			setCustom_Questions__c((java.lang.Double) __typeMapper
					.readObject(__in, Custom_Questions__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Document_URL__c__typeInfo)) {
			setDocument_URL__c((java.lang.String) __typeMapper.readString(__in,
					Document_URL__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, General_Registration__c__typeInfo)) {
			setGeneral_Registration__c((java.lang.Boolean) __typeMapper
					.readObject(__in, General_Registration__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Histories__typeInfo)) {
			setHistories((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Histories__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				I_Accept_Privacy_Statement_Terms_Condi__c__typeInfo)) {
			setI_Accept_Privacy_Statement_Terms_Condi__c((java.lang.Boolean) __typeMapper
					.readObject(
							__in,
							I_Accept_Privacy_Statement_Terms_Condi__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				Index_Additional_Attachments__c__typeInfo)) {
			setIndex_Additional_Attachments__c((java.lang.Double) __typeMapper
					.readObject(__in,
							Index_Additional_Attachments__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Compliance__c__typeInfo)) {
			setIndex_Compliance__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Compliance__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Cover_Letter__c__typeInfo)) {
			setIndex_Cover_Letter__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Cover_Letter__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Custom_Questions__c__typeInfo)) {
			setIndex_Custom_Questions__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Custom_Questions__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Forms_URL__c__typeInfo)) {
			setIndex_Forms_URL__c((java.lang.Double) __typeMapper.readObject(
					__in, Index_Forms_URL__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Multimedia__c__typeInfo)) {
			setIndex_Multimedia__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Multimedia__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Resume_Upload__c__typeInfo)) {
			setIndex_Resume_Upload__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Resume_Upload__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Social_Questions__c__typeInfo)) {
			setIndex_Social_Questions__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Social_Questions__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Index_Standard_Questions__c__typeInfo)) {
			setIndex_Standard_Questions__c((java.lang.Double) __typeMapper
					.readObject(__in, Index_Standard_Questions__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
			setIsDeleted((java.lang.Boolean) __typeMapper.readObject(__in,
					IsDeleted__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, JBS_ComplianceQuestions__r__typeInfo)) {
			setJBS_ComplianceQuestions__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, JBS_ComplianceQuestions__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, JBS_SocialQuestions__r__typeInfo)) {
			setJBS_SocialQuestions__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, JBS_SocialQuestions__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Languages__c__typeInfo)) {
			setLanguages__c((java.lang.String) __typeMapper.readString(__in,
					Languages__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
			setLastModifiedBy((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, LastModifiedBy__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
			setLastModifiedById((java.lang.String) __typeMapper.readString(
					__in, LastModifiedById__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
			setLastModifiedDate((java.util.Calendar) __typeMapper.readObject(
					__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Multimedia__c__typeInfo)) {
			setMultimedia__c((java.lang.Boolean) __typeMapper.readObject(__in,
					Multimedia__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Name__typeInfo)) {
			setName((java.lang.String) __typeMapper.readString(__in,
					Name__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Notes__typeInfo)) {
			setNotes((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Notes__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, NotesAndAttachments__typeInfo)) {
			setNotesAndAttachments((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, NotesAndAttachments__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Owner__typeInfo)) {
			setOwner((com.sforce.soap.enterprise.sobject.Name) __typeMapper
					.readObject(__in, Owner__typeInfo,
							com.sforce.soap.enterprise.sobject.Name.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
			setOwnerId((java.lang.String) __typeMapper.readString(__in,
					OwnerId__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ProcessInstances__typeInfo)) {
			setProcessInstances((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ProcessInstances__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ProcessSteps__typeInfo)) {
			setProcessSteps((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ProcessSteps__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, RSS_XML_Feeds__c__typeInfo)) {
			setRSS_XML_Feeds__c((java.lang.Boolean) __typeMapper.readObject(
					__in, RSS_XML_Feeds__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
			setRecordType((com.sforce.soap.enterprise.sobject.RecordType) __typeMapper
					.readObject(__in, RecordType__typeInfo,
							com.sforce.soap.enterprise.sobject.RecordType.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
			setRecordTypeId((java.lang.String) __typeMapper.readString(__in,
					RecordTypeId__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Setup_Questions__r__typeInfo)) {
			setSetup_Questions__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Setup_Questions__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Social_Networks__c__typeInfo)) {
			setSocial_Networks__c((java.lang.String) __typeMapper.readString(
					__in, Social_Networks__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
			setSystemModstamp((java.util.Calendar) __typeMapper.readObject(
					__in, SystemModstamp__typeInfo, java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Tags__typeInfo)) {
			setTags((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Tags__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Thank_You_Page__c__typeInfo)) {
			setThank_You_Page__c((java.lang.String) __typeMapper.readString(
					__in, Thank_You_Page__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, oAuth_on_off__c__typeInfo)) {
			setOAuth_on_off__c((java.lang.Boolean) __typeMapper.readObject(
					__in, oAuth_on_off__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2_Additional_Attachments_Required__c__typeInfo)) {
			setTs2_Additional_Attachments_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2_Additional_Attachments_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2_Compliance_Required__c__typeInfo)) {
			setTs2_Compliance_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2_Compliance_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2_Custom_Questions_Required__c__typeInfo)) {
			setTs2_Custom_Questions_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2_Custom_Questions_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2_FormsURL_Required__c__typeInfo)) {
			setTs2_FormsURL_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2_FormsURL_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2_Social_Questions_Required__c__typeInfo)) {
			setTs2_Social_Questions_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2_Social_Questions_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2_Standard_Questions_Required__c__typeInfo)) {
			setTs2_Standard_Questions_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2_Standard_Questions_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__AddThis_Username__c__typeInfo)) {
			setTs2__AddThis_Username__c((java.lang.String) __typeMapper
					.readString(__in, ts2__AddThis_Username__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Address_Validation__c__typeInfo)) {
			setTs2__Address_Validation__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Address_Validation__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Allow_Register_Only__c__typeInfo)) {
			setTs2__Allow_Register_Only__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Allow_Register_Only__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__ApplicationsDisplayMode__c__typeInfo)) {
			setTs2__ApplicationsDisplayMode__c((java.lang.String) __typeMapper
					.readString(__in,
							ts2__ApplicationsDisplayMode__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Apply_Referral_Immediately__c__typeInfo)) {
			setTs2__Apply_Referral_Immediately__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2__Apply_Referral_Immediately__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__AutoAssociate__c__typeInfo)) {
			setTs2__AutoAssociate__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__AutoAssociate__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__ConfirmationMessage__c__typeInfo)) {
			setTs2__ConfirmationMessage__c((java.lang.String) __typeMapper
					.readString(__in, ts2__ConfirmationMessage__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Disabled__c__typeInfo)) {
			setTs2__Disabled__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Disabled__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__EEO_Text__c__typeInfo)) {
			setTs2__EEO_Text__c((java.lang.String) __typeMapper.readString(
					__in, ts2__EEO_Text__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Employee_Account__c__typeInfo)) {
			setTs2__Employee_Account__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Employee_Account__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Employee_Account__r__typeInfo)) {
			setTs2__Employee_Account__r((com.sforce.soap.enterprise.sobject.Account) __typeMapper
					.readObject(__in, ts2__Employee_Account__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Account.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Enable_AddThis__c__typeInfo)) {
			setTs2__Enable_AddThis__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Enable_AddThis__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Enable_Employee_Status_Check__c__typeInfo)) {
			setTs2__Enable_Employee_Status_Check__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2__Enable_Employee_Status_Check__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__Enable_Lead_Tracking__c__typeInfo)) {
			setTs2__Enable_Lead_Tracking__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Enable_Lead_Tracking__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Enable_Referral_Email_Notification__c__typeInfo)) {
			setTs2__Enable_Referral_Email_Notification__c((java.lang.Boolean) __typeMapper
					.readObject(
							__in,
							ts2__Enable_Referral_Email_Notification__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Enable_Submission_Feedback__c__typeInfo)) {
			setTs2__Enable_Submission_Feedback__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2__Enable_Submission_Feedback__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Gender__c__typeInfo)) {
			setTs2__Gender__c((java.lang.Boolean) __typeMapper.readObject(__in,
					ts2__Gender__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HideContactMethod__c__typeInfo)) {
			setTs2__HideContactMethod__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__HideContactMethod__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HideCoverLetter__c__typeInfo)) {
			setTs2__HideCoverLetter__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__HideCoverLetter__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HideMobile__c__typeInfo)) {
			setTs2__HideMobile__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__HideMobile__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HidePhone__c__typeInfo)) {
			setTs2__HidePhone__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__HidePhone__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HideResumeBuilder__c__typeInfo)) {
			setTs2__HideResumeBuilder__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__HideResumeBuilder__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HideSourceQuestion__c__typeInfo)) {
			setTs2__HideSourceQuestion__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__HideSourceQuestion__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__HomePage__c__typeInfo)) {
			setTs2__HomePage__c((java.lang.String) __typeMapper.readString(
					__in, ts2__HomePage__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Internal_Application_Process__c__typeInfo)) {
			setTs2__Internal_Application_Process__c((java.lang.String) __typeMapper
					.readString(__in,
							ts2__Internal_Application_Process__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription10__c__typeInfo)) {
			setTs2__JobDescription10__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription10__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription1__c__typeInfo)) {
			setTs2__JobDescription1__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription1__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription2__c__typeInfo)) {
			setTs2__JobDescription2__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription2__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription3__c__typeInfo)) {
			setTs2__JobDescription3__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription3__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription4__c__typeInfo)) {
			setTs2__JobDescription4__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription4__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription5__c__typeInfo)) {
			setTs2__JobDescription5__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription5__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription6__c__typeInfo)) {
			setTs2__JobDescription6__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription6__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription7__c__typeInfo)) {
			setTs2__JobDescription7__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription7__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription8__c__typeInfo)) {
			setTs2__JobDescription8__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription8__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__JobDescription9__c__typeInfo)) {
			setTs2__JobDescription9__c((java.lang.String) __typeMapper
					.readString(__in, ts2__JobDescription9__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Board_Type__c__typeInfo)) {
			setTs2__Job_Board_Type__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Job_Board_Type__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Job_Order_Job_Board_Associations__r__typeInfo)) {
			setTs2__Job_Order_Job_Board_Associations__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in,
							ts2__Job_Order_Job_Board_Associations__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Jobs_Per_Page__c__typeInfo)) {
			setTs2__Jobs_Per_Page__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Jobs_Per_Page__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__LocalizedJobDescription__c__typeInfo)) {
			setTs2__LocalizedJobDescription__c((java.lang.String) __typeMapper
					.readString(__in,
							ts2__LocalizedJobDescription__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__LocalizedJobName__c__typeInfo)) {
			setTs2__LocalizedJobName__c((java.lang.String) __typeMapper
					.readString(__in, ts2__LocalizedJobName__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Max_Number_Open_Referrals__c__typeInfo)) {
			setTs2__Max_Number_Open_Referrals__c((java.lang.Double) __typeMapper
					.readObject(__in,
							ts2__Max_Number_Open_Referrals__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Max_Number_Referrals_Per_Contact__c__typeInfo)) {
			setTs2__Max_Number_Referrals_Per_Contact__c((java.lang.Double) __typeMapper
					.readObject(__in,
							ts2__Max_Number_Referrals_Per_Contact__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Max_search_agents__c__typeInfo)) {
			setTs2__Max_search_agents__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Max_search_agents__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Primary__c__typeInfo)) {
			setTs2__Primary__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Primary__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question10__c__typeInfo)) {
			setTs2__Question10__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question10__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question10__r__typeInfo)) {
			setTs2__Question10__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question10__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question11__c__typeInfo)) {
			setTs2__Question11__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question11__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question11__r__typeInfo)) {
			setTs2__Question11__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question11__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question12__c__typeInfo)) {
			setTs2__Question12__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question12__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question12__r__typeInfo)) {
			setTs2__Question12__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question12__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question13__c__typeInfo)) {
			setTs2__Question13__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question13__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question13__r__typeInfo)) {
			setTs2__Question13__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question13__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question14__c__typeInfo)) {
			setTs2__Question14__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question14__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question14__r__typeInfo)) {
			setTs2__Question14__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question14__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question15__c__typeInfo)) {
			setTs2__Question15__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question15__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question15__r__typeInfo)) {
			setTs2__Question15__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question15__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question16__c__typeInfo)) {
			setTs2__Question16__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question16__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question16__r__typeInfo)) {
			setTs2__Question16__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question16__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question17__c__typeInfo)) {
			setTs2__Question17__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question17__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question17__r__typeInfo)) {
			setTs2__Question17__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question17__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question18__c__typeInfo)) {
			setTs2__Question18__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question18__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question18__r__typeInfo)) {
			setTs2__Question18__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question18__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question19__c__typeInfo)) {
			setTs2__Question19__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question19__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question19__r__typeInfo)) {
			setTs2__Question19__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question19__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question1__c__typeInfo)) {
			setTs2__Question1__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question1__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question1__r__typeInfo)) {
			setTs2__Question1__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question1__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question20__c__typeInfo)) {
			setTs2__Question20__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question20__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question20__r__typeInfo)) {
			setTs2__Question20__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question20__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question2__c__typeInfo)) {
			setTs2__Question2__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question2__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question2__r__typeInfo)) {
			setTs2__Question2__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question2__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question3__c__typeInfo)) {
			setTs2__Question3__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question3__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question3__r__typeInfo)) {
			setTs2__Question3__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question3__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question4__c__typeInfo)) {
			setTs2__Question4__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question4__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question4__r__typeInfo)) {
			setTs2__Question4__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question4__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question5__c__typeInfo)) {
			setTs2__Question5__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question5__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question5__r__typeInfo)) {
			setTs2__Question5__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question5__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question6__c__typeInfo)) {
			setTs2__Question6__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question6__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question6__r__typeInfo)) {
			setTs2__Question6__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question6__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question7__c__typeInfo)) {
			setTs2__Question7__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question7__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question7__r__typeInfo)) {
			setTs2__Question7__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question7__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question8__c__typeInfo)) {
			setTs2__Question8__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question8__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question8__r__typeInfo)) {
			setTs2__Question8__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question8__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question9__c__typeInfo)) {
			setTs2__Question9__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question9__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question9__r__typeInfo)) {
			setTs2__Question9__r((com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c) __typeMapper
					.readObject(
							__in,
							ts2__Question9__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Race__c__typeInfo)) {
			setTs2__Race__c((java.lang.Boolean) __typeMapper.readObject(__in,
					ts2__Race__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Referral_Expiration_Days__c__typeInfo)) {
			setTs2__Referral_Expiration_Days__c((java.lang.Double) __typeMapper
					.readObject(__in,
							ts2__Referral_Expiration_Days__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Register_Process__c__typeInfo)) {
			setTs2__Register_Process__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Register_Process__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Require_Submission_Feedback__c__typeInfo)) {
			setTs2__Require_Submission_Feedback__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2__Require_Submission_Feedback__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Resume_Required__c__typeInfo)) {
			setTs2__Resume_Required__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Resume_Required__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Resume_Submission_Allowed__c__typeInfo)) {
			setTs2__Resume_Submission_Allowed__c((java.lang.Boolean) __typeMapper
					.readObject(__in,
							ts2__Resume_Submission_Allowed__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchByKeyword__c__typeInfo)) {
			setTs2__SearchByKeyword__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__SearchByKeyword__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchCriteria1__c__typeInfo)) {
			setTs2__SearchCriteria1__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchCriteria1__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchCriteria2__c__typeInfo)) {
			setTs2__SearchCriteria2__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchCriteria2__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchCriteria3__c__typeInfo)) {
			setTs2__SearchCriteria3__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchCriteria3__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchCriteria4__c__typeInfo)) {
			setTs2__SearchCriteria4__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchCriteria4__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchCriteria5__c__typeInfo)) {
			setTs2__SearchCriteria5__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchCriteria5__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchResult1__c__typeInfo)) {
			setTs2__SearchResult1__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchResult1__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchResult2__c__typeInfo)) {
			setTs2__SearchResult2__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchResult2__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchResult3__c__typeInfo)) {
			setTs2__SearchResult3__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchResult3__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SearchResult4__c__typeInfo)) {
			setTs2__SearchResult4__c((java.lang.String) __typeMapper
					.readString(__in, ts2__SearchResult4__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Search_Agents__r__typeInfo)) {
			setTs2__Search_Agents__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Search_Agents__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Show_Search_Only__c__typeInfo)) {
			setTs2__Show_Search_Only__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Show_Search_Only__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SiteName__c__typeInfo)) {
			setTs2__SiteName__c((java.lang.String) __typeMapper.readString(
					__in, ts2__SiteName__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SiteURL__c__typeInfo)) {
			setTs2__SiteURL__c((java.lang.String) __typeMapper.readString(__in,
					ts2__SiteURL__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Source_Tracking_for_External_Referrals__c__typeInfo)) {
			setTs2__Source_Tracking_for_External_Referrals__c((java.lang.String) __typeMapper
					.readString(
							__in,
							ts2__Source_Tracking_for_External_Referrals__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Source_Tracking_for_External_Referrals__r__typeInfo)) {
			setTs2__Source_Tracking_for_External_Referrals__r((com.sforce.soap.enterprise.sobject.Ts2__Source__c) __typeMapper
					.readObject(
							__in,
							ts2__Source_Tracking_for_External_Referrals__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Source__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Source_Tracking_for_Internal_Referrals__c__typeInfo)) {
			setTs2__Source_Tracking_for_Internal_Referrals__c((java.lang.String) __typeMapper
					.readString(
							__in,
							ts2__Source_Tracking_for_Internal_Referrals__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Source_Tracking_for_Internal_Referrals__r__typeInfo)) {
			setTs2__Source_Tracking_for_Internal_Referrals__r((com.sforce.soap.enterprise.sobject.Ts2__Source__c) __typeMapper
					.readObject(
							__in,
							ts2__Source_Tracking_for_Internal_Referrals__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Source__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Veteran__c__typeInfo)) {
			setTs2__Veteran__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Veteran__c__typeInfo, java.lang.Boolean.class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[Ts2__Job_Board_Setup__c ");
		sb.append(super.toString());
		sb.append(" Apply_with_LinkedIn__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Apply_with_LinkedIn__c)
				+ "'\n");
		sb.append(" Attachments=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Attachments)
				+ "'\n");
		sb.append(" Countries__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Countries__c)
				+ "'\n");
		sb.append(" CreatedBy=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedBy) + "'\n");
		sb.append(" CreatedById=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedById)
				+ "'\n");
		sb.append(" CreatedDate=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedDate)
				+ "'\n");
		sb.append(" Custom_Questions__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Custom_Questions__c)
				+ "'\n");
		sb.append(" Document_URL__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Document_URL__c)
				+ "'\n");
		sb.append(" General_Registration__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(General_Registration__c)
				+ "'\n");
		sb.append(" Histories=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Histories) + "'\n");
		sb.append(" I_Accept_Privacy_Statement_Terms_Condi__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(I_Accept_Privacy_Statement_Terms_Condi__c)
				+ "'\n");
		sb.append(" Index_Additional_Attachments__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(Index_Additional_Attachments__c) + "'\n");
		sb.append(" Index_Compliance__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Index_Compliance__c)
				+ "'\n");
		sb.append(" Index_Cover_Letter__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Index_Cover_Letter__c)
				+ "'\n");
		sb.append(" Index_Custom_Questions__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(Index_Custom_Questions__c) + "'\n");
		sb.append(" Index_Forms_URL__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Index_Forms_URL__c)
				+ "'\n");
		sb.append(" Index_Multimedia__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Index_Multimedia__c)
				+ "'\n");
		sb.append(" Index_Resume_Upload__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Index_Resume_Upload__c)
				+ "'\n");
		sb.append(" Index_Social_Questions__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(Index_Social_Questions__c) + "'\n");
		sb.append(" Index_Standard_Questions__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(Index_Standard_Questions__c) + "'\n");
		sb.append(" IsDeleted=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(IsDeleted) + "'\n");
		sb.append(" JBS_ComplianceQuestions__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(JBS_ComplianceQuestions__r) + "'\n");
		sb.append(" JBS_SocialQuestions__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(JBS_SocialQuestions__r)
				+ "'\n");
		sb.append(" Languages__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Languages__c)
				+ "'\n");
		sb.append(" LastModifiedBy=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(LastModifiedBy)
				+ "'\n");
		sb.append(" LastModifiedById=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(LastModifiedById)
				+ "'\n");
		sb.append(" LastModifiedDate=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(LastModifiedDate)
				+ "'\n");
		sb.append(" Multimedia__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Multimedia__c)
				+ "'\n");
		sb.append(" Name=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Name) + "'\n");
		sb.append(" Notes=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Notes) + "'\n");
		sb.append(" NotesAndAttachments=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(NotesAndAttachments)
				+ "'\n");
		sb.append(" Owner=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Owner) + "'\n");
		sb.append(" OwnerId=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(OwnerId) + "'\n");
		sb.append(" ProcessInstances=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ProcessInstances)
				+ "'\n");
		sb.append(" ProcessSteps=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ProcessSteps)
				+ "'\n");
		sb.append(" RSS_XML_Feeds__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(RSS_XML_Feeds__c)
				+ "'\n");
		sb.append(" RecordType=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(RecordType) + "'\n");
		sb.append(" RecordTypeId=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(RecordTypeId)
				+ "'\n");
		sb.append(" Setup_Questions__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Setup_Questions__r)
				+ "'\n");
		sb.append(" Social_Networks__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Social_Networks__c)
				+ "'\n");
		sb.append(" SystemModstamp=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(SystemModstamp)
				+ "'\n");
		sb.append(" Tags=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tags) + "'\n");
		sb.append(" Thank_You_Page__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Thank_You_Page__c)
				+ "'\n");
		sb.append(" oAuth_on_off__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(oAuth_on_off__c)
				+ "'\n");
		sb.append(" ts2_Additional_Attachments_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2_Additional_Attachments_Required__c)
				+ "'\n");
		sb.append(" ts2_Compliance_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2_Compliance_Required__c) + "'\n");
		sb.append(" ts2_Custom_Questions_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2_Custom_Questions_Required__c) + "'\n");
		sb.append(" ts2_FormsURL_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2_FormsURL_Required__c)
				+ "'\n");
		sb.append(" ts2_Social_Questions_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2_Social_Questions_Required__c) + "'\n");
		sb.append(" ts2_Standard_Questions_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2_Standard_Questions_Required__c) + "'\n");
		sb.append(" ts2__AddThis_Username__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__AddThis_Username__c)
				+ "'\n");
		sb.append(" ts2__Address_Validation__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Address_Validation__c) + "'\n");
		sb.append(" ts2__Allow_Register_Only__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Allow_Register_Only__c) + "'\n");
		sb.append(" ts2__ApplicationsDisplayMode__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__ApplicationsDisplayMode__c) + "'\n");
		sb.append(" ts2__Apply_Referral_Immediately__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Apply_Referral_Immediately__c) + "'\n");
		sb.append(" ts2__AutoAssociate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__AutoAssociate__c)
				+ "'\n");
		sb.append(" ts2__ConfirmationMessage__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__ConfirmationMessage__c) + "'\n");
		sb.append(" ts2__Disabled__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Disabled__c)
				+ "'\n");
		sb.append(" ts2__EEO_Text__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__EEO_Text__c)
				+ "'\n");
		sb.append(" ts2__Employee_Account__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Employee_Account__c)
				+ "'\n");
		sb.append(" ts2__Employee_Account__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Employee_Account__r)
				+ "'\n");
		sb.append(" ts2__Enable_AddThis__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Enable_AddThis__c)
				+ "'\n");
		sb.append(" ts2__Enable_Employee_Status_Check__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Enable_Employee_Status_Check__c) + "'\n");
		sb.append(" ts2__Enable_Lead_Tracking__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Enable_Lead_Tracking__c) + "'\n");
		sb.append(" ts2__Enable_Referral_Email_Notification__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Enable_Referral_Email_Notification__c)
				+ "'\n");
		sb.append(" ts2__Enable_Submission_Feedback__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Enable_Submission_Feedback__c) + "'\n");
		sb.append(" ts2__Gender__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Gender__c)
				+ "'\n");
		sb.append(" ts2__HideContactMethod__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__HideContactMethod__c) + "'\n");
		sb.append(" ts2__HideCoverLetter__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__HideCoverLetter__c)
				+ "'\n");
		sb.append(" ts2__HideMobile__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__HideMobile__c)
				+ "'\n");
		sb.append(" ts2__HidePhone__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__HidePhone__c)
				+ "'\n");
		sb.append(" ts2__HideResumeBuilder__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__HideResumeBuilder__c) + "'\n");
		sb.append(" ts2__HideSourceQuestion__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__HideSourceQuestion__c) + "'\n");
		sb.append(" ts2__HomePage__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__HomePage__c)
				+ "'\n");
		sb.append(" ts2__Internal_Application_Process__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Internal_Application_Process__c) + "'\n");
		sb.append(" ts2__JobDescription10__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription10__c)
				+ "'\n");
		sb.append(" ts2__JobDescription1__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription1__c)
				+ "'\n");
		sb.append(" ts2__JobDescription2__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription2__c)
				+ "'\n");
		sb.append(" ts2__JobDescription3__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription3__c)
				+ "'\n");
		sb.append(" ts2__JobDescription4__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription4__c)
				+ "'\n");
		sb.append(" ts2__JobDescription5__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription5__c)
				+ "'\n");
		sb.append(" ts2__JobDescription6__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription6__c)
				+ "'\n");
		sb.append(" ts2__JobDescription7__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription7__c)
				+ "'\n");
		sb.append(" ts2__JobDescription8__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription8__c)
				+ "'\n");
		sb.append(" ts2__JobDescription9__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__JobDescription9__c)
				+ "'\n");
		sb.append(" ts2__Job_Board_Type__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Job_Board_Type__c)
				+ "'\n");
		sb.append(" ts2__Job_Order_Job_Board_Associations__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Order_Job_Board_Associations__r)
				+ "'\n");
		sb.append(" ts2__Jobs_Per_Page__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Jobs_Per_Page__c)
				+ "'\n");
		sb.append(" ts2__LocalizedJobDescription__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__LocalizedJobDescription__c) + "'\n");
		sb.append(" ts2__LocalizedJobName__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__LocalizedJobName__c)
				+ "'\n");
		sb.append(" ts2__Max_Number_Open_Referrals__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Max_Number_Open_Referrals__c) + "'\n");
		sb.append(" ts2__Max_Number_Referrals_Per_Contact__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Max_Number_Referrals_Per_Contact__c)
				+ "'\n");
		sb.append(" ts2__Max_search_agents__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Max_search_agents__c) + "'\n");
		sb.append(" ts2__Primary__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Primary__c)
				+ "'\n");
		sb.append(" ts2__Question10__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question10__c)
				+ "'\n");
		sb.append(" ts2__Question10__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question10__r)
				+ "'\n");
		sb.append(" ts2__Question11__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question11__c)
				+ "'\n");
		sb.append(" ts2__Question11__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question11__r)
				+ "'\n");
		sb.append(" ts2__Question12__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question12__c)
				+ "'\n");
		sb.append(" ts2__Question12__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question12__r)
				+ "'\n");
		sb.append(" ts2__Question13__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question13__c)
				+ "'\n");
		sb.append(" ts2__Question13__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question13__r)
				+ "'\n");
		sb.append(" ts2__Question14__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question14__c)
				+ "'\n");
		sb.append(" ts2__Question14__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question14__r)
				+ "'\n");
		sb.append(" ts2__Question15__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question15__c)
				+ "'\n");
		sb.append(" ts2__Question15__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question15__r)
				+ "'\n");
		sb.append(" ts2__Question16__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question16__c)
				+ "'\n");
		sb.append(" ts2__Question16__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question16__r)
				+ "'\n");
		sb.append(" ts2__Question17__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question17__c)
				+ "'\n");
		sb.append(" ts2__Question17__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question17__r)
				+ "'\n");
		sb.append(" ts2__Question18__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question18__c)
				+ "'\n");
		sb.append(" ts2__Question18__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question18__r)
				+ "'\n");
		sb.append(" ts2__Question19__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question19__c)
				+ "'\n");
		sb.append(" ts2__Question19__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question19__r)
				+ "'\n");
		sb.append(" ts2__Question1__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question1__c)
				+ "'\n");
		sb.append(" ts2__Question1__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question1__r)
				+ "'\n");
		sb.append(" ts2__Question20__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question20__c)
				+ "'\n");
		sb.append(" ts2__Question20__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question20__r)
				+ "'\n");
		sb.append(" ts2__Question2__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question2__c)
				+ "'\n");
		sb.append(" ts2__Question2__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question2__r)
				+ "'\n");
		sb.append(" ts2__Question3__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question3__c)
				+ "'\n");
		sb.append(" ts2__Question3__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question3__r)
				+ "'\n");
		sb.append(" ts2__Question4__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question4__c)
				+ "'\n");
		sb.append(" ts2__Question4__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question4__r)
				+ "'\n");
		sb.append(" ts2__Question5__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question5__c)
				+ "'\n");
		sb.append(" ts2__Question5__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question5__r)
				+ "'\n");
		sb.append(" ts2__Question6__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question6__c)
				+ "'\n");
		sb.append(" ts2__Question6__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question6__r)
				+ "'\n");
		sb.append(" ts2__Question7__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question7__c)
				+ "'\n");
		sb.append(" ts2__Question7__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question7__r)
				+ "'\n");
		sb.append(" ts2__Question8__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question8__c)
				+ "'\n");
		sb.append(" ts2__Question8__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question8__r)
				+ "'\n");
		sb.append(" ts2__Question9__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question9__c)
				+ "'\n");
		sb.append(" ts2__Question9__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question9__r)
				+ "'\n");
		sb.append(" ts2__Race__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Race__c)
				+ "'\n");
		sb.append(" ts2__Referral_Expiration_Days__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Referral_Expiration_Days__c) + "'\n");
		sb.append(" ts2__Register_Process__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Register_Process__c)
				+ "'\n");
		sb.append(" ts2__Require_Submission_Feedback__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Require_Submission_Feedback__c) + "'\n");
		sb.append(" ts2__Resume_Required__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Resume_Required__c)
				+ "'\n");
		sb.append(" ts2__Resume_Submission_Allowed__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Resume_Submission_Allowed__c) + "'\n");
		sb.append(" ts2__SearchByKeyword__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchByKeyword__c)
				+ "'\n");
		sb.append(" ts2__SearchCriteria1__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchCriteria1__c)
				+ "'\n");
		sb.append(" ts2__SearchCriteria2__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchCriteria2__c)
				+ "'\n");
		sb.append(" ts2__SearchCriteria3__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchCriteria3__c)
				+ "'\n");
		sb.append(" ts2__SearchCriteria4__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchCriteria4__c)
				+ "'\n");
		sb.append(" ts2__SearchCriteria5__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchCriteria5__c)
				+ "'\n");
		sb.append(" ts2__SearchResult1__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchResult1__c)
				+ "'\n");
		sb.append(" ts2__SearchResult2__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchResult2__c)
				+ "'\n");
		sb.append(" ts2__SearchResult3__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchResult3__c)
				+ "'\n");
		sb.append(" ts2__SearchResult4__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__SearchResult4__c)
				+ "'\n");
		sb.append(" ts2__Search_Agents__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Search_Agents__r)
				+ "'\n");
		sb.append(" ts2__Show_Search_Only__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Show_Search_Only__c)
				+ "'\n");
		sb.append(" ts2__SiteName__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__SiteName__c)
				+ "'\n");
		sb.append(" ts2__SiteURL__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__SiteURL__c)
				+ "'\n");
		sb.append(" ts2__Source_Tracking_for_External_Referrals__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Source_Tracking_for_External_Referrals__c)
				+ "'\n");
		sb.append(" ts2__Source_Tracking_for_External_Referrals__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Source_Tracking_for_External_Referrals__r)
				+ "'\n");
		sb.append(" ts2__Source_Tracking_for_Internal_Referrals__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Source_Tracking_for_Internal_Referrals__c)
				+ "'\n");
		sb.append(" ts2__Source_Tracking_for_Internal_Referrals__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Source_Tracking_for_Internal_Referrals__r)
				+ "'\n");
		sb.append(" ts2__Veteran__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Veteran__c)
				+ "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}