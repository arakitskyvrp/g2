package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ApexClass extends com.sforce.soap.metadata.MetadataWithContent {  /**   * Constructor   */  public ApexClass() {  }        /**   * element  : apiVersion of type {http://www.w3.org/2001/XMLSchema}double   * java type: double   */  private static final com.sforce.ws.bind.TypeInfo apiVersion__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","apiVersion","http://www.w3.org/2001/XMLSchema","double",1,1,true);  private boolean apiVersion__is_set = false;  private double apiVersion;  public double getApiVersion() {    return apiVersion;  }    public void setApiVersion(double apiVersion) {    this.apiVersion = apiVersion;    apiVersion__is_set = true;  }    /**   * element  : packageVersions of type {http://soap.sforce.com/2006/04/metadata}PackageVersion   * java type: com.sforce.soap.metadata.PackageVersion[]   */  private static final com.sforce.ws.bind.TypeInfo packageVersions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","packageVersions","http://soap.sforce.com/2006/04/metadata","PackageVersion",0,-1,true);  private boolean packageVersions__is_set = false;  private com.sforce.soap.metadata.PackageVersion[] packageVersions = new com.sforce.soap.metadata.PackageVersion[0];  public com.sforce.soap.metadata.PackageVersion[] getPackageVersions() {    return packageVersions;  }    public void setPackageVersions(com.sforce.soap.metadata.PackageVersion[] packageVersions) {    this.packageVersions = packageVersions;    packageVersions__is_set = true;  }    /**   * element  : status of type {http://soap.sforce.com/2006/04/metadata}ApexCodeUnitStatus   * java type: com.sforce.soap.metadata.ApexCodeUnitStatus   */  private static final com.sforce.ws.bind.TypeInfo status__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","status","http://soap.sforce.com/2006/04/metadata","ApexCodeUnitStatus",1,1,true);  private boolean status__is_set = false;  private com.sforce.soap.metadata.ApexCodeUnitStatus status;  public com.sforce.soap.metadata.ApexCodeUnitStatus getStatus() {    return status;  }    public void setStatus(com.sforce.soap.metadata.ApexCodeUnitStatus status) {    this.status = status;    status__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "ApexClass");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeDouble(__out, apiVersion__typeInfo, apiVersion, apiVersion__is_set);    __typeMapper.writeObject(__out, packageVersions__typeInfo, packageVersions, packageVersions__is_set);    __typeMapper.writeObject(__out, status__typeInfo, status, status__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.verifyElement(__in, apiVersion__typeInfo)) {      setApiVersion((double)__typeMapper.readDouble(__in, apiVersion__typeInfo, double.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, packageVersions__typeInfo)) {      setPackageVersions((com.sforce.soap.metadata.PackageVersion[])__typeMapper.readObject(__in, packageVersions__typeInfo, com.sforce.soap.metadata.PackageVersion[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, status__typeInfo)) {      setStatus((com.sforce.soap.metadata.ApexCodeUnitStatus)__typeMapper.readObject(__in, status__typeInfo, com.sforce.soap.metadata.ApexCodeUnitStatus.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ApexClass ");    sb.append(super.toString());    sb.append(" apiVersion=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(apiVersion)+"'\n");    sb.append(" packageVersions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(packageVersions)+"'\n");    sb.append(" status=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(status)+"'\n");    sb.append("]\n");    return sb.toString();  }}