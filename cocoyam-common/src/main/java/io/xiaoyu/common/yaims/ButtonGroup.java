package io.xiaoyu.common.yaims;



/**
 * Button Group 渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/button-group
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ButtonGroup extends BaseRenderer 
{
    public ButtonGroup()
    {
        set("type", "button-group");

    }

    public ButtonGroup btnActiveClassName(Object value)
    {
        return set("btnActiveClassName", value);
    }

    /**
     * 按钮选中的样式级别
     */
    public ButtonGroup btnActiveLevel(Object value)
    {
        return set("btnActiveLevel", value);
    }

    public ButtonGroup btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 按钮样式级别
     */
    public ButtonGroup btnLevel(Object value)
    {
        return set("btnLevel", value);
    }

    /**
     * 按钮集合
     */
    public ButtonGroup buttons(Object value)
    {
        return set("buttons", value);
    }

    /**
     * 容器 css 类名
     */
    public ButtonGroup className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否为禁用状态。
     */
    public ButtonGroup disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 通过 JS 表达式来配置当前表单项的禁用状态。
     */
    public ButtonGroup disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public ButtonGroup hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ButtonGroup hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ButtonGroup id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public ButtonGroup onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 按钮大小 可选值: xs | sm | md | lg
     */
    public ButtonGroup size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public ButtonGroup staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ButtonGroup staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ButtonGroup staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ButtonGroup staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ButtonGroup staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ButtonGroup staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ButtonGroup staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ButtonGroup style(Object value)
    {
        return set("style", value);
    }

    /**
     * 平铺展示？
     */
    public ButtonGroup tiled(boolean value)
    {
        return set("tiled", value);
    }

    /**
     * 指定为提交按钮类型
     */
    public ButtonGroup type(Object value)
    {
        return set("type", value);
    }

    /**
     * 垂直展示？
     */
    public ButtonGroup vertical(boolean value)
    {
        return set("vertical", value);
    }

    /**
     * 是否显示
     */
    public ButtonGroup visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 通过 JS 表达式来配置当前表单项是否显示
     */
    public ButtonGroup visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public ButtonGroup set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
