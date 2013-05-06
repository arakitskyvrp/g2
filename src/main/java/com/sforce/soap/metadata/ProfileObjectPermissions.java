package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ProfileObjectPermissions implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ProfileObjectPermissions() {  }        /**   * element  : allowCreate of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo allowCreate__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allowCreate","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean allowCreate__is_set = false;  private boolean allowCreate;  public boolean getAllowCreate() {    return allowCreate;  }    public boolean isAllowCreate() {    return allowCreate;  }    public void setAllowCreate(boolean allowCreate) {    this.allowCreate = allowCreate;    allowCreate__is_set = true;  }    /**   * element  : allowDelete of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo allowDelete__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allowDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean allowDelete__is_set = false;  private boolean allowDelete;  public boolean getAllowDelete() {    return allowDelete;  }    public boolean isAllowDelete() {    return allowDelete;  }    public void setAllowDelete(boolean allowDelete) {    this.allowDelete = allowDelete;    allowDelete__is_set = true;  }    /**   * element  : allowEdit of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo allowEdit__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allowEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean allowEdit__is_set = false;  private boolean allowEdit;  public boolean getAllowEdit() {    return allowEdit;  }    public boolean isAllowEdit() {    return allowEdit;  }    public void setAllowEdit(boolean allowEdit) {    this.allowEdit = allowEdit;    allowEdit__is_set = true;  }    /**   * element  : allowRead of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo allowRead__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allowRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean allowRead__is_set = false;  private boolean allowRead;  public boolean getAllowRead() {    return allowRead;  }    public boolean isAllowRead() {    return allowRead;  }    public void setAllowRead(boolean allowRead) {    this.allowRead = allowRead;    allowRead__is_set = true;  }    /**   * element  : modifyAllRecords of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo modifyAllRecords__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","modifyAllRecords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean modifyAllRecords__is_set = false;  private boolean modifyAllRecords;  public boolean getModifyAllRecords() {    return modifyAllRecords;  }    public boolean isModifyAllRecords() {    return modifyAllRecords;  }    public void setModifyAllRecords(boolean modifyAllRecords) {    this.modifyAllRecords = modifyAllRecords;    modifyAllRecords__is_set = true;  }    /**   * element  : object of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo object__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","object","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean object__is_set = false;  private java.lang.String object;  public java.lang.String getObject() {    return object;  }    public void setObject(java.lang.String object) {    this.object = object;    object__is_set = true;  }    /**   * element  : viewAllRecords of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo viewAllRecords__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","viewAllRecords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean viewAllRecords__is_set = false;  private boolean viewAllRecords;  public boolean getViewAllRecords() {    return viewAllRecords;  }    public boolean isViewAllRecords() {    return viewAllRecords;  }    public void setViewAllRecords(boolean viewAllRecords) {    this.viewAllRecords = viewAllRecords;    viewAllRecords__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeBoolean(__out, allowCreate__typeInfo, allowCreate, allowCreate__is_set);    __typeMapper.writeBoolean(__out, allowDelete__typeInfo, allowDelete, allowDelete__is_set);    __typeMapper.writeBoolean(__out, allowEdit__typeInfo, allowEdit, allowEdit__is_set);    __typeMapper.writeBoolean(__out, allowRead__typeInfo, allowRead, allowRead__is_set);    __typeMapper.writeBoolean(__out, modifyAllRecords__typeInfo, modifyAllRecords, modifyAllRecords__is_set);    __typeMapper.writeString(__out, object__typeInfo, object, object__is_set);    __typeMapper.writeBoolean(__out, viewAllRecords__typeInfo, viewAllRecords, viewAllRecords__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, allowCreate__typeInfo)) {      setAllowCreate((boolean)__typeMapper.readBoolean(__in, allowCreate__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, allowDelete__typeInfo)) {      setAllowDelete((boolean)__typeMapper.readBoolean(__in, allowDelete__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, allowEdit__typeInfo)) {      setAllowEdit((boolean)__typeMapper.readBoolean(__in, allowEdit__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, allowRead__typeInfo)) {      setAllowRead((boolean)__typeMapper.readBoolean(__in, allowRead__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, modifyAllRecords__typeInfo)) {      setModifyAllRecords((boolean)__typeMapper.readBoolean(__in, modifyAllRecords__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, object__typeInfo)) {      setObject((java.lang.String)__typeMapper.readString(__in, object__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, viewAllRecords__typeInfo)) {      setViewAllRecords((boolean)__typeMapper.readBoolean(__in, viewAllRecords__typeInfo, boolean.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ProfileObjectPermissions ");        sb.append(" allowCreate=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowCreate)+"'\n");    sb.append(" allowDelete=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowDelete)+"'\n");    sb.append(" allowEdit=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowEdit)+"'\n");    sb.append(" allowRead=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowRead)+"'\n");    sb.append(" modifyAllRecords=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(modifyAllRecords)+"'\n");    sb.append(" object=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(object)+"'\n");    sb.append(" viewAllRecords=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(viewAllRecords)+"'\n");    sb.append("]\n");    return sb.toString();  }}