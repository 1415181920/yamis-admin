package io.xiaoyu.sys.modular.setting.service.impl;

import io.xiaoyu.sys.modular.setting.resp.AdminSettingResponse;
import io.xiaoyu.sys.modular.setting.service.AdminSettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class AdminSettingServiceImpl implements AdminSettingService {

    @Resource
    private AdminSettingResponse adminSettingResponse;

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
        layout.setTitle("Cocoyam");
        AdminSettingResponse.Layout.Header header = new AdminSettingResponse.Layout.Header();
        header.setRefresh(true);
        header.setFull_screen(true);
        header.setTheme_config(true);
        layout.setHeader(header);
        AdminSettingResponse.Layout.Footer footer = new AdminSettingResponse.Layout.Footer();
        footer.setHtml("Cocoyam");
        layout.setFooter(footer);
        adminSettingResponse.setLayout(layout);
        adminSettingResponse.setLocale("zh_CN");
        adminSettingResponse.setLogin_captcha(true);
        adminSettingResponse.setLogo("https://cocoyam.oss-cn-beijing.aliyuncs.com/cocoyam/logo.png");
        AdminSettingResponse.Nav nav = new AdminSettingResponse.Nav();
        adminSettingResponse.setShow_development_tools(true);
        adminSettingResponse.setSystem_theme_setting(null);

        return adminSettingResponse;
    }
}
