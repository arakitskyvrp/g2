package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class EmailTemplate extends com.sforce.soap.metadata.MetadataWithContent {  /**   * Constructor   */  public EmailTemplate() {  }        /**   * element  : apiVersion of type {http://www.w3.org/2001/XMLSchema}double   * java type: double   */  private static final com.sforce.ws.bind.TypeInfo apiVersion__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","apiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true);  private boolean apiVersion__is_set = false;  private double apiVersion;  public double getApiVersion() {    return apiVersion;  }    public void setApiVersion(double apiVersion) {    this.apiVersion = apiVersion;    apiVersion__is_set = true;  }    /**   * element  : attachedDocuments of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String[]   */  private static final com.sforce.ws.bind.TypeInfo attachedDocuments__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","attachedDocuments","http://www.w3.org/2001/XMLSchema","string",0,-1,true);  private boolean attachedDocuments__is_set = false;  private java.lang.String[] attachedDocuments = new java.lang.String[0];  public java.lang.String[] getAttachedDocuments() {    return attachedDocuments;  }    public void setAttachedDocuments(java.lang.String[] attachedDocuments) {    this.attachedDocuments = attachedDocuments;    attachedDocuments__is_set = true;  }    /**   * element  : attachments of type {http://soap.sforce.com/2006/04/metadata}Attachment   * java type: com.sforce.soap.metadata.Attachment[]   */  private static final com.sforce.ws.bind.TypeInfo attachments__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","attachments","http://soap.sforce.com/2006/04/metadata","Attachment",0,-1,true);  private boolean attachments__is_set = false;  private com.sforce.soap.metadata.Attachment[] attachments = new com.sforce.soap.metadata.Attachment[0];  public com.sforce.soap.metadata.Attachment[] getAttachments() {    return attachments;  }    public void setAttachments(com.sforce.soap.metadata.Attachment[] attachments) {    this.attachments = attachments;    attachments__is_set = true;  }    /**   * element  : available of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo available__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","available","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean available__is_set = false;  private boolean available;  public boolean getAvailable() {    return available;  }    public boolean isAvailable() {    return available;  }    public void setAvailable(boolean available) {    this.available = available;    available__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : encodingKey of type {http://soap.sforce.com/2006/04/metadata}Encoding   * java type: com.sforce.soap.metadata.Encoding   */  private static final com.sforce.ws.bind.TypeInfo encodingKey__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","encodingKey","http://soap.sforce.com/2006/04/metadata","Encoding",1,1,true);  private boolean encodingKey__is_set = false;  private com.sforce.soap.metadata.Encoding encodingKey;  public com.sforce.soap.metadata.Encoding getEncodingKey() {    return encodingKey;  }    public void setEncodingKey(com.sforce.soap.metadata.Encoding encodingKey) {    this.encodingKey = encodingKey;    encodingKey__is_set = true;  }    /**   * element  : letterhead of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo letterhead__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","letterhead","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean letterhead__is_set = false;  private java.lang.String letterhead;  public java.lang.String getLetterhead() {    return letterhead;  }    public void setLetterhead(java.lang.String letterhead) {    this.letterhead = letterhead;    letterhead__is_set = true;  }    /**   * element  : name of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean name__is_set = false;  private java.lang.String name;  public java.lang.String getName() {    return name;  }    public void setName(java.lang.String name) {    this.name = name;    name__is_set = true;  }    /**   * element  : packageVersions of type {http://soap.sforce.com/2006/04/metadata}PackageVersion   * java type: com.sforce.soap.metadata.PackageVersion[]   */  private static final com.sforce.ws.bind.TypeInfo packageVersions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","packageVersions","http://soap.sforce.com/2006/04/metadata","PackageVersion",0,-1,true);  private boolean packageVersions__is_set = false;  private com.sforce.soap.metadata.PackageVersion[] packageVersions = new com.sforce.soap.metadata.PackageVersion[0];  public com.sforce.soap.metadata.PackageVersion[] getPackageVersions() {    return packageVersions;  }    public void setPackageVersions(com.sforce.soap.metadata.PackageVersion[] packageVersions) {    this.packageVersions = packageVersions;    packageVersions__is_set = true;  }    /**   * element  : style of type {http://soap.sforce.com/2006/04/metadata}EmailTemplateStyle   * java type: com.sforce.soap.metadata.EmailTemplateStyle   */  private static final com.sforce.ws.bind.TypeInfo style__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","style","http://soap.sforce.com/2006/04/metadata","EmailTemplateStyle",1,1,true);  private boolean style__is_set = false;  private com.sforce.soap.metadata.EmailTemplateStyle style;  public com.sforce.soap.metadata.EmailTemplateStyle getStyle() {    return style;  }    public void setStyle(com.sforce.soap.metadata.EmailTemplateStyle style) {    this.style = style;    style__is_set = true;  }    /**   * element  : subject of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo subject__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","subject","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean subject__is_set = false;  private java.lang.String subject;  public java.lang.String getSubject() {    return subject;  }    public void setSubject(java.lang.String subject) {    this.subject = subject;    subject__is_set = true;  }    /**   * element  : textOnly of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo textOnly__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","textOnly","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean textOnly__is_set = false;  private java.lang.String textOnly;  public java.lang.String getTextOnly() {    return textOnly;  }    public void setTextOnly(java.lang.String textOnly) {    this.textOnly = textOnly;    textOnly__is_set = true;  }    /**   * element  : type of type {http://soap.sforce.com/2006/04/metadata}EmailTemplateType   * java type: com.sforce.soap.metadata.EmailTemplateType   */  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","type","http://soap.sforce.com/2006/04/metadata","EmailTemplateType",1,1,true);  private boolean type__is_set = false;  private com.sforce.soap.metadata.EmailTemplateType type;  public com.sforce.soap.metadata.EmailTemplateType getType() {    return type;  }    public void setType(com.sforce.soap.metadata.EmailTemplateType type) {    this.type = type;    type__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "EmailTemplate");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeDouble(__out, apiVersion__typeInfo, apiVersion, apiVersion__is_set);    __typeMapper.writeObject(__out, attachedDocuments__typeInfo, attachedDocuments, attachedDocuments__is_set);    __typeMapper.writeObject(__out, attachments__typeInfo, attachments, attachments__is_set);    __typeMapper.writeBoolean(__out, available__typeInfo, available, available__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeObject(__out, encodingKey__typeInfo, encodingKey, encodingKey__is_set);    __typeMapper.writeString(__out, letterhead__typeInfo, letterhead, letterhead__is_set);    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);    __typeMapper.writeObject(__out, packageVersions__typeInfo, packageVersions, packageVersions__is_set);    __typeMapper.writeObject(__out, style__typeInfo, style, style__is_set);    __typeMapper.writeString(__out, subject__typeInfo, subject, subject__is_set);    __typeMapper.writeString(__out, textOnly__typeInfo, textOnly, textOnly__is_set);    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, apiVersion__typeInfo)) {      setApiVersion((double)__typeMapper.readDouble(__in, apiVersion__typeInfo, double.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, attachedDocuments__typeInfo)) {      setAttachedDocuments((java.lang.String[])__typeMapper.readObject(__in, attachedDocuments__typeInfo, java.lang.String[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, attachments__typeInfo)) {      setAttachments((com.sforce.soap.metadata.Attachment[])__typeMapper.readObject(__in, attachments__typeInfo, com.sforce.soap.metadata.Attachment[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, available__typeInfo)) {      setAvailable((boolean)__typeMapper.readBoolean(__in, available__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, encodingKey__typeInfo)) {      setEncodingKey((com.sforce.soap.metadata.Encoding)__typeMapper.readObject(__in, encodingKey__typeInfo, com.sforce.soap.metadata.Encoding.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, letterhead__typeInfo)) {      setLetterhead((java.lang.String)__typeMapper.readString(__in, letterhead__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, name__typeInfo)) {      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, packageVersions__typeInfo)) {      setPackageVersions((com.sforce.soap.metadata.PackageVersion[])__typeMapper.readObject(__in, packageVersions__typeInfo, com.sforce.soap.metadata.PackageVersion[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, style__typeInfo)) {      setStyle((com.sforce.soap.metadata.EmailTemplateStyle)__typeMapper.readObject(__in, style__typeInfo, com.sforce.soap.metadata.EmailTemplateStyle.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, subject__typeInfo)) {      setSubject((java.lang.String)__typeMapper.readString(__in, subject__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, textOnly__typeInfo)) {      setTextOnly((java.lang.String)__typeMapper.readString(__in, textOnly__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, type__typeInfo)) {      setType((com.sforce.soap.metadata.EmailTemplateType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.metadata.EmailTemplateType.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[EmailTemplate ");    sb.append(super.toString());    sb.append(" apiVersion=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(apiVersion)+"'\n");    sb.append(" attachedDocuments=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(attachedDocuments)+"'\n");    sb.append(" attachments=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(attachments)+"'\n");    sb.append(" available=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(available)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" encodingKey=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(encodingKey)+"'\n");    sb.append(" letterhead=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(letterhead)+"'\n");    sb.append(" name=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");    sb.append(" packageVersions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(packageVersions)+"'\n");    sb.append(" style=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(style)+"'\n");    sb.append(" subject=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(subject)+"'\n");    sb.append(" textOnly=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(textOnly)+"'\n");    sb.append(" type=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");    sb.append("]\n");    return sb.toString();  }}