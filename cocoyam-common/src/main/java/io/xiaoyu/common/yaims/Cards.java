package io.xiaoyu.common.yaims;



/**
 * Cards 卡片集合渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Cards extends BaseRenderer 
{
    public Cards()
    {
        set("type", "cards");

    }

    /**
     * 是否固顶
     */
    public Cards affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    public Cards card(Object value)
    {
        return set("card", value);
    }

    /**
     * 点击卡片的时候是否勾选卡片。
     */
    public Cards checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public Cards className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Cards disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Cards disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部区域
     */
    public Cards footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部 CSS 类名
     */
    public Cards footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 顶部区域
     */
    public Cards header(Object value)
    {
        return set("header", value);
    }

    /**
     * 头部 CSS 类名
     */
    public Cards headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Cards hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Cards hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public Cards hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Cards id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public Cards itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 卡片 CSS 类名
     */
    public Cards itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public Cards itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    public Cards loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 是否为瀑布流布局？
     */
    public Cards masonryLayout(boolean value)
    {
        return set("masonryLayout", value);
    }

    /**
     * 事件动作配置
     */
    public Cards onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 无数据提示
     */
    public Cards placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否显示底部
     */
    public Cards showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public Cards showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 数据源: 绑定当前环境变量
     */
    public Cards source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Cards staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Cards staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Cards staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Cards staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Cards staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Cards staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Cards staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Cards style(Object value)
    {
        return set("style", value);
    }

    /**
     * 标题
     */
    public Cards title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 cards 类型
     */
    public Cards type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public Cards valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public Cards visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Cards visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Cards set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
