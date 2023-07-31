package com.cx.dragonnest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.dragonnest.entity.ActivityEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商机活动信息表
 *
 * @author sunbing
 * @email sunbing@asiainfo.com
 * @date 2023-07-16 10:38:27
 */
@Mapper
public interface ActivityDao extends BaseMapper<ActivityEntity> {

	void insertData(ActivityEntity activity);
}
