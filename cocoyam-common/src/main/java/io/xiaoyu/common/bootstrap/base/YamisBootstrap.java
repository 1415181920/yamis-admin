package io.xiaoyu.common.bootstrap.base;

import io.xiaoyu.common.bootstrap.pojo.YamisAssetStyle;
import io.xiaoyu.common.bootstrap.pojo.YamisLayout;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Component
public class YamisBootstrap {

    //获取全局公共样式
    YamisAssetStyle yamisAssetStyle = new YamisAssetStyle();
    //Layout样式
    YamisLayout yamisLayout = new YamisLayout();

    @Value("${website.app_name}")
    private String appName;



    public YamisBootstrap(@Value("${website.app_name}") String appName) {
            yamisAssetStyle.setCss(new String[]{});
            yamisAssetStyle.setJs(new String[]{});
            yamisAssetStyle.setScripts(new String[]{});
            yamisAssetStyle.setStyles(new String[]{});
            yamisLayout.setFooter(appName);
            yamisLayout.setTitle("%title% | "+appName);
    }
}



