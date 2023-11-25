package io.xiaoyu.sys.modular.menu.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.xiaoyu.common.basic.service.BaseService;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.sys.modular.menu.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menu.mapper.AdminMenusMapper;
import io.xiaoyu.sys.modular.menu.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menu.resp.AdminMenusQueryResp;
import io.xiaoyu.sys.modular.menu.service.AdminMenusService;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminMenusServiceImpl extends BaseService<AdminMenusMapper,AdminMenusEntity> implements AdminMenusService{

    @Resource
    private AdminMenusMapper adminMenusMapper;

    public PageResp<AdminMenusEntity> queryList(AdminMenusQueryReq req) {
        QueryWrapper<AdminMenusEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(AdminMenusEntity::getId);
        return this.page(CommonPageRequest.defaultPage(), queryWrapper);
    }

    public AdminMenusQueryResp queryById(Long id) {
        AdminMenusEntity adminMenusEntity = adminMenusMapper.selectById(id);
        AdminMenusQueryResp adminMenusQueryResp = BeanUtil.copyProperties(adminMenusEntity, AdminMenusQueryResp.class);
        return adminMenusQueryResp;
    }
}
