package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class WorkspaceMappings implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public WorkspaceMappings() {  }        /**   * element  : mapping of type {http://soap.sforce.com/2006/04/metadata}WorkspaceMapping   * java type: com.sforce.soap.metadata.WorkspaceMapping[]   */  private static final com.sforce.ws.bind.TypeInfo mapping__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","mapping","http://soap.sforce.com/2006/04/metadata","WorkspaceMapping",0,-1,true);  private boolean mapping__is_set = false;  private com.sforce.soap.metadata.WorkspaceMapping[] mapping = new com.sforce.soap.metadata.WorkspaceMapping[0];  public com.sforce.soap.metadata.WorkspaceMapping[] getMapping() {    return mapping;  }    public void setMapping(com.sforce.soap.metadata.WorkspaceMapping[] mapping) {    this.mapping = mapping;    mapping__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, mapping__typeInfo, mapping, mapping__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, mapping__typeInfo)) {      setMapping((com.sforce.soap.metadata.WorkspaceMapping[])__typeMapper.readObject(__in, mapping__typeInfo, com.sforce.soap.metadata.WorkspaceMapping[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[WorkspaceMappings ");        sb.append(" mapping=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(mapping)+"'\n");    sb.append("]\n");    return sb.toString();  }}