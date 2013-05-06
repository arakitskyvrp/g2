package com.sforce.soap.enterprise.sobject;

/** * Generated class, please do not edit. */
public class Language__c extends com.sforce.soap.enterprise.sobject.SObject {
	/** * Constructor */
	public Language__c() {
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Language__c) && (getId() != null) ? getId()
				.equals(((Language__c) obj).getId()) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (getId() != null) ? (this.getClass().hashCode() + getId()
				.hashCode()) : super.hashCode();
	}

	/**
	 * * element : Answer_Translations__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Answer_Translations__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com", "Answer_Translations__r",
			"urn:enterprise.soap.sforce.com", "QueryResult", 0, 1, true);
	private boolean Answer_Translations__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Answer_Translations__r;

	public com.sforce.soap.enterprise.QueryResult getAnswer_Translations__r() {
		return Answer_Translations__r;
	}

	public void setAnswer_Translations__r(
			com.sforce.soap.enterprise.QueryResult Answer_Translations__r) {
		this.Answer_Translations__r = Answer_Translations__r;
		Answer_Translations__r__is_set = true;
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
	 * * element : Language_Description__c of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo Language_Description__c__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Language_Description__c", "http://www.w3.org/2001/XMLSchema",
			"string", 0, 1, true);
	private boolean Language_Description__c__is_set = false;
	private java.lang.String Language_Description__c;

	public java.lang.String getLanguage_Description__c() {
		return Language_Description__c;
	}

	public void setLanguage_Description__c(
			java.lang.String Language_Description__c) {
		this.Language_Description__c = Language_Description__c;
		Language_Description__c__is_set = true;
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
	 * * element : Question_Translations__r of type
	 * {urn:enterprise.soap.sforce.com}QueryResult * java type:
	 * com.sforce.soap.enterprise.QueryResult
	 */
	private static final com.sforce.ws.bind.TypeInfo Question_Translations__r__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:sobject.enterprise.soap.sforce.com",
			"Question_Translations__r", "urn:enterprise.soap.sforce.com",
			"QueryResult", 0, 1, true);
	private boolean Question_Translations__r__is_set = false;
	private com.sforce.soap.enterprise.QueryResult Question_Translations__r;

	public com.sforce.soap.enterprise.QueryResult getQuestion_Translations__r() {
		return Question_Translations__r;
	}

	public void setQuestion_Translations__r(
			com.sforce.soap.enterprise.QueryResult Question_Translations__r) {
		this.Question_Translations__r = Question_Translations__r;
		Question_Translations__r__is_set = true;
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

	/**   */
	public void write(javax.xml.namespace.QName __element,
			com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(),
				__element.getLocalPart());
		__typeMapper.writeXsiType(__out,
				"urn:sobject.enterprise.soap.sforce.com", "Language__c");
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}

	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		super.writeFields(__out, __typeMapper);
		__typeMapper.writeObject(__out, Answer_Translations__r__typeInfo,
				Answer_Translations__r, Answer_Translations__r__is_set);
		__typeMapper.writeObject(__out, Attachments__typeInfo, Attachments,
				Attachments__is_set);
		__typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy,
				CreatedBy__is_set);
		__typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById,
				CreatedById__is_set);
		__typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate,
				CreatedDate__is_set);
		__typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted,
				IsDeleted__is_set);
		__typeMapper.writeString(__out, Language_Description__c__typeInfo,
				Language_Description__c, Language_Description__c__is_set);
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
		__typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
		__typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId,
				OwnerId__is_set);
		__typeMapper.writeObject(__out, ProcessInstances__typeInfo,
				ProcessInstances, ProcessInstances__is_set);
		__typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps,
				ProcessSteps__is_set);
		__typeMapper.writeObject(__out, Question_Translations__r__typeInfo,
				Question_Translations__r, Question_Translations__r__is_set);
		__typeMapper.writeObject(__out, SystemModstamp__typeInfo,
				SystemModstamp, SystemModstamp__is_set);
		__typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
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
		if (__typeMapper.isElement(__in, Answer_Translations__r__typeInfo)) {
			setAnswer_Translations__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Answer_Translations__r__typeInfo,
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
		if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
			setIsDeleted((java.lang.Boolean) __typeMapper.readObject(__in,
					IsDeleted__typeInfo, java.lang.Boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, Language_Description__c__typeInfo)) {
			setLanguage_Description__c((java.lang.String) __typeMapper
					.readString(__in, Language_Description__c__typeInfo,
							java.lang.String.class));
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
		if (__typeMapper.isElement(__in, Question_Translations__r__typeInfo)) {
			setQuestion_Translations__r((com.sforce.soap.enterprise.QueryResult) __typeMapper
					.readObject(__in, Question_Translations__r__typeInfo,
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
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[Language__c ");
		sb.append(super.toString());
		sb.append(" Answer_Translations__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Answer_Translations__r)
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
		sb.append(" IsDeleted=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(IsDeleted) + "'\n");
		sb.append(" Language_Description__c=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Language_Description__c)
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
		sb.append(" Question_Translations__r=");
		sb.append("'"
				+ com.sforce.ws.util.Verbose.toString(Question_Translations__r)
				+ "'\n");
		sb.append(" SystemModstamp=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(SystemModstamp)
				+ "'\n");
		sb.append(" Tags=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(Tags) + "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}