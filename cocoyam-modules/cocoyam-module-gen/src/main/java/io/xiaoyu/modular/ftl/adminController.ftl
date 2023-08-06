package io.xiaoyu.${module}.modular.${childModule}.controller.admin;

import io.xiaoyu.${module}.modular.${childModule}.req.${Domain}QueryReq;
import io.xiaoyu.${module}.modular.${childModule}.resp.${Domain}QueryResp;
import io.xiaoyu.${module}.modular.${childModule}.service.${Domain}Service;
import io.xiaoyu.common.resp.CommonResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/admin/${do_main}/${childModule}")
public class ${Domain}AdminController {

    @Resource
    private ${Domain}Service ${domain}Service;

    @GetMapping("/query-list")
    public CommonResp<PageResp<${Domain}QueryResp>> queryList(@Valid ${Domain}QueryReq req) {
        PageResp<${Domain}QueryResp> list = ${domain}Service.queryList(req);
        return new CommonResp<>(list);
    }

}
