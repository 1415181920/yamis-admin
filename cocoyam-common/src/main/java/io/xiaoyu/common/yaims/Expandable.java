package io.xiaoyu.common.yaims;



/**
 * Expandable
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Expandable extends BaseRenderer 
{
    public Expandable()
    {

    }

    /**
     * 行是否可展开表达式
     */
    public Expandable expandableOn(Object value)
    {
        return set("expandableOn", value);
    }

    /**
     * 展开行自定义样式表达式
     */
    public Expandable expandedRowClassNameExpr(Object value)
    {
        return set("expandedRowClassNameExpr", value);
    }

    /**
     * 已展开的key值
     */
    public Expandable expandedRowKeys(Object value)
    {
        return set("expandedRowKeys", value);
    }

    /**
     * 已展开的key值表达式
     */
    public Expandable expandedRowKeysExpr(Object value)
    {
        return set("expandedRowKeysExpr", value);
    }

    /**
     * 对应数据源的key值
     */
    public Expandable keyField(Object value)
    {
        return set("keyField", value);
    }

    /**
     * 对应渲染器类型
     */
    public Expandable type(Object value)
    {
        return set("type", value);
    }

    public Expandable set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
