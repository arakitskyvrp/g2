package com.sforce.soap.services.impl;

import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import com.sforce.soap.services.AnswerService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about answers.
 */
@ManagedBean(name = "answerSOAPServiceNew")
@SessionScoped
public class AnswerSOAPService extends BaseSOAPService implements AnswerService {

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
    private static final String WHERE_BY_ANSWERS_AND_LANGUAGE_PATTERN = " WHERE Answer__c = '{0}' AND Language__c = '{1}' ";


    public List<Ts2__Answer__c> getAnswersForQuestion(String questionID) {
        return getAnswersById(WHERE_BY_QUESTION_ID_PATTERN, questionID);
    }

    public List<Ts2__Answer__c> getAnswersByID(String answersID) {
        return getAnswersById(WHERE_BY_ANSWERS_ID_PATTERN, answersID);
    }

    public Answer_Translation__c getAnswerTranslation(String answerID,
                                                      String languageID) {
        String query = buildSqlQuery(QUERY_ANSWER_TRANSLATION_PATTERN, WHERE_BY_ANSWERS_AND_LANGUAGE_PATTERN, answerID, languageID);
        SObject[] records = executeQuery(query);
        if (records != null && records.length > 0) {
            return (Answer_Translation__c) records[0];
        }
        return null;
    }

    private List<Ts2__Answer__c> getAnswersById(String whereSql, String id) {
        if (id == null) {
            return new ArrayList<Ts2__Answer__c>();
        }
        List<Ts2__Answer__c> answers = new ArrayList<Ts2__Answer__c>();

        String query = buildSqlQuery(QUERY_ANSWER_PATTERN, whereSql, id);

        SObject[] records = executeQuery(query);
        if (records != null) {
            for (SObject sObject : records) {
                if (sObject instanceof Ts2__Answer__c) {
                    answers.add((Ts2__Answer__c) sObject);
                }
            }
        }
        return answers;
    }



}
