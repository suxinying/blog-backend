package com.sujiayizu.blog.controller;

import com.sujiayizu.blog.common.enums.ErrorEnum;
import com.sujiayizu.blog.common.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test() {
        try {
            Integer i = 0 / 0;
        } catch (Exception e) {
            throw new BusinessException(ErrorEnum.LOGIN_ERROR);
        }
        return "test";
    }
}
