package com.jobboard.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import com.sforce.soap.enterprise.sobject.Answer_Translation__c;
import com.sforce.soap.enterprise.sobject.Language__c;
import com.sforce.soap.enterprise.sobject.Questions_Translation__c;
import com.sforce.soap.enterprise.sobject.Ts2__Answer__c;
import com.sforce.soap.enterprise.sobject.Ts2__Question__c;
import com.sforce.soap.enterprise.sobject.Ts2__StandardQuestion__c;
import com.sforce.soap.services.AnswerSOAPService;
import com.sforce.soap.services.QuestionSOAPService;

@ManagedBean(name = "questionsController")
@SessionScoped
public class QuestionsController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4078992516210145621L;
	private List<Ts2__StandardQuestion__c> standardQuestions = new ArrayList<Ts2__StandardQuestion__c>();
	private List<Ts2__Question__c> socialQuestions = new ArrayList<Ts2__Question__c>();
	private List<Ts2__Question__c> complianceQuestions = new ArrayList<Ts2__Question__c>();
	private List<Ts2__Question__c> customQuestions = new ArrayList<Ts2__Question__c>();

	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;

	@ManagedProperty(value = "#{jorderDetail}")
	private JobOrderDetailControler jobOrderDetailControler;

	@ManagedProperty(value = "#{questionSOAPService}")
	private QuestionSOAPService questionService;

	@ManagedProperty(value = "#{answerSOAPService}")
	private AnswerSOAPService answerSOAPService;

	private QuestionSet setOrder;

	private List<QuestionModel> questionModel = new ArrayList<QuestionsController.QuestionModel>();

	@ManagedProperty(value = "#{label}")
	private LabelController labelController;

	public QuestionsController() {
	}

	public enum QuestionSet {
		STANDARD, SOCIAL, COMPLIANCE, CUSTOM
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public List<Ts2__StandardQuestion__c> getStandardQuestions() {
		if (standardQuestions.isEmpty()) {
			List<Ts2__StandardQuestion__c> standardQuestions = getQuestionService()
					.getStandardQuestions(getJobSearchController().getJBSetup());
			if (standardQuestions != null && !standardQuestions.isEmpty()) {
				this.standardQuestions.addAll(standardQuestions);
			}
		}
		return standardQuestions;
	}

	public void setStandardQuestions(
			List<Ts2__StandardQuestion__c> standardQuestions) {
		this.standardQuestions = standardQuestions;
	}

	public List<Ts2__Question__c> getSocialQuestions() {
		if (socialQuestions.isEmpty()) {
			List<Ts2__Question__c> socialQuestions = getQuestionService()
					.getSocialQuestions(getJobSearchController().getJBSetup());
			if (socialQuestions != null && !socialQuestions.isEmpty()) {
				this.socialQuestions.addAll(socialQuestions);
			}
		}
		return socialQuestions;
	}

	public void setSocialQuestions(List<Ts2__Question__c> socialQuestions) {
		this.socialQuestions = socialQuestions;
	}

	public List<Ts2__Question__c> getComplianceQuestions() {
		if (complianceQuestions.isEmpty()) {
			List<Ts2__Question__c> complianceQuestions = getQuestionService()
					.getComplianceQuestions(
							getJobSearchController().getJBSetup());
			if (complianceQuestions != null && !complianceQuestions.isEmpty()) {
				this.complianceQuestions.addAll(complianceQuestions);
			}
		}
		return complianceQuestions;
	}

	public void setComplianceQuestions(
			List<Ts2__Question__c> complianceQuestions) {
		this.complianceQuestions = complianceQuestions;
	}

	public List<Ts2__Question__c> getCustomQuestions() {
		if (customQuestions.isEmpty()) {
			List<Ts2__Question__c> customQuestions = getQuestionService()
					.getCustomQuestions(
							getJobOrderDetailControler().getJobOrder());
			if (customQuestions != null && !customQuestions.isEmpty()) {
				this.customQuestions.addAll(customQuestions);
			}
		}
		return customQuestions;
	}

	public void setCustomQuestions(List<Ts2__Question__c> customQuestions) {
		this.customQuestions = customQuestions;
	}

	public QuestionSOAPService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionSOAPService questionService) {
		this.questionService = questionService;
	}

	public AnswerSOAPService getAnswerSOAPService() {
		return answerSOAPService;
	}

	public void setAnswerSOAPService(AnswerSOAPService answerSOAPService) {
		this.answerSOAPService = answerSOAPService;
	}

	public JobOrderDetailControler getJobOrderDetailControler() {
		return jobOrderDetailControler;
	}

	public void setJobOrderDetailControler(
			JobOrderDetailControler jobOrderDetailControler) {
		this.jobOrderDetailControler = jobOrderDetailControler;
	}

	private String getTranslationFromQuestion(Ts2__Question__c question) {
		Language__c selectedLanguage = getLabelController()
				.getSelectedLanguage();
		if (selectedLanguage != null) {
			String languageID = selectedLanguage.getId();
			Questions_Translation__c questionTranslation = getQuestionService()
					.getQuestionTranslation(question.getId(), languageID);
			if (questionTranslation != null) {
				String translation = questionTranslation.getTranslation__c();
				if (translation != null) {
					return translation;
				}
			}
		}
		if (question.getTs2__Rich_Text_Question__c() != null
				&& !question.getTs2__Rich_Text_Question__c().isEmpty()) {
			return question.getTs2__Rich_Text_Question__c();
		}
		return question.getTs2__Question__c();
	}

	private String getTranslationFromStandardQuestion(
			Ts2__StandardQuestion__c question) {
		Language__c selectedLanguage = getLabelController()
				.getSelectedLanguage();
		if (selectedLanguage != null) {
			String languageID = selectedLanguage.getId();
			Questions_Translation__c questionTranslation = getQuestionService()
					.getStandardQuestionTranslation(question.getId(),
							languageID);
			if (questionTranslation != null) {
				String translation = questionTranslation.getTranslation__c();
				if (translation != null) {
					return translation;
				}
			}
		}
		if (question.getTs2__Rich_Text_Question__c() != null
				&& !question.getTs2__Rich_Text_Question__c().isEmpty()) {
			return question.getTs2__Rich_Text_Question__c();
		}
		return question.getTs2__Question__c();
	}

	private String getTranslationFromAnswer(Ts2__Answer__c answer) {
		Language__c selectedLanguage = getLabelController()
				.getSelectedLanguage();
		if (selectedLanguage != null) {
			Answer_Translation__c answerTranslation = getAnswerSOAPService().getAnswerTranslation(answer.getId(),
					selectedLanguage.getId());
			if (answerTranslation!=null) {
				return answerTranslation.getTranslation__c();
			}
		}
		return answer.getTs2__Answer__c();
	}

	public String getQuestionTypeLabel() {
		switch (getSetOrder()) {
		case COMPLIANCE:
			return "Compliance Questions";

		case CUSTOM:
			return "Custom Questions";
		case SOCIAL:
			return "Social Questions";
		case STANDARD:
			return "Standard Questions";
		default:
			return "Questions";
		}
	}

	public QuestionSet getSetOrder() {
		return setOrder;
	}

	public void setSetOrder(QuestionSet setOrder) {
		this.setOrder = setOrder;
	}

	public List<QuestionModel> getQuestionModel() {
		return questionModel;
	}

	public void setQuestionModel(List<Ts2__Question__c> questions) {
		getQuestionModel().clear();
		for (Ts2__Question__c ts2__Question__c : questions) {
			QuestionModel questionModel = new QuestionModel(ts2__Question__c,
					this);
			getQuestionModel().add(questionModel);
		}
	}

	public void setDirectQuestionModel(List<QuestionModel> questionModel) {
		this.questionModel = questionModel;
	}

	public void setQuestionModelStandardQuestions(
			List<Ts2__StandardQuestion__c> standardQuestions) {
		getQuestionModel().clear();
		for (Ts2__StandardQuestion__c ts2__StandardQuestion__c : standardQuestions) {
			QuestionModel questionModel = new QuestionModel(
					ts2__StandardQuestion__c, this);
			getQuestionModel().add(questionModel);
		}
	}

	public LabelController getLabelController() {
		return labelController;
	}

	public void setLabelController(LabelController labelController) {
		this.labelController = labelController;
	}

	public static class QuestionModel {

		private boolean textAnswerType;
		private SelectItem[] possibleAnswers;
		private Ts2__Answer__c selectedAnswer;
		private String textAnswer;
		private String questionString;
		private Ts2__Question__c question;
		private Ts2__StandardQuestion__c standardQuestion;
		private QuestionsController questionsController;
		private boolean isRequired;
		private Layout layout = Layout.LEFT;
		private boolean isRich;

		public enum Layout {
			ABOVE, BELOW, LEFT, RIGHT;
			public static Layout fromText(String text) {
				if (text.equals("Above Answer")) {
					return ABOVE;
				} else if (text.equals("Below Answer")) {
					return BELOW;
				} else if (text.equals("Left of Answer")) {
					return LEFT;
				} else if (text.equals("Right of Answer")) {
					return RIGHT;
				}
				return LEFT;
			}
		}

		public QuestionModel(Ts2__Question__c question,
				QuestionsController questionsController) {
			this.questionsController = questionsController;
			this.setQuestion(question);
		}

		public QuestionModel(Ts2__StandardQuestion__c standardQuestion,
				QuestionsController questionsController) {
			this.questionsController = questionsController;
			this.setStandardQuestion(standardQuestion);
			setTextAnswerType(true);
		}

		public Ts2__Question__c getQuestion() {
			return question;
		}

		public void setQuestion(Ts2__Question__c question) {
			this.question = question;
			QuestionsController questionsController = getQuestionsController();
			AnswerSOAPService answerSOAPService = questionsController
					.getAnswerSOAPService();
			List<Ts2__Answer__c> answersForQuestion = answerSOAPService
					.getAnswersForQuestion(question.getId());
			if (answersForQuestion != null && !answersForQuestion.isEmpty()) {
				setTextAnswerType(false);
				SelectItem[] selectItems = new SelectItem[answersForQuestion
						.size()];
				for (int i = 0; i < answersForQuestion.size(); i++) {
					Ts2__Answer__c answer = answersForQuestion.get(i);
					String translationFromQuestion = getQuestionsController()
							.getTranslationFromAnswer(answer);
					// Double order = answer.getTs2__Order__c();
					selectItems[i] = new SelectItem(answer,
							translationFromQuestion);
				}
				setPossibleAnswers(selectItems);
			} else {
				setTextAnswerType(true);
			}
		}

		public String getQuestionString() {
			if (question != null) {
				questionString = getQuestionsController()
						.getTranslationFromQuestion(question);
			} else if (standardQuestion != null) {
				questionString = getQuestionsController()
						.getTranslationFromStandardQuestion(standardQuestion);
			}
			return questionString;
		}

		public void setQuestionString(String questionString) {
			this.questionString = questionString;
		}

		public Ts2__Answer__c getSelectedAnswer() {
			return selectedAnswer;
		}

		public void setSelectedAnswer(Ts2__Answer__c selectedAnswer) {
			this.selectedAnswer = selectedAnswer;
		}

		public SelectItem[] getPossibleAnswers() {
			return possibleAnswers;
		}

		public void setPossibleAnswers(SelectItem[] possibleAnswers) {
			this.possibleAnswers = possibleAnswers;
		}

		public boolean getTextAnswerType() {
			return textAnswerType;
		}

		public void setTextAnswerType(boolean textAnswerType) {
			this.textAnswerType = textAnswerType;
		}

		public String getTextAnswer() {
			return textAnswer;
		}

		public void setTextAnswer(String textAnswer) {
			this.textAnswer = textAnswer;
		}

		public QuestionsController getQuestionsController() {
			return questionsController;
		}

		public void setQuestionsController(
				QuestionsController questionsController) {
			this.questionsController = questionsController;
		}

		public Ts2__StandardQuestion__c getStandardQuestion() {
			return standardQuestion;
		}

		public void setStandardQuestion(
				Ts2__StandardQuestion__c standardQuestion) {
			this.standardQuestion = standardQuestion;
			setLayout(Layout.fromText(standardQuestion
					.getTs2__Question_Layout__c()));
		}

		public boolean getIsRich() {
			if (getQuestion() != null) {
				String richText = getQuestion().getTs2__Rich_Text_Question__c();
				isRich = richText != null && !richText.isEmpty();
			}
			return isRich;
		}

		public void setIsRich(boolean isRich) {
			this.isRich = isRich;
		}

		public boolean getIsRequired() {
			if (getQuestion() != null) {
				isRequired = !getQuestion().getTs2__Optional__c();
			} else if (getStandardQuestion() != null) {
				isRequired = getStandardQuestion()
						.getTs2__Required_By_Applicant__c();
			}
			return isRequired;
		}

		public void setIsRequired(boolean isRequired) {
			this.isRequired = isRequired;
		}

		public Layout getLayout() {
			return layout;
		}

		public void setLayout(Layout layout) {
			this.layout = layout;
		}

	}

}
