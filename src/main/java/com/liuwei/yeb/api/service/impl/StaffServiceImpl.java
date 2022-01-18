package com.liuwei.yeb.api.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuwei.yeb.api.entity.Staff;
import com.liuwei.yeb.api.entity.request.StaffForm;
import com.liuwei.yeb.api.mapper.StaffMapper;
import com.liuwei.yeb.api.service.IStaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

    @Autowired
    private StaffMapper staffMapper;

    public IPage<Staff> queryStaff(Page<Staff> page, String staffName) {
        return staffMapper.selectStaff(page, staffName);
    }

    public IPage<Staff> queryStaffByMap(Page<Staff> page, Map<String, Object> map) {
        return staffMapper.selectStaffByMap(page, map);
    }

    public List<Staff> list(StaffForm staffForm) {
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
        IPage<Staff> pageResult = this.page(page, wrapper);
        // 分页查询结果集
        List<Staff> list = pageResult.getRecords();

        return list;
    }
}
