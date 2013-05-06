package com.sforce.soap.enterprise.sobject;

/** * Generated class, please do not edit. */
public class Ts2__Job__c extends com.sforce.soap.enterprise.sobject.SObject {
	/** * Constructor */
	public Ts2__Job__c() {
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
	 * * element : ts2__Account__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Account__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Account__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Account__c__is_set = false;
	private java.lang.String ts2__Account__c;

	public java.lang.String getTs2__Account__c() {
		return ts2__Account__c;
	}

	public void setTs2__Account__c(java.lang.String ts2__Account__c) {
		this.ts2__Account__c = ts2__Account__c;
		ts2__Account__c__is_set = true;
	}

	/**
	 * * element : ts2__Account__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}Account * java type:
	 * com.sforce.soap.enterprise.sobject.Account
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Account__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Account__r",
			"urn:sobject.enterprise.soap.sforce.com", "Account", 0, 1, true);
	private boolean ts2__Account__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Account ts2__Account__r;

	public com.sforce.soap.enterprise.sobject.Account getTs2__Account__r() {
		return ts2__Account__r;
	}

	public void setTs2__Account__r(
			com.sforce.soap.enterprise.sobject.Account ts2__Account__r) {
		this.ts2__Account__r = ts2__Account__r;
		ts2__Account__r__is_set = true;
	}

	/**
	 * * element : ts2__Application_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Application_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Application_Count__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Application_Count__c__is_set = false;
	private java.lang.Double ts2__Application_Count__c;

	public java.lang.Double getTs2__Application_Count__c() {
		return ts2__Application_Count__c;
	}

	public void setTs2__Application_Count__c(
			java.lang.Double ts2__Application_Count__c) {
		this.ts2__Application_Count__c = ts2__Application_Count__c;
		ts2__Application_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Applications__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Applications__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Applications__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Applications__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Applications__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Applications__r() {
		return ts2__Applications__r;
	}

	public void setTs2__Applications__r(
			com.sforce.soap.enterprise.QueryResult ts2__Applications__r) {
		this.ts2__Applications__r = ts2__Applications__r;
		ts2__Applications__r__is_set = true;
	}

	/**
	 * * element : ts2__Bonus__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Bonus__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Bonus__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Bonus__c__is_set = false;
	private java.lang.String ts2__Bonus__c;

	public java.lang.String getTs2__Bonus__c() {
		return ts2__Bonus__c;
	}

	public void setTs2__Bonus__c(java.lang.String ts2__Bonus__c) {
		this.ts2__Bonus__c = ts2__Bonus__c;
		ts2__Bonus__c__is_set = true;
	}

	/**
	 * * element : ts2__Burden_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Burden_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Burden_Pct__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Burden_Pct__c__is_set = false;
	private java.lang.Double ts2__Burden_Pct__c;

	public java.lang.Double getTs2__Burden_Pct__c() {
		return ts2__Burden_Pct__c;
	}

	public void setTs2__Burden_Pct__c(java.lang.Double ts2__Burden_Pct__c) {
		this.ts2__Burden_Pct__c = ts2__Burden_Pct__c;
		ts2__Burden_Pct__c__is_set = true;
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
	 * * element : ts2__CDate__c of type {http://www.w3.org/2001/XMLSchema}date
	 * * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__CDate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__CDate__c",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean ts2__CDate__c__is_set = false;
	private java.util.Calendar ts2__CDate__c;

	public java.util.Calendar getTs2__CDate__c() {
		return ts2__CDate__c;
	}

	public void setTs2__CDate__c(java.util.Calendar ts2__CDate__c) {
		this.ts2__CDate__c = ts2__CDate__c;
		ts2__CDate__c__is_set = true;
	}

	/**
	 * * element : ts2__Chance_this_search_will_be_filled__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Chance_this_search_will_be_filled__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Chance_this_search_will_be_filled__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Chance_this_search_will_be_filled__c__is_set = false;
	private java.lang.Double ts2__Chance_this_search_will_be_filled__c;

	public java.lang.Double getTs2__Chance_this_search_will_be_filled__c() {
		return ts2__Chance_this_search_will_be_filled__c;
	}

	public void setTs2__Chance_this_search_will_be_filled__c(
			java.lang.Double ts2__Chance_this_search_will_be_filled__c) {
		this.ts2__Chance_this_search_will_be_filled__c = ts2__Chance_this_search_will_be_filled__c;
		ts2__Chance_this_search_will_be_filled__c__is_set = true;
	}

	/**
	 * * element : ts2__Chatter_Hash_Tags__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Chatter_Hash_Tags__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Chatter_Hash_Tags__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Chatter_Hash_Tags__c__is_set = false;
	private java.lang.String ts2__Chatter_Hash_Tags__c;

	public java.lang.String getTs2__Chatter_Hash_Tags__c() {
		return ts2__Chatter_Hash_Tags__c;
	}

	public void setTs2__Chatter_Hash_Tags__c(
			java.lang.String ts2__Chatter_Hash_Tags__c) {
		this.ts2__Chatter_Hash_Tags__c = ts2__Chatter_Hash_Tags__c;
		ts2__Chatter_Hash_Tags__c__is_set = true;
	}

	/**
	 * * element : ts2__Clearance_Type__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Clearance_Type__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Clearance_Type__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Clearance_Type__c__is_set = false;
	private java.lang.String ts2__Clearance_Type__c;

	public java.lang.String getTs2__Clearance_Type__c() {
		return ts2__Clearance_Type__c;
	}

	public void setTs2__Clearance_Type__c(
			java.lang.String ts2__Clearance_Type__c) {
		this.ts2__Clearance_Type__c = ts2__Clearance_Type__c;
		ts2__Clearance_Type__c__is_set = true;
	}

	/**
	 * * element : ts2__Clearance__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Clearance__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Clearance__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Clearance__c__is_set = false;
	private java.lang.Boolean ts2__Clearance__c;

	public java.lang.Boolean getTs2__Clearance__c() {
		return ts2__Clearance__c;
	}

	public void setTs2__Clearance__c(java.lang.Boolean ts2__Clearance__c) {
		this.ts2__Clearance__c = ts2__Clearance__c;
		ts2__Clearance__c__is_set = true;
	}

	/**
	 * * element : ts2__Client_Address__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Client_Address__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Client_Address__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Client_Address__c__is_set = false;
	private java.lang.String ts2__Client_Address__c;

	public java.lang.String getTs2__Client_Address__c() {
		return ts2__Client_Address__c;
	}

	public void setTs2__Client_Address__c(
			java.lang.String ts2__Client_Address__c) {
		this.ts2__Client_Address__c = ts2__Client_Address__c;
		ts2__Client_Address__c__is_set = true;
	}

	/**
	 * * element : ts2__Client_Phone__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Client_Phone__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Client_Phone__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Client_Phone__c__is_set = false;
	private java.lang.String ts2__Client_Phone__c;

	public java.lang.String getTs2__Client_Phone__c() {
		return ts2__Client_Phone__c;
	}

	public void setTs2__Client_Phone__c(java.lang.String ts2__Client_Phone__c) {
		this.ts2__Client_Phone__c = ts2__Client_Phone__c;
		ts2__Client_Phone__c__is_set = true;
	}

	/**
	 * * element : ts2__Close_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Close_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Close_Pct__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Close_Pct__c__is_set = false;
	private java.lang.Double ts2__Close_Pct__c;

	public java.lang.Double getTs2__Close_Pct__c() {
		return ts2__Close_Pct__c;
	}

	public void setTs2__Close_Pct__c(java.lang.Double ts2__Close_Pct__c) {
		this.ts2__Close_Pct__c = ts2__Close_Pct__c;
		ts2__Close_Pct__c__is_set = true;
	}

	/**
	 * * element : ts2__Closed_Reason__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Closed_Reason__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Closed_Reason__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Closed_Reason__c__is_set = false;
	private java.lang.String ts2__Closed_Reason__c;

	public java.lang.String getTs2__Closed_Reason__c() {
		return ts2__Closed_Reason__c;
	}

	public void setTs2__Closed_Reason__c(java.lang.String ts2__Closed_Reason__c) {
		this.ts2__Closed_Reason__c = ts2__Closed_Reason__c;
		ts2__Closed_Reason__c__is_set = true;
	}

	/**
	 * * element : ts2__Contact_Email__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contact_Email__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contact_Email__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Contact_Email__c__is_set = false;
	private java.lang.String ts2__Contact_Email__c;

	public java.lang.String getTs2__Contact_Email__c() {
		return ts2__Contact_Email__c;
	}

	public void setTs2__Contact_Email__c(java.lang.String ts2__Contact_Email__c) {
		this.ts2__Contact_Email__c = ts2__Contact_Email__c;
		ts2__Contact_Email__c__is_set = true;
	}

	/**
	 * * element : ts2__Contact_Phone__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contact_Phone__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contact_Phone__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Contact_Phone__c__is_set = false;
	private java.lang.String ts2__Contact_Phone__c;

	public java.lang.String getTs2__Contact_Phone__c() {
		return ts2__Contact_Phone__c;
	}

	public void setTs2__Contact_Phone__c(java.lang.String ts2__Contact_Phone__c) {
		this.ts2__Contact_Phone__c = ts2__Contact_Phone__c;
		ts2__Contact_Phone__c__is_set = true;
	}

	/**
	 * * element : ts2__Contact__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contact__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contact__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Contact__c__is_set = false;
	private java.lang.String ts2__Contact__c;

	public java.lang.String getTs2__Contact__c() {
		return ts2__Contact__c;
	}

	public void setTs2__Contact__c(java.lang.String ts2__Contact__c) {
		this.ts2__Contact__c = ts2__Contact__c;
		ts2__Contact__c__is_set = true;
	}

	/**
	 * * element : ts2__Contact__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}Contact * java type:
	 * com.sforce.soap.enterprise.sobject.Contact
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contact__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contact__r",
			"urn:sobject.enterprise.soap.sforce.com", "Contact", 0, 1, true);
	private boolean ts2__Contact__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Contact ts2__Contact__r;

	public com.sforce.soap.enterprise.sobject.Contact getTs2__Contact__r() {
		return ts2__Contact__r;
	}

	public void setTs2__Contact__r(
			com.sforce.soap.enterprise.sobject.Contact ts2__Contact__r) {
		this.ts2__Contact__r = ts2__Contact__r;
		ts2__Contact__r__is_set = true;
	}

	/**
	 * * element : ts2__Contract__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contract__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contract__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Contract__c__is_set = false;
	private java.lang.String ts2__Contract__c;

	public java.lang.String getTs2__Contract__c() {
		return ts2__Contract__c;
	}

	public void setTs2__Contract__c(java.lang.String ts2__Contract__c) {
		this.ts2__Contract__c = ts2__Contract__c;
		ts2__Contract__c__is_set = true;
	}

	/**
	 * * element : ts2__Contract__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}Contract * java type:
	 * com.sforce.soap.enterprise.sobject.Contract
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Contract__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Contract__r",
			"urn:sobject.enterprise.soap.sforce.com", "Contract", 0, 1, true);
	private boolean ts2__Contract__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Contract ts2__Contract__r;

	public com.sforce.soap.enterprise.sobject.Contract getTs2__Contract__r() {
		return ts2__Contract__r;
	}

	public void setTs2__Contract__r(
			com.sforce.soap.enterprise.sobject.Contract ts2__Contract__r) {
		this.ts2__Contract__r = ts2__Contract__r;
		ts2__Contract__r__is_set = true;
	}

	/**
	 * * element : ts2__Conversion_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Conversion_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Conversion_Date__c", "http://www.w3.org/2001/XMLSchema",
			"date", 0, 1, true);
	private boolean ts2__Conversion_Date__c__is_set = false;
	private java.util.Calendar ts2__Conversion_Date__c;

	public java.util.Calendar getTs2__Conversion_Date__c() {
		return ts2__Conversion_Date__c;
	}

	public void setTs2__Conversion_Date__c(
			java.util.Calendar ts2__Conversion_Date__c) {
		this.ts2__Conversion_Date__c = ts2__Conversion_Date__c;
		ts2__Conversion_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Conversion_Fee_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Conversion_Fee_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Conversion_Fee_Pct__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Conversion_Fee_Pct__c__is_set = false;
	private java.lang.Double ts2__Conversion_Fee_Pct__c;

	public java.lang.Double getTs2__Conversion_Fee_Pct__c() {
		return ts2__Conversion_Fee_Pct__c;
	}

	public void setTs2__Conversion_Fee_Pct__c(
			java.lang.Double ts2__Conversion_Fee_Pct__c) {
		this.ts2__Conversion_Fee_Pct__c = ts2__Conversion_Fee_Pct__c;
		ts2__Conversion_Fee_Pct__c__is_set = true;
	}

	/**
	 * * element : ts2__Conversion_Fee__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Conversion_Fee__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Conversion_Fee__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Conversion_Fee__c__is_set = false;
	private java.lang.Double ts2__Conversion_Fee__c;

	public java.lang.Double getTs2__Conversion_Fee__c() {
		return ts2__Conversion_Fee__c;
	}

	public void setTs2__Conversion_Fee__c(
			java.lang.Double ts2__Conversion_Fee__c) {
		this.ts2__Conversion_Fee__c = ts2__Conversion_Fee__c;
		ts2__Conversion_Fee__c__is_set = true;
	}

	/**
	 * * element : ts2__Date_Filled__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Date_Filled__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Date_Filled__c",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean ts2__Date_Filled__c__is_set = false;
	private java.util.Calendar ts2__Date_Filled__c;

	public java.util.Calendar getTs2__Date_Filled__c() {
		return ts2__Date_Filled__c;
	}

	public void setTs2__Date_Filled__c(java.util.Calendar ts2__Date_Filled__c) {
		this.ts2__Date_Filled__c = ts2__Date_Filled__c;
		ts2__Date_Filled__c__is_set = true;
	}

	/**
	 * * element : ts2__Date_Posted__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Date_Posted__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Date_Posted__c",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean ts2__Date_Posted__c__is_set = false;
	private java.util.Calendar ts2__Date_Posted__c;

	public java.util.Calendar getTs2__Date_Posted__c() {
		return ts2__Date_Posted__c;
	}

	public void setTs2__Date_Posted__c(java.util.Calendar ts2__Date_Posted__c) {
		this.ts2__Date_Posted__c = ts2__Date_Posted__c;
		ts2__Date_Posted__c__is_set = true;
	}

	/**
	 * * element : ts2__Days_Gauge__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Days_Gauge__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Days_Gauge__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Days_Gauge__c__is_set = false;
	private java.lang.String ts2__Days_Gauge__c;

	public java.lang.String getTs2__Days_Gauge__c() {
		return ts2__Days_Gauge__c;
	}

	public void setTs2__Days_Gauge__c(java.lang.String ts2__Days_Gauge__c) {
		this.ts2__Days_Gauge__c = ts2__Days_Gauge__c;
		ts2__Days_Gauge__c__is_set = true;
	}

	/**
	 * * element : ts2__Days_Open__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Days_Open__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Days_Open__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Days_Open__c__is_set = false;
	private java.lang.Double ts2__Days_Open__c;

	public java.lang.Double getTs2__Days_Open__c() {
		return ts2__Days_Open__c;
	}

	public void setTs2__Days_Open__c(java.lang.Double ts2__Days_Open__c) {
		this.ts2__Days_Open__c = ts2__Days_Open__c;
		ts2__Days_Open__c__is_set = true;
	}

	/**
	 * * element : ts2__Days_to_Fill__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Days_to_Fill__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Days_to_Fill__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Days_to_Fill__c__is_set = false;
	private java.lang.Double ts2__Days_to_Fill__c;

	public java.lang.Double getTs2__Days_to_Fill__c() {
		return ts2__Days_to_Fill__c;
	}

	public void setTs2__Days_to_Fill__c(java.lang.Double ts2__Days_to_Fill__c) {
		this.ts2__Days_to_Fill__c = ts2__Days_to_Fill__c;
		ts2__Days_to_Fill__c__is_set = true;
	}

	/**
	 * * element : ts2__Department__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Department__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Department__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Department__c__is_set = false;
	private java.lang.String ts2__Department__c;

	public java.lang.String getTs2__Department__c() {
		return ts2__Department__c;
	}

	public void setTs2__Department__c(java.lang.String ts2__Department__c) {
		this.ts2__Department__c = ts2__Department__c;
		ts2__Department__c__is_set = true;
	}

	/**
	 * * element : ts2__Description_ID__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Description_ID__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Description_ID__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Description_ID__c__is_set = false;
	private java.lang.String ts2__Description_ID__c;

	public java.lang.String getTs2__Description_ID__c() {
		return ts2__Description_ID__c;
	}

	public void setTs2__Description_ID__c(
			java.lang.String ts2__Description_ID__c) {
		this.ts2__Description_ID__c = ts2__Description_ID__c;
		ts2__Description_ID__c__is_set = true;
	}

	/**
	 * * element : ts2__Description__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Description__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
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
	 * * element : ts2__Description__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Descriptions__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Description__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Description__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Descriptions__c",
			0, 1, true);
	private boolean ts2__Description__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c ts2__Description__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c getTs2__Description__r() {
		return ts2__Description__r;
	}

	public void setTs2__Description__r(
			com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c ts2__Description__r) {
		this.ts2__Description__r = ts2__Description__r;
		ts2__Description__r__is_set = true;
	}

	/**
	 * * element : ts2__Disable_EEO__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Disable_EEO__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Disable_EEO__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Disable_EEO__c__is_set = false;
	private java.lang.Boolean ts2__Disable_EEO__c;

	public java.lang.Boolean getTs2__Disable_EEO__c() {
		return ts2__Disable_EEO__c;
	}

	public void setTs2__Disable_EEO__c(java.lang.Boolean ts2__Disable_EEO__c) {
		this.ts2__Disable_EEO__c = ts2__Disable_EEO__c;
		ts2__Disable_EEO__c__is_set = true;
	}

	/**
	 * * element : ts2__Employment_Type__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Employment_Type__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Employment_Type__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Employment_Type__c__is_set = false;
	private java.lang.String ts2__Employment_Type__c;

	public java.lang.String getTs2__Employment_Type__c() {
		return ts2__Employment_Type__c;
	}

	public void setTs2__Employment_Type__c(
			java.lang.String ts2__Employment_Type__c) {
		this.ts2__Employment_Type__c = ts2__Employment_Type__c;
		ts2__Employment_Type__c__is_set = true;
	}

	/**
	 * * element : ts2__Estimated_End_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Estimated_End_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Estimated_End_Date__c", "http://www.w3.org/2001/XMLSchema",
			"date", 0, 1, true);
	private boolean ts2__Estimated_End_Date__c__is_set = false;
	private java.util.Calendar ts2__Estimated_End_Date__c;

	public java.util.Calendar getTs2__Estimated_End_Date__c() {
		return ts2__Estimated_End_Date__c;
	}

	public void setTs2__Estimated_End_Date__c(
			java.util.Calendar ts2__Estimated_End_Date__c) {
		this.ts2__Estimated_End_Date__c = ts2__Estimated_End_Date__c;
		ts2__Estimated_End_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Estimated_Fee__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Estimated_Fee__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Estimated_Fee__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Estimated_Fee__c__is_set = false;
	private java.lang.Double ts2__Estimated_Fee__c;

	public java.lang.Double getTs2__Estimated_Fee__c() {
		return ts2__Estimated_Fee__c;
	}

	public void setTs2__Estimated_Fee__c(java.lang.Double ts2__Estimated_Fee__c) {
		this.ts2__Estimated_Fee__c = ts2__Estimated_Fee__c;
		ts2__Estimated_Fee__c__is_set = true;
	}

	/**
	 * * element : ts2__Estimated_Gross_Margin__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Estimated_Gross_Margin__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Estimated_Gross_Margin__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Estimated_Gross_Margin__c__is_set = false;
	private java.lang.Double ts2__Estimated_Gross_Margin__c;

	public java.lang.Double getTs2__Estimated_Gross_Margin__c() {
		return ts2__Estimated_Gross_Margin__c;
	}

	public void setTs2__Estimated_Gross_Margin__c(
			java.lang.Double ts2__Estimated_Gross_Margin__c) {
		this.ts2__Estimated_Gross_Margin__c = ts2__Estimated_Gross_Margin__c;
		ts2__Estimated_Gross_Margin__c__is_set = true;
	}

	/**
	 * * element : ts2__Estimated_Hours__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Estimated_Hours__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Estimated_Hours__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Estimated_Hours__c__is_set = false;
	private java.lang.Double ts2__Estimated_Hours__c;

	public java.lang.Double getTs2__Estimated_Hours__c() {
		return ts2__Estimated_Hours__c;
	}

	public void setTs2__Estimated_Hours__c(
			java.lang.Double ts2__Estimated_Hours__c) {
		this.ts2__Estimated_Hours__c = ts2__Estimated_Hours__c;
		ts2__Estimated_Hours__c__is_set = true;
	}

	/**
	 * * element : ts2__Estimated_Start_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Estimated_Start_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Estimated_Start_Date__c", "http://www.w3.org/2001/XMLSchema",
			"date", 0, 1, true);
	private boolean ts2__Estimated_Start_Date__c__is_set = false;
	private java.util.Calendar ts2__Estimated_Start_Date__c;

	public java.util.Calendar getTs2__Estimated_Start_Date__c() {
		return ts2__Estimated_Start_Date__c;
	}

	public void setTs2__Estimated_Start_Date__c(
			java.util.Calendar ts2__Estimated_Start_Date__c) {
		this.ts2__Estimated_Start_Date__c = ts2__Estimated_Start_Date__c;
		ts2__Estimated_Start_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Expiration_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Expiration_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Expiration_Date__c", "http://www.w3.org/2001/XMLSchema",
			"date", 0, 1, true);
	private boolean ts2__Expiration_Date__c__is_set = false;
	private java.util.Calendar ts2__Expiration_Date__c;

	public java.util.Calendar getTs2__Expiration_Date__c() {
		return ts2__Expiration_Date__c;
	}

	public void setTs2__Expiration_Date__c(
			java.util.Calendar ts2__Expiration_Date__c) {
		this.ts2__Expiration_Date__c = ts2__Expiration_Date__c;
		ts2__Expiration_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Expires__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Expires__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Expires__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Expires__c__is_set = false;
	private java.lang.Boolean ts2__Expires__c;

	public java.lang.Boolean getTs2__Expires__c() {
		return ts2__Expires__c;
	}

	public void setTs2__Expires__c(java.lang.Boolean ts2__Expires__c) {
		this.ts2__Expires__c = ts2__Expires__c;
		ts2__Expires__c__is_set = true;
	}

	/**
	 * * element : ts2__FTE__c of type {http://www.w3.org/2001/XMLSchema}double
	 * * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__FTE__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__FTE__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__FTE__c__is_set = false;
	private java.lang.Double ts2__FTE__c;

	public java.lang.Double getTs2__FTE__c() {
		return ts2__FTE__c;
	}

	public void setTs2__FTE__c(java.lang.Double ts2__FTE__c) {
		this.ts2__FTE__c = ts2__FTE__c;
		ts2__FTE__c__is_set = true;
	}

	/**
	 * * element : ts2__Facility__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Facility__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Facility__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Facility__c__is_set = false;
	private java.lang.String ts2__Facility__c;

	public java.lang.String getTs2__Facility__c() {
		return ts2__Facility__c;
	}

	public void setTs2__Facility__c(java.lang.String ts2__Facility__c) {
		this.ts2__Facility__c = ts2__Facility__c;
		ts2__Facility__c__is_set = true;
	}

	/**
	 * * element : ts2__Fee_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Fee_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Fee_Pct__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Fee_Pct__c__is_set = false;
	private java.lang.Double ts2__Fee_Pct__c;

	public java.lang.Double getTs2__Fee_Pct__c() {
		return ts2__Fee_Pct__c;
	}

	public void setTs2__Fee_Pct__c(java.lang.Double ts2__Fee_Pct__c) {
		this.ts2__Fee_Pct__c = ts2__Fee_Pct__c;
		ts2__Fee_Pct__c__is_set = true;
	}

	/**
	 * * element : ts2__First_Year_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__First_Year_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__First_Year_Salary__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__First_Year_Salary__c__is_set = false;
	private java.lang.Double ts2__First_Year_Salary__c;

	public java.lang.Double getTs2__First_Year_Salary__c() {
		return ts2__First_Year_Salary__c;
	}

	public void setTs2__First_Year_Salary__c(
			java.lang.Double ts2__First_Year_Salary__c) {
		this.ts2__First_Year_Salary__c = ts2__First_Year_Salary__c;
		ts2__First_Year_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Forecasted_Revenue__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Forecasted_Revenue__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Forecasted_Revenue__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Forecasted_Revenue__c__is_set = false;
	private java.lang.Double ts2__Forecasted_Revenue__c;

	public java.lang.Double getTs2__Forecasted_Revenue__c() {
		return ts2__Forecasted_Revenue__c;
	}

	public void setTs2__Forecasted_Revenue__c(
			java.lang.Double ts2__Forecasted_Revenue__c) {
		this.ts2__Forecasted_Revenue__c = ts2__Forecasted_Revenue__c;
		ts2__Forecasted_Revenue__c__is_set = true;
	}

	/**
	 * * element : ts2__Internal_Notes__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Internal_Notes__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Internal_Notes__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Internal_Notes__c__is_set = false;
	private java.lang.String ts2__Internal_Notes__c;

	public java.lang.String getTs2__Internal_Notes__c() {
		return ts2__Internal_Notes__c;
	}

	public void setTs2__Internal_Notes__c(
			java.lang.String ts2__Internal_Notes__c) {
		this.ts2__Internal_Notes__c = ts2__Internal_Notes__c;
		ts2__Internal_Notes__c__is_set = true;
	}

	/**
	 * * element : ts2__Internal_Passing_Score__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Internal_Passing_Score__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Internal_Passing_Score__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Internal_Passing_Score__c__is_set = false;
	private java.lang.Double ts2__Internal_Passing_Score__c;

	public java.lang.Double getTs2__Internal_Passing_Score__c() {
		return ts2__Internal_Passing_Score__c;
	}

	public void setTs2__Internal_Passing_Score__c(
			java.lang.Double ts2__Internal_Passing_Score__c) {
		this.ts2__Internal_Passing_Score__c = ts2__Internal_Passing_Score__c;
		ts2__Internal_Passing_Score__c__is_set = true;
	}

	/**
	 * * element : ts2__Internal_Question_Set__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Internal_Question_Set__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Internal_Question_Set__c", "urn:enterprise.soap.sforce.com",
			"ID", 0, 1, true);
	private boolean ts2__Internal_Question_Set__c__is_set = false;
	private java.lang.String ts2__Internal_Question_Set__c;

	public java.lang.String getTs2__Internal_Question_Set__c() {
		return ts2__Internal_Question_Set__c;
	}

	public void setTs2__Internal_Question_Set__c(
			java.lang.String ts2__Internal_Question_Set__c) {
		this.ts2__Internal_Question_Set__c = ts2__Internal_Question_Set__c;
		ts2__Internal_Question_Set__c__is_set = true;
	}

	/**
	 * * element : ts2__Internal_Question_Set__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Question_Set__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Internal_Question_Set__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Internal_Question_Set__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_Set__c",
			0, 1, true);
	private boolean ts2__Internal_Question_Set__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c ts2__Internal_Question_Set__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c getTs2__Internal_Question_Set__r() {
		return ts2__Internal_Question_Set__r;
	}

	public void setTs2__Internal_Question_Set__r(
			com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c ts2__Internal_Question_Set__r) {
		this.ts2__Internal_Question_Set__r = ts2__Internal_Question_Set__r;
		ts2__Internal_Question_Set__r__is_set = true;
	}

	/**
	 * * element : ts2__Interview_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Interview_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Interview_Count__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Interview_Count__c__is_set = false;
	private java.lang.Double ts2__Interview_Count__c;

	public java.lang.Double getTs2__Interview_Count__c() {
		return ts2__Interview_Count__c;
	}

	public void setTs2__Interview_Count__c(
			java.lang.Double ts2__Interview_Count__c) {
		this.ts2__Interview_Count__c = ts2__Interview_Count__c;
		ts2__Interview_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Interviews__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Interviews__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Interviews__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Interviews__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Interviews__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Interviews__r() {
		return ts2__Interviews__r;
	}

	public void setTs2__Interviews__r(
			com.sforce.soap.enterprise.QueryResult ts2__Interviews__r) {
		this.ts2__Interviews__r = ts2__Interviews__r;
		ts2__Interviews__r__is_set = true;
	}

	/**
	 * * element : ts2__JobNotificationsSummary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__JobNotificationsSummary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__JobNotificationsSummary__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__JobNotificationsSummary__c__is_set = false;
	private java.lang.Double ts2__JobNotificationsSummary__c;

	public java.lang.Double getTs2__JobNotificationsSummary__c() {
		return ts2__JobNotificationsSummary__c;
	}

	public void setTs2__JobNotificationsSummary__c(
			java.lang.Double ts2__JobNotificationsSummary__c) {
		this.ts2__JobNotificationsSummary__c = ts2__JobNotificationsSummary__c;
		ts2__JobNotificationsSummary__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Advertisement__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Advertisement__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Advertisement__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Job_Advertisement__c__is_set = false;
	private java.lang.String ts2__Job_Advertisement__c;

	public java.lang.String getTs2__Job_Advertisement__c() {
		return ts2__Job_Advertisement__c;
	}

	public void setTs2__Job_Advertisement__c(
			java.lang.String ts2__Job_Advertisement__c) {
		this.ts2__Job_Advertisement__c = ts2__Job_Advertisement__c;
		ts2__Job_Advertisement__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Description__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Job_Description__c__is_set = false;
	private java.lang.String ts2__Job_Description__c;

	public java.lang.String getTs2__Job_Description__c() {
		return ts2__Job_Description__c;
	}

	public void setTs2__Job_Description__c(
			java.lang.String ts2__Job_Description__c) {
		this.ts2__Job_Description__c = ts2__Job_Description__c;
		ts2__Job_Description__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Family__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Family__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Family__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Family__c__is_set = false;
	private java.lang.String ts2__Job_Family__c;

	public java.lang.String getTs2__Job_Family__c() {
		return ts2__Job_Family__c;
	}

	public void setTs2__Job_Family__c(java.lang.String ts2__Job_Family__c) {
		this.ts2__Job_Family__c = ts2__Job_Family__c;
		ts2__Job_Family__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Function__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Function__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Function__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Function__c__is_set = false;
	private java.lang.String ts2__Job_Function__c;

	public java.lang.String getTs2__Job_Function__c() {
		return ts2__Job_Function__c;
	}

	public void setTs2__Job_Function__c(java.lang.String ts2__Job_Function__c) {
		this.ts2__Job_Function__c = ts2__Job_Function__c;
		ts2__Job_Function__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_NamedSearch__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_NamedSearch__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_NamedSearch__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2__Job_NamedSearch__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Job_NamedSearch__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Job_NamedSearch__r() {
		return ts2__Job_NamedSearch__r;
	}

	public void setTs2__Job_NamedSearch__r(
			com.sforce.soap.enterprise.QueryResult ts2__Job_NamedSearch__r) {
		this.ts2__Job_NamedSearch__r = ts2__Job_NamedSearch__r;
		ts2__Job_NamedSearch__r__is_set = true;
	}

	/**
	 * * element : ts2__Job_Number__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Number__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Number__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Number__c__is_set = false;
	private java.lang.String ts2__Job_Number__c;

	public java.lang.String getTs2__Job_Number__c() {
		return ts2__Job_Number__c;
	}

	public void setTs2__Job_Number__c(java.lang.String ts2__Job_Number__c) {
		this.ts2__Job_Number__c = ts2__Job_Number__c;
		ts2__Job_Number__c__is_set = true;
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
	 * * element : ts2__Job_Order_Transalations__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Order_Transalations__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Order_Transalations__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Job_Order_Transalations__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Job_Order_Transalations__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Job_Order_Transalations__r() {
		return ts2__Job_Order_Transalations__r;
	}

	public void setTs2__Job_Order_Transalations__r(
			com.sforce.soap.enterprise.QueryResult ts2__Job_Order_Transalations__r) {
		this.ts2__Job_Order_Transalations__r = ts2__Job_Order_Transalations__r;
		ts2__Job_Order_Transalations__r__is_set = true;
	}

	/**
	 * * element : ts2__Job_Rank__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Rank__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Rank__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Rank__c__is_set = false;
	private java.lang.String ts2__Job_Rank__c;

	public java.lang.String getTs2__Job_Rank__c() {
		return ts2__Job_Rank__c;
	}

	public void setTs2__Job_Rank__c(java.lang.String ts2__Job_Rank__c) {
		this.ts2__Job_Rank__c = ts2__Job_Rank__c;
		ts2__Job_Rank__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Tag__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Tag__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Job_Tag__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Job_Tag__c__is_set = false;
	private java.lang.String ts2__Job_Tag__c;

	public java.lang.String getTs2__Job_Tag__c() {
		return ts2__Job_Tag__c;
	}

	public void setTs2__Job_Tag__c(java.lang.String ts2__Job_Tag__c) {
		this.ts2__Job_Tag__c = ts2__Job_Tag__c;
		ts2__Job_Tag__c__is_set = true;
	}

	/**
	 * * element : ts2__Job_Title_Number__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Job_Title_Number__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Job_Title_Number__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Job_Title_Number__c__is_set = false;
	private java.lang.String ts2__Job_Title_Number__c;

	public java.lang.String getTs2__Job_Title_Number__c() {
		return ts2__Job_Title_Number__c;
	}

	public void setTs2__Job_Title_Number__c(
			java.lang.String ts2__Job_Title_Number__c) {
		this.ts2__Job_Title_Number__c = ts2__Job_Title_Number__c;
		ts2__Job_Title_Number__c__is_set = true;
	}

	/**
	 * * element : ts2__Jobs_Contact_Notification__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Jobs_Contact_Notification__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Jobs_Contact_Notification__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Jobs_Contact_Notification__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Jobs_Contact_Notification__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Jobs_Contact_Notification__r() {
		return ts2__Jobs_Contact_Notification__r;
	}

	public void setTs2__Jobs_Contact_Notification__r(
			com.sforce.soap.enterprise.QueryResult ts2__Jobs_Contact_Notification__r) {
		this.ts2__Jobs_Contact_Notification__r = ts2__Jobs_Contact_Notification__r;
		ts2__Jobs_Contact_Notification__r__is_set = true;
	}

	/**
	 * * element : ts2__KPI_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__KPI_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__KPI_Count__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__KPI_Count__c__is_set = false;
	private java.lang.Double ts2__KPI_Count__c;

	public java.lang.Double getTs2__KPI_Count__c() {
		return ts2__KPI_Count__c;
	}

	public void setTs2__KPI_Count__c(java.lang.Double ts2__KPI_Count__c) {
		this.ts2__KPI_Count__c = ts2__KPI_Count__c;
		ts2__KPI_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Last_Modified_Date_for_S_Control__c of type
	 * {http://www.w3.org/2001/XMLSchema}dateTime * java type:
	 * java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Last_Modified_Date_for_S_Control__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Last_Modified_Date_for_S_Control__c",
			"http://www.w3.org/2001/XMLSchema", "dateTime", 0, 1, true);
	private boolean ts2__Last_Modified_Date_for_S_Control__c__is_set = false;
	private java.util.Calendar ts2__Last_Modified_Date_for_S_Control__c;

	public java.util.Calendar getTs2__Last_Modified_Date_for_S_Control__c() {
		return ts2__Last_Modified_Date_for_S_Control__c;
	}

	public void setTs2__Last_Modified_Date_for_S_Control__c(
			java.util.Calendar ts2__Last_Modified_Date_for_S_Control__c) {
		this.ts2__Last_Modified_Date_for_S_Control__c = ts2__Last_Modified_Date_for_S_Control__c;
		ts2__Last_Modified_Date_for_S_Control__c__is_set = true;
	}

	/**
	 * * element : ts2__Legacy_JobID__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Legacy_JobID__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Legacy_JobID__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Legacy_JobID__c__is_set = false;
	private java.lang.String ts2__Legacy_JobID__c;

	public java.lang.String getTs2__Legacy_JobID__c() {
		return ts2__Legacy_JobID__c;
	}

	public void setTs2__Legacy_JobID__c(java.lang.String ts2__Legacy_JobID__c) {
		this.ts2__Legacy_JobID__c = ts2__Legacy_JobID__c;
		ts2__Legacy_JobID__c__is_set = true;
	}

	/**
	 * * element : ts2__Localized_Job_Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Localized_Job_Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Localized_Job_Description__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Localized_Job_Description__c__is_set = false;
	private java.lang.String ts2__Localized_Job_Description__c;

	public java.lang.String getTs2__Localized_Job_Description__c() {
		return ts2__Localized_Job_Description__c;
	}

	public void setTs2__Localized_Job_Description__c(
			java.lang.String ts2__Localized_Job_Description__c) {
		this.ts2__Localized_Job_Description__c = ts2__Localized_Job_Description__c;
		ts2__Localized_Job_Description__c__is_set = true;
	}

	/**
	 * * element : ts2__Localized_Job_Title__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Localized_Job_Title__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Localized_Job_Title__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Localized_Job_Title__c__is_set = false;
	private java.lang.String ts2__Localized_Job_Title__c;

	public java.lang.String getTs2__Localized_Job_Title__c() {
		return ts2__Localized_Job_Title__c;
	}

	public void setTs2__Localized_Job_Title__c(
			java.lang.String ts2__Localized_Job_Title__c) {
		this.ts2__Localized_Job_Title__c = ts2__Localized_Job_Title__c;
		ts2__Localized_Job_Title__c__is_set = true;
	}

	/**
	 * * element : ts2__Location__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Location__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Location__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Location__c__is_set = false;
	private java.lang.String ts2__Location__c;

	public java.lang.String getTs2__Location__c() {
		return ts2__Location__c;
	}

	public void setTs2__Location__c(java.lang.String ts2__Location__c) {
		this.ts2__Location__c = ts2__Location__c;
		ts2__Location__c__is_set = true;
	}

	/**
	 * * element : ts2__Manager__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Manager__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Manager__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Manager__c__is_set = false;
	private java.lang.String ts2__Manager__c;

	public java.lang.String getTs2__Manager__c() {
		return ts2__Manager__c;
	}

	public void setTs2__Manager__c(java.lang.String ts2__Manager__c) {
		this.ts2__Manager__c = ts2__Manager__c;
		ts2__Manager__c__is_set = true;
	}

	/**
	 * * element : ts2__Manager__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Manager__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Manager__r",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean ts2__Manager__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.User ts2__Manager__r;

	public com.sforce.soap.enterprise.sobject.User getTs2__Manager__r() {
		return ts2__Manager__r;
	}

	public void setTs2__Manager__r(
			com.sforce.soap.enterprise.sobject.User ts2__Manager__r) {
		this.ts2__Manager__r = ts2__Manager__r;
		ts2__Manager__r__is_set = true;
	}

	/**
	 * * element : ts2__Markup_Bill__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Markup_Bill__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Markup_Bill__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Markup_Bill__c__is_set = false;
	private java.lang.Double ts2__Markup_Bill__c;

	public java.lang.Double getTs2__Markup_Bill__c() {
		return ts2__Markup_Bill__c;
	}

	public void setTs2__Markup_Bill__c(java.lang.Double ts2__Markup_Bill__c) {
		this.ts2__Markup_Bill__c = ts2__Markup_Bill__c;
		ts2__Markup_Bill__c__is_set = true;
	}

	/**
	 * * element : ts2__Markup_Pay__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Markup_Pay__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Markup_Pay__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Markup_Pay__c__is_set = false;
	private java.lang.Double ts2__Markup_Pay__c;

	public java.lang.Double getTs2__Markup_Pay__c() {
		return ts2__Markup_Pay__c;
	}

	public void setTs2__Markup_Pay__c(java.lang.Double ts2__Markup_Pay__c) {
		this.ts2__Markup_Pay__c = ts2__Markup_Pay__c;
		ts2__Markup_Pay__c__is_set = true;
	}

	/**
	 * * element : ts2__Markup_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Markup_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Markup_Pct__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Markup_Pct__c__is_set = false;
	private java.lang.Double ts2__Markup_Pct__c;

	public java.lang.Double getTs2__Markup_Pct__c() {
		return ts2__Markup_Pct__c;
	}

	public void setTs2__Markup_Pct__c(java.lang.Double ts2__Markup_Pct__c) {
		this.ts2__Markup_Pct__c = ts2__Markup_Pct__c;
		ts2__Markup_Pct__c__is_set = true;
	}

	/**
	 * * element : ts2__Markup__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Markup__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Markup__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Markup__c__is_set = false;
	private java.lang.Boolean ts2__Markup__c;

	public java.lang.Boolean getTs2__Markup__c() {
		return ts2__Markup__c;
	}

	public void setTs2__Markup__c(java.lang.Boolean ts2__Markup__c) {
		this.ts2__Markup__c = ts2__Markup__c;
		ts2__Markup__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Bill_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Bill_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Max_Bill_Rate__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Bill_Rate__c__is_set = false;
	private java.lang.Double ts2__Max_Bill_Rate__c;

	public java.lang.Double getTs2__Max_Bill_Rate__c() {
		return ts2__Max_Bill_Rate__c;
	}

	public void setTs2__Max_Bill_Rate__c(java.lang.Double ts2__Max_Bill_Rate__c) {
		this.ts2__Max_Bill_Rate__c = ts2__Max_Bill_Rate__c;
		ts2__Max_Bill_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Conversion_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Conversion_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Max_Conversion_Salary__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Conversion_Salary__c__is_set = false;
	private java.lang.Double ts2__Max_Conversion_Salary__c;

	public java.lang.Double getTs2__Max_Conversion_Salary__c() {
		return ts2__Max_Conversion_Salary__c;
	}

	public void setTs2__Max_Conversion_Salary__c(
			java.lang.Double ts2__Max_Conversion_Salary__c) {
		this.ts2__Max_Conversion_Salary__c = ts2__Max_Conversion_Salary__c;
		ts2__Max_Conversion_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Pay_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Pay_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Max_Pay_Rate__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Pay_Rate__c__is_set = false;
	private java.lang.Double ts2__Max_Pay_Rate__c;

	public java.lang.Double getTs2__Max_Pay_Rate__c() {
		return ts2__Max_Pay_Rate__c;
	}

	public void setTs2__Max_Pay_Rate__c(java.lang.Double ts2__Max_Pay_Rate__c) {
		this.ts2__Max_Pay_Rate__c = ts2__Max_Pay_Rate__c;
		ts2__Max_Pay_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Max_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Max_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Max_Salary__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Max_Salary__c__is_set = false;
	private java.lang.Double ts2__Max_Salary__c;

	public java.lang.Double getTs2__Max_Salary__c() {
		return ts2__Max_Salary__c;
	}

	public void setTs2__Max_Salary__c(java.lang.Double ts2__Max_Salary__c) {
		this.ts2__Max_Salary__c = ts2__Max_Salary__c;
		ts2__Max_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Metro__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Metro__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Metro__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Metro__c__is_set = false;
	private java.lang.String ts2__Metro__c;

	public java.lang.String getTs2__Metro__c() {
		return ts2__Metro__c;
	}

	public void setTs2__Metro__c(java.lang.String ts2__Metro__c) {
		this.ts2__Metro__c = ts2__Metro__c;
		ts2__Metro__c__is_set = true;
	}

	/**
	 * * element : ts2__Min_Bill_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Min_Bill_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Min_Bill_Rate__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Min_Bill_Rate__c__is_set = false;
	private java.lang.Double ts2__Min_Bill_Rate__c;

	public java.lang.Double getTs2__Min_Bill_Rate__c() {
		return ts2__Min_Bill_Rate__c;
	}

	public void setTs2__Min_Bill_Rate__c(java.lang.Double ts2__Min_Bill_Rate__c) {
		this.ts2__Min_Bill_Rate__c = ts2__Min_Bill_Rate__c;
		ts2__Min_Bill_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Min_Conversion_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Min_Conversion_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Min_Conversion_Salary__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Min_Conversion_Salary__c__is_set = false;
	private java.lang.Double ts2__Min_Conversion_Salary__c;

	public java.lang.Double getTs2__Min_Conversion_Salary__c() {
		return ts2__Min_Conversion_Salary__c;
	}

	public void setTs2__Min_Conversion_Salary__c(
			java.lang.Double ts2__Min_Conversion_Salary__c) {
		this.ts2__Min_Conversion_Salary__c = ts2__Min_Conversion_Salary__c;
		ts2__Min_Conversion_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Min_Pay_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Min_Pay_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Min_Pay_Rate__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Min_Pay_Rate__c__is_set = false;
	private java.lang.Double ts2__Min_Pay_Rate__c;

	public java.lang.Double getTs2__Min_Pay_Rate__c() {
		return ts2__Min_Pay_Rate__c;
	}

	public void setTs2__Min_Pay_Rate__c(java.lang.Double ts2__Min_Pay_Rate__c) {
		this.ts2__Min_Pay_Rate__c = ts2__Min_Pay_Rate__c;
		ts2__Min_Pay_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Min_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Min_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Min_Salary__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Min_Salary__c__is_set = false;
	private java.lang.Double ts2__Min_Salary__c;

	public java.lang.Double getTs2__Min_Salary__c() {
		return ts2__Min_Salary__c;
	}

	public void setTs2__Min_Salary__c(java.lang.Double ts2__Min_Salary__c) {
		this.ts2__Min_Salary__c = ts2__Min_Salary__c;
		ts2__Min_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Offer_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Offer_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Offer_Count__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Offer_Count__c__is_set = false;
	private java.lang.Double ts2__Offer_Count__c;

	public java.lang.Double getTs2__Offer_Count__c() {
		return ts2__Offer_Count__c;
	}

	public void setTs2__Offer_Count__c(java.lang.Double ts2__Offer_Count__c) {
		this.ts2__Offer_Count__c = ts2__Offer_Count__c;
		ts2__Offer_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Offers__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Offers__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Offers__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Offers__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Offers__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Offers__r() {
		return ts2__Offers__r;
	}

	public void setTs2__Offers__r(
			com.sforce.soap.enterprise.QueryResult ts2__Offers__r) {
		this.ts2__Offers__r = ts2__Offers__r;
		ts2__Offers__r__is_set = true;
	}

	/**
	 * * element : ts2__Openings__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Openings__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Openings__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Openings__c__is_set = false;
	private java.lang.Double ts2__Openings__c;

	public java.lang.Double getTs2__Openings__c() {
		return ts2__Openings__c;
	}

	public void setTs2__Openings__c(java.lang.Double ts2__Openings__c) {
		this.ts2__Openings__c = ts2__Openings__c;
		ts2__Openings__c__is_set = true;
	}

	/**
	 * * element : ts2__Order__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Order__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Order__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Order__c__is_set = false;
	private java.lang.String ts2__Order__c;

	public java.lang.String getTs2__Order__c() {
		return ts2__Order__c;
	}

	public void setTs2__Order__c(java.lang.String ts2__Order__c) {
		this.ts2__Order__c = ts2__Order__c;
		ts2__Order__c__is_set = true;
	}

	/**
	 * * element : ts2__Passing_Score__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Passing_Score__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Passing_Score__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Passing_Score__c__is_set = false;
	private java.lang.Double ts2__Passing_Score__c;

	public java.lang.Double getTs2__Passing_Score__c() {
		return ts2__Passing_Score__c;
	}

	public void setTs2__Passing_Score__c(java.lang.Double ts2__Passing_Score__c) {
		this.ts2__Passing_Score__c = ts2__Passing_Score__c;
		ts2__Passing_Score__c__is_set = true;
	}

	/**
	 * * element : ts2__Per_Diem_Bill_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Per_Diem_Bill_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Per_Diem_Bill_Rate__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Per_Diem_Bill_Rate__c__is_set = false;
	private java.lang.Double ts2__Per_Diem_Bill_Rate__c;

	public java.lang.Double getTs2__Per_Diem_Bill_Rate__c() {
		return ts2__Per_Diem_Bill_Rate__c;
	}

	public void setTs2__Per_Diem_Bill_Rate__c(
			java.lang.Double ts2__Per_Diem_Bill_Rate__c) {
		this.ts2__Per_Diem_Bill_Rate__c = ts2__Per_Diem_Bill_Rate__c;
		ts2__Per_Diem_Bill_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Per_Diem_Diff_Pct__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Per_Diem_Diff_Pct__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Per_Diem_Diff_Pct__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Per_Diem_Diff_Pct__c__is_set = false;
	private java.lang.Double ts2__Per_Diem_Diff_Pct__c;

	public java.lang.Double getTs2__Per_Diem_Diff_Pct__c() {
		return ts2__Per_Diem_Diff_Pct__c;
	}

	public void setTs2__Per_Diem_Diff_Pct__c(
			java.lang.Double ts2__Per_Diem_Diff_Pct__c) {
		this.ts2__Per_Diem_Diff_Pct__c = ts2__Per_Diem_Diff_Pct__c;
		ts2__Per_Diem_Diff_Pct__c__is_set = true;
	}

	/**
	 * * element : ts2__Per_Diem_Pay_Rate__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Per_Diem_Pay_Rate__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Per_Diem_Pay_Rate__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Per_Diem_Pay_Rate__c__is_set = false;
	private java.lang.Double ts2__Per_Diem_Pay_Rate__c;

	public java.lang.Double getTs2__Per_Diem_Pay_Rate__c() {
		return ts2__Per_Diem_Pay_Rate__c;
	}

	public void setTs2__Per_Diem_Pay_Rate__c(
			java.lang.Double ts2__Per_Diem_Pay_Rate__c) {
		this.ts2__Per_Diem_Pay_Rate__c = ts2__Per_Diem_Pay_Rate__c;
		ts2__Per_Diem_Pay_Rate__c__is_set = true;
	}

	/**
	 * * element : ts2__Per_Diem__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Per_Diem__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Per_Diem__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Per_Diem__c__is_set = false;
	private java.lang.Boolean ts2__Per_Diem__c;

	public java.lang.Boolean getTs2__Per_Diem__c() {
		return ts2__Per_Diem__c;
	}

	public void setTs2__Per_Diem__c(java.lang.Boolean ts2__Per_Diem__c) {
		this.ts2__Per_Diem__c = ts2__Per_Diem__c;
		ts2__Per_Diem__c__is_set = true;
	}

	/**
	 * * element : ts2__Percentage_Fee__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Percentage_Fee__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Percentage_Fee__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Percentage_Fee__c__is_set = false;
	private java.lang.Double ts2__Percentage_Fee__c;

	public java.lang.Double getTs2__Percentage_Fee__c() {
		return ts2__Percentage_Fee__c;
	}

	public void setTs2__Percentage_Fee__c(
			java.lang.Double ts2__Percentage_Fee__c) {
		this.ts2__Percentage_Fee__c = ts2__Percentage_Fee__c;
		ts2__Percentage_Fee__c__is_set = true;
	}

	/**
	 * * element : ts2__Placement_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Placement_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Placement_Count__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Placement_Count__c__is_set = false;
	private java.lang.Double ts2__Placement_Count__c;

	public java.lang.Double getTs2__Placement_Count__c() {
		return ts2__Placement_Count__c;
	}

	public void setTs2__Placement_Count__c(
			java.lang.Double ts2__Placement_Count__c) {
		this.ts2__Placement_Count__c = ts2__Placement_Count__c;
		ts2__Placement_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Placements__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Placements__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Placements__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Placements__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Placements__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Placements__r() {
		return ts2__Placements__r;
	}

	public void setTs2__Placements__r(
			com.sforce.soap.enterprise.QueryResult ts2__Placements__r) {
		this.ts2__Placements__r = ts2__Placements__r;
		ts2__Placements__r__is_set = true;
	}

	/**
	 * * element : ts2__Post_Job__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Post_Job__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Post_Job__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Post_Job__c__is_set = false;
	private java.lang.Boolean ts2__Post_Job__c;

	public java.lang.Boolean getTs2__Post_Job__c() {
		return ts2__Post_Job__c;
	}

	public void setTs2__Post_Job__c(java.lang.Boolean ts2__Post_Job__c) {
		this.ts2__Post_Job__c = ts2__Post_Job__c;
		ts2__Post_Job__c__is_set = true;
	}

	/**
	 * * element : ts2__Post_to_Chatter__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Post_to_Chatter__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Post_to_Chatter__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Post_to_Chatter__c__is_set = false;
	private java.lang.Boolean ts2__Post_to_Chatter__c;

	public java.lang.Boolean getTs2__Post_to_Chatter__c() {
		return ts2__Post_to_Chatter__c;
	}

	public void setTs2__Post_to_Chatter__c(
			java.lang.Boolean ts2__Post_to_Chatter__c) {
		this.ts2__Post_to_Chatter__c = ts2__Post_to_Chatter__c;
		ts2__Post_to_Chatter__c__is_set = true;
	}

	/**
	 * * element : ts2__Posted_to_Prospects__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Posted_to_Prospects__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Posted_to_Prospects__c", "http://www.w3.org/2001/XMLSchema",
			"boolean", 0, 1, true);
	private boolean ts2__Posted_to_Prospects__c__is_set = false;
	private java.lang.Boolean ts2__Posted_to_Prospects__c;

	public java.lang.Boolean getTs2__Posted_to_Prospects__c() {
		return ts2__Posted_to_Prospects__c;
	}

	public void setTs2__Posted_to_Prospects__c(
			java.lang.Boolean ts2__Posted_to_Prospects__c) {
		this.ts2__Posted_to_Prospects__c = ts2__Posted_to_Prospects__c;
		ts2__Posted_to_Prospects__c__is_set = true;
	}

	/**
	 * * element : ts2__Posting_Status__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Posting_Status__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Posting_Status__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Posting_Status__c__is_set = false;
	private java.lang.String ts2__Posting_Status__c;

	public java.lang.String getTs2__Posting_Status__c() {
		return ts2__Posting_Status__c;
	}

	public void setTs2__Posting_Status__c(
			java.lang.String ts2__Posting_Status__c) {
		this.ts2__Posting_Status__c = ts2__Posting_Status__c;
		ts2__Posting_Status__c__is_set = true;
	}

	/**
	 * * element : ts2__Presents__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Presents__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Presents__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Presents__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Presents__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Presents__r() {
		return ts2__Presents__r;
	}

	public void setTs2__Presents__r(
			com.sforce.soap.enterprise.QueryResult ts2__Presents__r) {
		this.ts2__Presents__r = ts2__Presents__r;
		ts2__Presents__r__is_set = true;
	}

	/**
	 * * element : ts2__Priority__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Priority__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Priority__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Priority__c__is_set = false;
	private java.lang.String ts2__Priority__c;

	public java.lang.String getTs2__Priority__c() {
		return ts2__Priority__c;
	}

	public void setTs2__Priority__c(java.lang.String ts2__Priority__c) {
		this.ts2__Priority__c = ts2__Priority__c;
		ts2__Priority__c__is_set = true;
	}

	/**
	 * * element : ts2__Project__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Project__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Project__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Project__c__is_set = false;
	private java.lang.String ts2__Project__c;

	public java.lang.String getTs2__Project__c() {
		return ts2__Project__c;
	}

	public void setTs2__Project__c(java.lang.String ts2__Project__c) {
		this.ts2__Project__c = ts2__Project__c;
		ts2__Project__c__is_set = true;
	}

	/**
	 * * element : ts2__Project__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Project_Job__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Project__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Project__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Project_Job__c", 0,
			1, true);
	private boolean ts2__Project__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c ts2__Project__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c getTs2__Project__r() {
		return ts2__Project__r;
	}

	public void setTs2__Project__r(
			com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c ts2__Project__r) {
		this.ts2__Project__r = ts2__Project__r;
		ts2__Project__r__is_set = true;
	}

	/**
	 * * element : ts2__Prospects__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Prospects__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Prospects__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Prospects__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Prospects__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Prospects__r() {
		return ts2__Prospects__r;
	}

	public void setTs2__Prospects__r(
			com.sforce.soap.enterprise.QueryResult ts2__Prospects__r) {
		this.ts2__Prospects__r = ts2__Prospects__r;
		ts2__Prospects__r__is_set = true;
	}

	/**
	 * * element : ts2__Question_Set__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question_Set__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_Set__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Question_Set__c__is_set = false;
	private java.lang.String ts2__Question_Set__c;

	public java.lang.String getTs2__Question_Set__c() {
		return ts2__Question_Set__c;
	}

	public void setTs2__Question_Set__c(java.lang.String ts2__Question_Set__c) {
		this.ts2__Question_Set__c = ts2__Question_Set__c;
		ts2__Question_Set__c__is_set = true;
	}

	/**
	 * * element : ts2__Question_Set__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}ts2__Question_Set__c * java type:
	 * com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Question_Set__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_Set__r",
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Question_Set__c",
			0, 1, true);
	private boolean ts2__Question_Set__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c ts2__Question_Set__r;

	public com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c getTs2__Question_Set__r() {
		return ts2__Question_Set__r;
	}

	public void setTs2__Question_Set__r(
			com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c ts2__Question_Set__r) {
		this.ts2__Question_Set__r = ts2__Question_Set__r;
		ts2__Question_Set__r__is_set = true;
	}

	/**
	 * * element : ts2__Recruiter__c of type {urn:enterprise.soap.sforce.com}ID
	 * * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Recruiter__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Recruiter__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__Recruiter__c__is_set = false;
	private java.lang.String ts2__Recruiter__c;

	public java.lang.String getTs2__Recruiter__c() {
		return ts2__Recruiter__c;
	}

	public void setTs2__Recruiter__c(java.lang.String ts2__Recruiter__c) {
		this.ts2__Recruiter__c = ts2__Recruiter__c;
		ts2__Recruiter__c__is_set = true;
	}

	/**
	 * * element : ts2__Recruiter__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Recruiter__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Recruiter__r",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean ts2__Recruiter__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.User ts2__Recruiter__r;

	public com.sforce.soap.enterprise.sobject.User getTs2__Recruiter__r() {
		return ts2__Recruiter__r;
	}

	public void setTs2__Recruiter__r(
			com.sforce.soap.enterprise.sobject.User ts2__Recruiter__r) {
		this.ts2__Recruiter__r = ts2__Recruiter__r;
		ts2__Recruiter__r__is_set = true;
	}

	/**
	 * * element : ts2__Referrals1__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Referrals1__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Referrals1__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Referrals1__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Referrals1__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Referrals1__r() {
		return ts2__Referrals1__r;
	}

	public void setTs2__Referrals1__r(
			com.sforce.soap.enterprise.QueryResult ts2__Referrals1__r) {
		this.ts2__Referrals1__r = ts2__Referrals1__r;
		ts2__Referrals1__r__is_set = true;
	}

	/**
	 * * element : ts2__Referrals__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Referrals__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Referrals__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Referrals__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Referrals__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Referrals__r() {
		return ts2__Referrals__r;
	}

	public void setTs2__Referrals__r(
			com.sforce.soap.enterprise.QueryResult ts2__Referrals__r) {
		this.ts2__Referrals__r = ts2__Referrals__r;
		ts2__Referrals__r__is_set = true;
	}

	/**
	 * * element : ts2__Remaining__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Remaining__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Remaining__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Remaining__c__is_set = false;
	private java.lang.Double ts2__Remaining__c;

	public java.lang.Double getTs2__Remaining__c() {
		return ts2__Remaining__c;
	}

	public void setTs2__Remaining__c(java.lang.Double ts2__Remaining__c) {
		this.ts2__Remaining__c = ts2__Remaining__c;
		ts2__Remaining__c__is_set = true;
	}

	/**
	 * * element : ts2__Result_Sets__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Result_Sets__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Result_Sets__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Result_Sets__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Result_Sets__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Result_Sets__r() {
		return ts2__Result_Sets__r;
	}

	public void setTs2__Result_Sets__r(
			com.sforce.soap.enterprise.QueryResult ts2__Result_Sets__r) {
		this.ts2__Result_Sets__r = ts2__Result_Sets__r;
		ts2__Result_Sets__r__is_set = true;
	}

	/**
	 * * element : ts2__RolloverApplications__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__RolloverApplications__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__RolloverApplications__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2__RolloverApplications__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__RolloverApplications__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__RolloverApplications__r() {
		return ts2__RolloverApplications__r;
	}

	public void setTs2__RolloverApplications__r(
			com.sforce.soap.enterprise.QueryResult ts2__RolloverApplications__r) {
		this.ts2__RolloverApplications__r = ts2__RolloverApplications__r;
		ts2__RolloverApplications__r__is_set = true;
	}

	/**
	 * * element : ts2__Screening_Requirements__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Screening_Requirements__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Screening_Requirements__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Screening_Requirements__c__is_set = false;
	private java.lang.String ts2__Screening_Requirements__c;

	public java.lang.String getTs2__Screening_Requirements__c() {
		return ts2__Screening_Requirements__c;
	}

	public void setTs2__Screening_Requirements__c(
			java.lang.String ts2__Screening_Requirements__c) {
		this.ts2__Screening_Requirements__c = ts2__Screening_Requirements__c;
		ts2__Screening_Requirements__c__is_set = true;
	}

	/**
	 * * element : ts2__Search_Criterias__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Search_Criterias__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Search_Criterias__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2__Search_Criterias__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Search_Criterias__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Search_Criterias__r() {
		return ts2__Search_Criterias__r;
	}

	public void setTs2__Search_Criterias__r(
			com.sforce.soap.enterprise.QueryResult ts2__Search_Criterias__r) {
		this.ts2__Search_Criterias__r = ts2__Search_Criterias__r;
		ts2__Search_Criterias__r__is_set = true;
	}

	/**
	 * * element : ts2__Search_Filters__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Search_Filters__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Search_Filters__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Search_Filters__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Search_Filters__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Search_Filters__r() {
		return ts2__Search_Filters__r;
	}

	public void setTs2__Search_Filters__r(
			com.sforce.soap.enterprise.QueryResult ts2__Search_Filters__r) {
		this.ts2__Search_Filters__r = ts2__Search_Filters__r;
		ts2__Search_Filters__r__is_set = true;
	}

	/**
	 * * element : ts2__Search_Type__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Search_Type__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Search_Type__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Search_Type__c__is_set = false;
	private java.lang.String ts2__Search_Type__c;

	public java.lang.String getTs2__Search_Type__c() {
		return ts2__Search_Type__c;
	}

	public void setTs2__Search_Type__c(java.lang.String ts2__Search_Type__c) {
		this.ts2__Search_Type__c = ts2__Search_Type__c;
		ts2__Search_Type__c__is_set = true;
	}

	/**
	 * * element : ts2__Search__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Search__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Search__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Search__c__is_set = false;
	private java.lang.Double ts2__Search__c;

	public java.lang.Double getTs2__Search__c() {
		return ts2__Search__c;
	}

	public void setTs2__Search__c(java.lang.Double ts2__Search__c) {
		this.ts2__Search__c = ts2__Search__c;
		ts2__Search__c__is_set = true;
	}

	/**
	 * * element : ts2__Searches__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Searches__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Searches__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean ts2__Searches__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2__Searches__r;

	public com.sforce.soap.enterprise.QueryResult getTs2__Searches__r() {
		return ts2__Searches__r;
	}

	public void setTs2__Searches__r(
			com.sforce.soap.enterprise.QueryResult ts2__Searches__r) {
		this.ts2__Searches__r = ts2__Searches__r;
		ts2__Searches__r__is_set = true;
	}

	/**
	 * * element : ts2__Secondary_Recruiter__c of type
	 * {urn:enterprise.soap.sforce.com}ID * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Secondary_Recruiter__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Secondary_Recruiter__c", "urn:enterprise.soap.sforce.com",
			"ID", 0, 1, true);
	private boolean ts2__Secondary_Recruiter__c__is_set = false;
	private java.lang.String ts2__Secondary_Recruiter__c;

	public java.lang.String getTs2__Secondary_Recruiter__c() {
		return ts2__Secondary_Recruiter__c;
	}

	public void setTs2__Secondary_Recruiter__c(
			java.lang.String ts2__Secondary_Recruiter__c) {
		this.ts2__Secondary_Recruiter__c = ts2__Secondary_Recruiter__c;
		ts2__Secondary_Recruiter__c__is_set = true;
	}

	/**
	 * * element : ts2__Secondary_Recruiter__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Secondary_Recruiter__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Secondary_Recruiter__r",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean ts2__Secondary_Recruiter__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.User ts2__Secondary_Recruiter__r;

	public com.sforce.soap.enterprise.sobject.User getTs2__Secondary_Recruiter__r() {
		return ts2__Secondary_Recruiter__r;
	}

	public void setTs2__Secondary_Recruiter__r(
			com.sforce.soap.enterprise.sobject.User ts2__Secondary_Recruiter__r) {
		this.ts2__Secondary_Recruiter__r = ts2__Secondary_Recruiter__r;
		ts2__Secondary_Recruiter__r__is_set = true;
	}

	/**
	 * * element : ts2__Shift__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Shift__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Shift__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Shift__c__is_set = false;
	private java.lang.String ts2__Shift__c;

	public java.lang.String getTs2__Shift__c() {
		return ts2__Shift__c;
	}

	public void setTs2__Shift__c(java.lang.String ts2__Shift__c) {
		this.ts2__Shift__c = ts2__Shift__c;
		ts2__Shift__c__is_set = true;
	}

	/**
	 * * element : ts2__Short_Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Short_Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Short_Description__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Short_Description__c__is_set = false;
	private java.lang.String ts2__Short_Description__c;

	public java.lang.String getTs2__Short_Description__c() {
		return ts2__Short_Description__c;
	}

	public void setTs2__Short_Description__c(
			java.lang.String ts2__Short_Description__c) {
		this.ts2__Short_Description__c = ts2__Short_Description__c;
		ts2__Short_Description__c__is_set = true;
	}

	/**
	 * * element : ts2__Skill_Codes__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Skill_Codes__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Skill_Codes__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Skill_Codes__c__is_set = false;
	private java.lang.String ts2__Skill_Codes__c;

	public java.lang.String getTs2__Skill_Codes__c() {
		return ts2__Skill_Codes__c;
	}

	public void setTs2__Skill_Codes__c(java.lang.String ts2__Skill_Codes__c) {
		this.ts2__Skill_Codes__c = ts2__Skill_Codes__c;
		ts2__Skill_Codes__c__is_set = true;
	}

	/**
	 * * element : ts2__Specific_Requirements__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Specific_Requirements__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Specific_Requirements__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Specific_Requirements__c__is_set = false;
	private java.lang.String ts2__Specific_Requirements__c;

	public java.lang.String getTs2__Specific_Requirements__c() {
		return ts2__Specific_Requirements__c;
	}

	public void setTs2__Specific_Requirements__c(
			java.lang.String ts2__Specific_Requirements__c) {
		this.ts2__Specific_Requirements__c = ts2__Specific_Requirements__c;
		ts2__Specific_Requirements__c__is_set = true;
	}

	/**
	 * * element : ts2__Stage__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Stage__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Stage__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Stage__c__is_set = false;
	private java.lang.String ts2__Stage__c;

	public java.lang.String getTs2__Stage__c() {
		return ts2__Stage__c;
	}

	public void setTs2__Stage__c(java.lang.String ts2__Stage__c) {
		this.ts2__Stage__c = ts2__Stage__c;
		ts2__Stage__c__is_set = true;
	}

	/**
	 * * element : ts2__Start_Date__c of type
	 * {http://www.w3.org/2001/XMLSchema}date * java type: java.util.Calendar
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Start_Date__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Start_Date__c",
			"http://www.w3.org/2001/XMLSchema", "date", 0, 1, true);
	private boolean ts2__Start_Date__c__is_set = false;
	private java.util.Calendar ts2__Start_Date__c;

	public java.util.Calendar getTs2__Start_Date__c() {
		return ts2__Start_Date__c;
	}

	public void setTs2__Start_Date__c(java.util.Calendar ts2__Start_Date__c) {
		this.ts2__Start_Date__c = ts2__Start_Date__c;
		ts2__Start_Date__c__is_set = true;
	}

	/**
	 * * element : ts2__Status__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Status__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Status__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Status__c__is_set = false;
	private java.lang.String ts2__Status__c;

	public java.lang.String getTs2__Status__c() {
		return ts2__Status__c;
	}

	public void setTs2__Status__c(java.lang.String ts2__Status__c) {
		this.ts2__Status__c = ts2__Status__c;
		ts2__Status__c__is_set = true;
	}

	/**
	 * * element : ts2__Submittal_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Submittal_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Submittal_Count__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Submittal_Count__c__is_set = false;
	private java.lang.Double ts2__Submittal_Count__c;

	public java.lang.Double getTs2__Submittal_Count__c() {
		return ts2__Submittal_Count__c;
	}

	public void setTs2__Submittal_Count__c(
			java.lang.Double ts2__Submittal_Count__c) {
		this.ts2__Submittal_Count__c = ts2__Submittal_Count__c;
		ts2__Submittal_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__TEST1__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__TEST1__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__TEST1__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__TEST1__c__is_set = false;
	private java.lang.String ts2__TEST1__c;

	public java.lang.String getTs2__TEST1__c() {
		return ts2__TEST1__c;
	}

	public void setTs2__TEST1__c(java.lang.String ts2__TEST1__c) {
		this.ts2__TEST1__c = ts2__TEST1__c;
		ts2__TEST1__c__is_set = true;
	}

	/**
	 * * element : ts2__Target_Base_Salary__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Target_Base_Salary__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Target_Base_Salary__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Target_Base_Salary__c__is_set = false;
	private java.lang.Double ts2__Target_Base_Salary__c;

	public java.lang.Double getTs2__Target_Base_Salary__c() {
		return ts2__Target_Base_Salary__c;
	}

	public void setTs2__Target_Base_Salary__c(
			java.lang.Double ts2__Target_Base_Salary__c) {
		this.ts2__Target_Base_Salary__c = ts2__Target_Base_Salary__c;
		ts2__Target_Base_Salary__c__is_set = true;
	}

	/**
	 * * element : ts2__Term_Months__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Term_Months__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Term_Months__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Term_Months__c__is_set = false;
	private java.lang.Double ts2__Term_Months__c;

	public java.lang.Double getTs2__Term_Months__c() {
		return ts2__Term_Months__c;
	}

	public void setTs2__Term_Months__c(java.lang.Double ts2__Term_Months__c) {
		this.ts2__Term_Months__c = ts2__Term_Months__c;
		ts2__Term_Months__c__is_set = true;
	}

	/**
	 * * element : ts2__Text_Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Text_Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Text_Description__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2__Text_Description__c__is_set = false;
	private java.lang.String ts2__Text_Description__c;

	public java.lang.String getTs2__Text_Description__c() {
		return ts2__Text_Description__c;
	}

	public void setTs2__Text_Description__c(
			java.lang.String ts2__Text_Description__c) {
		this.ts2__Text_Description__c = ts2__Text_Description__c;
		ts2__Text_Description__c__is_set = true;
	}

	/**
	 * * element : ts2__Total_KPI_Count__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Total_KPI_Count__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2__Total_KPI_Count__c", "http://www.w3.org/2001/XMLSchema",
			"double", 0, 1, true);
	private boolean ts2__Total_KPI_Count__c__is_set = false;
	private java.lang.Double ts2__Total_KPI_Count__c;

	public java.lang.Double getTs2__Total_KPI_Count__c() {
		return ts2__Total_KPI_Count__c;
	}

	public void setTs2__Total_KPI_Count__c(
			java.lang.Double ts2__Total_KPI_Count__c) {
		this.ts2__Total_KPI_Count__c = ts2__Total_KPI_Count__c;
		ts2__Total_KPI_Count__c__is_set = true;
	}

	/**
	 * * element : ts2__Travel__c of type
	 * {http://www.w3.org/2001/XMLSchema}double * java type: java.lang.Double
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Travel__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Travel__c",
			"http://www.w3.org/2001/XMLSchema", "double", 0, 1, true);
	private boolean ts2__Travel__c__is_set = false;
	private java.lang.Double ts2__Travel__c;

	public java.lang.Double getTs2__Travel__c() {
		return ts2__Travel__c;
	}

	public void setTs2__Travel__c(java.lang.Double ts2__Travel__c) {
		this.ts2__Travel__c = ts2__Travel__c;
		ts2__Travel__c__is_set = true;
	}

	/**
	 * * element : ts2__User__c of type {urn:enterprise.soap.sforce.com}ID *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__User__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__User__c",
			"urn:enterprise.soap.sforce.com", "ID", 0, 1, true);
	private boolean ts2__User__c__is_set = false;
	private java.lang.String ts2__User__c;

	public java.lang.String getTs2__User__c() {
		return ts2__User__c;
	}

	public void setTs2__User__c(java.lang.String ts2__User__c) {
		this.ts2__User__c = ts2__User__c;
		ts2__User__c__is_set = true;
	}

	/**
	 * * element : ts2__User__r of type
	 * {urn:sobject.enterprise.soap.sforce.com}User * java type:
	 * com.sforce.soap.enterprise.sobject.User
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__User__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__User__r",
			"urn:sobject.enterprise.soap.sforce.com", "User", 0, 1, true);
	private boolean ts2__User__r__is_set = false;
	private com.sforce.soap.enterprise.sobject.User ts2__User__r;

	public com.sforce.soap.enterprise.sobject.User getTs2__User__r() {
		return ts2__User__r;
	}

	public void setTs2__User__r(
			com.sforce.soap.enterprise.sobject.User ts2__User__r) {
		this.ts2__User__r = ts2__User__r;
		ts2__User__r__is_set = true;
	}

	/**
	 * * element : ts2__Waitlisted__c of type
	 * {http://www.w3.org/2001/XMLSchema}boolean * java type: java.lang.Boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Waitlisted__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Waitlisted__c",
			"http://www.w3.org/2001/XMLSchema", "boolean", 0, 1, true);
	private boolean ts2__Waitlisted__c__is_set = false;
	private java.lang.Boolean ts2__Waitlisted__c;

	public java.lang.Boolean getTs2__Waitlisted__c() {
		return ts2__Waitlisted__c;
	}

	public void setTs2__Waitlisted__c(java.lang.Boolean ts2__Waitlisted__c) {
		this.ts2__Waitlisted__c = ts2__Waitlisted__c;
		ts2__Waitlisted__c__is_set = true;
	}

	/**
	 * * element : ts2__Work_Class__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__Work_Class__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__Work_Class__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__Work_Class__c__is_set = false;
	private java.lang.String ts2__Work_Class__c;

	public java.lang.String getTs2__Work_Class__c() {
		return ts2__Work_Class__c;
	}

	public void setTs2__Work_Class__c(java.lang.String ts2__Work_Class__c) {
		this.ts2__Work_Class__c = ts2__Work_Class__c;
		ts2__Work_Class__c__is_set = true;
	}

	/**
	 * * element : ts2__referral_bonus__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2__referral_bonus__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "ts2__referral_bonus__c",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean ts2__referral_bonus__c__is_set = false;
	private java.lang.String ts2__referral_bonus__c;

	public java.lang.String getTs2__referral_bonus__c() {
		return ts2__referral_bonus__c;
	}

	public void setTs2__referral_bonus__c(
			java.lang.String ts2__referral_bonus__c) {
		this.ts2__referral_bonus__c = ts2__referral_bonus__c;
		ts2__referral_bonus__c__is_set = true;
	}

	/**
	 * * element : ts2extams__Custom_stages_1__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Custom_stages_1__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Custom_stages_1__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2extams__Custom_stages_1__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_1__r;

	public com.sforce.soap.enterprise.QueryResult getTs2extams__Custom_stages_1__r() {
		return ts2extams__Custom_stages_1__r;
	}

	public void setTs2extams__Custom_stages_1__r(
			com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_1__r) {
		this.ts2extams__Custom_stages_1__r = ts2extams__Custom_stages_1__r;
		ts2extams__Custom_stages_1__r__is_set = true;
	}

	/**
	 * * element : ts2extams__Custom_stages_2__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Custom_stages_2__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Custom_stages_2__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2extams__Custom_stages_2__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_2__r;

	public com.sforce.soap.enterprise.QueryResult getTs2extams__Custom_stages_2__r() {
		return ts2extams__Custom_stages_2__r;
	}

	public void setTs2extams__Custom_stages_2__r(
			com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_2__r) {
		this.ts2extams__Custom_stages_2__r = ts2extams__Custom_stages_2__r;
		ts2extams__Custom_stages_2__r__is_set = true;
	}

	/**
	 * * element : ts2extams__Custom_stages_3__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Custom_stages_3__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Custom_stages_3__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2extams__Custom_stages_3__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_3__r;

	public com.sforce.soap.enterprise.QueryResult getTs2extams__Custom_stages_3__r() {
		return ts2extams__Custom_stages_3__r;
	}

	public void setTs2extams__Custom_stages_3__r(
			com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_3__r) {
		this.ts2extams__Custom_stages_3__r = ts2extams__Custom_stages_3__r;
		ts2extams__Custom_stages_3__r__is_set = true;
	}

	/**
	 * * element : ts2extams__Custom_stages_4__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Custom_stages_4__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Custom_stages_4__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2extams__Custom_stages_4__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_4__r;

	public com.sforce.soap.enterprise.QueryResult getTs2extams__Custom_stages_4__r() {
		return ts2extams__Custom_stages_4__r;
	}

	public void setTs2extams__Custom_stages_4__r(
			com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_4__r) {
		this.ts2extams__Custom_stages_4__r = ts2extams__Custom_stages_4__r;
		ts2extams__Custom_stages_4__r__is_set = true;
	}

	/**
	 * * element : ts2extams__Custom_stages_5__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Custom_stages_5__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Custom_stages_5__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean ts2extams__Custom_stages_5__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_5__r;

	public com.sforce.soap.enterprise.QueryResult getTs2extams__Custom_stages_5__r() {
		return ts2extams__Custom_stages_5__r;
	}

	public void setTs2extams__Custom_stages_5__r(
			com.sforce.soap.enterprise.QueryResult ts2extams__Custom_stages_5__r) {
		this.ts2extams__Custom_stages_5__r = ts2extams__Custom_stages_5__r;
		ts2extams__Custom_stages_5__r__is_set = true;
	}

	/**
	 * * element : ts2extams__Launch_AMS__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo ts2extams__Launch_AMS__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"ts2extams__Launch_AMS__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean ts2extams__Launch_AMS__c__is_set = false;
	private java.lang.String ts2extams__Launch_AMS__c;

	public java.lang.String getTs2extams__Launch_AMS__c() {
		return ts2extams__Launch_AMS__c;
	}

	public void setTs2extams__Launch_AMS__c(
			java.lang.String ts2extams__Launch_AMS__c) {
		this.ts2extams__Launch_AMS__c = ts2extams__Launch_AMS__c;
		ts2extams__Launch_AMS__c__is_set = true;
	}

	/**   */
	public void write(javax.xml.namespace.QName __element,
			com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(),
				__element.getLocalPart());
		__typeMapper.writeXsiType(__out,
				"urn:sobject.enterprise.soap.sforce.com", "ts2__Job__c");
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
		__typeMapper.writeObject(__out, RecordType__typeInfo, RecordType,
				RecordType__is_set);
		__typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId,
				RecordTypeId__is_set);
		__typeMapper.writeObject(__out, SystemModstamp__typeInfo,
				SystemModstamp, SystemModstamp__is_set);
		__typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
		__typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
		__typeMapper.writeString(__out, ts2__Account__c__typeInfo,
				ts2__Account__c, ts2__Account__c__is_set);
		__typeMapper.writeObject(__out, ts2__Account__r__typeInfo,
				ts2__Account__r, ts2__Account__r__is_set);
		__typeMapper.writeObject(__out, ts2__Application_Count__c__typeInfo,
				ts2__Application_Count__c, ts2__Application_Count__c__is_set);
		__typeMapper.writeObject(__out, ts2__Applications__r__typeInfo,
				ts2__Applications__r, ts2__Applications__r__is_set);
		__typeMapper.writeString(__out, ts2__Bonus__c__typeInfo, ts2__Bonus__c,
				ts2__Bonus__c__is_set);
		__typeMapper.writeObject(__out, ts2__Burden_Pct__c__typeInfo,
				ts2__Burden_Pct__c, ts2__Burden_Pct__c__is_set);
		__typeMapper.writeString(__out, ts2__Business_Unit__c__typeInfo,
				ts2__Business_Unit__c, ts2__Business_Unit__c__is_set);
		__typeMapper.writeObject(__out, ts2__CDate__c__typeInfo, ts2__CDate__c,
				ts2__CDate__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Chance_this_search_will_be_filled__c__typeInfo,
				ts2__Chance_this_search_will_be_filled__c,
				ts2__Chance_this_search_will_be_filled__c__is_set);
		__typeMapper.writeString(__out, ts2__Chatter_Hash_Tags__c__typeInfo,
				ts2__Chatter_Hash_Tags__c, ts2__Chatter_Hash_Tags__c__is_set);
		__typeMapper.writeString(__out, ts2__Clearance_Type__c__typeInfo,
				ts2__Clearance_Type__c, ts2__Clearance_Type__c__is_set);
		__typeMapper.writeObject(__out, ts2__Clearance__c__typeInfo,
				ts2__Clearance__c, ts2__Clearance__c__is_set);
		__typeMapper.writeString(__out, ts2__Client_Address__c__typeInfo,
				ts2__Client_Address__c, ts2__Client_Address__c__is_set);
		__typeMapper.writeString(__out, ts2__Client_Phone__c__typeInfo,
				ts2__Client_Phone__c, ts2__Client_Phone__c__is_set);
		__typeMapper.writeObject(__out, ts2__Close_Pct__c__typeInfo,
				ts2__Close_Pct__c, ts2__Close_Pct__c__is_set);
		__typeMapper.writeString(__out, ts2__Closed_Reason__c__typeInfo,
				ts2__Closed_Reason__c, ts2__Closed_Reason__c__is_set);
		__typeMapper.writeString(__out, ts2__Contact_Email__c__typeInfo,
				ts2__Contact_Email__c, ts2__Contact_Email__c__is_set);
		__typeMapper.writeString(__out, ts2__Contact_Phone__c__typeInfo,
				ts2__Contact_Phone__c, ts2__Contact_Phone__c__is_set);
		__typeMapper.writeString(__out, ts2__Contact__c__typeInfo,
				ts2__Contact__c, ts2__Contact__c__is_set);
		__typeMapper.writeObject(__out, ts2__Contact__r__typeInfo,
				ts2__Contact__r, ts2__Contact__r__is_set);
		__typeMapper.writeString(__out, ts2__Contract__c__typeInfo,
				ts2__Contract__c, ts2__Contract__c__is_set);
		__typeMapper.writeObject(__out, ts2__Contract__r__typeInfo,
				ts2__Contract__r, ts2__Contract__r__is_set);
		__typeMapper.writeObject(__out, ts2__Conversion_Date__c__typeInfo,
				ts2__Conversion_Date__c, ts2__Conversion_Date__c__is_set);
		__typeMapper.writeObject(__out, ts2__Conversion_Fee_Pct__c__typeInfo,
				ts2__Conversion_Fee_Pct__c, ts2__Conversion_Fee_Pct__c__is_set);
		__typeMapper.writeObject(__out, ts2__Conversion_Fee__c__typeInfo,
				ts2__Conversion_Fee__c, ts2__Conversion_Fee__c__is_set);
		__typeMapper.writeObject(__out, ts2__Date_Filled__c__typeInfo,
				ts2__Date_Filled__c, ts2__Date_Filled__c__is_set);
		__typeMapper.writeObject(__out, ts2__Date_Posted__c__typeInfo,
				ts2__Date_Posted__c, ts2__Date_Posted__c__is_set);
		__typeMapper.writeString(__out, ts2__Days_Gauge__c__typeInfo,
				ts2__Days_Gauge__c, ts2__Days_Gauge__c__is_set);
		__typeMapper.writeObject(__out, ts2__Days_Open__c__typeInfo,
				ts2__Days_Open__c, ts2__Days_Open__c__is_set);
		__typeMapper.writeObject(__out, ts2__Days_to_Fill__c__typeInfo,
				ts2__Days_to_Fill__c, ts2__Days_to_Fill__c__is_set);
		__typeMapper.writeString(__out, ts2__Department__c__typeInfo,
				ts2__Department__c, ts2__Department__c__is_set);
		__typeMapper.writeString(__out, ts2__Description_ID__c__typeInfo,
				ts2__Description_ID__c, ts2__Description_ID__c__is_set);
		__typeMapper.writeString(__out, ts2__Description__c__typeInfo,
				ts2__Description__c, ts2__Description__c__is_set);
		__typeMapper.writeObject(__out, ts2__Description__r__typeInfo,
				ts2__Description__r, ts2__Description__r__is_set);
		__typeMapper.writeObject(__out, ts2__Disable_EEO__c__typeInfo,
				ts2__Disable_EEO__c, ts2__Disable_EEO__c__is_set);
		__typeMapper.writeString(__out, ts2__Employment_Type__c__typeInfo,
				ts2__Employment_Type__c, ts2__Employment_Type__c__is_set);
		__typeMapper.writeObject(__out, ts2__Estimated_End_Date__c__typeInfo,
				ts2__Estimated_End_Date__c, ts2__Estimated_End_Date__c__is_set);
		__typeMapper.writeObject(__out, ts2__Estimated_Fee__c__typeInfo,
				ts2__Estimated_Fee__c, ts2__Estimated_Fee__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Estimated_Gross_Margin__c__typeInfo,
				ts2__Estimated_Gross_Margin__c,
				ts2__Estimated_Gross_Margin__c__is_set);
		__typeMapper.writeObject(__out, ts2__Estimated_Hours__c__typeInfo,
				ts2__Estimated_Hours__c, ts2__Estimated_Hours__c__is_set);
		__typeMapper.writeObject(__out, ts2__Estimated_Start_Date__c__typeInfo,
				ts2__Estimated_Start_Date__c,
				ts2__Estimated_Start_Date__c__is_set);
		__typeMapper.writeObject(__out, ts2__Expiration_Date__c__typeInfo,
				ts2__Expiration_Date__c, ts2__Expiration_Date__c__is_set);
		__typeMapper.writeObject(__out, ts2__Expires__c__typeInfo,
				ts2__Expires__c, ts2__Expires__c__is_set);
		__typeMapper.writeObject(__out, ts2__FTE__c__typeInfo, ts2__FTE__c,
				ts2__FTE__c__is_set);
		__typeMapper.writeString(__out, ts2__Facility__c__typeInfo,
				ts2__Facility__c, ts2__Facility__c__is_set);
		__typeMapper.writeObject(__out, ts2__Fee_Pct__c__typeInfo,
				ts2__Fee_Pct__c, ts2__Fee_Pct__c__is_set);
		__typeMapper.writeObject(__out, ts2__First_Year_Salary__c__typeInfo,
				ts2__First_Year_Salary__c, ts2__First_Year_Salary__c__is_set);
		__typeMapper.writeObject(__out, ts2__Forecasted_Revenue__c__typeInfo,
				ts2__Forecasted_Revenue__c, ts2__Forecasted_Revenue__c__is_set);
		__typeMapper.writeString(__out, ts2__Internal_Notes__c__typeInfo,
				ts2__Internal_Notes__c, ts2__Internal_Notes__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Internal_Passing_Score__c__typeInfo,
				ts2__Internal_Passing_Score__c,
				ts2__Internal_Passing_Score__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Internal_Question_Set__c__typeInfo,
				ts2__Internal_Question_Set__c,
				ts2__Internal_Question_Set__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Internal_Question_Set__r__typeInfo,
				ts2__Internal_Question_Set__r,
				ts2__Internal_Question_Set__r__is_set);
		__typeMapper.writeObject(__out, ts2__Interview_Count__c__typeInfo,
				ts2__Interview_Count__c, ts2__Interview_Count__c__is_set);
		__typeMapper.writeObject(__out, ts2__Interviews__r__typeInfo,
				ts2__Interviews__r, ts2__Interviews__r__is_set);
		__typeMapper.writeObject(__out,
				ts2__JobNotificationsSummary__c__typeInfo,
				ts2__JobNotificationsSummary__c,
				ts2__JobNotificationsSummary__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Advertisement__c__typeInfo,
				ts2__Job_Advertisement__c, ts2__Job_Advertisement__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Description__c__typeInfo,
				ts2__Job_Description__c, ts2__Job_Description__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Family__c__typeInfo,
				ts2__Job_Family__c, ts2__Job_Family__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Function__c__typeInfo,
				ts2__Job_Function__c, ts2__Job_Function__c__is_set);
		__typeMapper.writeObject(__out, ts2__Job_NamedSearch__r__typeInfo,
				ts2__Job_NamedSearch__r, ts2__Job_NamedSearch__r__is_set);
		__typeMapper.writeString(__out, ts2__Job_Number__c__typeInfo,
				ts2__Job_Number__c, ts2__Job_Number__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Job_Order_Job_Board_Associations__r__typeInfo,
				ts2__Job_Order_Job_Board_Associations__r,
				ts2__Job_Order_Job_Board_Associations__r__is_set);
		__typeMapper.writeObject(__out,
				ts2__Job_Order_Transalations__r__typeInfo,
				ts2__Job_Order_Transalations__r,
				ts2__Job_Order_Transalations__r__is_set);
		__typeMapper.writeString(__out, ts2__Job_Rank__c__typeInfo,
				ts2__Job_Rank__c, ts2__Job_Rank__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Tag__c__typeInfo,
				ts2__Job_Tag__c, ts2__Job_Tag__c__is_set);
		__typeMapper.writeString(__out, ts2__Job_Title_Number__c__typeInfo,
				ts2__Job_Title_Number__c, ts2__Job_Title_Number__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Jobs_Contact_Notification__r__typeInfo,
				ts2__Jobs_Contact_Notification__r,
				ts2__Jobs_Contact_Notification__r__is_set);
		__typeMapper.writeObject(__out, ts2__KPI_Count__c__typeInfo,
				ts2__KPI_Count__c, ts2__KPI_Count__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Last_Modified_Date_for_S_Control__c__typeInfo,
				ts2__Last_Modified_Date_for_S_Control__c,
				ts2__Last_Modified_Date_for_S_Control__c__is_set);
		__typeMapper.writeString(__out, ts2__Legacy_JobID__c__typeInfo,
				ts2__Legacy_JobID__c, ts2__Legacy_JobID__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Localized_Job_Description__c__typeInfo,
				ts2__Localized_Job_Description__c,
				ts2__Localized_Job_Description__c__is_set);
		__typeMapper.writeString(__out, ts2__Localized_Job_Title__c__typeInfo,
				ts2__Localized_Job_Title__c,
				ts2__Localized_Job_Title__c__is_set);
		__typeMapper.writeString(__out, ts2__Location__c__typeInfo,
				ts2__Location__c, ts2__Location__c__is_set);
		__typeMapper.writeString(__out, ts2__Manager__c__typeInfo,
				ts2__Manager__c, ts2__Manager__c__is_set);
		__typeMapper.writeObject(__out, ts2__Manager__r__typeInfo,
				ts2__Manager__r, ts2__Manager__r__is_set);
		__typeMapper.writeObject(__out, ts2__Markup_Bill__c__typeInfo,
				ts2__Markup_Bill__c, ts2__Markup_Bill__c__is_set);
		__typeMapper.writeObject(__out, ts2__Markup_Pay__c__typeInfo,
				ts2__Markup_Pay__c, ts2__Markup_Pay__c__is_set);
		__typeMapper.writeObject(__out, ts2__Markup_Pct__c__typeInfo,
				ts2__Markup_Pct__c, ts2__Markup_Pct__c__is_set);
		__typeMapper.writeObject(__out, ts2__Markup__c__typeInfo,
				ts2__Markup__c, ts2__Markup__c__is_set);
		__typeMapper.writeObject(__out, ts2__Max_Bill_Rate__c__typeInfo,
				ts2__Max_Bill_Rate__c, ts2__Max_Bill_Rate__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Max_Conversion_Salary__c__typeInfo,
				ts2__Max_Conversion_Salary__c,
				ts2__Max_Conversion_Salary__c__is_set);
		__typeMapper.writeObject(__out, ts2__Max_Pay_Rate__c__typeInfo,
				ts2__Max_Pay_Rate__c, ts2__Max_Pay_Rate__c__is_set);
		__typeMapper.writeObject(__out, ts2__Max_Salary__c__typeInfo,
				ts2__Max_Salary__c, ts2__Max_Salary__c__is_set);
		__typeMapper.writeString(__out, ts2__Metro__c__typeInfo, ts2__Metro__c,
				ts2__Metro__c__is_set);
		__typeMapper.writeObject(__out, ts2__Min_Bill_Rate__c__typeInfo,
				ts2__Min_Bill_Rate__c, ts2__Min_Bill_Rate__c__is_set);
		__typeMapper.writeObject(__out,
				ts2__Min_Conversion_Salary__c__typeInfo,
				ts2__Min_Conversion_Salary__c,
				ts2__Min_Conversion_Salary__c__is_set);
		__typeMapper.writeObject(__out, ts2__Min_Pay_Rate__c__typeInfo,
				ts2__Min_Pay_Rate__c, ts2__Min_Pay_Rate__c__is_set);
		__typeMapper.writeObject(__out, ts2__Min_Salary__c__typeInfo,
				ts2__Min_Salary__c, ts2__Min_Salary__c__is_set);
		__typeMapper.writeObject(__out, ts2__Offer_Count__c__typeInfo,
				ts2__Offer_Count__c, ts2__Offer_Count__c__is_set);
		__typeMapper.writeObject(__out, ts2__Offers__r__typeInfo,
				ts2__Offers__r, ts2__Offers__r__is_set);
		__typeMapper.writeObject(__out, ts2__Openings__c__typeInfo,
				ts2__Openings__c, ts2__Openings__c__is_set);
		__typeMapper.writeString(__out, ts2__Order__c__typeInfo, ts2__Order__c,
				ts2__Order__c__is_set);
		__typeMapper.writeObject(__out, ts2__Passing_Score__c__typeInfo,
				ts2__Passing_Score__c, ts2__Passing_Score__c__is_set);
		__typeMapper.writeObject(__out, ts2__Per_Diem_Bill_Rate__c__typeInfo,
				ts2__Per_Diem_Bill_Rate__c, ts2__Per_Diem_Bill_Rate__c__is_set);
		__typeMapper.writeObject(__out, ts2__Per_Diem_Diff_Pct__c__typeInfo,
				ts2__Per_Diem_Diff_Pct__c, ts2__Per_Diem_Diff_Pct__c__is_set);
		__typeMapper.writeObject(__out, ts2__Per_Diem_Pay_Rate__c__typeInfo,
				ts2__Per_Diem_Pay_Rate__c, ts2__Per_Diem_Pay_Rate__c__is_set);
		__typeMapper.writeObject(__out, ts2__Per_Diem__c__typeInfo,
				ts2__Per_Diem__c, ts2__Per_Diem__c__is_set);
		__typeMapper.writeObject(__out, ts2__Percentage_Fee__c__typeInfo,
				ts2__Percentage_Fee__c, ts2__Percentage_Fee__c__is_set);
		__typeMapper.writeObject(__out, ts2__Placement_Count__c__typeInfo,
				ts2__Placement_Count__c, ts2__Placement_Count__c__is_set);
		__typeMapper.writeObject(__out, ts2__Placements__r__typeInfo,
				ts2__Placements__r, ts2__Placements__r__is_set);
		__typeMapper.writeObject(__out, ts2__Post_Job__c__typeInfo,
				ts2__Post_Job__c, ts2__Post_Job__c__is_set);
		__typeMapper.writeObject(__out, ts2__Post_to_Chatter__c__typeInfo,
				ts2__Post_to_Chatter__c, ts2__Post_to_Chatter__c__is_set);
		__typeMapper.writeObject(__out, ts2__Posted_to_Prospects__c__typeInfo,
				ts2__Posted_to_Prospects__c,
				ts2__Posted_to_Prospects__c__is_set);
		__typeMapper.writeString(__out, ts2__Posting_Status__c__typeInfo,
				ts2__Posting_Status__c, ts2__Posting_Status__c__is_set);
		__typeMapper.writeObject(__out, ts2__Presents__r__typeInfo,
				ts2__Presents__r, ts2__Presents__r__is_set);
		__typeMapper.writeString(__out, ts2__Priority__c__typeInfo,
				ts2__Priority__c, ts2__Priority__c__is_set);
		__typeMapper.writeString(__out, ts2__Project__c__typeInfo,
				ts2__Project__c, ts2__Project__c__is_set);
		__typeMapper.writeObject(__out, ts2__Project__r__typeInfo,
				ts2__Project__r, ts2__Project__r__is_set);
		__typeMapper.writeObject(__out, ts2__Prospects__r__typeInfo,
				ts2__Prospects__r, ts2__Prospects__r__is_set);
		__typeMapper.writeString(__out, ts2__Question_Set__c__typeInfo,
				ts2__Question_Set__c, ts2__Question_Set__c__is_set);
		__typeMapper.writeObject(__out, ts2__Question_Set__r__typeInfo,
				ts2__Question_Set__r, ts2__Question_Set__r__is_set);
		__typeMapper.writeString(__out, ts2__Recruiter__c__typeInfo,
				ts2__Recruiter__c, ts2__Recruiter__c__is_set);
		__typeMapper.writeObject(__out, ts2__Recruiter__r__typeInfo,
				ts2__Recruiter__r, ts2__Recruiter__r__is_set);
		__typeMapper.writeObject(__out, ts2__Referrals1__r__typeInfo,
				ts2__Referrals1__r, ts2__Referrals1__r__is_set);
		__typeMapper.writeObject(__out, ts2__Referrals__r__typeInfo,
				ts2__Referrals__r, ts2__Referrals__r__is_set);
		__typeMapper.writeObject(__out, ts2__Remaining__c__typeInfo,
				ts2__Remaining__c, ts2__Remaining__c__is_set);
		__typeMapper.writeObject(__out, ts2__Result_Sets__r__typeInfo,
				ts2__Result_Sets__r, ts2__Result_Sets__r__is_set);
		__typeMapper.writeObject(__out, ts2__RolloverApplications__r__typeInfo,
				ts2__RolloverApplications__r,
				ts2__RolloverApplications__r__is_set);
		__typeMapper.writeString(__out,
				ts2__Screening_Requirements__c__typeInfo,
				ts2__Screening_Requirements__c,
				ts2__Screening_Requirements__c__is_set);
		__typeMapper.writeObject(__out, ts2__Search_Criterias__r__typeInfo,
				ts2__Search_Criterias__r, ts2__Search_Criterias__r__is_set);
		__typeMapper.writeObject(__out, ts2__Search_Filters__r__typeInfo,
				ts2__Search_Filters__r, ts2__Search_Filters__r__is_set);
		__typeMapper.writeString(__out, ts2__Search_Type__c__typeInfo,
				ts2__Search_Type__c, ts2__Search_Type__c__is_set);
		__typeMapper.writeObject(__out, ts2__Search__c__typeInfo,
				ts2__Search__c, ts2__Search__c__is_set);
		__typeMapper.writeObject(__out, ts2__Searches__r__typeInfo,
				ts2__Searches__r, ts2__Searches__r__is_set);
		__typeMapper.writeString(__out, ts2__Secondary_Recruiter__c__typeInfo,
				ts2__Secondary_Recruiter__c,
				ts2__Secondary_Recruiter__c__is_set);
		__typeMapper.writeObject(__out, ts2__Secondary_Recruiter__r__typeInfo,
				ts2__Secondary_Recruiter__r,
				ts2__Secondary_Recruiter__r__is_set);
		__typeMapper.writeString(__out, ts2__Shift__c__typeInfo, ts2__Shift__c,
				ts2__Shift__c__is_set);
		__typeMapper.writeString(__out, ts2__Short_Description__c__typeInfo,
				ts2__Short_Description__c, ts2__Short_Description__c__is_set);
		__typeMapper.writeString(__out, ts2__Skill_Codes__c__typeInfo,
				ts2__Skill_Codes__c, ts2__Skill_Codes__c__is_set);
		__typeMapper.writeString(__out,
				ts2__Specific_Requirements__c__typeInfo,
				ts2__Specific_Requirements__c,
				ts2__Specific_Requirements__c__is_set);
		__typeMapper.writeString(__out, ts2__Stage__c__typeInfo, ts2__Stage__c,
				ts2__Stage__c__is_set);
		__typeMapper.writeObject(__out, ts2__Start_Date__c__typeInfo,
				ts2__Start_Date__c, ts2__Start_Date__c__is_set);
		__typeMapper.writeString(__out, ts2__Status__c__typeInfo,
				ts2__Status__c, ts2__Status__c__is_set);
		__typeMapper.writeObject(__out, ts2__Submittal_Count__c__typeInfo,
				ts2__Submittal_Count__c, ts2__Submittal_Count__c__is_set);
		__typeMapper.writeString(__out, ts2__TEST1__c__typeInfo, ts2__TEST1__c,
				ts2__TEST1__c__is_set);
		__typeMapper.writeObject(__out, ts2__Target_Base_Salary__c__typeInfo,
				ts2__Target_Base_Salary__c, ts2__Target_Base_Salary__c__is_set);
		__typeMapper.writeObject(__out, ts2__Term_Months__c__typeInfo,
				ts2__Term_Months__c, ts2__Term_Months__c__is_set);
		__typeMapper.writeString(__out, ts2__Text_Description__c__typeInfo,
				ts2__Text_Description__c, ts2__Text_Description__c__is_set);
		__typeMapper.writeObject(__out, ts2__Total_KPI_Count__c__typeInfo,
				ts2__Total_KPI_Count__c, ts2__Total_KPI_Count__c__is_set);
		__typeMapper.writeObject(__out, ts2__Travel__c__typeInfo,
				ts2__Travel__c, ts2__Travel__c__is_set);
		__typeMapper.writeString(__out, ts2__User__c__typeInfo, ts2__User__c,
				ts2__User__c__is_set);
		__typeMapper.writeObject(__out, ts2__User__r__typeInfo, ts2__User__r,
				ts2__User__r__is_set);
		__typeMapper.writeObject(__out, ts2__Waitlisted__c__typeInfo,
				ts2__Waitlisted__c, ts2__Waitlisted__c__is_set);
		__typeMapper.writeString(__out, ts2__Work_Class__c__typeInfo,
				ts2__Work_Class__c, ts2__Work_Class__c__is_set);
		__typeMapper.writeString(__out, ts2__referral_bonus__c__typeInfo,
				ts2__referral_bonus__c, ts2__referral_bonus__c__is_set);
		__typeMapper.writeObject(__out,
				ts2extams__Custom_stages_1__r__typeInfo,
				ts2extams__Custom_stages_1__r,
				ts2extams__Custom_stages_1__r__is_set);
		__typeMapper.writeObject(__out,
				ts2extams__Custom_stages_2__r__typeInfo,
				ts2extams__Custom_stages_2__r,
				ts2extams__Custom_stages_2__r__is_set);
		__typeMapper.writeObject(__out,
				ts2extams__Custom_stages_3__r__typeInfo,
				ts2extams__Custom_stages_3__r,
				ts2extams__Custom_stages_3__r__is_set);
		__typeMapper.writeObject(__out,
				ts2extams__Custom_stages_4__r__typeInfo,
				ts2extams__Custom_stages_4__r,
				ts2extams__Custom_stages_4__r__is_set);
		__typeMapper.writeObject(__out,
				ts2extams__Custom_stages_5__r__typeInfo,
				ts2extams__Custom_stages_5__r,
				ts2extams__Custom_stages_5__r__is_set);
		__typeMapper.writeString(__out, ts2extams__Launch_AMS__c__typeInfo,
				ts2extams__Launch_AMS__c, ts2extams__Launch_AMS__c__is_set);
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
		if (__typeMapper.isElement(__in, ts2__Account__c__typeInfo)) {
			setTs2__Account__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Account__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Account__r__typeInfo)) {
			setTs2__Account__r((com.sforce.soap.enterprise.sobject.Account) __typeMapper
					.readObject(__in, ts2__Account__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Account.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Application_Count__c__typeInfo)) {
			setTs2__Application_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Application_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Applications__r__typeInfo)) {
			setTs2__Applications__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Applications__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Bonus__c__typeInfo)) {
			setTs2__Bonus__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Bonus__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Burden_Pct__c__typeInfo)) {
			setTs2__Burden_Pct__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Burden_Pct__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Business_Unit__c__typeInfo)) {
			setTs2__Business_Unit__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Business_Unit__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__CDate__c__typeInfo)) {
			setTs2__CDate__c((java.util.Calendar) __typeMapper.readObject(__in,
					ts2__CDate__c__typeInfo, java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Chance_this_search_will_be_filled__c__typeInfo)) {
			setTs2__Chance_this_search_will_be_filled__c((java.lang.Double) __typeMapper
					.readObject(
							__in,
							ts2__Chance_this_search_will_be_filled__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Chatter_Hash_Tags__c__typeInfo)) {
			setTs2__Chatter_Hash_Tags__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Chatter_Hash_Tags__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Clearance_Type__c__typeInfo)) {
			setTs2__Clearance_Type__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Clearance_Type__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Clearance__c__typeInfo)) {
			setTs2__Clearance__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Clearance__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Client_Address__c__typeInfo)) {
			setTs2__Client_Address__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Client_Address__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Client_Phone__c__typeInfo)) {
			setTs2__Client_Phone__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Client_Phone__c__typeInfo,
					java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Close_Pct__c__typeInfo)) {
			setTs2__Close_Pct__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Close_Pct__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Closed_Reason__c__typeInfo)) {
			setTs2__Closed_Reason__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Closed_Reason__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contact_Email__c__typeInfo)) {
			setTs2__Contact_Email__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Contact_Email__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contact_Phone__c__typeInfo)) {
			setTs2__Contact_Phone__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Contact_Phone__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contact__c__typeInfo)) {
			setTs2__Contact__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Contact__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contact__r__typeInfo)) {
			setTs2__Contact__r((com.sforce.soap.enterprise.sobject.Contact) __typeMapper
					.readObject(__in, ts2__Contact__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Contact.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contract__c__typeInfo)) {
			setTs2__Contract__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Contract__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Contract__r__typeInfo)) {
			setTs2__Contract__r((com.sforce.soap.enterprise.sobject.Contract) __typeMapper
					.readObject(__in, ts2__Contract__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Contract.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Conversion_Date__c__typeInfo)) {
			setTs2__Conversion_Date__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Conversion_Date__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Conversion_Fee_Pct__c__typeInfo)) {
			setTs2__Conversion_Fee_Pct__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Conversion_Fee_Pct__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Conversion_Fee__c__typeInfo)) {
			setTs2__Conversion_Fee__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Conversion_Fee__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Date_Filled__c__typeInfo)) {
			setTs2__Date_Filled__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Date_Filled__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Date_Posted__c__typeInfo)) {
			setTs2__Date_Posted__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Date_Posted__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Days_Gauge__c__typeInfo)) {
			setTs2__Days_Gauge__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Days_Gauge__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Days_Open__c__typeInfo)) {
			setTs2__Days_Open__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Days_Open__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Days_to_Fill__c__typeInfo)) {
			setTs2__Days_to_Fill__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Days_to_Fill__c__typeInfo,
					java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Department__c__typeInfo)) {
			setTs2__Department__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Department__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Description_ID__c__typeInfo)) {
			setTs2__Description_ID__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Description_ID__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Description__c__typeInfo)) {
			setTs2__Description__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Description__r__typeInfo)) {
			setTs2__Description__r((com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c) __typeMapper
					.readObject(
							__in,
							ts2__Description__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Descriptions__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Disable_EEO__c__typeInfo)) {
			setTs2__Disable_EEO__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Disable_EEO__c__typeInfo,
					java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Employment_Type__c__typeInfo)) {
			setTs2__Employment_Type__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Employment_Type__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Estimated_End_Date__c__typeInfo)) {
			setTs2__Estimated_End_Date__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Estimated_End_Date__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Estimated_Fee__c__typeInfo)) {
			setTs2__Estimated_Fee__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Estimated_Fee__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Estimated_Gross_Margin__c__typeInfo)) {
			setTs2__Estimated_Gross_Margin__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Estimated_Gross_Margin__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Estimated_Hours__c__typeInfo)) {
			setTs2__Estimated_Hours__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Estimated_Hours__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__Estimated_Start_Date__c__typeInfo)) {
			setTs2__Estimated_Start_Date__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Estimated_Start_Date__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Expiration_Date__c__typeInfo)) {
			setTs2__Expiration_Date__c((java.util.Calendar) __typeMapper
					.readObject(__in, ts2__Expiration_Date__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Expires__c__typeInfo)) {
			setTs2__Expires__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Expires__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__FTE__c__typeInfo)) {
			setTs2__FTE__c((java.lang.Double) __typeMapper.readObject(__in,
					ts2__FTE__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Facility__c__typeInfo)) {
			setTs2__Facility__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Facility__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Fee_Pct__c__typeInfo)) {
			setTs2__Fee_Pct__c((java.lang.Double) __typeMapper.readObject(__in,
					ts2__Fee_Pct__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__First_Year_Salary__c__typeInfo)) {
			setTs2__First_Year_Salary__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__First_Year_Salary__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Forecasted_Revenue__c__typeInfo)) {
			setTs2__Forecasted_Revenue__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Forecasted_Revenue__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Internal_Notes__c__typeInfo)) {
			setTs2__Internal_Notes__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Internal_Notes__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Internal_Passing_Score__c__typeInfo)) {
			setTs2__Internal_Passing_Score__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Internal_Passing_Score__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Internal_Question_Set__c__typeInfo)) {
			setTs2__Internal_Question_Set__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Internal_Question_Set__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Internal_Question_Set__r__typeInfo)) {
			setTs2__Internal_Question_Set__r((com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c) __typeMapper
					.readObject(
							__in,
							ts2__Internal_Question_Set__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Interview_Count__c__typeInfo)) {
			setTs2__Interview_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Interview_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Interviews__r__typeInfo)) {
			setTs2__Interviews__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Interviews__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__JobNotificationsSummary__c__typeInfo)) {
			setTs2__JobNotificationsSummary__c((java.lang.Double) __typeMapper
					.readObject(__in,
							ts2__JobNotificationsSummary__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Advertisement__c__typeInfo)) {
			setTs2__Job_Advertisement__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Job_Advertisement__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Description__c__typeInfo)) {
			setTs2__Job_Description__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Job_Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Family__c__typeInfo)) {
			setTs2__Job_Family__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Job_Family__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Function__c__typeInfo)) {
			setTs2__Job_Function__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Job_Function__c__typeInfo,
					java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_NamedSearch__r__typeInfo)) {
			setTs2__Job_NamedSearch__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Job_NamedSearch__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Number__c__typeInfo)) {
			setTs2__Job_Number__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Job_Number__c__typeInfo, java.lang.String.class));
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
		if (__typeMapper.isElement(__in,
				ts2__Job_Order_Transalations__r__typeInfo)) {
			setTs2__Job_Order_Transalations__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in,
							ts2__Job_Order_Transalations__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Rank__c__typeInfo)) {
			setTs2__Job_Rank__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Job_Rank__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Tag__c__typeInfo)) {
			setTs2__Job_Tag__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Job_Tag__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Job_Title_Number__c__typeInfo)) {
			setTs2__Job_Title_Number__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Job_Title_Number__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Jobs_Contact_Notification__r__typeInfo)) {
			setTs2__Jobs_Contact_Notification__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in,
							ts2__Jobs_Contact_Notification__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__KPI_Count__c__typeInfo)) {
			setTs2__KPI_Count__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__KPI_Count__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Last_Modified_Date_for_S_Control__c__typeInfo)) {
			setTs2__Last_Modified_Date_for_S_Control__c((java.util.Calendar) __typeMapper
					.readObject(__in,
							ts2__Last_Modified_Date_for_S_Control__c__typeInfo,
							java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Legacy_JobID__c__typeInfo)) {
			setTs2__Legacy_JobID__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Legacy_JobID__c__typeInfo,
					java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Localized_Job_Description__c__typeInfo)) {
			setTs2__Localized_Job_Description__c((java.lang.String) __typeMapper
					.readString(__in,
							ts2__Localized_Job_Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Localized_Job_Title__c__typeInfo)) {
			setTs2__Localized_Job_Title__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Localized_Job_Title__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Location__c__typeInfo)) {
			setTs2__Location__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Location__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Manager__c__typeInfo)) {
			setTs2__Manager__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Manager__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Manager__r__typeInfo)) {
			setTs2__Manager__r((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, ts2__Manager__r__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Markup_Bill__c__typeInfo)) {
			setTs2__Markup_Bill__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Markup_Bill__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Markup_Pay__c__typeInfo)) {
			setTs2__Markup_Pay__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Markup_Pay__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Markup_Pct__c__typeInfo)) {
			setTs2__Markup_Pct__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Markup_Pct__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Markup__c__typeInfo)) {
			setTs2__Markup__c((java.lang.Boolean) __typeMapper.readObject(__in,
					ts2__Markup__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Max_Bill_Rate__c__typeInfo)) {
			setTs2__Max_Bill_Rate__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Max_Bill_Rate__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Max_Conversion_Salary__c__typeInfo)) {
			setTs2__Max_Conversion_Salary__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Max_Conversion_Salary__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Max_Pay_Rate__c__typeInfo)) {
			setTs2__Max_Pay_Rate__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Max_Pay_Rate__c__typeInfo,
					java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Max_Salary__c__typeInfo)) {
			setTs2__Max_Salary__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Max_Salary__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Metro__c__typeInfo)) {
			setTs2__Metro__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Metro__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Min_Bill_Rate__c__typeInfo)) {
			setTs2__Min_Bill_Rate__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Min_Bill_Rate__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Min_Conversion_Salary__c__typeInfo)) {
			setTs2__Min_Conversion_Salary__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Min_Conversion_Salary__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Min_Pay_Rate__c__typeInfo)) {
			setTs2__Min_Pay_Rate__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Min_Pay_Rate__c__typeInfo,
					java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Min_Salary__c__typeInfo)) {
			setTs2__Min_Salary__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Min_Salary__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Offer_Count__c__typeInfo)) {
			setTs2__Offer_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Offer_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Offers__r__typeInfo)) {
			setTs2__Offers__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Offers__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Openings__c__typeInfo)) {
			setTs2__Openings__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Openings__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Order__c__typeInfo)) {
			setTs2__Order__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Order__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Passing_Score__c__typeInfo)) {
			setTs2__Passing_Score__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Passing_Score__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Per_Diem_Bill_Rate__c__typeInfo)) {
			setTs2__Per_Diem_Bill_Rate__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Per_Diem_Bill_Rate__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Per_Diem_Diff_Pct__c__typeInfo)) {
			setTs2__Per_Diem_Diff_Pct__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Per_Diem_Diff_Pct__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Per_Diem_Pay_Rate__c__typeInfo)) {
			setTs2__Per_Diem_Pay_Rate__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Per_Diem_Pay_Rate__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Per_Diem__c__typeInfo)) {
			setTs2__Per_Diem__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Per_Diem__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Percentage_Fee__c__typeInfo)) {
			setTs2__Percentage_Fee__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Percentage_Fee__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Placement_Count__c__typeInfo)) {
			setTs2__Placement_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Placement_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Placements__r__typeInfo)) {
			setTs2__Placements__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Placements__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Post_Job__c__typeInfo)) {
			setTs2__Post_Job__c((java.lang.Boolean) __typeMapper.readObject(
					__in, ts2__Post_Job__c__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Post_to_Chatter__c__typeInfo)) {
			setTs2__Post_to_Chatter__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Post_to_Chatter__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Posted_to_Prospects__c__typeInfo)) {
			setTs2__Posted_to_Prospects__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Posted_to_Prospects__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Posting_Status__c__typeInfo)) {
			setTs2__Posting_Status__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Posting_Status__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Presents__r__typeInfo)) {
			setTs2__Presents__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Presents__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Priority__c__typeInfo)) {
			setTs2__Priority__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Priority__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Project__c__typeInfo)) {
			setTs2__Project__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Project__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Project__r__typeInfo)) {
			setTs2__Project__r((com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c) __typeMapper
					.readObject(
							__in,
							ts2__Project__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Project_Job__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Prospects__r__typeInfo)) {
			setTs2__Prospects__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Prospects__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question_Set__c__typeInfo)) {
			setTs2__Question_Set__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Question_Set__c__typeInfo,
					java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Question_Set__r__typeInfo)) {
			setTs2__Question_Set__r((com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c) __typeMapper
					.readObject(
							__in,
							ts2__Question_Set__r__typeInfo,
							com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Recruiter__c__typeInfo)) {
			setTs2__Recruiter__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Recruiter__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Recruiter__r__typeInfo)) {
			setTs2__Recruiter__r((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, ts2__Recruiter__r__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Referrals1__r__typeInfo)) {
			setTs2__Referrals1__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Referrals1__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Referrals__r__typeInfo)) {
			setTs2__Referrals__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Referrals__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Remaining__c__typeInfo)) {
			setTs2__Remaining__c((java.lang.Double) __typeMapper.readObject(
					__in, ts2__Remaining__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Result_Sets__r__typeInfo)) {
			setTs2__Result_Sets__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Result_Sets__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper
				.isElement(__in, ts2__RolloverApplications__r__typeInfo)) {
			setTs2__RolloverApplications__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__RolloverApplications__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Screening_Requirements__c__typeInfo)) {
			setTs2__Screening_Requirements__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Screening_Requirements__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Search_Criterias__r__typeInfo)) {
			setTs2__Search_Criterias__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Search_Criterias__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Search_Filters__r__typeInfo)) {
			setTs2__Search_Filters__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Search_Filters__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Search_Type__c__typeInfo)) {
			setTs2__Search_Type__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Search_Type__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Search__c__typeInfo)) {
			setTs2__Search__c((java.lang.Double) __typeMapper.readObject(__in,
					ts2__Search__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Searches__r__typeInfo)) {
			setTs2__Searches__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2__Searches__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Secondary_Recruiter__c__typeInfo)) {
			setTs2__Secondary_Recruiter__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Secondary_Recruiter__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Secondary_Recruiter__r__typeInfo)) {
			setTs2__Secondary_Recruiter__r((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, ts2__Secondary_Recruiter__r__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Shift__c__typeInfo)) {
			setTs2__Shift__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Shift__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Short_Description__c__typeInfo)) {
			setTs2__Short_Description__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Short_Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Skill_Codes__c__typeInfo)) {
			setTs2__Skill_Codes__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Skill_Codes__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2__Specific_Requirements__c__typeInfo)) {
			setTs2__Specific_Requirements__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Specific_Requirements__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Stage__c__typeInfo)) {
			setTs2__Stage__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Stage__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Start_Date__c__typeInfo)) {
			setTs2__Start_Date__c((java.util.Calendar) __typeMapper.readObject(
					__in, ts2__Start_Date__c__typeInfo,
					java.util.Calendar.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Status__c__typeInfo)) {
			setTs2__Status__c((java.lang.String) __typeMapper.readString(__in,
					ts2__Status__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Submittal_Count__c__typeInfo)) {
			setTs2__Submittal_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Submittal_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__TEST1__c__typeInfo)) {
			setTs2__TEST1__c((java.lang.String) __typeMapper.readString(__in,
					ts2__TEST1__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Target_Base_Salary__c__typeInfo)) {
			setTs2__Target_Base_Salary__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Target_Base_Salary__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Term_Months__c__typeInfo)) {
			setTs2__Term_Months__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Term_Months__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Text_Description__c__typeInfo)) {
			setTs2__Text_Description__c((java.lang.String) __typeMapper
					.readString(__in, ts2__Text_Description__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Total_KPI_Count__c__typeInfo)) {
			setTs2__Total_KPI_Count__c((java.lang.Double) __typeMapper
					.readObject(__in, ts2__Total_KPI_Count__c__typeInfo,
							java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Travel__c__typeInfo)) {
			setTs2__Travel__c((java.lang.Double) __typeMapper.readObject(__in,
					ts2__Travel__c__typeInfo, java.lang.Double.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__User__c__typeInfo)) {
			setTs2__User__c((java.lang.String) __typeMapper.readString(__in,
					ts2__User__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__User__r__typeInfo)) {
			setTs2__User__r((com.sforce.soap.enterprise.sobject.User) __typeMapper
					.readObject(__in, ts2__User__r__typeInfo,
							com.sforce.soap.enterprise.sobject.User.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Waitlisted__c__typeInfo)) {
			setTs2__Waitlisted__c((java.lang.Boolean) __typeMapper
					.readObject(__in, ts2__Waitlisted__c__typeInfo,
							java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__Work_Class__c__typeInfo)) {
			setTs2__Work_Class__c((java.lang.String) __typeMapper.readString(
					__in, ts2__Work_Class__c__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2__referral_bonus__c__typeInfo)) {
			setTs2__referral_bonus__c((java.lang.String) __typeMapper
					.readString(__in, ts2__referral_bonus__c__typeInfo,
							java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2extams__Custom_stages_1__r__typeInfo)) {
			setTs2extams__Custom_stages_1__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2extams__Custom_stages_1__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2extams__Custom_stages_2__r__typeInfo)) {
			setTs2extams__Custom_stages_2__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2extams__Custom_stages_2__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2extams__Custom_stages_3__r__typeInfo)) {
			setTs2extams__Custom_stages_3__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2extams__Custom_stages_3__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2extams__Custom_stages_4__r__typeInfo)) {
			setTs2extams__Custom_stages_4__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2extams__Custom_stages_4__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in,
				ts2extams__Custom_stages_5__r__typeInfo)) {
			setTs2extams__Custom_stages_5__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, ts2extams__Custom_stages_5__r__typeInfo,
							com.sforce.soap.enterprise.QueryResult.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, ts2extams__Launch_AMS__c__typeInfo)) {
			setTs2extams__Launch_AMS__c((java.lang.String) __typeMapper
					.readString(__in, ts2extams__Launch_AMS__c__typeInfo,
							java.lang.String.class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[Ts2__Job__c ");
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
		sb.append(" RecordType=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(RecordType) + "'\n");
		sb.append(" RecordTypeId=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(RecordTypeId)
				+ "'\n");
		sb.append(" SystemModstamp=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(SystemModstamp)
				+ "'\n");
		sb.append(" Tags=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tags) + "'\n");
		sb.append(" Tasks=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tasks) + "'\n");
		sb.append(" ts2__Account__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Account__c)
				+ "'\n");
		sb.append(" ts2__Account__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Account__r)
				+ "'\n");
		sb.append(" ts2__Application_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Application_Count__c) + "'\n");
		sb.append(" ts2__Applications__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Applications__r)
				+ "'\n");
		sb.append(" ts2__Bonus__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Bonus__c)
				+ "'\n");
		sb.append(" ts2__Burden_Pct__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Burden_Pct__c)
				+ "'\n");
		sb.append(" ts2__Business_Unit__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Business_Unit__c)
				+ "'\n");
		sb.append(" ts2__CDate__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__CDate__c)
				+ "'\n");
		sb.append(" ts2__Chance_this_search_will_be_filled__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Chance_this_search_will_be_filled__c)
				+ "'\n");
		sb.append(" ts2__Chatter_Hash_Tags__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Chatter_Hash_Tags__c) + "'\n");
		sb.append(" ts2__Clearance_Type__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Clearance_Type__c)
				+ "'\n");
		sb.append(" ts2__Clearance__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Clearance__c)
				+ "'\n");
		sb.append(" ts2__Client_Address__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Client_Address__c)
				+ "'\n");
		sb.append(" ts2__Client_Phone__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Client_Phone__c)
				+ "'\n");
		sb.append(" ts2__Close_Pct__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Close_Pct__c)
				+ "'\n");
		sb.append(" ts2__Closed_Reason__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Closed_Reason__c)
				+ "'\n");
		sb.append(" ts2__Contact_Email__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Contact_Email__c)
				+ "'\n");
		sb.append(" ts2__Contact_Phone__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Contact_Phone__c)
				+ "'\n");
		sb.append(" ts2__Contact__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Contact__c)
				+ "'\n");
		sb.append(" ts2__Contact__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Contact__r)
				+ "'\n");
		sb.append(" ts2__Contract__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Contract__c)
				+ "'\n");
		sb.append(" ts2__Contract__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Contract__r)
				+ "'\n");
		sb.append(" ts2__Conversion_Date__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Conversion_Date__c)
				+ "'\n");
		sb.append(" ts2__Conversion_Fee_Pct__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Conversion_Fee_Pct__c) + "'\n");
		sb.append(" ts2__Conversion_Fee__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Conversion_Fee__c)
				+ "'\n");
		sb.append(" ts2__Date_Filled__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Date_Filled__c)
				+ "'\n");
		sb.append(" ts2__Date_Posted__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Date_Posted__c)
				+ "'\n");
		sb.append(" ts2__Days_Gauge__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Days_Gauge__c)
				+ "'\n");
		sb.append(" ts2__Days_Open__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Days_Open__c)
				+ "'\n");
		sb.append(" ts2__Days_to_Fill__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Days_to_Fill__c)
				+ "'\n");
		sb.append(" ts2__Department__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Department__c)
				+ "'\n");
		sb.append(" ts2__Description_ID__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Description_ID__c)
				+ "'\n");
		sb.append(" ts2__Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Description__c)
				+ "'\n");
		sb.append(" ts2__Description__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Description__r)
				+ "'\n");
		sb.append(" ts2__Disable_EEO__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Disable_EEO__c)
				+ "'\n");
		sb.append(" ts2__Employment_Type__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Employment_Type__c)
				+ "'\n");
		sb.append(" ts2__Estimated_End_Date__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Estimated_End_Date__c) + "'\n");
		sb.append(" ts2__Estimated_Fee__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Estimated_Fee__c)
				+ "'\n");
		sb.append(" ts2__Estimated_Gross_Margin__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Estimated_Gross_Margin__c) + "'\n");
		sb.append(" ts2__Estimated_Hours__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Estimated_Hours__c)
				+ "'\n");
		sb.append(" ts2__Estimated_Start_Date__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Estimated_Start_Date__c) + "'\n");
		sb.append(" ts2__Expiration_Date__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Expiration_Date__c)
				+ "'\n");
		sb.append(" ts2__Expires__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Expires__c)
				+ "'\n");
		sb.append(" ts2__FTE__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__FTE__c)
				+ "'\n");
		sb.append(" ts2__Facility__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Facility__c)
				+ "'\n");
		sb.append(" ts2__Fee_Pct__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Fee_Pct__c)
				+ "'\n");
		sb.append(" ts2__First_Year_Salary__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__First_Year_Salary__c) + "'\n");
		sb.append(" ts2__Forecasted_Revenue__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Forecasted_Revenue__c) + "'\n");
		sb.append(" ts2__Internal_Notes__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Internal_Notes__c)
				+ "'\n");
		sb.append(" ts2__Internal_Passing_Score__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Internal_Passing_Score__c) + "'\n");
		sb.append(" ts2__Internal_Question_Set__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Internal_Question_Set__c) + "'\n");
		sb.append(" ts2__Internal_Question_Set__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Internal_Question_Set__r) + "'\n");
		sb.append(" ts2__Interview_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Interview_Count__c)
				+ "'\n");
		sb.append(" ts2__Interviews__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Interviews__r)
				+ "'\n");
		sb.append(" ts2__JobNotificationsSummary__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__JobNotificationsSummary__c) + "'\n");
		sb.append(" ts2__Job_Advertisement__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Advertisement__c) + "'\n");
		sb.append(" ts2__Job_Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Job_Description__c)
				+ "'\n");
		sb.append(" ts2__Job_Family__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Job_Family__c)
				+ "'\n");
		sb.append(" ts2__Job_Function__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Job_Function__c)
				+ "'\n");
		sb.append(" ts2__Job_NamedSearch__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Job_NamedSearch__r)
				+ "'\n");
		sb.append(" ts2__Job_Number__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Job_Number__c)
				+ "'\n");
		sb.append(" ts2__Job_Order_Job_Board_Associations__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Order_Job_Board_Associations__r)
				+ "'\n");
		sb.append(" ts2__Job_Order_Transalations__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Job_Order_Transalations__r) + "'\n");
		sb.append(" ts2__Job_Rank__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Job_Rank__c)
				+ "'\n");
		sb.append(" ts2__Job_Tag__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Job_Tag__c)
				+ "'\n");
		sb.append(" ts2__Job_Title_Number__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Job_Title_Number__c)
				+ "'\n");
		sb.append(" ts2__Jobs_Contact_Notification__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Jobs_Contact_Notification__r) + "'\n");
		sb.append(" ts2__KPI_Count__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__KPI_Count__c)
				+ "'\n");
		sb.append(" ts2__Last_Modified_Date_for_S_Control__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Last_Modified_Date_for_S_Control__c)
				+ "'\n");
		sb.append(" ts2__Legacy_JobID__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Legacy_JobID__c)
				+ "'\n");
		sb.append(" ts2__Localized_Job_Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Localized_Job_Description__c) + "'\n");
		sb.append(" ts2__Localized_Job_Title__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Localized_Job_Title__c) + "'\n");
		sb.append(" ts2__Location__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Location__c)
				+ "'\n");
		sb.append(" ts2__Manager__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Manager__c)
				+ "'\n");
		sb.append(" ts2__Manager__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Manager__r)
				+ "'\n");
		sb.append(" ts2__Markup_Bill__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Markup_Bill__c)
				+ "'\n");
		sb.append(" ts2__Markup_Pay__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Markup_Pay__c)
				+ "'\n");
		sb.append(" ts2__Markup_Pct__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Markup_Pct__c)
				+ "'\n");
		sb.append(" ts2__Markup__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Markup__c)
				+ "'\n");
		sb.append(" ts2__Max_Bill_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Max_Bill_Rate__c)
				+ "'\n");
		sb.append(" ts2__Max_Conversion_Salary__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Max_Conversion_Salary__c) + "'\n");
		sb.append(" ts2__Max_Pay_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Max_Pay_Rate__c)
				+ "'\n");
		sb.append(" ts2__Max_Salary__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Max_Salary__c)
				+ "'\n");
		sb.append(" ts2__Metro__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Metro__c)
				+ "'\n");
		sb.append(" ts2__Min_Bill_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Min_Bill_Rate__c)
				+ "'\n");
		sb.append(" ts2__Min_Conversion_Salary__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Min_Conversion_Salary__c) + "'\n");
		sb.append(" ts2__Min_Pay_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Min_Pay_Rate__c)
				+ "'\n");
		sb.append(" ts2__Min_Salary__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Min_Salary__c)
				+ "'\n");
		sb.append(" ts2__Offer_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Offer_Count__c)
				+ "'\n");
		sb.append(" ts2__Offers__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Offers__r)
				+ "'\n");
		sb.append(" ts2__Openings__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Openings__c)
				+ "'\n");
		sb.append(" ts2__Order__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Order__c)
				+ "'\n");
		sb.append(" ts2__Passing_Score__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Passing_Score__c)
				+ "'\n");
		sb.append(" ts2__Per_Diem_Bill_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Per_Diem_Bill_Rate__c) + "'\n");
		sb.append(" ts2__Per_Diem_Diff_Pct__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Per_Diem_Diff_Pct__c) + "'\n");
		sb.append(" ts2__Per_Diem_Pay_Rate__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Per_Diem_Pay_Rate__c) + "'\n");
		sb.append(" ts2__Per_Diem__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Per_Diem__c)
				+ "'\n");
		sb.append(" ts2__Percentage_Fee__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Percentage_Fee__c)
				+ "'\n");
		sb.append(" ts2__Placement_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Placement_Count__c)
				+ "'\n");
		sb.append(" ts2__Placements__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Placements__r)
				+ "'\n");
		sb.append(" ts2__Post_Job__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Post_Job__c)
				+ "'\n");
		sb.append(" ts2__Post_to_Chatter__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Post_to_Chatter__c)
				+ "'\n");
		sb.append(" ts2__Posted_to_Prospects__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Posted_to_Prospects__c) + "'\n");
		sb.append(" ts2__Posting_Status__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Posting_Status__c)
				+ "'\n");
		sb.append(" ts2__Presents__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Presents__r)
				+ "'\n");
		sb.append(" ts2__Priority__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Priority__c)
				+ "'\n");
		sb.append(" ts2__Project__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Project__c)
				+ "'\n");
		sb.append(" ts2__Project__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Project__r)
				+ "'\n");
		sb.append(" ts2__Prospects__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Prospects__r)
				+ "'\n");
		sb.append(" ts2__Question_Set__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Question_Set__c)
				+ "'\n");
		sb.append(" ts2__Question_Set__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Question_Set__r)
				+ "'\n");
		sb.append(" ts2__Recruiter__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Recruiter__c)
				+ "'\n");
		sb.append(" ts2__Recruiter__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Recruiter__r)
				+ "'\n");
		sb.append(" ts2__Referrals1__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Referrals1__r)
				+ "'\n");
		sb.append(" ts2__Referrals__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Referrals__r)
				+ "'\n");
		sb.append(" ts2__Remaining__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Remaining__c)
				+ "'\n");
		sb.append(" ts2__Result_Sets__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Result_Sets__r)
				+ "'\n");
		sb.append(" ts2__RolloverApplications__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__RolloverApplications__r) + "'\n");
		sb.append(" ts2__Screening_Requirements__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Screening_Requirements__c) + "'\n");
		sb.append(" ts2__Search_Criterias__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Search_Criterias__r)
				+ "'\n");
		sb.append(" ts2__Search_Filters__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Search_Filters__r)
				+ "'\n");
		sb.append(" ts2__Search_Type__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Search_Type__c)
				+ "'\n");
		sb.append(" ts2__Search__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Search__c)
				+ "'\n");
		sb.append(" ts2__Searches__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Searches__r)
				+ "'\n");
		sb.append(" ts2__Secondary_Recruiter__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Secondary_Recruiter__c) + "'\n");
		sb.append(" ts2__Secondary_Recruiter__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Secondary_Recruiter__r) + "'\n");
		sb.append(" ts2__Shift__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Shift__c)
				+ "'\n");
		sb.append(" ts2__Short_Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Short_Description__c) + "'\n");
		sb.append(" ts2__Skill_Codes__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Skill_Codes__c)
				+ "'\n");
		sb.append(" ts2__Specific_Requirements__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Specific_Requirements__c) + "'\n");
		sb.append(" ts2__Stage__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Stage__c)
				+ "'\n");
		sb.append(" ts2__Start_Date__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Start_Date__c)
				+ "'\n");
		sb.append(" ts2__Status__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Status__c)
				+ "'\n");
		sb.append(" ts2__Submittal_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Submittal_Count__c)
				+ "'\n");
		sb.append(" ts2__TEST1__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__TEST1__c)
				+ "'\n");
		sb.append(" ts2__Target_Base_Salary__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2__Target_Base_Salary__c) + "'\n");
		sb.append(" ts2__Term_Months__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Term_Months__c)
				+ "'\n");
		sb.append(" ts2__Text_Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Text_Description__c)
				+ "'\n");
		sb.append(" ts2__Total_KPI_Count__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__Total_KPI_Count__c)
				+ "'\n");
		sb.append(" ts2__Travel__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Travel__c)
				+ "'\n");
		sb.append(" ts2__User__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__User__c)
				+ "'\n");
		sb.append(" ts2__User__r=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__User__r)
				+ "'\n");
		sb.append(" ts2__Waitlisted__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Waitlisted__c)
				+ "'\n");
		sb.append(" ts2__Work_Class__c=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(ts2__Work_Class__c)
				+ "'\n");
		sb.append(" ts2__referral_bonus__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2__referral_bonus__c)
				+ "'\n");
		sb.append(" ts2extams__Custom_stages_1__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2extams__Custom_stages_1__r) + "'\n");
		sb.append(" ts2extams__Custom_stages_2__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2extams__Custom_stages_2__r) + "'\n");
		sb.append(" ts2extams__Custom_stages_3__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2extams__Custom_stages_3__r) + "'\n");
		sb.append(" ts2extams__Custom_stages_4__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2extams__Custom_stages_4__r) + "'\n");
		sb.append(" ts2extams__Custom_stages_5__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose
						.toString(ts2extams__Custom_stages_5__r) + "'\n");
		sb.append(" ts2extams__Launch_AMS__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(ts2extams__Launch_AMS__c)
				+ "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}