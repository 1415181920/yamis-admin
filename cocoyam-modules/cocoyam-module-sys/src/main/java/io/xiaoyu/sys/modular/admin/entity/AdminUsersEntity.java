package io.xiaoyu.sys.modular.admin.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

@Data
@TableName("admin_users")
public class AdminUsersEntity {

    /**
    * 
    */
    private Integer id;

    /**
    * 
    */
    private String username;

    /**
    * 
    */
    private String password;

    /**
    * 
    */
    private String name;

    /**
    * 
    */
    private String avatar;

    /**
    * 
    */
    private String rememberToken;

    /**
    * 
    */
    private Date createdAt;

    /**
    * 
    */
    private Date updatedAt;



}
