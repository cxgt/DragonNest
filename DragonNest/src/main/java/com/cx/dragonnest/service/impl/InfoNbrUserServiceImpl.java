package com.cx.dragonnest.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.dragonnest.entity.InfoNbrUser;
import com.cx.dragonnest.mapper.InfoNbrUserMapper;
import com.cx.dragonnest.service.InfoNbrUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxin
 * @date 2023/06/30 10:57
 */
@Service
public class InfoNbrUserServiceImpl extends ServiceImpl<InfoNbrUserMapper,InfoNbrUser> implements InfoNbrUserService {
	private final Logger logger= LoggerFactory.getLogger(InfoNbrUserServiceImpl.class);

	@Autowired
	InfoNbrUserMapper infoNbrUserMapper;
	@Override
	@Cacheable(value = "info_nbr_user_service",key = "'query_all_info_nbr_user'+ #userId")
	public List<InfoNbrUser> queryAllInfoNbrUser(String userId) {
		List<InfoNbrUser> infoNbrUserList=new ArrayList<>();
		//DEBUG 、INFO、WARN、ERROR
		logger.debug("debug msg={}","debug日志输出");
		logger.info("info msg={}","info日志输出");
		logger.warn("warn msg={}","warn日志输出");
		logger.error("error msg={}","error日志输出");
		infoNbrUserList.add(infoNbrUserMapper.queryInfoNbrUser("1231233"));
		logger.error("error msg={} 内容={}","error日志输出", JSONObject.toJSONString(infoNbrUserList));
		return infoNbrUserList;
	}
}
