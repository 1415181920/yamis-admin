package io.xiaoyu.common.yaims;



/**
 * Column
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Column extends BaseRenderer 
{
    public Column()
    {

    }

    /**
     * 内容居左、居中、居右
     */
    public Column align(Object value)
    {
        return set("align", value);
    }

    /**
     * 表头分组
     */
    public Column children(Object value)
    {
        return set("children", value);
    }

    /**
     * 列样式
     */
    public Column className(Object value)
    {
        return set("className", value);
    }

    /**
     * 单元格样式
     */
    public Column classNameExpr(Object value)
    {
        return set("classNameExpr", value);
    }

    /**
     * 指定列合并表达式
     */
    public Column colSpanExpr(Object value)
    {
        return set("colSpanExpr", value);
    }

    /**
     * 可复制
     */
    public Column copyable(boolean value)
    {
        return set("copyable", value);
    }

    /**
     * 是否固定在左侧/右侧
     */
    public Column fixed(Object value)
    {
        return set("fixed", value);
    }

    /**
     * 指定列唯一标识
     */
    public Column name(Object value)
    {
        return set("name", value);
    }

    /**
     * 列表头提示
     */
    public Column remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 指定行合并表达式
     */
    public Column rowSpanExpr(Object value)
    {
        return set("rowSpanExpr", value);
    }

    /**
     * 快速搜索
     */
    public Column searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 快速排序
     */
    public Column sorter(boolean value)
    {
        return set("sorter", value);
    }

    /**
     * 指定列标题
     */
    public Column title(Object value)
    {
        return set("title", value);
    }

    /**
     * 表头单元格样式
     */
    public Column titleClassName(Object value)
    {
        return set("titleClassName", value);
    }

    /**
     * 当前列是否展示
     */
    public Column toggled(boolean value)
    {
        return set("toggled", value);
    }

    /**
     * 指定列内容渲染器
     */
    public Column type(Object value)
    {
        return set("type", value);
    }

    public Column set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
