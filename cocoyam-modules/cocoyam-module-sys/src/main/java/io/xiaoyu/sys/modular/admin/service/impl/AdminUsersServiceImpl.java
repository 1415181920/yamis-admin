package io.xiaoyu.sys.modular.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.common.basic.service.BaseService;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.util.ObjectUtil;
import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import io.xiaoyu.sys.modular.admin.mapper.AdminUsersMapper;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminUsersService;
import io.xiaoyu.sys.modular.admin.req.AdminUsersAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersDetailReq;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminUsersServiceImpl extends BaseService<AdminUsersMapper,AdminUsersEntity> implements AdminUsersService{


    public PageResp<AdminUsersEntity> queryList(AdminUsersQueryReq req) {
        QueryWrapper<AdminUsersEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(AdminUsersEntity::getId);
        return this.page(CommonPageRequest.defaultPage(), queryWrapper);
    }

    public AdminUsersQueryResp queryDetail(AdminUsersDetailReq adminUsersDetailReq) {
        AdminUsersEntity  adminUsersEntity = queryEntity(adminUsersDetailReq.getId());
        AdminUsersQueryResp adminUsersQueryResp = BeanUtil.copyProperties(adminUsersEntity, AdminUsersQueryResp.class);
        return adminUsersQueryResp;
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(AdminUsersAddReq adminUsersAddReq) {
        AdminUsersEntity adminUsersEntity = BeanUtil.toBean(adminUsersAddReq, AdminUsersEntity.class);
        this.save(adminUsersEntity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void edit(AdminUsersEditReq adminUsersEditReq) {
        AdminUsersEntity adminUsersEntity = this.queryEntity(adminUsersEditReq.getId());
        BeanUtil.copyProperties(adminUsersEditReq,adminUsersEntity);
        this.updateById(adminUsersEntity);
    }

    public AdminUsersEntity queryEntity(int id){
        AdminUsersEntity adminUsersEntity = this.getById(id);
        if(ObjectUtil.isEmpty(adminUsersEntity)) {
             throw new CommonException("值不存在，id值为：{}", id);
        }
        return adminUsersEntity;
    }


    @Transactional(rollbackFor = Exception.class)
    public void delete(AdminUsersDetailReq adminUsersReq) {
        if (!this.removeById(adminUsersReq.getId())){
            throw new CommonException("删除失败，id值为：{}", adminUsersReq.getId());
        }
    }



}
