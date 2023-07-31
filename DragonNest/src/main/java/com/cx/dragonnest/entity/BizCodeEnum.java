package com.cx.dragonnest.entity;

import lombok.Getter;

/**
 * 错误码和错误信息定义类
 * 1. 错误码定义规则为 5位数字
 * 2. 前两位表示业务场景，最后三位表示错误码。例如：1001。10:通用 001:参数校验失败
 * 3. 维护错误码后需要维护错误描述，将他们定义为枚举形式
 * 错误码列表：
 * 10: 通用
 * 001：参数格式校验
 * 11: 商品
 * 12: 产品
 */
@Getter
public enum BizCodeEnum {
    /**
     * 成功
     */
    SUCCESS("00000", "成功"),
    /**
     * 系统未知异常
     */
    UNKNOW_EXCEPTION("99999", "系统未知异常"),
    // 10001->10999 ---------------------------------------begin
    /**
     * 参数校验失败
     */
    VAILD_EXCEPTION("10001", "参数校验失败"),
    /**
     * 下载异常
     */
    DOWNLOAD_EXCEPTION("10002", "下载失败"),
    /**
     * 日期格式有误
     */
    DATE_FORMAT_EXCEPTION("10003", "日期格式有误")
    // 10001->10999 ---------------------------------------end

    // 11001->11999 ---------------------------------------begin

    // 11001->11999 ---------------------------------------end

    // 12001->12999 ---------------------------------------begin

    // 12001->12999 ---------------------------------------end
    ;


    /**
     * 编码
     */
    private final String code;
    /**
     * 信息
     */
    private final String message;

    BizCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
