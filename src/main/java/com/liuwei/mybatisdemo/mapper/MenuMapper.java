package com.liuwei.mybatisdemo.mapper;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    List<Menu> selectMenuList();

}
