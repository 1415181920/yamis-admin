package io.xiaoyu.common.yaims;



/**
 * SchemaPopOver
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SchemaPopOver extends BaseRenderer 
{
    public SchemaPopOver()
    {

    }

    public SchemaPopOver body(Object value)
    {
        return set("body", value);
    }

    /**
     * 类名
     */
    public SchemaPopOver className(Object value)
    {
        return set("className", value);
    }

    /**
     * 弹出模式 可选值: dialog | drawer | popOver
     */
    public SchemaPopOver mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 偏移量
     */
    public SchemaPopOver offset(Object value)
    {
        return set("offset", value);
    }

    /**
     * 弹框外层类名
     */
    public SchemaPopOver popOverClassName(Object value)
    {
        return set("popOverClassName", value);
    }

    /**
     * 配置当前行是否启动，要用表达式
     */
    public SchemaPopOver popOverEnableOn(Object value)
    {
        return set("popOverEnableOn", value);
    }

    /**
     * 弹出位置 可选值: center | left-top | left-top-left-top | left-top-left-center | left-top-left-bottom | left-top-center-top | left-top-center-center | left-top-center-bottom | left-top-right-top | left-top-right-center | left-top-right-bottom | right-top | right-top-left-top | right-top-left-center | right-top-left-bottom | right-top-center-top | right-top-center-center | right-top-center-bottom | right-top-right-top | right-top-right-center | right-top-right-bottom | left-bottom | left-bottom-left-top | left-bottom-left-center | left-bottom-left-bottom | left-bottom-center-top | left-bottom-center-center | left-bottom-center-bottom | left-bottom-right-top | left-bottom-right-center | left-bottom-right-bottom | right-bottom | right-bottom-left-top | right-bottom-left-center | right-bottom-left-bottom | right-bottom-center-top | right-bottom-center-center | right-bottom-center-bottom | right-bottom-right-top | right-bottom-right-center | right-bottom-right-bottom | fixed-center | fixed-left-top | fixed-right-top | fixed-left-bottom | fixed-right-bottom
     */
    public SchemaPopOver position(Object value)
    {
        return set("position", value);
    }

    /**
     * 是否显示查看更多的 icon，通常是放大图标。
     */
    public SchemaPopOver showIcon(boolean value)
    {
        return set("showIcon", value);
    }

    /**
     * 是弹窗形式的时候有用。 可选值: sm | md | lg | xl
     */
    public SchemaPopOver size(Object value)
    {
        return set("size", value);
    }

    /**
     * 标题
     */
    public SchemaPopOver title(Object value)
    {
        return set("title", value);
    }

    /**
     * 触发条件，默认是 click 可选值: click | hover
     */
    public SchemaPopOver trigger(Object value)
    {
        return set("trigger", value);
    }

    public SchemaPopOver set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
