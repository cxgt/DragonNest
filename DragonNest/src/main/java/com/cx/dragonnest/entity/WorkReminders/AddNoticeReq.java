package com.cx.dragonnest.entity.WorkReminders;

import java.util.List;

/**
 * @author chenxin
 * @date 2023/07/18 16:46
 */
public class AddNoticeReq {
	private String systemCode;
	private String taskType;
	private String createBy;
	private String sendTime;
	private List<TaskNotice> taskNoticeList;
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getSystemCode() {
		return systemCode;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType() {
		return taskType;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateBy() {
		return createBy;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getSendTime() {
		return sendTime;
	}

	public List<TaskNotice> getTaskNoticeList() {
		return taskNoticeList;
	}

	public void setTaskNoticeList(List<TaskNotice> taskNoticeList) {
		this.taskNoticeList = taskNoticeList;
	}
}

