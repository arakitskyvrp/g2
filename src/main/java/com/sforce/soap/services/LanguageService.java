package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.Language__c;

import java.util.List;


/**
 * Provides opportunities to work with different language locales.
 */
public interface LanguageService {

    public List<Language__c> listElements();
    public Language__c searchForElement(String id);

}
