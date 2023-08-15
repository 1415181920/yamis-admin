package io.xiaoyu.auth.modular.menus.controller.admin;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.AdminMenusService;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/admin-api/admin-menus/menus")
public class AdminMenusAdminController extends AdminBaseController{

    @Resource
    private AdminMenusService adminMenusService;

    @GetMapping("/view/query")
    public HashMap<String, Object> queryView() {
//        Object view =  AmisFactory.Page().body("hello world").toArray();
        Object page = AmisFactory.Page().body(new HashMap<String,Object>(){{
            put("type","crud");
            put("api","/admin-menus/menus/query-list");
            put("syncLocation",false);
            put("columns",new Object[]{
                    AmisFactory.TableColumn().name("id").label("ID").toArray(),
                    AmisFactory.TableColumn().name("title").label("名称").toArray(),
            });
        }}).toArray();
        HashMap<String, Object> list = new HashMap<String, Object>();
        list.put("status",0);
        list.put("msg","ok");
        list.put("doNotDisplayToast",0);
        list.put("data",page);
        return list;
    }


    @GetMapping("/view/query2")
    public HashMap<String, Object> queryView2() {
        Object Page =  AmisFactory.Page().body(new Object[] {
                AmisFactory.Form().name("my_form").body(
                        new Object[] {
                                AmisFactory.InputDatetimeRange()
                                        .name("date")
                                        .label("日期范围")
                                        .required(true)
                                        .format("YYYY-MM-DD HH:mm:ss")
                                        .value("2020-01-01 00:00:00").toArray(),
                                AmisFactory.TextControl().name("name").label("姓名").required(true).toArray(),
                                AmisFactory.TextControl().name("age").label("年龄").required(true).toArray(),
                                AmisFactory.TextControl().name("keyword").label("关键字").addOn(new Object[] {
                                        new HashMap<String,Object>() {{
                                            put("label", "搜索");
                                            put("type", "button");
                                            put("actionType", "reload");
                                            put("target", "my_form.user_list");
                                        }}
                                }).toArray(),
                                AmisFactory.SelectControl().name("user_list")
                                        .label("用户列表")
                                        .source("https://houtai.baidu.com/api/mock2/options/cities")
                                        .style(new HashMap<String,Object>() {{
                                            put("width", "800px");
                                        }}).toArray(),
                        }
                ).actions(new Object[] {
                        AmisFactory.VanillaAction().
                                label("查询").
                                type("submit").
                                set("api","https://houtai.baidu.com/api/mock2/form/saveForm?waitSeconds=2").toArray(),

                        AmisFactory.VanillaAction().
                                label("导出").
                                type("submit").
                                set("api","https://houtai.baidu.com/api/mock2/form/saveForm?waitSeconds=2").toArray()
                }).toArray(),
        }).toArray();
        HashMap<String, Object> list = new HashMap<String, Object>();
        list.put("status",0);
        list.put("msg","ok");
        list.put("doNotDisplayToast",0);
        list.put("data",Page);
        return list;
    }

    @GetMapping("/view/query3")
    public HashMap<String, Object> queryView3() {
        Object view =  AmisFactory.Page().body( new Object[]{
            AmisFactory.Form().api("/view/query").body(new Object[] {
               AmisFactory.TextControl().name("name").label("姓名1").onEvent(new Object[] {
                       new HashMap<String,Object>() {{
                           put("type", "change");
                           put("target", "name2");
                           put("actionType", "setOptions");
                           put("api", "/view/query");
                           put("data", new HashMap<String,Object>() {{
                               put("name", "${name}");
                           }});
                       }}}).toArray(),
                    AmisFactory.TextControl().name("name1").label("姓名").toArray(),
                    AmisFactory.TextControl().name("name2").label("姓名").toArray(),
//                    AmisFactory.TextControl().name("name2").label("姓名").toArray(),

            }).toArray(),
        }).toArray();

        HashMap<String, Object> list = new HashMap<String, Object>();
        list.put("status",0);
        list.put("msg","ok");
        list.put("doNotDisplayToast",0);
        list.put("data",view);
        return list;
    }

    @GetMapping("/query-list")
    public Object queryList(AdminMenusQueryReq req) {
        System.out.println(req);
        PageResp<AdminMenusQueryResp> list = adminMenusService.queryList(req);
//        HashMap<String, Object> mp = new HashMap<String, Object>();
//        mp.put("status",0);
//        mp.put("msg","ok");
//        mp.put("doNotDisplayToast",0);
//        mp.put("data",list);
        return new CommonAdminResp<Object>(list);
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
        return jsonObject.toString();
    }

}
