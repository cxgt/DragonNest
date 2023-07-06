package com.cx.dragonnest.controller;

import com.cx.dragonnest.entity.InfoNbrUser;
import com.cx.dragonnest.entity.JsonResult;
import com.cx.dragonnest.service.InfoNbrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @author chenxin
 * @date 2023/07/06 10:24
 */
@RestController("/user")
public class UserController {
	@Autowired
	InfoNbrUserService infoNbrUserService;
	@GetMapping(value = "/getUserData")
	public JsonResult getUserData(@RequestParam String userId){
		List<InfoNbrUser> infoNbrUserList = infoNbrUserService.queryAllInfoNbrUser();
		return JsonResult.success(infoNbrUserList);
	}
}
