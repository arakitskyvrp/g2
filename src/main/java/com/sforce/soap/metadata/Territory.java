package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class Territory extends com.sforce.soap.metadata.RoleOrTerritory {  /**   * Constructor   */  public Territory() {  }        /**   * element  : parentTerritory of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo parentTerritory__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","parentTerritory","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean parentTerritory__is_set = false;  private java.lang.String parentTerritory;  public java.lang.String getParentTerritory() {    return parentTerritory;  }    public void setParentTerritory(java.lang.String parentTerritory) {    this.parentTerritory = parentTerritory;    parentTerritory__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Territory");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeString(__out, parentTerritory__typeInfo, parentTerritory, parentTerritory__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, parentTerritory__typeInfo)) {      setParentTerritory((java.lang.String)__typeMapper.readString(__in, parentTerritory__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[Territory ");    sb.append(super.toString());    sb.append(" parentTerritory=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(parentTerritory)+"'\n");    sb.append("]\n");    return sb.toString();  }}