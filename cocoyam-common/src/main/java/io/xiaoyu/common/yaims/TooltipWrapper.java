package io.xiaoyu.common.yaims;



/**
 * TooltipWrapper
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TooltipWrapper extends BaseRenderer 
{
    public TooltipWrapper()
    {
        set("type", "tooltip-wrapper");

    }

    /**
     * 内容区域
     */
    public TooltipWrapper body(Object value)
    {
        return set("body", value);
    }

    /**
     * 内容区CSS类名
     */
    public TooltipWrapper className(Object value)
    {
        return set("className", value);
    }

    /**
     * 文字提示内容，兼容 tooltip，但建议通过 content 来实现提示内容
     */
    public TooltipWrapper content(Object value)
    {
        return set("content", value);
    }

    /**
     * 是否禁用提示
     */
    public TooltipWrapper disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TooltipWrapper disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可以移入浮层中, 默认true
     */
    public TooltipWrapper enterable(boolean value)
    {
        return set("enterable", value);
    }

    /**
     * 是否隐藏
     */
    public TooltipWrapper hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TooltipWrapper hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TooltipWrapper id(Object value)
    {
        return set("id", value);
    }

    /**
     * 内容区是否内联显示，默认为false
     */
    public TooltipWrapper inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 浮层延迟显示时间, 单位 ms
     */
    public TooltipWrapper mouseEnterDelay(Object value)
    {
        return set("mouseEnterDelay", value);
    }

    /**
     * 浮层延迟隐藏时间, 单位 ms
     */
    public TooltipWrapper mouseLeaveDelay(Object value)
    {
        return set("mouseLeaveDelay", value);
    }

    /**
     * 浮层位置相对偏移量
     */
    public TooltipWrapper offset(Object value)
    {
        return set("offset", value);
    }

    /**
     * 事件动作配置
     */
    public TooltipWrapper onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 文字提示浮层出现位置，默认为top 可选值: top | right | bottom | left
     */
    public TooltipWrapper placement(Object value)
    {
        return set("placement", value);
    }

    /**
     * 是否点击非内容区域关闭提示，默认为true
     */
    public TooltipWrapper rootClose(boolean value)
    {
        return set("rootClose", value);
    }

    /**
     * 是否展示浮层指向箭头
     */
    public TooltipWrapper showArrow(boolean value)
    {
        return set("showArrow", value);
    }

    /**
     * 是否静态展示
     */
    public TooltipWrapper staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TooltipWrapper staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TooltipWrapper staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TooltipWrapper staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TooltipWrapper staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TooltipWrapper staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TooltipWrapper staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 内容区自定义样式
     */
    public TooltipWrapper style(Object value)
    {
        return set("style", value);
    }

    /**
     * 文字提示标题
     */
    public TooltipWrapper title(Object value)
    {
        return set("title", value);
    }

    public TooltipWrapper tooltip(Object value)
    {
        return set("tooltip", value);
    }

    /**
     * 文字提示浮层CSS类名
     */
    public TooltipWrapper tooltipClassName(Object value)
    {
        return set("tooltipClassName", value);
    }

    /**
     * 自定义提示浮层样式
     */
    public TooltipWrapper tooltipStyle(Object value)
    {
        return set("tooltipStyle", value);
    }

    /**
     * 主题样式， 默认为light 可选值: light | dark
     */
    public TooltipWrapper tooltipTheme(Object value)
    {
        return set("tooltipTheme", value);
    }

    /**
     * 浮层触发方式，默认为hover
     */
    public TooltipWrapper trigger(Object value)
    {
        return set("trigger", value);
    }

    /**
     * 文字提示容器
     */
    public TooltipWrapper type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public TooltipWrapper visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TooltipWrapper visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 内容区包裹标签
     */
    public TooltipWrapper wrapperComponent(Object value)
    {
        return set("wrapperComponent", value);
    }

    public TooltipWrapper set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
