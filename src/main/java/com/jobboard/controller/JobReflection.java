package com.jobboard.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.PicklistEntry;
import com.sforce.soap.services.SOAPConnectionService;
import com.sforce.ws.ConnectionException;

public class JobReflection {

	private static SOAPConnectionService connectionService = new SOAPConnectionService();
	private static Map<String, List<PicklistEntry>> picklistFields = new HashMap<String, List<PicklistEntry>>();
	private static DescribeSObjectResult DESCRIBE;
	static {

		try {
			DESCRIBE = connectionService
					.getEnterpriseConnection().describeSObject("ts2__Job__c");
			Field[] fields = DESCRIBE.getFields();
			for (Field field : fields) {
				PicklistEntry[] picklistValues = field.getPicklistValues();
				if (picklistValues != null) {
					picklistFields.put(field.getName(),
							Arrays.asList(picklistValues));
				}
			}

		} catch (ConnectionException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}
	
	public static Field getFieldByName(String fieldName){
		Field[] fields = DESCRIBE.getFields();
		for (Field field : fields) {
			if (field.getName().equals(fieldName)) {
				return field;
			}
		}
		return null;
	}
	
	public static Field getFieldByLabel(String fieldLabel){
		Field[] fields = DESCRIBE.getFields();
		for (Field field : fields) {
			if (field.getLabel().equals(fieldLabel)) {
				return field;
			}
		}
		return null;
	}

	public static List<PicklistEntry> getPicklistEntries(
			String picklistFieldName) {
		if (picklistFields.containsKey(picklistFieldName)) {
			return picklistFields.get(picklistFieldName);
		}
		return null;
	}

}
