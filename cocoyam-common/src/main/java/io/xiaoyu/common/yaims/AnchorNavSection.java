package io.xiaoyu.common.yaims;



/**
 * AnchorNavSection 锚点区域渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/anchor-nav
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class AnchorNavSection extends BaseRenderer 
{
    public AnchorNavSection()
    {

    }

    /**
     * 内容
     */
    public AnchorNavSection body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public AnchorNavSection className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public AnchorNavSection disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public AnchorNavSection disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public AnchorNavSection hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public AnchorNavSection hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 锚点链接
     */
    public AnchorNavSection href(Object value)
    {
        return set("href", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public AnchorNavSection id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public AnchorNavSection onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public AnchorNavSection staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public AnchorNavSection staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public AnchorNavSection staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public AnchorNavSection staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public AnchorNavSection staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public AnchorNavSection staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public AnchorNavSection staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public AnchorNavSection style(Object value)
    {
        return set("style", value);
    }

    /**
     * 导航文字说明
     */
    public AnchorNavSection title(Object value)
    {
        return set("title", value);
    }

    /**
     * 是否显示
     */
    public AnchorNavSection visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public AnchorNavSection visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public AnchorNavSection set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
