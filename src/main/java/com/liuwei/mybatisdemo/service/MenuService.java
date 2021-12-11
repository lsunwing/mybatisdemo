package com.liuwei.mybatisdemo.service;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Menu;

public interface MenuService {
    default List<Menu> queryMenuList(Long staffId) {
        return null;
    }
}
