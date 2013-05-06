package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class FlowElementReferenceOrValue implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public FlowElementReferenceOrValue() {  }        /**   * element  : booleanValue of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo booleanValue__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","booleanValue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean booleanValue__is_set = false;  private boolean booleanValue;  public boolean getBooleanValue() {    return booleanValue;  }    public boolean isBooleanValue() {    return booleanValue;  }    public void setBooleanValue(boolean booleanValue) {    this.booleanValue = booleanValue;    booleanValue__is_set = true;  }    /**   * element  : dateValue of type {http://www.w3.org/2001/XMLSchema}date   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo dateValue__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dateValue","http://www.w3.org/2001/XMLSchema","date",0,1,true);  private boolean dateValue__is_set = false;  private java.util.Calendar dateValue;  public java.util.Calendar getDateValue() {    return dateValue;  }    public void setDateValue(java.util.Calendar dateValue) {    this.dateValue = dateValue;    dateValue__is_set = true;  }    /**   * element  : elementReference of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo elementReference__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","elementReference","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean elementReference__is_set = false;  private java.lang.String elementReference;  public java.lang.String getElementReference() {    return elementReference;  }    public void setElementReference(java.lang.String elementReference) {    this.elementReference = elementReference;    elementReference__is_set = true;  }    /**   * element  : numberValue of type {http://www.w3.org/2001/XMLSchema}double   * java type: double   */  private static final com.sforce.ws.bind.TypeInfo numberValue__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","numberValue","http://www.w3.org/2001/XMLSchema","double",0,1,true);  private boolean numberValue__is_set = false;  private double numberValue;  public double getNumberValue() {    return numberValue;  }    public void setNumberValue(double numberValue) {    this.numberValue = numberValue;    numberValue__is_set = true;  }    /**   * element  : stringValue of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo stringValue__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","stringValue","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean stringValue__is_set = false;  private java.lang.String stringValue;  public java.lang.String getStringValue() {    return stringValue;  }    public void setStringValue(java.lang.String stringValue) {    this.stringValue = stringValue;    stringValue__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeBoolean(__out, booleanValue__typeInfo, booleanValue, booleanValue__is_set);    __typeMapper.writeObject(__out, dateValue__typeInfo, dateValue, dateValue__is_set);    __typeMapper.writeString(__out, elementReference__typeInfo, elementReference, elementReference__is_set);    __typeMapper.writeDouble(__out, numberValue__typeInfo, numberValue, numberValue__is_set);    __typeMapper.writeString(__out, stringValue__typeInfo, stringValue, stringValue__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, booleanValue__typeInfo)) {      setBooleanValue((boolean)__typeMapper.readBoolean(__in, booleanValue__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, dateValue__typeInfo)) {      setDateValue((java.util.Calendar)__typeMapper.readObject(__in, dateValue__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, elementReference__typeInfo)) {      setElementReference((java.lang.String)__typeMapper.readString(__in, elementReference__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, numberValue__typeInfo)) {      setNumberValue((double)__typeMapper.readDouble(__in, numberValue__typeInfo, double.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, stringValue__typeInfo)) {      setStringValue((java.lang.String)__typeMapper.readString(__in, stringValue__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[FlowElementReferenceOrValue ");        sb.append(" booleanValue=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(booleanValue)+"'\n");    sb.append(" dateValue=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(dateValue)+"'\n");    sb.append(" elementReference=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(elementReference)+"'\n");    sb.append(" numberValue=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(numberValue)+"'\n");    sb.append(" stringValue=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(stringValue)+"'\n");    sb.append("]\n");    return sb.toString();  }}