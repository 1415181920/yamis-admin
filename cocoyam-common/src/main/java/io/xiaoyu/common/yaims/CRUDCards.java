package io.xiaoyu.common.yaims;



/**
 * CRUDCards
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUDCards extends BaseRenderer 
{
    public CRUDCards()
    {
        set("mode", "cards");
        set("type", "crud");

    }

    /**
     * 是否固顶
     */
    public CRUDCards affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
     */
    public CRUDCards alwaysShowPagination(boolean value)
    {
        return set("alwaysShowPagination", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUDCards api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUDCards autoFillHeight(Object value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
     */
    public CRUDCards autoGenerateFilter(Object value)
    {
        return set("autoGenerateFilter", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUDCards autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    /**
     * 批量操作
     */
    public CRUDCards bulkActions(Object value)
    {
        return set("bulkActions", value);
    }

    public CRUDCards card(Object value)
    {
        return set("card", value);
    }

    /**
     * 点击卡片的时候是否勾选卡片。
     */
    public CRUDCards checkOnItemClick(boolean value)
    {
        return set("checkOnItemClick", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUDCards className(Object value)
    {
        return set("className", value);
    }

    /**
     * 可以默认给定初始参数如： {"perPage": 24}
     */
    public CRUDCards defaultParams(Object value)
    {
        return set("defaultParams", value);
    }

    /**
     * 是否禁用
     */
    public CRUDCards disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUDCards disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可通过拖拽排序
     */
    public CRUDCards draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否可通过拖拽排序，通过表达式来配置
     */
    public CRUDCards draggableOn(Object value)
    {
        return set("draggableOn", value);
    }

    /**
     * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
     */
    public CRUDCards expandConfig(Object value)
    {
        return set("expandConfig", value);
    }

    /**
     * 过滤器表单
     */
    public CRUDCards filter(Object value)
    {
        return set("filter", value);
    }

    public CRUDCards filterDefaultVisible(boolean value)
    {
        return set("filterDefaultVisible", value);
    }

    public CRUDCards filterTogglable(boolean value)
    {
        return set("filterTogglable", value);
    }

    /**
     * 底部区域
     */
    public CRUDCards footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部 CSS 类名
     */
    public CRUDCards footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 底部工具栏
     */
    public CRUDCards footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部区域
     */
    public CRUDCards header(Object value)
    {
        return set("header", value);
    }

    /**
     * 头部 CSS 类名
     */
    public CRUDCards headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 顶部工具栏
     */
    public CRUDCards headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUDCards hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUDCards hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏勾选框
     */
    public CRUDCards hideCheckToggler(boolean value)
    {
        return set("hideCheckToggler", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUDCards hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUDCards id(Object value)
    {
        return set("id", value);
    }

    /**
     * 初始是否拉取
     */
    public CRUDCards initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 初始是否拉取，用表达式来配置。
     */
    public CRUDCards initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 配置内部 DOM 的 className
     */
    public CRUDCards innerClassName(Object value)
    {
        return set("innerClassName", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUDCards interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 单条操作
     */
    public CRUDCards itemActions(Object value)
    {
        return set("itemActions", value);
    }

    /**
     * 配置某项是否可以点选
     */
    public CRUDCards itemCheckableOn(Object value)
    {
        return set("itemCheckableOn", value);
    }

    /**
     * 卡片 CSS 类名
     */
    public CRUDCards itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 配置某项是否可拖拽排序，前提是要开启拖拽功能
     */
    public CRUDCards itemDraggableOn(Object value)
    {
        return set("itemDraggableOn", value);
    }

    /**
     * 分页的时候是否保留用户选择。
     */
    public CRUDCards keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
     */
    public CRUDCards labelTpl(Object value)
    {
        return set("labelTpl", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUDCards loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 在开启loadDataOnce时，filter时是否去重新请求api
     */
    public CRUDCards loadDataOnceFetchOnFilter(boolean value)
    {
        return set("loadDataOnceFetchOnFilter", value);
    }

    public CRUDCards loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 是否为瀑布流布局？
     */
    public CRUDCards masonryLayout(boolean value)
    {
        return set("masonryLayout", value);
    }

    public CRUDCards messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUDCards mode(Object value)
    {
        return set("mode", value);
    }

    public CRUDCards name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUDCards onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 默认排序字段
     */
    public CRUDCards orderBy(Object value)
    {
        return set("orderBy", value);
    }

    /**
     * 默认排序方向 可选值: asc | desc
     */
    public CRUDCards orderDir(Object value)
    {
        return set("orderDir", value);
    }

    /**
     * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
     */
    public CRUDCards orderField(Object value)
    {
        return set("orderField", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUDCards pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 每页个数，默认为 10，如果不是请设置。
     */
    public CRUDCards perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
     */
    public CRUDCards perPageAvailable(boolean value)
    {
        return set("perPageAvailable", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUDCards perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 无数据提示
     */
    public CRUDCards placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUDCards quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUDCards quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUDCards saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否显示底部
     */
    public CRUDCards showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public CRUDCards showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 静默拉取
     */
    public CRUDCards silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUDCards source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUDCards staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUDCards staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUDCards staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUDCards staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUDCards staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUDCards staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUDCards staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public CRUDCards stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    public CRUDCards stopAutoRefreshWhenModalIsOpen(boolean value)
    {
        return set("stopAutoRefreshWhenModalIsOpen", value);
    }

    /**
     * 组件样式
     */
    public CRUDCards style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUDCards syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUDCards syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 标题
     */
    public CRUDCards title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 CRUD 渲染器。
     */
    public CRUDCards type(Object value)
    {
        return set("type", value);
    }

    /**
     * 可以用来作为值的字段
     */
    public CRUDCards valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public CRUDCards visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUDCards visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUDCards set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
