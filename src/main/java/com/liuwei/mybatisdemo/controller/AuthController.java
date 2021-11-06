package com.liuwei.mybatisdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @RequestMapping("/login")
    public void login(String userName, String pwd) {
        logger.info("login begin...");

        logger.debug("login success...");
    }
}
