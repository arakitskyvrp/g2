package com.jobboard.model;

import com.jobboard.model.heroku.service.BilingualSTFParser.LanguageTranslationWrapper;

public interface LanguageChangeListener {
	
	public void languageChange(LanguageTranslationWrapper languageTranslationWrapper);

}
