package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class CheckStatus_element implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public CheckStatus_element() {  }        /**   * element  : asyncProcessId of type {http://soap.sforce.com/2006/04/metadata}ID   * java type: java.lang.String[]   */  private static final com.sforce.ws.bind.TypeInfo asyncProcessId__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","asyncProcessId","http://soap.sforce.com/2006/04/metadata","ID",0,-1,true);  private boolean asyncProcessId__is_set = false;  private java.lang.String[] asyncProcessId = new java.lang.String[0];  public java.lang.String[] getAsyncProcessId() {    return asyncProcessId;  }    public void setAsyncProcessId(java.lang.String[] asyncProcessId) {    this.asyncProcessId = asyncProcessId;    asyncProcessId__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, asyncProcessId__typeInfo, asyncProcessId, asyncProcessId__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, asyncProcessId__typeInfo)) {      setAsyncProcessId((java.lang.String[])__typeMapper.readObject(__in, asyncProcessId__typeInfo, java.lang.String[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[CheckStatus_element ");        sb.append(" asyncProcessId=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(asyncProcessId)+"'\n");    sb.append("]\n");    return sb.toString();  }}