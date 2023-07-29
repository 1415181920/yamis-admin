package io.xiaoyu.modular.basic;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeGen {
    public static void main(String[] args) {
        List<String> tables = new ArrayList<>();
        tables.add("admin_roles");

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/owl9","root","123456")
                .globalConfig(builder -> {
                    builder.author("xiaoyu")               //作者
                            .outputDir(System.getProperty("user.dir")+"/cocoyam-modules/cocoyam-module-sys/src/main/java")    //输出路径(写到java目录)
//                            .enableSwagger()           //开启swagger
//                            .enableFileOverride()      //开启覆盖之前生成的文件
                            .commentDate("yyyy-MM-dd")
                            .fileOverride();            //开启覆盖之前生成的文件

                })
                .packageConfig(builder -> {
                    builder.parent("io.xiaoyu")//父包名
                            .moduleName("io.xiaoyu.user")//模块名
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .controller("controller")
                            .mapper("mapper")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,System.getProperty("user.dir")+"/cocoyam-modules/cocoyam-module-auth/src/main/java"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            // 映射路径使用连字符格式，而不是驼峰
                            .enableHyphenStyle()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            //生成通用的resultMap
                            .enableBaseResultMap()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .enableFileOverride()
//                            .enableFileOverride()      //开启覆盖之前生成的文件
                            .formatXmlFileName("%sMapper");
                })

                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
