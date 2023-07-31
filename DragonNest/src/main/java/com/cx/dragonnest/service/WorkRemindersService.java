package com.cx.dragonnest.service;



import com.cx.dragonnest.entity.Response;
import com.cx.dragonnest.entity.WorkReminders.AddNoticeReq;
import com.cx.dragonnest.entity.WorkReminders.CustomizationNotice;
import io.swagger.annotations.ApiOperation;

public interface WorkRemindersService {
	@ApiOperation(value = "一般工作提醒", notes = "一般工作提醒")
	public Response addCommonNotice(AddNoticeReq addNoticeReq);
	@ApiOperation(value = "订单运营工作提醒", notes = "订单运营工作提醒")
	public Response addWorkorderUrgeNotice(AddNoticeReq addNoticeReq);
	@ApiOperation(value = "其他自定义提醒(仅支持立即发送)", notes = "其他自定义提醒(仅支持立即发送)")
	public Response sendMessage(CustomizationNotice customizationNotice);
}
