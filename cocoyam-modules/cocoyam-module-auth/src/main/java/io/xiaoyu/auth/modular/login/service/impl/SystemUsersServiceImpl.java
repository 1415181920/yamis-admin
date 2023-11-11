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
import io.xiaoyu.common.util.CommonUrlUtil;
import io.xiaoyu.common.yaims.AmisFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SystemUsersServiceImpl extends ServiceImpl<AdminUsersMapper, AdminUsersEntity> implements SystemUserService{



    @Resource
    private AdminUsersMapper adminUsersMapper;

    @Resource
    private CommonUrlUtil commonUrlUtil;

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
        System.out.println(authAccountPassword.getPassword());
        String password = DigestUtil.md5Hex(authAccountPassword.getPassword());
        System.out.println(password);
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
        SystemCurrentUserResp systemCurrentUserResp = new SystemCurrentUserResp();
        systemCurrentUserResp.setName(loginUser.getUsername());
//        System.err.println(loginUser.getAvatar());
        systemCurrentUserResp.setAvatar(commonUrlUtil.get(loginUser.getAvatar()));

        Object menu = AmisFactory.DropdownButton()
                .className("h-full w-full")
                .hideCaret(true)
                .set("icon","http://demo.owladmin.com/admin/default-avatar.png")
                .label("admin")
                .menuClassName("min-w-0 p-2")
                .trigger("hover")
                .type("dropdown-button")
                .btnClassName("navbar-user w-full")
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
