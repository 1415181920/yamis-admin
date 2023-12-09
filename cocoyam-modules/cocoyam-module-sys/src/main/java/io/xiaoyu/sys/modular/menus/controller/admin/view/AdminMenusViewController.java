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
                AmisFactory.GroupControl().body(new Object[]{
                    AmisFactory.TreeSelectControl().name("parentId").
                            label("父级菜单").labelField("title").valueField("id").
                            showIcon(false).value(0).source("/sys/menus/admin-menus/query-list").render(),
                    AmisFactory.TextControl().name("component").label("组件").description("默认为 amis , 非自定义前端页面请勿修改")
                            .value("amis").render(),
                }).render(),

                AmisFactory.TextControl().name("url").label("菜单路由")
                        .required(true)
                        .validateOnChange(true)
                        .validations(new HashMap<String,Object>(){{
                            put("matchRegexp","/^(http(s)?\\:\\/)?(\\/)+/");
                        }}).validationErrors(new HashMap<String,String>(){{
                            put("matchRegexp","必须以/开头");
                        }}).placeholder("请输入菜单路由")
                            .render(),
                AmisFactory.NumberControl().name("order").label("排序")
                        .required(true)
                        .displayMode("enhance")
                        .description("升序")
                        .min(0)
                        .value(0)
                        .render(),
                AmisFactory.ListControl().name("urlType").label("路由类型")
                        .options(new HashMap<String,Object>(){{
                            put("1","路由");
                            put("2","外链");
                        }}).value(1).render(),
                AmisFactory.SwitchControl().name("visible").label("是否可见")
                        .onText("显示")
                        .offText("隐藏")
                        .value(1)
                        .render(),
                AmisFactory.SwitchControl().name("isHome").label("是否为首页")
                        .onText("是")
                        .offText("否")
                        .value(0)
                        .description("是否为首页")
                        .render(),
                AmisFactory.SwitchControl().name("isFull").label("是否全屏")
                        .onText("是")
                        .offText("否")
                        .value(0)
                        .description("是否全屏")
                        .render(),



//                    amis()->TextControl('url', __('admin.admin_menu.url'))
//                ->required()
//                ->validateOnChange()
//                ->validations(['matchRegexp' => '/^(http(s)?\:\/)?(\/)+/'])
//                ->validationErrors(['matchRegexp' => __('admin.need_start_with_slash')])
//                ->placeholder('eg: /admin_menus'),
//                amis()->NumberControl('order', __('admin.admin_menu.order'))
//                ->required()
//                ->displayMode('enhance')
//                ->description(__('admin.order_asc'))
//                ->min(0)
//                ->value(0),
//                amis()->ListControl('url_type', __('admin.admin_menu.type'))
//                ->options(Admin::adminMenuModel()::getType())
//                ->value(Admin::adminMenuModel()::TYPE_ROUTE),
//        amis()->SwitchControl('visible', __('admin.admin_menu.visible'))
//                ->onText(__('admin.admin_menu.show'))
//                ->offText(__('admin.admin_menu.hide'))
//                ->value(1),
//                amis()->SwitchControl('is_home', __('admin.admin_menu.is_home'))
//                ->onText(__('admin.yes'))
//                ->offText(__('admin.no'))
//                ->description(__('admin.admin_menu.is_home_description'))
//                ->value(0),
//                amis()->SwitchControl('is_full', __('admin.admin_menu.is_full'))
//                ->onText(__('admin.yes'))
//                ->offText(__('admin.no'))
//                ->description(__('admin.admin_menu.is_full_description'))
//                ->value(0),
//                AmisFactory.TextControl().name("parentId").label("parentId").render(),
//                AmisFactory.TextControl().name("title").label("菜单名称").render(),
//                AmisFactory.TextControl().name("icon").label("菜单图标").render(),
//                AmisFactory.TextControl().name("url").label("菜单路由").render(),
//                AmisFactory.TextControl().name("order").label("排序").render(),
//
//                AmisFactory.TextControl().name("urlType").label("路由类型(1:路由,2:外链)").render(),
//                AmisFactory.TextControl().name("visible").label("是否可见").render(),
//                AmisFactory.TextControl().name("isHome").label("是否为首页").render(),
//                AmisFactory.TextControl().name("extension").label("扩展").render(),
            }
        ).render();

    }


}


