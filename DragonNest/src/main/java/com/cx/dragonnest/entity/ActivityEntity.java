package com.cx.dragonnest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 */
@Data
@TableName("t_busi_oppty_activity")
public class ActivityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 商机活动ID
     */
    @TableId
    @TableField("OPPTY_ACTIVITY_ID")
    private String opptyActivityId;
    /**
     * 商机ID
     */
    private String opptyId;
    /**
     * 活动记录名称
     */
    private String activityName;
    /**
     * 活动记录内容
     */
    private String activityContent;
    /**
     * 活动记录状态：0无效，1有效
     */
    private String activityState;
    /**
     * 跟进方式，参数定义参见t_busi_common_param表
     */
    private String followType;
    /**
     * 创建员工工号
     */
    private String createBy;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 租户ID
     */
    private String tenantId;

}
