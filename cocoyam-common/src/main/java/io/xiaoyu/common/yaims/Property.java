package io.xiaoyu.common.yaims;



/**
 * Property 属性表
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Property extends BaseRenderer 
{
    public Property()
    {
        set("type", "property");

    }

    /**
     * 外层 dom 的类名
     */
    public Property className(Object value)
    {
        return set("className", value);
    }

    /**
     * 每行几列
     */
    public Property column(Object value)
    {
        return set("column", value);
    }

    /**
     * 属性值的样式
     */
    public Property contentStyle(Object value)
    {
        return set("contentStyle", value);
    }

    public Property items(Object value)
    {
        return set("items", value);
    }

    /**
     * 属性名的样式
     */
    public Property labelStyle(Object value)
    {
        return set("labelStyle", value);
    }

    /**
     * 显示模式，目前只有 "table" 和 "simple"
     */
    public Property mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 模式下属性名和值之间的分隔符
     */
    public Property separator(Object value)
    {
        return set("separator", value);
    }

    /**
     * 数据源
     */
    public Property source(Object value)
    {
        return set("source", value);
    }

    /**
     * 外层 dom 的样式
     */
    public Property style(Object value)
    {
        return set("style", value);
    }

    /**
     * 标题
     */
    public Property title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为 property 渲染器。
     */
    public Property type(Object value)
    {
        return set("type", value);
    }

    public Property set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
