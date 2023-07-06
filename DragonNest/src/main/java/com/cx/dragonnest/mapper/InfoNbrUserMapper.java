package com.cx.dragonnest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.dragonnest.entity.InfoNbrUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoNbrUserMapper extends BaseMapper<InfoNbrUser> {
	InfoNbrUser queryInfoNbrUser(String userId);
}
