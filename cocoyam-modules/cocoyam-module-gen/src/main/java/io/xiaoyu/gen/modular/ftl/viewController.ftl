package io.xiaoyu.${module}.modular.${childModule}.controller.admin.view;


import io.xiaoyu.common.basic.controller.AdminBaseController;
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
public class ${Domain}ViewController extends AdminBaseController{

    @GetMapping("/list-view")
    public CommonAdminResp<HashMap<Object, Object>> listView() {

        HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
            AmisFactory.
                    CRUDTable().
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
                    }).render(),
        }).render();

        return new CommonAdminResp<>(page);
    }

}


