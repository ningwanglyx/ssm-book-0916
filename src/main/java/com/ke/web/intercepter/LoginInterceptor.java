package com.ke.web.intercepter;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Summary: 拦截器必须继承HandlerInterceptorAdapter类并且改写其中三个方法中的几个
 * @Author: YangxingLiu
 * @Since: 2019/11/12 10:24
 */

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

}
