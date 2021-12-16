package com.liuwei.yeb.service;

import java.util.List;

import com.liuwei.yeb.dao.entity.Menu;

public interface MenuService {
    default List<Menu> queryMenuList(Long staffId) {
        return null;
    }
}
