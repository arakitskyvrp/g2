package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class RetrieveMessage implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public RetrieveMessage() {  }        /**   * element  : fileName of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo fileName__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fileName","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean fileName__is_set = false;  private java.lang.String fileName;  public java.lang.String getFileName() {    return fileName;  }    public void setFileName(java.lang.String fileName) {    this.fileName = fileName;    fileName__is_set = true;  }    /**   * element  : problem of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo problem__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","problem","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean problem__is_set = false;  private java.lang.String problem;  public java.lang.String getProblem() {    return problem;  }    public void setProblem(java.lang.String problem) {    this.problem = problem;    problem__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeString(__out, fileName__typeInfo, fileName, fileName__is_set);    __typeMapper.writeString(__out, problem__typeInfo, problem, problem__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.verifyElement(__in, fileName__typeInfo)) {      setFileName((java.lang.String)__typeMapper.readString(__in, fileName__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, problem__typeInfo)) {      setProblem((java.lang.String)__typeMapper.readString(__in, problem__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[RetrieveMessage ");        sb.append(" fileName=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(fileName)+"'\n");    sb.append(" problem=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(problem)+"'\n");    sb.append("]\n");    return sb.toString();  }}