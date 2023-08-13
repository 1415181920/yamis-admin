package io.xiaoyu.common.yaims;



/**
 * Hbox 水平布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/hbox
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class HBox extends BaseRenderer 
{
    public HBox()
    {
        set("type", "hbox");

    }

    /**
     * 水平对齐方式 可选值: left | right | between | center
     */
    public HBox align(Object value)
    {
        return set("align", value);
    }

    /**
     * 容器 css 类名
     */
    public HBox className(Object value)
    {
        return set("className", value);
    }

    public HBox columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 是否禁用
     */
    public HBox disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public HBox disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 水平间距 可选值: xs | sm | base | none | md | lg
     */
    public HBox gap(Object value)
    {
        return set("gap", value);
    }

    /**
     * 是否隐藏
     */
    public HBox hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public HBox hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public HBox id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public HBox onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public HBox staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public HBox staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public HBox staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public HBox staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public HBox staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public HBox staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public HBox staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public HBox style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public HBox subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public HBox subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 指定为each展示类型
     */
    public HBox type(Object value)
    {
        return set("type", value);
    }

    /**
     * 垂直对齐方式 可选值: top | middle | bottom | between
     */
    public HBox valign(Object value)
    {
        return set("valign", value);
    }

    /**
     * 是否显示
     */
    public HBox visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public HBox visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public HBox set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
