package io.xiaoyu.common.yaims;



/**
 * tpl 渲染器
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tpl extends BaseRenderer
{
    public Tpl()
    {
        set("type", "tpl");

    }

    /**
     * 角标
     */
    public Tpl badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 容器 css 类名
     */
    public Tpl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Tpl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tpl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Tpl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tpl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    public Tpl html(Object value)
    {
        return set("html", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tpl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否内联显示？
     */
    public Tpl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 事件动作配置
     */
    public Tpl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public Tpl raw(Object value)
    {
        return set("raw", value);
    }

    /**
     * 是否静态展示
     */
    public Tpl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tpl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tpl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tpl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tpl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tpl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tpl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Tpl style(Object value)
    {
        return set("style", value);
    }

    public Tpl text(Object value)
    {
        return set("text", value);
    }

    public Tpl tpl(Object value)
    {
        return set("tpl", value);
    }

    /**
     * 指定为模板渲染器。文档：https://aisuda.bce.baidu.com/amis/zh-CN/docs/concepts/template 可选值: tpl | html
     */
    public Tpl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Tpl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tpl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 标签类型
     */
    public Tpl wrapperComponent(Object value)
    {
        return set("wrapperComponent", value);
    }

    public Tpl set(String key, Object value)
    {
        super.set(key, value);
        return this;
    }

}
