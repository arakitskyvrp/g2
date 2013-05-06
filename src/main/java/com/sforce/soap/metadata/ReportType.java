package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ReportType extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public ReportType() {  }        /**   * element  : baseObject of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo baseObject__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","baseObject","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean baseObject__is_set = false;  private java.lang.String baseObject;  public java.lang.String getBaseObject() {    return baseObject;  }    public void setBaseObject(java.lang.String baseObject) {    this.baseObject = baseObject;    baseObject__is_set = true;  }    /**   * element  : category of type {http://soap.sforce.com/2006/04/metadata}ReportTypeCategory   * java type: com.sforce.soap.metadata.ReportTypeCategory   */  private static final com.sforce.ws.bind.TypeInfo category__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","category","http://soap.sforce.com/2006/04/metadata","ReportTypeCategory",1,1,true);  private boolean category__is_set = false;  private com.sforce.soap.metadata.ReportTypeCategory category;  public com.sforce.soap.metadata.ReportTypeCategory getCategory() {    return category;  }    public void setCategory(com.sforce.soap.metadata.ReportTypeCategory category) {    this.category = category;    category__is_set = true;  }    /**   * element  : deployed of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo deployed__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","deployed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean deployed__is_set = false;  private boolean deployed;  public boolean getDeployed() {    return deployed;  }    public boolean isDeployed() {    return deployed;  }    public void setDeployed(boolean deployed) {    this.deployed = deployed;    deployed__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : join of type {http://soap.sforce.com/2006/04/metadata}ObjectRelationship   * java type: com.sforce.soap.metadata.ObjectRelationship   */  private static final com.sforce.ws.bind.TypeInfo join__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","join","http://soap.sforce.com/2006/04/metadata","ObjectRelationship",0,1,true);  private boolean join__is_set = false;  private com.sforce.soap.metadata.ObjectRelationship join;  public com.sforce.soap.metadata.ObjectRelationship getJoin() {    return join;  }    public void setJoin(com.sforce.soap.metadata.ObjectRelationship join) {    this.join = join;    join__is_set = true;  }    /**   * element  : label of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean label__is_set = false;  private java.lang.String label;  public java.lang.String getLabel() {    return label;  }    public void setLabel(java.lang.String label) {    this.label = label;    label__is_set = true;  }    /**   * element  : sections of type {http://soap.sforce.com/2006/04/metadata}ReportLayoutSection   * java type: com.sforce.soap.metadata.ReportLayoutSection[]   */  private static final com.sforce.ws.bind.TypeInfo sections__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sections","http://soap.sforce.com/2006/04/metadata","ReportLayoutSection",0,-1,true);  private boolean sections__is_set = false;  private com.sforce.soap.metadata.ReportLayoutSection[] sections = new com.sforce.soap.metadata.ReportLayoutSection[0];  public com.sforce.soap.metadata.ReportLayoutSection[] getSections() {    return sections;  }    public void setSections(com.sforce.soap.metadata.ReportLayoutSection[] sections) {    this.sections = sections;    sections__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "ReportType");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeString(__out, baseObject__typeInfo, baseObject, baseObject__is_set);    __typeMapper.writeObject(__out, category__typeInfo, category, category__is_set);    __typeMapper.writeBoolean(__out, deployed__typeInfo, deployed, deployed__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeObject(__out, join__typeInfo, join, join__is_set);    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);    __typeMapper.writeObject(__out, sections__typeInfo, sections, sections__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.verifyElement(__in, baseObject__typeInfo)) {      setBaseObject((java.lang.String)__typeMapper.readString(__in, baseObject__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, category__typeInfo)) {      setCategory((com.sforce.soap.metadata.ReportTypeCategory)__typeMapper.readObject(__in, category__typeInfo, com.sforce.soap.metadata.ReportTypeCategory.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, deployed__typeInfo)) {      setDeployed((boolean)__typeMapper.readBoolean(__in, deployed__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, join__typeInfo)) {      setJoin((com.sforce.soap.metadata.ObjectRelationship)__typeMapper.readObject(__in, join__typeInfo, com.sforce.soap.metadata.ObjectRelationship.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, label__typeInfo)) {      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, sections__typeInfo)) {      setSections((com.sforce.soap.metadata.ReportLayoutSection[])__typeMapper.readObject(__in, sections__typeInfo, com.sforce.soap.metadata.ReportLayoutSection[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ReportType ");    sb.append(super.toString());    sb.append(" baseObject=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(baseObject)+"'\n");    sb.append(" category=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(category)+"'\n");    sb.append(" deployed=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(deployed)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" join=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(join)+"'\n");    sb.append(" label=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");    sb.append(" sections=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(sections)+"'\n");    sb.append("]\n");    return sb.toString();  }}