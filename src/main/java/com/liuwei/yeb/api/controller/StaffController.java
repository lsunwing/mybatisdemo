package com.liuwei.yeb.api.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuwei.yeb.api.common.DataResponse;
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
    public DataResponse list(@RequestBody Staff staff) {
        System.out.println(staff);
        QueryWrapper<Staff> wrapper = new QueryWrapper<>();
        if (StringUtils.hasText(staff.getStaffName())) {
            wrapper.eq("STAFF_NAME", staff.getStaffName());
        }
        if (StringUtils.hasText(staff.getGender())) {
            wrapper.eq("GENDER", staff.getGender());
        }
        return new DataResponse("0000", "list success", staffService.list(wrapper));
    }
}
