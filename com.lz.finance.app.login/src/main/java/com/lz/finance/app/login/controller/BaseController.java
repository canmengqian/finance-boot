package com.lz.finance.app.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className BaseController
 * @description TODO
 * @date 2021/9/11
 */
@RequestMapping("/api")
public class BaseController {
    @Resource
    ServletContext context;

    @Resource
    HttpServletRequest request;
}
