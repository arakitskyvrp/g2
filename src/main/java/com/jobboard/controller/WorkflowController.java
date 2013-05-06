package com.jobboard.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import com.jobboard.controller.QuestionsController.QuestionModel;
import com.jobboard.controller.QuestionsController.QuestionSet;

@ManagedBean(name = "workflowController")
@SessionScoped
public class WorkflowController {

	public enum STEP {
		UPLOAD_RESUME, SOCIAL_QUESTIONS, CUSTOM_QUESTIONS, COVER_LETTER, FORMS_URL, COMPLIANCE_QUESTIONS, STANDARD_QUESTIONS, ADDITIONAL_ATTACHMENTS
	}

	private STEP[] steps;
	protected int stepIndex;

	private Submitable submitable;

	@ManagedProperty(value = "#{jobSearch}")
	private JobSearchController jobSearchController;
	@ManagedProperty(value = "#{questionsController}")
	private QuestionsController questionsController;
	private boolean init = true;
	private boolean inQuestionsMode;
	private List<QuestionModel> standardQuestionModels;
	private List<QuestionModel> customQuestionModels;
	private List<QuestionModel> complianceQuestionModels;
	private List<QuestionModel> socialQuestionModels;
	private String coverLetter;
	private boolean isResumeUploded;


	private int configMaxSizeOfAttachment = 1048576;
	private int configMaxNumberOfAttachments = 3;

	private boolean isAdditionalAttachUploded;


	public void nextStep() {
		if (getHasNextStep()) {
			stepIndex++;
		}
	}

	public void previousStep() {
		if (getHasPreviousStep()) {
			stepIndex--;
		}
	}

	public STEP[] getSteps() {
		return steps;
	}

	public void setSteps(STEP[] steps) {
		this.steps = steps;
	}

	public boolean getHasNextStep() {
		return getSteps() != null ? stepIndex < getSteps().length - 1 : false;
	}

	public boolean getHasPreviousStep() {
		return getSteps() != null ? stepIndex > 0 : false;
	}

	public STEP getCurrentStep() {
		return getSteps()[stepIndex];
	}

	public JobSearchController getJobSearchController() {
		return jobSearchController;
	}

	public void setJobSearchController(JobSearchController jobSearchController) {
		this.jobSearchController = jobSearchController;
	}

	public void continueApplication() {
		if (!init) {
			syncQuestionsBeforeStepChange();
			nextStep();
		} else {
			init = false;
		}
		redirectCurrentStep();
	}

	public void back() {
		syncQuestionsBeforeStepChange();
		previousStep();
		redirectCurrentStep();
	}

	private void syncQuestionsBeforeStepChange() {
		List<QuestionModel> questionModel = new ArrayList<QuestionsController.QuestionModel>();
		questionModel.addAll(getQuestionsController().getQuestionModel());
		STEP currentStep = getCurrentStep();
		switch (currentStep) {
		case COMPLIANCE_QUESTIONS:
			setComplianceQuestionModels(questionModel);
			break;
		case CUSTOM_QUESTIONS:
			setCustomQuestionModels(questionModel);
			break;
		case SOCIAL_QUESTIONS:
			setSocialQuestionModels(questionModel);
			break;
		case STANDARD_QUESTIONS:
			setStandardQuestionModels(questionModel);
			break;
		default:
			break;
		}
	}

	private void redirectCurrentStep() {
		String target = "thankYou.xhtml";
		STEP currentStep = getCurrentStep();
		switch (currentStep) {
		case ADDITIONAL_ATTACHMENTS:
			target = "uploadAdditional.xhtml";
			break;
		case COMPLIANCE_QUESTIONS:
			if (getComplianceQuestionModels() != null) {
				getQuestionsController().setDirectQuestionModel(
						getComplianceQuestionModels());
			} else {
				getQuestionsController().setQuestionModel(
						getQuestionsController().getComplianceQuestions());
			}
			getQuestionsController().setSetOrder(QuestionSet.COMPLIANCE);
			target = "questions.xhtml";
			break;

		case COVER_LETTER:
			target = "coverLetter.xhtml";
			break;

		case CUSTOM_QUESTIONS:
			if (getCustomQuestionModels() != null) {
				getQuestionsController().setDirectQuestionModel(
						getCustomQuestionModels());
			} else {
				getQuestionsController().setQuestionModel(
						getQuestionsController().getCustomQuestions());
			}
			getQuestionsController().setSetOrder(QuestionSet.CUSTOM);
			target = "questions.xhtml";
			break;

		case FORMS_URL:

			break;

		case SOCIAL_QUESTIONS:
			if (getSocialQuestionModels() != null) {
				getQuestionsController().setDirectQuestionModel(
						getSocialQuestionModels());
			} else {
				getQuestionsController().setQuestionModel(
						getQuestionsController().getSocialQuestions());
			}
			getQuestionsController().setSetOrder(QuestionSet.SOCIAL);
			target = "questions.xhtml";
			break;

		case STANDARD_QUESTIONS:
			if (getStandardQuestionModels() != null) {
				getQuestionsController().setDirectQuestionModel(
						getStandardQuestionModels());
			} else {
				getQuestionsController().setQuestionModelStandardQuestions(
						getQuestionsController().getStandardQuestions());
			}
			getQuestionsController().setSetOrder(QuestionSet.STANDARD);
			target = "questions.xhtml";
			break;

		case UPLOAD_RESUME:
			target = "uploadResume.xhtml";
			break;

		default:
			break;
		}
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void submit() {
		if (getSubmitable() != null) {
			getSubmitable().submit();
		}
	}

	public QuestionsController getQuestionsController() {
		return questionsController;
	}

	public void setQuestionsController(QuestionsController questionsController) {
		this.questionsController = questionsController;
	}

	public boolean isInQuestionsMode() {
		return inQuestionsMode;
	}

	public void setInQuestionsMode(boolean inQuestionsMode) {
		this.inQuestionsMode = inQuestionsMode;
	}

	public List<QuestionModel> getStandardQuestionModels() {
		return standardQuestionModels;
	}

	public void setStandardQuestionModels(
			List<QuestionModel> standardQuestionModels) {
		this.standardQuestionModels = standardQuestionModels;
	}

	public List<QuestionModel> getCustomQuestionModels() {
		return customQuestionModels;
	}

	public void setCustomQuestionModels(List<QuestionModel> customQuestionModels) {
		this.customQuestionModels = customQuestionModels;
	}

	public List<QuestionModel> getComplianceQuestionModels() {
		return complianceQuestionModels;
	}

	public void setComplianceQuestionModels(
			List<QuestionModel> complianceQuestionModels) {
		this.complianceQuestionModels = complianceQuestionModels;
	}

	public List<QuestionModel> getSocialQuestionModels() {
		return socialQuestionModels;
	}

	public void setSocialQuestionModels(List<QuestionModel> socialQuestionModels) {
		this.socialQuestionModels = socialQuestionModels;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public boolean getIsResumeUploded() {
		return isResumeUploded;
	}

	public void setIsResumeUploded(boolean isResumeUploded) {
		this.isResumeUploded = isResumeUploded;
	}

	/**
	 * This method is called from uploadResume.xhtml, to handle the file upload
	 * 
	 * @param event
	 */
	public void uploadResume(FileUploadEvent event) {

			setIsResumeUploded(true);

	}

	/**
	 * This method is called from uploadAdditional.xhtml, to handle the file
	 * upload
	 * 
	 * @param event
	 */
	public void uploadAdditional(FileUploadEvent event) {

			setIsAdditionalAttachUploded(true);

	}

	/**
	 * This method zips uploaded file into zip memory buffer to store into blob
	 * 
	 * @param fileName
	 *            - name of the file to be stored in zip
	 * @param in
	 *            - upload input stream
	 * @return zip memory byte array
	 */
	public byte[] zipFileToMem(String fileName, InputStream in) {
		try {
			// first write to expandable buffer
			ByteArrayDataOutput dataOut = ByteStreams.newDataOutput();
			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = in.read(bytes)) != -1) {
				dataOut.write(bytes, 0, read);
			}
			in.close();

			// create memory buffer with double input file size, here zip buffer
			// will be stored
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(
					dataOut.toByteArray().length * 2);
			ZipOutputStream out = new ZipOutputStream(byteArrayOutputStream);
			ZipEntry ze = new ZipEntry(fileName);
			out.putNextEntry(ze);
			out.write(dataOut.toByteArray());
			out.flush();
			out.close();

			// return ziped file buffer
			return byteArrayOutputStream.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getConfigMaxSizeOfAttachment() {
		return configMaxSizeOfAttachment;
	}

	public void setConfigMaxSizeOfAttachment(int configMaxSizeOfAttachment) {
		this.configMaxSizeOfAttachment = configMaxSizeOfAttachment;
	}

	public int getConfigMaxNumberOfAttachments() {
		return configMaxNumberOfAttachments;
	}

	public void setConfigMaxNumberOfAttachments(int configMaxNumberOfAttachments) {
		this.configMaxNumberOfAttachments = configMaxNumberOfAttachments;
	}

	public boolean getIsAdditionalAttachUploded() {
		return isAdditionalAttachUploded;
	}

	public void setIsAdditionalAttachUploded(boolean isAdditionalAttachUploded) {
		this.isAdditionalAttachUploded = isAdditionalAttachUploded;
	}

	public Submitable getSubmitable() {
		return submitable;
	}

	public void setSubmitable(Submitable submitable) {
		this.submitable = submitable;
	}

	public void init() {
		init = true;
		stepIndex = 0;
		setStandardQuestionModels(null);
		setComplianceQuestionModels(null);
		setSocialQuestionModels(null);
		setCustomQuestionModels(null);
		setCoverLetter(null);
		setIsAdditionalAttachUploded(false);
		setIsResumeUploded(false);

	}

}
