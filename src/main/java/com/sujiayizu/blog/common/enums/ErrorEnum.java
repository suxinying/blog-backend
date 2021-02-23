package com.sujiayizu.blog.common.enums;

import lombok.Getter;

/**
 * 异常枚举
 */
@Getter
public enum ErrorEnum {
    LOGIN_ERROR(5, "登录失败，用户名或密码错误");
    private Integer errorCode;
    private String errorMsg;

    ErrorEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
