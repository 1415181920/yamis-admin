package io.xiaoyu.common.yaims;



/**
 * List 列表展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ListRenderer extends BaseRenderer 
{
    public ListRenderer()
    {
        set("type", "list");

    }

    /**
     * 是否固顶
     */
    public ListRenderer affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 点击列表单行时，是否选择
     */
    public ListRenderer checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public ListRenderer className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public ListRenderer disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ListRenderer disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部区域
     */
    public ListRenderer footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部区域类名
     */
    public ListRenderer footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 顶部区域
     */
    public ListRenderer header(Object value)
    {
        return set("header", value);
    }

    /**
     * 顶部区域类名
     */
    public ListRenderer headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public ListRenderer hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ListRenderer hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public ListRenderer hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ListRenderer id(Object value)
    {
        return set("id", value);
    }

    /**
     * 点击列表项的行为
     */
    public ListRenderer itemAction(Object value)
    {
        return set("itemAction", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public ListRenderer itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public ListRenderer itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    /**
     * 单条数据展示内容配置
     */
    public ListRenderer listItem(Object value)
    {
        return set("listItem", value);
    }

    /**
     * 事件动作配置
     */
    public ListRenderer onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 无数据提示
     */
    public ListRenderer placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否显示底部
     */
    public ListRenderer showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public ListRenderer showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 大小 可选值: sm | base
     */
    public ListRenderer size(Object value)
    {
        return set("size", value);
    }

    /**
     * 数据源: 绑定当前环境变量
     */
    public ListRenderer source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public ListRenderer staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ListRenderer staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ListRenderer staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ListRenderer staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ListRenderer staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ListRenderer staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ListRenderer staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ListRenderer style(Object value)
    {
        return set("style", value);
    }

    /**
     * 标题
     */
    public ListRenderer title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 List 列表展示控件。 可选值: list | static-list
     */
    public ListRenderer type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public ListRenderer valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public ListRenderer visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ListRenderer visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public ListRenderer set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
