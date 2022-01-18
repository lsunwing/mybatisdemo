package com.liuwei.yeb.api.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuwei.yeb.api.entity.Staff;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuwei.yeb.api.entity.request.StaffForm;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
public interface IStaffService extends IService<Staff> {

    IPage<Staff> queryStaff(Page<Staff> page, String staffName);

    /**
     * 分页查询staff
     *
     * @param staffForm
     * @return
     */
    public List<Staff> list(StaffForm staffForm);
}
