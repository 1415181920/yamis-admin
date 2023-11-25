package io.xiaoyu.sys.modular.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import io.xiaoyu.sys.modular.admin.mapper.AdminUsersMapper;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminUsersService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminUsersServiceImpl extends BaseService<AdminUsersMapper,AdminUsersEntity> implements AdminUsersService{

    @Resource
    private AdminUsersMapper adminUsersMapper;

    public PageResp<AdminUsersEntity> queryList(AdminUsersQueryReq req) {
        QueryWrapper<AdminUsersEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(AdminUsersEntity::getId);
        PageResp<AdminUsersEntity> page = this.page(CommonPageRequest.defaultPage(), queryWrapper);
        return page;
    }

    public AdminUsersQueryResp queryById(Long id) {
        AdminUsersEntity adminUsersEntity = adminUsersMapper.selectById(id);
        AdminUsersQueryResp adminUsersQueryResp = BeanUtil.copyProperties(adminUsersEntity, AdminUsersQueryResp.class);
        return adminUsersQueryResp;
    }
}
