package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * User: alexey.korolev
 * Date: 5/13/13
 */
public class JobBoardSetupServiceTest extends BaseSoapTests {

    private JobBoardSetupSOAPService jobBoardSetupService;
    private com.sforce.soap.services.JobBoardSetupSOAPService jobBoardSetupSOAPServiceOld;

    @BeforeTest
    public void init() {
        jobBoardSetupService = new JobBoardSetupSOAPService();
        jobBoardSetupService.setSfManager(getSalesForceManager());
        jobBoardSetupSOAPServiceOld = new com.sforce.soap.services.JobBoardSetupSOAPService();
        jobBoardSetupSOAPServiceOld.setConnectionService(getConnectionService());
    }

    @Test
    public void testServiceAgainstOldImpl() throws Exception {
        Ts2__Job_Board_Setup__c jbSetup = jobBoardSetupService.getBoardSetupBySiteName(SITE_NAME);
        Ts2__Job_Board_Setup__c oldJBSetup = jobBoardSetupSOAPServiceOld.getBoardSetupBySiteName(SITE_NAME);
        assertNotNull(jbSetup);
        assertEquals("Old and new services are expected to return same data.", oldJBSetup, jbSetup);
    }
}
