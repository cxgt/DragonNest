package com.cx.dragonnest.entity.WorkReminders;

/**
 * @author chenxin
 * @date 2023/07/18 16:58
 */
public class WorkorderRelation {
	private String workorderId;
	private String stepCode;
	private String stepName;

	public String getWorkorderId() {
		return workorderId;
	}

	public void setWorkorderId(String workorderId) {
		this.workorderId = workorderId;
	}

	public String getStepCode() {
		return stepCode;
	}

	public void setStepCode(String stepCode) {
		this.stepCode = stepCode;
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
}
