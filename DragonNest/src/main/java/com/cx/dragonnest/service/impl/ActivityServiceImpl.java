package com.cx.dragonnest.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.dragonnest.Utils.Query;
import com.cx.dragonnest.entity.ActivityEntity;
import com.cx.dragonnest.entity.PageUtils;
import com.cx.dragonnest.mapper.ActivityDao;
import com.cx.dragonnest.service.ActivityService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("activityService")
public class ActivityServiceImpl extends ServiceImpl<ActivityDao, ActivityEntity> implements ActivityService {

    @Autowired
    private ActivityDao activityDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActivityEntity> page = this.page(
                new Query<ActivityEntity>().getPage(params),
                new QueryWrapper<ActivityEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void insert(ActivityEntity activityEntity) {
        activityDao.insertData(activityEntity);
    }

    @Override
    public void testBuffer() {
        ApplicationContext applicationContext;
        BeanFactory beanFactory;
    }


}