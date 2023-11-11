package io.xiaoyu.sys.modular.setting.resp;

import io.xiaoyu.common.bootstrap.pojo.YamisLayout;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
@Data
public class AdminSettingResponse {

    @Value("${website.app_name}")
    private String app_name;
    private Assets assets;
    private ArrayList<String> enabled_extensions = new ArrayList<>();
    private Layout layout;
    private String locale;
    private boolean login_captcha;
    private String logo;
    private Nav nav;
    private boolean show_development_tools;
    private Object system_theme_setting;

        @Data
        private static class Assets {
            private String[] js;
            private String[] css;
            private String[] scripts;
            private String[] styles;
        }

    @Data
    public static class Layout {

        private String footer;
        private Header header;
        private String title;
        private String[] keep_alive_exclude;


        @Data
        public static class Header {
            private boolean refresh; // 刷新
            private boolean dark; // 暗黑模式
            private boolean full_screen; // 全屏
            private boolean theme_config; // 主题配置
        }

    }

    //实例化Nav
    public AdminSettingResponse() {
        this.nav = new Nav();
        this.assets = new Assets();
    }

    @Data
    public static class Nav {
        private Object appendNav;
        private Object prependNav;
    }

    @Override
    public String toString() {
        return "AdminSettingsResponse{" +
                "app_name='" + app_name + '\'' +
                ", assets=" + assets +
                ", enabled_extensions=" + enabled_extensions +
                ", layout=" + layout +
                ", locale='" + locale + '\'' +
                ", login_captcha=" + login_captcha +
                ", logo='" + logo + '\'' +
                ", nav=" + nav +
                ", show_development_tools=" + show_development_tools +
                ", system_theme_setting=" + system_theme_setting +
                '}';
    }
}
