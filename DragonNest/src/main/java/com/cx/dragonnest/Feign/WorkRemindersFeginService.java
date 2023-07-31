package com.cx.dragonnest.Feign;

import com.cx.dragonnest.Constants.ServiceNameConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author chenxin
 * @date 2023/07/18 15:34
 */
@FeignClient(name = ServiceNameConstants.BMC_OPPORTUNITY_SERVICE,
		path = "${com.asiainfo.bss.console.path:bss-console}",
		contextId = "WorkRemindersFeginService")
public interface WorkRemindersFeginService {
	@ApiOperation(value = "一般工作提醒", notes = "一般工作提醒")
	@PostMapping("/taskNotice/addCommonNotice")
	public Map<String, Object> addCommonNotice(@RequestBody Map<String, Object> reqMap);
	@ApiOperation(value = "订单运营工作提醒", notes = "订单运营工作提醒")
	@PostMapping("/taskNotice/addWorkorderUrgeNotice")
	public Map<String, Object> addWorkorderUrgeNotice(@RequestBody Map<String, Object> reqMap);
	@ApiOperation(value = "其他自定义提醒(仅支持立即发送)", notes = "其他自定义提醒(仅支持立即发送)")
	@PostMapping("/taskNotice/setMessage")
	public Map<String, Object> setMessage(@RequestBody Map<String, Object> reqMap);
}
