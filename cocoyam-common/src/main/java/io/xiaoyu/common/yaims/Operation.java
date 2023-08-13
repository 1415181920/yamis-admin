package io.xiaoyu.common.yaims;



/**
 * 操作栏渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/operation
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Operation extends BaseRenderer 
{
    public Operation()
    {
        set("type", "operation");

    }

    public Operation buttons(Object value)
    {
        return set("buttons", value);
    }

    /**
     * 容器 css 类名
     */
    public Operation className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Operation disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Operation disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Operation hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Operation hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Operation id(Object value)
    {
        return set("id", value);
    }

    /**
     * 设置label
     */
    public Operation label(Object value)
    {
        return set("label", value);
    }

    /**
     * 事件动作配置
     */
    public Operation onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Operation placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否静态展示
     */
    public Operation staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Operation staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Operation staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Operation staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Operation staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Operation staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Operation staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Operation style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为操作栏
     */
    public Operation type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Operation visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Operation visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Operation set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
