package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.sobject.Contact;
import com.vrp.jb2.services.ContactService;
import org.apache.log4j.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.Arrays;

/**
 * Connects to a remote salesforce repository for information about answers.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "contactSOAPServiceNew")
@ApplicationScoped
public class ContactSOAPService implements ContactService {

    private static final Logger LOG = Logger.getLogger(ContactSOAPService.class);

    private static final String QUERY_CONTACT_NAME = "SELECT Name FROM contact {0}";
    private static final String QUERY_CONTACT = "SELECT Id, email, firstname, lastname, phone, mobilephone, " +
            "mailingstreet, mailingcountry, mailingcity, mailingpostalcode, Ts2__Contact_Method__c, " +
            "Ts2__Source__c FROM contact {0}";
    private static final String WHERE_BY_EMAIL = "Where email = ''{0}''";
    private static final String WHERE_BY_ID = "Where Id = ''{0}''";

    @ManagedProperty(value = "#{salesForceManager}")
    private SalesForceManager sfManager;

    public void setSfManager(SalesForceManager sfManager) {
        this.sfManager = sfManager;
    }

    private SalesForceManager getSfManager() {
        return sfManager;
    }

    @Override
    public boolean checkEmail(String email) {
        LOG.trace("Start checkEmail(), email :: " + email);
        return getSfManager().isNotNullResult(QUERY_CONTACT_NAME, WHERE_BY_EMAIL, email);

    }

    @Override
    public Contact save(Contact contact) {
        return getSfManager().saveToSalesforce(contact);
    }


    public String getNameByID(String contactID) {
        LOG.trace("Start getNameByID(), contactID :: " + contactID);
        Contact contact = getSfManager().getElementByParam(QUERY_CONTACT_NAME, WHERE_BY_ID, Contact.class, contactID);
        if (contact == null) {
            return null;
        }
        return contact.getName();
    }

    public Contact getContactById(String id) {
        LOG.trace("Start getContactById(), id :: " + id);
        return getSfManager().getElementByParam(QUERY_CONTACT, WHERE_BY_ID, Contact.class, id);
    }

    public boolean updateRecords(Contact[] records) {
        LOG.trace("Start updateRecords(), records :: " + Arrays.toString(records));
        return getSfManager().updateListToSalesforce(records);
    }

}
