package com.cx.dragonnest.entity.WorkReminders;

/**
 * @author chenxin
 * @date 2023/07/18 17:25
 */
public class CustomizationNotice {
	private String code;
	private String level;
	private String noticeType;
	private MessageData messageData;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public MessageData getMessageData() {
		return messageData;
	}

	public void setMessageData(MessageData messageData) {
		this.messageData = messageData;
	}
}
