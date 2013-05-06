package com.sforce.soap.metadata;/** * Generated class, please do not edit. */public class Flow extends com.sforce.soap.metadata.Metadata {  /**   * Constructor   */  public Flow() {  }        /**   * element  : apexPluginCalls of type {http://soap.sforce.com/2006/04/metadata}FlowApexPluginCall   * java type: com.sforce.soap.metadata.FlowApexPluginCall[]   */  private static final com.sforce.ws.bind.TypeInfo apexPluginCalls__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","apexPluginCalls","http://soap.sforce.com/2006/04/metadata","FlowApexPluginCall",0,-1,true);  private boolean apexPluginCalls__is_set = false;  private com.sforce.soap.metadata.FlowApexPluginCall[] apexPluginCalls = new com.sforce.soap.metadata.FlowApexPluginCall[0];  public com.sforce.soap.metadata.FlowApexPluginCall[] getApexPluginCalls() {    return apexPluginCalls;  }    public void setApexPluginCalls(com.sforce.soap.metadata.FlowApexPluginCall[] apexPluginCalls) {    this.apexPluginCalls = apexPluginCalls;    apexPluginCalls__is_set = true;  }    /**   * element  : assignments of type {http://soap.sforce.com/2006/04/metadata}FlowAssignment   * java type: com.sforce.soap.metadata.FlowAssignment[]   */  private static final com.sforce.ws.bind.TypeInfo assignments__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignments","http://soap.sforce.com/2006/04/metadata","FlowAssignment",0,-1,true);  private boolean assignments__is_set = false;  private com.sforce.soap.metadata.FlowAssignment[] assignments = new com.sforce.soap.metadata.FlowAssignment[0];  public com.sforce.soap.metadata.FlowAssignment[] getAssignments() {    return assignments;  }    public void setAssignments(com.sforce.soap.metadata.FlowAssignment[] assignments) {    this.assignments = assignments;    assignments__is_set = true;  }    /**   * element  : choices of type {http://soap.sforce.com/2006/04/metadata}FlowChoice   * java type: com.sforce.soap.metadata.FlowChoice[]   */  private static final com.sforce.ws.bind.TypeInfo choices__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","choices","http://soap.sforce.com/2006/04/metadata","FlowChoice",0,-1,true);  private boolean choices__is_set = false;  private com.sforce.soap.metadata.FlowChoice[] choices = new com.sforce.soap.metadata.FlowChoice[0];  public com.sforce.soap.metadata.FlowChoice[] getChoices() {    return choices;  }    public void setChoices(com.sforce.soap.metadata.FlowChoice[] choices) {    this.choices = choices;    choices__is_set = true;  }    /**   * element  : constants of type {http://soap.sforce.com/2006/04/metadata}FlowConstant   * java type: com.sforce.soap.metadata.FlowConstant[]   */  private static final com.sforce.ws.bind.TypeInfo constants__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","constants","http://soap.sforce.com/2006/04/metadata","FlowConstant",0,-1,true);  private boolean constants__is_set = false;  private com.sforce.soap.metadata.FlowConstant[] constants = new com.sforce.soap.metadata.FlowConstant[0];  public com.sforce.soap.metadata.FlowConstant[] getConstants() {    return constants;  }    public void setConstants(com.sforce.soap.metadata.FlowConstant[] constants) {    this.constants = constants;    constants__is_set = true;  }    /**   * element  : decisions of type {http://soap.sforce.com/2006/04/metadata}FlowDecision   * java type: com.sforce.soap.metadata.FlowDecision[]   */  private static final com.sforce.ws.bind.TypeInfo decisions__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","decisions","http://soap.sforce.com/2006/04/metadata","FlowDecision",0,-1,true);  private boolean decisions__is_set = false;  private com.sforce.soap.metadata.FlowDecision[] decisions = new com.sforce.soap.metadata.FlowDecision[0];  public com.sforce.soap.metadata.FlowDecision[] getDecisions() {    return decisions;  }    public void setDecisions(com.sforce.soap.metadata.FlowDecision[] decisions) {    this.decisions = decisions;    decisions__is_set = true;  }    /**   * element  : description of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean description__is_set = false;  private java.lang.String description;  public java.lang.String getDescription() {    return description;  }    public void setDescription(java.lang.String description) {    this.description = description;    description__is_set = true;  }    /**   * element  : dynamicChoiceSets of type {http://soap.sforce.com/2006/04/metadata}FlowDynamicChoiceSet   * java type: com.sforce.soap.metadata.FlowDynamicChoiceSet[]   */  private static final com.sforce.ws.bind.TypeInfo dynamicChoiceSets__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dynamicChoiceSets","http://soap.sforce.com/2006/04/metadata","FlowDynamicChoiceSet",0,-1,true);  private boolean dynamicChoiceSets__is_set = false;  private com.sforce.soap.metadata.FlowDynamicChoiceSet[] dynamicChoiceSets = new com.sforce.soap.metadata.FlowDynamicChoiceSet[0];  public com.sforce.soap.metadata.FlowDynamicChoiceSet[] getDynamicChoiceSets() {    return dynamicChoiceSets;  }    public void setDynamicChoiceSets(com.sforce.soap.metadata.FlowDynamicChoiceSet[] dynamicChoiceSets) {    this.dynamicChoiceSets = dynamicChoiceSets;    dynamicChoiceSets__is_set = true;  }    /**   * element  : formulas of type {http://soap.sforce.com/2006/04/metadata}FlowFormula   * java type: com.sforce.soap.metadata.FlowFormula[]   */  private static final com.sforce.ws.bind.TypeInfo formulas__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","formulas","http://soap.sforce.com/2006/04/metadata","FlowFormula",0,-1,true);  private boolean formulas__is_set = false;  private com.sforce.soap.metadata.FlowFormula[] formulas = new com.sforce.soap.metadata.FlowFormula[0];  public com.sforce.soap.metadata.FlowFormula[] getFormulas() {    return formulas;  }    public void setFormulas(com.sforce.soap.metadata.FlowFormula[] formulas) {    this.formulas = formulas;    formulas__is_set = true;  }    /**   * element  : label of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);  private boolean label__is_set = false;  private java.lang.String label;  public java.lang.String getLabel() {    return label;  }    public void setLabel(java.lang.String label) {    this.label = label;    label__is_set = true;  }    /**   * element  : recordCreates of type {http://soap.sforce.com/2006/04/metadata}FlowRecordCreate   * java type: com.sforce.soap.metadata.FlowRecordCreate[]   */  private static final com.sforce.ws.bind.TypeInfo recordCreates__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recordCreates","http://soap.sforce.com/2006/04/metadata","FlowRecordCreate",0,-1,true);  private boolean recordCreates__is_set = false;  private com.sforce.soap.metadata.FlowRecordCreate[] recordCreates = new com.sforce.soap.metadata.FlowRecordCreate[0];  public com.sforce.soap.metadata.FlowRecordCreate[] getRecordCreates() {    return recordCreates;  }    public void setRecordCreates(com.sforce.soap.metadata.FlowRecordCreate[] recordCreates) {    this.recordCreates = recordCreates;    recordCreates__is_set = true;  }    /**   * element  : recordDeletes of type {http://soap.sforce.com/2006/04/metadata}FlowRecordDelete   * java type: com.sforce.soap.metadata.FlowRecordDelete[]   */  private static final com.sforce.ws.bind.TypeInfo recordDeletes__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recordDeletes","http://soap.sforce.com/2006/04/metadata","FlowRecordDelete",0,-1,true);  private boolean recordDeletes__is_set = false;  private com.sforce.soap.metadata.FlowRecordDelete[] recordDeletes = new com.sforce.soap.metadata.FlowRecordDelete[0];  public com.sforce.soap.metadata.FlowRecordDelete[] getRecordDeletes() {    return recordDeletes;  }    public void setRecordDeletes(com.sforce.soap.metadata.FlowRecordDelete[] recordDeletes) {    this.recordDeletes = recordDeletes;    recordDeletes__is_set = true;  }    /**   * element  : recordLookups of type {http://soap.sforce.com/2006/04/metadata}FlowRecordLookup   * java type: com.sforce.soap.metadata.FlowRecordLookup[]   */  private static final com.sforce.ws.bind.TypeInfo recordLookups__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recordLookups","http://soap.sforce.com/2006/04/metadata","FlowRecordLookup",0,-1,true);  private boolean recordLookups__is_set = false;  private com.sforce.soap.metadata.FlowRecordLookup[] recordLookups = new com.sforce.soap.metadata.FlowRecordLookup[0];  public com.sforce.soap.metadata.FlowRecordLookup[] getRecordLookups() {    return recordLookups;  }    public void setRecordLookups(com.sforce.soap.metadata.FlowRecordLookup[] recordLookups) {    this.recordLookups = recordLookups;    recordLookups__is_set = true;  }    /**   * element  : recordUpdates of type {http://soap.sforce.com/2006/04/metadata}FlowRecordUpdate   * java type: com.sforce.soap.metadata.FlowRecordUpdate[]   */  private static final com.sforce.ws.bind.TypeInfo recordUpdates__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recordUpdates","http://soap.sforce.com/2006/04/metadata","FlowRecordUpdate",0,-1,true);  private boolean recordUpdates__is_set = false;  private com.sforce.soap.metadata.FlowRecordUpdate[] recordUpdates = new com.sforce.soap.metadata.FlowRecordUpdate[0];  public com.sforce.soap.metadata.FlowRecordUpdate[] getRecordUpdates() {    return recordUpdates;  }    public void setRecordUpdates(com.sforce.soap.metadata.FlowRecordUpdate[] recordUpdates) {    this.recordUpdates = recordUpdates;    recordUpdates__is_set = true;  }    /**   * element  : screens of type {http://soap.sforce.com/2006/04/metadata}FlowScreen   * java type: com.sforce.soap.metadata.FlowScreen[]   */  private static final com.sforce.ws.bind.TypeInfo screens__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","screens","http://soap.sforce.com/2006/04/metadata","FlowScreen",0,-1,true);  private boolean screens__is_set = false;  private com.sforce.soap.metadata.FlowScreen[] screens = new com.sforce.soap.metadata.FlowScreen[0];  public com.sforce.soap.metadata.FlowScreen[] getScreens() {    return screens;  }    public void setScreens(com.sforce.soap.metadata.FlowScreen[] screens) {    this.screens = screens;    screens__is_set = true;  }    /**   * element  : startElementReference of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo startElementReference__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","startElementReference","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean startElementReference__is_set = false;  private java.lang.String startElementReference;  public java.lang.String getStartElementReference() {    return startElementReference;  }    public void setStartElementReference(java.lang.String startElementReference) {    this.startElementReference = startElementReference;    startElementReference__is_set = true;  }    /**   * element  : steps of type {http://soap.sforce.com/2006/04/metadata}FlowStep   * java type: com.sforce.soap.metadata.FlowStep[]   */  private static final com.sforce.ws.bind.TypeInfo steps__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","steps","http://soap.sforce.com/2006/04/metadata","FlowStep",0,-1,true);  private boolean steps__is_set = false;  private com.sforce.soap.metadata.FlowStep[] steps = new com.sforce.soap.metadata.FlowStep[0];  public com.sforce.soap.metadata.FlowStep[] getSteps() {    return steps;  }    public void setSteps(com.sforce.soap.metadata.FlowStep[] steps) {    this.steps = steps;    steps__is_set = true;  }    /**   * element  : subflows of type {http://soap.sforce.com/2006/04/metadata}FlowSubflow   * java type: com.sforce.soap.metadata.FlowSubflow[]   */  private static final com.sforce.ws.bind.TypeInfo subflows__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","subflows","http://soap.sforce.com/2006/04/metadata","FlowSubflow",0,-1,true);  private boolean subflows__is_set = false;  private com.sforce.soap.metadata.FlowSubflow[] subflows = new com.sforce.soap.metadata.FlowSubflow[0];  public com.sforce.soap.metadata.FlowSubflow[] getSubflows() {    return subflows;  }    public void setSubflows(com.sforce.soap.metadata.FlowSubflow[] subflows) {    this.subflows = subflows;    subflows__is_set = true;  }    /**   * element  : textTemplates of type {http://soap.sforce.com/2006/04/metadata}FlowTextTemplate   * java type: com.sforce.soap.metadata.FlowTextTemplate[]   */  private static final com.sforce.ws.bind.TypeInfo textTemplates__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","textTemplates","http://soap.sforce.com/2006/04/metadata","FlowTextTemplate",0,-1,true);  private boolean textTemplates__is_set = false;  private com.sforce.soap.metadata.FlowTextTemplate[] textTemplates = new com.sforce.soap.metadata.FlowTextTemplate[0];  public com.sforce.soap.metadata.FlowTextTemplate[] getTextTemplates() {    return textTemplates;  }    public void setTextTemplates(com.sforce.soap.metadata.FlowTextTemplate[] textTemplates) {    this.textTemplates = textTemplates;    textTemplates__is_set = true;  }    /**   * element  : variables of type {http://soap.sforce.com/2006/04/metadata}FlowVariable   * java type: com.sforce.soap.metadata.FlowVariable[]   */  private static final com.sforce.ws.bind.TypeInfo variables__typeInfo =    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","variables","http://soap.sforce.com/2006/04/metadata","FlowVariable",0,-1,true);  private boolean variables__is_set = false;  private com.sforce.soap.metadata.FlowVariable[] variables = new com.sforce.soap.metadata.FlowVariable[0];  public com.sforce.soap.metadata.FlowVariable[] getVariables() {    return variables;  }    public void setVariables(com.sforce.soap.metadata.FlowVariable[] variables) {    this.variables = variables;    variables__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Flow");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, apexPluginCalls__typeInfo, apexPluginCalls, apexPluginCalls__is_set);    __typeMapper.writeObject(__out, assignments__typeInfo, assignments, assignments__is_set);    __typeMapper.writeObject(__out, choices__typeInfo, choices, choices__is_set);    __typeMapper.writeObject(__out, constants__typeInfo, constants, constants__is_set);    __typeMapper.writeObject(__out, decisions__typeInfo, decisions, decisions__is_set);    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);    __typeMapper.writeObject(__out, dynamicChoiceSets__typeInfo, dynamicChoiceSets, dynamicChoiceSets__is_set);    __typeMapper.writeObject(__out, formulas__typeInfo, formulas, formulas__is_set);    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);    __typeMapper.writeObject(__out, recordCreates__typeInfo, recordCreates, recordCreates__is_set);    __typeMapper.writeObject(__out, recordDeletes__typeInfo, recordDeletes, recordDeletes__is_set);    __typeMapper.writeObject(__out, recordLookups__typeInfo, recordLookups, recordLookups__is_set);    __typeMapper.writeObject(__out, recordUpdates__typeInfo, recordUpdates, recordUpdates__is_set);    __typeMapper.writeObject(__out, screens__typeInfo, screens, screens__is_set);    __typeMapper.writeString(__out, startElementReference__typeInfo, startElementReference, startElementReference__is_set);    __typeMapper.writeObject(__out, steps__typeInfo, steps, steps__is_set);    __typeMapper.writeObject(__out, subflows__typeInfo, subflows, subflows__is_set);    __typeMapper.writeObject(__out, textTemplates__typeInfo, textTemplates, textTemplates__is_set);    __typeMapper.writeObject(__out, variables__typeInfo, variables, variables__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, apexPluginCalls__typeInfo)) {      setApexPluginCalls((com.sforce.soap.metadata.FlowApexPluginCall[])__typeMapper.readObject(__in, apexPluginCalls__typeInfo, com.sforce.soap.metadata.FlowApexPluginCall[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, assignments__typeInfo)) {      setAssignments((com.sforce.soap.metadata.FlowAssignment[])__typeMapper.readObject(__in, assignments__typeInfo, com.sforce.soap.metadata.FlowAssignment[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, choices__typeInfo)) {      setChoices((com.sforce.soap.metadata.FlowChoice[])__typeMapper.readObject(__in, choices__typeInfo, com.sforce.soap.metadata.FlowChoice[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, constants__typeInfo)) {      setConstants((com.sforce.soap.metadata.FlowConstant[])__typeMapper.readObject(__in, constants__typeInfo, com.sforce.soap.metadata.FlowConstant[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, decisions__typeInfo)) {      setDecisions((com.sforce.soap.metadata.FlowDecision[])__typeMapper.readObject(__in, decisions__typeInfo, com.sforce.soap.metadata.FlowDecision[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, description__typeInfo)) {      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, dynamicChoiceSets__typeInfo)) {      setDynamicChoiceSets((com.sforce.soap.metadata.FlowDynamicChoiceSet[])__typeMapper.readObject(__in, dynamicChoiceSets__typeInfo, com.sforce.soap.metadata.FlowDynamicChoiceSet[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, formulas__typeInfo)) {      setFormulas((com.sforce.soap.metadata.FlowFormula[])__typeMapper.readObject(__in, formulas__typeInfo, com.sforce.soap.metadata.FlowFormula[].class));    }    __in.peekTag();    if (__typeMapper.verifyElement(__in, label__typeInfo)) {      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, recordCreates__typeInfo)) {      setRecordCreates((com.sforce.soap.metadata.FlowRecordCreate[])__typeMapper.readObject(__in, recordCreates__typeInfo, com.sforce.soap.metadata.FlowRecordCreate[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, recordDeletes__typeInfo)) {      setRecordDeletes((com.sforce.soap.metadata.FlowRecordDelete[])__typeMapper.readObject(__in, recordDeletes__typeInfo, com.sforce.soap.metadata.FlowRecordDelete[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, recordLookups__typeInfo)) {      setRecordLookups((com.sforce.soap.metadata.FlowRecordLookup[])__typeMapper.readObject(__in, recordLookups__typeInfo, com.sforce.soap.metadata.FlowRecordLookup[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, recordUpdates__typeInfo)) {      setRecordUpdates((com.sforce.soap.metadata.FlowRecordUpdate[])__typeMapper.readObject(__in, recordUpdates__typeInfo, com.sforce.soap.metadata.FlowRecordUpdate[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, screens__typeInfo)) {      setScreens((com.sforce.soap.metadata.FlowScreen[])__typeMapper.readObject(__in, screens__typeInfo, com.sforce.soap.metadata.FlowScreen[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, startElementReference__typeInfo)) {      setStartElementReference((java.lang.String)__typeMapper.readString(__in, startElementReference__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, steps__typeInfo)) {      setSteps((com.sforce.soap.metadata.FlowStep[])__typeMapper.readObject(__in, steps__typeInfo, com.sforce.soap.metadata.FlowStep[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, subflows__typeInfo)) {      setSubflows((com.sforce.soap.metadata.FlowSubflow[])__typeMapper.readObject(__in, subflows__typeInfo, com.sforce.soap.metadata.FlowSubflow[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, textTemplates__typeInfo)) {      setTextTemplates((com.sforce.soap.metadata.FlowTextTemplate[])__typeMapper.readObject(__in, textTemplates__typeInfo, com.sforce.soap.metadata.FlowTextTemplate[].class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, variables__typeInfo)) {      setVariables((com.sforce.soap.metadata.FlowVariable[])__typeMapper.readObject(__in, variables__typeInfo, com.sforce.soap.metadata.FlowVariable[].class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[Flow ");    sb.append(super.toString());    sb.append(" apexPluginCalls=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(apexPluginCalls)+"'\n");    sb.append(" assignments=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignments)+"'\n");    sb.append(" choices=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(choices)+"'\n");    sb.append(" constants=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(constants)+"'\n");    sb.append(" decisions=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(decisions)+"'\n");    sb.append(" description=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");    sb.append(" dynamicChoiceSets=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(dynamicChoiceSets)+"'\n");    sb.append(" formulas=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(formulas)+"'\n");    sb.append(" label=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");    sb.append(" recordCreates=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordCreates)+"'\n");    sb.append(" recordDeletes=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordDeletes)+"'\n");    sb.append(" recordLookups=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordLookups)+"'\n");    sb.append(" recordUpdates=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordUpdates)+"'\n");    sb.append(" screens=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(screens)+"'\n");    sb.append(" startElementReference=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(startElementReference)+"'\n");    sb.append(" steps=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(steps)+"'\n");    sb.append(" subflows=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(subflows)+"'\n");    sb.append(" textTemplates=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(textTemplates)+"'\n");    sb.append(" variables=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(variables)+"'\n");    sb.append("]\n");    return sb.toString();  }}