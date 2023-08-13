package io.xiaoyu.common.yaims;



/**
 * Table 表格渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/table
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Table extends BaseRenderer 
{
    public Table()
    {
        set("type", "table");

    }

    /**
     * 是否固定表头
     */
    public Table affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 底部总结行
     */
    public Table affixRow(Object value)
    {
        return set("affixRow", value);
    }

    /**
     * 表格自动计算高度
     */
    public Table autoFillHeight(Object value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
     */
    public Table autoGenerateFilter(Object value)
    {
        return set("autoGenerateFilter", value);
    }

    /**
     * 表格是否可以获取父级数据域值，默认为false
     */
    public Table canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 容器 css 类名
     */
    public Table className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表格的列信息
     */
    public Table columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
     */
    public Table columnsTogglable(boolean value)
    {
        return set("columnsTogglable", value);
    }

    /**
     * 合并单元格配置，配置从第几列开始合并。
     */
    public Table combineFromIndex(Object value)
    {
        return set("combineFromIndex", value);
    }

    /**
     * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
     */
    public Table combineNum(Object value)
    {
        return set("combineNum", value);
    }

    /**
     * 设置数据
     */
    public Table data(Object value)
    {
        return set("data", value);
    }

    /**
     * 是否禁用
     */
    public Table disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Table disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否开启底部展示功能，适合移动端展示
     */
    public Table footable(boolean value)
    {
        return set("footable", value);
    }

    /**
     * 底部外层 CSS 类名
     */
    public Table footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 顶部外层 CSS 类名
     */
    public Table headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Table hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Table hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Table id(Object value)
    {
        return set("id", value);
    }

    /**
     * 行角标
     */
    public Table itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 事件动作配置
     */
    public Table onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Table placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 顶部总结行
     */
    public Table prefixRow(Object value)
    {
        return set("prefixRow", value);
    }

    /**
     * 是否可调整列宽
     */
    public Table resizable(boolean value)
    {
        return set("resizable", value);
    }

    /**
     * 行样式表表达式
     */
    public Table rowClassNameExpr(Object value)
    {
        return set("rowClassNameExpr", value);
    }

    /**
     * 是否显示底部
     */
    public Table showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示头部
     */
    public Table showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 数据源：绑定当前环境变量
     */
    public Table source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Table staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Table staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Table staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Table staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Table staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Table staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Table staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Table style(Object value)
    {
        return set("style", value);
    }

    /**
     * 表格 CSS 类名
     */
    public Table tableClassName(Object value)
    {
        return set("tableClassName", value);
    }

    /**
     * 标题
     */
    public Table title(Object value)
    {
        return set("title", value);
    }

    /**
     * 工具栏 CSS 类名
     */
    public Table toolbarClassName(Object value)
    {
        return set("toolbarClassName", value);
    }

    /**
     * 指定为表格渲染器。 可选值: table | static-table
     */
    public Table type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Table visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Table visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Table set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
