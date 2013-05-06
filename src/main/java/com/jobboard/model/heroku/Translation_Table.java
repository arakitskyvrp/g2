package com.jobboard.model.heroku;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the "Translation_Table" database table.
 * 
 */
@Entity
@Table(name="\"Translation_Table\"")
public class Translation_Table implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="file_id")
	private Long fileId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Created_Date\"")
	private Date created_Date;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Modified_Date\"")
	private Date modified_Date;

	@Column(name="\"SF_ORG_ID\"")
	private String sfOrgId;

	@Column(name="\"Translation_File\"")
	private byte[] translation_File;

	//bi-directional many-to-one association to SFOrg
	@PrimaryKeyJoinColumn(name="\"SF_ORG_ID\"")
	private SFOrg sforg;

	public Translation_Table() {
	}

	public Long getFileId() {
		return this.fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Date getCreated_Date() {
		return this.created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public Date getModified_Date() {
		return this.modified_Date;
	}

	public void setModified_Date(Date modified_Date) {
		this.modified_Date = modified_Date;
	}

	public String getSfOrgId() {
		return this.sfOrgId;
	}

	public void setSfOrgId(String sfOrgId) {
		this.sfOrgId = sfOrgId;
	}

	public byte[] getTranslation_File() {
		return this.translation_File;
	}

	public void setTranslation_File(byte[] translation_File) {
		this.translation_File = translation_File;
	}

	public SFOrg getSforg() {
		return this.sforg;
	}

	public void setSforg(SFOrg sforg) {
		this.sforg = sforg;
	}

}