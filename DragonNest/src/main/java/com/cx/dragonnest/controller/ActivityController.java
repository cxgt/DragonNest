package com.cx.dragonnest.controller;


import com.cx.dragonnest.entity.ActivityEntity;
import com.cx.dragonnest.entity.PageUtils;
import com.cx.dragonnest.entity.Response;
import com.cx.dragonnest.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * 列表
     */
    @PostMapping("/list")
    public Response<PageUtils> list(@RequestBody Map<String, Object> params) {
        PageUtils page = activityService.queryPage(params);
        return Response.ok(page);
    }

    /**
     * 信息
     */
    @GetMapping("/info/{opptyActivityId}")
    public Response<ActivityEntity> info(@PathVariable("opptyActivityId") String opptyActivityId) {
        ActivityEntity activity = activityService.getById(opptyActivityId);
        return Response.ok(activity);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Response<Void> save(@RequestBody ActivityEntity activity) {
        activityService.insert(activity);
        return Response.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public Response<Void> update(@RequestBody ActivityEntity activity) {
        activityService.updateById(activity);
        return Response.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Response<Void> delete(@RequestBody String[] opptyActivityIds) {
        activityService.removeByIds(Arrays.asList(opptyActivityIds));
        return Response.ok();
    }

}
