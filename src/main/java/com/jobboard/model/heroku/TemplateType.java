package com.jobboard.model.heroku;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TemplateType" database table.
 * 
 */
@Entity
@Table(name="\"TemplateType\"")
public class TemplateType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Template_type\"")
	private String template_type;

	@Column(name="\"Descrition\"")
	private String descrition;

	//bi-directional many-to-one association to Template
	@OneToMany(mappedBy="templateType")
	private List<Template> templates;

	public TemplateType() {
	}

	public String getTemplate_type() {
		return this.template_type;
	}

	public void setTemplate_type(String template_type) {
		this.template_type = template_type;
	}

	public String getDescrition() {
		return this.descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public Template addTemplate(Template template) {
		getTemplates().add(template);
		template.setTemplateType(this);

		return template;
	}

	public Template removeTemplate(Template template) {
		getTemplates().remove(template);
		template.setTemplateType(null);

		return template;
	}

}