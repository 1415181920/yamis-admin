package io.xiaoyu.common.yaims;



/**
 * Steps
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Steps extends BaseRenderer 
{
    public Steps()
    {
        set("type", "steps");

    }

    /**
     * 容器 css 类名
     */
    public Steps className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Steps disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Steps disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Steps hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Steps hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Steps id(Object value)
    {
        return set("id", value);
    }

    /**
     * 标签放置位置 可选值: horizontal | vertical
     */
    public Steps labelPlacement(Object value)
    {
        return set("labelPlacement", value);
    }

    /**
     * 展示模式 可选值: horizontal | vertical
     */
    public Steps mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 变量映射
     */
    public Steps name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Steps onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 点状步骤条
     */
    public Steps progressDot(boolean value)
    {
        return set("progressDot", value);
    }

    /**
     * API 或 数据映射
     */
    public Steps source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Steps staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Steps staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Steps staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Steps staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Steps staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Steps staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Steps staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public Steps status(Object value)
    {
        return set("status", value);
    }

    /**
     * 步骤
     */
    public Steps steps(Object value)
    {
        return set("steps", value);
    }

    /**
     * 组件样式
     */
    public Steps style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 Steps 步骤条渲染器
     */
    public Steps type(Object value)
    {
        return set("type", value);
    }

    /**
     * 指定当前步骤
     */
    public Steps value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Steps visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Steps visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Steps set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
