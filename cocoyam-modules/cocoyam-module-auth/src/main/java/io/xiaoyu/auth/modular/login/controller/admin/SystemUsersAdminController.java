package io.xiaoyu.auth.modular.login.controller.admin;

import io.xiaoyu.auth.modular.login.req.SystemUsersQueryReq;
import io.xiaoyu.auth.modular.login.resp.SystemUsersQueryResp;
import io.xiaoyu.auth.modular.login.service.impl.SystemUsersServiceImpl;
import io.xiaoyu.common.resp.CommonResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin/system-users")
public class SystemUsersAdminController {

    @Resource
    private SystemUsersServiceImpl systemUsersService;

    @GetMapping("/query-list")
    public CommonResp<PageResp<SystemUsersQueryResp>> queryList(@Valid SystemUsersQueryReq req) {
        PageResp<SystemUsersQueryResp> list = systemUsersService.queryList(req);
        return new CommonResp<>(list);
    }

}
