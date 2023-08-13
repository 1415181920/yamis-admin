package io.xiaoyu.common.yaims;



/**
 * Flex 布局
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Flex extends BaseRenderer 
{
    public Flex()
    {
        set("type", "flex");

    }

    /**
     * stretch, start, flex-start, flex-end, end, center, baseline
     */
    public Flex alignItems(Object value)
    {
        return set("alignItems", value);
    }

    /**
     * css 类名
     */
    public Flex className(Object value)
    {
        return set("className", value);
    }

    /**
     * 布局方向: column, row
     */
    public Flex direction(Object value)
    {
        return set("direction", value);
    }

    /**
     * 子元素, 数组表示多个
     */
    public Flex items(Object value)
    {
        return set("items", value);
    }

    /**
     * start, flex-start, center, end, flex-end, space-around, space-between, space-evenly
     */
    public Flex justify(Object value)
    {
        return set("justify", value);
    }

    /**
     * 自定义样式
     */
    public Flex style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 flex 渲染器。
     */
    public Flex type(Object value)
    {
        return set("type", value);
    }

    public Flex set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
