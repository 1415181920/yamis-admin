package io.xiaoyu.common.yaims;



/**
 * EmailAction
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class EmailAction extends BaseRenderer 
{
    public EmailAction()
    {
        set("type", "button");
        set("actionType", "email");

    }

    /**
     * 指定为打开邮箱行为
     */
    public EmailAction actionType(Object value)
    {
        return set("actionType", value);
    }

    /**
     * 激活状态时的类名
     */
    public EmailAction activeClassName(Object value)
    {
        return set("activeClassName", value);
    }

    /**
     * 激活状态时的样式
     */
    public EmailAction activeLevel(Object value)
    {
        return set("activeLevel", value);
    }

    /**
     * 角标
     */
    public EmailAction badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 匿名抄送邮箱
     */
    public EmailAction bcc(Object value)
    {
        return set("bcc", value);
    }

    /**
     * 是否为块状展示，默认为内联。
     */
    public EmailAction block(boolean value)
    {
        return set("block", value);
    }

    /**
     * 邮件正文
     */
    public EmailAction body(Object value)
    {
        return set("body", value);
    }

    /**
     * 抄送邮箱
     */
    public EmailAction cc(Object value)
    {
        return set("cc", value);
    }

    /**
     * 容器 css 类名
     */
    public EmailAction className(Object value)
    {
        return set("className", value);
    }

    /**
     * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
     */
    public EmailAction close(Object value)
    {
        return set("close", value);
    }

    /**
     * 提示文字，配置了操作前会要求用户确认。
     */
    public EmailAction confirmText(Object value)
    {
        return set("confirmText", value);
    }

    /**
     * 点击后的禁止倒计时（秒）
     */
    public EmailAction countDown(Object value)
    {
        return set("countDown", value);
    }

    /**
     * 倒计时文字自定义
     */
    public EmailAction countDownTpl(Object value)
    {
        return set("countDownTpl", value);
    }

    /**
     * 是否禁用
     */
    public EmailAction disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public EmailAction disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 禁用时的文案提示。
     */
    public EmailAction disabledTip(Object value)
    {
        return set("disabledTip", value);
    }

    /**
     * 是否隐藏
     */
    public EmailAction hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public EmailAction hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 键盘快捷键
     */
    public EmailAction hotKey(Object value)
    {
        return set("hotKey", value);
    }

    /**
     * 按钮图标， iconfont 的类名
     */
    public EmailAction icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * icon 上的css 类名
     */
    public EmailAction iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     * 主要用于用户行为跟踪里区分是哪个按钮
     */
    public EmailAction id(Object value)
    {
        return set("id", value);
    }

    /**
     * 按钮文字
     */
    public EmailAction label(Object value)
    {
        return set("label", value);
    }

    /**
     * 按钮样式 可选值: info | success | warning | danger | link | primary | dark | light | secondary
     */
    public EmailAction level(Object value)
    {
        return set("level", value);
    }

    /**
     * loading 上的css 类名
     */
    public EmailAction loadingClassName(Object value)
    {
        return set("loadingClassName", value);
    }

    /**
     * 是否显示loading效果
     */
    public EmailAction loadingOn(Object value)
    {
        return set("loadingOn", value);
    }

    /**
     * 是否将弹框中数据 merge 到父级作用域。
     */
    public EmailAction mergeData(boolean value)
    {
        return set("mergeData", value);
    }

    /**
     * 自定义事件处理函数
     */
    public EmailAction onClick(Object value)
    {
        return set("onClick", value);
    }

    /**
     * 事件动作配置
     */
    public EmailAction onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public EmailAction primary(boolean value)
    {
        return set("primary", value);
    }

    /**
     * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
     */
    public EmailAction requireSelected(boolean value)
    {
        return set("requireSelected", value);
    }

    /**
     * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
     */
    public EmailAction required(Object value)
    {
        return set("required", value);
    }

    /**
     * 右侧按钮图标， iconfont 的类名
     */
    public EmailAction rightIcon(Object value)
    {
        return set("rightIcon", value);
    }

    /**
     * 右侧 icon 上的 css 类名
     */
    public EmailAction rightIconClassName(Object value)
    {
        return set("rightIconClassName", value);
    }

    /**
     * 按钮大小 可选值: xs | sm | md | lg
     */
    public EmailAction size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public EmailAction staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public EmailAction staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public EmailAction staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public EmailAction staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public EmailAction staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public EmailAction staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public EmailAction staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public EmailAction style(Object value)
    {
        return set("style", value);
    }

    /**
     * 邮件主题
     */
    public EmailAction subject(Object value)
    {
        return set("subject", value);
    }

    /**
     * 可以指定让谁来触发这个动作。
     */
    public EmailAction target(Object value)
    {
        return set("target", value);
    }

    /**
     * 收件人邮箱
     */
    public EmailAction to(Object value)
    {
        return set("to", value);
    }

    public EmailAction tooltip(Object value)
    {
        return set("tooltip", value);
    }

    /**
     *  可选值: top | right | bottom | left
     */
    public EmailAction tooltipPlacement(Object value)
    {
        return set("tooltipPlacement", value);
    }

    /**
     * 指定按钮类型，支持 button、submit或者reset三种类型。 可选值: button | submit | reset
     */
    public EmailAction type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public EmailAction visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public EmailAction visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public EmailAction set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
