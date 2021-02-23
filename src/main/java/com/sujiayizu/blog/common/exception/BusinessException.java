package com.sujiayizu.blog.common.exception;

import com.sujiayizu.blog.common.enums.ErrorEnum;

public class BusinessException extends RuntimeException{
    private String message;

    public BusinessException() {}

    public BusinessException(ErrorEnum errorEnum){
        super(errorEnum.getErrorMsg());
    }
}
