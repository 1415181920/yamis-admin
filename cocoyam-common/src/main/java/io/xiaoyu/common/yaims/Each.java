package io.xiaoyu.common.yaims;



/**
 * Each 循环功能渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/each
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Each extends BaseRenderer 
{
    public Each()
    {
        set("type", "each");

    }

    /**
     * 容器 css 类名
     */
    public Each className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Each disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Each disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Each hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Each hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Each id(Object value)
    {
        return set("id", value);
    }

    public Each items(Object value)
    {
        return set("items", value);
    }

    /**
     * 关联字段名
     */
    public Each name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Each onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public Each placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 关联字段名 支持数据映射
     */
    public Each source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Each staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Each staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Each staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Each staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Each staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Each staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Each staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Each style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为each展示类型
     */
    public Each type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Each visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Each visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Each set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
