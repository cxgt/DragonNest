package com.cx.dragonnest.entity.WorkReminders;

import java.util.List;

/**
 * @author chenxin
 * @date 2023/07/18 16:58
 */
public class TaskNotice {
	private String urgeId;
	private String taskTitle;
	private String taskTitleParam;
	private String taskContent;
	private String taskContentParam;
	private String busiTypeCode;
	private String sendImmediately;
	private List<SendCandidate> sendCandidateList;
	private List<WorkorderRelation> workorderRelationList;

	public String getUrgeId() {
		return urgeId;
	}

	public void setUrgeId(String urgeId) {
		this.urgeId = urgeId;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskTitleParam() {
		return taskTitleParam;
	}

	public void setTaskTitleParam(String taskTitleParam) {
		this.taskTitleParam = taskTitleParam;
	}

	public String getTaskContent() {
		return taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	public String getTaskContentParam() {
		return taskContentParam;
	}

	public void setTaskContentParam(String taskContentParam) {
		this.taskContentParam = taskContentParam;
	}

	public String getBusiTypeCode() {
		return busiTypeCode;
	}

	public void setBusiTypeCode(String busiTypeCode) {
		this.busiTypeCode = busiTypeCode;
	}

	public String getSendImmediately() {
		return sendImmediately;
	}

	public void setSendImmediately(String sendImmediately) {
		this.sendImmediately = sendImmediately;
	}

	public List<SendCandidate> getSendCandidateList() {
		return sendCandidateList;
	}

	public void setSendCandidateList(List<SendCandidate> sendCandidateList) {
		this.sendCandidateList = sendCandidateList;
	}

	public List<WorkorderRelation> getWorkorderRelationList() {
		return workorderRelationList;
	}

	public void setWorkorderRelationList(List<WorkorderRelation> workorderRelationList) {
		this.workorderRelationList = workorderRelationList;
	}
}
