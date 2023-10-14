package io.xiaoyu.sys.modular.admin.controller.admin.view;


import io.xiaoyu.common.basic.controller.AdminBaseController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 视图层控制器
 */
@RestController
@RequestMapping("/admin-api/admin-users/admin")
public class AdminUsersViewController extends AdminBaseController{

    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
                    api("/admin-users/admin/query-list").
                    syncLocation(false).
                    columns(new Object[]{
                            AmisFactory.TableColumn().name("id").label("id"),
                            AmisFactory.TableColumn().name("username").label("username"),
                            AmisFactory.TableColumn().name("password").label("password").toArray(),
                            AmisFactory.TableColumn().name("name").label("name").toArray(),
                            AmisFactory.TableColumn().name("avatar").label("avatar").toArray(),
                            AmisFactory.TableColumn().name("remember_token").label("remember_token").toArray(),
                            AmisFactory.TableColumn().name("created_at").label("created_at").toArray(),
                            AmisFactory.TableColumn().name("updated_at").label("updated_at").toArray(),
                    }),
        }).toArray();

        return new CommonAdminResp<>(page);
    }

}


