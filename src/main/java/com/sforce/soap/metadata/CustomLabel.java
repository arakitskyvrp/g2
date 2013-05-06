package com.sforce.soap.metadata;

/** * Generated class, please do not edit. */
public class CustomLabel extends com.sforce.soap.metadata.Metadata {
	/** * Constructor */
	public CustomLabel() {
	}

	/**
	 * * element : categories of type {http://www.w3.org/2001/XMLSchema}string *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo categories__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "categories",
			"http://www.w3.org/2001/XMLSchema", "string", 0, 1, true);
	private boolean categories__is_set = false;
	private java.lang.String categories;

	public java.lang.String getCategories() {
		return categories;
	}

	public void setCategories(java.lang.String categories) {
		this.categories = categories;
		categories__is_set = true;
	}

	/**
	 * * element : language of type {http://www.w3.org/2001/XMLSchema}string *
	 * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo language__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "language",
			"http://www.w3.org/2001/XMLSchema", "string", 1, 1, true);
	private boolean language__is_set = false;
	private java.lang.String language;

	public java.lang.String getLanguage() {
		return language;
	}

	public void setLanguage(java.lang.String language) {
		this.language = language;
		language__is_set = true;
	}

	/**
	 * * element : protected of type {http://www.w3.org/2001/XMLSchema}boolean *
	 * java type: boolean
	 */
	private static final com.sforce.ws.bind.TypeInfo _protected__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "protected",
			"http://www.w3.org/2001/XMLSchema", "boolean", 1, 1, true);
	private boolean _protected__is_set = false;
	private boolean _protected;

	public boolean getProtected() {
		return _protected;
	}

	public boolean isProtected() {
		return _protected;
	}

	public void setProtected(boolean _protected) {
		this._protected = _protected;
		_protected__is_set = true;
	}

	/**
	 * * element : shortDescription of type
	 * {http://www.w3.org/2001/XMLSchema}string * java type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo shortDescription__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "shortDescription",
			"http://www.w3.org/2001/XMLSchema", "string", 1, 1, true);
	private boolean shortDescription__is_set = false;
	private java.lang.String shortDescription;

	public java.lang.String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(java.lang.String shortDescription) {
		this.shortDescription = shortDescription;
		shortDescription__is_set = true;
	}

	/**
	 * * element : value of type {http://www.w3.org/2001/XMLSchema}string * java
	 * type: java.lang.String
	 */
	private static final com.sforce.ws.bind.TypeInfo value__typeInfo = new com.sforce.ws.bind.TypeInfo(
			"http://soap.sforce.com/2006/04/metadata", "value",
			"http://www.w3.org/2001/XMLSchema", "string", 1, 1, true);
	private boolean value__is_set = false;
	private java.lang.String value;

	public java.lang.String getValue() {
		return value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
		value__is_set = true;
	}

	/**   */
	public void write(javax.xml.namespace.QName __element,
			com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		__out.writeStartTag(__element.getNamespaceURI(),
				__element.getLocalPart());
		__typeMapper.writeXsiType(__out,
				"http://soap.sforce.com/2006/04/metadata", "CustomLabel");
		writeFields(__out, __typeMapper);
		__out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
	}

	protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
			com.sforce.ws.bind.TypeMapper __typeMapper)
			throws java.io.IOException {
		super.writeFields(__out, __typeMapper);
		__typeMapper.writeString(__out, categories__typeInfo, categories,
				categories__is_set);
		__typeMapper.writeString(__out, language__typeInfo, language,
				language__is_set);
		__typeMapper.writeBoolean(__out, _protected__typeInfo, _protected,
				_protected__is_set);
		__typeMapper.writeString(__out, shortDescription__typeInfo,
				shortDescription, shortDescription__is_set);
		__typeMapper.writeString(__out, value__typeInfo, value, value__is_set);
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
		super.loadFields(__in, __typeMapper);
		__in.peekTag();
		if (__typeMapper.isElement(__in, categories__typeInfo)) {
			setCategories((java.lang.String) __typeMapper.readString(__in,
					categories__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, language__typeInfo)) {
			setLanguage((java.lang.String) __typeMapper.readString(__in,
					language__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, _protected__typeInfo)) {
			setProtected((boolean) __typeMapper.readBoolean(__in,
					_protected__typeInfo, boolean.class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, shortDescription__typeInfo)) {
			setShortDescription((java.lang.String) __typeMapper.readString(
					__in, shortDescription__typeInfo, java.lang.String.class));
		}
		__in.peekTag();
		if (__typeMapper.verifyElement(__in, value__typeInfo)) {
			setValue((java.lang.String) __typeMapper.readString(__in,
					value__typeInfo, java.lang.String.class));
		}
	}

	public String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append("[CustomLabel ");
		sb.append(super.toString());
		sb.append(" categories=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(categories) + "'\n");
		sb.append(" language=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(language) + "'\n");
		sb.append(" _protected=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(_protected) + "'\n");
		sb.append(" shortDescription=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(shortDescription)
				+ "'\n");
		sb.append(" value=");
		sb.append("'" + com.sforce.ws.util.Verbose.toString(value) + "'\n");
		sb.append("]\n");
		return sb.toString();
	}
}