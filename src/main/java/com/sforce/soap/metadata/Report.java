package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class Report extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public Report() {  }        /**   * element  : aggregates of type {http://soap.sforce.com/2006/04/metadata}ReportAggregate   * java type: com.sforce.soap.metadata.ReportAggregate[]   */  private static final com.sforce.ws.bind.TypeInfo aggregates__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregates","http://soap.sforce.com/2006/04/metadata","ReportAggregate",0,-1,true);  private boolean aggregates__is_set = false;  private com.sforce.soap.metadata.ReportAggregate[] aggregates = new com.sforce.soap.metadata.ReportAggregate[0];  public com.sforce.soap.metadata.ReportAggregate[] getAggregates() {    return aggregates;  }    public void setAggregates(com.sforce.soap.metadata.ReportAggregate[] aggregates) {    this.aggregates = aggregates;    aggregates__is_set = true;  }    /**   * element  : block of type {http://soap.sforce.com/2006/04/metadata}Report   * java type: com.sforce.soap.metadata.Report[]   */  private static final com.sforce.ws.bind.TypeInfo block__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","block","http://soap.sforce.com/2006/04/metadata","Report",0,-1,true);  private boolean block__is_set = false;  private com.sforce.soap.metadata.Report[] block = new com.sforce.soap.metadata.Report[0];  public com.sforce.soap.metadata.Report[] getBlock() {    return block;  }    public void setBlock(com.sforce.soap.metadata.Report[] block) {    this.block = block;    block__is_set = true;  }    /**   * element  : blockInfo of type {http://soap.sforce.com/2006/04/metadata}ReportBlockInfo   * java type: com.sforce.soap.metadata.ReportBlockInfo   */  private static final com.sforce.ws.bind.TypeInfo blockInfo__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","blockInfo","http://soap.sforce.com/2006/04/metadata","ReportBlockInfo",0,1,true);  private boolean blockInfo__is_set = false;  private com.sforce.soap.metadata.ReportBlockInfo blockInfo;  public com.sforce.soap.metadata.ReportBlockInfo getBlockInfo() {    return blockInfo;  }    public void setBlockInfo(com.sforce.soap.metadata.ReportBlockInfo blockInfo) {    this.blockInfo = blockInfo;    blockInfo__is_set = true;  }    /**   * element  : buckets of type {http://soap.sforce.com/2006/04/metadata}ReportBucketField   * java type: com.sforce.soap.metadata.ReportBucketField[]   */  private static final com.sforce.ws.bind.TypeInfo buckets__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","buckets","http://soap.sforce.com/2006/04/metadata","ReportBucketField",0,-1,true);  private boolean buckets__is_set = false;  private com.sforce.soap.metadata.ReportBucketField[] buckets = new com.sforce.soap.metadata.ReportBucketField[0];  public com.sforce.soap.metadata.ReportBucketField[] getBuckets() {    return buckets;  }    public void setBuckets(com.sforce.soap.metadata.ReportBucketField[] buckets) {    this.buckets = buckets;    buckets__is_set = true;  }    /**   * element  : chart of type {http://soap.sforce.com/2006/04/metadata}ReportChart   * java type: com.sforce.soap.metadata.ReportChart   */  private static final com.sforce.ws.bind.TypeInfo chart__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","chart","http://soap.sforce.com/2006/04/metadata","ReportChart",0,1,true);  private boolean chart__is_set = false;  private com.sforce.soap.metadata.ReportChart chart;  public com.sforce.soap.metadata.ReportChart getChart() {    return chart;  }    public void setChart(com.sforce.soap.metadata.ReportChart chart) {    this.chart = chart;    chart__is_set = true;  }    /**   * element  : colorRanges of type {http://soap.sforce.com/2006/04/metadata}ReportColorRange   * java type: com.sforce.soap.metadata.ReportColorRange[]   */  private static final com.sforce.ws.bind.TypeInfo colorRanges__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","colorRanges","http://soap.sforce.com/2006/04/metadata","ReportColorRange",0,-1,true);  private boolean colorRanges__is_set = false;  private com.sforce.soap.metadata.ReportColorRange[] colorRanges = new com.sforce.soap.metadata.ReportColorRange[0];  public com.sforce.soap.metadata.ReportColorRange[] getColorRanges() {    return colorRanges;  }    public void setColorRanges(com.sforce.soap.metadata.ReportColorRange[] colorRanges) {    this.colorRanges = colorRanges;    colorRanges__is_set = true;  }    /**   * element  : columns of type {http://soap.sforce.com/2006/04/metadata}ReportColumn   * java type: com.sforce.soap.metadata.ReportColumn[]   */  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","columns","http://soap.sforce.com/2006/04/metadata","ReportColumn",0,-1,true);  private boolean columns__is_set = false;  private com.sforce.soap.metadata.ReportColumn[] columns = new com.sforce.soap.metadata.ReportColumn[0];  public com.sforce.soap.metadata.ReportColumn[] getColumns() {    return columns;  }    public void setColumns(com.sforce.soap.metadata.ReportColumn[] columns) {    this.columns = columns;    columns__is_set = true;  }    /**   * element  : crossFilters of type {http://soap.sforce.com/2006/04/metadata}ReportCrossFilter   * java type: com.sforce.soap.metadata.ReportCrossFilter[]   */  private static final com.sforce.ws.bind.TypeInfo crossFilters__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","crossFilters","http://soap.sforce.com/2006/04/metadata","ReportCrossFilter",0,-1,true);  private boolean crossFilters__is_set = false;  private com.sforce.soap.metadata.ReportCrossFilter[] crossFilters = new com.sforce.soap.metadata.ReportCrossFilter[0];  public com.sforce.soap.metadata.ReportCrossFilter[] getCrossFilters() {    return crossFilters;  }    public void setCrossFilters(com.sforce.soap.metadata.ReportCrossFilter[] crossFilters) {    this.crossFilters = crossFilters;    crossFilters__is_set = true;  }    /**   * element  : currency of type {http://soap.sforce.com/2006/04/metadata}CurrencyIsoCode   * java type: com.sforce.soap.metadata.CurrencyIsoCode   */  private static final com.sforce.ws.bind.TypeInfo currency__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","currency","http://soap.sforce.com/2006/04/metadata","CurrencyIsoCode",0,1,true);  private boolean currency__is_set = false;  private com.sforce.soap.metadata.CurrencyIsoCode currency;  public com.sforce.soap.metadata.CurrencyIsoCode getCurrency() {    return currency;  }    public void setCurrency(com.sforce.soap.metadata.CurrencyIsoCode currency) {    this.currency = currency;    currency__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : division of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo division__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","division","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean division__is_set = false;  private java.lang.String division;  public java.lang.String getDivision() {    return division;  }    public void setDivision(java.lang.String division) {    this.division = division;    division__is_set = true;  }    /**   * element  : filter of type {http://soap.sforce.com/2006/04/metadata}ReportFilter   * java type: com.sforce.soap.metadata.ReportFilter   */  private static final com.sforce.ws.bind.TypeInfo filter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","filter","http://soap.sforce.com/2006/04/metadata","ReportFilter",0,1,true);  private boolean filter__is_set = false;  private com.sforce.soap.metadata.ReportFilter filter;  public com.sforce.soap.metadata.ReportFilter getFilter() {    return filter;  }    public void setFilter(com.sforce.soap.metadata.ReportFilter filter) {    this.filter = filter;    filter__is_set = true;  }    /**   * element  : format of type {http://soap.sforce.com/2006/04/metadata}ReportFormat   * java type: com.sforce.soap.metadata.ReportFormat   */  private static final com.sforce.ws.bind.TypeInfo format__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","format","http://soap.sforce.com/2006/04/metadata","ReportFormat",1,1,true);  private boolean format__is_set = false;  private com.sforce.soap.metadata.ReportFormat format;  public com.sforce.soap.metadata.ReportFormat getFormat() {    return format;  }    public void setFormat(com.sforce.soap.metadata.ReportFormat format) {    this.format = format;    format__is_set = true;  }    /**   * element  : groupingsAcross of type {http://soap.sforce.com/2006/04/metadata}ReportGrouping   * java type: com.sforce.soap.metadata.ReportGrouping[]   */  private static final com.sforce.ws.bind.TypeInfo groupingsAcross__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","groupingsAcross","http://soap.sforce.com/2006/04/metadata","ReportGrouping",0,-1,true);  private boolean groupingsAcross__is_set = false;  private com.sforce.soap.metadata.ReportGrouping[] groupingsAcross = new com.sforce.soap.metadata.ReportGrouping[0];  public com.sforce.soap.metadata.ReportGrouping[] getGroupingsAcross() {    return groupingsAcross;  }    public void setGroupingsAcross(com.sforce.soap.metadata.ReportGrouping[] groupingsAcross) {    this.groupingsAcross = groupingsAcross;    groupingsAcross__is_set = true;  }    /**   * element  : groupingsDown of type {http://soap.sforce.com/2006/04/metadata}ReportGrouping   * java type: com.sforce.soap.metadata.ReportGrouping[]   */  private static final com.sforce.ws.bind.TypeInfo groupingsDown__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","groupingsDown","http://soap.sforce.com/2006/04/metadata","ReportGrouping",0,-1,true);  private boolean groupingsDown__is_set = false;  private com.sforce.soap.metadata.ReportGrouping[] groupingsDown = new com.sforce.soap.metadata.ReportGrouping[0];  public com.sforce.soap.metadata.ReportGrouping[] getGroupingsDown() {    return groupingsDown;  }    public void setGroupingsDown(com.sforce.soap.metadata.ReportGrouping[] groupingsDown) {    this.groupingsDown = groupingsDown;    groupingsDown__is_set = true;  }    /**   * element  : name of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean name__is_set = false;  private java.lang.String name;  public java.lang.String getName() {    return name;  }    public void setName(java.lang.String name) {    this.name = name;    name__is_set = true;  }    /**   * element  : params of type {http://soap.sforce.com/2006/04/metadata}ReportParam   * java type: com.sforce.soap.metadata.ReportParam[]   */  private static final com.sforce.ws.bind.TypeInfo params__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","params","http://soap.sforce.com/2006/04/metadata","ReportParam",0,-1,true);  private boolean params__is_set = false;  private com.sforce.soap.metadata.ReportParam[] params = new com.sforce.soap.metadata.ReportParam[0];  public com.sforce.soap.metadata.ReportParam[] getParams() {    return params;  }    public void setParams(com.sforce.soap.metadata.ReportParam[] params) {    this.params = params;    params__is_set = true;  }    /**   * element  : reportType of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo reportType__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reportType","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean reportType__is_set = false;  private java.lang.String reportType;  public java.lang.String getReportType() {    return reportType;  }    public void setReportType(java.lang.String reportType) {    this.reportType = reportType;    reportType__is_set = true;  }    /**   * element  : roleHierarchyFilter of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo roleHierarchyFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","roleHierarchyFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean roleHierarchyFilter__is_set = false;  private java.lang.String roleHierarchyFilter;  public java.lang.String getRoleHierarchyFilter() {    return roleHierarchyFilter;  }    public void setRoleHierarchyFilter(java.lang.String roleHierarchyFilter) {    this.roleHierarchyFilter = roleHierarchyFilter;    roleHierarchyFilter__is_set = true;  }    /**   * element  : rowLimit of type {http://www.w3.org/2001/XMLSchema}int   * java type: int   */  private static final com.sforce.ws.bind.TypeInfo rowLimit__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","rowLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true);  private boolean rowLimit__is_set = false;  private int rowLimit;  public int getRowLimit() {    return rowLimit;  }    public void setRowLimit(int rowLimit) {    this.rowLimit = rowLimit;    rowLimit__is_set = true;  }    /**   * element  : scope of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo scope__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","scope","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean scope__is_set = false;  private java.lang.String scope;  public java.lang.String getScope() {    return scope;  }    public void setScope(java.lang.String scope) {    this.scope = scope;    scope__is_set = true;  }    /**   * element  : showDetails of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: boolean   */  private static final com.sforce.ws.bind.TypeInfo showDetails__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showDetails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean showDetails__is_set = false;  private boolean showDetails;  public boolean getShowDetails() {    return showDetails;  }    public boolean isShowDetails() {    return showDetails;  }    public void setShowDetails(boolean showDetails) {    this.showDetails = showDetails;    showDetails__is_set = true;  }    /**   * element  : sortColumn of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo sortColumn__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sortColumn","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean sortColumn__is_set = false;  private java.lang.String sortColumn;  public java.lang.String getSortColumn() {    return sortColumn;  }    public void setSortColumn(java.lang.String sortColumn) {    this.sortColumn = sortColumn;    sortColumn__is_set = true;  }    /**   * element  : sortOrder of type {http://soap.sforce.com/2006/04/metadata}SortOrder   * java type: com.sforce.soap.metadata.SortOrder   */  private static final com.sforce.ws.bind.TypeInfo sortOrder__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sortOrder","http://soap.sforce.com/2006/04/metadata","SortOrder",0,1,true);  private boolean sortOrder__is_set = false;  private com.sforce.soap.metadata.SortOrder sortOrder;  public com.sforce.soap.metadata.SortOrder getSortOrder() {    return sortOrder;  }    public void setSortOrder(com.sforce.soap.metadata.SortOrder sortOrder) {    this.sortOrder = sortOrder;    sortOrder__is_set = true;  }    /**   * element  : territoryHierarchyFilter of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo territoryHierarchyFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","territoryHierarchyFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean territoryHierarchyFilter__is_set = false;  private java.lang.String territoryHierarchyFilter;  public java.lang.String getTerritoryHierarchyFilter() {    return territoryHierarchyFilter;  }    public void setTerritoryHierarchyFilter(java.lang.String territoryHierarchyFilter) {    this.territoryHierarchyFilter = territoryHierarchyFilter;    territoryHierarchyFilter__is_set = true;  }    /**   * element  : timeFrameFilter of type {http://soap.sforce.com/2006/04/metadata}ReportTimeFrameFilter   * java type: com.sforce.soap.metadata.ReportTimeFrameFilter   */  private static final com.sforce.ws.bind.TypeInfo timeFrameFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","timeFrameFilter","http://soap.sforce.com/2006/04/metadata","ReportTimeFrameFilter",0,1,true);  private boolean timeFrameFilter__is_set = false;  private com.sforce.soap.metadata.ReportTimeFrameFilter timeFrameFilter;  public com.sforce.soap.metadata.ReportTimeFrameFilter getTimeFrameFilter() {    return timeFrameFilter;  }    public void setTimeFrameFilter(com.sforce.soap.metadata.ReportTimeFrameFilter timeFrameFilter) {    this.timeFrameFilter = timeFrameFilter;    timeFrameFilter__is_set = true;  }    /**   * element  : userFilter of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo userFilter__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean userFilter__is_set = false;  private java.lang.String userFilter;  public java.lang.String getUserFilter() {    return userFilter;  }    public void setUserFilter(java.lang.String userFilter) {    this.userFilter = userFilter;    userFilter__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Report");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, aggregates__typeInfo, aggregates, aggregates__is_set);    __typeMapper.writeObject(__out, block__typeInfo, block, block__is_set);    __typeMapper.writeObject(__out, blockInfo__typeInfo, blockInfo, blockInfo__is_set);    __typeMapper.writeObject(__out, buckets__typeInfo, buckets, buckets__is_set);    __typeMapper.writeObject(__out, chart__typeInfo, chart, chart__is_set);    __typeMapper.writeObject(__out, colorRanges__typeInfo, colorRanges, colorRanges__is_set);    __typeMapper.writeObject(__out, columns__typeInfo, columns, columns__is_set);    __typeMapper.writeObject(__out, crossFilters__typeInfo, crossFilters, crossFilters__is_set);    __typeMapper.writeObject(__out, currency__typeInfo, currency, currency__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeString(__out, division__typeInfo, division, division__is_set);    __typeMapper.writeObject(__out, filter__typeInfo, filter, filter__is_set);    __typeMapper.writeObject(__out, format__typeInfo, format, format__is_set);    __typeMapper.writeObject(__out, groupingsAcross__typeInfo, groupingsAcross, groupingsAcross__is_set);    __typeMapper.writeObject(__out, groupingsDown__typeInfo, groupingsDown, groupingsDown__is_set);    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);    __typeMapper.writeObject(__out, params__typeInfo, params, params__is_set);    __typeMapper.writeString(__out, reportType__typeInfo, reportType, reportType__is_set);    __typeMapper.writeString(__out, roleHierarchyFilter__typeInfo, roleHierarchyFilter, roleHierarchyFilter__is_set);    __typeMapper.writeInt(__out, rowLimit__typeInfo, rowLimit, rowLimit__is_set);    __typeMapper.writeString(__out, scope__typeInfo, scope, scope__is_set);    __typeMapper.writeBoolean(__out, showDetails__typeInfo, showDetails, showDetails__is_set);    __typeMapper.writeString(__out, sortColumn__typeInfo, sortColumn, sortColumn__is_set);    __typeMapper.writeObject(__out, sortOrder__typeInfo, sortOrder, sortOrder__is_set);    __typeMapper.writeString(__out, territoryHierarchyFilter__typeInfo, territoryHierarchyFilter, territoryHierarchyFilter__is_set);    __typeMapper.writeObject(__out, timeFrameFilter__typeInfo, timeFrameFilter, timeFrameFilter__is_set);    __typeMapper.writeString(__out, userFilter__typeInfo, userFilter, userFilter__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, aggregates__typeInfo)) {      setAggregates((com.sforce.soap.metadata.ReportAggregate[])__typeMapper.readObject(__in, aggregates__typeInfo, com.sforce.soap.metadata.ReportAggregate[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, block__typeInfo)) {      setBlock((com.sforce.soap.metadata.Report[])__typeMapper.readObject(__in, block__typeInfo, com.sforce.soap.metadata.Report[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, blockInfo__typeInfo)) {      setBlockInfo((com.sforce.soap.metadata.ReportBlockInfo)__typeMapper.readObject(__in, blockInfo__typeInfo, com.sforce.soap.metadata.ReportBlockInfo.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, buckets__typeInfo)) {      setBuckets((com.sforce.soap.metadata.ReportBucketField[])__typeMapper.readObject(__in, buckets__typeInfo, com.sforce.soap.metadata.ReportBucketField[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, chart__typeInfo)) {      setChart((com.sforce.soap.metadata.ReportChart)__typeMapper.readObject(__in, chart__typeInfo, com.sforce.soap.metadata.ReportChart.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, colorRanges__typeInfo)) {      setColorRanges((com.sforce.soap.metadata.ReportColorRange[])__typeMapper.readObject(__in, colorRanges__typeInfo, com.sforce.soap.metadata.ReportColorRange[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, columns__typeInfo)) {      setColumns((com.sforce.soap.metadata.ReportColumn[])__typeMapper.readObject(__in, columns__typeInfo, com.sforce.soap.metadata.ReportColumn[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, crossFilters__typeInfo)) {      setCrossFilters((com.sforce.soap.metadata.ReportCrossFilter[])__typeMapper.readObject(__in, crossFilters__typeInfo, com.sforce.soap.metadata.ReportCrossFilter[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, currency__typeInfo)) {      setCurrency((com.sforce.soap.metadata.CurrencyIsoCode)__typeMapper.readObject(__in, currency__typeInfo, com.sforce.soap.metadata.CurrencyIsoCode.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, division__typeInfo)) {      setDivision((java.lang.String)__typeMapper.readString(__in, division__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, filter__typeInfo)) {      setFilter((com.sforce.soap.metadata.ReportFilter)__typeMapper.readObject(__in, filter__typeInfo, com.sforce.soap.metadata.ReportFilter.class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, format__typeInfo)) {      setFormat((com.sforce.soap.metadata.ReportFormat)__typeMapper.readObject(__in, format__typeInfo, com.sforce.soap.metadata.ReportFormat.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, groupingsAcross__typeInfo)) {      setGroupingsAcross((com.sforce.soap.metadata.ReportGrouping[])__typeMapper.readObject(__in, groupingsAcross__typeInfo, com.sforce.soap.metadata.ReportGrouping[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, groupingsDown__typeInfo)) {      setGroupingsDown((com.sforce.soap.metadata.ReportGrouping[])__typeMapper.readObject(__in, groupingsDown__typeInfo, com.sforce.soap.metadata.ReportGrouping[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, name__typeInfo)) {      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, params__typeInfo)) {      setParams((com.sforce.soap.metadata.ReportParam[])__typeMapper.readObject(__in, params__typeInfo, com.sforce.soap.metadata.ReportParam[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, reportType__typeInfo)) {      setReportType((java.lang.String)__typeMapper.readString(__in, reportType__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, roleHierarchyFilter__typeInfo)) {      setRoleHierarchyFilter((java.lang.String)__typeMapper.readString(__in, roleHierarchyFilter__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, rowLimit__typeInfo)) {      setRowLimit((int)__typeMapper.readInt(__in, rowLimit__typeInfo, int.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, scope__typeInfo)) {      setScope((java.lang.String)__typeMapper.readString(__in, scope__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, showDetails__typeInfo)) {      setShowDetails((boolean)__typeMapper.readBoolean(__in, showDetails__typeInfo, boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, sortColumn__typeInfo)) {      setSortColumn((java.lang.String)__typeMapper.readString(__in, sortColumn__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, sortOrder__typeInfo)) {      setSortOrder((com.sforce.soap.metadata.SortOrder)__typeMapper.readObject(__in, sortOrder__typeInfo, com.sforce.soap.metadata.SortOrder.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, territoryHierarchyFilter__typeInfo)) {      setTerritoryHierarchyFilter((java.lang.String)__typeMapper.readString(__in, territoryHierarchyFilter__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, timeFrameFilter__typeInfo)) {      setTimeFrameFilter((com.sforce.soap.metadata.ReportTimeFrameFilter)__typeMapper.readObject(__in, timeFrameFilter__typeInfo, com.sforce.soap.metadata.ReportTimeFrameFilter.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, userFilter__typeInfo)) {      setUserFilter((java.lang.String)__typeMapper.readString(__in, userFilter__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[Report ");    sb.append(super.toString());    sb.append(" aggregates=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(aggregates)+"'\n");    sb.append(" block=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(block)+"'\n");    sb.append(" blockInfo=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(blockInfo)+"'\n");    sb.append(" buckets=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(buckets)+"'\n");    sb.append(" chart=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(chart)+"'\n");    sb.append(" colorRanges=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(colorRanges)+"'\n");    sb.append(" columns=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");    sb.append(" crossFilters=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(crossFilters)+"'\n");    sb.append(" currency=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(currency)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" division=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(division)+"'\n");    sb.append(" filter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(filter)+"'\n");    sb.append(" format=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(format)+"'\n");    sb.append(" groupingsAcross=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(groupingsAcross)+"'\n");    sb.append(" groupingsDown=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(groupingsDown)+"'\n");    sb.append(" name=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");    sb.append(" params=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(params)+"'\n");    sb.append(" reportType=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(reportType)+"'\n");    sb.append(" roleHierarchyFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(roleHierarchyFilter)+"'\n");    sb.append(" rowLimit=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(rowLimit)+"'\n");    sb.append(" scope=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(scope)+"'\n");    sb.append(" showDetails=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(showDetails)+"'\n");    sb.append(" sortColumn=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortColumn)+"'\n");    sb.append(" sortOrder=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortOrder)+"'\n");    sb.append(" territoryHierarchyFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(territoryHierarchyFilter)+"'\n");    sb.append(" timeFrameFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(timeFrameFilter)+"'\n");    sb.append(" userFilter=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(userFilter)+"'\n");    sb.append("]\n");    return sb.toString();  }}