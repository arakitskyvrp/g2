package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ReportColumn implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ReportColumn() {  }        /**   * element  : aggregateTypes of type {http://soap.sforce.com/2006/04/metadata}ReportSummaryType   * java type: com.sforce.soap.metadata.ReportSummaryType[]   */  private static final com.sforce.ws.bind.TypeInfo aggregateTypes__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregateTypes","http://soap.sforce.com/2006/04/metadata","ReportSummaryType",0,-1,true);  private boolean aggregateTypes__is_set = false;  private com.sforce.soap.metadata.ReportSummaryType[] aggregateTypes = new com.sforce.soap.metadata.ReportSummaryType[0];  public com.sforce.soap.metadata.ReportSummaryType[] getAggregateTypes() {    return aggregateTypes;  }    public void setAggregateTypes(com.sforce.soap.metadata.ReportSummaryType[] aggregateTypes) {    this.aggregateTypes = aggregateTypes;    aggregateTypes__is_set = true;  }    /**   * element  : field of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean field__is_set = false;  private java.lang.String field;  public java.lang.String getField() {    return field;  }    public void setField(java.lang.String field) {    this.field = field;    field__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, aggregateTypes__typeInfo, aggregateTypes, aggregateTypes__is_set);    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, aggregateTypes__typeInfo)) {      setAggregateTypes((com.sforce.soap.metadata.ReportSummaryType[])__typeMapper.readObject(__in, aggregateTypes__typeInfo, com.sforce.soap.metadata.ReportSummaryType[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, field__typeInfo)) {      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ReportColumn ");        sb.append(" aggregateTypes=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(aggregateTypes)+"'\n");    sb.append(" field=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");    sb.append("]\n");    return sb.toString();  }}