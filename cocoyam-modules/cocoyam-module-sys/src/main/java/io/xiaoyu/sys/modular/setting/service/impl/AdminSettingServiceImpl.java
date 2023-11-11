package io.xiaoyu.sys.modular.setting.service.impl;

import cn.hutool.core.bean.BeanUtil;
import io.xiaoyu.common.bootstrap.base.YamisBootstrap;
import io.xiaoyu.common.bootstrap.pojo.YamisAssetStyle;
import io.xiaoyu.common.bootstrap.pojo.YamisLayout;
import io.xiaoyu.common.util.CommonUrlUtil;
import io.xiaoyu.sys.modular.setting.resp.AdminSettingResponse;
import io.xiaoyu.sys.modular.setting.service.AdminSettingService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class AdminSettingServiceImpl implements AdminSettingService {

    @Resource
    private AdminSettingResponse adminSettingResponse;

    @Resource
    private CommonUrlUtil commonUrlUtil;

    @Value("${website.app_name}")
    private String app_name;

    @Value("${website.logo}")
    private String logo;

    @Value("${website.footer}")
    private String websiteFooter;

    @Resource
    private YamisBootstrap yamisBootstrap;

    @Override
    public AdminSettingResponse getSetting() {
        YamisAssetStyle yamisAssetStyle = yamisBootstrap.getYamisAssetStyle();

        //注入全局公共样式
        BeanUtil.copyProperties(yamisAssetStyle, adminSettingResponse.getAssets());


        AdminSettingResponse.Layout layout = getLayout();
        adminSettingResponse.setLayout(layout);


        adminSettingResponse.setLocale("zh_CN");
        adminSettingResponse.setLogin_captcha(true);

        adminSettingResponse.setLogo(commonUrlUtil.get(logo));

        BeanUtil.copyProperties(yamisAssetStyle, adminSettingResponse.getNav());

        adminSettingResponse.setShow_development_tools(true);
        adminSettingResponse.setSystem_theme_setting(null);

        return adminSettingResponse;
    }

    private AdminSettingResponse.Layout getLayout() {
        AdminSettingResponse.Layout layout = new AdminSettingResponse.Layout();
        System.out.println(yamisBootstrap.getYamisAssetStyle());
        System.out.println(yamisBootstrap.getYamisLayout());
        BeanUtil.copyProperties(yamisBootstrap.getYamisLayout(),layout);
        return layout;
    }
}
