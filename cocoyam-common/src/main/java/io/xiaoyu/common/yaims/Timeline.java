package io.xiaoyu.common.yaims;



/**
 * Timeline
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Timeline extends BaseRenderer 
{
    public Timeline()
    {
        set("type", "timeline");

    }

    /**
     * 容器 css 类名
     */
    public Timeline className(Object value)
    {
        return set("className", value);
    }

    /**
     * 展示方向 可选值: horizontal | vertical
     */
    public Timeline direction(Object value)
    {
        return set("direction", value);
    }

    /**
     * 是否禁用
     */
    public Timeline disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Timeline disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Timeline hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Timeline hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Timeline id(Object value)
    {
        return set("id", value);
    }

    /**
     * 节点数据
     */
    public Timeline items(Object value)
    {
        return set("items", value);
    }

    /**
     * 文字相对于时间轴展示方向 可选值: left | right | alternate
     */
    public Timeline mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 事件动作配置
     */
    public Timeline onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 节点倒序
     */
    public Timeline reverse(boolean value)
    {
        return set("reverse", value);
    }

    /**
     * API 或 数据映射
     */
    public Timeline source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Timeline staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Timeline staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Timeline staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Timeline staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Timeline staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Timeline staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Timeline staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Timeline style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 Timeline 时间轴渲染器
     */
    public Timeline type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Timeline visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Timeline visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Timeline set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
