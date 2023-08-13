package io.xiaoyu.common.yaims;



/**
 * Alert 提示渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/alert
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Alert extends BaseRenderer 
{
    public Alert()
    {
        set("type", "alert");

    }

    /**
     * 内容区域
     */
    public Alert body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Alert className(Object value)
    {
        return set("className", value);
    }

    /**
     * 关闭按钮CSS类名
     */
    public Alert closeButtonClassName(Object value)
    {
        return set("closeButtonClassName", value);
    }

    /**
     * 是否禁用
     */
    public Alert disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Alert disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Alert hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Alert hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 左侧图标
     */
    public Alert icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 图标CSS类名
     */
    public Alert iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Alert id(Object value)
    {
        return set("id", value);
    }

    /**
     * 提示类型 可选值: info | warning | success | danger
     */
    public Alert level(Object value)
    {
        return set("level", value);
    }

    /**
     * 事件动作配置
     */
    public Alert onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示关闭按钮
     */
    public Alert showCloseButton(boolean value)
    {
        return set("showCloseButton", value);
    }

    /**
     * 是否显示ICON
     */
    public Alert showIcon(boolean value)
    {
        return set("showIcon", value);
    }

    /**
     * 是否静态展示
     */
    public Alert staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Alert staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Alert staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Alert staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Alert staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Alert staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Alert staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Alert style(Object value)
    {
        return set("style", value);
    }

    /**
     * 提示框标题
     */
    public Alert title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为提示框类型
     */
    public Alert type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Alert visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Alert visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Alert set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
