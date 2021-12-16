package com.liuwei.yeb.mapper;

import java.util.List;

import com.liuwei.yeb.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    List<User> selectAllUsers();
}
