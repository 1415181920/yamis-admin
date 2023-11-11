package io.xiaoyu.common.bootstrap.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;
@Data
@Repository
public class YamisLayout {


        private String footer;
        private Header header;
        private String title;
        private String[] keep_alive_exclude = new String[]{};

        public YamisLayout() {
            this.header = new Header();
        }
        @Data
        public static class Header {
            private boolean refresh = true; // 刷新
            private boolean dark = true; // 暗黑模式
            private boolean full_screen = true; // 全屏
            private boolean theme_config = true; // 主题配置
        }


}
