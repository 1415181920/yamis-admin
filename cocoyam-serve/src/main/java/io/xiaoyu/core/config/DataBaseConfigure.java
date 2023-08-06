package io.xiaoyu.core.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
public class DataBaseConfigure {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    // 添加属性的getter和setter方法
    // 注意：属性的名称应与配置文件中的键对应
}