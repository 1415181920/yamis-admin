package io.xiaoyu.gen.modular.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenCodeReq {
    private String serverPath;
    private String module;
    private String childModule;
    private String tableName;
}
