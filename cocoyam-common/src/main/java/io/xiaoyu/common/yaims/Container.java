package io.xiaoyu.common.yaims;



/**
 * Container 容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/container
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Container extends BaseRenderer 
{
    public Container()
    {
        set("type", "container");

    }

    /**
     * 内容
     */
    public Container body(Object value)
    {
        return set("body", value);
    }

    /**
     * body 类名
     */
    public Container bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public Container className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Container disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Container disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否开启容器拖拽
     */
    public Container draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否开启容器拖拽配置
     */
    public Container draggableConfig(Object value)
    {
        return set("draggableConfig", value);
    }

    /**
     * 是否隐藏
     */
    public Container hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Container hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Container id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Container onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Container staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Container staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Container staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Container staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Container staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Container staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Container staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Container style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 container 类型
     */
    public Container type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Container visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Container visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 是否需要对body加一层div包裹，默认为 true
     */
    public Container wrapperBody(boolean value)
    {
        return set("wrapperBody", value);
    }

    /**
     * 使用的标签
     */
    public Container wrapperComponent(Object value)
    {
        return set("wrapperComponent", value);
    }

    public Container set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
