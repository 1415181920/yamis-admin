package io.xiaoyu.common.yaims;



/**
 * Password
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Password extends BaseRenderer 
{
    public Password()
    {
        set("type", "password");

    }

    /**
     * 容器 css 类名
     */
    public Password className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Password disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Password disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Password hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Password hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Password id(Object value)
    {
        return set("id", value);
    }

    /**
     * 打码模式的文本
     */
    public Password mosaicText(Object value)
    {
        return set("mosaicText", value);
    }

    /**
     * 事件动作配置
     */
    public Password onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Password staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Password staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Password staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Password staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Password staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Password staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Password staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Password style(Object value)
    {
        return set("style", value);
    }

    public Password type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Password visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Password visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Password set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
