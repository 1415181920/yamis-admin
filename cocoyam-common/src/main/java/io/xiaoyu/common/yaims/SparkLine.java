package io.xiaoyu.common.yaims;



/**
 * SparkLine
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SparkLine extends BaseRenderer 
{
    public SparkLine()
    {
        set("type", "sparkline");

    }

    /**
     * css 类名
     */
    public SparkLine className(Object value)
    {
        return set("className", value);
    }

    /**
     * 点击行为
     */
    public SparkLine clickAction(Object value)
    {
        return set("clickAction", value);
    }

    /**
     * 是否禁用
     */
    public SparkLine disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public SparkLine disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 高度
     */
    public SparkLine height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public SparkLine hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public SparkLine hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public SparkLine id(Object value)
    {
        return set("id", value);
    }

    /**
     * 关联数据变量。
     */
    public SparkLine name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public SparkLine onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 空数据时显示的内容
     */
    public SparkLine placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否静态展示
     */
    public SparkLine staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public SparkLine staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public SparkLine staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public SparkLine staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public SparkLine staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public SparkLine staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public SparkLine staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public SparkLine style(Object value)
    {
        return set("style", value);
    }

    public SparkLine type(Object value)
    {
        return set("type", value);
    }

    public SparkLine value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public SparkLine visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public SparkLine visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 宽度
     */
    public SparkLine width(Object value)
    {
        return set("width", value);
    }

    public SparkLine set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
