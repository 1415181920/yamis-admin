package io.xiaoyu.common.yaims;



/**
 * CRUD2Table
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class CRUD2Table extends BaseRenderer 
{
    public CRUD2Table()
    {
        set("type", "crud2");

    }

    /**
     * 操作列配置
     */
    public CRUD2Table actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 初始化数据 API
     */
    public CRUD2Table api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域占满屏幕剩余空间
     */
    public CRUD2Table autoFillHeight(boolean value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 是否自动跳顶部，当切分页的时候。
     */
    public CRUD2Table autoJumpToTopOnPagerChange(boolean value)
    {
        return set("autoJumpToTopOnPagerChange", value);
    }

    /**
     * 是否展示边框
     */
    public CRUD2Table bordered(boolean value)
    {
        return set("bordered", value);
    }

    /**
     * 数据源嵌套自定义字段名
     */
    public CRUD2Table childrenColumnName(Object value)
    {
        return set("childrenColumnName", value);
    }

    /**
     * 容器 css 类名
     */
    public CRUD2Table className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表格列配置
     */
    public CRUD2Table columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 表格可自定义列
     */
    public CRUD2Table columnsTogglable(boolean value)
    {
        return set("columnsTogglable", value);
    }

    /**
     * 是否禁用
     */
    public CRUD2Table disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public CRUD2Table disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 表格行可展开配置
     */
    public CRUD2Table expandable(boolean value)
    {
        return set("expandable", value);
    }

    /**
     * 指定表尾
     */
    public CRUD2Table footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 底部区域
     */
    public CRUD2Table footerToolbar(Object value)
    {
        return set("footerToolbar", value);
    }

    /**
     * 顶部区域
     */
    public CRUD2Table headerToolbar(Object value)
    {
        return set("headerToolbar", value);
    }

    /**
     * 是否隐藏
     */
    public CRUD2Table hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public CRUD2Table hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏快速编辑的按钮。
     */
    public CRUD2Table hideQuickSaveBtn(boolean value)
    {
        return set("hideQuickSaveBtn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public CRUD2Table id(Object value)
    {
        return set("id", value);
    }

    /**
     * 设置自动刷新时间
     */
    public CRUD2Table interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 行角标内容
     */
    public CRUD2Table itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 翻页时是否保留用户已选的数据
     */
    public CRUD2Table keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 嵌套展开记录的唯一标识
     */
    public CRUD2Table keyField(Object value)
    {
        return set("keyField", value);
    }

    /**
     * 是否固定内容行高度
     */
    public CRUD2Table lineHeight(Object value)
    {
        return set("lineHeight", value);
    }

    /**
     * 是否为前端单次加载模式，可以用来实现前端分页。
     */
    public CRUD2Table loadDataOnce(boolean value)
    {
        return set("loadDataOnce", value);
    }

    /**
     * 数据展示模式 无限加载 or 分页 可选值: more | pagination
     */
    public CRUD2Table loadType(Object value)
    {
        return set("loadType", value);
    }

    /**
     * 加载中
     */
    public CRUD2Table loading(Object value)
    {
        return set("loading", value);
    }

    public CRUD2Table loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 批量操作最大限制数
     */
    public CRUD2Table maxKeepItemSelectionLength(Object value)
    {
        return set("maxKeepItemSelectionLength", value);
    }

    /**
     * 接口报错信息配置
     */
    public CRUD2Table messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 指定内容区的展示模式。
     */
    public CRUD2Table mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否可以多选数据，仅当selectable为 true 时生效
     */
    public CRUD2Table multiple(boolean value)
    {
        return set("multiple", value);
    }

    public CRUD2Table name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public CRUD2Table onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 设置分页页码字段名。
     */
    public CRUD2Table pageField(Object value)
    {
        return set("pageField", value);
    }

    /**
     * 无限加载时，根据此项设置其每页加载数量，可以不限制
     */
    public CRUD2Table perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 设置分页一页显示的多少条数据的字段名。
     */
    public CRUD2Table perPageField(Object value)
    {
        return set("perPageField", value);
    }

    /**
     * 指定挂载dom
     */
    public CRUD2Table popOverContainer(Object value)
    {
        return set("popOverContainer", value);
    }

    /**
     * 快速编辑关键字段
     */
    public CRUD2Table primaryField(Object value)
    {
        return set("primaryField", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public CRUD2Table quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public CRUD2Table quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 重新加载的组件名称
     */
    public CRUD2Table reload(Object value)
    {
        return set("reload", value);
    }

    /**
     * 自定义行样式
     */
    public CRUD2Table rowClassNameExpr(Object value)
    {
        return set("rowClassNameExpr", value);
    }

    /**
     * 表格可选择配置
     */
    public CRUD2Table rowSelection(Object value)
    {
        return set("rowSelection", value);
    }

    /**
     * 保存排序的 api
     */
    public CRUD2Table saveOrderApi(Object value)
    {
        return set("saveOrderApi", value);
    }

    /**
     * 是否可以选择数据，外部事件动作
     */
    public CRUD2Table selectable(boolean value)
    {
        return set("selectable", value);
    }

    /**
     * 是否展示行角标
     */
    public CRUD2Table showBadge(boolean value)
    {
        return set("showBadge", value);
    }

    /**
     * 是否展示表头
     */
    public CRUD2Table showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 是否展示已选数据区域，仅当selectable为 true 时生效
     */
    public CRUD2Table showSelection(boolean value)
    {
        return set("showSelection", value);
    }

    /**
     * 静默拉取
     */
    public CRUD2Table silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 也可以直接从环境变量中读取，但是不太推荐。
     */
    public CRUD2Table source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public CRUD2Table staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public CRUD2Table staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public CRUD2Table staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public CRUD2Table staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public CRUD2Table staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public CRUD2Table staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public CRUD2Table staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 粘性头部
     */
    public CRUD2Table sticky(boolean value)
    {
        return set("sticky", value);
    }

    public CRUD2Table stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 组件样式
     */
    public CRUD2Table style(Object value)
    {
        return set("style", value);
    }

    /**
     * 是否将过滤条件的参数同步到地址栏,默认为true
     */
    public CRUD2Table syncLocation(boolean value)
    {
        return set("syncLocation", value);
    }

    /**
     * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
     */
    public CRUD2Table syncResponse2Query(boolean value)
    {
        return set("syncResponse2Query", value);
    }

    /**
     * 表格标题
     */
    public CRUD2Table title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 CRUD2 渲染器。
     */
    public CRUD2Table type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public CRUD2Table visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public CRUD2Table visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public CRUD2Table set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
