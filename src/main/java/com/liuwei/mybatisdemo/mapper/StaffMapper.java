package com.liuwei.mybatisdemo.mapper;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffMapper {

    List<Staff> selectAllStaffs();
}
