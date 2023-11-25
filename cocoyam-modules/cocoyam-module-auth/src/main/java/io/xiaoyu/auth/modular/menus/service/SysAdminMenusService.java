package io.xiaoyu.auth.modular.menus.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.auth.modular.menus.entity.SysAdminMenusEntity;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.common.resp.PageResp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SysAdminMenusService extends IBaseService<SysAdminMenusEntity> {

    PageResp<SysAdminMenusEntity> queryList(AdminMenusQueryReq req);

    ArrayList<Object> getAdminMenus();

    List<Map<String,Object>> getMenus();
}
