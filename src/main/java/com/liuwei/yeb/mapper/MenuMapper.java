package com.liuwei.yeb.mapper;

import java.util.List;

import com.liuwei.yeb.dao.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    List<Menu> selectMenuList();

}
