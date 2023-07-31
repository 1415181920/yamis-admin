package io.xiaoyu.modular.basic;

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
    static String vuePath = "admin/src/views/main/";

    static String serverPath = "cocoyam-modules/cocoyam-module-[module]/src/main/java/io/xiaoyu/[module]/modular/login/";

    static String module = "auth";//主模块名

    static String tableName = "system_users";//表名




    static {
        new File(serverPath).mkdirs();
    }

    public static void main(String[] args) throws Exception {

        DbUtil.url = "jdbc:mysql://localhost:3306/yamis";
        DbUtil.user = "root";
        DbUtil.password = "root";

        serverPath = serverPath.replace("[module]", module);

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
        param.put("fieldList", fieldList);
        param.put("typeSet", typeSet);
        param.put("readOnly", readOnly);
        System.out.println("组装参数：" + param);

        gen(Domain, param, "service", "service");
        gen(Domain, param, "controller/admin", "adminController");
        gen(Domain, param, "req", "saveReq");
        gen(Domain, param, "req", "queryReq");
        gen(Domain, param, "resp", "queryResp");

//        genVue(do_main, param);
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

    private static void genVue(String do_main, Map<String, Object> param) throws IOException, TemplateException {
        FreemarkerUtil.initConfig("vue.ftl");
        new File(vuePath + module).mkdirs();
        String fileName = vuePath + module + "/" + do_main + ".vue";
        System.out.println("开始生成：" + fileName);
        FreemarkerUtil.generator(fileName, param);
    }

//    private static String getGeneratorPath() throws DocumentException {
//        SAXReader saxReader = new SAXReader();
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("pom", "http://maven.apache.org/POM/4.0.0");
//        saxReader.getDocumentFactory().setXPathNamespaceURIs(map);
//        Document document = saxReader.read(pomPath);
//        Node node = document.selectSingleNode("//pom:configurationFile");
//        System.out.println(node.getText());
//        return node.getText();
//    }

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
