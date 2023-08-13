package io.xiaoyu.common.yaims;



/**
 * 下拉按钮渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/dropdown-button
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class DropdownButton extends BaseRenderer 
{
    public DropdownButton()
    {
        set("type", "dropdown-button");

    }

    /**
     * 对齐方式 可选值: left | right
     */
    public DropdownButton align(Object value)
    {
        return set("align", value);
    }

    /**
     * 是否独占一行 `display: block`
     */
    public DropdownButton block(boolean value)
    {
        return set("block", value);
    }

    /**
     * 给 Button 配置 className。
     */
    public DropdownButton btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 按钮集合，支持分组
     */
    public DropdownButton buttons(Object value)
    {
        return set("buttons", value);
    }

    /**
     * 容器 css 类名
     */
    public DropdownButton className(Object value)
    {
        return set("className", value);
    }

    /**
     * 点击内容是否关闭
     */
    public DropdownButton closeOnClick(boolean value)
    {
        return set("closeOnClick", value);
    }

    /**
     * 点击外部是否关闭
     */
    public DropdownButton closeOnOutside(boolean value)
    {
        return set("closeOnOutside", value);
    }

    /**
     * 是否禁用
     */
    public DropdownButton disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public DropdownButton disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public DropdownButton hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public DropdownButton hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否显示下拉按钮
     */
    public DropdownButton hideCaret(boolean value)
    {
        return set("hideCaret", value);
    }

    /**
     * 是否只显示图标。
     */
    public DropdownButton iconOnly(boolean value)
    {
        return set("iconOnly", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public DropdownButton id(Object value)
    {
        return set("id", value);
    }

    /**
     * 按钮文字
     */
    public DropdownButton label(Object value)
    {
        return set("label", value);
    }

    /**
     * 按钮级别，样式 可选值: info | success | danger | warning | primary | link
     */
    public DropdownButton level(Object value)
    {
        return set("level", value);
    }

    /**
     * 菜单 CSS 样式
     */
    public DropdownButton menuClassName(Object value)
    {
        return set("menuClassName", value);
    }

    /**
     * 事件动作配置
     */
    public DropdownButton onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public DropdownButton overlayPlacement(Object value)
    {
        return set("overlayPlacement", value);
    }

    /**
     * 右侧图标
     */
    public DropdownButton rightIcon(Object value)
    {
        return set("rightIcon", value);
    }

    /**
     * 按钮大小 可选值: xs | sm | md | lg
     */
    public DropdownButton size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public DropdownButton staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public DropdownButton staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public DropdownButton staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public DropdownButton staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public DropdownButton staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public DropdownButton staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public DropdownButton staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public DropdownButton style(Object value)
    {
        return set("style", value);
    }

    /**
     * 触发条件，默认是 click 可选值: click | hover
     */
    public DropdownButton trigger(Object value)
    {
        return set("trigger", value);
    }

    /**
     * 指定为 DropDown Button 类型
     */
    public DropdownButton type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public DropdownButton visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public DropdownButton visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public DropdownButton set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
