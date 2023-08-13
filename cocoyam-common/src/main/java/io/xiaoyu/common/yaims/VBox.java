package io.xiaoyu.common.yaims;



/**
 * 垂直布局控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/vbox
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class VBox extends BaseRenderer 
{
    public VBox()
    {
        set("type", "vbox");

    }

    /**
     * 容器 css 类名
     */
    public VBox className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public VBox disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public VBox disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public VBox hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public VBox hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public VBox id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public VBox onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 行集合
     */
    public VBox rows(Object value)
    {
        return set("rows", value);
    }

    /**
     * 是否静态展示
     */
    public VBox staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public VBox staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public VBox staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public VBox staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public VBox staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public VBox staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public VBox staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public VBox style(Object value)
    {
        return set("style", value);
    }

    public VBox type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public VBox visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public VBox visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public VBox set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
