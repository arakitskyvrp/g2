package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Language__c;

import java.util.List;


/**
 * Provides opportunities to work with different language locales.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
public interface LanguageService {

    /**
     * Saves the language in the data warehouse (internal database, the database salesforce or others).
     *
     * @param language language.
     * @return saved language.
     */
    public Language__c save(Language__c language);

    /**
     * Return the list of available languages.
     *
     * @return the list of available languages.
     */
    public List<Language__c> listElements();

    /**
     * Search language by id.
     *
     * @param id id of jobOrder
     * @return found jobOrder.
     */
    public Language__c searchForElement(String id);

}
