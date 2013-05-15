package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Language__c;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * User: alexey.korolev
 * Date: 5/13/13
 */
public class LanguageServiceTest extends BaseSoapTests {

    public static final String ID = "";
    private LanguageSOAPService languageService;
    private com.sforce.soap.services.LanguageSOAPService languageServiceOld;

    @BeforeTest
    public void init() {

        languageService = new LanguageSOAPService();
        languageService.setSfManager(getSalesForceManager());

        languageServiceOld = new com.sforce.soap.services.LanguageSOAPService();
        languageServiceOld.setConnectionService(getConnectionService());
    }


    @Test
    public void testServiceAgainstOldImpl() throws Exception {
        List<Language__c> objectList = languageService.listElements();
        List<Language__c> oldObjectList = languageServiceOld.listElements();
        super.assertListEquals(objectList,oldObjectList);
    }

    @Test
    public void testSearchForElement(){
        Language__c language = languageService.searchForElement(ID);
        Language__c languageOld = languageServiceOld.searchForElement(ID);
        assertNotNull(language);
        assertEquals(languageOld,language);
    }
    
}
