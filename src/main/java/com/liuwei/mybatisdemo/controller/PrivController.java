package com.liuwei.mybatisdemo.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.liuwei.mybatisdemo.constant.ResponseCode;
import com.liuwei.mybatisdemo.dao.entity.Menu;
import com.liuwei.mybatisdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrivController {

    @Autowired
    MenuService menuService;

    /**
     * 根据员工ID查询菜单列表
     *
     * @param staffId
     * @return
     */
    @RequestMapping("/getMenuList")
    public ResponseResult<String> getMenuList(Long staffId) {
        List<Menu> menuList = menuService.queryMenuList(staffId);
        ResponseResult responseResult = new ResponseResult<>(ResponseCode.RESPONSE_CODE_SUCCESS, "SUCCESS.");
        responseResult.setData(JSON.toJSONString(menuList));
        return responseResult;
    }
}
