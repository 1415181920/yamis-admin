package io.xiaoyu.common.yaims;



/**
 * Color 显示渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/color
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Color extends BaseRenderer 
{
    public Color()
    {
        set("type", "color");

    }

    /**
     * 容器 css 类名
     */
    public Color className(Object value)
    {
        return set("className", value);
    }

    /**
     * 默认颜色
     */
    public Color defaultColor(Object value)
    {
        return set("defaultColor", value);
    }

    /**
     * 是否禁用
     */
    public Color disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Color disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Color hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Color hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Color id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Color onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否用文字显示值。
     */
    public Color showValue(boolean value)
    {
        return set("showValue", value);
    }

    /**
     * 是否静态展示
     */
    public Color staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Color staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Color staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Color staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Color staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Color staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Color staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Color style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为颜色显示控件
     */
    public Color type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Color visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Color visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Color set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
