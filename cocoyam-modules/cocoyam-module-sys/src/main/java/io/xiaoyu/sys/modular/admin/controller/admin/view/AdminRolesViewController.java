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
@RequestMapping("/admin-api/sys/admin/admin-roles")
public class AdminRolesViewController extends AdminBaseViewController{

    /*列表视图*/
    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                CRUDTable().
                headerToolbar(new Object[]{
                        createButton(this,"新增",null)
                }).
                api("/sys/admin/admin-roles/query-list").
                syncLocation(false).
                columns(new Object[]{
                    AmisFactory.TableColumn().name("id").label("id").render(),
                    AmisFactory.TableColumn().name("name").label("角色名").render(),
                    AmisFactory.TableColumn().name("slug").label("标识").render(),
                    AmisFactory.TableColumn().name("createdAt").label("开始时间").render(),
                    AmisFactory.TableColumn().name("updatedAt").label("更新时间").render(),
                    AmisFactory.Operation().label("操作").buttons(new Object[]{
                        rowEditButton(this,"编辑",null),
                        rowDeleteButton("/sys/admin/admin-roles/delete"),
                    }).render()
                }).render(),
        }).render();

        return CommonAdminResp.success(page);
    }


    /*新增视图*/
    public HashMap<Object, Object> formView() {

        String api = isEdit() ? "/sys/admin/admin-roles/edit" : "/sys/admin/admin-roles/add";
        String title = isEdit() ? "编辑" : "新增";

        return baseForm(api,title).body(
            new Object[]{
                AmisFactory.Hidden().name("id").label("id").render(),
                AmisFactory.TextControl().name("name").label("角色名").render(),
                AmisFactory.TextControl().name("slug").label("标识").render(),
            }
        ).render();

    }


}


