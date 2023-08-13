package io.xiaoyu.common.yaims;



/**
 * Table View 表格展现
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TableView extends BaseRenderer 
{
    public TableView()
    {
        set("type", "table-view");

    }

    /**
     * 指定为 table-view 渲染器。
     */
    public TableView type(Object value)
    {
        return set("type", value);
    }

    public TableView set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
