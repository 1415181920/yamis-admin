package io.xiaoyu.sys.modular.setting.controller.admin;

import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.util.CaptchaCodeImage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/admin-api")
public class CaptchaCodeController {

    /**
     * 获取验证码
     * @return CaptchaCodeImage
     */
    @GetMapping("/captcha")
    public CommonAdminResp<HashMap<String,String>> getCaptcha() {
        HashMap<String, String> result = new HashMap<>();
        CaptchaCodeImage captchaCodeImage = new CaptchaCodeImage(200, 50);
        result.put("sys_captcha",captchaCodeImage.getSys_captcha());
        result.put("captcha_img","data:image/png;base64,"+captchaCodeImage.getCaptcha_img());
        return CommonAdminResp.success("获取成功",result);
    }

}
