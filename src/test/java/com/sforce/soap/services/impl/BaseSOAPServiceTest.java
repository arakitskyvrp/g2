package com.sforce.soap.services.impl;

import com.sforce.ws.ConnectionException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.MessageFormat;

import static org.testng.Assert.assertEquals;

/**
 * Test class for {@link AnswerSOAPService}
 */
public class BaseSOAPServiceTest {


    public static final String QUESTION_ID = "testId";


    public static final String QUERY_PATTERN = "Select " +
            "Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, " +
            "ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c " +
            "FROM ts2__Answer__c " +
            "{0} ORDER BY ts2__Order__c ASC";

    public static final String WHERE_BY_QUESTION_ID_PATTERN = "WHERE ts2__Question__c = ''{0}''";
    public static final String WHERE_BY_ANSWERS_ID_PATTERN = "WHERE Id = ''{0}''";

    private AnswerSOAPService answerService;

    @BeforeTest
    public void init(){
        answerService = new AnswerSOAPService();
    }

    @Test
    public void getAnswersForQuestionQuery() {
        String where = " WHERE ts2__Question__c = '" + QUESTION_ID + "' ";
        String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c FROM ts2__Answer__c"
                + where + "ORDER BY ts2__Order__c ASC";

        assertEquals(query,answerService.buildSqlQuery(QUERY_PATTERN,WHERE_BY_QUESTION_ID_PATTERN,QUESTION_ID));
    }

    @Test
    public void getAnswersByIdQuery() {
        String where = " WHERE Id = '" + QUESTION_ID + "' ";
        String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__Question__c, ts2__Answer__c, ts2__Legacy_AnswerID__c, ts2__Order__c, ts2__Score__c, ts2__ts2IsTxt__c FROM ts2__Answer__c"
                + where + "ORDER BY ts2__Order__c ASC";

        assertEquals(query,answerService.buildSqlQuery(QUERY_PATTERN,WHERE_BY_ANSWERS_ID_PATTERN,QUESTION_ID));
    }

    @Test
    public void deleteMe(){
        System.out.println(MessageFormat.format("WHERE Id =  = ''{0}'' ","sdf" ));
    }


}
