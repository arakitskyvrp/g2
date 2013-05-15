package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.services.SOAPConnectionService;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;

/**
 * Base class for soap integration tests.
 */
public abstract class BaseSoapTests {

    public static final String LANGUAGE_ID = "a0Ki0000000tRa9EAE";
    public static final String QUESTION_ID = "a0Ui00000005H1XEAU";
    public static final String SITE_NAME = "careers";

    private final SOAPConnectionService connectionService;
    private final SalesForceManager salesForceManager;

    protected BaseSoapTests() {
        connectionService = new SOAPConnectionService();
        salesForceManager = new SalesForceManager();
        salesForceManager.setConnectionService(connectionService);
    }

    public SOAPConnectionService getConnectionService() {
        return connectionService;
    }

    public SalesForceManager getSalesForceManager() {
        return salesForceManager;
    }

    protected <T extends SObject> void assertListEquals(List<T> expectedList, List<T> actualList) {
        assertNotSame("Array can not be null", 0, actualList.size());
        assertEquals("Size not equals", expectedList.size(), actualList.size());
        for (int i = 0; i < expectedList.size(); i++) {
            T expected = expectedList.get(i);
            T actual = actualList.get(i);
            assertEquals("Lists are not equals ,expected list :: " + expected.getId() + ", actual list " + actual.getId(), expected.getId(), actual.getId());
        }
    }
}
