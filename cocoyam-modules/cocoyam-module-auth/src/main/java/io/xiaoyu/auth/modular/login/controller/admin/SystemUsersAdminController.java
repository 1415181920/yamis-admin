package io.xiaoyu.auth.modular.login.controller.admin;

import cn.dev33.satoken.stp.StpUtil;
import io.xiaoyu.auth.modular.login.param.AuthAccountPasswordLoginParam;
import io.xiaoyu.auth.modular.login.resp.SystemCurrentUserResp;
import io.xiaoyu.auth.modular.login.service.SystemUserService;
import io.xiaoyu.common.resp.CommonAdminResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController

public class SystemUsersAdminController {
    @Resource
    private SystemUserService systemUsersService;



    @PostMapping("/admin-api/login")
    public CommonAdminResp<HashMap<String,String>> doLogin(@RequestBody AuthAccountPasswordLoginParam authAccountPasswordLoginParam){
        String token = systemUsersService.doLogin(authAccountPasswordLoginParam);
        HashMap<String, String> data = new HashMap<>();
        data.put("token",token);
        return  CommonAdminResp.ok("登录成功",data);
    }


    /**
     * 登出
     */
    @GetMapping("/admin-api/logout")
    public CommonAdminResp<Object> doLogout(){
        StpUtil.logout();
        return  CommonAdminResp.get(200,"登出成功",null);
    }


    /**
     * 获取用户信息
     */
    @GetMapping("/admin-api/current-user")
    public CommonAdminResp<SystemCurrentUserResp> getCurrentUser(){
        return  CommonAdminResp.get(200,"获取用户信息成功", systemUsersService.getCurrentUser());
    }


}
