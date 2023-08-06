package io.xiaoyu.auth.modular.test.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

@Data
@TableName("test_users")
public class TestUsersEntity {

    /**
    * 用户ID
    */
    private Long id;

    /**
    * 用户账号
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 用户昵称
    */
    private String nickname;

    /**
    * 备注
    */
    private String remark;

    /**
    * 部门ID
    */
    private Long deptId;

    /**
    * 岗位编号数组
    */
    private String postIds;

    /**
    * 用户邮箱
    */
    private String email;

    /**
    * 手机号码
    */
    private String mobile;

    /**
    * 用户性别
    */
    private Integer sex;

    /**
    * 头像地址
    */
    private String avatar;

    /**
    * 帐号状态（0正常 1停用）
    */
    private Integer status;

    /**
    * 最后登录IP
    */
    private String loginIp;

    /**
    * 最后登录时间
    */
    private Date loginDate;

    /**
    * 创建者
    */
    private String creator;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新者
    */
    private String updater;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 是否删除
    */
    private String deleted;

    /**
    * 租户编号
    */
    private Long tenantId;



}
