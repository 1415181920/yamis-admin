package io.xiaoyu.sys.modular.setting.controller.admin;

import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.util.CaptchaCodeImage;
import io.xiaoyu.sys.modular.setting.resp.AdminSettingResponse;
import io.xiaoyu.sys.modular.setting.service.AdminSettingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class SettingController {

    @Resource
    private AdminSettingService adminSettingService;

    /**
     * 获取系统设置
     * @return AdminSettingResponse
     */
    @GetMapping("/admin-api/_settings")
    public CommonAdminResp<AdminSettingResponse> getSetting() {
       return CommonAdminResp.success("获取成功",adminSettingService.getSetting());
    }



}
