package io.xiaoyu.common.yaims;



/**
 * Icon 图表渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/icon
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Icon extends BaseRenderer 
{
    public Icon()
    {
        set("type", "icon");

    }

    /**
     * 角标
     */
    public Icon badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 容器 css 类名
     */
    public Icon className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Icon disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Icon disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Icon hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Icon hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 按钮类型
     */
    public Icon icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Icon id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Icon onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Icon staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Icon staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Icon staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Icon staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Icon staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Icon staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Icon staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Icon style(Object value)
    {
        return set("style", value);
    }

    public Icon type(Object value)
    {
        return set("type", value);
    }

    /**
     *  可选值: iconfont | fa | 
     */
    public Icon vendor(Object value)
    {
        return set("vendor", value);
    }

    /**
     * 是否显示
     */
    public Icon visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Icon visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Icon set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
