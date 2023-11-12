package io.xiaoyu.gen.modular.controller.admin;


import cn.hutool.core.lang.Console;
import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.gen.modular.req.GenCodeReq;
import io.xiaoyu.gen.modular.util.CommonUtil;
import io.xiaoyu.gen.modular.util.DbUtil;
import io.xiaoyu.gen.modular.util.Field;
import io.xiaoyu.gen.modular.util.FreemarkerUtil;
import freemarker.template.TemplateException;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
public class GeneratorController {
    static boolean readOnly = true;


    private static final String url="jdbc:mysql://106.52.14.176:3306/yamis";//数据库配置
    private static final String user="yamis";
    private static final String  password="yamis123456";

    static String serverPath = "";
    static String module = "";//主模块名
    static String childModule = "";//子模块名
    static String tableName = "";//表名


    @PostMapping("/admin-api/gen-code")
    public CommonAdminResp<String> genCode(@RequestBody GenCodeReq genCodeReq) throws Exception {

        serverPath = genCodeReq.getServerPath();
        module = genCodeReq.getModule();
        childModule = genCodeReq.getChildModule();
        tableName = genCodeReq.getTableName();

        System.out.println(tableName);

        DbUtil.url = url;
        DbUtil.user = user;
        DbUtil.password = password;

        serverPath = serverPath.replace("[module]", module);
        serverPath = serverPath.replace("[childModule]", childModule);

        String Domain = CommonUtil.toCamelCase(tableName);
        String domain = Domain.substring(0, 1).toLowerCase() + Domain.substring(1);
        String do_main = tableName.replaceAll("_", "-");

        List<Field> fieldList = DbUtil.getColumnByTableName(tableName);
        Set<String> typeSet = getJavaTypes(fieldList);

        // 组装参数
        Map<String, Object> param = new HashMap<>();
        param.put("module", module);
        param.put("Domain", Domain);
        param.put("domain", domain);
        param.put("do_main", do_main);
        param.put("tableName", tableName);
        param.put("fieldList", fieldList);
        param.put("typeSet", typeSet);
        param.put("readOnly", readOnly);
        param.put("childModule", childModule);
        System.out.println("组装参数：" + param);


        gen(Domain, param, "entity", "entity");
        gen(Domain, param, "controller/admin", "adminController");
        gen(Domain, param, "controller/admin/view", "viewController");
        gen(Domain, param, "req", "saveReq");
        gen(Domain, param, "req", "queryReq");
        gen(Domain, param, "resp", "queryResp");
        gen(Domain, param, "service/impl", "serviceImpl");
        gen(Domain, param, "service", "service");
        gen(Domain, param, "mapper", "mapper");
        genXml(Domain, param, "mapper/mapping", "mapping");
        return CommonAdminResp.ok("成功！");
    }

    private static void gen(String Domain, Map<String, Object> param, String packageName, String target) throws IOException, TemplateException {
        FreemarkerUtil.initConfig(target + ".ftl");
        String toPath = serverPath + packageName + "/";

        new File(toPath).mkdirs();
        String Target = target.substring(0, 1).toUpperCase() + target.substring(1);
        String fileName = toPath + Domain + Target + ".java";
        System.out.println("开始生成：" + fileName);
        FreemarkerUtil.generator(fileName, param);
    }
    private static void genXml(String Domain, Map<String, Object> param, String packageName, String target) throws IOException, TemplateException {
        FreemarkerUtil.initConfig(target + ".ftl");
        String toPath = serverPath + packageName + "/";

        new File(toPath).mkdirs();
//        String Target = target.substring(0, 1).toUpperCase() + target.substring(1);
        String fileName = toPath + Domain + "Mapper.xml";
        System.out.println("开始生成：" + fileName);
        FreemarkerUtil.generator(fileName, param);
    }

    /**
     * 获取所有的Java类型，使用Set去重
     */
    private static Set<String> getJavaTypes(List<Field> fieldList) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < fieldList.size(); i++) {
            Field field = fieldList.get(i);
            set.add(field.getJavaType());
        }
        return set;
    }
}
