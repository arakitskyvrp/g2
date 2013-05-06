package com.vrp.jb2.services;

import com.sforce.soap.enterprise.sobject.Contact;

/**
 * Interface to obtain data about contact.
 */
public interface ContactService {

    /**
     * Check contact email.
     *
     * @param email email for verification.
     * @return {@code true} if there is at least one contact with email.
     */
    public boolean checkEmail(String email);

    /**
     * Saves the contact in the data warehouse (internal database, the database salesforce or others).
     *
     * @param contact contact.
     * @return saved contact.
     */
    public Contact save(Contact contact);

    /**
     * Get name of contact by id.
     *
     * @param contactID id of contact.
     * @return name of contact.
     */
    public String getNameByID(String contactID);
}
