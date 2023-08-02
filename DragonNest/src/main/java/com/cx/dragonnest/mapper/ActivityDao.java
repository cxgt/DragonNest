package com.cx.dragonnest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.dragonnest.entity.ActivityEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ActivityDao extends BaseMapper<ActivityEntity> {

	void insertData(ActivityEntity activity);
}
