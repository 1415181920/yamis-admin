package io.xiaoyu.auth.modular.login.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.xiaoyu.auth.modular.login.entity.AdminUsersEntity;
import io.xiaoyu.auth.modular.login.mapper.AdminUsersMapper;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;
import io.xiaoyu.auth.modular.login.resp.SystemCurrentUserResp;
import io.xiaoyu.auth.modular.login.service.SystemUserService;
import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.common.util.CaptchaCodeImage;
import io.xiaoyu.common.yaims.AmisFactory;
import io.xiaoyu.common.yaims.Array;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class SystemUsersServiceImpl extends ServiceImpl<AdminUsersMapper, AdminUsersEntity> implements SystemUserService{



    @Resource
    private AdminUsersMapper adminUsersMapper;

    @Override
    public String doLogin(AuthAccountPasswordLoginParam authAccountPasswordLoginParam) {
        //检测验证码是否正确
        checkCaptcha(authAccountPasswordLoginParam);
        //检测密码是否正确
        AdminUsersEntity adminUsers = checkPassword(authAccountPasswordLoginParam);

        if (BeanUtil.isEmpty(adminUsers)) {
            throw new CommonException("账号或密码错误");
        }

        return execLogin(adminUsers);
    }

    private String execLogin(AdminUsersEntity adminUsers) {
        StpUtil.login(adminUsers.getId());
        StpUtil.getTokenSession().set("loginUser", adminUsers);
        // 返回token
        String tokenValue = StpUtil.getTokenValue();
        Console.log("tokenValue", tokenValue);
        Console.log("权限", StpUtil.hasPermission("user.add1"));
        Console.log("权限",StpUtil.hasPermission("/admin-api/login"));
        Console.log("当前会话是否登录：" + StpUtil.isLogin());
        Console.log(StpUtil.getTokenInfo());
        Console.log(StpUtil.getTokenSession().get("loginUser"));
        return tokenValue;
    }

    @Override
    public AdminUsersEntity getUserInfo(int id) {
        return null;
    }

    @Override
    public AdminUsersEntity checkPassword(AuthAccountPasswordLoginParam authAccountPassword) {
        String password = DigestUtil.md5Hex(authAccountPassword.getPassword());
        return this.getOne(new LambdaQueryWrapper<AdminUsersEntity>()
                .eq(AdminUsersEntity::getUsername, authAccountPassword.getUsername())
                .eq(AdminUsersEntity::getPassword,password));
    }

    @Override
    public void checkCaptcha(AuthAccountPasswordLoginParam authAccountPasswordLoginParam) {
        String captcha = new CaptchaCodeImage(authAccountPasswordLoginParam.getCaptcha()).getSys_captcha();
        String sys_captcha = authAccountPasswordLoginParam.getSys_captcha();
        if (!captcha.equals(sys_captcha)){
            throw new CommonException("验证码错误");
        }
    }

    @Override
    public SystemCurrentUserResp getCurrentUser() {
        AdminUsersEntity loginUser = (AdminUsersEntity)StpUtil.getTokenSession().get("loginUser");
        SystemCurrentUserResp systemCurrentUserResp = BeanUtil.copyProperties(loginUser, SystemCurrentUserResp.class);
        Object menu = AmisFactory.DropdownButton()
                .hideCaret(true)
                .trigger("hover")
                .label(systemCurrentUserResp.getName())
                .align("right")
                .btnClassName("navbar-user")
                .menuClassName("min-w-0 px-2")
                .set("icon",systemCurrentUserResp.getAvatar())
                .buttons(new Object[]{
                   AmisFactory
                           .VanillaAction()
                           .iconClassName("pr-2")
                           .icon("fa fa-user-gear")
                           .label("用户设置")
                           .onClick("window.location.hash = '#/user_setting'").render(),
                   AmisFactory
                           .VanillaAction()
                           .iconClassName("pr-2")
                           .icon("fa-solid fa-right-from-bracket")
                           .label("退出登录")
                           .onClick("window.$owl.logout()").render()
                }).render();
        systemCurrentUserResp.setMenus(menu);
        return systemCurrentUserResp;
    }


}
