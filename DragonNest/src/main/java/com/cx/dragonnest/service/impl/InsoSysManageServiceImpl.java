package com.cx.dragonnest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.dragonnest.entity.InfoNbrUser;
import com.cx.dragonnest.entity.InsoSysManage;
import com.cx.dragonnest.mapper.InfoNbrUserMapper;
import com.cx.dragonnest.mapper.InsoSysManageMapper;
import com.cx.dragonnest.service.InsoSysManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

/**
 * @author chenxin
 * @date 2023/07/10 11:13
 */
@Service
public class InsoSysManageServiceImpl extends ServiceImpl<InsoSysManageMapper, InsoSysManage> implements InsoSysManageService {

	private static final Logger logger= LoggerFactory.getLogger(InsoSysManageServiceImpl.class);
	@Autowired
	private InsoSysManageMapper insoSysManageMapper;
	@Override
	public InsoSysManage queryForInsoSysManage() {
		LambdaQueryWrapper<InsoSysManage> lambdaQueryWrapper=new LambdaQueryWrapper();
		lambdaQueryWrapper.eq(InsoSysManage::getSystemCode,"123123");
		return insoSysManageMapper.selectOne(lambdaQueryWrapper);
	}
}
