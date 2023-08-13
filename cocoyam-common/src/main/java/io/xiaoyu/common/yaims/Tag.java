package io.xiaoyu.common.yaims;



/**
 * Tag
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tag extends BaseRenderer 
{
    public Tag()
    {
        set("type", "tag");

    }

    /**
     * 是否是可选的标签
     */
    public Tag checkable(boolean value)
    {
        return set("checkable", value);
    }

    /**
     * 是否选中
     */
    public Tag checked(boolean value)
    {
        return set("checked", value);
    }

    /**
     * 类名
     */
    public Tag className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否展示关闭按钮
     */
    public Tag closable(boolean value)
    {
        return set("closable", value);
    }

    /**
     * 关闭图标
     */
    public Tag closeIcon(Object value)
    {
        return set("closeIcon", value);
    }

    /**
     * 标签颜色
     */
    public Tag color(Object value)
    {
        return set("color", value);
    }

    /**
     * 是否禁用
     */
    public Tag disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tag disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * normal: 面性标签，对应color的背景色 rounded: 线性标签， 对应color的边框 status: 带图标的标签， 图标可以自定义 可选值: normal | rounded | status
     */
    public Tag displayMode(Object value)
    {
        return set("displayMode", value);
    }

    /**
     * 是否隐藏
     */
    public Tag hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tag hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * status模式时候设置的前置图标
     */
    public Tag icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tag id(Object value)
    {
        return set("id", value);
    }

    /**
     * 标签文本内容
     */
    public Tag label(Object value)
    {
        return set("label", value);
    }

    /**
     * 事件动作配置
     */
    public Tag onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public Tag staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tag staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tag staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tag staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tag staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tag staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tag staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Tag style(Object value)
    {
        return set("style", value);
    }

    public Tag type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Tag visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tag visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Tag set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
