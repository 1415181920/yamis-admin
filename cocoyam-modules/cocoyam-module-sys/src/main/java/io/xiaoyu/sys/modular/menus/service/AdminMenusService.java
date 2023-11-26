package io.xiaoyu.sys.modular.menus.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.sys.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.sys.modular.menus.req.AdminMenusAddReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusEditReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusDetailReq;

import java.util.List;


public interface AdminMenusService extends IBaseService<AdminMenusEntity> {

    List<AdminMenusQueryResp> queryList(AdminMenusQueryReq req);

    void add(AdminMenusAddReq adminMenusAddReq);

    void edit(AdminMenusEditReq adminMenusEditReq);

    AdminMenusQueryResp queryDetail(AdminMenusDetailReq adminMenusDetailReq);

    void delete(AdminMenusDetailReq adminMenusDetailReq);

    AdminMenusEntity queryEntity(int id);


}
