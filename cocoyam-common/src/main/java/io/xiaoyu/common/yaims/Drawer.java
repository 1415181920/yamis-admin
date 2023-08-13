package io.xiaoyu.common.yaims;



/**
 * Drawer 抽出式弹框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/drawer
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Drawer extends BaseRenderer 
{
    public Drawer()
    {
        set("type", "drawer");

    }

    /**
     * 默认不用填写，自动会创建确认和取消按钮。
     */
    public Drawer actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 内容区域
     */
    public Drawer body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public Drawer bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 配置 外层 className
     */
    public Drawer className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否支持按 ESC 关闭 Dialog
     */
    public Drawer closeOnEsc(boolean value)
    {
        return set("closeOnEsc", value);
    }

    /**
     * 点击外部的时候是否关闭弹框。
     */
    public Drawer closeOnOutside(boolean value)
    {
        return set("closeOnOutside", value);
    }

    /**
     * 影响自动生成的按钮，如果自己配置了按钮这个配置无效。
     */
    public Drawer confirm(boolean value)
    {
        return set("confirm", value);
    }

    /**
     * 是否禁用
     */
    public Drawer disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Drawer disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部
     */
    public Drawer footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 配置 头部 容器 className
     */
    public Drawer footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 头部
     */
    public Drawer header(Object value)
    {
        return set("header", value);
    }

    /**
     * 配置 头部 容器 className
     */
    public Drawer headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 抽屉的高度 （当position为top | bottom时生效）
     */
    public Drawer height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public Drawer hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Drawer hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Drawer id(Object value)
    {
        return set("id", value);
    }

    public Drawer name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Drawer onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示蒙层
     */
    public Drawer overlay(boolean value)
    {
        return set("overlay", value);
    }

    /**
     * 从什么位置弹出 可选值: left | right | top | bottom
     */
    public Drawer position(Object value)
    {
        return set("position", value);
    }

    /**
     * 是否可以拖动弹窗大小
     */
    public Drawer resizable(boolean value)
    {
        return set("resizable", value);
    }

    /**
     * 是否展示关闭按钮 当值为false时，默认开启closeOnOutside
     */
    public Drawer showCloseButton(boolean value)
    {
        return set("showCloseButton", value);
    }

    /**
     * 是否显示错误信息
     */
    public Drawer showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * Dialog 大小 可选值: xs | sm | md | lg | full
     */
    public Drawer size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Drawer staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Drawer staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Drawer staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Drawer staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Drawer staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Drawer staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Drawer staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Drawer style(Object value)
    {
        return set("style", value);
    }

    /**
     * 请通过配置 title 设置标题
     */
    public Drawer title(Object value)
    {
        return set("title", value);
    }

    public Drawer type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Drawer visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Drawer visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 抽屉的宽度 （当position为left | right时生效）
     */
    public Drawer width(Object value)
    {
        return set("width", value);
    }

    public Drawer set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
