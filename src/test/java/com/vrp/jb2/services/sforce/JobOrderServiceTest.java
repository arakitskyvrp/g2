package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;

/**
 * User: alexey.korolev
 * Date: 5/13/13
 */
public class JobOrderServiceTest extends BaseSoapTests {

    public static final String ID = "a0Ki0000000tRa9EAE";
    public static final String BOARD_SETUP_ID = "a0Gi0000000DNOmEAO";
    private JobOrderSOAPService jobOrderService;
    private com.sforce.soap.services.JobOrderSOAPService jobOrderSOAPServiceOld;

    @BeforeTest
    public void init() {
        jobOrderService = new JobOrderSOAPService();
        jobOrderService.setSfManager(getSalesForceManager());

        jobOrderSOAPServiceOld = new com.sforce.soap.services.JobOrderSOAPService();
        jobOrderSOAPServiceOld.setConnectionService(getConnectionService());
    }

    @Test
    public void testServiceAgainstOldImpl() throws Exception {
        List<Ts2__Job__c> objectList = jobOrderService.listElements();
        List<Ts2__Job__c> oldObjectList = jobOrderSOAPServiceOld.listElements();
        assertNotSame("Expected more than one element.", 0, objectList.size());
        assertListEquals(oldObjectList, objectList);
    }

   @Test
   public void testSearchForElement(){
       Ts2__Job__c job = jobOrderService.searchForElement(ID);
       Ts2__Job__c jobOld = jobOrderSOAPServiceOld.searchForElement(ID);
       assertNotNull(job);
       assertEquals(jobOld.getId(),job.getId());
   }

    @Test
    public void testListAllByJobBoard(){
        List<Ts2__Job__c> job = jobOrderService.listAllByJobBoard(BOARD_SETUP_ID);
        List<Ts2__Job__c> jobOld = jobOrderSOAPServiceOld.listAllByJobBoard(BOARD_SETUP_ID);
        assertNotNull(job);
        assertListEquals(job,jobOld);
    }


}
