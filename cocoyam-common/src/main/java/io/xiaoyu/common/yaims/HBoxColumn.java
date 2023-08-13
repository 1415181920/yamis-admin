package io.xiaoyu.common.yaims;



/**
 * HBoxColumn
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class HBoxColumn extends BaseRenderer 
{
    public HBoxColumn()
    {

    }

    /**
     * 内容区
     */
    public HBoxColumn body(Object value)
    {
        return set("body", value);
    }

    /**
     * 列上 CSS 类名
     */
    public HBoxColumn columnClassName(Object value)
    {
        return set("columnClassName", value);
    }

    /**
     * 高度
     */
    public HBoxColumn height(Object value)
    {
        return set("height", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public HBoxColumn horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public HBoxColumn mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 其他样式
     */
    public HBoxColumn style(Object value)
    {
        return set("style", value);
    }

    /**
     * 垂直对齐方式 可选值: top | middle | bottom | between
     */
    public HBoxColumn valign(Object value)
    {
        return set("valign", value);
    }

    /**
     * 是否显示
     */
    public HBoxColumn visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public HBoxColumn visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 宽度
     */
    public HBoxColumn width(Object value)
    {
        return set("width", value);
    }

    public HBoxColumn set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
