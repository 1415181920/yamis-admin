package io.xiaoyu.modular.util;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FreemarkerUtil {

    static String ftlPath = "cocoyam-modules/cocoyam-module-gen/src/main/java/io/xiaoyu/modular/ftl/";

    static Template temp;

    /**
     * 读模板
     */
    public static void initConfig(String ftlName) throws IOException {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setDirectoryForTemplateLoading(new File(ftlPath));
        cfg.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_31));
        temp = cfg.getTemplate(ftlName);
    }

    /**
     * 根据模板，生成文件
     */
    public static void generator(String fileName, Map<String, Object> map) throws IOException, TemplateException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        temp.process(map, bw);
        bw.flush();
        fw.close();
    }
}
