package com.liuwei.yeb.service.impl;

import java.util.List;

import com.liuwei.yeb.dao.entity.User;
import com.liuwei.yeb.mapper.UserMapper;
import com.liuwei.yeb.service.UserService;
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
