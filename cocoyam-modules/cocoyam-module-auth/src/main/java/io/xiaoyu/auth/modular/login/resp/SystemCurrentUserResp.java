package io.xiaoyu.auth.modular.login.resp;

import lombok.Data;

@Data
public class SystemCurrentUserResp {

    private String name;

    private String avatar;

    private Object menus;

}
