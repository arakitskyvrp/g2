package com.sforce.soap.enterprise.sobject;/** * Generated class, please do not edit. */public class Product2 extends com.sforce.soap.enterprise.sobject.SObject {  /**   * Constructor   */  public Product2() {  }        /**   * element  : ActivityHistories of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo ActivityHistories__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityHistories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean ActivityHistories__is_set = false;  private com.sforce.soap.enterprise.QueryResult ActivityHistories;  public com.sforce.soap.enterprise.QueryResult getActivityHistories() {    return ActivityHistories;  }    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult ActivityHistories) {    this.ActivityHistories = ActivityHistories;    ActivityHistories__is_set = true;  }    /**   * element  : Assets of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo Assets__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assets","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean Assets__is_set = false;  private com.sforce.soap.enterprise.QueryResult Assets;  public com.sforce.soap.enterprise.QueryResult getAssets() {    return Assets;  }    public void setAssets(com.sforce.soap.enterprise.QueryResult Assets) {    this.Assets = Assets;    Assets__is_set = true;  }    /**   * element  : Attachments of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo Attachments__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Attachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean Attachments__is_set = false;  private com.sforce.soap.enterprise.QueryResult Attachments;  public com.sforce.soap.enterprise.QueryResult getAttachments() {    return Attachments;  }    public void setAttachments(com.sforce.soap.enterprise.QueryResult Attachments) {    this.Attachments = Attachments;    Attachments__is_set = true;  }    /**   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User   * java type: com.sforce.soap.enterprise.sobject.User   */  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);  private boolean CreatedBy__is_set = false;  private com.sforce.soap.enterprise.sobject.User CreatedBy;  public com.sforce.soap.enterprise.sobject.User getCreatedBy() {    return CreatedBy;  }    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {    this.CreatedBy = CreatedBy;    CreatedBy__is_set = true;  }    /**   * element  : CreatedById of type {urn:enterprise.soap.sforce.com}ID   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);  private boolean CreatedById__is_set = false;  private java.lang.String CreatedById;  public java.lang.String getCreatedById() {    return CreatedById;  }    public void setCreatedById(java.lang.String CreatedById) {    this.CreatedById = CreatedById;    CreatedById__is_set = true;  }    /**   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);  private boolean CreatedDate__is_set = false;  private java.util.Calendar CreatedDate;  public java.util.Calendar getCreatedDate() {    return CreatedDate;  }    public void setCreatedDate(java.util.Calendar CreatedDate) {    this.CreatedDate = CreatedDate;    CreatedDate__is_set = true;  }    /**   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean Description__is_set = false;  private java.lang.String Description;  public java.lang.String getDescription() {    return Description;  }    public void setDescription(java.lang.String Description) {    this.Description = Description;    Description__is_set = true;  }    /**   * element  : Events of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo Events__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Events","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean Events__is_set = false;  private com.sforce.soap.enterprise.QueryResult Events;  public com.sforce.soap.enterprise.QueryResult getEvents() {    return Events;  }    public void setEvents(com.sforce.soap.enterprise.QueryResult Events) {    this.Events = Events;    Events__is_set = true;  }    /**   * element  : Family of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo Family__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Family","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean Family__is_set = false;  private java.lang.String Family;  public java.lang.String getFamily() {    return Family;  }    public void setFamily(java.lang.String Family) {    this.Family = Family;    Family__is_set = true;  }    /**   * element  : IsActive of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: java.lang.Boolean   */  private static final com.sforce.ws.bind.TypeInfo IsActive__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean IsActive__is_set = false;  private java.lang.Boolean IsActive;  public java.lang.Boolean getIsActive() {    return IsActive;  }    public void setIsActive(java.lang.Boolean IsActive) {    this.IsActive = IsActive;    IsActive__is_set = true;  }    /**   * element  : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: java.lang.Boolean   */  private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean IsDeleted__is_set = false;  private java.lang.Boolean IsDeleted;  public java.lang.Boolean getIsDeleted() {    return IsDeleted;  }    public void setIsDeleted(java.lang.Boolean IsDeleted) {    this.IsDeleted = IsDeleted;    IsDeleted__is_set = true;  }    /**   * element  : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User   * java type: com.sforce.soap.enterprise.sobject.User   */  private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);  private boolean LastModifiedBy__is_set = false;  private com.sforce.soap.enterprise.sobject.User LastModifiedBy;  public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {    return LastModifiedBy;  }    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {    this.LastModifiedBy = LastModifiedBy;    LastModifiedBy__is_set = true;  }    /**   * element  : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);  private boolean LastModifiedById__is_set = false;  private java.lang.String LastModifiedById;  public java.lang.String getLastModifiedById() {    return LastModifiedById;  }    public void setLastModifiedById(java.lang.String LastModifiedById) {    this.LastModifiedById = LastModifiedById;    LastModifiedById__is_set = true;  }    /**   * element  : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);  private boolean LastModifiedDate__is_set = false;  private java.util.Calendar LastModifiedDate;  public java.util.Calendar getLastModifiedDate() {    return LastModifiedDate;  }    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {    this.LastModifiedDate = LastModifiedDate;    LastModifiedDate__is_set = true;  }    /**   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean Name__is_set = false;  private java.lang.String Name;  public java.lang.String getName() {    return Name;  }    public void setName(java.lang.String Name) {    this.Name = Name;    Name__is_set = true;  }    /**   * element  : Notes of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean Notes__is_set = false;  private com.sforce.soap.enterprise.QueryResult Notes;  public com.sforce.soap.enterprise.QueryResult getNotes() {    return Notes;  }    public void setNotes(com.sforce.soap.enterprise.QueryResult Notes) {    this.Notes = Notes;    Notes__is_set = true;  }    /**   * element  : NotesAndAttachments of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo NotesAndAttachments__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NotesAndAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean NotesAndAttachments__is_set = false;  private com.sforce.soap.enterprise.QueryResult NotesAndAttachments;  public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {    return NotesAndAttachments;  }    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult NotesAndAttachments) {    this.NotesAndAttachments = NotesAndAttachments;    NotesAndAttachments__is_set = true;  }    /**   * element  : OpenActivities of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo OpenActivities__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpenActivities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean OpenActivities__is_set = false;  private com.sforce.soap.enterprise.QueryResult OpenActivities;  public com.sforce.soap.enterprise.QueryResult getOpenActivities() {    return OpenActivities;  }    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult OpenActivities) {    this.OpenActivities = OpenActivities;    OpenActivities__is_set = true;  }    /**   * element  : OpportunityLineItems of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo OpportunityLineItems__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityLineItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean OpportunityLineItems__is_set = false;  private com.sforce.soap.enterprise.QueryResult OpportunityLineItems;  public com.sforce.soap.enterprise.QueryResult getOpportunityLineItems() {    return OpportunityLineItems;  }    public void setOpportunityLineItems(com.sforce.soap.enterprise.QueryResult OpportunityLineItems) {    this.OpportunityLineItems = OpportunityLineItems;    OpportunityLineItems__is_set = true;  }    /**   * element  : PricebookEntries of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo PricebookEntries__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PricebookEntries","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean PricebookEntries__is_set = false;  private com.sforce.soap.enterprise.QueryResult PricebookEntries;  public com.sforce.soap.enterprise.QueryResult getPricebookEntries() {    return PricebookEntries;  }    public void setPricebookEntries(com.sforce.soap.enterprise.QueryResult PricebookEntries) {    this.PricebookEntries = PricebookEntries;    PricebookEntries__is_set = true;  }    /**   * element  : ProcessInstances of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo ProcessInstances__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstances","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean ProcessInstances__is_set = false;  private com.sforce.soap.enterprise.QueryResult ProcessInstances;  public com.sforce.soap.enterprise.QueryResult getProcessInstances() {    return ProcessInstances;  }    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult ProcessInstances) {    this.ProcessInstances = ProcessInstances;    ProcessInstances__is_set = true;  }    /**   * element  : ProcessSteps of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo ProcessSteps__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessSteps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean ProcessSteps__is_set = false;  private com.sforce.soap.enterprise.QueryResult ProcessSteps;  public com.sforce.soap.enterprise.QueryResult getProcessSteps() {    return ProcessSteps;  }    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult ProcessSteps) {    this.ProcessSteps = ProcessSteps;    ProcessSteps__is_set = true;  }    /**   * element  : ProductCode of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo ProductCode__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProductCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean ProductCode__is_set = false;  private java.lang.String ProductCode;  public java.lang.String getProductCode() {    return ProductCode;  }    public void setProductCode(java.lang.String ProductCode) {    this.ProductCode = ProductCode;    ProductCode__is_set = true;  }    /**   * element  : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);  private boolean SystemModstamp__is_set = false;  private java.util.Calendar SystemModstamp;  public java.util.Calendar getSystemModstamp() {    return SystemModstamp;  }    public void setSystemModstamp(java.util.Calendar SystemModstamp) {    this.SystemModstamp = SystemModstamp;    SystemModstamp__is_set = true;  }    /**   * element  : Tasks of type {urn:enterprise.soap.sforce.com}QueryResult   * java type: com.sforce.soap.enterprise.QueryResult   */  private static final com.sforce.ws.bind.TypeInfo Tasks__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tasks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);  private boolean Tasks__is_set = false;  private com.sforce.soap.enterprise.QueryResult Tasks;  public com.sforce.soap.enterprise.QueryResult getTasks() {    return Tasks;  }    public void setTasks(com.sforce.soap.enterprise.QueryResult Tasks) {    this.Tasks = Tasks;    Tasks__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Product2");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);    __typeMapper.writeObject(__out, Assets__typeInfo, Assets, Assets__is_set);    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);    __typeMapper.writeString(__out, Family__typeInfo, Family, Family__is_set);    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);    __typeMapper.writeObject(__out, OpportunityLineItems__typeInfo, OpportunityLineItems, OpportunityLineItems__is_set);    __typeMapper.writeObject(__out, PricebookEntries__typeInfo, PricebookEntries, PricebookEntries__is_set);    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);    __typeMapper.writeString(__out, ProductCode__typeInfo, ProductCode, ProductCode__is_set);    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Assets__typeInfo)) {      setAssets((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assets__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Attachments__typeInfo)) {      setAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Attachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {      setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {      setCreatedById((java.lang.String)__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Events__typeInfo)) {      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Family__typeInfo)) {      setFamily((java.lang.String)__typeMapper.readString(__in, Family__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {      setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {      setLastModifiedById((java.lang.String)__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Name__typeInfo)) {      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Notes__typeInfo)) {      setNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Notes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, NotesAndAttachments__typeInfo)) {      setNotesAndAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, NotesAndAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, OpportunityLineItems__typeInfo)) {      setOpportunityLineItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityLineItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, PricebookEntries__typeInfo)) {      setPricebookEntries((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PricebookEntries__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, ProcessInstances__typeInfo)) {      setProcessInstances((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessInstances__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, ProcessSteps__typeInfo)) {      setProcessSteps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessSteps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, ProductCode__typeInfo)) {      setProductCode((java.lang.String)__typeMapper.readString(__in, ProductCode__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Tasks__typeInfo)) {      setTasks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tasks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[Product2 ");    sb.append(super.toString());    sb.append(" ActivityHistories=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");    sb.append(" Assets=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assets)+"'\n");    sb.append(" Attachments=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");    sb.append(" CreatedBy=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");    sb.append(" CreatedById=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");    sb.append(" CreatedDate=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");    sb.append(" Description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");    sb.append(" Events=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");    sb.append(" Family=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Family)+"'\n");    sb.append(" IsActive=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");    sb.append(" IsDeleted=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");    sb.append(" LastModifiedBy=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");    sb.append(" LastModifiedById=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");    sb.append(" LastModifiedDate=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");    sb.append(" Name=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");    sb.append(" Notes=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");    sb.append(" NotesAndAttachments=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");    sb.append(" OpenActivities=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");    sb.append(" OpportunityLineItems=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityLineItems)+"'\n");    sb.append(" PricebookEntries=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(PricebookEntries)+"'\n");    sb.append(" ProcessInstances=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");    sb.append(" ProcessSteps=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");    sb.append(" ProductCode=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProductCode)+"'\n");    sb.append(" SystemModstamp=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");    sb.append(" Tasks=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");    sb.append("]\n");    return sb.toString();  }}