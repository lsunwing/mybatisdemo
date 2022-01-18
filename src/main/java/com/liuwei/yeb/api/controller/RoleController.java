package com.liuwei.yeb.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.liuwei.yeb.api.entity.Role;
import com.liuwei.yeb.api.entity.request.BaseForm;
import com.liuwei.yeb.api.entity.response.DataResponse;
import com.liuwei.yeb.api.entity.response.PageInfo;
import com.liuwei.yeb.api.entity.response.PageResponse;
import com.liuwei.yeb.api.entity.response.ResponseUtil;
import com.liuwei.yeb.api.service.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Controller
@RequestMapping("/api/role")
public class RoleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    IRoleService roleService;

    @RequestMapping("list")
    @ResponseBody
    public DataResponse list(@RequestBody BaseForm baseForm, HttpServletRequest request) {

        // 分页查询结果集
        List<Role> list = roleService.list();

        // 分页返回信息
        PageInfo pageInfo = new PageInfo(baseForm.getCurrentPage(), baseForm.getPageSize(), roleService.count());
        // 分页响应数据
        return ResponseUtil.success(new PageResponse(pageInfo, list));

    }
}
