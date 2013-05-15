package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Application__c;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Test for {@link ApplicationSOAPService}.
 */
public class ApplicationSOAPServiceTest extends BaseSoapTests {

    public static final String CANDIDATE_ID = "";
    public static final String JOB_ORDER_ID = "a0Ki0000000tRa9EAE";
    private ApplicationSOAPService applicationSOAPServiceNew;
    private com.sforce.soap.services.ApplicationSOAPService applicationSOAPServiceOld;

    @BeforeTest
    public void init() {
        applicationSOAPServiceNew = new ApplicationSOAPService();
        applicationSOAPServiceOld = new com.sforce.soap.services.ApplicationSOAPService();
    }

    @Test
    public void testGetApplicationsByCandidateID() throws Exception {
        List<Ts2__Application__c> applicationsNew = applicationSOAPServiceNew.getApplicationsByCandidateID(CANDIDATE_ID);
        List<Ts2__Application__c> applicationsOld = applicationSOAPServiceOld.getApplicationsByCandidateID(CANDIDATE_ID);
        assertNotNull(applicationsNew);
        assertEquals(applicationsOld,applicationsNew);

    }

    @Test
    public void testIsApplicationAlredySent() throws Exception {
        boolean isSendNew = applicationSOAPServiceNew.isApplicationAlredySent(CANDIDATE_ID, JOB_ORDER_ID);
        boolean isSendOld = applicationSOAPServiceOld.isApplicationAlredySent(CANDIDATE_ID, JOB_ORDER_ID);
        assertEquals(isSendNew, isSendOld);

    }

    @Test
    public void testSave() throws Exception {

    }
}
