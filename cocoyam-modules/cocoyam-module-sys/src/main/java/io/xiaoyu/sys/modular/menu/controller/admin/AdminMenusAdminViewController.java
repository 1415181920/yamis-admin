package io.xiaoyu.sys.modular.menu.controller.admin;

import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.sys.modular.menu.entity.AdminMenusEntity;
import io.xiaoyu.sys.modular.menu.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menu.service.AdminMenusService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/admin-menus/menu")
public class AdminMenusAdminViewController extends AdminBaseViewController {

    @Resource
    private AdminMenusService adminMenusService;

    /**
     * 菜单列表
     * @param req
     * @return
     */
    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<AdminMenusEntity>> queryList(@Valid AdminMenusQueryReq req) {
        PageResp<AdminMenusEntity> list = adminMenusService.queryList(req);
        return  CommonAdminResp.success(list);
    }

}
