package io.xiaoyu.common.yaims;



/**
 * Button Toolar 渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/button-toolbar
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ButtonToolbar extends BaseRenderer 
{
    public ButtonToolbar()
    {
        set("type", "button-toolbar");

    }

    public ButtonToolbar buttons(Object value)
    {
        return set("buttons", value);
    }

    /**
     * 容器 css 类名
     */
    public ButtonToolbar className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public ButtonToolbar disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ButtonToolbar disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public ButtonToolbar hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ButtonToolbar hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ButtonToolbar id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public ButtonToolbar onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public ButtonToolbar staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ButtonToolbar staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ButtonToolbar staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ButtonToolbar staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ButtonToolbar staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ButtonToolbar staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ButtonToolbar staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ButtonToolbar style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为按钮工具集合类型
     */
    public ButtonToolbar type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public ButtonToolbar visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ButtonToolbar visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public ButtonToolbar set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
