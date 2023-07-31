package com.cx.dragonnest.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.dragonnest.entity.ActivityEntity;
import com.cx.dragonnest.entity.PageUtils;

import java.util.Map;

/**
 * 商机活动信息表
 *
 * @author sunbing
 * @email sunbing@asiainfo.com
 * @date 2023-07-16 10:38:27
 */
public interface ActivityService extends IService<ActivityEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void insert(ActivityEntity activityEntity);
    void testBuffer();
}

