package io.xiaoyu.auth.modular.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaoyu.auth.modular.login.entity.AdminUsers;
import io.xiaoyu.auth.modular.login.entity.SystemUsersEntity;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
public interface SystemUserService extends IService<SystemUsersEntity> {

    //登录
    String doLogin(AuthAccountPasswordLoginParam authAccountPasswordLoginParam);

    //获取用户信息
    AdminUsers getUserInfo(int id);

    //检测密码是否正确
    AdminUsers CheckPassword(AuthAccountPasswordLoginParam authAccountPassword);

    interface SystemUsersService {
    }
}
