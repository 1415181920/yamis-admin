package io.xiaoyu.auth.modular.login.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.xiaoyu.auth.modular.login.entity.AdminUsers;
import io.xiaoyu.auth.modular.login.mapper.AdminUsersMapper;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;
import io.xiaoyu.auth.modular.login.service.AdminUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.xiaoyu.common.exception.CommonException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
@Service
public class AdminUsersServiceImpl extends ServiceImpl<AdminUsersMapper, AdminUsers> implements AdminUsersService {

    @Resource
    private AdminUsersMapper adminUsersMapper;

    @Override
    public String doLogin(AuthAccountPasswordLoginParam authAccountPasswordLoginParam) {
        //检测密码是否正确
        AdminUsers adminUsers = CheckPassword(authAccountPasswordLoginParam);
        boolean empty = BeanUtil.isEmpty(adminUsers);

        if (empty) {
            throw  new CommonException("账号或密码错误");
        }
       return execLogin(adminUsers);

    }

    private String execLogin(AdminUsers adminUsers) {
        StpUtil.login(adminUsers.getId());
        StpUtil.getTokenSession().set("loginUser", adminUsers);
        // 返回token
        String tokenValue = StpUtil.getTokenValue();
        Console.log("tokenValue", tokenValue);
        Console.log("权限", StpUtil.hasPermission("user.add1"));
        Console.log("权限",StpUtil.hasPermission("/admin-api/login"));
        Console.log("当前会话是否登录：" + StpUtil.isLogin());
        return tokenValue;
    }

    @Override
    public AdminUsers getUserInfo(int id) {


        return null;
    }

    @Override
    public AdminUsers CheckPassword(AuthAccountPasswordLoginParam authAccountPassword) {

        return this.getOne(new LambdaQueryWrapper<AdminUsers>()
               .eq(AdminUsers::getUsername, authAccountPassword.getUsername())
               .eq(AdminUsers::getPassword, authAccountPassword.getPassword()));
    }


}
