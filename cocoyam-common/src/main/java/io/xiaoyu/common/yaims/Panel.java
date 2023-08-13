package io.xiaoyu.common.yaims;



/**
 * Panel渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/panel
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Panel extends BaseRenderer 
{
    public Panel()
    {
        set("type", "panel");

    }

    /**
     * 按钮集合
     */
    public Panel actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 按钮集合外层类名
     */
    public Panel actionsClassName(Object value)
    {
        return set("actionsClassName", value);
    }

    /**
     * 固定底部, 想要把按钮固定在底部的时候配置。
     */
    public Panel affixFooter(Object value)
    {
        return set("affixFooter", value);
    }

    /**
     * 内容区域
     */
    public Panel body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public Panel bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public Panel className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Panel disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Panel disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部内容区域
     */
    public Panel footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 配置 footer 容器 className
     */
    public Panel footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * footer 和 actions 外层 div 类名。
     */
    public Panel footerWrapClassName(Object value)
    {
        return set("footerWrapClassName", value);
    }

    /**
     * 头部内容, 和 title 二选一。
     */
    public Panel header(Object value)
    {
        return set("header", value);
    }

    /**
     * 配置 header 容器 className
     */
    public Panel headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Panel hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Panel hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Panel id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public Panel onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Panel staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Panel staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Panel staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Panel staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Panel staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Panel staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Panel staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Panel style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public Panel subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public Panel subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * Panel 标题
     */
    public Panel title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为Panel渲染器。
     */
    public Panel type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Panel visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Panel visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Panel set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
