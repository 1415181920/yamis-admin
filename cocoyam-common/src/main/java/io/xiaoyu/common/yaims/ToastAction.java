package io.xiaoyu.common.yaims;



/**
 * ToastAction
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ToastAction extends BaseRenderer 
{
    public ToastAction()
    {
        set("type", "button");
        set("actionType", "toast");

    }

    /**
     * 指定为打开弹窗，抽出式弹窗
     */
    public ToastAction actionType(Object value)
    {
        return set("actionType", value);
    }

    /**
     * 激活状态时的类名
     */
    public ToastAction activeClassName(Object value)
    {
        return set("activeClassName", value);
    }

    /**
     * 激活状态时的样式
     */
    public ToastAction activeLevel(Object value)
    {
        return set("activeLevel", value);
    }

    /**
     * 角标
     */
    public ToastAction badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 是否为块状展示，默认为内联。
     */
    public ToastAction block(boolean value)
    {
        return set("block", value);
    }

    /**
     * 子内容
     */
    public ToastAction body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public ToastAction className(Object value)
    {
        return set("className", value);
    }

    /**
     * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
     */
    public ToastAction close(Object value)
    {
        return set("close", value);
    }

    /**
     * 提示文字，配置了操作前会要求用户确认。
     */
    public ToastAction confirmText(Object value)
    {
        return set("confirmText", value);
    }

    /**
     * 点击后的禁止倒计时（秒）
     */
    public ToastAction countDown(Object value)
    {
        return set("countDown", value);
    }

    /**
     * 倒计时文字自定义
     */
    public ToastAction countDownTpl(Object value)
    {
        return set("countDownTpl", value);
    }

    /**
     * 是否禁用
     */
    public ToastAction disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ToastAction disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 禁用时的文案提示。
     */
    public ToastAction disabledTip(Object value)
    {
        return set("disabledTip", value);
    }

    /**
     * 是否隐藏
     */
    public ToastAction hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ToastAction hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 键盘快捷键
     */
    public ToastAction hotKey(Object value)
    {
        return set("hotKey", value);
    }

    /**
     * 按钮图标， iconfont 的类名
     */
    public ToastAction icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * icon 上的css 类名
     */
    public ToastAction iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     * 主要用于用户行为跟踪里区分是哪个按钮
     */
    public ToastAction id(Object value)
    {
        return set("id", value);
    }

    /**
     * 按钮文字
     */
    public ToastAction label(Object value)
    {
        return set("label", value);
    }

    /**
     * 按钮样式 可选值: info | success | warning | danger | link | primary | dark | light | secondary
     */
    public ToastAction level(Object value)
    {
        return set("level", value);
    }

    /**
     * loading 上的css 类名
     */
    public ToastAction loadingClassName(Object value)
    {
        return set("loadingClassName", value);
    }

    /**
     * 是否显示loading效果
     */
    public ToastAction loadingOn(Object value)
    {
        return set("loadingOn", value);
    }

    /**
     * 是否将弹框中数据 merge 到父级作用域。
     */
    public ToastAction mergeData(boolean value)
    {
        return set("mergeData", value);
    }

    /**
     * 自定义事件处理函数
     */
    public ToastAction onClick(Object value)
    {
        return set("onClick", value);
    }

    /**
     * 事件动作配置
     */
    public ToastAction onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public ToastAction primary(boolean value)
    {
        return set("primary", value);
    }

    /**
     * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
     */
    public ToastAction requireSelected(boolean value)
    {
        return set("requireSelected", value);
    }

    /**
     * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
     */
    public ToastAction required(Object value)
    {
        return set("required", value);
    }

    /**
     * 右侧按钮图标， iconfont 的类名
     */
    public ToastAction rightIcon(Object value)
    {
        return set("rightIcon", value);
    }

    /**
     * 右侧 icon 上的 css 类名
     */
    public ToastAction rightIconClassName(Object value)
    {
        return set("rightIconClassName", value);
    }

    /**
     * 按钮大小 可选值: xs | sm | md | lg
     */
    public ToastAction size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public ToastAction staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ToastAction staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ToastAction staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ToastAction staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ToastAction staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ToastAction staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ToastAction staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ToastAction style(Object value)
    {
        return set("style", value);
    }

    /**
     * 可以指定让谁来触发这个动作。
     */
    public ToastAction target(Object value)
    {
        return set("target", value);
    }

    /**
     * 轻提示详情 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/toast
     */
    public ToastAction toast(Object value)
    {
        return set("toast", value);
    }

    public ToastAction tooltip(Object value)
    {
        return set("tooltip", value);
    }

    /**
     *  可选值: top | right | bottom | left
     */
    public ToastAction tooltipPlacement(Object value)
    {
        return set("tooltipPlacement", value);
    }

    /**
     * 指定按钮类型，支持 button、submit或者reset三种类型。 可选值: button | submit | reset
     */
    public ToastAction type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public ToastAction visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ToastAction visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public ToastAction set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
