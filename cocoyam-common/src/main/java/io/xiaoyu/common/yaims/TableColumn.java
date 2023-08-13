package io.xiaoyu.common.yaims;



/**
 * 表格列，不指定类型时默认为文本类型。
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TableColumn extends BaseRenderer 
{
    public TableColumn()
    {

    }

    /**
     * 列对齐方式 可选值: left | right | center | justify
     */
    public TableColumn align(Object value)
    {
        return set("align", value);
    }

    /**
     * 结合表格的 footable 一起使用。 填写 *、xs、sm、md、lg指定 footable 的触发条件，可以填写多个用空格隔开 可选值: * | xs | sm | md | lg
     */
    public TableColumn breakpoint(Object value)
    {
        return set("breakpoint", value);
    }

    /**
     * 表格列单元格是否可以获取父级数据域值，默认为true，该配置对当前列内单元格生效
     */
    public TableColumn canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 列样式表
     */
    public TableColumn className(Object value)
    {
        return set("className", value);
    }

    /**
     * 单元格样式表达式
     */
    public TableColumn classNameExpr(Object value)
    {
        return set("classNameExpr", value);
    }

    /**
     * 配置点击复制功能
     */
    public TableColumn copyable(boolean value)
    {
        return set("copyable", value);
    }

    /**
     * todo
     */
    public TableColumn filterable(boolean value)
    {
        return set("filterable", value);
    }

    /**
     * 配置是否固定当前列 可选值: left | right | none
     */
    public TableColumn fixed(Object value)
    {
        return set("fixed", value);
    }

    /**
     * 单元格内部组件自定义样式 style作为单元格自定义样式的配置
     */
    public TableColumn innerStyle(Object value)
    {
        return set("innerStyle", value);
    }

    /**
     * 列标题
     */
    public TableColumn label(Object value)
    {
        return set("label", value);
    }

    /**
     * 列头样式表
     */
    public TableColumn labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 绑定字段名
     */
    public TableColumn name(Object value)
    {
        return set("name", value);
    }

    /**
     * 配置查看详情功能
     */
    public TableColumn popOver(Object value)
    {
        return set("popOver", value);
    }

    /**
     * 配置快速编辑功能
     */
    public TableColumn quickEdit(Object value)
    {
        return set("quickEdit", value);
    }

    /**
     * 作为表单项时，可以单独配置编辑时的快速编辑面板。
     */
    public TableColumn quickEditOnUpdate(Object value)
    {
        return set("quickEditOnUpdate", value);
    }

    /**
     * 提示信息
     */
    public TableColumn remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可快速搜索
     */
    public TableColumn searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 配置是否可以排序
     */
    public TableColumn sortable(boolean value)
    {
        return set("sortable", value);
    }

    /**
     * 配置是否默认展示
     */
    public TableColumn toggled(boolean value)
    {
        return set("toggled", value);
    }

    /**
     * 是否唯一, 只有在 inputTable 里面才有用
     */
    public TableColumn unique(boolean value)
    {
        return set("unique", value);
    }

    /**
     * 默认值, 只有在 inputTable 里面才有用
     */
    public TableColumn value(Object value)
    {
        return set("value", value);
    }

    /**
     * 列宽度
     */
    public TableColumn width(Object value)
    {
        return set("width", value);
    }

    public TableColumn set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
