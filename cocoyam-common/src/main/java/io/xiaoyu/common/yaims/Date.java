package io.xiaoyu.common.yaims;



/**
 * Date 展示渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/date
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Date extends BaseRenderer 
{
    public Date()
    {
        set("type", "date");

    }

    /**
     * 容器 css 类名
     */
    public Date className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Date disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Date disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 展示的时间格式，参考 moment 中的格式说明。
     */
    public Date format(Object value)
    {
        return set("format", value);
    }

    /**
     * 显示成相对时间，比如1分钟前
     */
    public Date fromNow(boolean value)
    {
        return set("fromNow", value);
    }

    /**
     * 是否隐藏
     */
    public Date hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Date hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Date id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Date onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Date placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否静态展示
     */
    public Date staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Date staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Date staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Date staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Date staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Date staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Date staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Date style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为日期展示类型 可选值: date | datetime | time | static-date | static-datetime | static-time
     */
    public Date type(Object value)
    {
        return set("type", value);
    }

    /**
     * 更新频率， 默认为1分钟
     */
    public Date updateFrequency(Object value)
    {
        return set("updateFrequency", value);
    }

    /**
     * 值的时间格式，参考 moment 中的格式说明。
     */
    public Date valueFormat(Object value)
    {
        return set("valueFormat", value);
    }

    /**
     * 是否显示
     */
    public Date visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Date visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Date set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
