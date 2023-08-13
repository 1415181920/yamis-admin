package io.xiaoyu.common.yaims;



/**
 * Custom 自定义组件
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Custom extends BaseRenderer 
{
    public Custom()
    {
        set("type", "custom");

    }

    /**
     * 节点 class
     */
    public Custom className(Object value)
    {
        return set("className", value);
    }

    /**
     * 初始化节点 html
     */
    public Custom html(Object value)
    {
        return set("html", value);
    }

    /**
     * 节点 id
     */
    public Custom id(Object value)
    {
        return set("id", value);
    }

    /**
     * 默认使用 div 标签，如果 true 就使用 span 标签
     */
    public Custom inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 节点 名称
     */
    public Custom name(Object value)
    {
        return set("name", value);
    }

    /**
     * 节点初始化之后调的用函数
     */
    public Custom onMount(Object value)
    {
        return set("onMount", value);
    }

    /**
     * 节点销毁的时候调用的函数
     */
    public Custom onUnmount(Object value)
    {
        return set("onUnmount", value);
    }

    /**
     * 数据有更新的时候调用的函数
     */
    public Custom onUpdate(Object value)
    {
        return set("onUpdate", value);
    }

    /**
     * 指定为 custom 渲染器。
     */
    public Custom type(Object value)
    {
        return set("type", value);
    }

    public Custom set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
