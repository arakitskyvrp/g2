package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ReportGrouping implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ReportGrouping() {  }        /**   * element  : dateGranularity of type {http://soap.sforce.com/2006/04/metadata}UserDateGranularity   * java type: com.sforce.soap.metadata.UserDateGranularity   */  private static final com.sforce.ws.bind.TypeInfo dateGranularity__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dateGranularity","http://soap.sforce.com/2006/04/metadata","UserDateGranularity",0,1,true);  private boolean dateGranularity__is_set = false;  private com.sforce.soap.metadata.UserDateGranularity dateGranularity;  public com.sforce.soap.metadata.UserDateGranularity getDateGranularity() {    return dateGranularity;  }    public void setDateGranularity(com.sforce.soap.metadata.UserDateGranularity dateGranularity) {    this.dateGranularity = dateGranularity;    dateGranularity__is_set = true;  }    /**   * element  : field of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean field__is_set = false;  private java.lang.String field;  public java.lang.String getField() {    return field;  }    public void setField(java.lang.String field) {    this.field = field;    field__is_set = true;  }    /**   * element  : sortOrder of type {http://soap.sforce.com/2006/04/metadata}SortOrder   * java type: com.sforce.soap.metadata.SortOrder   */  private static final com.sforce.ws.bind.TypeInfo sortOrder__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sortOrder","http://soap.sforce.com/2006/04/metadata","SortOrder",1,1,true);  private boolean sortOrder__is_set = false;  private com.sforce.soap.metadata.SortOrder sortOrder;  public com.sforce.soap.metadata.SortOrder getSortOrder() {    return sortOrder;  }    public void setSortOrder(com.sforce.soap.metadata.SortOrder sortOrder) {    this.sortOrder = sortOrder;    sortOrder__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, dateGranularity__typeInfo, dateGranularity, dateGranularity__is_set);    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);    __typeMapper.writeObject(__out, sortOrder__typeInfo, sortOrder, sortOrder__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, dateGranularity__typeInfo)) {      setDateGranularity((com.sforce.soap.metadata.UserDateGranularity)__typeMapper.readObject(__in, dateGranularity__typeInfo, com.sforce.soap.metadata.UserDateGranularity.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, field__typeInfo)) {      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, sortOrder__typeInfo)) {      setSortOrder((com.sforce.soap.metadata.SortOrder)__typeMapper.readObject(__in, sortOrder__typeInfo, com.sforce.soap.metadata.SortOrder.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ReportGrouping ");        sb.append(" dateGranularity=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(dateGranularity)+"'\n");    sb.append(" field=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");    sb.append(" sortOrder=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortOrder)+"'\n");    sb.append("]\n");    return sb.toString();  }}