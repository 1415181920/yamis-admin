package io.xiaoyu.common.yaims;



/**
 * 栏目容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/portlet
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class PortletTab extends BaseRenderer 
{
    public PortletTab()
    {

    }

    /**
     * 内容
     */
    public PortletTab body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public PortletTab className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public PortletTab disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public PortletTab disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public PortletTab hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public PortletTab hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 按钮图标
     */
    public PortletTab icon(Object value)
    {
        return set("icon", value);
    }

    /**
     *  可选值: left | right
     */
    public PortletTab iconPosition(Object value)
    {
        return set("iconPosition", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public PortletTab id(Object value)
    {
        return set("id", value);
    }

    /**
     * 点开时才加载卡片内容
     */
    public PortletTab mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 事件动作配置
     */
    public PortletTab onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 设置以后内容每次都会重新渲染
     */
    public PortletTab reload(boolean value)
    {
        return set("reload", value);
    }

    /**
     * 是否静态展示
     */
    public PortletTab staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public PortletTab staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public PortletTab staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public PortletTab staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public PortletTab staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public PortletTab staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public PortletTab staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public PortletTab style(Object value)
    {
        return set("style", value);
    }

    /**
     * 内容
     */
    public PortletTab tab(Object value)
    {
        return set("tab", value);
    }

    /**
     * Tab 标题
     */
    public PortletTab title(Object value)
    {
        return set("title", value);
    }

    /**
     * 可以在右侧配置点其他功能按钮，随着tab切换而切换
     */
    public PortletTab toolbar(Object value)
    {
        return set("toolbar", value);
    }

    /**
     * 卡片隐藏就销毁卡片节点。
     */
    public PortletTab unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 是否显示
     */
    public PortletTab visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public PortletTab visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public PortletTab set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
