package io.xiaoyu.sys.modular.menus.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
public class AdminMenusQueryResp {

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


    private List<AdminMenusQueryResp> children;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdAt;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedAt;


}
