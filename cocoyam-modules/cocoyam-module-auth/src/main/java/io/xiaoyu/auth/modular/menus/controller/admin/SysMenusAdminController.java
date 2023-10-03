package io.xiaoyu.auth.modular.menus.controller.admin;

import cn.hutool.core.lang.Console;
import io.xiaoyu.auth.modular.menus.service.SysAdminMenusService;
import io.xiaoyu.common.resp.CommonAdminResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin-api")
public class SysMenusAdminController extends AdminBaseController{

    @Resource
    private SysAdminMenusService adminMenusService;


    @GetMapping("/menus")
    public CommonAdminResp<List<Map<String, Object>>> getMenus(){
        Console.log("get menus");
        List<Map<String, Object>> menus = adminMenusService.getMenus();
        return CommonAdminResp.ok("获取菜单成功",menus);
    }


}
