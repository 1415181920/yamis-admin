package io.xiaoyu.auth.modular.login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaoyu
 * @since 2023-07-27
 */
@Data
@TableName("admin_users")
public class AdminUsersEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("name")
    private String name;

    @TableField("avatar")
    private String avatar;

    @TableField("remember_token")
    private String rememberToken;

    @TableField("created_at")
    private LocalDateTime createdAt;

    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
