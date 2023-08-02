package com.cx.dragonnest.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.dragonnest.entity.ActivityEntity;
import com.cx.dragonnest.entity.PageUtils;

import java.util.Map;

public interface ActivityService extends IService<ActivityEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void insert(ActivityEntity activityEntity);
    void testBuffer();
}

