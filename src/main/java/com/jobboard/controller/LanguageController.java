package com.jobboard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jobboard.model.LanguageChangeListener;
import com.jobboard.model.heroku.service.BilingualSTFParser.LanguageTranslationWrapper;

@ManagedBean(name = "languageController")
@SessionScoped
public class LanguageController {

	private List<LanguageChangeListener> languageChangeListeners = new ArrayList<LanguageChangeListener>();
	private LanguageTranslationWrapper translationWrapper;

	public List<LanguageChangeListener> getLanguageChangeListeners() {
		return languageChangeListeners;
	}

	public void setLanguageChangeListeners(
			List<LanguageChangeListener> languageChangeListeners) {
		this.languageChangeListeners = languageChangeListeners;
	}

	public void addLanguageCHangeListener(
			LanguageChangeListener languageChangeListener) {
		if (!getLanguageChangeListeners().contains(languageChangeListener)) {
			getLanguageChangeListeners().add(languageChangeListener);
		}
	}

	public void removeLanguageChangeListener(
			LanguageChangeListener languageChangeListener) {
		if (getLanguageChangeListeners().contains(languageChangeListener)) {
			getLanguageChangeListeners().remove(languageChangeListener);
		}
	}

	public void fireLanguageChangeEvent(
			LanguageTranslationWrapper translationWrapper) {
		this.setTranslationWrapper(translationWrapper);
		List<LanguageChangeListener> languageChangeListeners = getLanguageChangeListeners();
		for (LanguageChangeListener languageChangeListener : languageChangeListeners) {
			languageChangeListener.languageChange(translationWrapper);
		}
	}

	public LanguageTranslationWrapper getTranslationWrapper() {
		return translationWrapper;
	}

	public void setTranslationWrapper(
			LanguageTranslationWrapper translationWrapper) {
		this.translationWrapper = translationWrapper;
	}

}
