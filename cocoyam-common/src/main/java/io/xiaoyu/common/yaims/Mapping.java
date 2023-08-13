package io.xiaoyu.common.yaims;



/**
 * Mapping 映射展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/mapping
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Mapping extends BaseRenderer 
{
    public Mapping()
    {
        set("type", "map");

    }

    /**
     * 容器 css 类名
     */
    public Mapping className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Mapping disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Mapping disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Mapping hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Mapping hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Mapping id(Object value)
    {
        return set("id", value);
    }

    /**
     * 自定义渲染映射值，支持html或schema
     */
    public Mapping itemSchema(Object value)
    {
        return set("itemSchema", value);
    }

    /**
     * map或source为对象数组时，作为label值的字段名
     */
    public Mapping labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 配置映射规则，值可以使用模板语法。当 key 为 * 时表示 else，也就是说值没有映射到任何规则时用 * 对应的值展示。
     */
    public Mapping map(Object value)
    {
        return set("map", value);
    }

    /**
     * 关联字段名。
     */
    public Mapping name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Mapping onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Mapping placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 如果想远程拉取字典，请配置 source 为接口。
     */
    public Mapping source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Mapping staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Mapping staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Mapping staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Mapping staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Mapping staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Mapping staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Mapping staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Mapping style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为映射展示控件 可选值: map | mapping
     */
    public Mapping type(Object value)
    {
        return set("type", value);
    }

    /**
     * map或source为对象数组时，作为value值的字段名
     */
    public Mapping valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public Mapping visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Mapping visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Mapping set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
