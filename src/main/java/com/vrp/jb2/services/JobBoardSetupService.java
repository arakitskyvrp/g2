package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;

/**
 * Interface to obtain data about job board.
 */
public interface JobBoardSetupService {

    /**
     * Get jobBoard by site name.
     *
     * @param siteName name of site.
     * @return job board.
     */
    public Ts2__Job_Board_Setup__c getBoardSetupBySiteName(String siteName);

}
