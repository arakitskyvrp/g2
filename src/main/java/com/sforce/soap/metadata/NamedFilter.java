package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class NamedFilter extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public NamedFilter() {  }        /**   * element  : active of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo active__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean active__is_set = false;  private boolean active;  public boolean getActive() {    return active;  }    public boolean isActive() {    return active;  }    public void setActive(boolean active) {    this.active = active;    active__is_set = true;  }    /**   * element  : booleanFilter of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo booleanFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","booleanFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean booleanFilter__is_set = false;  private java.lang.String booleanFilter;  public java.lang.String getBooleanFilter() {    return booleanFilter;  }    public void setBooleanFilter(java.lang.String booleanFilter) {    this.booleanFilter = booleanFilter;    booleanFilter__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : errorMessage of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo errorMessage__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","errorMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean errorMessage__is_set = false;  private java.lang.String errorMessage;  public java.lang.String getErrorMessage() {    return errorMessage;  }    public void setErrorMessage(java.lang.String errorMessage) {    this.errorMessage = errorMessage;    errorMessage__is_set = true;  }    /**   * element  : field of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean field__is_set = false;  private java.lang.String field;  public java.lang.String getField() {    return field;  }    public void setField(java.lang.String field) {    this.field = field;    field__is_set = true;  }    /**   * element  : filterItems of type {http://soap.sforce.com/2006/04/metadata}FilterItem   * java type: com.sforce.soap.metadata.FilterItem[]   */  private static final com.sforce.ws.bind.TypeInfo filterItems__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","filterItems","http://soap.sforce.com/2006/04/metadata","FilterItem",0,-1,true);  private boolean filterItems__is_set = false;  private com.sforce.soap.metadata.FilterItem[] filterItems = new com.sforce.soap.metadata.FilterItem[0];  public com.sforce.soap.metadata.FilterItem[] getFilterItems() {    return filterItems;  }    public void setFilterItems(com.sforce.soap.metadata.FilterItem[] filterItems) {    this.filterItems = filterItems;    filterItems__is_set = true;  }    /**   * element  : infoMessage of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo infoMessage__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","infoMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean infoMessage__is_set = false;  private java.lang.String infoMessage;  public java.lang.String getInfoMessage() {    return infoMessage;  }    public void setInfoMessage(java.lang.String infoMessage) {    this.infoMessage = infoMessage;    infoMessage__is_set = true;  }    /**   * element  : isOptional of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo isOptional__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isOptional","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean isOptional__is_set = false;  private boolean isOptional;  public boolean getIsOptional() {    return isOptional;  }    public boolean isIsOptional() {    return isOptional;  }    public void setIsOptional(boolean isOptional) {    this.isOptional = isOptional;    isOptional__is_set = true;  }    /**   * element  : name of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean name__is_set = false;  private java.lang.String name;  public java.lang.String getName() {    return name;  }    public void setName(java.lang.String name) {    this.name = name;    name__is_set = true;  }    /**   * element  : sourceObject of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo sourceObject__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sourceObject","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean sourceObject__is_set = false;  private java.lang.String sourceObject;  public java.lang.String getSourceObject() {    return sourceObject;  }    public void setSourceObject(java.lang.String sourceObject) {    this.sourceObject = sourceObject;    sourceObject__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "NamedFilter");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);    __typeMapper.writeString(__out, booleanFilter__typeInfo, booleanFilter, booleanFilter__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeString(__out, errorMessage__typeInfo, errorMessage, errorMessage__is_set);    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);    __typeMapper.writeObject(__out, filterItems__typeInfo, filterItems, filterItems__is_set);    __typeMapper.writeString(__out, infoMessage__typeInfo, infoMessage, infoMessage__is_set);    __typeMapper.writeBoolean(__out, isOptional__typeInfo, isOptional, isOptional__is_set);    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);    __typeMapper.writeString(__out, sourceObject__typeInfo, sourceObject, sourceObject__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.verifyElement(__in, active__typeInfo)) {      setActive((boolean)__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, booleanFilter__typeInfo)) {      setBooleanFilter((java.lang.String)__typeMapper.readString(__in, booleanFilter__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, errorMessage__typeInfo)) {      setErrorMessage((java.lang.String)__typeMapper.readString(__in, errorMessage__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, field__typeInfo)) {      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, filterItems__typeInfo)) {      setFilterItems((com.sforce.soap.metadata.FilterItem[])__typeMapper.readObject(__in, filterItems__typeInfo, com.sforce.soap.metadata.FilterItem[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, infoMessage__typeInfo)) {      setInfoMessage((java.lang.String)__typeMapper.readString(__in, infoMessage__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, isOptional__typeInfo)) {      setIsOptional((boolean)__typeMapper.readBoolean(__in, isOptional__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, name__typeInfo)) {      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, sourceObject__typeInfo)) {      setSourceObject((java.lang.String)__typeMapper.readString(__in, sourceObject__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[NamedFilter ");    sb.append(super.toString());    sb.append(" active=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(active)+"'\n");    sb.append(" booleanFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(booleanFilter)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" errorMessage=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(errorMessage)+"'\n");    sb.append(" field=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");    sb.append(" filterItems=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(filterItems)+"'\n");    sb.append(" infoMessage=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(infoMessage)+"'\n");    sb.append(" isOptional=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(isOptional)+"'\n");    sb.append(" name=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");    sb.append(" sourceObject=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(sourceObject)+"'\n");    sb.append("]\n");    return sb.toString();  }}