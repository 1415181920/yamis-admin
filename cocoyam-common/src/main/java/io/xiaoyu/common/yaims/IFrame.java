package io.xiaoyu.common.yaims;



/**
 * IFrame 渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/iframe
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class IFrame extends BaseRenderer 
{
    public IFrame()
    {
        set("type", "iframe");

    }

    public IFrame allow(Object value)
    {
        return set("allow", value);
    }

    /**
     * 容器 css 类名
     */
    public IFrame className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public IFrame disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public IFrame disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 事件相应，配置后当 iframe 通过 postMessage 发送事件时，可以触发 AMIS 内部的动作。
     */
    public IFrame events(Object value)
    {
        return set("events", value);
    }

    public IFrame height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public IFrame hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public IFrame hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public IFrame id(Object value)
    {
        return set("id", value);
    }

    public IFrame name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public IFrame onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     *  可选值: no-referrer | no-referrer-when-downgrade | origin | origin-when-cross-origin | same-origin | strict-origin | strict-origin-when-cross-origin | unsafe-url
     */
    public IFrame referrerpolicy(Object value)
    {
        return set("referrerpolicy", value);
    }

    public IFrame sandbox(Object value)
    {
        return set("sandbox", value);
    }

    /**
     * 页面地址
     */
    public IFrame src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public IFrame staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public IFrame staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public IFrame staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public IFrame staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public IFrame staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public IFrame staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public IFrame staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public IFrame style(Object value)
    {
        return set("style", value);
    }

    public IFrame type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public IFrame visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public IFrame visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public IFrame width(Object value)
    {
        return set("width", value);
    }

    public IFrame set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
