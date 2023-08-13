package io.xiaoyu.common.yaims;



/**
 * Markdown 渲染
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Markdown extends BaseRenderer 
{
    public Markdown()
    {
        set("type", "markdown");

    }

    /**
     * 类名
     */
    public Markdown className(Object value)
    {
        return set("className", value);
    }

    /**
     * 名称
     */
    public Markdown name(Object value)
    {
        return set("name", value);
    }

    /**
     * 外部地址
     */
    public Markdown src(Object value)
    {
        return set("src", value);
    }

    /**
     * 指定为 markdown 渲染器。
     */
    public Markdown type(Object value)
    {
        return set("type", value);
    }

    /**
     * 静态值
     */
    public Markdown value(Object value)
    {
        return set("value", value);
    }

    public Markdown set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
