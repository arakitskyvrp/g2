package com.sforce.soap.enterprise;

/** * Generated by ComplexTypeGenerator.java. Please do not edit. */
public class LogoutResponse_element implements com.sforce.ws.bind.XMLizable {
	/** * Constructor */
	public LogoutResponse_element() {}
	
	/**   */
	public void write(javax.xml.namespace.QName __element, com.sforce.ws.parser.XmlOutputStream __out,
		com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}
	
	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {}
	
	public void load(com.sforce.ws.parser.XmlInputStream __in, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {
		__typeMapper.consumeStartTag(__in);
		loadFields(__in, __typeMapper);
		__typeMapper.consumeEndTag(__in);
	}
	
	protected void loadFields(com.sforce.ws.parser.XmlInputStream __in, com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException, com.sforce.ws.ConnectionException {}
	
	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[LogoutResponse_element ");
		sb.append("]\n");
		return sb.toString();
	}
}