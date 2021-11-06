package com.liuwei.mybatisdemo.config;

import com.liuwei.mybatisdemo.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new SessionInterceptor());
        registration.addPathPatterns("/**")
                .excludePathPatterns("/**/*.html", "/**/*.js", "/**/*.css", "/**/*.jpg");
    }
}
