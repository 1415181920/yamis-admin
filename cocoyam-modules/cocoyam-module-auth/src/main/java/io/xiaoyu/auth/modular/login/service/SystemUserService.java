package io.xiaoyu.auth.modular.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaoyu.auth.modular.login.entity.AdminUsersEntity;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;
import io.xiaoyu.auth.modular.login.resp.SystemCurrentUserResp;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
public interface SystemUserService extends IService<AdminUsersEntity> {

    //登录
    String doLogin(AuthAccountPasswordLoginParam authAccountPasswordLoginParam);

    //获取用户信息
    AdminUsersEntity getUserInfo(int id);

    //检测密码是否正确
    AdminUsersEntity checkPassword(AuthAccountPasswordLoginParam authAccountPassword);

    //检测验证码是否正确
    void checkCaptcha(AuthAccountPasswordLoginParam authAccountPasswordLoginParam);

    SystemCurrentUserResp getCurrentUser();
}
