package io.xiaoyu.sys.modular.menus.controller.admin.view;


import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 视图层控制器
 */
@RestController
@RequestMapping("/admin-api/sys/menus/admin-menus")
public class AdminMenusViewController extends AdminBaseViewController{

    /*列表视图*/
    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                CRUDTable().
                headerToolbar(new ArrayList<Object>(){{
                       add(createButton(AdminMenusViewController.this,"新增","lg"));
                       addAll(baseHeaderToolBar());
                   }}).
                    quickSaveApi("/sys/menus/admin-menus/edit").
                    quickSaveItemApi("/sys/menus/admin-menus/edit").
                    loadDataOnce(true).
                    filterTogglable(false).
                    footerToolbar(new String[]{"statistics"}).
                api("/sys/menus/admin-menus/query-list").
                syncLocation(false).
                columns(new Object[]{
                    AmisFactory.TableColumn().name("id").label("id").render(),
                    AmisFactory.TableColumn().name("title").label("菜单名称").render(),
                    AmisFactory.TableColumn().name("icon")
                            .setType("flex")
                            .set("justify","start")
                            .set("items",new Object[]{
                                    AmisFactory.Amis()
                                            .set("type","custom-svg-icon")
                                            .set("className","mr-2 text-lg")
                                            .set("icon","${icon}")
                                            .set("className","text-lg mr-2")
                                            .render(),
                                    "${icon}"
                            })
                            .set("label","菜单图标")
                            .render(),
                    AmisFactory.TableColumn().name("url").label("菜单路由").render(),
                    AmisFactory.TableColumn().name("order").label("order")
                            .quickEdit(
                                AmisFactory.NumberControl()
                                    .min(0)
                                    .set("saveImmediately",true)
                                    .render()
                            ).render(),
                    AmisFactory.TableColumn().name("visible").label("是否可见")
                            .quickEdit(
                                AmisFactory.SwitchControl().mode("inline")
                                    .set("saveImmediately",true)
                                    .trueValue(1)
                                    .falseValue(0)
                                    .render()
                            ).render(),
                    AmisFactory.TableColumn().name("isHome").label("是否为首页")
                            .quickEdit(
                                AmisFactory.SwitchControl().mode("inline")
                                    .set("saveImmediately",true)
                                    .trueValue(1)
                                    .falseValue(0)
                                    .render()
                            ).render(),
                    AmisFactory.Operation().label("操作").buttons(new Object[]{
                        rowEditButton(this,"编辑",null),
                        rowDeleteButton("/sys/menus/admin-menus/delete"),
                    }).render()
                }).render(),
        }).render();

        return CommonAdminResp.success(page);
    }


    /*新增视图*/
    public HashMap<Object, Object> formView() {

        String api = isEdit() ? "/sys/menus/admin-menus/edit" : "/sys/menus/admin-menus/add";
        String title = isEdit() ? "编辑" : "新增";

        return baseForm(api,title).body(
            new Object[]{
                AmisFactory.GroupControl().body(new Object[]{
                    AmisFactory.Hidden().name("id").label("id").render(),
                    AmisFactory.TextControl().name("title").label("菜单名称").required(true).render(),
                    AmisFactory.TextControl().name("icon").label("菜单图标").
                            description("菜单图标"+"<a href=\"https://icones.js.org/collection/all\" target=\"_blank\"> https://icones.js.org</a>").
                            render(),
                }).render(),
                AmisFactory.Hidden().name("id").label("id").render(),
                AmisFactory.TextControl().name("parentId").label("parentId").render(),
                AmisFactory.TextControl().name("order").label("排序").render(),
                AmisFactory.TextControl().name("title").label("菜单名称").render(),
                AmisFactory.TextControl().name("icon").label("菜单图标").render(),
                AmisFactory.TextControl().name("url").label("菜单路由").render(),
                AmisFactory.TextControl().name("urlType").label("路由类型(1:路由,2:外链)").render(),
                AmisFactory.TextControl().name("visible").label("是否可见").render(),
                AmisFactory.TextControl().name("isHome").label("是否为首页").render(),
                AmisFactory.TextControl().name("extension").label("扩展").render(),
            }
        ).render();

    }


}


