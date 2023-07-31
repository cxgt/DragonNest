package com.cx.dragonnest.entity.WorkReminders;

/**
 * @author chenxin
 * @date 2023/07/18 16:58
 */
public class SendCandidate {
	private String taskCandidate;
	private String candidateLevel;
	private String needReply;
	private String replyTo;

	public String getTaskCandidate() {
		return taskCandidate;
	}

	public void setTaskCandidate(String taskCandidate) {
		this.taskCandidate = taskCandidate;
	}

	public String getCandidateLevel() {
		return candidateLevel;
	}

	public void setCandidateLevel(String candidateLevel) {
		this.candidateLevel = candidateLevel;
	}

	public String getNeedReply() {
		return needReply;
	}

	public void setNeedReply(String needReply) {
		this.needReply = needReply;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}
}
