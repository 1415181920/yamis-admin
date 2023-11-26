package io.xiaoyu.sys.modular.admin.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.sys.modular.admin.req.AdminUsersAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersDetailReq;


public interface AdminUsersService extends IBaseService<AdminUsersEntity> {

    PageResp<AdminUsersEntity> queryList(AdminUsersQueryReq req);

    void add(AdminUsersAddReq adminUsersAddReq);

    void edit(AdminUsersEditReq adminUsersEditReq);

    AdminUsersQueryResp queryDetail(AdminUsersDetailReq adminUsersDetailReq);

    void delete(AdminUsersDetailReq adminUsersDetailReq);

    AdminUsersEntity queryEntity(int id);


}
