package io.xiaoyu.sys.modular.admin.controller.admin.view;


import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 视图层控制器
 */
@RestController
@RequestMapping("/admin-api/admin-users/admin")
public class AdminUsersViewViewController extends AdminBaseViewController {

    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
                    api("/admin-users/admin/query-list").
                    syncLocation(false).
                    columns(new Object[]{
                            AmisFactory.TableColumn().name("id").label("id").render(),
                            AmisFactory.TableColumn().name("username").label("username").render(),
                            AmisFactory.TableColumn().name("password").label("password").render(),
                            AmisFactory.TableColumn().name("name").label("name").render(),
                            AmisFactory.TableColumn().name("avatar").label("avatar").render(),
                            AmisFactory.TableColumn().name("remember_token").label("remember_token").render(),
                            AmisFactory.TableColumn().name("created_at").label("created_at").render(),
                            AmisFactory.TableColumn().name("updated_at").label("updated_at").render(),
                    }).render(),
        }).render();
        return new CommonAdminResp<>(page);
    }




}

