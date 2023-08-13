package io.xiaoyu.common.yaims;



/**
 * Card2 新卡片渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card2
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Card2 extends BaseRenderer 
{
    public Card2()
    {
        set("type", "card2");

    }

    /**
     * 内容
     */
    public Card2 body(Object value)
    {
        return set("body", value);
    }

    /**
     * body 类名
     */
    public Card2 bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 不配置href且cards容器下生效，点击整个卡片触发选中
     */
    public Card2 checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public Card2 className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Card2 disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Card2 disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Card2 hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Card2 hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 隐藏选框
     */
    public Card2 hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Card2 id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Card2 onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Card2 staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Card2 staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Card2 staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Card2 staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Card2 staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Card2 staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Card2 staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Card2 style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 card2 类型
     */
    public Card2 type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Card2 visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Card2 visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 渲染标签
     */
    public Card2 wrapperComponent(Object value)
    {
        return set("wrapperComponent", value);
    }

    public Card2 set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
