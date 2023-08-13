package io.xiaoyu.common.yaims;



/**
 * Step
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Step extends BaseRenderer 
{
    public Step()
    {

    }

    /**
     * 容器 css 类名
     */
    public Step className(Object value)
    {
        return set("className", value);
    }

    /**
     * 描述
     */
    public Step description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public Step disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Step disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Step hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Step hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 图标
     */
    public Step icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Step id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Step onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Step staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Step staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Step staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Step staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Step staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Step staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Step staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Step style(Object value)
    {
        return set("style", value);
    }

    /**
     * 子标题
     */
    public Step subTitle(Object value)
    {
        return set("subTitle", value);
    }

    /**
     * 标题
     */
    public Step title(Object value)
    {
        return set("title", value);
    }

    public Step value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Step visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Step visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Step set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
