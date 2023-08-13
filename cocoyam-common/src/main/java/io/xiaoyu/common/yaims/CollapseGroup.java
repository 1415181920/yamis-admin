package io.xiaoyu.common.yaims;



/**
 * CollapseGroup 折叠渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/collapse
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CollapseGroup extends BaseRenderer 
{
    public CollapseGroup()
    {
        set("type", "collapse-group");

    }

    /**
     * 手风琴模式
     */
    public CollapseGroup accordion(boolean value)
    {
        return set("accordion", value);
    }

    /**
     * 激活面板
     */
    public CollapseGroup activeKey(Object value)
    {
        return set("activeKey", value);
    }

    /**
     * 内容区域
     */
    public CollapseGroup body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public CollapseGroup className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public CollapseGroup disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CollapseGroup disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 自定义切换图标
     */
    public CollapseGroup expandIcon(Object value)
    {
        return set("expandIcon", value);
    }

    /**
     * 设置图标位置 可选值: left | right
     */
    public CollapseGroup expandIconPosition(Object value)
    {
        return set("expandIconPosition", value);
    }

    /**
     * 是否隐藏
     */
    public CollapseGroup hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CollapseGroup hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CollapseGroup id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public CollapseGroup onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public CollapseGroup staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CollapseGroup staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CollapseGroup staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CollapseGroup staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CollapseGroup staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CollapseGroup staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CollapseGroup staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public CollapseGroup style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为折叠器类型
     */
    public CollapseGroup type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public CollapseGroup visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CollapseGroup visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CollapseGroup set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
