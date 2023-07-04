package com.cx.dragonnest.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.dragonnest.entity.InfoNbrUser;
import com.cx.dragonnest.mapper.InfoNbrUserDao;
import com.cx.dragonnest.service.InfoNbrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxin
 * @date 2023/06/30 10:57
 */
@Service
public class InfoNbrUserServiceImpl extends ServiceImpl<InfoNbrUserDao,InfoNbrUser> implements InfoNbrUserService {
	@Autowired
	InfoNbrUserDao infoNbrUserDao;
	@Override
	public List<InfoNbrUser> queryAllInfoNbrUser() {
		return null;
	}
}
