package com.liuwei.mybatisdemo.service.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Menu;
import com.liuwei.mybatisdemo.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
    @Override
    public List<Menu> queryMenuList(Long staffId) {
        return null;
    }
}
