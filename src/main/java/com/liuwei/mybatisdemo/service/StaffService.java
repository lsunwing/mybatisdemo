package com.liuwei.mybatisdemo.service;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;

public interface StaffService {

    int addStaff(Staff staff);

    List<Staff> queryAll();

    List<Staff> queryAllStaffs();
}
