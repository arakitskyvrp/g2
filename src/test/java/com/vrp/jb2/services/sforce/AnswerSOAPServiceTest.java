package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Test for {@link AnswerSOAPService}
 */
public class AnswerSOAPServiceTest extends BaseSoapTests{

    public static final String ANSWER_ID = "a00i0000002TSnkAAG";
    public static final String LANGUAGE_ID = "a0Ki0000000tRa9EAE";
    private AnswerSOAPService answerSOAPService;
    private com.sforce.soap.services.AnswerSOAPService answerSOAPServiceOld;

    @BeforeTest
    public void init() {
        answerSOAPService = new AnswerSOAPService();
        answerSOAPService.setSfManager(getSalesForceManager());
        answerSOAPServiceOld = new com.sforce.soap.services.AnswerSOAPService();
        answerSOAPServiceOld.setConnectionService(getConnectionService());
    }

    @Test
    public void testGetAnswersForQuestion() throws Exception {
        List<Ts2__Answer__c> answerNew = answerSOAPService.getAnswersForQuestion(QUESTION_ID);
        List<Ts2__Answer__c> answerOld = answerSOAPServiceOld.getAnswersForQuestion(QUESTION_ID);
        assertNotNull(answerNew);
        assertEquals(answerOld, answerNew);
    }

    @Test
    public void testGetAnswersByID() throws Exception {
        Ts2__Answer__c answersByIDNew = answerSOAPService.getAnswersByID(ANSWER_ID);
        List<Ts2__Answer__c> answersByIDOld = answerSOAPServiceOld.getAnswersByID(ANSWER_ID);
        assertNotNull(answersByIDNew);
        assertEquals(answersByIDOld.get(0),answersByIDNew);

    }

    @Test
    public void testGetAnswerTranslation() throws Exception {
        Answer_Translation__c answerTranslationOld = answerSOAPServiceOld.getAnswerTranslation(ANSWER_ID, LANGUAGE_ID);
        Answer_Translation__c answerTranslationNew = answerSOAPService.getAnswerTranslation(ANSWER_ID, LANGUAGE_ID);
        assertNotNull(answerTranslationOld);
        assertEquals(answerTranslationNew,answerTranslationOld);
    }
}
