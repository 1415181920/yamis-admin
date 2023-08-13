package io.xiaoyu.common.yaims;



/**
 * AnchorNav 锚点导航渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/anchor-nav
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class AnchorNav extends BaseRenderer 
{
    public AnchorNav()
    {
        set("type", "anchor-nav");

    }

    /**
     * 被激活（定位）的楼层
     */
    public AnchorNav active(Object value)
    {
        return set("active", value);
    }

    /**
     * 样式名
     */
    public AnchorNav className(Object value)
    {
        return set("className", value);
    }

    /**
     *  可选值: vertical | horizontal
     */
    public AnchorNav direction(Object value)
    {
        return set("direction", value);
    }

    /**
     * 是否禁用
     */
    public AnchorNav disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public AnchorNav disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public AnchorNav hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public AnchorNav hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public AnchorNav id(Object value)
    {
        return set("id", value);
    }

    /**
     * 导航样式名
     */
    public AnchorNav linkClassName(Object value)
    {
        return set("linkClassName", value);
    }

    /**
     * 楼层集合
     */
    public AnchorNav links(Object value)
    {
        return set("links", value);
    }

    /**
     * 事件动作配置
     */
    public AnchorNav onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 楼层样式名
     */
    public AnchorNav sectionClassName(Object value)
    {
        return set("sectionClassName", value);
    }

    /**
     * 是否静态展示
     */
    public AnchorNav staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public AnchorNav staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public AnchorNav staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public AnchorNav staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public AnchorNav staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public AnchorNav staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public AnchorNav staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public AnchorNav style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 AnchorNav 锚点导航渲染器
     */
    public AnchorNav type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public AnchorNav visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public AnchorNav visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public AnchorNav set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
