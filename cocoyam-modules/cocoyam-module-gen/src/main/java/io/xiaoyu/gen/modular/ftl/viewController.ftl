package io.xiaoyu.${module}.modular.${childModule}.controller.admin.view;


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
@RequestMapping("/admin-api/${module}/${childModule}/${do_main}")
public class ${Domain}ViewController extends AdminBaseViewController{

    /*列表视图*/
    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                CRUDTable().
                headerToolbar(new Object[]{
                        createButton(this)
                }).
                api("/${module}/${childModule}/${do_main}/query-list").
                syncLocation(false).
                columns(new Object[]{
            <#list fieldList as field>
                <#if field.comment != "">
                    AmisFactory.TableColumn().name("${field.name}").label("${field.comment}").render(),
                <#else>
                    AmisFactory.TableColumn().name("${field.name}").label("${field.name}").render(),
                </#if>
            </#list>
                    AmisFactory.Operation().label("操作").buttons(new Object[]{
                        rowEditButton(this),
                    }).render()
                }).render(),
        }).render();

        return CommonAdminResp.ok(page);
    }


    /*新增视图*/
    public HashMap<Object, Object> formView() {

        return baseForm("/${module}/${childModule}/${do_main}/add","新增").body(
            new Object[]{
        <#list fieldList as field>
        <#if field.name != "created_at" && field.name != "updated_at" && field.name!= "deleted_at" && field.name!= "id" >
            <#if field.comment != "">
                AmisFactory.TextControl().name("${field.name}").label("${field.comment}").render(),
            </#if>
            <#if field.comment == "">
                AmisFactory.TextControl().name("${field.name}").label("${field.name}").render(),
            </#if>
        </#if>
        </#list>
            }
        ).render();

    }


}


