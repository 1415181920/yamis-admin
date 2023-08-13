package io.xiaoyu.common.yaims;



/**
 * Link 链接展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/link
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Link extends BaseRenderer 
{
    public Link()
    {
        set("type", "link");

    }

    /**
     * 角标
     */
    public Link badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 是否新窗口打开。
     */
    public Link blank(boolean value)
    {
        return set("blank", value);
    }

    /**
     * 链接内容，如果不配置将显示链接地址。
     */
    public Link body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Link className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Link disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Link disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Link hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Link hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 链接地址
     */
    public Link href(Object value)
    {
        return set("href", value);
    }

    /**
     * a标签原生target属性
     */
    public Link htmlTarget(Object value)
    {
        return set("htmlTarget", value);
    }

    /**
     * 图标
     */
    public Link icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Link id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Link onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 右侧图标
     */
    public Link rightIcon(Object value)
    {
        return set("rightIcon", value);
    }

    /**
     * 是否静态展示
     */
    public Link staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Link staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Link staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Link staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Link staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Link staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Link staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Link style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 link 链接展示控件
     */
    public Link type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Link visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Link visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Link set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
