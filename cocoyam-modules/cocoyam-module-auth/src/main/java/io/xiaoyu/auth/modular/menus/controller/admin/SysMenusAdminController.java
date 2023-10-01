package io.xiaoyu.auth.modular.menus.controller.admin;

import io.xiaoyu.auth.modular.menus.service.SysAdminMenusService;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin-api")
public class SysMenusAdminController extends AdminBaseController{

    @Resource
    private SysAdminMenusService adminMenusService;


    @GetMapping("/menus")
    public String getMenus(){
        return "hello";
    }


}
