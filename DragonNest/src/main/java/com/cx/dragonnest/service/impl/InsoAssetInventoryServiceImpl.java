package com.cx.dragonnest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cx.dragonnest.entity.InsoAssetInventory;
import com.cx.dragonnest.mapper.InsoAssetInventoryMapper;
import com.cx.dragonnest.service.InsoAssetInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenxin
 * @date 2023/07/11 09:49
 */
@Service
public class InsoAssetInventoryServiceImpl implements InsoAssetInventoryService {
	@Autowired
	private InsoAssetInventoryMapper insoAssetInventoryMapper;
	@Override
	public InsoAssetInventory selectOneAsset(String sysCode) {
		LambdaQueryWrapper<InsoAssetInventory> lambdaQueryWrapper=new LambdaQueryWrapper();
		lambdaQueryWrapper.eq(InsoAssetInventory::getSystemCode,sysCode);
		return insoAssetInventoryMapper.selectOne(lambdaQueryWrapper);
	}
}
