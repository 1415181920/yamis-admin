package io.xiaoyu.sys.modular.menu.service;

import io.xiaoyu.common.basic.service.IBaseService;
import io.xiaoyu.sys.modular.menu.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menu.req.AdminMenusQueryReq;
import io.xiaoyu.common.resp.PageResp;

public interface AdminMenusService extends IBaseService<AdminMenusEntity> {

    PageResp<AdminMenusEntity> queryList(AdminMenusQueryReq req);

}
