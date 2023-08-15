package io.xiaoyu.auth.modular.menus.controller.admin.view;


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
@RequestMapping("/admin-api/admin-menus/menus")
public class AdminMenusViewController extends AdminBaseController{

    @GetMapping("/list-view")
    public CommonAdminResp<Map<Object, Object>> listView() {

        Map<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
                    api("/admin-menus/menus/query-list").
                    syncLocation(false).
                    columns(new Object[]{
                            AmisFactory.TableColumn().name("id").label("ID").toArray(),
                            AmisFactory.TableColumn().name("title").label("名称").toArray(),
                    }).toArray(),
        }).toArray();

        return new CommonAdminResp<>(page);
    }

}
