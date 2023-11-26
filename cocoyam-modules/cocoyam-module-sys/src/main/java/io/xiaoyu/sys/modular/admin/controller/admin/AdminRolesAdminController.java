package io.xiaoyu.sys.modular.admin.controller.admin;

import io.xiaoyu.sys.modular.admin.req.AdminRolesAddReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesDetailReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesEditReq;
import io.xiaoyu.sys.modular.admin.req.AdminRolesQueryReq;
import io.xiaoyu.sys.modular.admin.resp.AdminRolesQueryResp;
import io.xiaoyu.sys.modular.admin.service.AdminRolesService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.sys.modular.admin.entity.AdminRolesEntity;
import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/sys/admin/admin-roles")
public class AdminRolesAdminController extends AdminBaseViewController{

    @Resource
    private AdminRolesService adminRolesService;

    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<AdminRolesEntity>> queryList(@Valid AdminRolesQueryReq req) {
        PageResp<AdminRolesEntity> list = adminRolesService.queryList(req);
        return CommonAdminResp.success(list);
    }


    @PostMapping("/add")
    public CommonAdminResp<String> add(@RequestBody @Valid AdminRolesAddReq adminRolesAddReq) {
        adminRolesService.add(adminRolesAddReq);
        return  CommonAdminResp.success();
    }

    @PostMapping("/edit")
    public CommonAdminResp<String> edit(@RequestBody @Valid AdminRolesEditReq adminRolesEditReq) {
        adminRolesService.edit(adminRolesEditReq);
        return CommonAdminResp.success();
    }

    @GetMapping("/query-detail")
    public CommonAdminResp<AdminRolesQueryResp> queryDetail(@Valid AdminRolesDetailReq adminRolesDetailReq) {
        AdminRolesQueryResp adminRolesQueryResp = adminRolesService.queryDetail(adminRolesDetailReq);
        return CommonAdminResp.success(adminRolesQueryResp);
    }

    @PostMapping("/delete")
    public CommonAdminResp<String> delete(@RequestBody @Valid AdminRolesDetailReq adminRolesDetailReq) {
        adminRolesService.delete(adminRolesDetailReq);
        return CommonAdminResp.successWithToast("删除成功!");
    }

}
