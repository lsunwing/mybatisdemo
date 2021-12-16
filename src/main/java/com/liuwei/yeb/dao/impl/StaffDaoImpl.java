package com.liuwei.yeb.dao.impl;

import java.util.List;

import com.liuwei.yeb.dao.StaffDao;
import com.liuwei.yeb.dao.entity.Staff;
import com.liuwei.yeb.mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDaoImpl implements StaffDao {
    @Autowired
    StaffMapper staffMapper;

    public int insert(Staff staff){

        return 0;
    }

    @Override
    public List<Staff> selectAll() {
        return staffMapper.selectAll();
    }

    @Override
    public List<Staff> selectAllStaffs() {
        return staffMapper.selectAllStaffs();
    }
}
