package io.xiaoyu.common.yaims;



/**
 * JSON 数据展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/json
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Json extends BaseRenderer 
{
    public Json()
    {
        set("type", "json");

    }

    /**
     * 容器 css 类名
     */
    public Json className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Json disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Json disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否显示数据类型
     */
    public Json displayDataTypes(boolean value)
    {
        return set("displayDataTypes", value);
    }

    /**
     * 设置字符串的最大展示长度，超出长度阈值的字符串将被截断，点击value可切换字符串展示方式，默认为false
     */
    public Json ellipsisThreshold(Object value)
    {
        return set("ellipsisThreshold", value);
    }

    /**
     * 是否可复制
     */
    public Json enableClipboard(boolean value)
    {
        return set("enableClipboard", value);
    }

    /**
     * 是否隐藏
     */
    public Json hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Json hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 图标风格 可选值: square | circle | triangle
     */
    public Json iconStyle(Object value)
    {
        return set("iconStyle", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Json id(Object value)
    {
        return set("id", value);
    }

    /**
     * 默认展开的级别
     */
    public Json levelExpand(Object value)
    {
        return set("levelExpand", value);
    }

    /**
     * 是否可修改
     */
    public Json mutable(boolean value)
    {
        return set("mutable", value);
    }

    /**
     * 事件动作配置
     */
    public Json onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示键的引号
     */
    public Json quotesOnKeys(boolean value)
    {
        return set("quotesOnKeys", value);
    }

    /**
     * 是否为键排序
     */
    public Json sortKeys(boolean value)
    {
        return set("sortKeys", value);
    }

    /**
     * 支持从数据链取值
     */
    public Json source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Json staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Json staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Json staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Json staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Json staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Json staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Json staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Json style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为Json展示类型 可选值: json | static-json
     */
    public Json type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Json visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Json visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Json set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
