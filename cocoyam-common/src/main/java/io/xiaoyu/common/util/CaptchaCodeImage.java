package io.xiaoyu.common.util;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.captcha.generator.RandomGenerator;
import cn.hutool.crypto.digest.DigestUtil;

/**
 * 验证码图片
 */
public class CaptchaCodeImage {

    private  Integer width;
    private  Integer height;
    private String captcha_img;
    private String sys_captcha;

    public CaptchaCodeImage(Integer width, Integer height) {
        this.width = width;
        this.height = height;
        generateCode(); // 在构造函数中生成验证码
    }

    public CaptchaCodeImage(String sys_captcha){
        this.sys_captcha = sys_captcha;
    }

    private void generateCode() {
        RandomGenerator randomGenerator = new RandomGenerator("0123456789", 4);
        ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(width, height);
        shearCaptcha.setGenerator(randomGenerator);
        this.captcha_img = shearCaptcha.getImageBase64();
        this.sys_captcha = shearCaptcha.getCode();
    }

    public String getCaptcha_img() {
        return captcha_img;
    }

    public String getSys_captcha() {
         return DigestUtil.md5Hex(DigestUtil.md5Hex(this.sys_captcha.toLowerCase()));
    }

}
