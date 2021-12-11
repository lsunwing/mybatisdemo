package com.liuwei.mybatisdemo.controller;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;
import com.liuwei.mybatisdemo.service.StaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int addStaff(@RequestParam Staff staff) {
        System.out.println(staff);
        return staffService.addStaff(staff);
    }

    @RequestMapping("/queryAllStaffs")
    @ResponseBody
    public List<Staff> queryAllStaffs() {
        logger.info("queryAllStaffs begin......");

        return staffService.queryAllStaffs();
    }
}
