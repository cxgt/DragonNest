package com.cx.dragonnest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.dragonnest.entity.InsoAssetInventory;
import com.cx.dragonnest.entity.InsoSysManage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsoAssetInventoryMapper extends BaseMapper<InsoAssetInventory> {
	int updateInsoAssetInventory(InsoAssetInventory insoAssetInventory);

	int delete(int[] assetId);
}
