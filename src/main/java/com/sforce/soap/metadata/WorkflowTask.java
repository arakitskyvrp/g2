package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class WorkflowTask extends com.sforce.soap.metadata.WorkflowAction {  /**   * Constructor   */  public WorkflowTask() {  }        /**   * element  : assignedTo of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo assignedTo__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignedTo","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean assignedTo__is_set = false;  private java.lang.String assignedTo;  public java.lang.String getAssignedTo() {    return assignedTo;  }    public void setAssignedTo(java.lang.String assignedTo) {    this.assignedTo = assignedTo;    assignedTo__is_set = true;  }    /**   * element  : assignedToType of type {http://soap.sforce.com/2006/04/metadata}ActionTaskAssignedToTypes   * java type: com.sforce.soap.metadata.ActionTaskAssignedToTypes   */  private static final com.sforce.ws.bind.TypeInfo assignedToType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignedToType","http://soap.sforce.com/2006/04/metadata","ActionTaskAssignedToTypes",1,1,true);  private boolean assignedToType__is_set = false;  private com.sforce.soap.metadata.ActionTaskAssignedToTypes assignedToType;  public com.sforce.soap.metadata.ActionTaskAssignedToTypes getAssignedToType() {    return assignedToType;  }    public void setAssignedToType(com.sforce.soap.metadata.ActionTaskAssignedToTypes assignedToType) {    this.assignedToType = assignedToType;    assignedToType__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : dueDateOffset of type {http://www.w3.org/2001/XMLSchema}int   * java type: int   */  private static final com.sforce.ws.bind.TypeInfo dueDateOffset__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dueDateOffset","http://www.w3.org/2001/XMLSchema","int",1,1,true);  private boolean dueDateOffset__is_set = false;  private int dueDateOffset;  public int getDueDateOffset() {    return dueDateOffset;  }    public void setDueDateOffset(int dueDateOffset) {    this.dueDateOffset = dueDateOffset;    dueDateOffset__is_set = true;  }    /**   * element  : notifyAssignee of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo notifyAssignee__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","notifyAssignee","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean notifyAssignee__is_set = false;  private boolean notifyAssignee;  public boolean getNotifyAssignee() {    return notifyAssignee;  }    public boolean isNotifyAssignee() {    return notifyAssignee;  }    public void setNotifyAssignee(boolean notifyAssignee) {    this.notifyAssignee = notifyAssignee;    notifyAssignee__is_set = true;  }    /**   * element  : offsetFromField of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo offsetFromField__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean offsetFromField__is_set = false;  private java.lang.String offsetFromField;  public java.lang.String getOffsetFromField() {    return offsetFromField;  }    public void setOffsetFromField(java.lang.String offsetFromField) {    this.offsetFromField = offsetFromField;    offsetFromField__is_set = true;  }    /**   * element  : priority of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo priority__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","priority","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean priority__is_set = false;  private java.lang.String priority;  public java.lang.String getPriority() {    return priority;  }    public void setPriority(java.lang.String priority) {    this.priority = priority;    priority__is_set = true;  }    /**   * element  : protected of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo _protected__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean _protected__is_set = false;  private boolean _protected;  public boolean getProtected() {    return _protected;  }    public boolean isProtected() {    return _protected;  }    public void setProtected(boolean _protected) {    this._protected = _protected;    _protected__is_set = true;  }    /**   * element  : status of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo status__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","status","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean status__is_set = false;  private java.lang.String status;  public java.lang.String getStatus() {    return status;  }    public void setStatus(java.lang.String status) {    this.status = status;    status__is_set = true;  }    /**   * element  : subject of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo subject__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","subject","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean subject__is_set = false;  private java.lang.String subject;  public java.lang.String getSubject() {    return subject;  }    public void setSubject(java.lang.String subject) {    this.subject = subject;    subject__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "WorkflowTask");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeString(__out, assignedTo__typeInfo, assignedTo, assignedTo__is_set);    __typeMapper.writeObject(__out, assignedToType__typeInfo, assignedToType, assignedToType__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeInt(__out, dueDateOffset__typeInfo, dueDateOffset, dueDateOffset__is_set);    __typeMapper.writeBoolean(__out, notifyAssignee__typeInfo, notifyAssignee, notifyAssignee__is_set);    __typeMapper.writeString(__out, offsetFromField__typeInfo, offsetFromField, offsetFromField__is_set);    __typeMapper.writeString(__out, priority__typeInfo, priority, priority__is_set);    __typeMapper.writeBoolean(__out, _protected__typeInfo, _protected, _protected__is_set);    __typeMapper.writeString(__out, status__typeInfo, status, status__is_set);    __typeMapper.writeString(__out, subject__typeInfo, subject, subject__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, assignedTo__typeInfo)) {      setAssignedTo((java.lang.String)__typeMapper.readString(__in, assignedTo__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, assignedToType__typeInfo)) {      setAssignedToType((com.sforce.soap.metadata.ActionTaskAssignedToTypes)__typeMapper.readObject(__in, assignedToType__typeInfo, com.sforce.soap.metadata.ActionTaskAssignedToTypes.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, dueDateOffset__typeInfo)) {      setDueDateOffset((int)__typeMapper.readInt(__in, dueDateOffset__typeInfo, int.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, notifyAssignee__typeInfo)) {      setNotifyAssignee((boolean)__typeMapper.readBoolean(__in, notifyAssignee__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, offsetFromField__typeInfo)) {      setOffsetFromField((java.lang.String)__typeMapper.readString(__in, offsetFromField__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, priority__typeInfo)) {      setPriority((java.lang.String)__typeMapper.readString(__in, priority__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, _protected__typeInfo)) {      setProtected((boolean)__typeMapper.readBoolean(__in, _protected__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, status__typeInfo)) {      setStatus((java.lang.String)__typeMapper.readString(__in, status__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, subject__typeInfo)) {      setSubject((java.lang.String)__typeMapper.readString(__in, subject__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[WorkflowTask ");    sb.append(super.toString());    sb.append(" assignedTo=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignedTo)+"'\n");    sb.append(" assignedToType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignedToType)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" dueDateOffset=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(dueDateOffset)+"'\n");    sb.append(" notifyAssignee=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(notifyAssignee)+"'\n");    sb.append(" offsetFromField=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(offsetFromField)+"'\n");    sb.append(" priority=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(priority)+"'\n");    sb.append(" _protected=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(_protected)+"'\n");    sb.append(" status=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(status)+"'\n");    sb.append(" subject=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(subject)+"'\n");    sb.append("]\n");    return sb.toString();  }}