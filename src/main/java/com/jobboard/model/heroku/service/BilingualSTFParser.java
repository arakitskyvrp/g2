package com.jobboard.model.heroku.service;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sforce.soap.metadata.CustomApplicationTranslation;
import com.sforce.soap.metadata.CustomDataTypeTranslation;
import com.sforce.soap.metadata.CustomFieldTranslation;
import com.sforce.soap.metadata.CustomLabelTranslation;
import com.sforce.soap.metadata.LayoutSectionTranslation;
import com.sforce.soap.metadata.PicklistValueTranslation;
import com.sforce.soap.metadata.RecordTypeTranslation;
import com.sforce.soap.metadata.ReportTypeTranslation;
import com.sforce.soap.metadata.Translations;

public class BilingualSTFParser {

	public static void main(String[] args) {

	}

	public static LanguageTranslationWrapper translateBilingualSTF(
			byte[] translationFile) {
		Translations translations = new Translations();
		List<CustomDataTypeTranslation> customDataTypeTranslations = new ArrayList<CustomDataTypeTranslation>();
		List<CustomApplicationTranslation> applicationTranslations = new ArrayList<CustomApplicationTranslation>();
		Map<String, ArrayList<CustomFieldTranslation>> objectCustomFieldTranslation = new HashMap<String, ArrayList<CustomFieldTranslation>>();
		List<ReportTypeTranslation> reportTypeTranslations = new ArrayList<ReportTypeTranslation>();
		List<LayoutSectionTranslation> layoutSectionTranslations = new ArrayList<LayoutSectionTranslation>();
		Map<String, Map<String, List<PicklistValueTranslation>>> objectFieldPicklistValueTranslationMap = new HashMap<String, Map<String, List<PicklistValueTranslation>>>();
		List<RecordTypeTranslation> recordTypeTranslations = new ArrayList<RecordTypeTranslation>();
		List<CustomLabelTranslation> customLabelTranslations = new ArrayList<CustomLabelTranslation>();

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
				translationFile);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					byteArrayInputStream, "UTF8"));
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				} else if (line.startsWith("Language code: ")) {
					translations.setFullName(line
							.replace("Language code: ", ""));
				} else if (line.startsWith("ButtonOrLink")) {
					customDataTypeTranslations.add(handleButtonOrLink(line));
				} else if (line.startsWith("CustomApp")) {
					applicationTranslations.add(handleCustomApp(line));
				} else if (line.startsWith("CustomField")) {
					String objectName = findCustomFieldObjectName(line);
					CustomFieldTranslation customFieldTranslation = handleCustomField(line);
					if (!objectCustomFieldTranslation.containsKey(objectName)) {
						objectCustomFieldTranslation.put(objectName,
								new ArrayList<CustomFieldTranslation>());
					}
					objectCustomFieldTranslation.get(objectName).add(
							customFieldTranslation);

				} else if (line.startsWith("CustomReportType")) {
					reportTypeTranslations.add(handleCustomReportType(line));
				} else if (line.startsWith("LayoutSection")) {
					layoutSectionTranslations.add(handleLayoutSection(line));
				} else if (line.startsWith("PicklistValue")) {
					String objectName = findPicklistValueObjectName(line);
					if (!objectFieldPicklistValueTranslationMap
							.containsKey(objectName)) {
						objectFieldPicklistValueTranslationMap
								.put(objectName,
										new HashMap<String, List<PicklistValueTranslation>>());
					}
					String fieldName = findPicklistValueFieldName(line);
					if (!objectFieldPicklistValueTranslationMap.get(objectName)
							.containsKey(fieldName)) {
						objectFieldPicklistValueTranslationMap
								.get(objectName)
								.put(fieldName,
										new ArrayList<PicklistValueTranslation>());
					}
					objectFieldPicklistValueTranslationMap.get(objectName)
							.get(fieldName).add(handlePicklistValue(line));
				} else if (line.startsWith("RecordType")) {
					recordTypeTranslations.add(handleRecordType(line));
				} else if (line.startsWith("CustomLabel")) {
					customLabelTranslations.add(handleCustomLabel(line));
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (!applicationTranslations.isEmpty()) {
			translations
					.setCustomApplications(applicationTranslations
							.toArray(new CustomApplicationTranslation[applicationTranslations
									.size()]));
		}
		if (!customDataTypeTranslations.isEmpty()) {
			translations
					.setCustomDataTypeTranslations(customDataTypeTranslations
							.toArray(new CustomDataTypeTranslation[customDataTypeTranslations
									.size()]));
		}
		if (!customLabelTranslations.isEmpty()) {
			translations.setCustomLabels(customLabelTranslations
					.toArray(new CustomLabelTranslation[customLabelTranslations
							.size()]));
		}
		return new LanguageTranslationWrapper(translations.getFullName(),
				translations, objectCustomFieldTranslation,
				objectFieldPicklistValueTranslationMap);
	}

	private static String findCustomFieldObjectName(String line) {
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		String name = split2[split2.length - 3];
		return name;
	}

	private static String findPicklistValueObjectName(String line) {
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		String name = split2[split2.length - 3];
		return name;
	}

	private static String findPicklistValueFieldName(String line) {
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		String name = split2[split2.length - 2];
		return name;
	}

	private static CustomLabelTranslation handleCustomLabel(String line) {
		CustomLabelTranslation customLabelTranslation = new CustomLabelTranslation();
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		customLabelTranslation.setName(split2[split2.length - 1]);
		String label = split[split.length - 1];
		if (label.equals("-")) {
			label = split[split.length - 2];
		}
		customLabelTranslation.setLabel(label);
		return customLabelTranslation;
	}

	private static RecordTypeTranslation handleRecordType(String line) {
		// TODO Auto-generated method stub
		return new RecordTypeTranslation();
	}

	private static PicklistValueTranslation handlePicklistValue(String line) {
		PicklistValueTranslation picklistValueTranslation = new PicklistValueTranslation();
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");

		String masterLabel = split2[split2.length - 1];
		if (masterLabel.contains("_")) {
			masterLabel = masterLabel
					.substring(0, masterLabel.lastIndexOf('_'));
		}
		picklistValueTranslation.setMasterLabel(masterLabel);

		String label = split[split.length - 1];
		if (label.equals("-")) {
			label = split[split.length - 2];
		}
		picklistValueTranslation.setTranslation(label);
		return picklistValueTranslation;
	}

	private static LayoutSectionTranslation handleLayoutSection(String line) {
		// TODO Auto-generated method stub
		return new LayoutSectionTranslation();
	}

	private static ReportTypeTranslation handleCustomReportType(String line) {
		// TODO Auto-generated method stub
		return new ReportTypeTranslation();
	}

	private static CustomFieldTranslation handleCustomField(String line) {
		CustomFieldTranslation customFieldTranslation = new CustomFieldTranslation();
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		customFieldTranslation.setName(split2[split2.length - 2]);
		String label = split[split.length - 1];
		if (label.equals("-")) {
			label = split[split.length - 2];
		}
		customFieldTranslation.setLabel(label);
		return customFieldTranslation;
	}

	private static CustomDataTypeTranslation handleButtonOrLink(String line) {
		CustomDataTypeTranslation customDataTypeTranslation = new CustomDataTypeTranslation();
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		customDataTypeTranslation
				.setCustomDataTypeName(split2[split2.length - 1]);
		String label = split[split.length - 1];
		if (label.equals("-")) {
			label = split[split.length - 2];
		}
		customDataTypeTranslation.setLabel(label);
		return customDataTypeTranslation;
	}

	private static CustomApplicationTranslation handleCustomApp(String line) {
		CustomApplicationTranslation customApplicationTranslation = new CustomApplicationTranslation();
		String[] split = line.split("	");
		String[] split2 = split[0].split("\\.");
		customApplicationTranslation.setName(split2[split2.length - 1]);
		String label = split[split.length - 1];
		if (label.equals("-")) {
			label = split[split.length - 2];
		}
		customApplicationTranslation.setLabel(label);
		return customApplicationTranslation;
	}

	public static class LanguageTranslationWrapper {
		private String language;
		private Translations translations;

		private Map<String, ArrayList<CustomFieldTranslation>> objectCustomFieldTranslation = new HashMap<String, ArrayList<CustomFieldTranslation>>();
		private Map<String, Map<String, List<PicklistValueTranslation>>> objectFieldPicklistValueTranslationMap = new HashMap<String, Map<String, List<PicklistValueTranslation>>>();

		public LanguageTranslationWrapper(
				String language,
				Translations translations,
				Map<String, ArrayList<CustomFieldTranslation>> objectCustomFieldTranslation,
				Map<String, Map<String, List<PicklistValueTranslation>>> objectFieldPicklistValueTranslationMap) {
			super();
			this.setLanguage(language);
			this.setTranslations(translations);
			this.setObjectCustomFieldTranslation(objectCustomFieldTranslation);
			this.setObjectFieldPicklistValueTranslationMap(objectFieldPicklistValueTranslationMap);
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public Translations getTranslations() {
			return translations;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public Map<String, ArrayList<CustomFieldTranslation>> getObjectCustomFieldTranslation() {
			return objectCustomFieldTranslation;
		}

		public void setObjectCustomFieldTranslation(
				Map<String, ArrayList<CustomFieldTranslation>> objectCustomFieldTranslation) {
			this.objectCustomFieldTranslation = objectCustomFieldTranslation;
		}

		public Map<String, Map<String, List<PicklistValueTranslation>>> getObjectFieldPicklistValueTranslationMap() {
			return objectFieldPicklistValueTranslationMap;
		}

		public void setObjectFieldPicklistValueTranslationMap(
				Map<String, Map<String, List<PicklistValueTranslation>>> objectFieldPicklistValueTranslationMap) {
			this.objectFieldPicklistValueTranslationMap = objectFieldPicklistValueTranslationMap;
		}

		public String getCustomFieldTranslation(String objectName,
				String fieldName) {
			if (fieldName.endsWith("__c")) {
				fieldName = fieldName.substring(0, fieldName.length() - 3);
			}
			System.out.println("Custom field value translatuon fieldname>"
					+ fieldName);
			if (getObjectCustomFieldTranslation().containsKey(objectName)) {
				ArrayList<CustomFieldTranslation> arrayList = getObjectCustomFieldTranslation()
						.get(objectName);
				for (CustomFieldTranslation customFieldTranslation : arrayList) {
					if (customFieldTranslation.getName().equals(fieldName)) {
						return customFieldTranslation.getLabel();
					}
				}
			}
			return null;
		}

		public String getPicklistValueTranslation(String objectName,
				String fieldName, String masterLabel) {
			if (fieldName.endsWith("__c")) {
				fieldName = fieldName.substring(0, fieldName.length() - 3);
			}
			System.out.println("Picklist value translatuon fieldname>"
					+ fieldName);
			if (getObjectFieldPicklistValueTranslationMap().containsKey(
					objectName)
					&& getObjectFieldPicklistValueTranslationMap().get(
							objectName).containsKey(fieldName)) {
				List<PicklistValueTranslation> list = getObjectFieldPicklistValueTranslationMap()
						.get(objectName).get(fieldName);
				for (PicklistValueTranslation picklistValueTranslation : list) {
					if (picklistValueTranslation.getMasterLabel().equals(
							masterLabel)) {
						return picklistValueTranslation.getTranslation();
					}
				}
			}
			return masterLabel;
		}

	}

}
