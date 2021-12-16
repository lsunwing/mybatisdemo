package com.liuwei.yeb.api.service.impl;

import com.liuwei.yeb.api.entity.Role;
import com.liuwei.yeb.api.mapper.RoleMapper;
import com.liuwei.yeb.api.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
