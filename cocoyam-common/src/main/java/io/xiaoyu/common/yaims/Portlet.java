package io.xiaoyu.common.yaims;



/**
 * Portlet
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Portlet extends BaseRenderer 
{
    public Portlet()
    {
        set("type", "portlet");

    }

    /**
     * 容器 css 类名
     */
    public Portlet className(Object value)
    {
        return set("className", value);
    }

    /**
     * 内容类名
     */
    public Portlet contentClassName(Object value)
    {
        return set("contentClassName", value);
    }

    /**
     * 标题右侧的描述
     */
    public Portlet description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public Portlet disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Portlet disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * header和内容是否展示分割线
     */
    public Portlet divider(boolean value)
    {
        return set("divider", value);
    }

    /**
     * 是否隐藏
     */
    public Portlet hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Portlet hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 隐藏头部
     */
    public Portlet hideHeader(boolean value)
    {
        return set("hideHeader", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Portlet id(Object value)
    {
        return set("id", value);
    }

    /**
     * 链接外层类名
     */
    public Portlet linksClassName(Object value)
    {
        return set("linksClassName", value);
    }

    /**
     * 卡片是否只有在点开的时候加载？
     */
    public Portlet mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 事件动作配置
     */
    public Portlet onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否支持溢出滚动
     */
    public Portlet scrollable(boolean value)
    {
        return set("scrollable", value);
    }

    /**
     * 关联已有数据，选项卡直接根据目标数据重复。
     */
    public Portlet source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Portlet staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Portlet staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Portlet staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Portlet staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Portlet staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Portlet staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Portlet staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Portlet style(Object value)
    {
        return set("style", value);
    }

    public Portlet tabs(Object value)
    {
        return set("tabs", value);
    }

    /**
     * 类名
     */
    public Portlet tabsClassName(Object value)
    {
        return set("tabsClassName", value);
    }

    /**
     * 展示形式 可选值:  | line | card | radio | vertical | tiled
     */
    public Portlet tabsMode(Object value)
    {
        return set("tabsMode", value);
    }

    /**
     * 可以在右侧配置点其他功能按钮。不会随着tab切换
     */
    public Portlet toolbar(Object value)
    {
        return set("toolbar", value);
    }

    /**
     * 指定为 portlet 类型
     */
    public Portlet type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片隐藏的时候是否销毁卡片内容
     */
    public Portlet unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 是否显示
     */
    public Portlet visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Portlet visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Portlet set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
