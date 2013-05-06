package com.sforce.soap.enterprise;

/** * Generated by ComplexTypeGenerator.java. Please do not edit. */
public class AllOrNoneHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {
	/** * Constructor */
	public AllOrNoneHeader_element() {}
	
	/**
	 * * element : allOrNone of type {http://www.w3.org/2001/XMLSchema}boolean * java
	 * type: boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo allOrNone__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"urn:enterprise.soap.sforce.com", "allOrNone", "http://www.w3.org/2001/XMLSchema", "boolean", 1, 1, true);
	private boolean allOrNone__is_set = false;
	private boolean allOrNone;
	
	public boolean getAllOrNone() {
		return allOrNone;
	}
	
	public boolean isAllOrNone() {
		return allOrNone;
	}
	
	public void setAllOrNone(boolean allOrNone) {
		this.allOrNone = allOrNone;
		allOrNone__is_set = true;
	}
	
	/**   */
	public void write(javax.xml.namespace.QName __element, com.sforce.ws.parser.XmlOutputStream __out,
		com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}
	
	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		super.writeFields(__out, __typeMapper);
		__typeMapper.writeBoolean(__out, allOrNone__typeInfo, allOrNone, allOrNone__is_set);
	}
	
	public void load(com.sforce.ws.parser.XmlInputStream __in, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		__typeMapper.consumeStartTag(__in);
		loadFields(__in, __typeMapper);
		__typeMapper.consumeEndTag(__in);
	}
	
	protected void loadFields(com.sforce.ws.parser.XmlInputStream __in, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		super.loadFields(__in, __typeMapper);
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, allOrNone__typeInfo)) {
			setAllOrNone((boolean) __typeMapper.readBoolean(__in, allOrNone__typeInfo, boolean.class));
		}
	}
	
	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[AllOrNoneHeader_element ");
		sb.append(super.toString());
		sb.append(" allOrNone=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(allOrNone) + "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}