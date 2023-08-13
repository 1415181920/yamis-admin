package io.xiaoyu.common.yaims;



/**
 * Calendar
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Calendar extends BaseRenderer 
{
    public Calendar()
    {
        set("type", "calendar");

    }

    /**
     * 容器 css 类名
     */
    public Calendar className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Calendar disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Calendar disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Calendar hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Calendar hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Calendar id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否开启放大模式
     */
    public Calendar largeMode(boolean value)
    {
        return set("largeMode", value);
    }

    /**
     * 事件动作配置
     */
    public Calendar onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 日程点击展示
     */
    public Calendar scheduleAction(Object value)
    {
        return set("scheduleAction", value);
    }

    /**
     * 日程显示颜色自定义
     */
    public Calendar scheduleClassNames(Object value)
    {
        return set("scheduleClassNames", value);
    }

    /**
     * 日程
     */
    public Calendar schedules(Object value)
    {
        return set("schedules", value);
    }

    /**
     * 是否静态展示
     */
    public Calendar staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Calendar staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Calendar staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Calendar staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Calendar staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Calendar staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Calendar staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Calendar style(Object value)
    {
        return set("style", value);
    }

    /**
     * 今日激活时的自定义样式
     */
    public Calendar todayActiveStyle(Object value)
    {
        return set("todayActiveStyle", value);
    }

    /**
     * 指定为日历选择控件
     */
    public Calendar type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Calendar visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Calendar visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Calendar set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
