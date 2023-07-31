package com.cx.dragonnest.service.impl;


import com.cx.dragonnest.Feign.WorkRemindersFeginService;
import com.cx.dragonnest.entity.Response;
import com.cx.dragonnest.entity.WorkReminders.AddNoticeReq;
import com.cx.dragonnest.entity.WorkReminders.CustomizationNotice;
import com.cx.dragonnest.service.WorkRemindersService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 工作提醒对接接口实现
 *
 * @author chenxin
 * @date 2023/07/18 14:51
 */
@Service
public class WorkRemindersServiceImpl implements WorkRemindersService {

	@Autowired
	private WorkRemindersFeginService workRemindersFeginService;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public Response addCommonNotice(AddNoticeReq addNoticeReq) {
		Map<String, Object> reqMap = switchToMap(addNoticeReq);
		Map<String, Object> stringObjectMap = workRemindersFeginService.addCommonNotice(reqMap);
		return objectMapper.convertValue(stringObjectMap, Response.class);
	}

	@Override
	public Response addWorkorderUrgeNotice(AddNoticeReq addNoticeReq) {
		Map<String, Object> reqMap = switchToMap(addNoticeReq);
		Map<String, Object> stringObjectMap = workRemindersFeginService.addWorkorderUrgeNotice(reqMap);
		return objectMapper.convertValue(stringObjectMap, Response.class);
	}

	@Override
	public Response sendMessage(CustomizationNotice customizationNotice) {
		Map<String, Object> reqMap = switchToMap(customizationNotice);
		Map<String, Object> stringObjectMap = workRemindersFeginService.setMessage(reqMap);
		return objectMapper.convertValue(stringObjectMap, Response.class);
	}

	private <T> Map<String, Object>   switchToMap(T addNoticeReq) {
		Map<String, Object> reqMap =new HashMap<>();
		if(addNoticeReq.getClass().isInstance(CustomizationNotice.class)){
			Map<String, Object> stringObjectMap =objectMapper.convertValue(addNoticeReq, Map.class);;
			return stringObjectMap;
		}else {
			Map<String, Object> stringObjectMap = objectMapper.convertValue(addNoticeReq, Map.class);
			reqMap.put("uniBssBody", stringObjectMap);
			return reqMap;
		}
	}
}
