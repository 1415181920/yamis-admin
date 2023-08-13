package io.xiaoyu.common.yaims;



/**
 * Grid 格子布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/grid
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Grid extends BaseRenderer 
{
    public Grid()
    {
        set("type", "grid");

    }

    /**
     * 水平对齐方式 可选值: left | right | between | center
     */
    public Grid align(Object value)
    {
        return set("align", value);
    }

    /**
     * 容器 css 类名
     */
    public Grid className(Object value)
    {
        return set("className", value);
    }

    /**
     * 列集合
     */
    public Grid columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 是否禁用
     */
    public Grid disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Grid disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 水平间距 可选值: xs | sm | base | none | md | lg
     */
    public Grid gap(Object value)
    {
        return set("gap", value);
    }

    /**
     * 是否隐藏
     */
    public Grid hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Grid hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Grid id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Grid onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Grid staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Grid staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Grid staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Grid staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Grid staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Grid staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Grid staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Grid style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 Grid 格子布局渲染器。
     */
    public Grid type(Object value)
    {
        return set("type", value);
    }

    /**
     * 垂直对齐方式 可选值: top | middle | bottom | between
     */
    public Grid valign(Object value)
    {
        return set("valign", value);
    }

    /**
     * 是否显示
     */
    public Grid visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Grid visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Grid set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
