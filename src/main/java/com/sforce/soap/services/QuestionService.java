package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.*;

import java.util.List;

/**
 * Service is designed to work with the questions.
 */
public interface QuestionService {

    public List<Ts2__StandardQuestion__c> getStandardQuestions(Ts2__Job_Board_Setup__c jobBoardSetup); //select by  jobBoardSetup.id

    public List<Ts2__Question__c> getSocialQuestions(Ts2__Job_Board_Setup__c jobBoardSetup); //select by  jobBoardSetup.id

    public List<Ts2__Question__c> getComplianceQuestions(Ts2__Job_Board_Setup__c jobBoardSetup); //select by  jobBoardSetup.id

    public List<Ts2__Question__c> getCustomQuestions(Ts2__Job__c jobOrder); //select by  jobOrder.id

    public Ts2__Question__c getQuestionByID(String id);

    public Ts2__StandardQuestion__c getStandardQuestionByID(String id);

    public Questions_Translation__c getQuestionTranslation(String questionID, String languageID);

    public List<Questions_Translation__c> getStandardQuestionTranslation(String standardQuestionID);

    public Questions_Translation__c getStandardQuestionTranslation(String standardQuestionID, String languageID);

    public List<Questions_Translation__c> getTranslation(String where);

}
