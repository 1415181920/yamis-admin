package io.xiaoyu.sys.modular.admin.controller.admin;

import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminUsersService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/admin-users/admin")
public class AdminUsersAdminController extends AdminBaseController{

    @Resource
    private AdminUsersService adminUsersService;

    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<AdminUsersQueryResp>> queryList(@Valid AdminUsersQueryReq req) {
        PageResp<AdminUsersQueryResp> list = adminUsersService.queryList(req);
        return new CommonAdminResp<>(list);
    }

}