package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class PermissionSet extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public PermissionSet() {  }        /**   * element  : classAccesses of type {http://soap.sforce.com/2006/04/metadata}PermissionSetApexClassAccess   * java type: com.sforce.soap.metadata.PermissionSetApexClassAccess[]   */  private static final com.sforce.ws.bind.TypeInfo classAccesses__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","classAccesses","http://soap.sforce.com/2006/04/metadata","PermissionSetApexClassAccess",0,-1,true);  private boolean classAccesses__is_set = false;  private com.sforce.soap.metadata.PermissionSetApexClassAccess[] classAccesses = new com.sforce.soap.metadata.PermissionSetApexClassAccess[0];  public com.sforce.soap.metadata.PermissionSetApexClassAccess[] getClassAccesses() {    return classAccesses;  }    public void setClassAccesses(com.sforce.soap.metadata.PermissionSetApexClassAccess[] classAccesses) {    this.classAccesses = classAccesses;    classAccesses__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : externalDataSourceAccesses of type {http://soap.sforce.com/2006/04/metadata}PermissionSetExternalDataSourceAccess   * java type: com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[]   */  private static final com.sforce.ws.bind.TypeInfo externalDataSourceAccesses__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","externalDataSourceAccesses","http://soap.sforce.com/2006/04/metadata","PermissionSetExternalDataSourceAccess",0,-1,true);  private boolean externalDataSourceAccesses__is_set = false;  private com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses = new com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[0];  public com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[] getExternalDataSourceAccesses() {    return externalDataSourceAccesses;  }    public void setExternalDataSourceAccesses(com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses) {    this.externalDataSourceAccesses = externalDataSourceAccesses;    externalDataSourceAccesses__is_set = true;  }    /**   * element  : fieldPermissions of type {http://soap.sforce.com/2006/04/metadata}PermissionSetFieldPermissions   * java type: com.sforce.soap.metadata.PermissionSetFieldPermissions[]   */  private static final com.sforce.ws.bind.TypeInfo fieldPermissions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fieldPermissions","http://soap.sforce.com/2006/04/metadata","PermissionSetFieldPermissions",0,-1,true);  private boolean fieldPermissions__is_set = false;  private com.sforce.soap.metadata.PermissionSetFieldPermissions[] fieldPermissions = new com.sforce.soap.metadata.PermissionSetFieldPermissions[0];  public com.sforce.soap.metadata.PermissionSetFieldPermissions[] getFieldPermissions() {    return fieldPermissions;  }    public void setFieldPermissions(com.sforce.soap.metadata.PermissionSetFieldPermissions[] fieldPermissions) {    this.fieldPermissions = fieldPermissions;    fieldPermissions__is_set = true;  }    /**   * element  : label of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean label__is_set = false;  private java.lang.String label;  public java.lang.String getLabel() {    return label;  }    public void setLabel(java.lang.String label) {    this.label = label;    label__is_set = true;  }    /**   * element  : objectPermissions of type {http://soap.sforce.com/2006/04/metadata}PermissionSetObjectPermissions   * java type: com.sforce.soap.metadata.PermissionSetObjectPermissions[]   */  private static final com.sforce.ws.bind.TypeInfo objectPermissions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","objectPermissions","http://soap.sforce.com/2006/04/metadata","PermissionSetObjectPermissions",0,-1,true);  private boolean objectPermissions__is_set = false;  private com.sforce.soap.metadata.PermissionSetObjectPermissions[] objectPermissions = new com.sforce.soap.metadata.PermissionSetObjectPermissions[0];  public com.sforce.soap.metadata.PermissionSetObjectPermissions[] getObjectPermissions() {    return objectPermissions;  }    public void setObjectPermissions(com.sforce.soap.metadata.PermissionSetObjectPermissions[] objectPermissions) {    this.objectPermissions = objectPermissions;    objectPermissions__is_set = true;  }    /**   * element  : pageAccesses of type {http://soap.sforce.com/2006/04/metadata}PermissionSetApexPageAccess   * java type: com.sforce.soap.metadata.PermissionSetApexPageAccess[]   */  private static final com.sforce.ws.bind.TypeInfo pageAccesses__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","pageAccesses","http://soap.sforce.com/2006/04/metadata","PermissionSetApexPageAccess",0,-1,true);  private boolean pageAccesses__is_set = false;  private com.sforce.soap.metadata.PermissionSetApexPageAccess[] pageAccesses = new com.sforce.soap.metadata.PermissionSetApexPageAccess[0];  public com.sforce.soap.metadata.PermissionSetApexPageAccess[] getPageAccesses() {    return pageAccesses;  }    public void setPageAccesses(com.sforce.soap.metadata.PermissionSetApexPageAccess[] pageAccesses) {    this.pageAccesses = pageAccesses;    pageAccesses__is_set = true;  }    /**   * element  : tabSettings of type {http://soap.sforce.com/2006/04/metadata}PermissionSetTabSetting   * java type: com.sforce.soap.metadata.PermissionSetTabSetting[]   */  private static final com.sforce.ws.bind.TypeInfo tabSettings__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","tabSettings","http://soap.sforce.com/2006/04/metadata","PermissionSetTabSetting",0,-1,true);  private boolean tabSettings__is_set = false;  private com.sforce.soap.metadata.PermissionSetTabSetting[] tabSettings = new com.sforce.soap.metadata.PermissionSetTabSetting[0];  public com.sforce.soap.metadata.PermissionSetTabSetting[] getTabSettings() {    return tabSettings;  }    public void setTabSettings(com.sforce.soap.metadata.PermissionSetTabSetting[] tabSettings) {    this.tabSettings = tabSettings;    tabSettings__is_set = true;  }    /**   * element  : userLicense of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo userLicense__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userLicense","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean userLicense__is_set = false;  private java.lang.String userLicense;  public java.lang.String getUserLicense() {    return userLicense;  }    public void setUserLicense(java.lang.String userLicense) {    this.userLicense = userLicense;    userLicense__is_set = true;  }    /**   * element  : userPermissions of type {http://soap.sforce.com/2006/04/metadata}PermissionSetUserPermission   * java type: com.sforce.soap.metadata.PermissionSetUserPermission[]   */  private static final com.sforce.ws.bind.TypeInfo userPermissions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userPermissions","http://soap.sforce.com/2006/04/metadata","PermissionSetUserPermission",0,-1,true);  private boolean userPermissions__is_set = false;  private com.sforce.soap.metadata.PermissionSetUserPermission[] userPermissions = new com.sforce.soap.metadata.PermissionSetUserPermission[0];  public com.sforce.soap.metadata.PermissionSetUserPermission[] getUserPermissions() {    return userPermissions;  }    public void setUserPermissions(com.sforce.soap.metadata.PermissionSetUserPermission[] userPermissions) {    this.userPermissions = userPermissions;    userPermissions__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "PermissionSet");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, classAccesses__typeInfo, classAccesses, classAccesses__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeObject(__out, externalDataSourceAccesses__typeInfo, externalDataSourceAccesses, externalDataSourceAccesses__is_set);    __typeMapper.writeObject(__out, fieldPermissions__typeInfo, fieldPermissions, fieldPermissions__is_set);    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);    __typeMapper.writeObject(__out, objectPermissions__typeInfo, objectPermissions, objectPermissions__is_set);    __typeMapper.writeObject(__out, pageAccesses__typeInfo, pageAccesses, pageAccesses__is_set);    __typeMapper.writeObject(__out, tabSettings__typeInfo, tabSettings, tabSettings__is_set);    __typeMapper.writeString(__out, userLicense__typeInfo, userLicense, userLicense__is_set);    __typeMapper.writeObject(__out, userPermissions__typeInfo, userPermissions, userPermissions__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, classAccesses__typeInfo)) {      setClassAccesses((com.sforce.soap.metadata.PermissionSetApexClassAccess[])__typeMapper.readObject(__in, classAccesses__typeInfo, com.sforce.soap.metadata.PermissionSetApexClassAccess[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, externalDataSourceAccesses__typeInfo)) {      setExternalDataSourceAccesses((com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[])__typeMapper.readObject(__in, externalDataSourceAccesses__typeInfo, com.sforce.soap.metadata.PermissionSetExternalDataSourceAccess[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, fieldPermissions__typeInfo)) {      setFieldPermissions((com.sforce.soap.metadata.PermissionSetFieldPermissions[])__typeMapper.readObject(__in, fieldPermissions__typeInfo, com.sforce.soap.metadata.PermissionSetFieldPermissions[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, label__typeInfo)) {      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, objectPermissions__typeInfo)) {      setObjectPermissions((com.sforce.soap.metadata.PermissionSetObjectPermissions[])__typeMapper.readObject(__in, objectPermissions__typeInfo, com.sforce.soap.metadata.PermissionSetObjectPermissions[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, pageAccesses__typeInfo)) {      setPageAccesses((com.sforce.soap.metadata.PermissionSetApexPageAccess[])__typeMapper.readObject(__in, pageAccesses__typeInfo, com.sforce.soap.metadata.PermissionSetApexPageAccess[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, tabSettings__typeInfo)) {      setTabSettings((com.sforce.soap.metadata.PermissionSetTabSetting[])__typeMapper.readObject(__in, tabSettings__typeInfo, com.sforce.soap.metadata.PermissionSetTabSetting[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, userLicense__typeInfo)) {      setUserLicense((java.lang.String)__typeMapper.readString(__in, userLicense__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, userPermissions__typeInfo)) {      setUserPermissions((com.sforce.soap.metadata.PermissionSetUserPermission[])__typeMapper.readObject(__in, userPermissions__typeInfo, com.sforce.soap.metadata.PermissionSetUserPermission[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[PermissionSet ");    sb.append(super.toString());    sb.append(" classAccesses=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(classAccesses)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" externalDataSourceAccesses=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(externalDataSourceAccesses)+"'\n");    sb.append(" fieldPermissions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldPermissions)+"'\n");    sb.append(" label=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");    sb.append(" objectPermissions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(objectPermissions)+"'\n");    sb.append(" pageAccesses=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(pageAccesses)+"'\n");    sb.append(" tabSettings=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(tabSettings)+"'\n");    sb.append(" userLicense=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(userLicense)+"'\n");    sb.append(" userPermissions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(userPermissions)+"'\n");    sb.append("]\n");    return sb.toString();  }}