package io.xiaoyu.common.yaims;



/**
 * 二维布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/grid-2d
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Grid2D extends BaseRenderer 
{
    public Grid2D()
    {
        set("type", "grid-2d");

    }

    /**
     * 容器 css 类名
     */
    public Grid2D className(Object value)
    {
        return set("className", value);
    }

    /**
     * 列数量，默认是 12
     */
    public Grid2D cols(Object value)
    {
        return set("cols", value);
    }

    /**
     * 是否禁用
     */
    public Grid2D disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Grid2D disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 格子间距，默认 0，包含行和列
     */
    public Grid2D gap(Object value)
    {
        return set("gap", value);
    }

    /**
     * 格子行级别的间距，如果不设置就和 gap 一样
     */
    public Grid2D gapRow(Object value)
    {
        return set("gapRow", value);
    }

    /**
     * 每个格子的配置
     */
    public Grid2D grids(Object value)
    {
        return set("grids", value);
    }

    /**
     * 是否隐藏
     */
    public Grid2D hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Grid2D hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Grid2D id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Grid2D onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 单位行高度，默认 50 px
     */
    public Grid2D rowHeight(Object value)
    {
        return set("rowHeight", value);
    }

    /**
     * 是否静态展示
     */
    public Grid2D staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Grid2D staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Grid2D staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Grid2D staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Grid2D staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Grid2D staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Grid2D staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Grid2D style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 grid-2d 展示类型
     */
    public Grid2D type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Grid2D visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Grid2D visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * grid 2d 容器宽度，默认是 auto
     */
    public Grid2D width(Object value)
    {
        return set("width", value);
    }

    public Grid2D set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
