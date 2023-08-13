package io.xiaoyu.common.yaims;



/**
 * Collapse 折叠渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/collapse
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Collapse extends BaseRenderer 
{
    public Collapse()
    {
        set("type", "collapse");

    }

    /**
     * 内容区域
     */
    public Collapse body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public Collapse bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public Collapse className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否可折叠
     */
    public Collapse collapsable(boolean value)
    {
        return set("collapsable", value);
    }

    /**
     * 收起的标题
     */
    public Collapse collapseHeader(Object value)
    {
        return set("collapseHeader", value);
    }

    /**
     * 默认是否折叠
     */
    public Collapse collapsed(boolean value)
    {
        return set("collapsed", value);
    }

    /**
     * 是否禁用
     */
    public Collapse disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Collapse disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 自定义切换图标
     */
    public Collapse expandIcon(Object value)
    {
        return set("expandIcon", value);
    }

    /**
     * 标题
     */
    public Collapse header(Object value)
    {
        return set("header", value);
    }

    /**
     * 标题展示位置 可选值: top | bottom
     */
    public Collapse headerPosition(Object value)
    {
        return set("headerPosition", value);
    }

    /**
     * 标题 CSS 类名
     */
    public Collapse headingClassName(Object value)
    {
        return set("headingClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Collapse hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Collapse hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Collapse id(Object value)
    {
        return set("id", value);
    }

    /**
     * 标识
     */
    public Collapse key(Object value)
    {
        return set("key", value);
    }

    /**
     * 点开时才加载内容
     */
    public Collapse mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 事件动作配置
     */
    public Collapse onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 图标是否展示
     */
    public Collapse showArrow(boolean value)
    {
        return set("showArrow", value);
    }

    /**
     * 控件大小 可选值: xs | sm | md | lg | base
     */
    public Collapse size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Collapse staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Collapse staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Collapse staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Collapse staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Collapse staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Collapse staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Collapse staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Collapse style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为折叠器类型
     */
    public Collapse type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片隐藏就销毁内容。
     */
    public Collapse unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 是否显示
     */
    public Collapse visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Collapse visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Collapse set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
