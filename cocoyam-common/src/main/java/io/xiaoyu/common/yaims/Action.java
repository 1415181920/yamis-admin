package io.xiaoyu.common.yaims;



/**
 * Action 行为按钮 https://aisuda.bce.baidu.com/amis/zh-CN/components/action
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Action extends BaseRenderer 
{
    public Action()
    {
        set("type", "action");

    }

    /**
     * 【必填】这是 action 最核心的配置，来指定该 action 的作用类型，支持：ajax、link、url、drawer、dialog、confirm、cancel、prev、next、copy、close。
     */
    public Action actionType(Object value)
    {
        return set("actionType", value);
    }

    /**
     * 给按钮高亮添加类名。
     */
    public Action activeClassName(Object value)
    {
        return set("activeClassName", value);
    }

    /**
     * 按钮高亮时的样式，配置支持同level。
     */
    public Action activeLevel(Object value)
    {
        return set("activeLevel", value);
    }

    public Action api(Object value)
    {
        return set("api", value);
    }

    /**
     * 添加类名。
     */
    public Action className(Object value)
    {
        return set("className", value);
    }

    /**
     * 当action配置在dialog或drawer的actions中时，配置为true指定此次操作完后关闭当前dialog或drawer。当值为字符串，并且是祖先层弹框的名字的时候，会把祖先弹框关闭掉。
     */
    public Action close(Object value)
    {
        return set("close", value);
    }

    /**
     * 当设置后，操作在开始前会询问用户。可用 "[xxx]" 取值。
     */
    public Action confirmText(Object value)
    {
        return set("confirmText", value);
    }

    /**
     * 被禁用后鼠标停留时弹出该段文字，也可以配置对象类型：字段为title和content。可用 "[xxx]" 取值。
     */
    public Action disabledTip(Object value)
    {
        return set("disabledTip", value);
    }

    /**
     * 设置图标，例如fa fa-plus。
     */
    public Action icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 给图标上添加类名。
     */
    public Action iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     * 按钮文本。可用 "[xxx]" 取值。
     */
    public Action label(Object value)
    {
        return set("label", value);
    }

    /**
     * 按钮样式，支持：link /primary/secondary/info/success/warning/danger/light/dark/default。
     */
    public Action level(Object value)
    {
        return set("level", value);
    }

    public Action link(Object value)
    {
        return set("link", value);
    }

    /**
     * 指定此次操作完后，需要刷新的目标组件名字（组件的name值，自己配置的），多个请用, 号隔开。
     */
    public Action reload(Object value)
    {
        return set("reload", value);
    }

    /**
     * 配置字符串数组，指定在form中进行操作之前，需要指定的字段名的表单项通过验证
     */
    public Action required(Object value)
    {
        return set("required", value);
    }

    /**
     * 在按钮文本右侧设置图标，例如fa fa-plus。
     */
    public Action rightIcon(Object value)
    {
        return set("rightIcon", value);
    }

    /**
     * 给右侧图标上添加类名。
     */
    public Action rightIconClassName(Object value)
    {
        return set("rightIconClassName", value);
    }

    /**
     * 按钮大小，支持：xs、sm、md、lg。
     */
    public Action size(Object value)
    {
        return set("size", value);
    }

    /**
     * 鼠标停留时弹出该段文字，也可以配置对象类型：字段为title和content。可用 "[xxx]" 取值。
     */
    public Action tooltip(Object value)
    {
        return set("tooltip", value);
    }

    /**
     * 如果配置了tooltip或者disabledTip，指定提示信息位置，可配置top、bottom、left、right。
     */
    public Action tooltipPlacement(Object value)
    {
        return set("tooltipPlacement", value);
    }

    /**
     * 指定为 action 渲染器。
     */
    public Action type(Object value)
    {
        return set("type", value);
    }

    public Action set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
