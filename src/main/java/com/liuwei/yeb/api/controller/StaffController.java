package com.liuwei.yeb.api.controller;


import java.util.List;

import com.liuwei.yeb.api.common.DataResponse;
import com.liuwei.yeb.api.entity.Staff;
import com.liuwei.yeb.api.service.impl.StaffServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Controller
@RequestMapping("/api/staff")
public class StaffController {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.liuwei.yeb.controller.StaffController.class);

    @Autowired
    StaffServiceImpl staffService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse<String> addStaff(@RequestBody Staff staff) {
        System.out.println(staff);
        staffService.saveOrUpdate(staff);
        return new DataResponse("0000", "success");
    }

    @RequestMapping("/list")
    @ResponseBody
    public DataResponse list() {
        List<Staff> list = staffService.list();
        return new DataResponse("0000", "success", list);
    }
}
