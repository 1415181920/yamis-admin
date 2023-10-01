package io.xiaoyu.sys.modular.menu.controller.admin;

import io.xiaoyu.sys.modular.menu.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menu.resp.AdminMenusQueryResp;
import io.xiaoyu.sys.modular.menu.service.AdminMenusService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/admin-menus/menu")
public class AdminMenusAdminController extends AdminBaseController{

    @Resource
    private AdminMenusService adminMenusService;

    /**
     * 菜单列表
     * @param req
     * @return
     */
    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<AdminMenusQueryResp>> queryList(@Valid AdminMenusQueryReq req) {
        PageResp<AdminMenusQueryResp> list = adminMenusService.queryList(req);
        return new CommonAdminResp<>(list);
    }

}
