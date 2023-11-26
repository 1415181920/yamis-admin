package io.xiaoyu.sys.modular.admin.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.sys.modular.admin.entity.AdminRolesEntity;
import io.xiaoyu.sys.modular.admin.req.AdminRolesQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminRolesQueryResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.sys.modular.admin.req.AdminRolesAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesDetailReq;


public interface AdminRolesService extends IBaseService<AdminRolesEntity> {

    PageResp<AdminRolesEntity> queryList(AdminRolesQueryReq req);

    void add(AdminRolesAddReq adminRolesAddReq);

    void edit(AdminRolesEditReq adminRolesEditReq);

    AdminRolesQueryResp queryDetail(AdminRolesDetailReq adminRolesDetailReq);

    void delete(AdminRolesDetailReq adminRolesDetailReq);

    AdminRolesEntity queryEntity(int id);


}
