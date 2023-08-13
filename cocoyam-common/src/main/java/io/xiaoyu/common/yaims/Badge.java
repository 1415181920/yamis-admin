package io.xiaoyu.common.yaims;



/**
 * Badge 角标。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/badge
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Badge extends BaseRenderer 
{
    public Badge()
    {

    }

    /**
     * 是否显示动画
     */
    public Badge animation(boolean value)
    {
        return set("animation", value);
    }

    public Badge className(Object value)
    {
        return set("className", value);
    }

    /**
     * 提示类型
     */
    public Badge level(Object value)
    {
        return set("level", value);
    }

    /**
     * 角标类型 可选值: text | dot | ribbon
     */
    public Badge mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 角标位置，相对于position的位置进行偏移
     */
    public Badge offset(Object value)
    {
        return set("offset", value);
    }

    /**
     * 封顶的数字值
     */
    public Badge overflowCount(Object value)
    {
        return set("overflowCount", value);
    }

    /**
     * 角标位置 可选值: top-right | top-left | bottom-right | bottom-left
     */
    public Badge position(Object value)
    {
        return set("position", value);
    }

    /**
     * 大小
     */
    public Badge size(Object value)
    {
        return set("size", value);
    }

    /**
     * 角标的自定义样式
     */
    public Badge style(Object value)
    {
        return set("style", value);
    }

    /**
     * 文本内容
     */
    public Badge text(Object value)
    {
        return set("text", value);
    }

    /**
     * 动态控制是否显示
     */
    public Badge visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Badge set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
