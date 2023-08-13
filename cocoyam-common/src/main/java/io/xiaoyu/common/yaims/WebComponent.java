package io.xiaoyu.common.yaims;



/**
 * Web Component
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class WebComponent extends BaseRenderer 
{
    public WebComponent()
    {
        set("type", "web-component");

    }

    /**
     * 子节点
     */
    public WebComponent body(Object value)
    {
        return set("body", value);
    }

    /**
     * 标签上的属性
     */
    public WebComponent props(Object value)
    {
        return set("props", value);
    }

    /**
     * 具体使用的 web-component 标签
     */
    public WebComponent tag(Object value)
    {
        return set("tag", value);
    }

    /**
     * 指定为 web-component 渲染器。
     */
    public WebComponent type(Object value)
    {
        return set("type", value);
    }

    public WebComponent set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
