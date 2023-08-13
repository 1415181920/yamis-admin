package io.xiaoyu.common.yaims;



/**
 * Nav 导航渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/nav
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Nav extends BaseRenderer 
{
    public Nav()
    {
        set("type", "nav");

    }

    /**
     * 角标
     */
    public Nav badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 容器 css 类名
     */
    public Nav className(Object value)
    {
        return set("className", value);
    }

    /**
     * 控制仅展示指定key菜单下的子菜单项
     */
    public Nav collapsed(boolean value)
    {
        return set("collapsed", value);
    }

    /**
     * 默认展开层级 小于等于该层数的节点默认全部打开
     */
    public Nav defaultOpenLevel(Object value)
    {
        return set("defaultOpenLevel", value);
    }

    /**
     * 懒加载 api，如果不配置复用 source 接口。
     */
    public Nav deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 是否禁用
     */
    public Nav disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Nav disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 仅允许同层级拖拽
     */
    public Nav dragOnSameLevel(boolean value)
    {
        return set("dragOnSameLevel", value);
    }

    /**
     * 可拖拽
     */
    public Nav draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 自定义展开图标
     */
    public Nav expandIcon(Object value)
    {
        return set("expandIcon", value);
    }

    /**
     * 自定义展开图标位置 默认在前面 before after
     */
    public Nav expandPosition(Object value)
    {
        return set("expandPosition", value);
    }

    /**
     * 是否隐藏
     */
    public Nav hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Nav hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Nav id(Object value)
    {
        return set("id", value);
    }

    public Nav indentSize(Object value)
    {
        return set("indentSize", value);
    }

    /**
     * 更多操作菜单列表
     */
    public Nav itemActions(Object value)
    {
        return set("itemActions", value);
    }

    /**
     * 角标
     */
    public Nav itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 最多展示多少层级
     */
    public Nav level(Object value)
    {
        return set("level", value);
    }

    /**
     * 链接地址集合
     */
    public Nav links(Object value)
    {
        return set("links", value);
    }

    /**
     * 垂直模式 非折叠状态下 控制菜单打开方式 可选值: float | inline
     */
    public Nav mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 事件动作配置
     */
    public Nav onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 横向导航时自动收纳配置
     */
    public Nav overflow(Object value)
    {
        return set("overflow", value);
    }

    /**
     * 保存排序的 api
     */
    public Nav saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 控制仅展示指定key菜单下的子菜单项
     */
    public Nav showKey(Object value)
    {
        return set("showKey", value);
    }

    /**
     * 可以通过 API 拉取。
     */
    public Nav source(Object value)
    {
        return set("source", value);
    }

    /**
     * true 为垂直排列，false 为水平排列类似如 tabs。 可选值: 1 | 
     */
    public Nav stacked(boolean value)
    {
        return set("stacked", value);
    }

    /**
     * 是否静态展示
     */
    public Nav staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Nav staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Nav staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Nav staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Nav staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Nav staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Nav staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Nav style(Object value)
    {
        return set("style", value);
    }

    /**
     * 主题配色 默认light 可选值: light | dark
     */
    public Nav themeColor(Object value)
    {
        return set("themeColor", value);
    }

    /**
     * 指定为 Nav 导航渲染器
     */
    public Nav type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Nav visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Nav visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Nav set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
