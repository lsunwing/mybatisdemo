package com.liuwei.yeb.dao;

import java.util.List;

import com.liuwei.yeb.dao.entity.Staff;

public interface StaffDao {

    List<Staff> selectAll();
    List<Staff> selectAllStaffs();
}
