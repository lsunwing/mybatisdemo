package com.liuwei.yeb.api.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuwei.yeb.api.common.DataResponse;
import com.liuwei.yeb.api.entity.request.StaffForm;
import com.liuwei.yeb.api.entity.response.PageInfo;
import com.liuwei.yeb.api.entity.response.PageResponse;
import com.liuwei.yeb.api.entity.Staff;
import com.liuwei.yeb.api.service.impl.StaffServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return new DataResponse("0000", "add success");
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse<String> modifyStaff(@RequestBody Staff staff) {
        System.out.println(staff);
        staffService.saveOrUpdate(staff);
        return new DataResponse("0000", "modify success");
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    @ResponseBody
    public DataResponse<String> removeStaff(Long staffId) {
        System.out.println(staffId);
        staffService.removeById(staffId);
        return new DataResponse("0000", "remove success");
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageResponse list(@RequestBody StaffForm staffForm, HttpServletRequest request) {
        System.out.println(staffForm);

        QueryWrapper<Staff> wrapper = new QueryWrapper<>();
        if (StringUtils.hasText(staffForm.getStaffName())) {
            wrapper.eq("STAFF_NAME", staffForm.getStaffName());
        }
        if (StringUtils.hasText(staffForm.getGender())) {
            wrapper.eq("GENDER", staffForm.getGender());
        }
        wrapper.orderByAsc("STAFF_ID");

        IPage<Staff> page = new Page<>(staffForm.getCurrentPage(), staffForm.getPageSize());

        // 分页查询
        IPage<Staff> pageResult = staffService.page(page, wrapper);
        // 分页查询结果集
        List<Staff> list = pageResult.getRecords();

        // 分页返回信息
        PageInfo pageInfo = new PageInfo(staffForm.getCurrentPage(), staffForm.getPageSize(), staffService.count());
        // 分页响应数据
        return new PageResponse(pageInfo, list);

    }
}
