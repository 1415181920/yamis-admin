package io.xiaoyu.sys.modular.admin.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.xiaoyu.common.basic.pojo.CommonEntity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@TableName("admin_users")
public class AdminUsersEntity extends CommonEntity {

    /**
    * 
    */
    @TableId(type=IdType.AUTO)
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private Date createdAt;
    /**
    * 
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedAt;


}
