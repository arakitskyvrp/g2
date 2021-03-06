package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import com.vrp.jb2.services.AnswerService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about answers.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "answerSOAPServiceNew")
@ApplicationScoped
public class AnswerSOAPService implements AnswerService {

    private static final Logger LOG = Logger.getLogger(AnswerSOAPService.class);

    private static final String QUERY_ANSWER_PATTERN = "Select " +
            "Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, " +
            "ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c " +
            "FROM ts2__Answer__c " +
            "{0} " +
            "ORDER BY ts2__Order__c ASC";
    private static final String QUERY_ANSWER_TRANSLATION_PATTERN = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, Language__c, Question__c, Standard_Question__c, " +
            "Translation__c, Answer__c " +
            "FROM Answer_Translation__c " +
            "{0}";

    private static final String WHERE_BY_QUESTION_ID_PATTERN = "WHERE ts2__Question__c = ''{0}''";
    private static final String WHERE_BY_ANSWERS_ID_PATTERN = "WHERE Id = ''{0}''";
    private static final String WHERE_BY_ANSWERS_AND_LANGUAGE_PATTERN = " WHERE Answer__c = ''{0}'' AND Language__c = ''{1}'' ";

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    public List<Ts2__Answer__c> getAnswersForQuestion(String questionID) {
        LOG.trace("Start getAnswersForQuestion(), questionID :: " + questionID);
        return getSfManager().getListElementsByParam(QUERY_ANSWER_PATTERN, WHERE_BY_QUESTION_ID_PATTERN, Ts2__Answer__c.class,
                questionID);
    }

    public Ts2__Answer__c getAnswersByID(String answersID) {
        LOG.trace("Start getAnswersByID(), answersID :: " + answersID);
        return getSfManager().getElementByParam(QUERY_ANSWER_PATTERN, WHERE_BY_ANSWERS_ID_PATTERN, Ts2__Answer__c.class, answersID);

    }

    public List<Ts2__Answer__c> getAll(){
        return getSfManager().getListElements(QUERY_ANSWER_PATTERN,Ts2__Answer__c.class);
    }

    public Answer_Translation__c getAnswerTranslation(String answerID, String languageID) {
        LOG.trace("Start getAnswerTranslation(), answerID :: " + answerID + ", languageID :: " + languageID);
        return getSfManager().getElementByParam(QUERY_ANSWER_TRANSLATION_PATTERN, WHERE_BY_ANSWERS_AND_LANGUAGE_PATTERN,
                Answer_Translation__c.class, answerID, languageID);
    }

}
