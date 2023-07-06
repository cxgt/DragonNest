package com.cx.dragonnest.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 通用返回类
 *
 * @author chenxin
 * @date 2023/07/06 10:26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JsonResult implements Serializable {
	private static final long serialVersionUID = 6345664489296925402L;

	private Integer code;

	private String message;

	private Boolean successFlag;

	private Object data;

	public static JsonResult success(){
		return new JsonResult(EntityError.SUCCESS.getCode(),EntityError.SUCCESS.getMessage(),null,true);
	}

	public static JsonResult success(Object data){
		return new JsonResult(EntityError.SUCCESS.getCode(), EntityError.SUCCESS.getMessage(),true,data);
	}

	public static JsonResult error(EntityError entityError) {
		return new JsonResult(entityError.getCode(), entityError.getMessage(), null, true);
	}

	public static JsonResult fail() {
		return new JsonResult(EntityError.SYSTEM_ERROR.getCode(), EntityError.SYSTEM_ERROR.getMessage(), null, true);
	}
}
