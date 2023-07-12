package com.cx.dragonnest.controller;

import com.cx.dragonnest.entity.InsoAssetInventory;
import com.cx.dragonnest.entity.JsonResult;
import com.cx.dragonnest.service.InsoAssetInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxin
 * @date 2023/07/11 15:09
 */
@RestController
@RequestMapping("/asset")
public class InsoAssetInventoryController {

	@Autowired
	private InsoAssetInventoryService insoAssetInventoryService;

	@GetMapping("/queryForList/{systemCode}")
	public JsonResult query(@PathVariable String systemCode){
		InsoAssetInventory insoAssetInventory = insoAssetInventoryService.selectOneAsset(systemCode);
		return new JsonResult(200,"查询成功",true,insoAssetInventory);
	}
}
