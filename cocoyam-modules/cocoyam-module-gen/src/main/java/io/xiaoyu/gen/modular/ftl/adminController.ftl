package io.xiaoyu.${module}.modular.${childModule}.controller.admin;

import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}AddReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}DetailReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}EditReq;
import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.${module}.modular.${childModule}.service.${Domain}Service;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.sys.modular.admin.entity.${Domain}Entity;
import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/${module}/${childModule}/${do_main}")
public class ${Domain}AdminController extends AdminBaseViewController{

    @Resource
    private ${Domain}Service ${domain}Service;

    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<${Domain}Entity>> queryList(@Valid ${Domain}QueryReq req) {
        PageResp<${Domain}Entity> list = ${domain}Service.queryList(req);
        return CommonAdminResp.success(list);
    }


    @PostMapping("/add")
    public CommonAdminResp<String> add(@RequestBody @Valid ${Domain}AddReq ${domain}AddReq) {
        ${domain}Service.add(${domain}AddReq);
        return  CommonAdminResp.successWithToast();
    }

    @PostMapping("/edit")
    public CommonAdminResp<String> edit(@RequestBody @Valid ${Domain}EditReq ${domain}EditReq) {
        ${domain}Service.edit(${domain}EditReq);
        return CommonAdminResp.successWithToast();
    }

    @GetMapping("/query-detail")
    public CommonAdminResp<${Domain}QueryResp> queryDetail(@Valid ${Domain}DetailReq ${domain}DetailReq) {
        ${Domain}QueryResp ${domain}QueryResp = ${domain}Service.queryDetail(${domain}DetailReq);
        return CommonAdminResp.success(${domain}QueryResp);
    }

    @PostMapping("/delete")
    public CommonAdminResp<String> delete(@RequestBody @Valid ${Domain}DetailReq ${domain}DetailReq) {
        ${domain}Service.delete(${domain}DetailReq);
        return CommonAdminResp.successWithToast("删除成功!");
    }

}
