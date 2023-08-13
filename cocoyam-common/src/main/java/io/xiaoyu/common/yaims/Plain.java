package io.xiaoyu.common.yaims;



/**
 * Plain 纯文本渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/plain
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Plain extends BaseRenderer 
{
    public Plain()
    {
        set("type", "plain");

    }

    /**
     * 容器 css 类名
     */
    public Plain className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Plain disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Plain disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Plain hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Plain hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Plain id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否内联显示？
     */
    public Plain inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 事件动作配置
     */
    public Plain onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Plain placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否静态展示
     */
    public Plain staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Plain staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Plain staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Plain staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Plain staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Plain staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Plain staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Plain style(Object value)
    {
        return set("style", value);
    }

    public Plain text(Object value)
    {
        return set("text", value);
    }

    public Plain tpl(Object value)
    {
        return set("tpl", value);
    }

    /**
     * 指定为模板渲染器。文档：https://aisuda.bce.baidu.com/amis/zh-CN/docs/concepts/template 可选值: plain | text
     */
    public Plain type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Plain visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Plain visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Plain set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
