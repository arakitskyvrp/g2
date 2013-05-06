package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class AuthProvider extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public AuthProvider() {  }        /**   * element  : consumerKey of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo consumerKey__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","consumerKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean consumerKey__is_set = false;  private java.lang.String consumerKey;  public java.lang.String getConsumerKey() {    return consumerKey;  }    public void setConsumerKey(java.lang.String consumerKey) {    this.consumerKey = consumerKey;    consumerKey__is_set = true;  }    /**   * element  : consumerSecret of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo consumerSecret__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","consumerSecret","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean consumerSecret__is_set = false;  private java.lang.String consumerSecret;  public java.lang.String getConsumerSecret() {    return consumerSecret;  }    public void setConsumerSecret(java.lang.String consumerSecret) {    this.consumerSecret = consumerSecret;    consumerSecret__is_set = true;  }    /**   * element  : errorUrl of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo errorUrl__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","errorUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean errorUrl__is_set = false;  private java.lang.String errorUrl;  public java.lang.String getErrorUrl() {    return errorUrl;  }    public void setErrorUrl(java.lang.String errorUrl) {    this.errorUrl = errorUrl;    errorUrl__is_set = true;  }    /**   * element  : executionUser of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo executionUser__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","executionUser","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean executionUser__is_set = false;  private java.lang.String executionUser;  public java.lang.String getExecutionUser() {    return executionUser;  }    public void setExecutionUser(java.lang.String executionUser) {    this.executionUser = executionUser;    executionUser__is_set = true;  }    /**   * element  : friendlyName of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo friendlyName__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","friendlyName","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean friendlyName__is_set = false;  private java.lang.String friendlyName;  public java.lang.String getFriendlyName() {    return friendlyName;  }    public void setFriendlyName(java.lang.String friendlyName) {    this.friendlyName = friendlyName;    friendlyName__is_set = true;  }    /**   * element  : portal of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo portal__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","portal","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean portal__is_set = false;  private java.lang.String portal;  public java.lang.String getPortal() {    return portal;  }    public void setPortal(java.lang.String portal) {    this.portal = portal;    portal__is_set = true;  }    /**   * element  : providerType of type {http://soap.sforce.com/2006/04/metadata}AuthProviderType   * java type: com.sforce.soap.metadata.AuthProviderType   */  private static final com.sforce.ws.bind.TypeInfo providerType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","providerType","http://soap.sforce.com/2006/04/metadata","AuthProviderType",1,1,true);  private boolean providerType__is_set = false;  private com.sforce.soap.metadata.AuthProviderType providerType;  public com.sforce.soap.metadata.AuthProviderType getProviderType() {    return providerType;  }    public void setProviderType(com.sforce.soap.metadata.AuthProviderType providerType) {    this.providerType = providerType;    providerType__is_set = true;  }    /**   * element  : registrationHandler of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo registrationHandler__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","registrationHandler","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean registrationHandler__is_set = false;  private java.lang.String registrationHandler;  public java.lang.String getRegistrationHandler() {    return registrationHandler;  }    public void setRegistrationHandler(java.lang.String registrationHandler) {    this.registrationHandler = registrationHandler;    registrationHandler__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "AuthProvider");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeString(__out, consumerKey__typeInfo, consumerKey, consumerKey__is_set);    __typeMapper.writeString(__out, consumerSecret__typeInfo, consumerSecret, consumerSecret__is_set);    __typeMapper.writeString(__out, errorUrl__typeInfo, errorUrl, errorUrl__is_set);    __typeMapper.writeString(__out, executionUser__typeInfo, executionUser, executionUser__is_set);    __typeMapper.writeString(__out, friendlyName__typeInfo, friendlyName, friendlyName__is_set);    __typeMapper.writeString(__out, portal__typeInfo, portal, portal__is_set);    __typeMapper.writeObject(__out, providerType__typeInfo, providerType, providerType__is_set);    __typeMapper.writeString(__out, registrationHandler__typeInfo, registrationHandler, registrationHandler__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, consumerKey__typeInfo)) {      setConsumerKey((java.lang.String)__typeMapper.readString(__in, consumerKey__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, consumerSecret__typeInfo)) {      setConsumerSecret((java.lang.String)__typeMapper.readString(__in, consumerSecret__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, errorUrl__typeInfo)) {      setErrorUrl((java.lang.String)__typeMapper.readString(__in, errorUrl__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, executionUser__typeInfo)) {      setExecutionUser((java.lang.String)__typeMapper.readString(__in, executionUser__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, friendlyName__typeInfo)) {      setFriendlyName((java.lang.String)__typeMapper.readString(__in, friendlyName__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, portal__typeInfo)) {      setPortal((java.lang.String)__typeMapper.readString(__in, portal__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, providerType__typeInfo)) {      setProviderType((com.sforce.soap.metadata.AuthProviderType)__typeMapper.readObject(__in, providerType__typeInfo, com.sforce.soap.metadata.AuthProviderType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, registrationHandler__typeInfo)) {      setRegistrationHandler((java.lang.String)__typeMapper.readString(__in, registrationHandler__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[AuthProvider ");    sb.append(super.toString());    sb.append(" consumerKey=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(consumerKey)+"'\n");    sb.append(" consumerSecret=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(consumerSecret)+"'\n");    sb.append(" errorUrl=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(errorUrl)+"'\n");    sb.append(" executionUser=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(executionUser)+"'\n");    sb.append(" friendlyName=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(friendlyName)+"'\n");    sb.append(" portal=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(portal)+"'\n");    sb.append(" providerType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(providerType)+"'\n");    sb.append(" registrationHandler=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(registrationHandler)+"'\n");    sb.append("]\n");    return sb.toString();  }}