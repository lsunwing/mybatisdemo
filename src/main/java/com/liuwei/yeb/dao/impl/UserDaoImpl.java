package com.liuwei.yeb.dao.impl;

import java.util.List;

import com.liuwei.yeb.dao.UserDao;
import com.liuwei.yeb.dao.entity.User;
import com.liuwei.yeb.mapper.UserMapper;
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
