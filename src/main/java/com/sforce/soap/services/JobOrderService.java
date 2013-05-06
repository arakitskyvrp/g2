package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

import java.util.List;


/**
 * Interface to obtain data about job order.
 */
public interface JobOrderService {
    public List<Ts2__Job__c> listElements();
    public List<Ts2__Job__c> listAllByJobBoard(String boardSetupID);
    public Ts2__Job__c searchForElement(String id);
    public List<Ts2__Job__c> queryAllWhere(String where); //insert in sql where part

}
