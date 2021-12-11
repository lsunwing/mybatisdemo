package com.liuwei.mybatisdemo.service.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;
import com.liuwei.mybatisdemo.mapper.StaffMapper;
import com.liuwei.mybatisdemo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public int addStaff(Staff staff) {
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
