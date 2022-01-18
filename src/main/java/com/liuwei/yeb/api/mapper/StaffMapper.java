package com.liuwei.yeb.api.mapper;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuwei.yeb.api.entity.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
public interface StaffMapper extends BaseMapper<Staff> {

    /**
     *
     * @param page
     * @param staffName
     * @return
     */
    IPage<Staff> selectStaff(Page<?> page, @Param(value = "staffName") String staffName);


    IPage<Staff> selectStaffByMap(Page<?> page, Map<String, Object> map);
}
