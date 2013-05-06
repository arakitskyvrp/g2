package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ReportBlockInfo implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ReportBlockInfo() {  }        /**   * element  : aggregateReferences of type {http://soap.sforce.com/2006/04/metadata}ReportAggregateReference   * java type: com.sforce.soap.metadata.ReportAggregateReference[]   */  private static final com.sforce.ws.bind.TypeInfo aggregateReferences__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregateReferences","http://soap.sforce.com/2006/04/metadata","ReportAggregateReference",0,-1,true);  private boolean aggregateReferences__is_set = false;  private com.sforce.soap.metadata.ReportAggregateReference[] aggregateReferences = new com.sforce.soap.metadata.ReportAggregateReference[0];  public com.sforce.soap.metadata.ReportAggregateReference[] getAggregateReferences() {    return aggregateReferences;  }    public void setAggregateReferences(com.sforce.soap.metadata.ReportAggregateReference[] aggregateReferences) {    this.aggregateReferences = aggregateReferences;    aggregateReferences__is_set = true;  }    /**   * element  : blockId of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo blockId__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","blockId","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean blockId__is_set = false;  private java.lang.String blockId;  public java.lang.String getBlockId() {    return blockId;  }    public void setBlockId(java.lang.String blockId) {    this.blockId = blockId;    blockId__is_set = true;  }    /**   * element  : joinTable of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo joinTable__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","joinTable","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean joinTable__is_set = false;  private java.lang.String joinTable;  public java.lang.String getJoinTable() {    return joinTable;  }    public void setJoinTable(java.lang.String joinTable) {    this.joinTable = joinTable;    joinTable__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, aggregateReferences__typeInfo, aggregateReferences, aggregateReferences__is_set);    __typeMapper.writeString(__out, blockId__typeInfo, blockId, blockId__is_set);    __typeMapper.writeString(__out, joinTable__typeInfo, joinTable, joinTable__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, aggregateReferences__typeInfo)) {      setAggregateReferences((com.sforce.soap.metadata.ReportAggregateReference[])__typeMapper.readObject(__in, aggregateReferences__typeInfo, com.sforce.soap.metadata.ReportAggregateReference[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, blockId__typeInfo)) {      setBlockId((java.lang.String)__typeMapper.readString(__in, blockId__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, joinTable__typeInfo)) {      setJoinTable((java.lang.String)__typeMapper.readString(__in, joinTable__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ReportBlockInfo ");        sb.append(" aggregateReferences=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(aggregateReferences)+"'\n");    sb.append(" blockId=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(blockId)+"'\n");    sb.append(" joinTable=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(joinTable)+"'\n");    sb.append("]\n");    return sb.toString();  }}