package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Test for {@link QuestionSOAPService}
 */
public class QuestionSOAPServiceTest extends BaseSoapTests {

    private QuestionSOAPService questionService;
    private com.sforce.soap.services.QuestionSOAPService questionServiceOld;
    private Ts2__Job_Board_Setup__c jobBoardSetup;

    private Ts2__Job__c jobOrder;

    //todo
    public static final String STANDARD_QUESTION_ID = "";

    @BeforeTest
    public void init(){
        questionService = new QuestionSOAPService();
        questionServiceOld = new com.sforce.soap.services.QuestionSOAPService();
        questionService.setSfManager(getSalesForceManager());
        questionServiceOld.setConnectionService(getConnectionService());

        JobBoardSetupSOAPService jobBoard = new JobBoardSetupSOAPService();
        jobBoard.setSfManager(getSalesForceManager());
        jobBoardSetup = jobBoard.getBoardSetupBySiteName(SITE_NAME);
        JobOrderSOAPService jobOrderSOAPService = new JobOrderSOAPService();
        jobOrderSOAPService.setSfManager(getSalesForceManager());
        jobOrder = jobOrderSOAPService.listElements().get(0);
    }

    @Test
    public void testGetStandardQuestions() throws Exception {
        List<Ts2__StandardQuestion__c> standardQuestionsOld = questionServiceOld.getStandardQuestions(jobBoardSetup);
        List<Ts2__StandardQuestion__c> standardQuestionsNew = questionService.getStandardQuestions(jobBoardSetup.getId());
        super.assertListEquals(standardQuestionsOld,standardQuestionsNew);
    }

    @Test
    public void testGetSocialQuestions() throws Exception {
        List<Ts2__Question__c> socialQuestionsOld = questionServiceOld.getSocialQuestions(jobBoardSetup);
        List<Ts2__Question__c> socialQuestions = questionService.getSocialQuestions(jobBoardSetup.getId());
        super.assertListEquals(socialQuestions,socialQuestionsOld);
    }

    @Test
    public void testGetComplianceQuestions() throws Exception {
        List<Ts2__Question__c> complianceQuestionsOld = questionServiceOld.getComplianceQuestions(jobBoardSetup);
        List<Ts2__Question__c> complianceQuestions = questionService.getComplianceQuestions(jobBoardSetup.getId());
        super.assertListEquals(complianceQuestionsOld,complianceQuestions);
    }

    @Test
    public void testGetCustomQuestions() throws Exception {
        List<Ts2__Question__c> customQuestionsOld = questionServiceOld.getCustomQuestions(jobOrder);
        List<Ts2__Question__c> customQuestions = questionService.getCustomQuestions(jobOrder);
        super.assertListEquals(customQuestionsOld,customQuestions);
    }

    @Test
    public void testGetQuestionByID() throws Exception {
        Ts2__Question__c questionByID = questionService.getQuestionByID(QUESTION_ID);
        Ts2__Question__c questionByIDOld = questionServiceOld.getQuestionByID(QUESTION_ID);
        assertNotNull(questionByIDOld);
        assertEquals(questionByID.getId(),questionByIDOld.getId());
    }

    @Test
    public void testGetStandardQuestionByID() throws Exception {
        Ts2__StandardQuestion__c standardQuestionByID = questionService.getStandardQuestionByID(STANDARD_QUESTION_ID);
        Ts2__StandardQuestion__c standardQuestionByIDOld = questionServiceOld.getStandardQuestionByID(STANDARD_QUESTION_ID);
        assertNotNull(standardQuestionByID);
        assertEquals(standardQuestionByID.getId(),standardQuestionByIDOld.getId());
    }

    @Test
    public void testGetQuestionTranslation() throws Exception {
        Questions_Translation__c questionTranslation = questionService.getQuestionTranslation(QUESTION_ID, LANGUAGE_ID);
        Questions_Translation__c questionTranslationOld = questionServiceOld.getQuestionTranslation(QUESTION_ID, LANGUAGE_ID);
        assertNotNull(questionTranslation);
        assertEquals(questionTranslation.getId(),questionTranslationOld.getId());
    }

    @Test
    public void testGetStandardQuestionTranslation() throws Exception {
        Questions_Translation__c questionTranslation = questionService.getStandardQuestionTranslation(STANDARD_QUESTION_ID, LANGUAGE_ID);
        Questions_Translation__c questionTranslationOld = questionServiceOld.getStandardQuestionTranslation(STANDARD_QUESTION_ID, LANGUAGE_ID);
        assertNotNull(questionTranslation);
        assertEquals(questionTranslation.getId(),questionTranslationOld.getId());
    }
}
