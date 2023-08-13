package io.xiaoyu.common.yaims;



/**
 * Divider 分割线渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/divider
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Divider extends BaseRenderer 
{
    public Divider()
    {
        set("type", "divider");

    }

    /**
     * 容器 css 类名
     */
    public Divider className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Divider disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Divider disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Divider hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Divider hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Divider id(Object value)
    {
        return set("id", value);
    }

    /**
     *  可选值: dashed | solid
     */
    public Divider lineStyle(Object value)
    {
        return set("lineStyle", value);
    }

    /**
     * 事件动作配置
     */
    public Divider onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Divider staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Divider staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Divider staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Divider staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Divider staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Divider staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Divider staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Divider style(Object value)
    {
        return set("style", value);
    }

    public Divider type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Divider visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Divider visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Divider set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
