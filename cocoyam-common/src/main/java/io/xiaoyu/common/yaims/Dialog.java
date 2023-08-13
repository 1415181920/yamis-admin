package io.xiaoyu.common.yaims;



/**
 * Dialog 弹框渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/dialog
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Dialog extends BaseRenderer 
{
    public Dialog()
    {
        set("type", "dialog");

    }

    /**
     * 默认不用填写，自动会创建确认和取消按钮。
     */
    public Dialog actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 内容区域
     */
    public Dialog body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public Dialog bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public Dialog className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否支持按 ESC 关闭 Dialog
     */
    public Dialog closeOnEsc(boolean value)
    {
        return set("closeOnEsc", value);
    }

    /**
     * 是否支持点其它区域关闭 Dialog
     */
    public Dialog closeOnOutside(boolean value)
    {
        return set("closeOnOutside", value);
    }

    /**
     * 影响自动生成的按钮，如果自己配置了按钮这个配置无效。
     */
    public Dialog confirm(boolean value)
    {
        return set("confirm", value);
    }

    /**
     * 是否禁用
     */
    public Dialog disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Dialog disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public Dialog footer(Object value)
    {
        return set("footer", value);
    }

    public Dialog header(Object value)
    {
        return set("header", value);
    }

    public Dialog headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * Dialog 高度
     */
    public Dialog height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public Dialog hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Dialog hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Dialog id(Object value)
    {
        return set("id", value);
    }

    public Dialog name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Dialog onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示关闭按钮
     */
    public Dialog showCloseButton(boolean value)
    {
        return set("showCloseButton", value);
    }

    /**
     * 是否显示错误信息
     */
    public Dialog showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * 是否显示 spinner
     */
    public Dialog showLoading(boolean value)
    {
        return set("showLoading", value);
    }

    /**
     * Dialog 大小 可选值: xs | sm | md | lg | xl | full
     */
    public Dialog size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Dialog staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Dialog staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Dialog staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Dialog staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Dialog staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Dialog staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Dialog staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Dialog style(Object value)
    {
        return set("style", value);
    }

    /**
     * 请通过配置 title 设置标题
     */
    public Dialog title(Object value)
    {
        return set("title", value);
    }

    public Dialog type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Dialog visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Dialog visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * Dialog 宽度
     */
    public Dialog width(Object value)
    {
        return set("width", value);
    }

    public Dialog set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
