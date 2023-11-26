package io.xiaoyu.sys.modular.menus.controller.admin;

import io.xiaoyu.sys.modular.menus.req.AdminMenusAddReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusDetailReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusEditReq;
import io.xiaoyu.sys.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.sys.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.sys.modular.menus.service.AdminMenusService;
import io.xiaoyu.sys.modular.menus.entity.AdminMenusEntity;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/admin-api/sys/menus/admin-menus")
public class AdminMenusAdminController extends AdminBaseViewController{

    @Resource
    private AdminMenusService adminMenusService;

    @GetMapping("/query-list")
    public CommonAdminResp<List<AdminMenusQueryResp>> queryList(@Valid AdminMenusQueryReq req) {
        List<AdminMenusQueryResp> list = adminMenusService.queryList(req);
        return CommonAdminResp.success(list);
    }


    @PostMapping("/add")
    public CommonAdminResp<String> add(@RequestBody @Valid AdminMenusAddReq adminMenusAddReq) {
        adminMenusService.add(adminMenusAddReq);
        return  CommonAdminResp.successWithToast();
    }

    @PostMapping("/edit")
    public CommonAdminResp<String> edit(@RequestBody @Valid AdminMenusEditReq adminMenusEditReq) {
        adminMenusService.edit(adminMenusEditReq);
        return CommonAdminResp.successWithToast();
    }

    @GetMapping("/query-detail")
    public CommonAdminResp<AdminMenusQueryResp> queryDetail(@Valid AdminMenusDetailReq adminMenusDetailReq) {
        AdminMenusQueryResp adminMenusQueryResp = adminMenusService.queryDetail(adminMenusDetailReq);
        return CommonAdminResp.success(adminMenusQueryResp);
    }

    @PostMapping("/delete")
    public CommonAdminResp<String> delete(@RequestBody @Valid AdminMenusDetailReq adminMenusDetailReq) {
        adminMenusService.delete(adminMenusDetailReq);
        return CommonAdminResp.successWithToast("删除成功!");
    }

}
