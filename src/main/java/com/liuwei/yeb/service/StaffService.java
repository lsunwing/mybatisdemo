package com.liuwei.yeb.service;

import java.util.List;

import com.liuwei.yeb.dao.entity.Staff;

public interface StaffService {

    Long addStaff(Staff staff);

    List<Staff> queryAll();

    List<Staff> queryAllStaffs();
}
