package com.liuwei.yeb.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuwei.yeb.api.entity.Staff;
import com.liuwei.yeb.api.entity.request.StaffForm;
import com.liuwei.yeb.api.entity.response.DataResponse;
import com.liuwei.yeb.api.entity.response.PageInfo;
import com.liuwei.yeb.api.entity.response.PageResponse;
import com.liuwei.yeb.api.entity.response.ResponseUtil;
import com.liuwei.yeb.api.service.impl.StaffServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/api/staff")
public class StaffController {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.liuwei.yeb.api.controller.StaffController.class);

    @Autowired
    StaffServiceImpl staffService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public DataResponse<String> addStaff(@RequestBody Staff staff) {
        System.out.println(staff);
        staffService.saveOrUpdate(staff);
        return new DataResponse("0000", "add success");
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public DataResponse<String> modifyStaff(@RequestBody Staff staff) {
        System.out.println(staff);
        staffService.saveOrUpdate(staff);
        return new DataResponse("0000", "modify success");
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public DataResponse<String> removeStaff(Long staffId) {
        System.out.println(staffId);
        staffService.removeById(staffId);
        return new DataResponse("0000", "remove success");
    }

    @RequestMapping("/list")
    public IPage<Staff> list(StaffForm staffForm, Page<Staff> page) {
        System.out.println(staffForm);

        IPage<Staff> list = staffService.queryStaff(page, staffForm.getStaffName());
        page.setTotal(staffService.count());
        return list;
    }

    @RequestMapping("/listAll")
    public IPage<Staff> listAll(StaffForm staffForm, Page<Staff> page) {
        System.out.println(staffForm);

        Map<String, Object> map = new HashMap<>();
        map.put("staffName", staffForm.getStaffName());
        IPage<Staff> list = staffService.queryStaffByMap(page, map);
        page.setTotal(staffService.count());
        return list;
    }

    @RequestMapping(value = "/list2")
    public DataResponse list(@RequestBody StaffForm staffForm, HttpServletRequest request) {
        System.out.println(staffForm);

        // 分页查询结果集
        List<Staff> list = staffService.list(staffForm);

        // 分页返回信息
        PageInfo pageInfo = new PageInfo(staffForm.getCurrentPage(), staffForm.getPageSize(), staffService.count());
        // 分页响应数据
        return ResponseUtil.success(new PageResponse(pageInfo, list));

    }
}
