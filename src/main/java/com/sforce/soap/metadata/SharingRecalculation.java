package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class SharingRecalculation implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public SharingRecalculation() {  }        /**   * element  : className of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo className__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","className","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean className__is_set = false;  private java.lang.String className;  public java.lang.String getClassName() {    return className;  }    public void setClassName(java.lang.String className) {    this.className = className;    className__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeString(__out, className__typeInfo, className, className__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.verifyElement(__in, className__typeInfo)) {      setClassName((java.lang.String)__typeMapper.readString(__in, className__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[SharingRecalculation ");        sb.append(" className=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(className)+"'\n");    sb.append("]\n");    return sb.toString();  }}