package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class DeployMessage implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public DeployMessage() {  }        /**   * element  : changed of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo changed__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","changed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean changed__is_set = false;  private boolean changed;  public boolean getChanged() {    return changed;  }    public boolean isChanged() {    return changed;  }    public void setChanged(boolean changed) {    this.changed = changed;    changed__is_set = true;  }    /**   * element  : columnNumber of type {http://www.w3.org/2001/XMLSchema}int   * java type: int   */  private static final com.sforce.ws.bind.TypeInfo columnNumber__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","columnNumber","http://www.w3.org/2001/XMLSchema","int",0,1,true);  private boolean columnNumber__is_set = false;  private int columnNumber;  public int getColumnNumber() {    return columnNumber;  }    public void setColumnNumber(int columnNumber) {    this.columnNumber = columnNumber;    columnNumber__is_set = true;  }    /**   * element  : created of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo created__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","created","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean created__is_set = false;  private boolean created;  public boolean getCreated() {    return created;  }    public boolean isCreated() {    return created;  }    public void setCreated(boolean created) {    this.created = created;    created__is_set = true;  }    /**   * element  : deleted of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo deleted__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","deleted","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean deleted__is_set = false;  private boolean deleted;  public boolean getDeleted() {    return deleted;  }    public boolean isDeleted() {    return deleted;  }    public void setDeleted(boolean deleted) {    this.deleted = deleted;    deleted__is_set = true;  }    /**   * element  : fileName of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo fileName__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fileName","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean fileName__is_set = false;  private java.lang.String fileName;  public java.lang.String getFileName() {    return fileName;  }    public void setFileName(java.lang.String fileName) {    this.fileName = fileName;    fileName__is_set = true;  }    /**   * element  : fullName of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo fullName__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fullName","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean fullName__is_set = false;  private java.lang.String fullName;  public java.lang.String getFullName() {    return fullName;  }    public void setFullName(java.lang.String fullName) {    this.fullName = fullName;    fullName__is_set = true;  }    /**   * element  : id of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo id__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","id","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean id__is_set = false;  private java.lang.String id;  public java.lang.String getId() {    return id;  }    public void setId(java.lang.String id) {    this.id = id;    id__is_set = true;  }    /**   * element  : lineNumber of type {http://www.w3.org/2001/XMLSchema}int   * java type: int   */  private static final com.sforce.ws.bind.TypeInfo lineNumber__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lineNumber","http://www.w3.org/2001/XMLSchema","int",0,1,true);  private boolean lineNumber__is_set = false;  private int lineNumber;  public int getLineNumber() {    return lineNumber;  }    public void setLineNumber(int lineNumber) {    this.lineNumber = lineNumber;    lineNumber__is_set = true;  }    /**   * element  : problem of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo problem__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","problem","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean problem__is_set = false;  private java.lang.String problem;  public java.lang.String getProblem() {    return problem;  }    public void setProblem(java.lang.String problem) {    this.problem = problem;    problem__is_set = true;  }    /**   * element  : problemType of type {http://soap.sforce.com/2006/04/metadata}DeployProblemType   * java type: com.sforce.soap.metadata.DeployProblemType   */  private static final com.sforce.ws.bind.TypeInfo problemType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","problemType","http://soap.sforce.com/2006/04/metadata","DeployProblemType",0,1,true);  private boolean problemType__is_set = false;  private com.sforce.soap.metadata.DeployProblemType problemType;  public com.sforce.soap.metadata.DeployProblemType getProblemType() {    return problemType;  }    public void setProblemType(com.sforce.soap.metadata.DeployProblemType problemType) {    this.problemType = problemType;    problemType__is_set = true;  }    /**   * element  : success of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo success__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);  private boolean success__is_set = false;  private boolean success;  public boolean getSuccess() {    return success;  }    public boolean isSuccess() {    return success;  }    public void setSuccess(boolean success) {    this.success = success;    success__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeBoolean(__out, changed__typeInfo, changed, changed__is_set);    __typeMapper.writeInt(__out, columnNumber__typeInfo, columnNumber, columnNumber__is_set);    __typeMapper.writeBoolean(__out, created__typeInfo, created, created__is_set);    __typeMapper.writeBoolean(__out, deleted__typeInfo, deleted, deleted__is_set);    __typeMapper.writeString(__out, fileName__typeInfo, fileName, fileName__is_set);    __typeMapper.writeString(__out, fullName__typeInfo, fullName, fullName__is_set);    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);    __typeMapper.writeInt(__out, lineNumber__typeInfo, lineNumber, lineNumber__is_set);    __typeMapper.writeString(__out, problem__typeInfo, problem, problem__is_set);    __typeMapper.writeObject(__out, problemType__typeInfo, problemType, problemType__is_set);    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.verifyElement(__in, changed__typeInfo)) {      setChanged((boolean)__typeMapper.readBoolean(__in, changed__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, columnNumber__typeInfo)) {      setColumnNumber((int)__typeMapper.readInt(__in, columnNumber__typeInfo, int.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, created__typeInfo)) {      setCreated((boolean)__typeMapper.readBoolean(__in, created__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, deleted__typeInfo)) {      setDeleted((boolean)__typeMapper.readBoolean(__in, deleted__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, fileName__typeInfo)) {      setFileName((java.lang.String)__typeMapper.readString(__in, fileName__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, fullName__typeInfo)) {      setFullName((java.lang.String)__typeMapper.readString(__in, fullName__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, id__typeInfo)) {      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, lineNumber__typeInfo)) {      setLineNumber((int)__typeMapper.readInt(__in, lineNumber__typeInfo, int.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, problem__typeInfo)) {      setProblem((java.lang.String)__typeMapper.readString(__in, problem__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, problemType__typeInfo)) {      setProblemType((com.sforce.soap.metadata.DeployProblemType)__typeMapper.readObject(__in, problemType__typeInfo, com.sforce.soap.metadata.DeployProblemType.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, success__typeInfo)) {      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[DeployMessage ");        sb.append(" changed=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(changed)+"'\n");    sb.append(" columnNumber=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(columnNumber)+"'\n");    sb.append(" created=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(created)+"'\n");    sb.append(" deleted=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(deleted)+"'\n");    sb.append(" fileName=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(fileName)+"'\n");    sb.append(" fullName=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(fullName)+"'\n");    sb.append(" id=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");    sb.append(" lineNumber=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(lineNumber)+"'\n");    sb.append(" problem=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(problem)+"'\n");    sb.append(" problemType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(problemType)+"'\n");    sb.append(" success=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");    sb.append("]\n");    return sb.toString();  }}