package io.xiaoyu.auth.modular.test.controller.admin;

import cn.hutool.json.JSONUtil;
import cn.hutool.json.ObjectMapper;
import io.xiaoyu.auth.modular.test.req.TestUsersQueryReq;
import io.xiaoyu.auth.modular.test.resp.TestUsersQueryResp;
import io.xiaoyu.auth.modular.test.service.TestUsersService;
import io.xiaoyu.common.resp.CommonResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.common.yaims.AmisFactory;
import io.xiaoyu.common.yaims.Array;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import io.xiaoyu.common.basic.controller.AdminBaseController;
import org.springframework.ui.Model;


import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/test-users/test")
public class TestUsersAdminController extends AdminBaseController{

    @Resource
    private TestUsersService testUsersService;

    @GetMapping("/index")
    public CommonResp index(){
        Map<Object, Object> Page =  AmisFactory.Page().body(new Object[] {
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

        return new CommonResp<>(Page);
    }

    @GetMapping("/index2")
    public CommonResp index2(){
        Map<Object, Object> Page =  AmisFactory.Page().body(new Object[] {
                AmisFactory.Form().name("my_form").body(new Array[]{}).actions(new Object[] {
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

        return new CommonResp<>(Page);
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<TestUsersQueryResp>> queryList(@Valid TestUsersQueryReq req) {
        PageResp<TestUsersQueryResp> list = testUsersService.queryList(req);
        return new CommonResp<>(list);
    }

}
