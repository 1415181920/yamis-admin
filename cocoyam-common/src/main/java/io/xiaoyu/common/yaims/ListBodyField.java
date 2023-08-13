package io.xiaoyu.common.yaims;



/**
 * 不指定类型默认就是文本
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ListBodyField extends BaseRenderer 
{
    public ListBodyField()
    {

    }

    /**
     * 配置点击复制功能
     */
    public ListBodyField copyable(boolean value)
    {
        return set("copyable", value);
    }

    /**
     * 内层组件的CSS类名
     */
    public ListBodyField innerClassName(Object value)
    {
        return set("innerClassName", value);
    }

    /**
     * 列标题
     */
    public ListBodyField label(Object value)
    {
        return set("label", value);
    }

    /**
     * label 类名
     */
    public ListBodyField labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 绑定字段名
     */
    public ListBodyField name(Object value)
    {
        return set("name", value);
    }

    /**
     * 配置查看详情功能
     */
    public ListBodyField popOver(Object value)
    {
        return set("popOver", value);
    }

    /**
     * 配置快速编辑功能
     */
    public ListBodyField quickEdit(Object value)
    {
        return set("quickEdit", value);
    }

    public ListBodyField set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
