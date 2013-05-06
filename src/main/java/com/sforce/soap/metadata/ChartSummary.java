package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ChartSummary implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ChartSummary() {  }        /**   * element  : aggregate of type {http://soap.sforce.com/2006/04/metadata}ReportSummaryType   * java type: com.sforce.soap.metadata.ReportSummaryType   */  private static final com.sforce.ws.bind.TypeInfo aggregate__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregate","http://soap.sforce.com/2006/04/metadata","ReportSummaryType",0,1,true);  private boolean aggregate__is_set = false;  private com.sforce.soap.metadata.ReportSummaryType aggregate;  public com.sforce.soap.metadata.ReportSummaryType getAggregate() {    return aggregate;  }    public void setAggregate(com.sforce.soap.metadata.ReportSummaryType aggregate) {    this.aggregate = aggregate;    aggregate__is_set = true;  }    /**   * element  : axisBinding of type {http://soap.sforce.com/2006/04/metadata}ChartAxis   * java type: com.sforce.soap.metadata.ChartAxis   */  private static final com.sforce.ws.bind.TypeInfo axisBinding__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","axisBinding","http://soap.sforce.com/2006/04/metadata","ChartAxis",0,1,true);  private boolean axisBinding__is_set = false;  private com.sforce.soap.metadata.ChartAxis axisBinding;  public com.sforce.soap.metadata.ChartAxis getAxisBinding() {    return axisBinding;  }    public void setAxisBinding(com.sforce.soap.metadata.ChartAxis axisBinding) {    this.axisBinding = axisBinding;    axisBinding__is_set = true;  }    /**   * element  : column of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo column__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","column","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean column__is_set = false;  private java.lang.String column;  public java.lang.String getColumn() {    return column;  }    public void setColumn(java.lang.String column) {    this.column = column;    column__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, aggregate__typeInfo, aggregate, aggregate__is_set);    __typeMapper.writeObject(__out, axisBinding__typeInfo, axisBinding, axisBinding__is_set);    __typeMapper.writeString(__out, column__typeInfo, column, column__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, aggregate__typeInfo)) {      setAggregate((com.sforce.soap.metadata.ReportSummaryType)__typeMapper.readObject(__in, aggregate__typeInfo, com.sforce.soap.metadata.ReportSummaryType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, axisBinding__typeInfo)) {      setAxisBinding((com.sforce.soap.metadata.ChartAxis)__typeMapper.readObject(__in, axisBinding__typeInfo, com.sforce.soap.metadata.ChartAxis.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, column__typeInfo)) {      setColumn((java.lang.String)__typeMapper.readString(__in, column__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ChartSummary ");        sb.append(" aggregate=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(aggregate)+"'\n");    sb.append(" axisBinding=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(axisBinding)+"'\n");    sb.append(" column=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(column)+"'\n");    sb.append("]\n");    return sb.toString();  }}