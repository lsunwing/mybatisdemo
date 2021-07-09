package com.liuwei.mybatisdemo.service.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.User;
import com.liuwei.mybatisdemo.mapper.UserMapper;
import com.liuwei.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        return userMapper.selectAllUsers();
    }
}
