package io.xiaoyu.common.yaims;



/**
 * TimelineItem
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TimelineItem extends BaseRenderer 
{
    public TimelineItem()
    {

    }

    /**
     * 容器 css 类名
     */
    public TimelineItem className(Object value)
    {
        return set("className", value);
    }

    /**
     * 时间点圆圈颜色
     */
    public TimelineItem color(Object value)
    {
        return set("color", value);
    }

    /**
     * 详细内容
     */
    public TimelineItem detail(Object value)
    {
        return set("detail", value);
    }

    /**
     * detail折叠时文案
     */
    public TimelineItem detailCollapsedText(Object value)
    {
        return set("detailCollapsedText", value);
    }

    /**
     * detail展开时文案
     */
    public TimelineItem detailExpandedText(Object value)
    {
        return set("detailExpandedText", value);
    }

    /**
     * 是否禁用
     */
    public TimelineItem disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TimelineItem disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public TimelineItem hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TimelineItem hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 图标
     */
    public TimelineItem icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 图标的CSS类名
     */
    public TimelineItem iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TimelineItem id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public TimelineItem onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public TimelineItem staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TimelineItem staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TimelineItem staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TimelineItem staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TimelineItem staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TimelineItem staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TimelineItem staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public TimelineItem style(Object value)
    {
        return set("style", value);
    }

    /**
     * 时间点
     */
    public TimelineItem time(Object value)
    {
        return set("time", value);
    }

    /**
     * 时间节点标题
     */
    public TimelineItem title(Object value)
    {
        return set("title", value);
    }

    /**
     * 是否显示
     */
    public TimelineItem visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TimelineItem visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public TimelineItem set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
