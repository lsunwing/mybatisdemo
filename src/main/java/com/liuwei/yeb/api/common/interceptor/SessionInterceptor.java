package com.liuwei.yeb.api.common.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liuwei.yeb.dao.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class SessionInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        User user = (User) request.getSession().getAttribute("USER");
        if (user != null) {
            return true;
        }
        try {
            logger.debug("session校验失败, 跳转到登录页面...");
            response.sendRedirect(request.getContextPath() + "/end/login.html");
        } catch (IOException e) {
            logger.error("跳转到登录页面异常, e={}", e);
        }
        return true;
    }
}
