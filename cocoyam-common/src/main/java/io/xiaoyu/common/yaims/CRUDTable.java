package io.xiaoyu.common.yaims;



/**
 * CRUDTable
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUDTable extends BaseRenderer 
{
    public CRUDTable()
    {
        set("type", "crud");

    }

    /**
     * 是否固定表头
     */
    public CRUDTable affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 底部总结行
     */
    public CRUDTable affixRow(Object value)
    {
        return set("affixRow", value);
    }

    /**
     * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
     */
    public CRUDTable alwaysShowPagination(boolean value)
    {
        return set("alwaysShowPagination", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUDTable api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUDTable autoFillHeight(Object value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
     */
    public CRUDTable autoGenerateFilter(Object value)
    {
        return set("autoGenerateFilter", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUDTable autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    /**
     * 批量操作
     */
    public CRUDTable bulkActions(Object value)
    {
        return set("bulkActions", value);
    }

    /**
     * 表格是否可以获取父级数据域值，默认为false
     */
    public CRUDTable canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUDTable className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表格的列信息
     */
    public CRUDTable columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
     */
    public CRUDTable columnsTogglable(boolean value)
    {
        return set("columnsTogglable", value);
    }

    /**
     * 合并单元格配置，配置从第几列开始合并。
     */
    public CRUDTable combineFromIndex(Object value)
    {
        return set("combineFromIndex", value);
    }

    /**
     * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
     */
    public CRUDTable combineNum(Object value)
    {
        return set("combineNum", value);
    }

    /**
     * 设置数据
     */
    public CRUDTable data(Object value)
    {
        return set("data", value);
    }

    /**
     * 可以默认给定初始参数如： {"perPage": 24}
     */
    public CRUDTable defaultParams(Object value)
    {
        return set("defaultParams", value);
    }

    /**
     * 是否禁用
     */
    public CRUDTable disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUDTable disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可通过拖拽排序
     */
    public CRUDTable draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否可通过拖拽排序，通过表达式来配置
     */
    public CRUDTable draggableOn(Object value)
    {
        return set("draggableOn", value);
    }

    /**
     * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
     */
    public CRUDTable expandConfig(Object value)
    {
        return set("expandConfig", value);
    }

    /**
     * 过滤器表单
     */
    public CRUDTable filter(Object value)
    {
        return set("filter", value);
    }

    public CRUDTable filterDefaultVisible(boolean value)
    {
        return set("filterDefaultVisible", value);
    }

    public CRUDTable filterTogglable(boolean value)
    {
        return set("filterTogglable", value);
    }

    /**
     * 是否开启底部展示功能，适合移动端展示
     */
    public CRUDTable footable(boolean value)
    {
        return set("footable", value);
    }

    /**
     * 底部外层 CSS 类名
     */
    public CRUDTable footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 底部工具栏
     */
    public CRUDTable footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部外层 CSS 类名
     */
    public CRUDTable headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 顶部工具栏
     */
    public CRUDTable headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUDTable hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUDTable hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUDTable hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUDTable id(Object value)
    {
        return set("id", value);
    }

    /**
     * 初始是否拉取
     */
    public CRUDTable initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 初始是否拉取，用表达式来配置。
     */
    public CRUDTable initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 配置内部 DOM 的 className
     */
    public CRUDTable innerClassName(Object value)
    {
        return set("innerClassName", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUDTable interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 单条操作
     */
    public CRUDTable itemActions(Object value)
    {
        return set("itemActions", value);
    }

    /**
     * 行角标
     */
    public CRUDTable itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 分页的时候是否保留用户选择。
     */
    public CRUDTable keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
     */
    public CRUDTable labelTpl(Object value)
    {
        return set("labelTpl", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUDTable loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 在开启loadDataOnce时，filter时是否去重新请求api
     */
    public CRUDTable loadDataOnceFetchOnFilter(boolean value)
    {
        return set("loadDataOnceFetchOnFilter", value);
    }

    public CRUDTable loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public CRUDTable messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUDTable mode(Object value)
    {
        return set("mode", value);
    }

    public CRUDTable name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUDTable onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 默认排序字段
     */
    public CRUDTable orderBy(Object value)
    {
        return set("orderBy", value);
    }

    /**
     * 默认排序方向 可选值: asc | desc
     */
    public CRUDTable orderDir(Object value)
    {
        return set("orderDir", value);
    }

    /**
     * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
     */
    public CRUDTable orderField(Object value)
    {
        return set("orderField", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUDTable pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 每页个数，默认为 10，如果不是请设置。
     */
    public CRUDTable perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
     */
    public CRUDTable perPageAvailable(boolean value)
    {
        return set("perPageAvailable", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUDTable perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 占位符
     */
    public CRUDTable placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 顶部总结行
     */
    public CRUDTable prefixRow(Object value)
    {
        return set("prefixRow", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUDTable quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUDTable quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 是否可调整列宽
     */
    public CRUDTable resizable(boolean value)
    {
        return set("resizable", value);
    }

    /**
     * 行样式表表达式
     */
    public CRUDTable rowClassNameExpr(Object value)
    {
        return set("rowClassNameExpr", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUDTable saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否显示底部
     */
    public CRUDTable showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public CRUDTable showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 静默拉取
     */
    public CRUDTable silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUDTable source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUDTable staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUDTable staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUDTable staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUDTable staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUDTable staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUDTable staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUDTable staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public CRUDTable stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    public CRUDTable stopAutoRefreshWhenModalIsOpen(boolean value)
    {
        return set("stopAutoRefreshWhenModalIsOpen", value);
    }

    /**
     * 组件样式
     */
    public CRUDTable style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUDTable syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUDTable syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 表格 CSS 类名
     */
    public CRUDTable tableClassName(Object value)
    {
        return set("tableClassName", value);
    }

    /**
     * 标题
     */
    public CRUDTable title(Object value)
    {
        return set("title", value);
    }

    /**
     * 工具栏 CSS 类名
     */
    public CRUDTable toolbarClassName(Object value)
    {
        return set("toolbarClassName", value);
    }

    /**
     * 指定为 CRUD 渲染器。
     */
    public CRUDTable type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public CRUDTable visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUDTable visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUDTable set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
