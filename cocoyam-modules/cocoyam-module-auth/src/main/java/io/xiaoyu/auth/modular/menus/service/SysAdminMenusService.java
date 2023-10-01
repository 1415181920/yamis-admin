package io.xiaoyu.auth.modular.menus.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.auth.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.common.resp.PageResp;

import java.util.ArrayList;

public interface SysAdminMenusService extends IBaseService<AdminMenusEntity> {

    PageResp<AdminMenusQueryResp> queryList(AdminMenusQueryReq req);

    ArrayList<Object> getAdminMenus();
}
