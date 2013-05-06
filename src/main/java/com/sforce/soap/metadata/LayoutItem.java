package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class LayoutItem implements com.sforce.ws.bind.XMLizable {  /**   * Constructor   */  public LayoutItem() {  }        /**   * element  : behavior of type {http://soap.sforce.com/2006/04/metadata}UiBehavior   * java type: com.sforce.soap.metadata.UiBehavior   */  private static final com.sforce.ws.bind.TypeInfo behavior__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","behavior","http://soap.sforce.com/2006/04/metadata","UiBehavior",0,1,true);  private boolean behavior__is_set = false;  private com.sforce.soap.metadata.UiBehavior behavior;  public com.sforce.soap.metadata.UiBehavior getBehavior() {    return behavior;  }    public void setBehavior(com.sforce.soap.metadata.UiBehavior behavior) {    this.behavior = behavior;    behavior__is_set = true;  }    /**   * element  : customLink of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo customLink__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","customLink","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean customLink__is_set = false;  private java.lang.String customLink;  public java.lang.String getCustomLink() {    return customLink;  }    public void setCustomLink(java.lang.String customLink) {    this.customLink = customLink;    customLink__is_set = true;  }    /**   * element  : emptySpace of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo emptySpace__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emptySpace","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean emptySpace__is_set = false;  private boolean emptySpace;  public boolean getEmptySpace() {    return emptySpace;  }    public boolean isEmptySpace() {    return emptySpace;  }    public void setEmptySpace(boolean emptySpace) {    this.emptySpace = emptySpace;    emptySpace__is_set = true;  }    /**   * element  : field of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean field__is_set = false;  private java.lang.String field;  public java.lang.String getField() {    return field;  }    public void setField(java.lang.String field) {    this.field = field;    field__is_set = true;  }    /**   * element  : height of type {http://www.w3.org/2001/XMLSchema}int   * java type: int   */  private static final com.sforce.ws.bind.TypeInfo height__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","height","http://www.w3.org/2001/XMLSchema","int",0,1,true);  private boolean height__is_set = false;  private int height;  public int getHeight() {    return height;  }    public void setHeight(int height) {    this.height = height;    height__is_set = true;  }    /**   * element  : page of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo page__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","page","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean page__is_set = false;  private java.lang.String page;  public java.lang.String getPage() {    return page;  }    public void setPage(java.lang.String page) {    this.page = page;    page__is_set = true;  }    /**   * element  : scontrol of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo scontrol__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","scontrol","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean scontrol__is_set = false;  private java.lang.String scontrol;  public java.lang.String getScontrol() {    return scontrol;  }    public void setScontrol(java.lang.String scontrol) {    this.scontrol = scontrol;    scontrol__is_set = true;  }    /**   * element  : showLabel of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo showLabel__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showLabel","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean showLabel__is_set = false;  private boolean showLabel;  public boolean getShowLabel() {    return showLabel;  }    public boolean isShowLabel() {    return showLabel;  }    public void setShowLabel(boolean showLabel) {    this.showLabel = showLabel;    showLabel__is_set = true;  }    /**   * element  : showScrollbars of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo showScrollbars__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showScrollbars","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean showScrollbars__is_set = false;  private boolean showScrollbars;  public boolean getShowScrollbars() {    return showScrollbars;  }    public boolean isShowScrollbars() {    return showScrollbars;  }    public void setShowScrollbars(boolean showScrollbars) {    this.showScrollbars = showScrollbars;    showScrollbars__is_set = true;  }    /**   * element  : width of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo width__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","width","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean width__is_set = false;  private java.lang.String width;  public java.lang.String getWidth() {    return width;  }    public void setWidth(java.lang.String width) {    this.width = width;    width__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());        writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {       __typeMapper.writeObject(__out, behavior__typeInfo, behavior, behavior__is_set);    __typeMapper.writeString(__out, customLink__typeInfo, customLink, customLink__is_set);    __typeMapper.writeBoolean(__out, emptySpace__typeInfo, emptySpace, emptySpace__is_set);    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);    __typeMapper.writeInt(__out, height__typeInfo, height, height__is_set);    __typeMapper.writeString(__out, page__typeInfo, page, page__is_set);    __typeMapper.writeString(__out, scontrol__typeInfo, scontrol, scontrol__is_set);    __typeMapper.writeBoolean(__out, showLabel__typeInfo, showLabel, showLabel__is_set);    __typeMapper.writeBoolean(__out, showScrollbars__typeInfo, showScrollbars, showScrollbars__is_set);    __typeMapper.writeString(__out, width__typeInfo, width, width__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {       __in.peekTag();    if (__typeMapper.isElement(__in, behavior__typeInfo)) {      setBehavior((com.sforce.soap.metadata.UiBehavior)__typeMapper.readObject(__in, behavior__typeInfo, com.sforce.soap.metadata.UiBehavior.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, customLink__typeInfo)) {      setCustomLink((java.lang.String)__typeMapper.readString(__in, customLink__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, emptySpace__typeInfo)) {      setEmptySpace((boolean)__typeMapper.readBoolean(__in, emptySpace__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, field__typeInfo)) {      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, height__typeInfo)) {      setHeight((int)__typeMapper.readInt(__in, height__typeInfo, int.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, page__typeInfo)) {      setPage((java.lang.String)__typeMapper.readString(__in, page__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, scontrol__typeInfo)) {      setScontrol((java.lang.String)__typeMapper.readString(__in, scontrol__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, showLabel__typeInfo)) {      setShowLabel((boolean)__typeMapper.readBoolean(__in, showLabel__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, showScrollbars__typeInfo)) {      setShowScrollbars((boolean)__typeMapper.readBoolean(__in, showScrollbars__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, width__typeInfo)) {      setWidth((java.lang.String)__typeMapper.readString(__in, width__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[LayoutItem ");        sb.append(" behavior=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(behavior)+"'\n");    sb.append(" customLink=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(customLink)+"'\n");    sb.append(" emptySpace=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(emptySpace)+"'\n");    sb.append(" field=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");    sb.append(" height=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(height)+"'\n");    sb.append(" page=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(page)+"'\n");    sb.append(" scontrol=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(scontrol)+"'\n");    sb.append(" showLabel=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(showLabel)+"'\n");    sb.append(" showScrollbars=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(showScrollbars)+"'\n");    sb.append(" width=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(width)+"'\n");    sb.append("]\n");    return sb.toString();  }}