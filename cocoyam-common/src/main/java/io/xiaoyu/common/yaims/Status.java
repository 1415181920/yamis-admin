package io.xiaoyu.common.yaims;



/**
 * 状态展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/status
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Status extends BaseRenderer 
{
    public Status()
    {
        set("type", "status");

    }

    /**
     * 容器 css 类名
     */
    public Status className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Status disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Status disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Status hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Status hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Status id(Object value)
    {
        return set("id", value);
    }

    /**
     * 文字映射关系
     */
    public Status labelMap(Object value)
    {
        return set("labelMap", value);
    }

    /**
     * 状态图标映射关系
     */
    public Status map(Object value)
    {
        return set("map", value);
    }

    /**
     * 事件动作配置
     */
    public Status onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Status placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 新版配置映射源的字段 可以兼容新版icon并且配置颜色 2.8.0 新增
     */
    public Status source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Status staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Status staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Status staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Status staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Status staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Status staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Status staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Status style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为状态展示控件
     */
    public Status type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Status visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Status visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Status set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
