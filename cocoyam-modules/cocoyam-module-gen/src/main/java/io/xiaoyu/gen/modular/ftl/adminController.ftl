package io.xiaoyu.${module}.modular.${childModule}.controller.admin;

import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.${module}.modular.${childModule}.service.${Domain}Service;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin-api/${module}/${childModule}/${do_main}")
public class ${Domain}AdminController extends AdminBaseController{

    @Resource
    private ${Domain}Service ${domain}Service;

    @GetMapping("/query-list")
    public CommonAdminResp<PageResp<${Domain}QueryResp>> queryList(@Valid ${Domain}QueryReq req) {
        PageResp<${Domain}QueryResp> list = ${domain}Service.queryList(req);
        return new CommonAdminResp<>(list);
    }

}
