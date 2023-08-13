package io.xiaoyu.common.yaims;



/**
 * FeedbackDialog
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class FeedbackDialog extends BaseRenderer 
{
    public FeedbackDialog()
    {

    }

    /**
     * 默认不用填写，自动会创建确认和取消按钮。
     */
    public FeedbackDialog actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 内容区域
     */
    public FeedbackDialog body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public FeedbackDialog bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public FeedbackDialog className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否支持按 ESC 关闭 Dialog
     */
    public FeedbackDialog closeOnEsc(boolean value)
    {
        return set("closeOnEsc", value);
    }

    /**
     * 是否支持点其它区域关闭 Dialog
     */
    public FeedbackDialog closeOnOutside(boolean value)
    {
        return set("closeOnOutside", value);
    }

    /**
     * 影响自动生成的按钮，如果自己配置了按钮这个配置无效。
     */
    public FeedbackDialog confirm(boolean value)
    {
        return set("confirm", value);
    }

    /**
     * 是否禁用
     */
    public FeedbackDialog disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public FeedbackDialog disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public FeedbackDialog footer(Object value)
    {
        return set("footer", value);
    }

    public FeedbackDialog header(Object value)
    {
        return set("header", value);
    }

    public FeedbackDialog headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * Dialog 高度
     */
    public FeedbackDialog height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public FeedbackDialog hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public FeedbackDialog hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public FeedbackDialog id(Object value)
    {
        return set("id", value);
    }

    public FeedbackDialog name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public FeedbackDialog onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示关闭按钮
     */
    public FeedbackDialog showCloseButton(boolean value)
    {
        return set("showCloseButton", value);
    }

    /**
     * 是否显示错误信息
     */
    public FeedbackDialog showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * 是否显示 spinner
     */
    public FeedbackDialog showLoading(boolean value)
    {
        return set("showLoading", value);
    }

    /**
     * Dialog 大小 可选值: xs | sm | md | lg | xl | full
     */
    public FeedbackDialog size(Object value)
    {
        return set("size", value);
    }

    /**
     * feedback 弹框取消是否中断后续操作
     */
    public FeedbackDialog skipRestOnCancel(boolean value)
    {
        return set("skipRestOnCancel", value);
    }

    /**
     * feedback 弹框确认是否中断后续操作
     */
    public FeedbackDialog skipRestOnConfirm(boolean value)
    {
        return set("skipRestOnConfirm", value);
    }

    /**
     * 是否静态展示
     */
    public FeedbackDialog staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public FeedbackDialog staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public FeedbackDialog staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public FeedbackDialog staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public FeedbackDialog staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public FeedbackDialog staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public FeedbackDialog staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public FeedbackDialog style(Object value)
    {
        return set("style", value);
    }

    /**
     * 请通过配置 title 设置标题
     */
    public FeedbackDialog title(Object value)
    {
        return set("title", value);
    }

    /**
     * 是否显示
     */
    public FeedbackDialog visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 可以用来配置 feedback 的出现条件
     */
    public FeedbackDialog visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * Dialog 宽度
     */
    public FeedbackDialog width(Object value)
    {
        return set("width", value);
    }

    public FeedbackDialog set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
