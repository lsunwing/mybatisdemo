package com.liuwei.mybatisdemo.dao.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.UserDao;
import com.liuwei.mybatisdemo.dao.entity.User;
import com.liuwei.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }
}
