package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Ts2__Source__c;
import com.vrp.jb2.services.CandidateSourceService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Connects to a remote salesforce repository for information about candidates.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "candidateSourceSOAPServiceNew")
@ApplicationScoped
public class CandidateSourceSOAPService implements CandidateSourceService {

    private static final Logger LOG = Logger.getLogger(CandidateSourceSOAPService.class);

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    private static final String QUERY_SOURCE = "SELECT Id, Name FROM ts2__Source__c";

    public Map<String, String> getSources() {
        LOG.trace("Start getSources()");

        Map<String, String> candidateSources = new HashMap<String, String>();

        List<Ts2__Source__c> sourceList = getSfManager().getListElements(QUERY_SOURCE, Ts2__Source__c.class);
        for (Ts2__Source__c source : sourceList) {
            candidateSources.put(source.getName(), source.getId());
        }

        return candidateSources;
    }

}
