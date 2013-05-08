package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Referral__c;
import com.vrp.jb2.services.ReferralService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * Connects to a remote salesforce repository for information about referrals.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "questionSOAPServiceNew")
@ApplicationScoped
public class ReferralSOAPService implements ReferralService {

    private static final Logger LOG = Logger.getLogger(ReferralSOAPService.class);

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public SalesForceManager getSfManager() {
        return sfManager;
    }

    public void setSfManager(SalesForceManager sfManager) {
        LOG.trace("Start setSfManager(), sfManager :: " + sfManager);
        this.sfManager = sfManager;
    }

    public Ts2__Referral__c save(Ts2__Referral__c referral) {
        LOG.trace("Start setSfManager(), referral :: " + referral);

        return getSfManager().saveToSalesforce(referral);
    }

}
