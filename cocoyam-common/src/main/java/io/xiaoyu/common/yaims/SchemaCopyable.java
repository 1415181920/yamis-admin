package io.xiaoyu.common.yaims;



/**
 * SchemaCopyable
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SchemaCopyable extends BaseRenderer 
{
    public SchemaCopyable()
    {

    }

    /**
     * 配置复制时的内容模板。
     */
    public SchemaCopyable content(Object value)
    {
        return set("content", value);
    }

    /**
     * 可以配置图标
     */
    public SchemaCopyable icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 提示文字内容
     */
    public SchemaCopyable tooltip(Object value)
    {
        return set("tooltip", value);
    }

    public SchemaCopyable set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
