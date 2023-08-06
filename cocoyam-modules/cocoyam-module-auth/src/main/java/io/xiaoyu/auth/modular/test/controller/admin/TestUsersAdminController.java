package io.xiaoyu.auth.modular.test.controller.admin;

import io.xiaoyu.auth.modular.test.req.TestUsersQueryReq;
import io.xiaoyu.auth.modular.test.resp.TestUsersQueryResp;
import io.xiaoyu.auth.modular.test.service.TestUsersService;
import io.xiaoyu.common.resp.CommonResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin/test-users/test")
public class TestUsersAdminController {

    @Resource
    private TestUsersService testUsersService;

    @GetMapping("/query-list")
    public CommonResp<PageResp<TestUsersQueryResp>> queryList(@Valid TestUsersQueryReq req) {
        PageResp<TestUsersQueryResp> list = testUsersService.queryList(req);
        return new CommonResp<>(list);
    }

}
