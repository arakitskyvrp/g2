package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.Ts2__Referral__c;

import java.util.List;

/**
 * Service for work with the referral.
 */
public interface ReferralService {

    public Ts2__Referral__c saveToDatabase(Ts2__Referral__c referral);

    //not implemented, always return null
    public List<Ts2__Referral__c> listElements();

    //not implemented, always return null
    public Ts2__Referral__c searchForElement(String id);
}
