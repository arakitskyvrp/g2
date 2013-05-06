package com.sforce.soap.services;

import java.util.List;

import com.sforce.soap.enterprise.sobject.Ts2__Job__c;

public interface SOAPService<T extends com.sforce.soap.enterprise.sobject.SObject> {
	
	public T saveToDatabase(T entity);
	public List<T> listElements();
	T searchForElement(String id);

}
