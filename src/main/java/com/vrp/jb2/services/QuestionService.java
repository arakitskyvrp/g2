package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Questions_Translation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.enterprise.sobject.Ts2__Question__c;
import com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c;

import java.util.List;

/**
 * Service is designed to work with the questions.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
public interface QuestionService {

    /**
     * Get standard question by jobBoard id.
     *
     * @param jobBoardSetupId jobBoard id.
     * @return list of standard question by jobBoard.
     */
    public List<Ts2__StandardQuestion__c> getStandardQuestions(String jobBoardSetupId); //select by  jobBoardSetup.id

    /**
     * Get social question by jobBoard.
     *
     * @param jobBoardSetupId jobBoard.
     * @return list of standard question by jobBoard.
     */
    public List<Ts2__Question__c> getSocialQuestions(String jobBoardSetupId); //select by  jobBoardSetup.id

    /**
     * Get compliance question by jobBoard.
     *
     * @param jobBoardSetupId jobBoard id.
     * @return list of compliance question by jobBoard.
     */
    public List<Ts2__Question__c> getComplianceQuestions(String jobBoardSetupId); //select by  jobBoardSetup.id

    /**
     * Get question by jobOrder.
     *
     * @param jobOrder jobOrder id.
     * @return list of question by jobOrder.
     */
    public List<Ts2__Question__c> getCustomQuestions(Ts2__Job__c jobOrder); //select by  jobOrder.id

    /**
     * Get question by id.
     *
     * @param id id of question.
     * @return found question.
     */
    public Ts2__Question__c getQuestionByID(String id);

    /**
     * Get standard question by id.
     *
     * @param id id of standard question.
     * @return found standard question.
     */
    public Ts2__StandardQuestion__c getStandardQuestionByID(String id);

    /**
     * Found question translation.
     *
     * @param questionID question id.
     * @param languageID language id.
     * @return question translation.
     */
    public Questions_Translation__c getQuestionTranslation(String questionID, String languageID);

    /**
     * Found standard question translation.
     *
     * @param standardQuestionID standard question id.
     * @param languageID         language id.
     * @return standard question translation.
     */
    public Questions_Translation__c getStandardQuestionTranslation(String standardQuestionID, String languageID);

}
