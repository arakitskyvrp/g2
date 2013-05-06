package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class AutoResponseRules extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public AutoResponseRules() {  }        /**   * element  : autoResponseRule of type {http://soap.sforce.com/2006/04/metadata}AutoResponseRule   * java type: com.sforce.soap.metadata.AutoResponseRule[]   */  private static final com.sforce.ws.bind.TypeInfo autoResponseRule__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","autoResponseRule","http://soap.sforce.com/2006/04/metadata","AutoResponseRule",0,-1,true);  private boolean autoResponseRule__is_set = false;  private com.sforce.soap.metadata.AutoResponseRule[] autoResponseRule = new com.sforce.soap.metadata.AutoResponseRule[0];  public com.sforce.soap.metadata.AutoResponseRule[] getAutoResponseRule() {    return autoResponseRule;  }    public void setAutoResponseRule(com.sforce.soap.metadata.AutoResponseRule[] autoResponseRule) {    this.autoResponseRule = autoResponseRule;    autoResponseRule__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "AutoResponseRules");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, autoResponseRule__typeInfo, autoResponseRule, autoResponseRule__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, autoResponseRule__typeInfo)) {      setAutoResponseRule((com.sforce.soap.metadata.AutoResponseRule[])__typeMapper.readObject(__in, autoResponseRule__typeInfo, com.sforce.soap.metadata.AutoResponseRule[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[AutoResponseRules ");    sb.append(super.toString());    sb.append(" autoResponseRule=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(autoResponseRule)+"'\n");    sb.append("]\n");    return sb.toString();  }}