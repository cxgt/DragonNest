package com.cx.dragonnest.service;

import com.cx.dragonnest.entity.InsoAssetInventory;

public interface InsoAssetInventoryService {
	InsoAssetInventory selectOneAsset(String sysCode);
	public int updateInsoAssetInventory(InsoAssetInventory insoAssetInventory);
	public int deleteInsoDocInfoByDocIds(int[] docId);


}
