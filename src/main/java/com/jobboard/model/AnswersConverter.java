package com.jobboard.model;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import com.sforce.soap.services.AnswerSOAPService;
import com.sforce.soap.services.SOAPConnectionService;

@FacesConverter(forClass = Ts2__Answer__c.class, value = "answersConverter")
public class AnswersConverter implements Converter {

	private AnswerSOAPService answerSOAPService;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		List<Ts2__Answer__c> answersForQuestion = getAnswerSOAPService()
				.getAnswersByID(value);
		if (null != answersForQuestion && !answersForQuestion.isEmpty()) {
			return answersForQuestion.get(0);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value instanceof Ts2__Answer__c) {
			return ((Ts2__Answer__c) value).getId();
		}
		return null;
	}

	public AnswerSOAPService getAnswerSOAPService() {
		if (answerSOAPService==null) {
			answerSOAPService = new AnswerSOAPService();
			answerSOAPService.setConnectionService(new SOAPConnectionService());
		}
		return answerSOAPService;
	}

	public void setAnswerSOAPService(AnswerSOAPService answerSOAPService) {
		this.answerSOAPService = answerSOAPService;
	}

}
