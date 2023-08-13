package io.xiaoyu.common.yaims;



/**
 * GridColumn
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class GridColumn extends BaseRenderer 
{
    public GridColumn()
    {

    }

    public GridColumn body(Object value)
    {
        return set("body", value);
    }

    /**
     * 列类名
     */
    public GridColumn columnClassName(Object value)
    {
        return set("columnClassName", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public GridColumn horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 大屏时(>=1200px)宽度占比
     */
    public GridColumn lg(Object value)
    {
        return set("lg", value);
    }

    /**
     * 中屏时(>=992px)宽度占比
     */
    public GridColumn md(Object value)
    {
        return set("md", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public GridColumn mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 小屏时（>=768px）宽度占比
     */
    public GridColumn sm(Object value)
    {
        return set("sm", value);
    }

    /**
     * 样式
     */
    public GridColumn style(Object value)
    {
        return set("style", value);
    }

    /**
     * 垂直对齐方式 可选值: top | middle | bottom | between
     */
    public GridColumn valign(Object value)
    {
        return set("valign", value);
    }

    /**
     * 极小屏（<768px）时宽度占比
     */
    public GridColumn xs(Object value)
    {
        return set("xs", value);
    }

    public GridColumn set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
