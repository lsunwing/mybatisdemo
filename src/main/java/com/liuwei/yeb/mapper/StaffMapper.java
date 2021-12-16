package com.liuwei.yeb.mapper;

import java.util.List;

import com.liuwei.yeb.dao.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
////@Repository
public interface StaffMapper {

    Long insertStaff(Staff staff);

    List<Staff> selectAll();

    List<Staff> selectAllStaffs();
}
