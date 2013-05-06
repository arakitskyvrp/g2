package com.sforce.soap.services;

import com.sforce.soap.enterprise.sobject.Contact;

/**
 * Interface to obtain data about contact.
 */
public interface ContactService {
    public boolean checkEmail(String email);
    public Contact saveToDatabase(Contact contact);
    public String getNameByID(String contactID);
}
