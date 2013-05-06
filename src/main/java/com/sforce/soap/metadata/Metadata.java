package com.sforce.soap.metadata;

/** * Generated class, please do not edit. */
public class Metadata implements com.sforce.ws.bind.XMLizable {
	/** * Constructor */
	public Metadata() {
	}

	/**
	 * * element : fullName of type {http://www.w3.org/2001/XMLSchema}string *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo fullName__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "fullName",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean fullName__is_set = false;
	private java.lang.String fullName;

	public java.lang.String getFullName() {
		return fullName;
	}

	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
		fullName__is_set = true;
	}

	/**   */
	public void write(javax.xml.namespace.QName __element,
			com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(),
				__element.getLocalPart());
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}

	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__typeMapper.writeString(__out, fullName__typeInfo, fullName,
				fullName__is_set);
	}

	public void load(com.sforce.ws.parser.XmlInputStream __in,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		__typeMapper.consumeStartTag(__in);
		loadFields(__in, __typeMapper);
		__typeMapper.consumeEndTag(__in);
	}

	protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		__in.peekTag();
		if (__typeMapper.isElement(__in, fullName__typeInfo)) {
			setFullName((java.lang.String) __typeMapper.readString(__in,
					fullName__typeInfo, java.lang.String.class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[Metadata ");
		sb.append(" fullName=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(fullName) + "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}