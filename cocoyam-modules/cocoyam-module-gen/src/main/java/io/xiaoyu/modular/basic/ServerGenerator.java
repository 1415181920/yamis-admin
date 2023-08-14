package io.xiaoyu.modular.basic;


import cn.hutool.core.lang.Console;
import io.xiaoyu.modular.util.CommonUtil;
import io.xiaoyu.modular.util.DbUtil;
import io.xiaoyu.modular.util.Field;
import io.xiaoyu.modular.util.FreemarkerUtil;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ServerGenerator {
    static boolean readOnly = true;


    private static final String url="jdbc:mysql://localhost:3306/owl276";//数据库配置
    private static final String user="root";
    private static final String  password="123456";

    static String serverPath = "cocoyam-modules/cocoyam-module-[module]/src/main/java/io/xiaoyu/[module]/modular/[childModule]/";
    static String module = "auth";//主模块名
    static String childModule = "menus";//子模块名
    static String tableName = "admin_menus";//表名


    public static void main(String[] args) throws Exception {


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

        Console.log(fieldList);

        gen(Domain, param, "entity", "entity");
        gen(Domain, param, "controller/admin", "adminController");
        gen(Domain, param, "req", "saveReq");
        gen(Domain, param, "req", "queryReq");
        gen(Domain, param, "resp", "queryResp");
        gen(Domain, param, "service/impl", "serviceImpl");
        gen(Domain, param, "service", "service");
        gen(Domain, param, "mapper", "mapper");
        genXml(Domain, param, "mapper/mapping", "mapping");
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
