package io.xiaoyu.common.yaims;



/**
 * RowSelection
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class RowSelection extends BaseRenderer 
{
    public RowSelection()
    {
        set("type","row-selection");
    }

    /**
     * 已选择的key值表达式
     */
    public RowSelection columnWidth(Object value)
    {
        return set("columnWidth", value);
    }

    /**
     * 行是否禁用表达式
     */
    public RowSelection disableOn(Object value)
    {
        return set("disableOn", value);
    }

    /**
     * 对应数据源的key值
     */
    public RowSelection keyField(Object value)
    {
        return set("keyField", value);
    }

    /**
     * 是否点击行触发选中或取消选中
     */
    public RowSelection rowClick(boolean value)
    {
        return set("rowClick", value);
    }

    /**
     * 已选择的key值
     */
    public RowSelection selectedRowKeys(Object value)
    {
        return set("selectedRowKeys", value);
    }

    /**
     * 已选择的key值表达式
     */
    public RowSelection selectedRowKeysExpr(Object value)
    {
        return set("selectedRowKeysExpr", value);
    }

    /**
     * 自定义选择菜单
     */
    public RowSelection selections(Object value)
    {
        return set("selections", value);
    }

    /**
     * 选择类型 单选/多选
     */
    public RowSelection type(Object value)
    {
        return set("type", value);
    }

    public RowSelection set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
