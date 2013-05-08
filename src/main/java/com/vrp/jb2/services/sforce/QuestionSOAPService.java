package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.*;
import com.vrp.jb2.services.QuestionService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Connects to a remote salesforce repository for information about questions.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "questionSOAPServiceNew")
@ApplicationScoped
public class QuestionSOAPService implements QuestionService {

    private static final Logger LOG = Logger.getLogger(QuestionSOAPService.class);

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    private static final String QUERY_STANDARD_QUESTION = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, JobBoardSetup__c, Standard_Question__c " +
            "FROM JBS_StandardQuestions__c" +
            "{0}";
    private static final String QUERY_SOCIAL_QUESTIONS = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, Job_Board_Setup__c, Question__c " +
            "FROM JBS_SocialQuestions__c " +
            "{0}";
    private static final String QUERY_COMPLIANCE_QUESTIONS = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, " +
            "LastModifiedDate, LastModifiedById, SystemModstamp, Job_Board_Setup__c, Question__c " +
            "FROM JBS_ComplianceQuestions__c " +
            "{0}";
    private static final String QUERY_QUESTION = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, " +
            "CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__IsTxt__c, " +
            "ts2__Legacy_QuestionID__c, ts2__Optional__c, ts2__Order__c, ts2__Question_Set__c, " +
            "ts2__Question_Size__c, ts2__Question__c, ts2__Rich_Text_Question__c " +
            "FROM ts2__Question__c" +
            " {0}";
    private static final String QUERY_STANDARD_QUESTION_SINGLE = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, " +
            "CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__ContactField__c, " +
            "ts2__Large_Question__c, ts2__Question_Layout__c, ts2__Question_Size__c, ts2__Question__c, " +
            "ts2__Required_By_Applicant__c, ts2__Rich_Text_Question__c, ts2__TempDateTime__c, ts2__TempDate__c " +
            "FROM ts2__StandardQuestion__c " +
            " {0}";
    private static final String QUERY_CUSTOM_QUESTIONS = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, " +
            "CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__IsTxt__c, " +
            "ts2__Legacy_QuestionID__c, ts2__Optional__c, ts2__Order__c, ts2__Question_Set__c, " +
            "ts2__Question_Size__c, ts2__Question__c, ts2__Rich_Text_Question__c " +
            "FROM ts2__Question__c" +
            " {0}";
    public static final String QUERY_QUESTION_TRANSLATION = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, " +
            "CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Language__c, Standard_Question__c, " +
            "Question__c, Translation__c " +
            "FROM Questions_Translation__c " +
            " {0}";

    private static final String WHERE_JOB_BOARD_SETUP = " WHERE JobBoardSetup__c = ''{0}''";
    private static final String WHERE_QUESTION_SET = " WHERE ts2__Question_Set__c  = ''{0}''";
    private static final String WHERE_BY_ID = " WHERE Id = ''{0}''";
    private static final String WHERE_QUESTION_TRANSLATION = " WHERE Question__c = ''{0}'' AND Language__c = ''{1}''";
    private static final String WHERE_ST_QUESTION_TRANSLATION = " WHERE Standard_Question__c = ''{0}'' " +
            "AND Language__c = ''{1}''";

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    public List<Ts2__StandardQuestion__c> getStandardQuestions(String jobBoardSetupId) {
        LOG.trace("Start getStandardQuestions(), jobBoardSetupId :: " + jobBoardSetupId);

        List<Ts2__StandardQuestion__c> standardQuestions = new ArrayList<Ts2__StandardQuestion__c>();
        List<JBS_StandardQuestions__c> jobBoardList = getSfManager().
                getListElementsByParam(QUERY_STANDARD_QUESTION, WHERE_JOB_BOARD_SETUP, JBS_StandardQuestions__c.class, jobBoardSetupId);
        for (JBS_StandardQuestions__c question : jobBoardList) {
            if (question.getStandard_Question__r() != null) {
                standardQuestions.add(question.getStandard_Question__r());
            } else {
                standardQuestions.add(getStandardQuestionByID(question.getStandard_Question__c()));
            }
        }
        return standardQuestions;
    }

    public List<Ts2__Question__c> getSocialQuestions(String jobBoardSetupId) {
        LOG.trace("Start getSocialQuestions(), jobBoardSetupId :: " + jobBoardSetupId);

        List<Ts2__Question__c> socialQuestions = new ArrayList<Ts2__Question__c>();

        List<JBS_SocialQuestions__c> questionList = getSfManager().getListElementsByParam(QUERY_SOCIAL_QUESTIONS,
                WHERE_JOB_BOARD_SETUP, JBS_SocialQuestions__c.class, jobBoardSetupId);
        for (JBS_SocialQuestions__c question : questionList) {
            if (question.getQuestion__r() != null) {
                socialQuestions.add(question.getQuestion__r());
            } else {
                socialQuestions.add(getQuestionByID(question.getQuestion__c()));
            }
        }
        return socialQuestions;
    }

    public List<Ts2__Question__c> getComplianceQuestions(String jobBoardSetupId) {
        LOG.trace("Start getComplianceQuestions(), jobBoardSetupId :: " + jobBoardSetupId);

        List<Ts2__Question__c> complianceQuestions = new ArrayList<Ts2__Question__c>();
        List<JBS_ComplianceQuestions__c> questionList = getSfManager().getListElementsByParam(
                QUERY_COMPLIANCE_QUESTIONS, WHERE_JOB_BOARD_SETUP, JBS_ComplianceQuestions__c.class, jobBoardSetupId);
        for (JBS_ComplianceQuestions__c question : questionList) {
            if (question.getQuestion__r() != null) {
                complianceQuestions.add(question.getQuestion__r());
            } else {
                complianceQuestions.add(getQuestionByID(question.getQuestion__c()));
            }
        }

        return complianceQuestions;
    }

    public List<Ts2__Question__c> getCustomQuestions(Ts2__Job__c jobOrder) {
        LOG.trace("Start getCustomQuestions(), jobOrder :: " + jobOrder);

        List<Ts2__Question__c> questions = new ArrayList<Ts2__Question__c>();
        if (jobOrder.getTs2__Question_Set__r() != null) {
            Ts2__Question_Set__c questionSet = jobOrder.getTs2__Question_Set__r();
            if (questionSet.getTs2__Questions__r() != null) {
                questions.addAll(getQuestionsFromQueryResult(questionSet.getTs2__Questions__r()));
            }
        }
        if (questions.isEmpty() && jobOrder.getTs2__Question_Set__c() != null
                && !jobOrder.getTs2__Question_Set__c().isEmpty()) {
            return getSfManager().getListElementsByParam(QUERY_CUSTOM_QUESTIONS, WHERE_QUESTION_SET,
                    Ts2__Question__c.class, jobOrder.getTs2__Question_Set__c());
        }
        return questions;
    }

    private List<Ts2__Question__c> getQuestionsFromQueryResult(QueryResult queryResult) {
        LOG.trace("Start getQuestionsFromQueryResult(), queryResult :: " + queryResult);

        List<Ts2__Question__c> questions = new ArrayList<Ts2__Question__c>();
        SObject[] records = queryResult.getRecords();
        if (records != null) {
            for (SObject sObject : records) {
                if (sObject instanceof Ts2__Question__c) {
                    questions.add((Ts2__Question__c) sObject);
                }
            }
        }
        return questions;
    }

    public Ts2__Question__c getQuestionByID(String id) {
        LOG.trace("Start getQuestionByID(), id :: " + id);
        return getSfManager().getElementByParam(QUERY_QUESTION, WHERE_BY_ID, Ts2__Question__c.class, id);
    }

    public Ts2__StandardQuestion__c getStandardQuestionByID(String id) {
        LOG.trace("Start getStandardQuestionByID(), id :: " + id);

        return getSfManager().getElementByParam(QUERY_STANDARD_QUESTION_SINGLE, WHERE_BY_ID,
                Ts2__StandardQuestion__c.class, id);

    }

    public Questions_Translation__c getQuestionTranslation(String questionID, String languageID) {
        LOG.trace("Start getQuestionTranslation(), questionID :: " + questionID + ", languageID :: " + languageID);
        return getSfManager().getElementByParam(QUERY_QUESTION_TRANSLATION, WHERE_QUESTION_TRANSLATION,
                Questions_Translation__c.class, questionID, languageID);
    }

    public Questions_Translation__c getStandardQuestionTranslation(String standardQuestionID, String languageID) {
        LOG.trace("Start getStandardQuestionTranslation(), standardQuestionID :: " + standardQuestionID + ", languageID :: " + languageID);
        return getSfManager().getElementByParam(QUERY_QUESTION_TRANSLATION, WHERE_ST_QUESTION_TRANSLATION,
                Questions_Translation__c.class, standardQuestionID, languageID);
    }


}
