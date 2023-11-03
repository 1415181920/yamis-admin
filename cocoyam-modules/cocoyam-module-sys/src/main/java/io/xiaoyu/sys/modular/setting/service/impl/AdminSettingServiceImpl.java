package io.xiaoyu.sys.modular.setting.service.impl;

import io.xiaoyu.common.util.CommonUrlUtil;
import io.xiaoyu.sys.modular.setting.resp.AdminSettingResponse;
import io.xiaoyu.sys.modular.setting.service.AdminSettingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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


    @Override
    public AdminSettingResponse getSetting() {
        HashMap<String, List[]> assets = new HashMap();
        assets.put("css", new ArrayList[]{});
        assets.put("js", new ArrayList[]{});
        assets.put("scripts", new ArrayList[]{});
        assets.put("styles", new  ArrayList[]{});
        adminSettingResponse.setAssets(assets);

        adminSettingResponse.setEnabled_extensions(new ArrayList<>());

        AdminSettingResponse.Layout layout = new AdminSettingResponse.Layout();
        layout.setTitle(app_name);
        AdminSettingResponse.Layout.Header header = new AdminSettingResponse.Layout.Header();
        header.setRefresh(true);
        header.setFull_screen(true);
        header.setTheme_config(true);
        layout.setHeader(header);
        AdminSettingResponse.Layout.Footer footer = new AdminSettingResponse.Layout.Footer();
        footer.setHtml(websiteFooter);
        layout.setFooter(footer);
        adminSettingResponse.setLayout(layout);
        adminSettingResponse.setLocale("zh_CN");
        adminSettingResponse.setLogin_captcha(true);

        adminSettingResponse.setLogo(commonUrlUtil.get(logo));
        AdminSettingResponse.Nav nav = new AdminSettingResponse.Nav();
        adminSettingResponse.setShow_development_tools(true);
        adminSettingResponse.setSystem_theme_setting(null);

        return adminSettingResponse;
    }
}
