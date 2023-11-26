package io.xiaoyu.sys.modular.menus.entity;

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
@TableName("admin_menus")
public class AdminMenusEntity extends CommonEntity {

    /**
    * 
    */
    @TableId(type=IdType.AUTO)
    private Integer id;
    /**
    * 
    */
    private Integer parentId;
    /**
    * 
    */
    @TableField(value = "`order`")
    private Integer order;
    /**
    * 菜单名称
    */
    private String title;
    /**
    * 菜单图标
    */
    private String icon;
    /**
    * 菜单路由
    */
    private String url;
    /**
    * 路由类型(1:路由,2:外链)
    */
    private Integer urlType;
    /**
    * 是否可见
    */
    private Integer visible;
    /**
    * 是否为首页
    */
    private Integer isHome;
    /**
    * 扩展
    */
    private String extension;
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
