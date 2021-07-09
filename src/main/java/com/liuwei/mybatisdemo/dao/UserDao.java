package com.liuwei.mybatisdemo.dao;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.User;

public interface UserDao {

    List<User> selectAllUsers();
}
