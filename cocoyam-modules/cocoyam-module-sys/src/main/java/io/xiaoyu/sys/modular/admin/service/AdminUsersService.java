package io.xiaoyu.sys.modular.admin.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.common.resp.PageResp;

public interface AdminUsersService extends IBaseService<AdminUsersEntity> {

    PageResp<AdminUsersQueryResp> queryList(AdminUsersQueryReq req);

}
