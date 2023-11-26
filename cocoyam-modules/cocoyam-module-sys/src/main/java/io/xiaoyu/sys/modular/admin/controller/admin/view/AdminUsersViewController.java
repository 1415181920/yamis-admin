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
@RequestMapping("/admin-api/sys/admin/admin-users")
public class AdminUsersViewController extends AdminBaseViewController{

    /*列表视图*/
    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                CRUDTable().
                headerToolbar(new Object[]{
                        createButton(this)
                }).
                api("/sys/admin/admin-users/query-list").
                syncLocation(false).
                columns(new Object[]{
                    AmisFactory.TableColumn().name("id").label("id").render(),
                    AmisFactory.TableColumn().name("username").label("username").render(),
                    AmisFactory.TableColumn().name("password").label("password").render(),
                    AmisFactory.TableColumn().name("name").label("name").render(),
                    AmisFactory.TableColumn().name("avatar").label("avatar").render(),
                    AmisFactory.TableColumn().name("rememberToken").label("rememberToken").render(),
                    AmisFactory.TableColumn().name("createdAt").label("createdAt").render(),
                    AmisFactory.TableColumn().name("updatedAt").label("updatedAt").render(),
                    AmisFactory.Operation().label("操作").buttons(new Object[]{
                        rowEditButton(this),
                        rowDeleteButton("/sys/admin/admin-users/delete"),
                    }).render()
                }).render(),
        }).render();

        return CommonAdminResp.success(page);
    }


    /*新增视图*/
    public HashMap<Object, Object> formView() {

        String api = isEdit() ? "/sys/admin/admin-users/edit" : "/sys/admin/admin-users/add";
        String title = isEdit() ? "编辑" : "新增";

        return baseForm(api,title).body(
            new Object[]{
                AmisFactory.Hidden().name("id").label("id").render(),
                AmisFactory.TextControl().name("username").label("username").render(),
                AmisFactory.TextControl().name("password").label("password").render(),
                AmisFactory.TextControl().name("name").label("name").render(),
                AmisFactory.TextControl().name("avatar").label("avatar").render(),
                AmisFactory.TextControl().name("rememberToken").label("rememberToken").render(),
            }
        ).render();

    }


}


