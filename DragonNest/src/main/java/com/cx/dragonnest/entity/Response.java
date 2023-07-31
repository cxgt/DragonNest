package com.cx.dragonnest.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(value = "Response", description = "json返回结果类")
public class Response<T> implements java.io.Serializable {
    @ApiModelProperty(value = "状态码", example = "2")
    private String code;

    @ApiModelProperty("返回消息")
    private String msg;

    @ApiModelProperty("返回数据")
    private T data;

    public static Response<Void> ok() {
        return ok(null);
    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.setCode(BizCodeEnum.SUCCESS.getCode());
        response.setMsg(BizCodeEnum.SUCCESS.getMessage());
        response.setData(data);
        return response;
    }

    public static <T> Response<T> of(String code, String msg, T data) {
        Response<T> response = new Response<>();
        response.setCode(code);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }

    public static Response<Void> of(String code, String msg) {
        Response<Void> response = new Response<>();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }

    /**
     * 系统内部错误
     */
    public static Response<Void> unknowError() {
        return Response.of(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMessage(), null);
    }
}
