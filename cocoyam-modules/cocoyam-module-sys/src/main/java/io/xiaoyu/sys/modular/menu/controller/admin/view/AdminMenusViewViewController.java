package io.xiaoyu.sys.modular.menu.controller.admin.view;


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
@RequestMapping("/admin-api/admin-menus/menu")
public class AdminMenusViewViewController extends AdminBaseViewController {

    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
                    api("/admin-api/admin-menus/menu/query-list").
                    syncLocation(false).
                    columns(new Object[]{
                            AmisFactory.TableColumn().name("id").label("id").render(),
                            AmisFactory.TableColumn().name("parent_id").label("parent_id").render(),
                            AmisFactory.TableColumn().name("order").label("order").render(),
                            AmisFactory.TableColumn().name("title").label("title").render(),
                            AmisFactory.TableColumn().name("icon").label("icon").render(),
                            AmisFactory.TableColumn().name("url").label("url").render(),
                            AmisFactory.TableColumn().name("url_type").label("url_type").render(),
                            AmisFactory.TableColumn().name("visible").label("visible").render(),
                            AmisFactory.TableColumn().name("is_home").label("is_home").render(),
                            AmisFactory.TableColumn().name("extension").label("extension").render(),
                            AmisFactory.TableColumn().name("created_at").label("created_at").render(),
                            AmisFactory.TableColumn().name("updated_at").label("updated_at").render(),
                    }).render(),
        }).render();

        return new CommonAdminResp<>(page);
    }

}


