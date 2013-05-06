package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Templates" database table.
 * 
 */
@Entity
@Table(name="\"Templates\"")
public class Template implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Template_ID\"")
	private String template_ID;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Column(name="\"Default\"")
	private byte[] default_;

	@Column(name="\"File\"")
	private byte[] file;

	@Column(name="\"Jar_File\"")
	private byte[] jar_File;

	@Column(name="\"Layout\"")
	private byte[] layout;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"SF_Job_Board_ID\"")
	private String SF_Job_Board_ID;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Column(name="\"Template_type\"")
	private String template_type;

	//bi-directional many-to-one association to SFOrg
	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	//bi-directional many-to-one association to TemplateType
	@PrimaryKeyJoinColumn(name="\"Template_type\"")
	private TemplateType templateType;

	public Template() {
	}

	public String getTemplate_ID() {
		return this.template_ID;
	}

	public void setTemplate_ID(String template_ID) {
		this.template_ID = template_ID;
	}

	public Date getCreated_Date() {
		return this.created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public byte[] getDefault_() {
		return this.default_;
	}

	public void setDefault_(byte[] default_) {
		this.default_ = default_;
	}

	public byte[] getFile() {
		return this.file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public byte[] getJar_File() {
		return this.jar_File;
	}

	public void setJar_File(byte[] jar_File) {
		this.jar_File = jar_File;
	}

	public byte[] getLayout() {
		return this.layout;
	}

	public void setLayout(byte[] layout) {
		this.layout = layout;
	}

	public Date getModified_Date() {
		return this.modified_Date;
	}

	public void setModified_Date(Date modified_Date) {
		this.modified_Date = modified_Date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSF_Job_Board_ID() {
		return this.SF_Job_Board_ID;
	}

	public void setSF_Job_Board_ID(String SF_Job_Board_ID) {
		this.SF_Job_Board_ID = SF_Job_Board_ID;
	}

	public String getSfOrgId() {
		return this.sfOrgId;
	}

	public void setSfOrgId(String sfOrgId) {
		this.sfOrgId = sfOrgId;
	}

	public String getTemplate_type() {
		return this.template_type;
	}

	public void setTemplate_type(String template_type) {
		this.template_type = template_type;
	}

	public SFOrg getSforg() {
		return this.sforg;
	}

	public void setSforg(SFOrg sforg) {
		this.sforg = sforg;
	}

	public TemplateType getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(TemplateType templateType) {
		this.templateType = templateType;
	}

}