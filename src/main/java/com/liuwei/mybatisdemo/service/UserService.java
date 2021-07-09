package com.liuwei.mybatisdemo.service;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.User;

public interface UserService {

    List<User> queryAllUsers();
}
