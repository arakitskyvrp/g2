package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;

import java.util.List;

/**
 * Interface to obtain data about job board.
 */
public interface JobBoardSetupService {
    //not used in project
    public Ts2__Job_Board_Setup__c getBoardSetupByName(String name);

    public Ts2__Job_Board_Setup__c getBoardSetupBySiteName(String siteName);

    //not used in project
    public Ts2__Job_Board_Setup__c getBoardSetupBySiteURL(String siteURL);

    public List<Ts2__Job_Board_Setup__c> listElements();
}
