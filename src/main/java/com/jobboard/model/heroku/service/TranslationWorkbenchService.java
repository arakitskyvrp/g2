package com.jobboard.model.heroku.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.Translation_Table;
import com.jobboard.model.heroku.service.BilingualSTFParser.LanguageTranslationWrapper;

@ManagedBean(name = "translationWorkbenchService")
@ApplicationScoped
public class TranslationWorkbenchService {

	private Map<String, LanguageTranslationWrapper> languageTranslations = new HashMap<String, LanguageTranslationWrapper>();
	private EntityManager em = EntityManagerProvider
			.createHerokuEntityManager();

	public TranslationWorkbenchService() {
		loadLanguages();
	}

	public void loadLanguages() {
		CriteriaQuery<Translation_Table> c = em.getCriteriaBuilder()
				.createQuery(Translation_Table.class);
		List<Translation_Table> resultList = em.createQuery(c).getResultList();
		for (Translation_Table translationFile : resultList) {
			LanguageTranslationWrapper languageTranslationWrapper = BilingualSTFParser
					.translateBilingualSTF(translationFile
							.getTranslation_File());
			languageTranslations.put(languageTranslationWrapper.getLanguage(),
					languageTranslationWrapper);
		}
		System.out.println(languageTranslations.keySet());
	}

	public static void main(String[] args) {
		new TranslationWorkbenchService();
	}

	public LanguageTranslationWrapper getTranslation(String language) {
		if (languageTranslations.containsKey(language)) {
			return languageTranslations.get(language);
		}
		return null;
	}

}
