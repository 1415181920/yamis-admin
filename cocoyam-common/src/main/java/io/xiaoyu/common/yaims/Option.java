package io.xiaoyu.common.yaims;



/**
 * Option
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Option extends BaseRenderer 
{
    public Option()
    {
        set("type","option");
    }

    /**
     * 支持嵌套
     */
    public Option children(Object value)
    {
        return set("children", value);
    }

    /**
     * 标记后数据延时加载
     */
    public Option defer(boolean value)
    {
        return set("defer", value);
    }

    /**
     * 如果设置了，优先级更高，不设置走 source 接口加载。
     */
    public Option deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 描述，部分控件支持
     */
    public Option description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public Option disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 最好不要用！因为有 visible 就够了。
     */
    public Option hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 用来显示的文字
     */
    public Option label(Object value)
    {
        return set("label", value);
    }

    /**
     * 只有设置了 defer 才有意义，内部字段不可以外部设置
     */
    public Option loaded(boolean value)
    {
        return set("loaded", value);
    }

    /**
     * 标记正在加载。只有 defer 为 true 时有意义。内部字段不可以外部设置
     */
    public Option loading(boolean value)
    {
        return set("loading", value);
    }

    /**
     * 可以用来给 Option 标记个范围，让数据展示更清晰。这个只有在数值展示的时候显示。
     */
    public Option scopeLabel(Object value)
    {
        return set("scopeLabel", value);
    }

    /**
     * 请保证数值唯一，多个选项值一致会认为是同一个选项。
     */
    public Option value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否可见
     */
    public Option visible(boolean value)
    {
        return set("visible", value);
    }

    public Option set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
