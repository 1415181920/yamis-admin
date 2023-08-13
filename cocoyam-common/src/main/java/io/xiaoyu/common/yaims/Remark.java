package io.xiaoyu.common.yaims;



/**
 * 提示渲染器，默认会显示个小图标，鼠标放上来的时候显示配置的内容。
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Remark extends BaseRenderer 
{
    public Remark()
    {
        set("type", "remark");

    }

    /**
     * 容器 css 类名
     */
    public Remark className(Object value)
    {
        return set("className", value);
    }

    /**
     * 提示内容
     */
    public Remark content(Object value)
    {
        return set("content", value);
    }

    /**
     * 是否禁用
     */
    public Remark disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Remark disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Remark hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Remark hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    public Remark icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Remark id(Object value)
    {
        return set("id", value);
    }

    public Remark label(Object value)
    {
        return set("label", value);
    }

    /**
     * 事件动作配置
     */
    public Remark onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 显示位置 可选值: top | right | bottom | left
     */
    public Remark placement(Object value)
    {
        return set("placement", value);
    }

    /**
     * 点击其他内容时是否关闭弹框信息
     */
    public Remark rootClose(boolean value)
    {
        return set("rootClose", value);
    }

    /**
     * icon的形状 可选值: circle | square
     */
    public Remark shape(Object value)
    {
        return set("shape", value);
    }

    /**
     * 是否静态展示
     */
    public Remark staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Remark staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Remark staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Remark staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Remark staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Remark staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Remark staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Remark style(Object value)
    {
        return set("style", value);
    }

    /**
     * 提示标题
     */
    public Remark title(Object value)
    {
        return set("title", value);
    }

    public Remark tooltipClassName(Object value)
    {
        return set("tooltipClassName", value);
    }

    /**
     * 触发规则
     */
    public Remark trigger(Object value)
    {
        return set("trigger", value);
    }

    /**
     * 指定为提示类型
     */
    public Remark type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Remark visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Remark visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Remark set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
