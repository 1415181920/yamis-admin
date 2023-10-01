package io.xiaoyu.sys.modular.menu.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AdminMenusQueryResp {

    /**
     * 
     */
    @JsonSerialize(using= ToStringSerializer.class)
    private Integer id;

    /**
     * 
     */
    @JsonSerialize(using= ToStringSerializer.class)
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getUrlType() {
        return urlType;
    }

    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getIsHome() {
        return isHome;
    }

    public void setIsHome(Integer isHome) {
        this.isHome = isHome;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", order=").append(order);
        sb.append(", title=").append(title);
        sb.append(", icon=").append(icon);
        sb.append(", url=").append(url);
        sb.append(", urlType=").append(urlType);
        sb.append(", visible=").append(visible);
        sb.append(", isHome=").append(isHome);
        sb.append(", extension=").append(extension);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }
}
