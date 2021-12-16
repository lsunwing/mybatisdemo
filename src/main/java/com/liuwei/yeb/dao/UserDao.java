package com.liuwei.yeb.dao;

import java.util.List;

import com.liuwei.yeb.dao.entity.User;

public interface UserDao {

    List<User> selectAllUsers();
}
