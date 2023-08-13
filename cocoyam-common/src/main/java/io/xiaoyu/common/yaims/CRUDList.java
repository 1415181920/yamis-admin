package io.xiaoyu.common.yaims;



/**
 * CRUDList
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUDList extends BaseRenderer 
{
    public CRUDList()
    {
        set("mode", "list");
        set("type", "crud");

    }

    /**
     * 是否固顶
     */
    public CRUDList affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
     */
    public CRUDList alwaysShowPagination(boolean value)
    {
        return set("alwaysShowPagination", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUDList api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUDList autoFillHeight(Object value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
     */
    public CRUDList autoGenerateFilter(Object value)
    {
        return set("autoGenerateFilter", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUDList autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    /**
     * 批量操作
     */
    public CRUDList bulkActions(Object value)
    {
        return set("bulkActions", value);
    }

    /**
     * 点击列表单行时，是否选择
     */
    public CRUDList checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUDList className(Object value)
    {
        return set("className", value);
    }

    /**
     * 可以默认给定初始参数如： {"perPage": 24}
     */
    public CRUDList defaultParams(Object value)
    {
        return set("defaultParams", value);
    }

    /**
     * 是否禁用
     */
    public CRUDList disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUDList disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可通过拖拽排序
     */
    public CRUDList draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否可通过拖拽排序，通过表达式来配置
     */
    public CRUDList draggableOn(Object value)
    {
        return set("draggableOn", value);
    }

    /**
     * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
     */
    public CRUDList expandConfig(Object value)
    {
        return set("expandConfig", value);
    }

    /**
     * 过滤器表单
     */
    public CRUDList filter(Object value)
    {
        return set("filter", value);
    }

    public CRUDList filterDefaultVisible(boolean value)
    {
        return set("filterDefaultVisible", value);
    }

    public CRUDList filterTogglable(boolean value)
    {
        return set("filterTogglable", value);
    }

    /**
     * 底部区域
     */
    public CRUDList footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部区域类名
     */
    public CRUDList footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 底部工具栏
     */
    public CRUDList footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部区域
     */
    public CRUDList header(Object value)
    {
        return set("header", value);
    }

    /**
     * 顶部区域类名
     */
    public CRUDList headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 顶部工具栏
     */
    public CRUDList headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUDList hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUDList hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public CRUDList hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUDList hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUDList id(Object value)
    {
        return set("id", value);
    }

    /**
     * 初始是否拉取
     */
    public CRUDList initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 初始是否拉取，用表达式来配置。
     */
    public CRUDList initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 配置内部 DOM 的 className
     */
    public CRUDList innerClassName(Object value)
    {
        return set("innerClassName", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUDList interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 点击列表项的行为
     */
    public CRUDList itemAction(Object value)
    {
        return set("itemAction", value);
    }

    /**
     * 单条操作
     */
    public CRUDList itemActions(Object value)
    {
        return set("itemActions", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public CRUDList itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public CRUDList itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    /**
     * 分页的时候是否保留用户选择。
     */
    public CRUDList keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
     */
    public CRUDList labelTpl(Object value)
    {
        return set("labelTpl", value);
    }

    /**
     * 单条数据展示内容配置
     */
    public CRUDList listItem(Object value)
    {
        return set("listItem", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUDList loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 在开启loadDataOnce时，filter时是否去重新请求api
     */
    public CRUDList loadDataOnceFetchOnFilter(boolean value)
    {
        return set("loadDataOnceFetchOnFilter", value);
    }

    public CRUDList loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public CRUDList messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUDList mode(Object value)
    {
        return set("mode", value);
    }

    public CRUDList name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUDList onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 默认排序字段
     */
    public CRUDList orderBy(Object value)
    {
        return set("orderBy", value);
    }

    /**
     * 默认排序方向 可选值: asc | desc
     */
    public CRUDList orderDir(Object value)
    {
        return set("orderDir", value);
    }

    /**
     * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
     */
    public CRUDList orderField(Object value)
    {
        return set("orderField", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUDList pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 每页个数，默认为 10，如果不是请设置。
     */
    public CRUDList perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
     */
    public CRUDList perPageAvailable(boolean value)
    {
        return set("perPageAvailable", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUDList perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 无数据提示
     */
    public CRUDList placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUDList quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUDList quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUDList saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否显示底部
     */
    public CRUDList showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public CRUDList showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 静默拉取
     */
    public CRUDList silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 大小 可选值: sm | base
     */
    public CRUDList size(Object value)
    {
        return set("size", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUDList source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUDList staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUDList staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUDList staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUDList staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUDList staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUDList staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUDList staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public CRUDList stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    public CRUDList stopAutoRefreshWhenModalIsOpen(boolean value)
    {
        return set("stopAutoRefreshWhenModalIsOpen", value);
    }

    /**
     * 组件样式
     */
    public CRUDList style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUDList syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUDList syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 标题
     */
    public CRUDList title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 CRUD 渲染器。
     */
    public CRUDList type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public CRUDList valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public CRUDList visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUDList visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUDList set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
