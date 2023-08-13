package io.xiaoyu.common.yaims;



/**
 * DateRange 展示渲染器。
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class DateRange extends BaseRenderer 
{
    public DateRange()
    {
        set("type", "date-range");

    }

    /**
     * 容器 css 类名
     */
    public DateRange className(Object value)
    {
        return set("className", value);
    }

    /**
     * 连接符
     */
    public DateRange connector(Object value)
    {
        return set("connector", value);
    }

    /**
     * 分割符
     */
    public DateRange delimiter(Object value)
    {
        return set("delimiter", value);
    }

    /**
     * 是否禁用
     */
    public DateRange disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public DateRange disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 展示的时间格式，参考 moment 中的格式说明。
     */
    public DateRange format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否隐藏
     */
    public DateRange hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public DateRange hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public DateRange id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public DateRange onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public DateRange staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public DateRange staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public DateRange staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public DateRange staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public DateRange staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public DateRange staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public DateRange staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public DateRange style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为日期展示类型
     */
    public DateRange type(Object value)
    {
        return set("type", value);
    }

    /**
     * 值的时间格式，参考 moment 中的格式说明。
     */
    public DateRange valueFormat(Object value)
    {
        return set("valueFormat", value);
    }

    /**
     * 是否显示
     */
    public DateRange visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public DateRange visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public DateRange set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
