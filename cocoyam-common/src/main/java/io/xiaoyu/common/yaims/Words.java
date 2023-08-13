package io.xiaoyu.common.yaims;



/**
 * Words
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Words extends BaseRenderer 
{
    public Words()
    {
        set("type", "words");

    }

    /**
     * 容器 css 类名
     */
    public Words className(Object value)
    {
        return set("className", value);
    }

    /**
     * 展示文字
     */
    public Words collapseButton(Object value)
    {
        return set("collapseButton", value);
    }

    /**
     * 收起文字
     */
    public Words collapseButtonText(Object value)
    {
        return set("collapseButtonText", value);
    }

    /**
     * 分割符
     */
    public Words delimiter(Object value)
    {
        return set("delimiter", value);
    }

    /**
     * 是否禁用
     */
    public Words disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Words disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 展示文字
     */
    public Words expendButton(Object value)
    {
        return set("expendButton", value);
    }

    /**
     * 展示文字
     */
    public Words expendButtonText(Object value)
    {
        return set("expendButtonText", value);
    }

    /**
     * 是否隐藏
     */
    public Words hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Words hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Words id(Object value)
    {
        return set("id", value);
    }

    /**
     * useTag 当数据是数组时，是否使用tag的方式展示
     */
    public Words inTag(Object value)
    {
        return set("inTag", value);
    }

    /**
     * 展示限制, 为0时也无限制
     */
    public Words limit(Object value)
    {
        return set("limit", value);
    }

    /**
     * 事件动作配置
     */
    public Words onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Words staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Words staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Words staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Words staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Words staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Words staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Words staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Words style(Object value)
    {
        return set("style", value);
    }

    public Words type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Words visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Words visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * tags数据
     */
    public Words words(Object value)
    {
        return set("words", value);
    }

    public Words set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
