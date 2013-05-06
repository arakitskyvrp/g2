package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;

import java.util.List;

/**
 * Interface to obtain data about answers.
 */
public interface AnswerService {

    /**
     * Select answer by question id
     *
     *
     * @param questionID id of question.
     * @return list of answers.
     */
    public List getAnswersForQuestion(String questionID);

    /**
     * Select answer by answersID id
     *
     * @param answersID id of question.
     * @return list of answers.
     */
    public Ts2__Answer__c getAnswersByID(String answersID);

    /**
     * Get answer translation.
     *
     * @param answerID   answer id.
     * @param languageID id of language.
     * @return answer translation.
     */
    public Answer_Translation__c getAnswerTranslation(String answerID, String languageID);

}
