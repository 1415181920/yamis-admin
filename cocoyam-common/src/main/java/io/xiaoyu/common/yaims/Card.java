package io.xiaoyu.common.yaims;



/**
 * Card 卡片渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Card extends BaseRenderer 
{
    public Card()
    {
        set("type", "card");

    }

    /**
     * 底部按钮集合。
     */
    public Card actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 内容区域
     */
    public Card body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Card className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Card disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Card disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 头部配置
     */
    public Card header(Object value)
    {
        return set("header", value);
    }

    /**
     * 是否隐藏
     */
    public Card hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Card hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Card id(Object value)
    {
        return set("id", value);
    }

    /**
     * 多媒体区域
     */
    public Card media(Object value)
    {
        return set("media", value);
    }

    /**
     * 事件动作配置
     */
    public Card onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 次要说明
     */
    public Card secondary(Object value)
    {
        return set("secondary", value);
    }

    /**
     * 是否静态展示
     */
    public Card staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Card staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Card staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Card staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Card staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Card staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Card staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Card style(Object value)
    {
        return set("style", value);
    }

    /**
     * 工具栏按钮
     */
    public Card toolbar(Object value)
    {
        return set("toolbar", value);
    }

    /**
     * 指定为 card 类型
     */
    public Card type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片内容区的表单项label是否使用Card内部的样式，默认为true
     */
    public Card useCardLabel(boolean value)
    {
        return set("useCardLabel", value);
    }

    /**
     * 是否显示
     */
    public Card visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Card visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Card set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
