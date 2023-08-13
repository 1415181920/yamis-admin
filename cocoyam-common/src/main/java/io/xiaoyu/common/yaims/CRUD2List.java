package io.xiaoyu.common.yaims;



/**
 * CRUD2List
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUD2List extends BaseRenderer 
{
    public CRUD2List()
    {
        set("mode", "list");
        set("type", "crud2");

    }

    /**
     * 是否固顶
     */
    public CRUD2List affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUD2List api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUD2List autoFillHeight(boolean value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUD2List autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    /**
     * 点击列表单行时，是否选择
     */
    public CRUD2List checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUD2List className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public CRUD2List disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUD2List disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部区域
     */
    public CRUD2List footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部区域类名
     */
    public CRUD2List footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 底部区域
     */
    public CRUD2List footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部区域
     */
    public CRUD2List header(Object value)
    {
        return set("header", value);
    }

    /**
     * 顶部区域类名
     */
    public CRUD2List headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 顶部区域
     */
    public CRUD2List headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUD2List hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUD2List hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public CRUD2List hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUD2List hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUD2List id(Object value)
    {
        return set("id", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUD2List interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 点击列表项的行为
     */
    public CRUD2List itemAction(Object value)
    {
        return set("itemAction", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public CRUD2List itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public CRUD2List itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    /**
     * 翻页时是否保留用户已选的数据
     */
    public CRUD2List keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 单条数据展示内容配置
     */
    public CRUD2List listItem(Object value)
    {
        return set("listItem", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUD2List loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 数据展示模式 无限加载 or 分页 可选值: more | pagination
     */
    public CRUD2List loadType(Object value)
    {
        return set("loadType", value);
    }

    public CRUD2List loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUD2List mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否可以多选数据，仅当selectable为 true 时生效
     */
    public CRUD2List multiple(boolean value)
    {
        return set("multiple", value);
    }

    public CRUD2List name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUD2List onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUD2List pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 无限加载时，根据此项设置其每页加载数量，可以不限制
     */
    public CRUD2List perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUD2List perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 无数据提示
     */
    public CRUD2List placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUD2List quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUD2List quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUD2List saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否可以选择数据，外部事件动作
     */
    public CRUD2List selectable(boolean value)
    {
        return set("selectable", value);
    }

    /**
     * 是否显示底部
     */
    public CRUD2List showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public CRUD2List showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 是否展示已选数据区域，仅当selectable为 true 时生效
     */
    public CRUD2List showSelection(boolean value)
    {
        return set("showSelection", value);
    }

    /**
     * 静默拉取
     */
    public CRUD2List silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 大小 可选值: sm | base
     */
    public CRUD2List size(Object value)
    {
        return set("size", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUD2List source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUD2List staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUD2List staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUD2List staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUD2List staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUD2List staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUD2List staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUD2List staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public CRUD2List stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 组件样式
     */
    public CRUD2List style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUD2List syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUD2List syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 标题
     */
    public CRUD2List title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 CRUD2 渲染器。
     */
    public CRUD2List type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public CRUD2List valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public CRUD2List visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUD2List visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUD2List set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
