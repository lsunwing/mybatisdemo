package com.liuwei.yeb.api.service.impl;

import com.liuwei.yeb.api.entity.Staff;
import com.liuwei.yeb.api.mapper.StaffMapper;
import com.liuwei.yeb.api.service.IStaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

    private StaffMapper staffMapper;

    public StaffMapper getStaffMapper() {
        return staffMapper;
    }

    public void setStaffMapper(StaffMapper staffMapper) {
        this.staffMapper = staffMapper;
    }
}
