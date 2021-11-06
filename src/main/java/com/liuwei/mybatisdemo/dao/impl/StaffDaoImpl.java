package com.liuwei.mybatisdemo.dao.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.StaffDao;
import com.liuwei.mybatisdemo.dao.entity.Staff;
import com.liuwei.mybatisdemo.mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDaoImpl implements StaffDao {
    @Autowired
    StaffMapper staffMapper;

    @Override
    public List<Staff> selectAll() {
        return staffMapper.selectAll();
    }

    @Override
    public List<Staff> selectAllStaffs() {
        return staffMapper.selectAllStaffs();
    }
}
