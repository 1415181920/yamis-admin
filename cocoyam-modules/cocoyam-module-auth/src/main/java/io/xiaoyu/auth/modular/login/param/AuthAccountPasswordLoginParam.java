package io.xiaoyu.auth.modular.login.param;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthAccountPasswordLoginParam {


    private String username;

    private String password;

    private String sys_captcha;

    private String captcha;

}
