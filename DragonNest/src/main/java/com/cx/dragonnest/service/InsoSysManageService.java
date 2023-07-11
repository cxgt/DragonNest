package com.cx.dragonnest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.dragonnest.entity.InsoSysManage;

public interface InsoSysManageService extends IService<InsoSysManage> {

	public InsoSysManage queryForInsoSysManage();
}
