package io.xiaoyu.gen.modular.controller.admin.view;

import io.xiaoyu.common.basic.controller.AdminBaseViewController;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GeneratorViewController extends AdminBaseViewController {


    @GetMapping("/admin-api/gen-code-view")
    public CommonAdminResp<HashMap<Object,Object>> genCodeView(){

        HashMap<Object,Object> page =  baseForm("/gen-code","代码生成器").body(
            new Object[]{
                AmisFactory.TextControl().name("module").
                        label("主模块名").value("sys").required(true).placeholder("请输入主模块名").render(),
                AmisFactory.TextControl().name("childModule").
                        label("子模块名").value("admin").required(true).placeholder("请输入子模块名").render(),
                AmisFactory.TextControl().name("tableName").
                        label("表名").value("admin_roles").required(true).placeholder("请输入表名").render(),
                AmisFactory.TextControl().name("serverPath").
                        label("生成路径(不建议修改)").required(true).placeholder("请输入生成路径")
                        .value("cocoyam-modules/cocoyam-module-[module]/src/main/java/io/xiaoyu/[module]/modular/[childModule]/")
                        .render(),
                }
        ).render();

        return CommonAdminResp.success(page);

    }


}
