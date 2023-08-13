package io.xiaoyu.common.yaims;



/**
 * 选项卡控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/tabs
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tabs extends BaseRenderer 
{
    public Tabs()
    {
        set("type", "tabs");

    }

    /**
     * 激活的选项卡，hash值或索引值，支持使用表达式
     */
    public Tabs activeKey(Object value)
    {
        return set("activeKey", value);
    }

    /**
     * 自定义增加按钮文案
     */
    public Tabs addBtnText(Object value)
    {
        return set("addBtnText", value);
    }

    /**
     * 是否支持新增
     */
    public Tabs addable(boolean value)
    {
        return set("addable", value);
    }

    /**
     * 容器 css 类名
     */
    public Tabs className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否支持删除
     */
    public Tabs closable(boolean value)
    {
        return set("closable", value);
    }

    /**
     * 折叠按钮文字
     */
    public Tabs collapseBtnLabel(Object value)
    {
        return set("collapseBtnLabel", value);
    }

    /**
     * 超过多少个时折叠按钮
     */
    public Tabs collapseOnExceed(Object value)
    {
        return set("collapseOnExceed", value);
    }

    /**
     * 内容类名
     */
    public Tabs contentClassName(Object value)
    {
        return set("contentClassName", value);
    }

    /**
     * 初始化激活的选项卡，hash值或索引值，支持使用表达式
     */
    public Tabs defaultKey(Object value)
    {
        return set("defaultKey", value);
    }

    /**
     * 是否禁用
     */
    public Tabs disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tabs disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否支持拖拽
     */
    public Tabs draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否可编辑标签名
     */
    public Tabs editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 是否隐藏
     */
    public Tabs hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tabs hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tabs id(Object value)
    {
        return set("id", value);
    }

    /**
     * 链接外层类名
     */
    public Tabs linksClassName(Object value)
    {
        return set("linksClassName", value);
    }

    /**
     * 卡片是否只有在点开的时候加载？
     */
    public Tabs mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 事件动作配置
     */
    public Tabs onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否导航支持内容溢出滚动。属性废弃，为了兼容暂且保留
     */
    public Tabs scrollable(boolean value)
    {
        return set("scrollable", value);
    }

    /**
     * 是否显示提示
     */
    public Tabs showTip(boolean value)
    {
        return set("showTip", value);
    }

    /**
     * tooltip 提示的类名
     */
    public Tabs showTipClassName(Object value)
    {
        return set("showTipClassName", value);
    }

    /**
     * 编辑器模式，侧边的位置 可选值: left | right
     */
    public Tabs sidePosition(Object value)
    {
        return set("sidePosition", value);
    }

    /**
     * 关联已有数据，选项卡直接根据目标数据重复。
     */
    public Tabs source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Tabs staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tabs staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tabs staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tabs staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tabs staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tabs staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tabs staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Tabs style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public Tabs subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public Tabs subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 选项卡成员。当配置了 source 时，选项卡成员，将会根据目标数据进行重复。
     */
    public Tabs tabs(Object value)
    {
        return set("tabs", value);
    }

    /**
     * 类名
     */
    public Tabs tabsClassName(Object value)
    {
        return set("tabsClassName", value);
    }

    /**
     * 展示形式
     */
    public Tabs tabsMode(Object value)
    {
        return set("tabsMode", value);
    }

    /**
     * 可以在右侧配置点其他功能按钮。
     */
    public Tabs toolbar(Object value)
    {
        return set("toolbar", value);
    }

    public Tabs type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片隐藏的时候是否销毁卡片内容
     */
    public Tabs unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 是否显示
     */
    public Tabs visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tabs visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Tabs set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
