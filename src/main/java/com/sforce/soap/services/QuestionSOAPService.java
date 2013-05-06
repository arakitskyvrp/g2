package com.sforce.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.JBS_ComplianceQuestions__c;
import com.sforce.soap.enterprise.sobject.JBS_SocialQuestions__c;
import com.sforce.soap.enterprise.sobject.JBS_StandardQuestions__c;
import com.sforce.soap.enterprise.sobject.Questions_Translation__c;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Ts2__Job_Board_Setup__c;
import com.sforce.soap.enterprise.sobject.Ts2__Job__c;
import com.sforce.soap.enterprise.sobject.Ts2__Question_Set__c;
import com.sforce.soap.enterprise.sobject.Ts2__Question__c;
import com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c;
import com.sforce.ws.ConnectionException;

@ManagedBean(name = "questionSOAPService")
@SessionScoped
public class QuestionSOAPService {

	@ManagedProperty(value = "#{soapConnectionService}")
	private SOAPConnectionService connectionService;

	public SOAPConnectionService getConnectionService() {
		return connectionService;
	}

	public void setConnectionService(SOAPConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	public List<Ts2__StandardQuestion__c> getStandardQuestions(
			Ts2__Job_Board_Setup__c jobBoardSetup) {
		List<Ts2__StandardQuestion__c> standardQuestions = new ArrayList<Ts2__StandardQuestion__c>();
		String where = " WHERE JobBoardSetup__c = '" + jobBoardSetup.getId()
				+ "'";
		String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, JobBoardSetup__c, Standard_Question__c FROM JBS_StandardQuestions__c"
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof JBS_StandardQuestions__c) {
						if (((JBS_StandardQuestions__c) sObject)
								.getStandard_Question__r() != null) {
							standardQuestions
									.add(((JBS_StandardQuestions__c) sObject)
											.getStandard_Question__r());
						} else {
							standardQuestions
									.add(getStandardQuestionByID(((JBS_StandardQuestions__c) sObject)
											.getStandard_Question__c()));
						}
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return standardQuestions;
	}

	public List<Ts2__Question__c> getSocialQuestions(
			Ts2__Job_Board_Setup__c jobBoardSetup) {

		List<Ts2__Question__c> socialQuestions = new ArrayList<Ts2__Question__c>();

		String where = " WHERE Job_Board_Setup__c = '" + jobBoardSetup.getId()
				+ "'";
		String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Job_Board_Setup__c, Question__c FROM JBS_SocialQuestions__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof JBS_SocialQuestions__c) {
						if (((JBS_SocialQuestions__c) sObject).getQuestion__r() != null) {
							socialQuestions
									.add(((JBS_SocialQuestions__c) sObject)
											.getQuestion__r());
						} else {
							socialQuestions
									.add(getQuestionByID(((JBS_SocialQuestions__c) sObject)
											.getQuestion__c()));
						}
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return socialQuestions;
	}

	public List<Ts2__Question__c> getComplianceQuestions(
			Ts2__Job_Board_Setup__c jobBoardSetup) {

		List<Ts2__Question__c> complianceQuestions = new ArrayList<Ts2__Question__c>();

		String where = " WHERE Job_Board_Setup__c = '" + jobBoardSetup.getId()
				+ "'";
		String query = "Select Id, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Job_Board_Setup__c, Question__c FROM JBS_ComplianceQuestions__c"
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof JBS_ComplianceQuestions__c) {
						if (((JBS_ComplianceQuestions__c) sObject)
								.getQuestion__r() != null) {
							complianceQuestions
									.add(((JBS_ComplianceQuestions__c) sObject)
											.getQuestion__r());
						} else {
							complianceQuestions
									.add(getQuestionByID(((JBS_ComplianceQuestions__c) sObject)
											.getQuestion__c()));
						}
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return complianceQuestions;
	}

	public List<Ts2__Question__c> getCustomQuestions(Ts2__Job__c jobOrder) {
		List<Ts2__Question__c> questions = new ArrayList<Ts2__Question__c>();
		if (jobOrder.getTs2__Question_Set__r() != null) {
			Ts2__Question_Set__c questionSet = jobOrder
					.getTs2__Question_Set__r();
			if (questionSet.getTs2__Questions__r() != null) {
				List<Ts2__Question__c> questionsFromQueryResult = getQuestionsFromQueryResult(questionSet
						.getTs2__Questions__r());
				questions.addAll(questionsFromQueryResult);
			}
		}
		if (questions.isEmpty() && jobOrder.getTs2__Question_Set__c() != null
				&& !jobOrder.getTs2__Question_Set__c().isEmpty()) {
			String where = " WHERE ts2__Question_Set__c = '"
					+ jobOrder.getTs2__Question_Set__c() + "' ";
			String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__IsTxt__c, ts2__Legacy_QuestionID__c, ts2__Optional__c, ts2__Order__c, ts2__Question_Set__c, ts2__Question_Size__c, ts2__Question__c, ts2__Rich_Text_Question__c FROM ts2__Question__c"
					+ where;
			try {
				QueryResult queryResult = getConnectionService()
						.getEnterpriseConnection().query(query);
				questions.addAll(getQuestionsFromQueryResult(queryResult));
			} catch (ConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// List<Ts2__Question_Set__c> questionSets
		return questions;
	}

	public static List<Ts2__Question__c> getQuestionsFromQueryResult(
			QueryResult queryResult) {
		List<Ts2__Question__c> questions = new ArrayList<Ts2__Question__c>();
		SObject[] records = queryResult.getRecords();
		if (records != null) {
			for (SObject sObject : records) {
				if (sObject instanceof Ts2__Question__c) {
					questions.add((Ts2__Question__c) sObject);
				}
			}
		}
		return questions;
	}

	// private List<Ts2__StandardQuestion__c> getStandardQuestions(
	// String jobBoardSetup) {
	// Ts2__Job_Board_Setup__c board_Setup__c = new Ts2__Job_Board_Setup__c();
	// board_Setup__c.setId(jobBoardSetup);
	// return getStandardQuestions(board_Setup__c);
	// }
	//
	// private List<Ts2__Question__c> getSocialQuestions(
	// String jobBoardSetup) {
	// Ts2__Job_Board_Setup__c board_Setup__c = new Ts2__Job_Board_Setup__c();
	// board_Setup__c.setId(jobBoardSetup);
	// return getSocialQuestions(board_Setup__c);
	// }
	//
	// private List<Ts2__Question__c> getComplianceQuestions(
	// String jobBoardSetup) {
	// Ts2__Job_Board_Setup__c board_Setup__c = new Ts2__Job_Board_Setup__c();
	// board_Setup__c.setId(jobBoardSetup);
	// return getComplianceQuestions(board_Setup__c);
	// }

	public static void main(String[] args) {
		QuestionSOAPService questionService = new QuestionSOAPService();
		questionService.setConnectionService(new SOAPConnectionService());
		Ts2__Job_Board_Setup__c JBS = new Ts2__Job_Board_Setup__c();
		JBS.setId("a0Gi0000000DNOmEAO");
		List<Ts2__Question__c> socialQuestions = questionService
				.getSocialQuestions(JBS);
		if (socialQuestions != null) {
			System.out.println("socialQuestions: ");
			for (Ts2__Question__c ts2__Question__c : socialQuestions) {
				System.out.println(ts2__Question__c.getTs2__Question__c());
			}
		}
		List<Ts2__Question__c> complianceQuestions = questionService
				.getComplianceQuestions(JBS);
		if (complianceQuestions != null) {
			System.out.println("complianceQuestions: ");
			for (Ts2__Question__c ts2__Question__c : complianceQuestions) {
				System.out.println(ts2__Question__c.getTs2__Question__c());
			}
		}
		List<Ts2__StandardQuestion__c> standardQuestions = questionService
				.getStandardQuestions(JBS);
		if (standardQuestions != null) {
			System.out.println("standardQuestions: ");
			for (Ts2__StandardQuestion__c ts2__StandardQuestion__c : standardQuestions) {
				System.out.println(ts2__StandardQuestion__c
						.getTs2__Question__c());
				List<Questions_Translation__c> standardQuestionTranslation = questionService.getStandardQuestionTranslation(ts2__StandardQuestion__c.getId());
				if (standardQuestionTranslation!=null) {
					System.out.println(">>>>>>Translations");
					for (Questions_Translation__c questions_Translation__c : standardQuestionTranslation) {
						System.out.println(questions_Translation__c.getTranslation__c());
					}
				}else {
					System.out.println("no translations found");
				}
			}
		}

	}

	public Ts2__Question__c getQuestionByID(String id) {
		Ts2__Question__c question = null;
		String where = " WHERE Id = '" + id + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__IsTxt__c, ts2__Legacy_QuestionID__c, ts2__Optional__c, ts2__Order__c, ts2__Question_Set__c, ts2__Question_Size__c, ts2__Question__c, ts2__Rich_Text_Question__c FROM ts2__Question__c"
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				if (records[0] instanceof Ts2__Question__c) {
					question = (Ts2__Question__c) records[0];
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}

	public Ts2__StandardQuestion__c getStandardQuestionByID(String id) {

		Ts2__StandardQuestion__c question = null;
		String where = " WHERE Id = '" + id + "' ";
		String query = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, ts2__ContactField__c, ts2__Large_Question__c, ts2__Question_Layout__c, ts2__Question_Size__c, ts2__Question__c, ts2__Required_By_Applicant__c, ts2__Rich_Text_Question__c, ts2__TempDateTime__c, ts2__TempDate__c FROM ts2__StandardQuestion__c "
				+ where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null && records.length > 0) {
				if (records[0] instanceof Ts2__StandardQuestion__c) {
					question = (Ts2__StandardQuestion__c) records[0];
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;

	}

	public List<Questions_Translation__c> getQuestionTranslation(
			String questionID) {
		String where = " WHERE Question__c = '" + questionID + "' ";
		return getTranslation(where);
	}

	public Questions_Translation__c getQuestionTranslation(String questionID,
			String languageID) {
		String where = " WHERE Question__c = '" + questionID
				+ "' AND Language__c = '" + languageID + "' ";
		List<Questions_Translation__c> translations = getTranslation(where);
		if (translations != null && !translations.isEmpty()) {
			return translations.get(0);
		}
		return null;
	}

	public List<Questions_Translation__c> getStandardQuestionTranslation(
			String standardQuestionID) {
		String where = " WHERE Standard_Question__c = '" + standardQuestionID
				+ "' ";
		return getTranslation(where);
	}

	public Questions_Translation__c getStandardQuestionTranslation(
			String standardQuestionID, String languageID) {
		String where = " WHERE Standard_Question__c = '" + standardQuestionID
				+ "' AND Language__c = '" + languageID + "' ";
		List<Questions_Translation__c> translations = getTranslation(where);
		if (translations != null && !translations.isEmpty()) {
			return translations.get(0);
		}
		return null;
	}

	public List<Questions_Translation__c> getTranslation(String where) {
		List<Questions_Translation__c> questionTranslations = new ArrayList<Questions_Translation__c>();
		String query = "Select Id, OwnerId, IsDeleted, Name, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, Language__c, Standard_Question__c, Question__c, Translation__c FROM Questions_Translation__c "+where;
		try {
			QueryResult queryResult = getConnectionService()
					.getEnterpriseConnection().query(query);
			SObject[] records = queryResult.getRecords();
			if (records != null) {
				for (SObject sObject : records) {
					if (sObject instanceof Questions_Translation__c) {
						questionTranslations
								.add((Questions_Translation__c) sObject);
					}
				}
			}
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questionTranslations;
	}

}
