package com.liuwei.yeb.service.impl;

import java.util.List;

import com.liuwei.yeb.dao.entity.Staff;
import com.liuwei.yeb.mapper.StaffMapper;
import com.liuwei.yeb.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public Long addStaff(Staff staff) {
        return staffMapper.insertStaff(staff);
    }

    @Override
    public List<Staff> queryAll() {
        return staffMapper.selectAll();
    }

    @Override
    public List<Staff> queryAllStaffs() {
        return staffMapper.selectAllStaffs();
    }
}
