package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class ObjectNameCaseValue implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public ObjectNameCaseValue() {  }        /**   * element  : article of type {http://soap.sforce.com/2006/04/metadata}Article   * java type: com.sforce.soap.metadata.Article   */  private static final com.sforce.ws.bind.TypeInfo article__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","article","http://soap.sforce.com/2006/04/metadata","Article",0,1,true);  private boolean article__is_set = false;  private com.sforce.soap.metadata.Article article;  public com.sforce.soap.metadata.Article getArticle() {    return article;  }    public void setArticle(com.sforce.soap.metadata.Article article) {    this.article = article;    article__is_set = true;  }    /**   * element  : caseType of type {http://soap.sforce.com/2006/04/metadata}CaseType   * java type: com.sforce.soap.metadata.CaseType   */  private static final com.sforce.ws.bind.TypeInfo caseType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","caseType","http://soap.sforce.com/2006/04/metadata","CaseType",0,1,true);  private boolean caseType__is_set = false;  private com.sforce.soap.metadata.CaseType caseType;  public com.sforce.soap.metadata.CaseType getCaseType() {    return caseType;  }    public void setCaseType(com.sforce.soap.metadata.CaseType caseType) {    this.caseType = caseType;    caseType__is_set = true;  }    /**   * element  : plural of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo plural__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","plural","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean plural__is_set = false;  private boolean plural;  public boolean getPlural() {    return plural;  }    public boolean isPlural() {    return plural;  }    public void setPlural(boolean plural) {    this.plural = plural;    plural__is_set = true;  }    /**   * element  : possessive of type {http://soap.sforce.com/2006/04/metadata}Possessive   * java type: com.sforce.soap.metadata.Possessive   */  private static final com.sforce.ws.bind.TypeInfo possessive__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","possessive","http://soap.sforce.com/2006/04/metadata","Possessive",0,1,true);  private boolean possessive__is_set = false;  private com.sforce.soap.metadata.Possessive possessive;  public com.sforce.soap.metadata.Possessive getPossessive() {    return possessive;  }    public void setPossessive(com.sforce.soap.metadata.Possessive possessive) {    this.possessive = possessive;    possessive__is_set = true;  }    /**   * element  : value of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo value__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","value","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean value__is_set = false;  private java.lang.String value;  public java.lang.String getValue() {    return value;  }    public void setValue(java.lang.String value) {    this.value = value;    value__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, article__typeInfo, article, article__is_set);    __typeMapper.writeObject(__out, caseType__typeInfo, caseType, caseType__is_set);    __typeMapper.writeBoolean(__out, plural__typeInfo, plural, plural__is_set);    __typeMapper.writeObject(__out, possessive__typeInfo, possessive, possessive__is_set);    __typeMapper.writeString(__out, value__typeInfo, value, value__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, article__typeInfo)) {      setArticle((com.sforce.soap.metadata.Article)__typeMapper.readObject(__in, article__typeInfo, com.sforce.soap.metadata.Article.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, caseType__typeInfo)) {      setCaseType((com.sforce.soap.metadata.CaseType)__typeMapper.readObject(__in, caseType__typeInfo, com.sforce.soap.metadata.CaseType.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, plural__typeInfo)) {      setPlural((boolean)__typeMapper.readBoolean(__in, plural__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, possessive__typeInfo)) {      setPossessive((com.sforce.soap.metadata.Possessive)__typeMapper.readObject(__in, possessive__typeInfo, com.sforce.soap.metadata.Possessive.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, value__typeInfo)) {      setValue((java.lang.String)__typeMapper.readString(__in, value__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[ObjectNameCaseValue ");        sb.append(" article=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(article)+"'\n");    sb.append(" caseType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(caseType)+"'\n");    sb.append(" plural=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(plural)+"'\n");    sb.append(" possessive=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(possessive)+"'\n");    sb.append(" value=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");    sb.append("]\n");    return sb.toString();  }}