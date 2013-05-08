package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Ts2__Application__c;

import java.util.List;

/**
 * Interface to obtain data about application.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
public interface ApplicationService {

    /**
     * Get list of application by candidate id.
     *
     * @param candidateID id of candidate.
     * @return list of application.
     */
    public List<Ts2__Application__c> getApplicationsByCandidateID(String candidateID);

    /**
     * @param candidateID id of candidate.
     * @param jobOrderID  id of jobOrder.
     * @return {@code true} if the application has been successfully sent.
     */
    public boolean isApplicationAlredySent(String candidateID, String jobOrderID);  //(Select .. WHERE ts2__Job__c = jobOrderID AND ts2__Candidate_Contact__c = candidateID).getRecords() is not empty

    /**
     * Saves the application in the data warehouse (internal database, the database salesforce or others).
     *
     * @param application the application.
     * @return result of conservation.
     */
    public Ts2__Application__c save(Ts2__Application__c application);
}
