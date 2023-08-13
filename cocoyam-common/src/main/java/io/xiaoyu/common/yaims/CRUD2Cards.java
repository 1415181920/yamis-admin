package io.xiaoyu.common.yaims;



/**
 * CRUD2Cards
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUD2Cards extends BaseRenderer 
{
    public CRUD2Cards()
    {
        set("mode", "cards");
        set("type", "crud2");

    }

    /**
     * 是否固顶
     */
    public CRUD2Cards affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUD2Cards api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUD2Cards autoFillHeight(boolean value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUD2Cards autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    public CRUD2Cards card(Object value)
    {
        return set("card", value);
    }

    /**
     * 点击卡片的时候是否勾选卡片。
     */
    public CRUD2Cards checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUD2Cards className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public CRUD2Cards disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUD2Cards disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 底部区域
     */
    public CRUD2Cards footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部 CSS 类名
     */
    public CRUD2Cards footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 底部区域
     */
    public CRUD2Cards footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部区域
     */
    public CRUD2Cards header(Object value)
    {
        return set("header", value);
    }

    /**
     * 头部 CSS 类名
     */
    public CRUD2Cards headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 顶部区域
     */
    public CRUD2Cards headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUD2Cards hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUD2Cards hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public CRUD2Cards hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUD2Cards hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUD2Cards id(Object value)
    {
        return set("id", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUD2Cards interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public CRUD2Cards itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 卡片 CSS 类名
     */
    public CRUD2Cards itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public CRUD2Cards itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    /**
     * 翻页时是否保留用户已选的数据
     */
    public CRUD2Cards keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUD2Cards loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 数据展示模式 无限加载 or 分页 可选值: more | pagination
     */
    public CRUD2Cards loadType(Object value)
    {
        return set("loadType", value);
    }

    public CRUD2Cards loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 是否为瀑布流布局？
     */
    public CRUD2Cards masonryLayout(boolean value)
    {
        return set("masonryLayout", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUD2Cards mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否可以多选数据，仅当selectable为 true 时生效
     */
    public CRUD2Cards multiple(boolean value)
    {
        return set("multiple", value);
    }

    public CRUD2Cards name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUD2Cards onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUD2Cards pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 无限加载时，根据此项设置其每页加载数量，可以不限制
     */
    public CRUD2Cards perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUD2Cards perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 无数据提示
     */
    public CRUD2Cards placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUD2Cards quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUD2Cards quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUD2Cards saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否可以选择数据，外部事件动作
     */
    public CRUD2Cards selectable(boolean value)
    {
        return set("selectable", value);
    }

    /**
     * 是否显示底部
     */
    public CRUD2Cards showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public CRUD2Cards showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 是否展示已选数据区域，仅当selectable为 true 时生效
     */
    public CRUD2Cards showSelection(boolean value)
    {
        return set("showSelection", value);
    }

    /**
     * 静默拉取
     */
    public CRUD2Cards silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUD2Cards source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUD2Cards staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUD2Cards staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUD2Cards staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUD2Cards staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUD2Cards staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUD2Cards staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUD2Cards staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public CRUD2Cards stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 组件样式
     */
    public CRUD2Cards style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUD2Cards syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUD2Cards syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 标题
     */
    public CRUD2Cards title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 CRUD2 渲染器。
     */
    public CRUD2Cards type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public CRUD2Cards valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public CRUD2Cards visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUD2Cards visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUD2Cards set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
