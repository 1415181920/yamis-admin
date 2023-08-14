package io.xiaoyu.auth.modular.menus.controller.admin;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.AdminMenusService;
import io.xiaoyu.common.resp.CommonResp;
import io.xiaoyu.common.resp.PageResp;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/admin-api/admin-menus/menus")
public class AdminMenusAdminController extends AdminBaseController{

    @Resource
    private AdminMenusService adminMenusService;

    @GetMapping("/query-list")
    public CommonResp<PageResp<AdminMenusQueryResp>> queryList(@Valid AdminMenusQueryReq req) {
        System.out.println(1231233);
        PageResp<AdminMenusQueryResp> list = adminMenusService.queryList(req);
        return new CommonResp<>(list);
    }

    @GetMapping("/get-admin-menus")
    public HashMap<String,Object> menu(){
        ArrayList<Object> adminMenus = adminMenusService.getAdminMenus();
        Console.log(adminMenus);
        HashMap<String, Object> list = new HashMap<String, Object>();
        list.put("status",0);
        list.put("msg","ok");
        list.put("doNotDisplayToast",0);
        list.put("data",adminMenus);
        return list;
    }

    @GetMapping("_settings")
    public Object settings(){
        String jsonStr = "{\"status\":0,\"msg\":\"\",\"doNotDisplayToast\":0,\"data\":{\"nav\":{\"appendNav\":null,\"prependNav\":null},\"assets\":{\"js\":[],\"css\":[],\"scripts\":[],\"styles\":[]},\"app_name\":\"Owl Admin\",\"locale\":\"zh_CN\",\"layout\":{\"title\":\"%title% | OwlAdmin\",\"header\":{\"refresh\":true,\"full_screen\":true,\"theme_config\":true},\"keep_alive_exclude\":[],\"footer\":\"<a href=\\\"https:\\/\\/github.com\\/slowlyo\\/owl-admin\\\" target=\\\"_blank\\\">Owl Admin<\\/a>\"},\"logo\":\"http:\\/\\/owl276.test\\/admin\\/logo.png\",\"login_captcha\":true,\"show_development_tools\":true,\"system_theme_setting\":null,\"enabled_extensions\":[]}}";
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);
        Console.log(jsonObject);
        return jsonObject;
    }

}
