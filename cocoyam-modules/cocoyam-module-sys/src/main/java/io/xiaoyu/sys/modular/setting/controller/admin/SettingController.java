package io.xiaoyu.sys.modular.setting.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.xiaoyu.common.exception.CommonException;

@RestController
public class SettingController {

    @GetMapping("/admin-api/_settings")
    public String getSetting() {
        throw  new CommonException("账号或密码错误");
    }

}
