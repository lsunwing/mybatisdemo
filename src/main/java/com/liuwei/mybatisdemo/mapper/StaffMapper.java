package com.liuwei.mybatisdemo.mapper;

import java.util.List;

import com.liuwei.mybatisdemo.dao.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StaffMapper {

    int insertStaff(Staff staff);

    List<Staff> selectAll();

    List<Staff> selectAllStaffs();
}
