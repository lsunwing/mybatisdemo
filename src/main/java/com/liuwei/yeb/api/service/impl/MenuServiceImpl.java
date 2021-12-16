package com.liuwei.yeb.api.service.impl;

import com.liuwei.yeb.api.entity.Menu;
import com.liuwei.yeb.api.mapper.MenuMapper;
import com.liuwei.yeb.api.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
