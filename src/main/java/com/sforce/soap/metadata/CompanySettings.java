package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class CompanySettings extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public CompanySettings() {  }        /**   * element  : fiscalYear of type {http://soap.sforce.com/2006/04/metadata}FiscalYearSettings   * java type: com.sforce.soap.metadata.FiscalYearSettings   */  private static final com.sforce.ws.bind.TypeInfo fiscalYear__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fiscalYear","http://soap.sforce.com/2006/04/metadata","FiscalYearSettings",0,1,true);  private boolean fiscalYear__is_set = false;  private com.sforce.soap.metadata.FiscalYearSettings fiscalYear;  public com.sforce.soap.metadata.FiscalYearSettings getFiscalYear() {    return fiscalYear;  }    public void setFiscalYear(com.sforce.soap.metadata.FiscalYearSettings fiscalYear) {    this.fiscalYear = fiscalYear;    fiscalYear__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "CompanySettings");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, fiscalYear__typeInfo, fiscalYear, fiscalYear__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, fiscalYear__typeInfo)) {      setFiscalYear((com.sforce.soap.metadata.FiscalYearSettings)__typeMapper.readObject(__in, fiscalYear__typeInfo, com.sforce.soap.metadata.FiscalYearSettings.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[CompanySettings ");    sb.append(super.toString());    sb.append(" fiscalYear=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(fiscalYear)+"'\n");    sb.append("]\n");    return sb.toString();  }}