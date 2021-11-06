package com.liuwei.mybatisdemo.dao;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;

public interface StaffDao {

    List<Staff> selectAll();
    List<Staff> selectAllStaffs();
}
