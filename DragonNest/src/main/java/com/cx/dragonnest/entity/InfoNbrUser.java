package com.cx.dragonnest.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author chenxin
 * @date 2023/06/30 10:44
 */
@Data
@TableName(value = "info_nbr_user")
public class InfoNbrUser {
	@TableId(type = IdType.AUTO)
	/**
	 * id
	 */
	private Long id;

	/**
	 * acc_nbr
	 */
	@TableField("`acc_nbr`")
	private String accNbr;

	/**
	 * user_id
	 */
	@TableField("`user_id`")
	private String userId;

	/**
	 * 0 失效n      1 有效n
	 */
	private Integer state;

	/**
	 * end_time
	 */
	@TableField("`end_time`")
	private Date endTime;

	/**
	 * province_no
	 */
	@TableField("`province_no`")
	private String provinceNo;

	/**
	 * destroy_time
	 */
	@TableField("`destroy_time`")
	private Date destroyTime;

	public InfoNbrUser() {}

	public InfoNbrUser(Long id, String accNbr, String userId, Integer state, Date endTime, String provinceNo, Date destroyTime) {
		this.id = id;
		this.accNbr = accNbr;
		this.userId = userId;
		this.state = state;
		this.endTime = endTime;
		this.provinceNo = provinceNo;
		this.destroyTime = destroyTime;
	}
}
