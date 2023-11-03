package io.xiaoyu.common.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonUrlUtil {


    @Value("${website.url}")
    private  String URL_PREFIX;

    /**
     * 根据绝对路径获取完整的图片url
     */
    public  String get(String url) {
        if (url==null || url.isEmpty()){
            return null;
        }
        return URL_PREFIX + url;
    }


}
