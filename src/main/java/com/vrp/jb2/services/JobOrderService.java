package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

import java.util.List;


/**
 * Interface to obtain data about job order.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
public interface JobOrderService {

    /**
     * Get list of Job order.
     *
     * @return list of Job order.
     */
    public List<Ts2__Job__c> listElements();

    /**
     * Get list of Job order by board setup id.
     *
     * @return list of Job order by board setup id.
     */
    public List<Ts2__Job__c> listAllByJobBoard(String boardSetupID);

    /**
     * Search jobOrder by id.
     *
     * @param id id of jobOrder
     * @return found jobOrder.
     */
    public Ts2__Job__c searchForElement(String id);

    /**
     * Inserts into the sql query for job where part.
     *
     * @param where where part of the sql query
     * @return list of job satisfying the criteria.
     */
    public List<Ts2__Job__c> queryAllWhere(String where); //insert in sql where part

}
