package io.xiaoyu.gen.modular.controller.admin.view;

import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import io.xiaoyu.common.yaims.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GeneratorViewController {


    @GetMapping("/admin-api/gen-code-view")
    public CommonAdminResp<Map<Object, Object>> genCodeView(){
        Map<Object, Object> render = AmisFactory.Page().body(
            new Object[]{
                    AmisFactory.Form().title("代码生成器").mode("horizontal").
                            set("dsType","api").
                            set("feat","Insert").
                            id("form").
                            body(new Object[]{
                            AmisFactory.TextControl().name("module").
                                    label("主模块名").required(true).placeholder("请输入主模块名").render(),
                            AmisFactory.TextControl().name("childModule").
                                    label("子模块名").required(true).placeholder("请输入子模块名").render(),
                            AmisFactory.TextControl().name("tableName").
                                    label("表名").required(true).placeholder("请输入表名").render(),
                            AmisFactory.TextControl().name("serverPath").
                                    label("生成路径(不建议修改)").required(true).placeholder("请输入生成路径")
                                    .value("cocoyam-modules/cocoyam-module-[module]/src/main/java/io/xiaoyu/[module]/modular/[childModule]/")
                                    .render(),
                    }).set("api",new HashMap<String,Object>(){{
                                put("url","/gen-code");
                                put("method","post");
                            }}).
                       set("actions",new Object[]{
                            AmisFactory.Button().label("提交").
                                    onEvent(new HashMap<String,Object>(){{
                                        put("click",new HashMap<Object,Object>(){{
                                            put("actions",new Object[]{
                                                   new HashMap<String,String>(){{
                                                       put("actionType","submit");
                                                       put("componentId","form");
                                                   }}
                                            });
                                        }});
                                    }}).render(),

                            }).
                       set("resetAfterSubmit",true).
                       set("horizontal",new HashMap<String,Integer>(){{
                                put("left",2);
                                put("right",7);
                    }}).render(),

            }
        ).render();


        return new CommonAdminResp<>(render);
    }


}
