package io.xiaoyu.sys.modular.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.xiaoyu.common.req.CommonPageRequest;
import io.xiaoyu.common.basic.service.BaseService;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.util.ObjectUtil;
import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.sys.modular.admin.entity.AdminRolesEntity;
import io.xiaoyu.sys.modular.admin.mapper.AdminRolesMapper;
import io.xiaoyu.sys.modular.admin.req.AdminRolesQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminRolesQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminRolesService;
import io.xiaoyu.sys.modular.admin.req.AdminRolesAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesDetailReq;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminRolesServiceImpl extends BaseService<AdminRolesMapper,AdminRolesEntity> implements AdminRolesService{

    @Resource
    private AdminRolesMapper adminRolesMapper;

    public PageResp<AdminRolesEntity> queryList(AdminRolesQueryReq req) {
        QueryWrapper<AdminRolesEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(AdminRolesEntity::getId);
        return this.page(CommonPageRequest.defaultPage(), queryWrapper);
    }

    public AdminRolesQueryResp queryDetail(AdminRolesDetailReq adminRolesDetailReq) {
        AdminRolesEntity  adminRolesEntity = queryEntity(adminRolesDetailReq.getId());
        AdminRolesQueryResp adminRolesQueryResp = BeanUtil.copyProperties(adminRolesEntity, AdminRolesQueryResp.class);
        return adminRolesQueryResp;
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(AdminRolesAddReq adminRolesAddReq) {
        AdminRolesEntity adminRolesEntity = BeanUtil.toBean(adminRolesAddReq, AdminRolesEntity.class);
        this.save(adminRolesEntity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void edit(AdminRolesEditReq adminRolesEditReq) {
        AdminRolesEntity adminRolesEntity = this.queryEntity(adminRolesEditReq.getId());
        BeanUtil.copyProperties(adminRolesEditReq,adminRolesEntity);
        this.updateById(adminRolesEntity);
    }

    public AdminRolesEntity queryEntity(int id){
        AdminRolesEntity adminRolesEntity = this.getById(id);
        if(ObjectUtil.isEmpty(adminRolesEntity)) {
             throw new CommonException("值不存在，id值为：{}", id);
        }
        return adminRolesEntity;
    }


    @Transactional(rollbackFor = Exception.class)
    public void delete(AdminRolesDetailReq adminRolesReq) {
        if (!this.removeById(adminRolesReq.getId())){
            throw new CommonException("删除失败，id值为：{}", adminRolesReq.getId());
        }
    }



}
