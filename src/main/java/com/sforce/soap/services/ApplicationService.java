package com.sforce.soap.services;

import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Ts2__Application__c;

import java.util.List;

/**
 * Interface to obtain data about application.
 */
public interface ApplicationService {
    public List<Ts2__Application__c> getApplicationsByCandidateID(String candidateID);
    public boolean isApplicationAlredySent(String candidateID, String jobOrderID);  //(Select .. WHERE ts2__Job__c = jobOrderID AND ts2__Candidate_Contact__c = candidateID).getRecords() is not empty
    public SaveResult saveApplicationToSalesforce(Ts2__Application__c application);
}
