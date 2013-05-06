package com.jobboard.model;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.sforce.soap.enterprise.sobject.Language__c;
import com.sforce.soap.services.LanguageSOAPService;
import com.sforce.soap.services.SOAPConnectionService;

@FacesConverter(forClass = Language__c.class, value = "languageConverter")
public class LanguageConverter implements Converter {

	private LanguageSOAPService languageSOAPService;
	private Map<String, Language__c> languageMap = new HashMap<String, Language__c>();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		System.out.println("LANGUAGE getAsObject>>" + value);
		if (languageMap.containsKey(value)) {
			System.out.println("Language Object Found in map");
			return languageMap.get(value);
		}
		return getLanguageSOAPService().searchForElement(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value instanceof Language__c) {
			System.out.println("LANGUAGE getAsString>>"
					+ ((Language__c) value).getId());
			if (!languageMap.containsKey(((Language__c) value).getId())) {
				languageMap.put(((Language__c) value).getId(),
						(Language__c) value);
			}

			return ((Language__c) value).getId();
		}
		return null;
	}

	public LanguageSOAPService getLanguageSOAPService() {
		if (languageSOAPService == null) {
			languageSOAPService = new LanguageSOAPService();
			languageSOAPService
					.setConnectionService(new SOAPConnectionService());
		}
		return languageSOAPService;
	}

}
