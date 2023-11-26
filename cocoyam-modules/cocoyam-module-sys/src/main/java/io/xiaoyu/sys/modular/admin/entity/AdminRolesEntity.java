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
@TableName("admin_roles")
public class AdminRolesEntity extends CommonEntity {

    /**
    * 
    */
    @TableId(type=IdType.AUTO)
    private Integer id;
    /**
    * 角色名
    */
    private String name;
    /**
    * 标识
    */
    private String slug;
    /**
    * 开始时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private Date createdAt;
    /**
    * 更新时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedAt;


}
