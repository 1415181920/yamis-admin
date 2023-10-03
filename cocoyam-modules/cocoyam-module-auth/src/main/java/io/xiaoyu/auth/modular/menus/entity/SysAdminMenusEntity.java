package io.xiaoyu.auth.modular.menus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

@Data
@TableName("admin_menus")
public class SysAdminMenusEntity {

    /**
    * 
    */
    private Integer id;

    /**
    * 
    */
    private Integer parentId;

    /**
    * 
    */
    @TableField("`order`")
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
    private Date createdAt;

    /**
    * 
    */
    private Date updatedAt;



}
