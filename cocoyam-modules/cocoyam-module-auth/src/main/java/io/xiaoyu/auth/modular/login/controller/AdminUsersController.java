package io.xiaoyu.auth.modular.login.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;
import io.xiaoyu.auth.modular.login.service.AdminUsersService;
import io.xiaoyu.common.pojo.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
@RestController
public class AdminUsersController {

    @Resource
    private AdminUsersService adminUsersService;

    @PostMapping("/admin-api/login")
    public CommonResult<String> doLogin(@RequestBody AuthAccountPasswordLoginParam authAccountPasswordLoginParam){
        return  CommonResult.get(200,"登录成功",adminUsersService.doLogin(authAccountPasswordLoginParam));
    }


    /**
     * 登出
     */
    @GetMapping("/admin-api/logout")
    public CommonResult<Object> doLogout(){
        StpUtil.logout();
        return  CommonResult.get(200,"登出成功",null);
    }


    /**
     * 获取用户信息
     */
    @GetMapping("/admin-api/getUserInfo")
    public CommonResult<String> getUserInfo(){
        return  CommonResult.get(200,"获取用户信息成功","123");
    }


}

