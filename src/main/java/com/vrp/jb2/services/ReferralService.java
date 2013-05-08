package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Ts2__Referral__c;

/**
 * Service for work with the referral.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
public interface ReferralService {

    /**
     * Saves the referral in the data warehouse (internal database, the database salesforce or others).
     *
     * @param referral referral.
     * @return saved referral.
     */
    public Ts2__Referral__c save(Ts2__Referral__c referral);

}
