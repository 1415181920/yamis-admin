package io.xiaoyu.common.yaims;



/**
 * NavItem
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class NavItem extends BaseRenderer 
{
    public NavItem()
    {

    }

    public NavItem accordion(boolean value)
    {
        return set("accordion", value);
    }

    public NavItem active(boolean value)
    {
        return set("active", value);
    }

    public NavItem children(Object value)
    {
        return set("children", value);
    }

    public NavItem className(Object value)
    {
        return set("className", value);
    }

    public NavItem defer(boolean value)
    {
        return set("defer", value);
    }

    public NavItem deferApi(Object value)
    {
        return set("deferApi", value);
    }

    public NavItem disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public NavItem disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public NavItem disabledTip(Object value)
    {
        return set("disabledTip", value);
    }

    /**
     * 是否隐藏
     */
    public NavItem hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public NavItem hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 图标类名，参考 fontawesome 4。
     */
    public NavItem icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public NavItem id(Object value)
    {
        return set("id", value);
    }

    public NavItem key(Object value)
    {
        return set("key", value);
    }

    /**
     * 文字说明
     */
    public NavItem label(Object value)
    {
        return set("label", value);
    }

    public NavItem mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 事件动作配置
     */
    public NavItem onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public NavItem popupClassName(Object value)
    {
        return set("popupClassName", value);
    }

    /**
     * 是否静态展示
     */
    public NavItem staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public NavItem staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public NavItem staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public NavItem staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public NavItem staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public NavItem staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public NavItem staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public NavItem style(Object value)
    {
        return set("style", value);
    }

    public NavItem target(Object value)
    {
        return set("target", value);
    }

    public NavItem to(Object value)
    {
        return set("to", value);
    }

    public NavItem unfolded(boolean value)
    {
        return set("unfolded", value);
    }

    /**
     * 是否显示
     */
    public NavItem visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public NavItem visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public NavItem set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
