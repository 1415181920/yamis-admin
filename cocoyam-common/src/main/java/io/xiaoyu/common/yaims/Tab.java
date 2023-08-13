package io.xiaoyu.common.yaims;



/**
 * Tab
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tab extends BaseRenderer 
{
    public Tab()
    {

    }

    /**
     * 徽标
     */
    public Tab badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 内容
     */
    public Tab body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Tab className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否可关闭，优先级高于 tabs 的 closable
     */
    public Tab closable(boolean value)
    {
        return set("closable", value);
    }

    /**
     * 是否禁用
     */
    public Tab disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tab disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 设置以后将跟url的hash对应
     */
    public Tab hash(Object value)
    {
        return set("hash", value);
    }

    /**
     * 是否隐藏
     */
    public Tab hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tab hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public Tab horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 按钮图标
     */
    public Tab icon(Object value)
    {
        return set("icon", value);
    }

    /**
     *  可选值: left | right
     */
    public Tab iconPosition(Object value)
    {
        return set("iconPosition", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tab id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public Tab mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 点开时才加载卡片内容
     */
    public Tab mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 事件动作配置
     */
    public Tab onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 设置以后内容每次都会重新渲染
     */
    public Tab reload(boolean value)
    {
        return set("reload", value);
    }

    /**
     * 是否静态展示
     */
    public Tab staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tab staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tab staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tab staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tab staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tab staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tab staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Tab style(Object value)
    {
        return set("style", value);
    }

    /**
     * 内容
     */
    public Tab tab(Object value)
    {
        return set("tab", value);
    }

    /**
     * Tab 标题
     */
    public Tab title(Object value)
    {
        return set("title", value);
    }

    /**
     * 卡片隐藏就销毁卡片节点。
     */
    public Tab unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 是否显示
     */
    public Tab visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tab visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Tab set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
