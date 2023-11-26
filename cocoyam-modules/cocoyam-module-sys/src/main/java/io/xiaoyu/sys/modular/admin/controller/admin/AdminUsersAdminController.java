package io.xiaoyu.sys.modular.admin.controller.admin;

import io.xiaoyu.sys.modular.admin.req.AdminUsersAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersDetailReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminUsersQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminUsersQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminUsersService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.sys.modular.admin.entity.AdminUsersEntity;
import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/sys/admin/admin-users")
public class AdminUsersAdminController extends AdminBaseViewController{

    @Resource
    private AdminUsersService adminUsersService;

    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<AdminUsersEntity>> queryList(@Valid AdminUsersQueryReq req) {
        PageResp<AdminUsersEntity> list = adminUsersService.queryList(req);
        return CommonAdminResp.success(list);
    }


    @PostMapping("/add")
    public CommonAdminResp<String> add(@RequestBody @Valid AdminUsersAddReq adminUsersAddReq) {
        adminUsersService.add(adminUsersAddReq);
        return  CommonAdminResp.successWithToast();
    }

    @PostMapping("/edit")
    public CommonAdminResp<String> edit(@RequestBody @Valid AdminUsersEditReq adminUsersEditReq) {
        adminUsersService.edit(adminUsersEditReq);
        return CommonAdminResp.successWithToast();
    }

    @GetMapping("/query-detail")
    public CommonAdminResp<AdminUsersQueryResp> queryDetail(@Valid AdminUsersDetailReq adminUsersDetailReq) {
        AdminUsersQueryResp adminUsersQueryResp = adminUsersService.queryDetail(adminUsersDetailReq);
        return CommonAdminResp.success(adminUsersQueryResp);
    }

    @PostMapping("/delete")
    public CommonAdminResp<String> delete(@RequestBody @Valid AdminUsersDetailReq adminUsersDetailReq) {
        adminUsersService.delete(adminUsersDetailReq);
        return CommonAdminResp.successWithToast("删除成功!");
    }

}
