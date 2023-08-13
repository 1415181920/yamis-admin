package io.xiaoyu.common.yaims;



/**
 * Spinner
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Spinner extends BaseRenderer 
{
    public Spinner()
    {
        set("type", "spinner");

    }

    /**
     * 作为容器使用时内容
     */
    public Spinner body(Object value)
    {
        return set("body", value);
    }

    /**
     * 自定义spinner的class
     */
    public Spinner className(Object value)
    {
        return set("className", value);
    }

    /**
     * 延迟显示
     */
    public Spinner delay(Object value)
    {
        return set("delay", value);
    }

    /**
     * 是否禁用
     */
    public Spinner disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Spinner disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Spinner hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Spinner hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 自定义icon
     */
    public Spinner icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Spinner id(Object value)
    {
        return set("id", value);
    }

    public Spinner loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public Spinner mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 事件动作配置
     */
    public Spinner onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否显示遮罩层
     */
    public Spinner overlay(boolean value)
    {
        return set("overlay", value);
    }

    /**
     * 控制Spinner显示与隐藏
     */
    public Spinner show(boolean value)
    {
        return set("show", value);
    }

    /**
     * spinner Icon 大小 可选值: sm | lg | 
     */
    public Spinner size(Object value)
    {
        return set("size", value);
    }

    /**
     * spin图标位置包裹元素的自定义class
     */
    public Spinner spinnerClassName(Object value)
    {
        return set("spinnerClassName", value);
    }

    /**
     * 作为容器使用时最外层元素的class
     */
    public Spinner spinnerWrapClassName(Object value)
    {
        return set("spinnerWrapClassName", value);
    }

    /**
     * 是否静态展示
     */
    public Spinner staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Spinner staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Spinner staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Spinner staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Spinner staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Spinner staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Spinner staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Spinner style(Object value)
    {
        return set("style", value);
    }

    /**
     * spinner文案
     */
    public Spinner tip(Object value)
    {
        return set("tip", value);
    }

    /**
     * spinner文案位置 可选值: top | right | bottom | left
     */
    public Spinner tipPlacement(Object value)
    {
        return set("tipPlacement", value);
    }

    /**
     * 组件类型
     */
    public Spinner type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Spinner visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Spinner visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Spinner set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
