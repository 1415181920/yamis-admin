package io.xiaoyu.sys.modular.setting.resp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Data
public class AdminSettingResponse {

    @Value("${website.app_name}")
    private String app_name;
    private HashMap<String, List[]> assets;
    private ArrayList<String> enabled_extensions;
    private Layout layout;
    private String locale;
    private boolean login_captcha;
    private String logo;
    private Nav nav;
    private boolean show_development_tools;
    private Object system_theme_setting;


    @Data
    public static class Layout {
        private String title;
        private Header header;
        private Footer footer;


        @Data
        public static class Header {
            private boolean refresh;
            private boolean full_screen;
            private boolean theme_config;

        }

        @Data
        public static class Footer {
            private String html;

        }
    }

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
