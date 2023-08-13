package io.xiaoyu.common.yaims;



/**
 * Wrapper 容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/wrapper
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Wrapper extends BaseRenderer 
{
    public Wrapper()
    {
        set("type", "wrapper");

    }

    /**
     * 内容
     */
    public Wrapper body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Wrapper className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Wrapper disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Wrapper disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Wrapper hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Wrapper hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Wrapper id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Wrapper onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     *  可选值: xs | sm | md | lg | none
     */
    public Wrapper size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Wrapper staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Wrapper staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Wrapper staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Wrapper staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Wrapper staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Wrapper staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Wrapper staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Wrapper style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 container 类型
     */
    public Wrapper type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Wrapper visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Wrapper visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Wrapper wrap(boolean value)
    {
        return set("wrap", value);
    }

    public Wrapper set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
