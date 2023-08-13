package io.xiaoyu.common.yaims;



/**
 * TableSchema2
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TableSchema2 extends BaseRenderer 
{
    public TableSchema2()
    {
        set("type", "table2");

    }

    /**
     * 操作列配置
     */
    public TableSchema2 actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 是否展示边框
     */
    public TableSchema2 bordered(boolean value)
    {
        return set("bordered", value);
    }

    /**
     * 数据源嵌套自定义字段名
     */
    public TableSchema2 childrenColumnName(Object value)
    {
        return set("childrenColumnName", value);
    }

    /**
     * 容器 css 类名
     */
    public TableSchema2 className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表格列配置
     */
    public TableSchema2 columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 表格可自定义列
     */
    public TableSchema2 columnsTogglable(boolean value)
    {
        return set("columnsTogglable", value);
    }

    /**
     * 是否禁用
     */
    public TableSchema2 disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TableSchema2 disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 表格行可展开配置
     */
    public TableSchema2 expandable(boolean value)
    {
        return set("expandable", value);
    }

    /**
     * 指定表尾
     */
    public TableSchema2 footer(Object value)
    {
        return set("footer", value);
    }

    /**
     * 是否隐藏
     */
    public TableSchema2 hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TableSchema2 hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TableSchema2 id(Object value)
    {
        return set("id", value);
    }

    /**
     * 行角标内容
     */
    public TableSchema2 itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 翻页是否保存数据
     */
    public TableSchema2 keepItemSelectionOnPageChange(boolean value)
    {
        return set("keepItemSelectionOnPageChange", value);
    }

    /**
     * 嵌套展开记录的唯一标识
     */
    public TableSchema2 keyField(Object value)
    {
        return set("keyField", value);
    }

    /**
     * 是否固定内容行高度
     */
    public TableSchema2 lineHeight(Object value)
    {
        return set("lineHeight", value);
    }

    /**
     * 加载中
     */
    public TableSchema2 loading(Object value)
    {
        return set("loading", value);
    }

    /**
     * 批量操作最大限制数
     */
    public TableSchema2 maxKeepItemSelectionLength(Object value)
    {
        return set("maxKeepItemSelectionLength", value);
    }

    /**
     * 接口报错信息配置
     */
    public TableSchema2 messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 事件动作配置
     */
    public TableSchema2 onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 指定挂载dom
     */
    public TableSchema2 popOverContainer(Object value)
    {
        return set("popOverContainer", value);
    }

    /**
     * 快速编辑关键字段
     */
    public TableSchema2 primaryField(Object value)
    {
        return set("primaryField", value);
    }

    /**
     * 快速编辑后用来批量保存的 API
     */
    public TableSchema2 quickSaveApi(Object value)
    {
        return set("quickSaveApi", value);
    }

    /**
     * 快速编辑配置成及时保存时使用的 API
     */
    public TableSchema2 quickSaveItemApi(Object value)
    {
        return set("quickSaveItemApi", value);
    }

    /**
     * 重新加载的组件名称
     */
    public TableSchema2 reload(Object value)
    {
        return set("reload", value);
    }

    /**
     * 自定义行样式
     */
    public TableSchema2 rowClassNameExpr(Object value)
    {
        return set("rowClassNameExpr", value);
    }

    /**
     * 表格可选择配置
     */
    public TableSchema2 rowSelection(Object value)
    {
        return set("rowSelection", value);
    }

    /**
     * 是否展示行角标
     */
    public TableSchema2 showBadge(boolean value)
    {
        return set("showBadge", value);
    }

    /**
     * 是否展示表头
     */
    public TableSchema2 showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 表格数据源
     */
    public TableSchema2 source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public TableSchema2 staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TableSchema2 staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TableSchema2 staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TableSchema2 staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TableSchema2 staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TableSchema2 staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TableSchema2 staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 粘性头部
     */
    public TableSchema2 sticky(boolean value)
    {
        return set("sticky", value);
    }

    /**
     * 组件样式
     */
    public TableSchema2 style(Object value)
    {
        return set("style", value);
    }

    /**
     * 表格标题
     */
    public TableSchema2 title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为表格类型
     */
    public TableSchema2 type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public TableSchema2 visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TableSchema2 visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public TableSchema2 set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
