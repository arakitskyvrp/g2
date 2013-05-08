package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Language__c;
import com.vrp.jb2.services.LanguageService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about languages.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "languageSOAPServiceNew")
@ApplicationScoped
public class LanguageSOAPService implements LanguageService {

    private static final Logger LOG = Logger.getLogger(LanguageSOAPService.class);

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    private static final String QUERY = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, Language_Description__c FROM Language__c " +
            "{0}";

    private static final String WHERE_BY_ID = " WHERE Id = ''{0}''";

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    @Override
    public Language__c save(Language__c language) {
        LOG.trace("Start save(), language :: " + language);
        return getSfManager().saveToSalesforce(language);
    }

    @Override
    public List<Language__c> listElements() {
        LOG.trace("Start listElements()");
        return getSfManager().getListElements(QUERY, Language__c.class);
    }


    @Override
    public Language__c searchForElement(String id) {
        LOG.trace("Start searchForElement(), id :: " + id);
        return getSfManager().getElementByParam(QUERY, WHERE_BY_ID, Language__c.class, id);
    }

}
