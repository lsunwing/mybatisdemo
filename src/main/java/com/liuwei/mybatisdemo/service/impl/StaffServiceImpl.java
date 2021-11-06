package com.liuwei.mybatisdemo.service.impl;

import java.util.List;

import com.liuwei.mybatisdemo.dao.StaffDao;
import com.liuwei.mybatisdemo.dao.entity.Staff;
import com.liuwei.mybatisdemo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {


    @Autowired
    private StaffDao staffDao;

    @Override
    public List<Staff> queryAll() {
        return staffDao.selectAll();
    }

    @Override
    public List<Staff> queryAllStaffs() {
        return staffDao.selectAllStaffs();
    }
}
