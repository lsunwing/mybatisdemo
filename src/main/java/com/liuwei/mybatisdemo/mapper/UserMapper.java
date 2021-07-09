package com.liuwei.mybatisdemo.mapper;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    List<User> selectAllUsers();
}
