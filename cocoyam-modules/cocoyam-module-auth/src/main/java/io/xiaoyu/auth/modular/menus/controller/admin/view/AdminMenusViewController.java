package io.xiaoyu.auth.modular.menus.controller.admin.view;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import io.xiaoyu.auth.modular.menus.req.AdminMenusQueryReq;
import io.xiaoyu.auth.modular.menus.resp.AdminMenusQueryResp;
import io.xiaoyu.auth.modular.menus.service.AdminMenusService;
import io.xiaoyu.common.basic.controller.AdminBaseController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/admin-api/admin-menus/menus")
public class AdminMenusViewController extends AdminBaseController{

    @GetMapping("/view")
    public HashMap<String, Object> queryView() {

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

}
