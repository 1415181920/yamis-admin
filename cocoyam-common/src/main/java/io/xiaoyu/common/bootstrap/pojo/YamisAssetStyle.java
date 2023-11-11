package io.xiaoyu.common.bootstrap.pojo;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class YamisAssetStyle {

    private String[] js;
    private String[] css;
    private String[] scripts;
    private String[] styles;
    private String appendNav;
    private String prependNav;

}
