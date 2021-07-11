package com.liuwei.mybatisdemo.controller;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.User;
import com.liuwei.mybatisdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/queryAllUsers")
    @ResponseBody
    public List<User> queryAllUsers() {
        logger.info("queryAllUsers begin......");

        return userService.queryAllUsers();
    }
}
