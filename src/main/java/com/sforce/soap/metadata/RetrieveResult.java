package com.sforce.soap.metadata;

/** * Generated class, please do not edit. */
public class RetrieveResult implements com.sforce.ws.bind.XMLizable {
	/** * Constructor */
	public RetrieveResult() {
	}

	/**
	 * * element : fileProperties of type
	 * {http://soap.sforce.com/2006/04/metadata}FileProperties * java type:
	 * com.sforce.soap.metadata.FileProperties[]
	 */
	private static final com.sforce.ws.bind.TypeInfo fileProperties__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "fileProperties",
			"http://soap.sforce.com/2006/04/metadata", "FileProperties", 0, -1,
			true);
	private boolean fileProperties__is_set = false;
	private com.sforce.soap.metadata.FileProperties[] fileProperties = new com.sforce.soap.metadata.FileProperties[0];

	public com.sforce.soap.metadata.FileProperties[] getFileProperties() {
		return fileProperties;
	}

	public void setFileProperties(
			com.sforce.soap.metadata.FileProperties[] fileProperties) {
		this.fileProperties = fileProperties;
		fileProperties__is_set = true;
	}

	/**
	 * * element : id of type {http://www.w3.org/2001/XMLSchema}string * java
	 * type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo id__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "id",
			"http://www.w3.org/2001/XMLSchema", "string", 1, 1, true);
	private boolean id__is_set = false;
	private java.lang.String id;

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
		id__is_set = true;
	}

	/**
	 * * element : messages of type
	 * {http://soap.sforce.com/2006/04/metadata}RetrieveMessage * java type:
	 * com.sforce.soap.metadata.RetrieveMessage[]
	 */
	private static final com.sforce.ws.bind.TypeInfo messages__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "messages",
			"http://soap.sforce.com/2006/04/metadata", "RetrieveMessage", 0,
			-1, true);
	private boolean messages__is_set = false;
	private com.sforce.soap.metadata.RetrieveMessage[] messages = new com.sforce.soap.metadata.RetrieveMessage[0];

	public com.sforce.soap.metadata.RetrieveMessage[] getMessages() {
		return messages;
	}

	public void setMessages(com.sforce.soap.metadata.RetrieveMessage[] messages) {
		this.messages = messages;
		messages__is_set = true;
	}

	/**
	 * * element : zipFile of type
	 * {http://www.w3.org/2001/XMLSchema}base64Binary * java type: byte[]
	 */
	private static final com.sforce.ws.bind.TypeInfo zipFile__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "zipFile",
			"http://www.w3.org/2001/XMLSchema", "base64Binary", 1, 1, true);
	private boolean zipFile__is_set = false;
	private byte[] zipFile;

	public byte[] getZipFile() {
		return zipFile;
	}

	public void setZipFile(byte[] zipFile) {
		this.zipFile = zipFile;
		zipFile__is_set = true;
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
		__typeMapper.writeObject(__out, fileProperties__typeInfo,
				fileProperties, fileProperties__is_set);
		__typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
		__typeMapper.writeObject(__out, messages__typeInfo, messages,
				messages__is_set);
		__typeMapper.writeObject(__out, zipFile__typeInfo, zipFile,
				zipFile__is_set);
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
		if (__typeMapper.isElement(__in, fileProperties__typeInfo)) {
			setFileProperties((com.sforce.soap.metadata.FileProperties[]) __typeMapper
					.readObject(__in, fileProperties__typeInfo,
							com.sforce.soap.metadata.FileProperties[].class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, id__typeInfo)) {
			setId((java.lang.String) __typeMapper.readString(__in,
					id__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.isElement(__in, messages__typeInfo)) {
			setMessages((com.sforce.soap.metadata.RetrieveMessage[]) __typeMapper
					.readObject(__in, messages__typeInfo,
							com.sforce.soap.metadata.RetrieveMessage[].class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, zipFile__typeInfo)) {
			setZipFile((byte[]) __typeMapper.readObject(__in,
					zipFile__typeInfo, byte[].class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[RetrieveResult ");
		sb.append(" fileProperties=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(fileProperties)
				+ "'\n");
		sb.append(" id=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(id) + "'\n");
		sb.append(" messages=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(messages) + "'\n");
		sb.append(" zipFile=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(zipFile) + "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}