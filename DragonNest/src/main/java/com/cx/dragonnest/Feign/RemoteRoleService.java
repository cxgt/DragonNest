package com.cx.dragonnest.Feign;

import com.cx.dragonnest.Constants.ServiceNameConstants;
import com.cx.dragonnest.entity.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenxin
 * @date 2023/07/07 14:39
 */
@FeignClient(contextId = "remoteRoleService", value = ServiceNameConstants.LOCAL_BPM_CENTER)
public interface RemoteRoleService {
	@ApiOperation(value = "Feign调用角色信息", notes = "Feign调用角色信息")
	@RequestMapping("/local/bpm/lowCode/user/getUserRoleTree")
	public JsonResult getUserRoleTree();
}
