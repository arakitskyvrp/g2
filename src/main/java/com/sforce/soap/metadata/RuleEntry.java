package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class RuleEntry implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public RuleEntry() {  }        /**   * element  : assignedTo of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo assignedTo__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignedTo","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean assignedTo__is_set = false;  private java.lang.String assignedTo;  public java.lang.String getAssignedTo() {    return assignedTo;  }    public void setAssignedTo(java.lang.String assignedTo) {    this.assignedTo = assignedTo;    assignedTo__is_set = true;  }    /**   * element  : assignedToType of type {http://soap.sforce.com/2006/04/metadata}AssignToLookupValueType   * java type: com.sforce.soap.metadata.AssignToLookupValueType   */  private static final com.sforce.ws.bind.TypeInfo assignedToType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignedToType","http://soap.sforce.com/2006/04/metadata","AssignToLookupValueType",0,1,true);  private boolean assignedToType__is_set = false;  private com.sforce.soap.metadata.AssignToLookupValueType assignedToType;  public com.sforce.soap.metadata.AssignToLookupValueType getAssignedToType() {    return assignedToType;  }    public void setAssignedToType(com.sforce.soap.metadata.AssignToLookupValueType assignedToType) {    this.assignedToType = assignedToType;    assignedToType__is_set = true;  }    /**   * element  : booleanFilter of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo booleanFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","booleanFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean booleanFilter__is_set = false;  private java.lang.String booleanFilter;  public java.lang.String getBooleanFilter() {    return booleanFilter;  }    public void setBooleanFilter(java.lang.String booleanFilter) {    this.booleanFilter = booleanFilter;    booleanFilter__is_set = true;  }    /**   * element  : businessHours of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo businessHours__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","businessHours","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean businessHours__is_set = false;  private java.lang.String businessHours;  public java.lang.String getBusinessHours() {    return businessHours;  }    public void setBusinessHours(java.lang.String businessHours) {    this.businessHours = businessHours;    businessHours__is_set = true;  }    /**   * element  : businessHoursSource of type {http://soap.sforce.com/2006/04/metadata}BusinessHoursSourceType   * java type: com.sforce.soap.metadata.BusinessHoursSourceType   */  private static final com.sforce.ws.bind.TypeInfo businessHoursSource__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","businessHoursSource","http://soap.sforce.com/2006/04/metadata","BusinessHoursSourceType",0,1,true);  private boolean businessHoursSource__is_set = false;  private com.sforce.soap.metadata.BusinessHoursSourceType businessHoursSource;  public com.sforce.soap.metadata.BusinessHoursSourceType getBusinessHoursSource() {    return businessHoursSource;  }    public void setBusinessHoursSource(com.sforce.soap.metadata.BusinessHoursSourceType businessHoursSource) {    this.businessHoursSource = businessHoursSource;    businessHoursSource__is_set = true;  }    /**   * element  : criteriaItems of type {http://soap.sforce.com/2006/04/metadata}FilterItem   * java type: com.sforce.soap.metadata.FilterItem[]   */  private static final com.sforce.ws.bind.TypeInfo criteriaItems__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","criteriaItems","http://soap.sforce.com/2006/04/metadata","FilterItem",0,-1,true);  private boolean criteriaItems__is_set = false;  private com.sforce.soap.metadata.FilterItem[] criteriaItems = new com.sforce.soap.metadata.FilterItem[0];  public com.sforce.soap.metadata.FilterItem[] getCriteriaItems() {    return criteriaItems;  }    public void setCriteriaItems(com.sforce.soap.metadata.FilterItem[] criteriaItems) {    this.criteriaItems = criteriaItems;    criteriaItems__is_set = true;  }    /**   * element  : disableEscalationWhenModified of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo disableEscalationWhenModified__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","disableEscalationWhenModified","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean disableEscalationWhenModified__is_set = false;  private boolean disableEscalationWhenModified;  public boolean getDisableEscalationWhenModified() {    return disableEscalationWhenModified;  }    public boolean isDisableEscalationWhenModified() {    return disableEscalationWhenModified;  }    public void setDisableEscalationWhenModified(boolean disableEscalationWhenModified) {    this.disableEscalationWhenModified = disableEscalationWhenModified;    disableEscalationWhenModified__is_set = true;  }    /**   * element  : escalationAction of type {http://soap.sforce.com/2006/04/metadata}EscalationAction   * java type: com.sforce.soap.metadata.EscalationAction[]   */  private static final com.sforce.ws.bind.TypeInfo escalationAction__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","escalationAction","http://soap.sforce.com/2006/04/metadata","EscalationAction",0,-1,true);  private boolean escalationAction__is_set = false;  private com.sforce.soap.metadata.EscalationAction[] escalationAction = new com.sforce.soap.metadata.EscalationAction[0];  public com.sforce.soap.metadata.EscalationAction[] getEscalationAction() {    return escalationAction;  }    public void setEscalationAction(com.sforce.soap.metadata.EscalationAction[] escalationAction) {    this.escalationAction = escalationAction;    escalationAction__is_set = true;  }    /**   * element  : escalationStartTime of type {http://soap.sforce.com/2006/04/metadata}EscalationStartTimeType   * java type: com.sforce.soap.metadata.EscalationStartTimeType   */  private static final com.sforce.ws.bind.TypeInfo escalationStartTime__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","escalationStartTime","http://soap.sforce.com/2006/04/metadata","EscalationStartTimeType",0,1,true);  private boolean escalationStartTime__is_set = false;  private com.sforce.soap.metadata.EscalationStartTimeType escalationStartTime;  public com.sforce.soap.metadata.EscalationStartTimeType getEscalationStartTime() {    return escalationStartTime;  }    public void setEscalationStartTime(com.sforce.soap.metadata.EscalationStartTimeType escalationStartTime) {    this.escalationStartTime = escalationStartTime;    escalationStartTime__is_set = true;  }    /**   * element  : formula of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo formula__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","formula","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean formula__is_set = false;  private java.lang.String formula;  public java.lang.String getFormula() {    return formula;  }    public void setFormula(java.lang.String formula) {    this.formula = formula;    formula__is_set = true;  }    /**   * element  : overrideExistingTeams of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo overrideExistingTeams__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","overrideExistingTeams","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean overrideExistingTeams__is_set = false;  private boolean overrideExistingTeams;  public boolean getOverrideExistingTeams() {    return overrideExistingTeams;  }    public boolean isOverrideExistingTeams() {    return overrideExistingTeams;  }    public void setOverrideExistingTeams(boolean overrideExistingTeams) {    this.overrideExistingTeams = overrideExistingTeams;    overrideExistingTeams__is_set = true;  }    /**   * element  : replyToEmail of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo replyToEmail__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","replyToEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean replyToEmail__is_set = false;  private java.lang.String replyToEmail;  public java.lang.String getReplyToEmail() {    return replyToEmail;  }    public void setReplyToEmail(java.lang.String replyToEmail) {    this.replyToEmail = replyToEmail;    replyToEmail__is_set = true;  }    /**   * element  : senderEmail of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo senderEmail__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","senderEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean senderEmail__is_set = false;  private java.lang.String senderEmail;  public java.lang.String getSenderEmail() {    return senderEmail;  }    public void setSenderEmail(java.lang.String senderEmail) {    this.senderEmail = senderEmail;    senderEmail__is_set = true;  }    /**   * element  : senderName of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo senderName__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","senderName","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean senderName__is_set = false;  private java.lang.String senderName;  public java.lang.String getSenderName() {    return senderName;  }    public void setSenderName(java.lang.String senderName) {    this.senderName = senderName;    senderName__is_set = true;  }    /**   * element  : team of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String[]   */  private static final com.sforce.ws.bind.TypeInfo team__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","team","http://www.w3.org/2001/XMLSchema","string",0,-1,true);  private boolean team__is_set = false;  private java.lang.String[] team = new java.lang.String[0];  public java.lang.String[] getTeam() {    return team;  }    public void setTeam(java.lang.String[] team) {    this.team = team;    team__is_set = true;  }    /**   * element  : template of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo template__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","template","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean template__is_set = false;  private java.lang.String template;  public java.lang.String getTemplate() {    return template;  }    public void setTemplate(java.lang.String template) {    this.template = template;    template__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeString(__out, assignedTo__typeInfo, assignedTo, assignedTo__is_set);    __typeMapper.writeObject(__out, assignedToType__typeInfo, assignedToType, assignedToType__is_set);    __typeMapper.writeString(__out, booleanFilter__typeInfo, booleanFilter, booleanFilter__is_set);    __typeMapper.writeString(__out, businessHours__typeInfo, businessHours, businessHours__is_set);    __typeMapper.writeObject(__out, businessHoursSource__typeInfo, businessHoursSource, businessHoursSource__is_set);    __typeMapper.writeObject(__out, criteriaItems__typeInfo, criteriaItems, criteriaItems__is_set);    __typeMapper.writeBoolean(__out, disableEscalationWhenModified__typeInfo, disableEscalationWhenModified, disableEscalationWhenModified__is_set);    __typeMapper.writeObject(__out, escalationAction__typeInfo, escalationAction, escalationAction__is_set);    __typeMapper.writeObject(__out, escalationStartTime__typeInfo, escalationStartTime, escalationStartTime__is_set);    __typeMapper.writeString(__out, formula__typeInfo, formula, formula__is_set);    __typeMapper.writeBoolean(__out, overrideExistingTeams__typeInfo, overrideExistingTeams, overrideExistingTeams__is_set);    __typeMapper.writeString(__out, replyToEmail__typeInfo, replyToEmail, replyToEmail__is_set);    __typeMapper.writeString(__out, senderEmail__typeInfo, senderEmail, senderEmail__is_set);    __typeMapper.writeString(__out, senderName__typeInfo, senderName, senderName__is_set);    __typeMapper.writeObject(__out, team__typeInfo, team, team__is_set);    __typeMapper.writeString(__out, template__typeInfo, template, template__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, assignedTo__typeInfo)) {      setAssignedTo((java.lang.String)__typeMapper.readString(__in, assignedTo__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, assignedToType__typeInfo)) {      setAssignedToType((com.sforce.soap.metadata.AssignToLookupValueType)__typeMapper.readObject(__in, assignedToType__typeInfo, com.sforce.soap.metadata.AssignToLookupValueType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, booleanFilter__typeInfo)) {      setBooleanFilter((java.lang.String)__typeMapper.readString(__in, booleanFilter__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, businessHours__typeInfo)) {      setBusinessHours((java.lang.String)__typeMapper.readString(__in, businessHours__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, businessHoursSource__typeInfo)) {      setBusinessHoursSource((com.sforce.soap.metadata.BusinessHoursSourceType)__typeMapper.readObject(__in, businessHoursSource__typeInfo, com.sforce.soap.metadata.BusinessHoursSourceType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, criteriaItems__typeInfo)) {      setCriteriaItems((com.sforce.soap.metadata.FilterItem[])__typeMapper.readObject(__in, criteriaItems__typeInfo, com.sforce.soap.metadata.FilterItem[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, disableEscalationWhenModified__typeInfo)) {      setDisableEscalationWhenModified((boolean)__typeMapper.readBoolean(__in, disableEscalationWhenModified__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, escalationAction__typeInfo)) {      setEscalationAction((com.sforce.soap.metadata.EscalationAction[])__typeMapper.readObject(__in, escalationAction__typeInfo, com.sforce.soap.metadata.EscalationAction[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, escalationStartTime__typeInfo)) {      setEscalationStartTime((com.sforce.soap.metadata.EscalationStartTimeType)__typeMapper.readObject(__in, escalationStartTime__typeInfo, com.sforce.soap.metadata.EscalationStartTimeType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, formula__typeInfo)) {      setFormula((java.lang.String)__typeMapper.readString(__in, formula__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, overrideExistingTeams__typeInfo)) {      setOverrideExistingTeams((boolean)__typeMapper.readBoolean(__in, overrideExistingTeams__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, replyToEmail__typeInfo)) {      setReplyToEmail((java.lang.String)__typeMapper.readString(__in, replyToEmail__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, senderEmail__typeInfo)) {      setSenderEmail((java.lang.String)__typeMapper.readString(__in, senderEmail__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, senderName__typeInfo)) {      setSenderName((java.lang.String)__typeMapper.readString(__in, senderName__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, team__typeInfo)) {      setTeam((java.lang.String[])__typeMapper.readObject(__in, team__typeInfo, java.lang.String[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, template__typeInfo)) {      setTemplate((java.lang.String)__typeMapper.readString(__in, template__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[RuleEntry ");        sb.append(" assignedTo=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignedTo)+"'\n");    sb.append(" assignedToType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignedToType)+"'\n");    sb.append(" booleanFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(booleanFilter)+"'\n");    sb.append(" businessHours=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(businessHours)+"'\n");    sb.append(" businessHoursSource=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(businessHoursSource)+"'\n");    sb.append(" criteriaItems=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(criteriaItems)+"'\n");    sb.append(" disableEscalationWhenModified=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(disableEscalationWhenModified)+"'\n");    sb.append(" escalationAction=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(escalationAction)+"'\n");    sb.append(" escalationStartTime=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(escalationStartTime)+"'\n");    sb.append(" formula=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(formula)+"'\n");    sb.append(" overrideExistingTeams=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(overrideExistingTeams)+"'\n");    sb.append(" replyToEmail=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(replyToEmail)+"'\n");    sb.append(" senderEmail=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(senderEmail)+"'\n");    sb.append(" senderName=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(senderName)+"'\n");    sb.append(" team=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(team)+"'\n");    sb.append(" template=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(template)+"'\n");    sb.append("]\n");    return sb.toString();  }}