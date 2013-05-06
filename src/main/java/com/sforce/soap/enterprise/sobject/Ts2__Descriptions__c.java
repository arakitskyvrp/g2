package com.sforce.soap.enterprise.sobject;

/** * Generated class, please do not edit. */
public class Ts2__Descriptions__c extends
		com.sforce.soap.enterprise.sobject.SObject {
	/** * Constructor */
	public Ts2__Descriptions__c() {
	}

	/**
	 * * element : ActivityHistories of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ActivityHistories__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ActivityHistories",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ActivityHistories__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ActivityHistories;

	public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
		return ActivityHistories;
	}

	public void setActivityHistories(
			com.sforce.soap.enterprise.QueryResult ActivityHistories) {
		this.ActivityHistories = ActivityHistories;
		ActivityHistories__is_set = true;
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
	 * * element : Events of type {urn:enterprise.soap.sforce.com}QueryResult *
	 * java type: com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Events__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Events",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Events__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Events;

	public com.sforce.soap.enterprise.QueryResult getEvents() {
		return Events;
	}

	public void setEvents(com.sforce.soap.enterprise.QueryResult Events) {
		this.Events = Events;
		Events__is_set = true;
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
	 * * element : LastActivityDate of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo LastActivityDate__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "LastActivityDate",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean LastActivityDate__is_set = false;
	private java.util.Calendar LastActivityDate;

	public java.util.Calendar getLastActivityDate() {
		return LastActivityDate;
	}

	public void setLastActivityDate(java.util.Calendar LastActivityDate) {
		this.LastActivityDate = LastActivityDate;
		LastActivityDate__is_set = true;
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
	 * * element : OpenActivities of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo OpenActivities__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "OpenActivities",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean OpenActivities__is_set = false;
	private com.sforce.soap.enterprise.QueryResult OpenActivities;

	public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
		return OpenActivities;
	}

	public void setOpenActivities(
			com.sforce.soap.enterprise.QueryResult OpenActivities) {
		this.OpenActivities = OpenActivities;
		OpenActivities__is_set = true;
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
	 * * element : Tasks of type {urn:enterprise.soap.sforce.com}QueryResult *
	 * java type: com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Tasks__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Tasks",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Tasks__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Tasks;

	public com.sforce.soap.enterprise.QueryResult getTasks() {
		return Tasks;
	}

	public void setTasks(com.sforce.soap.enterprise.QueryResult Tasks) {
		this.Tasks = Tasks;
		Tasks__is_set = true;
	}

	/**
	 * * element : ts2__Abilities__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Abilities__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Abilities__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Abilities__c__is_set = false;
	private java.lang.String ts2__Abilities__c;

	public java.lang.String getTs2__Abilities__c() {
		return ts2__Abilities__c;
	}

	public void setTs2__Abilities__c(java.lang.String ts2__Abilities__c) {
		this.ts2__Abilities__c = ts2__Abilities__c;
		ts2__Abilities__c__is_set = true;
	}

	/**
	 * * element : ts2__Activities__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Activities__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Activities__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Activities__c__is_set = false;
	private java.lang.String ts2__Activities__c;

	public java.lang.String getTs2__Activities__c() {
		return ts2__Activities__c;
	}

	public void setTs2__Activities__c(java.lang.String ts2__Activities__c) {
		this.ts2__Activities__c = ts2__Activities__c;
		ts2__Activities__c__is_set = true;
	}

	/**
	 * * element : ts2__Answers_1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Answers_1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Answers_1__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Answers_1__c__is_set = false;
	private java.lang.String ts2__Answers_1__c;

	public java.lang.String getTs2__Answers_1__c() {
		return ts2__Answers_1__c;
	}

	public void setTs2__Answers_1__c(java.lang.String ts2__Answers_1__c) {
		this.ts2__Answers_1__c = ts2__Answers_1__c;
		ts2__Answers_1__c__is_set = true;
	}

	/**
	 * * element : ts2__Business_Unit__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Business_Unit__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Business_Unit__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Business_Unit__c__is_set = false;
	private java.lang.String ts2__Business_Unit__c;

	public java.lang.String getTs2__Business_Unit__c() {
		return ts2__Business_Unit__c;
	}

	public void setTs2__Business_Unit__c(java.lang.String ts2__Business_Unit__c) {
		this.ts2__Business_Unit__c = ts2__Business_Unit__c;
		ts2__Business_Unit__c__is_set = true;
	}

	/**
	 * * element : ts2__Certificates_Licenses__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Certificates_Licenses__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Certificates_Licenses__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Certificates_Licenses__c__is_set = false;
	private java.lang.String ts2__Certificates_Licenses__c;

	public java.lang.String getTs2__Certificates_Licenses__c() {
		return ts2__Certificates_Licenses__c;
	}

	public void setTs2__Certificates_Licenses__c(
			java.lang.String ts2__Certificates_Licenses__c) {
		this.ts2__Certificates_Licenses__c = ts2__Certificates_Licenses__c;
		ts2__Certificates_Licenses__c__is_set = true;
	}

	/**
	 * * element : ts2__Correct_Answer_1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Correct_Answer_1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Correct_Answer_1__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Correct_Answer_1__c__is_set = false;
	private java.lang.String ts2__Correct_Answer_1__c;

	public java.lang.String getTs2__Correct_Answer_1__c() {
		return ts2__Correct_Answer_1__c;
	}

	public void setTs2__Correct_Answer_1__c(
			java.lang.String ts2__Correct_Answer_1__c) {
		this.ts2__Correct_Answer_1__c = ts2__Correct_Answer_1__c;
		ts2__Correct_Answer_1__c__is_set = true;
	}

	/**
	 * * element : ts2__Desc_Tags__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Desc_Tags__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Desc_Tags__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Desc_Tags__c__is_set = false;
	private java.lang.String ts2__Desc_Tags__c;

	public java.lang.String getTs2__Desc_Tags__c() {
		return ts2__Desc_Tags__c;
	}

	public void setTs2__Desc_Tags__c(java.lang.String ts2__Desc_Tags__c) {
		this.ts2__Desc_Tags__c = ts2__Desc_Tags__c;
		ts2__Desc_Tags__c__is_set = true;
	}

	/**
	 * * element : ts2__Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Description__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Description__c__is_set = false;
	private java.lang.String ts2__Description__c;

	public java.lang.String getTs2__Description__c() {
		return ts2__Description__c;
	}

	public void setTs2__Description__c(java.lang.String ts2__Description__c) {
		this.ts2__Description__c = ts2__Description__c;
		ts2__Description__c__is_set = true;
	}

	/**
	 * * element : ts2__EEO_Code__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__EEO_Code__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__EEO_Code__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__EEO_Code__c__is_set = false;
	private java.lang.String ts2__EEO_Code__c;

	public java.lang.String getTs2__EEO_Code__c() {
		return ts2__EEO_Code__c;
	}

	public void setTs2__EEO_Code__c(java.lang.String ts2__EEO_Code__c) {
		this.ts2__EEO_Code__c = ts2__EEO_Code__c;
		ts2__EEO_Code__c__is_set = true;
	}

	/**
	 * * element : ts2__Education_and_Experience__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Education_and_Experience__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Education_and_Experience__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Education_and_Experience__c__is_set = false;
	private java.lang.String ts2__Education_and_Experience__c;

	public java.lang.String getTs2__Education_and_Experience__c() {
		return ts2__Education_and_Experience__c;
	}

	public void setTs2__Education_and_Experience__c(
			java.lang.String ts2__Education_and_Experience__c) {
		this.ts2__Education_and_Experience__c = ts2__Education_and_Experience__c;
		ts2__Education_and_Experience__c__is_set = true;
	}

	/**
	 * * element : ts2__Essential_Duties__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Essential_Duties__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Essential_Duties__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Essential_Duties__c__is_set = false;
	private java.lang.String ts2__Essential_Duties__c;

	public java.lang.String getTs2__Essential_Duties__c() {
		return ts2__Essential_Duties__c;
	}

	public void setTs2__Essential_Duties__c(
			java.lang.String ts2__Essential_Duties__c) {
		this.ts2__Essential_Duties__c = ts2__Essential_Duties__c;
		ts2__Essential_Duties__c__is_set = true;
	}

	/**
	 * * element : ts2__Interests__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Interests__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Interests__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Interests__c__is_set = false;
	private java.lang.String ts2__Interests__c;

	public java.lang.String getTs2__Interests__c() {
		return ts2__Interests__c;
	}

	public void setTs2__Interests__c(java.lang.String ts2__Interests__c) {
		this.ts2__Interests__c = ts2__Interests__c;
		ts2__Interests__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Template_Mapping__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Template_Mapping__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Template_Mapping__c", "urn:enterprise.soap.sforce.com",
			"ID", 0, 1, true);
	private boolean ts2__Job_Template_Mapping__c__is_set = false;
	private java.lang.String ts2__Job_Template_Mapping__c;

	public java.lang.String getTs2__Job_Template_Mapping__c() {
		return ts2__Job_Template_Mapping__c;
	}

	public void setTs2__Job_Template_Mapping__c(
			java.lang.String ts2__Job_Template_Mapping__c) {
		this.ts2__Job_Template_Mapping__c = ts2__Job_Template_Mapping__c;
		ts2__Job_Template_Mapping__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Template_Mapping__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Job_Template_Mapping__c *
	 * java type: com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Template_Mapping__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Template_Mapping__r",
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Template_Mapping__c", 0, 1, true);
	private boolean ts2__Job_Template_Mapping__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c ts2__Job_Template_Mapping__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c getTs2__Job_Template_Mapping__r() {
		return ts2__Job_Template_Mapping__r;
	}

	public void setTs2__Job_Template_Mapping__r(
			com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c ts2__Job_Template_Mapping__r) {
		this.ts2__Job_Template_Mapping__r = ts2__Job_Template_Mapping__r;
		ts2__Job_Template_Mapping__r__is_set = true;
	}

	/**
	 * * element : ts2__Knowledge__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Knowledge__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Knowledge__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Knowledge__c__is_set = false;
	private java.lang.String ts2__Knowledge__c;

	public java.lang.String getTs2__Knowledge__c() {
		return ts2__Knowledge__c;
	}

	public void setTs2__Knowledge__c(java.lang.String ts2__Knowledge__c) {
		this.ts2__Knowledge__c = ts2__Knowledge__c;
		ts2__Knowledge__c__is_set = true;
	}

	/**
	 * * element : ts2__Language_Skills__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Language_Skills__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Language_Skills__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Language_Skills__c__is_set = false;
	private java.lang.String ts2__Language_Skills__c;

	public java.lang.String getTs2__Language_Skills__c() {
		return ts2__Language_Skills__c;
	}

	public void setTs2__Language_Skills__c(
			java.lang.String ts2__Language_Skills__c) {
		this.ts2__Language_Skills__c = ts2__Language_Skills__c;
		ts2__Language_Skills__c__is_set = true;
	}

	/**
	 * * element : ts2__Legacy_JobTemplateID__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Legacy_JobTemplateID__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Legacy_JobTemplateID__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Legacy_JobTemplateID__c__is_set = false;
	private java.lang.String ts2__Legacy_JobTemplateID__c;

	public java.lang.String getTs2__Legacy_JobTemplateID__c() {
		return ts2__Legacy_JobTemplateID__c;
	}

	public void setTs2__Legacy_JobTemplateID__c(
			java.lang.String ts2__Legacy_JobTemplateID__c) {
		this.ts2__Legacy_JobTemplateID__c = ts2__Legacy_JobTemplateID__c;
		ts2__Legacy_JobTemplateID__c__is_set = true;
	}

	/**
	 * * element : ts2__Payroll_Job_Code__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Payroll_Job_Code__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Payroll_Job_Code__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Payroll_Job_Code__c__is_set = false;
	private java.lang.String ts2__Payroll_Job_Code__c;

	public java.lang.String getTs2__Payroll_Job_Code__c() {
		return ts2__Payroll_Job_Code__c;
	}

	public void setTs2__Payroll_Job_Code__c(
			java.lang.String ts2__Payroll_Job_Code__c) {
		this.ts2__Payroll_Job_Code__c = ts2__Payroll_Job_Code__c;
		ts2__Payroll_Job_Code__c__is_set = true;
	}

	/**
	 * * element : ts2__Prepared_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Prepared_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Prepared_Date__c",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean ts2__Prepared_Date__c__is_set = false;
	private java.util.Calendar ts2__Prepared_Date__c;

	public java.util.Calendar getTs2__Prepared_Date__c() {
		return ts2__Prepared_Date__c;
	}

	public void setTs2__Prepared_Date__c(
			java.util.Calendar ts2__Prepared_Date__c) {
		this.ts2__Prepared_Date__c = ts2__Prepared_Date__c;
		ts2__Prepared_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Prepared__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Prepared__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Prepared__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Prepared__c__is_set = false;
	private java.lang.String ts2__Prepared__c;

	public java.lang.String getTs2__Prepared__c() {
		return ts2__Prepared__c;
	}

	public void setTs2__Prepared__c(java.lang.String ts2__Prepared__c) {
		this.ts2__Prepared__c = ts2__Prepared__c;
		ts2__Prepared__c__is_set = true;
	}

	/**
	 * * element : ts2__Prepared__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Prepared__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Prepared__r",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean ts2__Prepared__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.User ts2__Prepared__r;

	public com.sforce.soap.enterprise.sobject.User getTs2__Prepared__r() {
		return ts2__Prepared__r;
	}

	public void setTs2__Prepared__r(
			com.sforce.soap.enterprise.sobject.User ts2__Prepared__r) {
		this.ts2__Prepared__r = ts2__Prepared__r;
		ts2__Prepared__r__is_set = true;
	}

	/**
	 * * element : ts2__Qualifications__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Qualifications__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Qualifications__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Qualifications__c__is_set = false;
	private java.lang.String ts2__Qualifications__c;

	public java.lang.String getTs2__Qualifications__c() {
		return ts2__Qualifications__c;
	}

	public void setTs2__Qualifications__c(
			java.lang.String ts2__Qualifications__c) {
		this.ts2__Qualifications__c = ts2__Qualifications__c;
		ts2__Qualifications__c__is_set = true;
	}

	/**
	 * * element : ts2__Question_1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question_1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_1__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Question_1__c__is_set = false;
	private java.lang.String ts2__Question_1__c;

	public java.lang.String getTs2__Question_1__c() {
		return ts2__Question_1__c;
	}

	public void setTs2__Question_1__c(java.lang.String ts2__Question_1__c) {
		this.ts2__Question_1__c = ts2__Question_1__c;
		ts2__Question_1__c__is_set = true;
	}

	/**
	 * * element : ts2__Question_2__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question_2__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_2__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Question_2__c__is_set = false;
	private java.lang.String ts2__Question_2__c;

	public java.lang.String getTs2__Question_2__c() {
		return ts2__Question_2__c;
	}

	public void setTs2__Question_2__c(java.lang.String ts2__Question_2__c) {
		this.ts2__Question_2__c = ts2__Question_2__c;
		ts2__Question_2__c__is_set = true;
	}

	/**
	 * * element : ts2__Question_3__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question_3__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_3__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Question_3__c__is_set = false;
	private java.lang.String ts2__Question_3__c;

	public java.lang.String getTs2__Question_3__c() {
		return ts2__Question_3__c;
	}

	public void setTs2__Question_3__c(java.lang.String ts2__Question_3__c) {
		this.ts2__Question_3__c = ts2__Question_3__c;
		ts2__Question_3__c__is_set = true;
	}

	/**
	 * * element : ts2__R00N80000002e0CcEAI__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__R00N80000002e0CcEAI__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__R00N80000002e0CcEAI__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2__R00N80000002e0CcEAI__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__R00N80000002e0CcEAI__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__R00N80000002e0CcEAI__r() {
		return ts2__R00N80000002e0CcEAI__r;
	}

	public void setTs2__R00N80000002e0CcEAI__r(
			com.sforce.soap.enterprise.QueryResult ts2__R00N80000002e0CcEAI__r) {
		this.ts2__R00N80000002e0CcEAI__r = ts2__R00N80000002e0CcEAI__r;
		ts2__R00N80000002e0CcEAI__r__is_set = true;
	}

	/**
	 * * element : ts2__Rule_Out_Questions__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Rule_Out_Questions__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Rule_Out_Questions__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Rule_Out_Questions__c__is_set = false;
	private java.lang.String ts2__Rule_Out_Questions__c;

	public java.lang.String getTs2__Rule_Out_Questions__c() {
		return ts2__Rule_Out_Questions__c;
	}

	public void setTs2__Rule_Out_Questions__c(
			java.lang.String ts2__Rule_Out_Questions__c) {
		this.ts2__Rule_Out_Questions__c = ts2__Rule_Out_Questions__c;
		ts2__Rule_Out_Questions__c__is_set = true;
	}

	/**
	 * * element : ts2__SOC_code__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__SOC_code__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__SOC_code__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__SOC_code__c__is_set = false;
	private java.lang.String ts2__SOC_code__c;

	public java.lang.String getTs2__SOC_code__c() {
		return ts2__SOC_code__c;
	}

	public void setTs2__SOC_code__c(java.lang.String ts2__SOC_code__c) {
		this.ts2__SOC_code__c = ts2__SOC_code__c;
		ts2__SOC_code__c__is_set = true;
	}

	/**
	 * * element : ts2__Salary_Low__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Salary_Low__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Salary_Low__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Salary_Low__c__is_set = false;
	private java.lang.Double ts2__Salary_Low__c;

	public java.lang.Double getTs2__Salary_Low__c() {
		return ts2__Salary_Low__c;
	}

	public void setTs2__Salary_Low__c(java.lang.Double ts2__Salary_Low__c) {
		this.ts2__Salary_Low__c = ts2__Salary_Low__c;
		ts2__Salary_Low__c__is_set = true;
	}

	/**
	 * * element : ts2__Skills__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Skills__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Skills__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Skills__c__is_set = false;
	private java.lang.String ts2__Skills__c;

	public java.lang.String getTs2__Skills__c() {
		return ts2__Skills__c;
	}

	public void setTs2__Skills__c(java.lang.String ts2__Skills__c) {
		this.ts2__Skills__c = ts2__Skills__c;
		ts2__Skills__c__is_set = true;
	}

	/**
	 * * element : ts2__Supv_Responsibili__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Supv_Responsibili__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Supv_Responsibili__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Supv_Responsibili__c__is_set = false;
	private java.lang.String ts2__Supv_Responsibili__c;

	public java.lang.String getTs2__Supv_Responsibili__c() {
		return ts2__Supv_Responsibili__c;
	}

	public void setTs2__Supv_Responsibili__c(
			java.lang.String ts2__Supv_Responsibili__c) {
		this.ts2__Supv_Responsibili__c = ts2__Supv_Responsibili__c;
		ts2__Supv_Responsibili__c__is_set = true;
	}

	/**
	 * * element : ts2__Travel_Requirement__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Travel_Requirement__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Travel_Requirement__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Travel_Requirement__c__is_set = false;
	private java.lang.String ts2__Travel_Requirement__c;

	public java.lang.String getTs2__Travel_Requirement__c() {
		return ts2__Travel_Requirement__c;
	}

	public void setTs2__Travel_Requirement__c(
			java.lang.String ts2__Travel_Requirement__c) {
		this.ts2__Travel_Requirement__c = ts2__Travel_Requirement__c;
		ts2__Travel_Requirement__c__is_set = true;
	}

	/**
	 * * element : ts2__Work_Context__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Work_Context__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Work_Context__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Work_Context__c__is_set = false;
	private java.lang.String ts2__Work_Context__c;

	public java.lang.String getTs2__Work_Context__c() {
		return ts2__Work_Context__c;
	}

	public void setTs2__Work_Context__c(java.lang.String ts2__Work_Context__c) {
		this.ts2__Work_Context__c = ts2__Work_Context__c;
		ts2__Work_Context__c__is_set = true;
	}

	/**
	 * * element : ts2__Work_Style__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Work_Style__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Work_Style__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Work_Style__c__is_set = false;
	private java.lang.String ts2__Work_Style__c;

	public java.lang.String getTs2__Work_Style__c() {
		return ts2__Work_Style__c;
	}

	public void setTs2__Work_Style__c(java.lang.String ts2__Work_Style__c) {
		this.ts2__Work_Style__c = ts2__Work_Style__c;
		ts2__Work_Style__c__is_set = true;
	}

	/**
	 * * element : ts2__Work_Values__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Work_Values__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Work_Values__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Work_Values__c__is_set = false;
	private java.lang.String ts2__Work_Values__c;

	public java.lang.String getTs2__Work_Values__c() {
		return ts2__Work_Values__c;
	}

	public void setTs2__Work_Values__c(java.lang.String ts2__Work_Values__c) {
		this.ts2__Work_Values__c = ts2__Work_Values__c;
		ts2__Work_Values__c__is_set = true;
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
				"ts2__Descriptions__c");
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}

	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		super.writeFields(__out, __typeMapper);
		__typeMapper.writeObject(__out, ActivityHistories__typeInfo,
				ActivityHistories, ActivityHistories__is_set);
		__typeMapper.writeObject(__out, Attachments__typeInfo, Attachments,
				Attachments__is_set);
		__typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy,
				CreatedBy__is_set);
		__typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById,
				CreatedById__is_set);
		__typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate,
				CreatedDate__is_set);
		__typeMapper.writeObject(__out, Events__typeInfo, Events,
				Events__is_set);
		__typeMapper.writeObject(__out, Histories__typeInfo, Histories,
				Histories__is_set);
		__typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted,
				IsDeleted__is_set);
		__typeMapper.writeObject(__out, LastActivityDate__typeInfo,
				LastActivityDate, LastActivityDate__is_set);
		__typeMapper.writeObject(__out, LastModifiedBy__typeInfo,
				LastModifiedBy, LastModifiedBy__is_set);
		__typeMapper.writeString(__out, LastModifiedById__typeInfo,
				LastModifiedById, LastModifiedById__is_set);
		__typeMapper.writeObject(__out, LastModifiedDate__typeInfo,
				LastModifiedDate, LastModifiedDate__is_set);
		__typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
		__typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
		__typeMapper.writeObject(__out, NotesAndAttachments__typeInfo,
				NotesAndAttachments, NotesAndAttachments__is_set);
		__typeMapper.writeObject(__out, OpenActivities__typeInfo,
				OpenActivities, OpenActivities__is_set);
		__typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
		__typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId,
				OwnerId__is_set);
		__typeMapper.writeObject(__out, ProcessInstances__typeInfo,
				ProcessInstances, ProcessInstances__is_set);
		__typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps,
				ProcessSteps__is_set);
		__typeMapper.writeObject(__out, SystemModstamp__typeInfo,
				SystemModstamp, SystemModstamp__is_set);
		__typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
		__typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
		__typeMapper.writeString(__out, ts2__Abilities__c__typeInfo,
				ts2__Abilities__c, ts2__Abilities__c__is_set);
		__typeMapper.writeString(__out, ts2__Activities__c__typeInfo,
				ts2__Activities__c, ts2__Activities__c__is_set);
		__typeMapper.writeString(__out, ts2__Answers_1__c__typeInfo,
				ts2__Answers_1__c, ts2__Answers_1__c__is_set);
		__typeMapper.writeString(__out, ts2__Business_Unit__c__typeInfo,
				ts2__Business_Unit__c, ts2__Business_Unit__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Certificates_Licenses__c__typeInfo,
				ts2__Certificates_Licenses__c,
				ts2__Certificates_Licenses__c__is_set);
		__typeMapper.writeString(__out, ts2__Correct_Answer_1__c__typeInfo,
				ts2__Correct_Answer_1__c, ts2__Correct_Answer_1__c__is_set);
		__typeMapper.writeString(__out, ts2__Desc_Tags__c__typeInfo,
				ts2__Desc_Tags__c, ts2__Desc_Tags__c__is_set);
		__typeMapper.writeString(__out, ts2__Description__c__typeInfo,
				ts2__Description__c, ts2__Description__c__is_set);
		__typeMapper.writeString(__out, ts2__EEO_Code__c__typeInfo,
				ts2__EEO_Code__c, ts2__EEO_Code__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Education_and_Experience__c__typeInfo,
				ts2__Education_and_Experience__c,
				ts2__Education_and_Experience__c__is_set);
		__typeMapper.writeString(__out, ts2__Essential_Duties__c__typeInfo,
				ts2__Essential_Duties__c, ts2__Essential_Duties__c__is_set);
		__typeMapper.writeString(__out, ts2__Interests__c__typeInfo,
				ts2__Interests__c, ts2__Interests__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Template_Mapping__c__typeInfo,
				ts2__Job_Template_Mapping__c,
				ts2__Job_Template_Mapping__c__is_set);
		__typeMapper.writeObject(__out, ts2__Job_Template_Mapping__r__typeInfo,
				ts2__Job_Template_Mapping__r,
				ts2__Job_Template_Mapping__r__is_set);
		__typeMapper.writeString(__out, ts2__Knowledge__c__typeInfo,
				ts2__Knowledge__c, ts2__Knowledge__c__is_set);
		__typeMapper.writeString(__out, ts2__Language_Skills__c__typeInfo,
				ts2__Language_Skills__c, ts2__Language_Skills__c__is_set);
		__typeMapper.writeString(__out, ts2__Legacy_JobTemplateID__c__typeInfo,
				ts2__Legacy_JobTemplateID__c,
				ts2__Legacy_JobTemplateID__c__is_set);
		__typeMapper.writeString(__out, ts2__Payroll_Job_Code__c__typeInfo,
				ts2__Payroll_Job_Code__c, ts2__Payroll_Job_Code__c__is_set);
		__typeMapper.writeObject(__out, ts2__Prepared_Date__c__typeInfo,
				ts2__Prepared_Date__c, ts2__Prepared_Date__c__is_set);
		__typeMapper.writeString(__out, ts2__Prepared__c__typeInfo,
				ts2__Prepared__c, ts2__Prepared__c__is_set);
		__typeMapper.writeObject(__out, ts2__Prepared__r__typeInfo,
				ts2__Prepared__r, ts2__Prepared__r__is_set);
		__typeMapper.writeString(__out, ts2__Qualifications__c__typeInfo,
				ts2__Qualifications__c, ts2__Qualifications__c__is_set);
		__typeMapper.writeString(__out, ts2__Question_1__c__typeInfo,
				ts2__Question_1__c, ts2__Question_1__c__is_set);
		__typeMapper.writeString(__out, ts2__Question_2__c__typeInfo,
				ts2__Question_2__c, ts2__Question_2__c__is_set);
		__typeMapper.writeString(__out, ts2__Question_3__c__typeInfo,
				ts2__Question_3__c, ts2__Question_3__c__is_set);
		__typeMapper.writeObject(__out, ts2__R00N80000002e0CcEAI__r__typeInfo,
				ts2__R00N80000002e0CcEAI__r,
				ts2__R00N80000002e0CcEAI__r__is_set);
		__typeMapper.writeString(__out, ts2__Rule_Out_Questions__c__typeInfo,
				ts2__Rule_Out_Questions__c, ts2__Rule_Out_Questions__c__is_set);
		__typeMapper.writeString(__out, ts2__SOC_code__c__typeInfo,
				ts2__SOC_code__c, ts2__SOC_code__c__is_set);
		__typeMapper.writeObject(__out, ts2__Salary_Low__c__typeInfo,
				ts2__Salary_Low__c, ts2__Salary_Low__c__is_set);
		__typeMapper.writeString(__out, ts2__Skills__c__typeInfo,
				ts2__Skills__c, ts2__Skills__c__is_set);
		__typeMapper.writeString(__out, ts2__Supv_Responsibili__c__typeInfo,
				ts2__Supv_Responsibili__c, ts2__Supv_Responsibili__c__is_set);
		__typeMapper.writeString(__out, ts2__Travel_Requirement__c__typeInfo,
				ts2__Travel_Requirement__c, ts2__Travel_Requirement__c__is_set);
		__typeMapper.writeString(__out, ts2__Work_Context__c__typeInfo,
				ts2__Work_Context__c, ts2__Work_Context__c__is_set);
		__typeMapper.writeString(__out, ts2__Work_Style__c__typeInfo,
				ts2__Work_Style__c, ts2__Work_Style__c__is_set);
		__typeMapper.writeString(__out, ts2__Work_Values__c__typeInfo,
				ts2__Work_Values__c, ts2__Work_Values__c__is_set);
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
		if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
			setActivityHistories((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ActivityHistories__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
			setAttachments((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Attachments__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
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
		if (__typeMapper.isElement(__in, Events__typeInfo)) {
			setEvents((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Events__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Histories__typeInfo)) {
			setHistories((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Histories__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
			setIsDeleted((java.lang.Boolean) __typeMapper.readObject(__in,
					IsDeleted__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, LastActivityDate__typeInfo)) {
			setLastActivityDate((java.util.Calendar) __typeMapper.readObject(
					__in, LastActivityDate__typeInfo, java.util.Calendar.class));
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
		if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
			setOpenActivities((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, OpenActivities__typeInfo,
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
		if (__typeMapper.isElement(__in, Tasks__typeInfo)) {
			setTasks((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Tasks__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Abilities__c__typeInfo)) {
			setTs2__Abilities__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Abilities__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Activities__c__typeInfo)) {
			setTs2__Activities__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Activities__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Answers_1__c__typeInfo)) {
			setTs2__Answers_1__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Answers_1__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Business_Unit__c__typeInfo)) {
			setTs2__Business_Unit__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Business_Unit__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Certificates_Licenses__c__typeInfo)) {
			setTs2__Certificates_Licenses__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Certificates_Licenses__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Correct_Answer_1__c__typeInfo)) {
			setTs2__Correct_Answer_1__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Correct_Answer_1__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Desc_Tags__c__typeInfo)) {
			setTs2__Desc_Tags__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Desc_Tags__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Description__c__typeInfo)) {
			setTs2__Description__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__EEO_Code__c__typeInfo)) {
			setTs2__EEO_Code__c((java.lang.String) __typeMapper.readString(
					__in, ts2__EEO_Code__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Education_and_Experience__c__typeInfo)) {
			setTs2__Education_and_Experience__c((java.lang.String) __typeMapper
					.readString(__in,
							ts2__Education_and_Experience__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Essential_Duties__c__typeInfo)) {
			setTs2__Essential_Duties__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Essential_Duties__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Interests__c__typeInfo)) {
			setTs2__Interests__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Interests__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__Job_Template_Mapping__c__typeInfo)) {
			setTs2__Job_Template_Mapping__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Job_Template_Mapping__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__Job_Template_Mapping__r__typeInfo)) {
			setTs2__Job_Template_Mapping__r((com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c) __typeMapper
					.readObject(
							__in,
							ts2__Job_Template_Mapping__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Job_Template_Mapping__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Knowledge__c__typeInfo)) {
			setTs2__Knowledge__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Knowledge__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Language_Skills__c__typeInfo)) {
			setTs2__Language_Skills__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Language_Skills__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__Legacy_JobTemplateID__c__typeInfo)) {
			setTs2__Legacy_JobTemplateID__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Legacy_JobTemplateID__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Payroll_Job_Code__c__typeInfo)) {
			setTs2__Payroll_Job_Code__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Payroll_Job_Code__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Prepared_Date__c__typeInfo)) {
			setTs2__Prepared_Date__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Prepared_Date__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Prepared__c__typeInfo)) {
			setTs2__Prepared__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Prepared__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Prepared__r__typeInfo)) {
			setTs2__Prepared__r((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, ts2__Prepared__r__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Qualifications__c__typeInfo)) {
			setTs2__Qualifications__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Qualifications__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question_1__c__typeInfo)) {
			setTs2__Question_1__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question_1__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question_2__c__typeInfo)) {
			setTs2__Question_2__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question_2__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question_3__c__typeInfo)) {
			setTs2__Question_3__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question_3__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__R00N80000002e0CcEAI__r__typeInfo)) {
			setTs2__R00N80000002e0CcEAI__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__R00N80000002e0CcEAI__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Rule_Out_Questions__c__typeInfo)) {
			setTs2__Rule_Out_Questions__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Rule_Out_Questions__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__SOC_code__c__typeInfo)) {
			setTs2__SOC_code__c((java.lang.String) __typeMapper.readString(
					__in, ts2__SOC_code__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Salary_Low__c__typeInfo)) {
			setTs2__Salary_Low__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Salary_Low__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Skills__c__typeInfo)) {
			setTs2__Skills__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Skills__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Supv_Responsibili__c__typeInfo)) {
			setTs2__Supv_Responsibili__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Supv_Responsibili__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Travel_Requirement__c__typeInfo)) {
			setTs2__Travel_Requirement__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Travel_Requirement__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Work_Context__c__typeInfo)) {
			setTs2__Work_Context__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Work_Context__c__typeInfo,
					java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Work_Style__c__typeInfo)) {
			setTs2__Work_Style__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Work_Style__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Work_Values__c__typeInfo)) {
			setTs2__Work_Values__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Work_Values__c__typeInfo,
							java.lang.String.class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[Ts2__Descriptions__c ");
		sb.append(super.toString());
		sb.append(" ActivityHistories=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ActivityHistories)
				+ "'\n");
		sb.append(" Attachments=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Attachments)
				+ "'\n");
		sb.append(" CreatedBy=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedBy) + "'\n");
		sb.append(" CreatedById=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedById)
				+ "'\n");
		sb.append(" CreatedDate=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(CreatedDate)
				+ "'\n");
		sb.append(" Events=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Events) + "'\n");
		sb.append(" Histories=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Histories) + "'\n");
		sb.append(" IsDeleted=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(IsDeleted) + "'\n");
		sb.append(" LastActivityDate=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(LastActivityDate)
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
		sb.append(" Name=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Name) + "'\n");
		sb.append(" Notes=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Notes) + "'\n");
		sb.append(" NotesAndAttachments=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(NotesAndAttachments)
				+ "'\n");
		sb.append(" OpenActivities=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(OpenActivities)
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
		sb.append(" SystemModstamp=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(SystemModstamp)
				+ "'\n");
		sb.append(" Tags=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tags) + "'\n");
		sb.append(" Tasks=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tasks) + "'\n");
		sb.append(" ts2__Abilities__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Abilities__c)
				+ "'\n");
		sb.append(" ts2__Activities__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Activities__c)
				+ "'\n");
		sb.append(" ts2__Answers_1__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Answers_1__c)
				+ "'\n");
		sb.append(" ts2__Business_Unit__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Business_Unit__c)
				+ "'\n");
		sb.append(" ts2__Certificates_Licenses__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Certificates_Licenses__c) + "'\n");
		sb.append(" ts2__Correct_Answer_1__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Correct_Answer_1__c)
				+ "'\n");
		sb.append(" ts2__Desc_Tags__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Desc_Tags__c)
				+ "'\n");
		sb.append(" ts2__Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Description__c)
				+ "'\n");
		sb.append(" ts2__EEO_Code__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__EEO_Code__c)
				+ "'\n");
		sb.append(" ts2__Education_and_Experience__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Education_and_Experience__c) + "'\n");
		sb.append(" ts2__Essential_Duties__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Essential_Duties__c)
				+ "'\n");
		sb.append(" ts2__Interests__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Interests__c)
				+ "'\n");
		sb.append(" ts2__Job_Template_Mapping__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Template_Mapping__c) + "'\n");
		sb.append(" ts2__Job_Template_Mapping__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Template_Mapping__r) + "'\n");
		sb.append(" ts2__Knowledge__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Knowledge__c)
				+ "'\n");
		sb.append(" ts2__Language_Skills__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Language_Skills__c)
				+ "'\n");
		sb.append(" ts2__Legacy_JobTemplateID__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Legacy_JobTemplateID__c) + "'\n");
		sb.append(" ts2__Payroll_Job_Code__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Payroll_Job_Code__c)
				+ "'\n");
		sb.append(" ts2__Prepared_Date__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Prepared_Date__c)
				+ "'\n");
		sb.append(" ts2__Prepared__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Prepared__c)
				+ "'\n");
		sb.append(" ts2__Prepared__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Prepared__r)
				+ "'\n");
		sb.append(" ts2__Qualifications__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Qualifications__c)
				+ "'\n");
		sb.append(" ts2__Question_1__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question_1__c)
				+ "'\n");
		sb.append(" ts2__Question_2__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question_2__c)
				+ "'\n");
		sb.append(" ts2__Question_3__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Question_3__c)
				+ "'\n");
		sb.append(" ts2__R00N80000002e0CcEAI__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__R00N80000002e0CcEAI__r) + "'\n");
		sb.append(" ts2__Rule_Out_Questions__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Rule_Out_Questions__c) + "'\n");
		sb.append(" ts2__SOC_code__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__SOC_code__c)
				+ "'\n");
		sb.append(" ts2__Salary_Low__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Salary_Low__c)
				+ "'\n");
		sb.append(" ts2__Skills__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Skills__c)
				+ "'\n");
		sb.append(" ts2__Supv_Responsibili__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Supv_Responsibili__c) + "'\n");
		sb.append(" ts2__Travel_Requirement__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Travel_Requirement__c) + "'\n");
		sb.append(" ts2__Work_Context__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Work_Context__c)
				+ "'\n");
		sb.append(" ts2__Work_Style__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Work_Style__c)
				+ "'\n");
		sb.append(" ts2__Work_Values__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Work_Values__c)
				+ "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}