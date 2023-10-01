package io.xiaoyu.sys.modular.menu.controller.admin.view;


import io.xiaoyu.common.basic.controller.AdminBaseController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * 视图层控制器
 */
@RestController
@RequestMapping("/admin-api/admin-menus/menu")
public class AdminMenusViewController extends AdminBaseController{

    @GetMapping("/list-view")
    public CommonAdminResp<Map<Object, Object>> listView() {

        Map<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
                    api("/admin-api/admin-menus/menu/query-list").
                    syncLocation(false).
                    columns(new Object[]{
                            AmisFactory.TableColumn().name("id").label("id").toArray(),
                            AmisFactory.TableColumn().name("parent_id").label("parent_id").toArray(),
                            AmisFactory.TableColumn().name("order").label("order").toArray(),
                            AmisFactory.TableColumn().name("title").label("title").toArray(),
                            AmisFactory.TableColumn().name("icon").label("icon").toArray(),
                            AmisFactory.TableColumn().name("url").label("url").toArray(),
                            AmisFactory.TableColumn().name("url_type").label("url_type").toArray(),
                            AmisFactory.TableColumn().name("visible").label("visible").toArray(),
                            AmisFactory.TableColumn().name("is_home").label("is_home").toArray(),
                            AmisFactory.TableColumn().name("extension").label("extension").toArray(),
                            AmisFactory.TableColumn().name("created_at").label("created_at").toArray(),
                            AmisFactory.TableColumn().name("updated_at").label("updated_at").toArray(),
                    }).toArray(),
        }).toArray();

        return new CommonAdminResp<>(page);
    }

}


