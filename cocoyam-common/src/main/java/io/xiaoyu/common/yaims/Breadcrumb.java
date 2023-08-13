package io.xiaoyu.common.yaims;



/**
 * Breadcrumb 面包屑 https://aisuda.bce.baidu.com/amis/zh-CN/components/breadcrumb
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Breadcrumb extends BaseRenderer 
{
    public Breadcrumb()
    {
        set("type", "breadcrumb");
    }

    /**
     * 外层类名
     */
    public Breadcrumb className(Object value)
    {
        return set("className", value);
    }

    /**
     * 下拉菜单类名
     */
    public Breadcrumb dropdownClassName(Object value)
    {
        return set("dropdownClassName", value);
    }

    /**
     * 下拉菜单项类名
     */
    public Breadcrumb dropdownItemClassName(Object value)
    {
        return set("dropdownItemClassName", value);
    }

    /**
     * 导航项类名
     */
    public Breadcrumb itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 文本
     */
    public Breadcrumb items(Object value)
    {
        return set("items", value);
    }

    /**
     * 最大展示长度
     */
    public Breadcrumb labelMaxLength(Object value)
    {
        return set("labelMaxLength", value);
    }

    /**
     * 分隔符
     */
    public Breadcrumb separator(Object value)
    {
        return set("separator", value);
    }

    /**
     * 分割符类名
     */
    public Breadcrumb separatorClassName(Object value)
    {
        return set("separatorClassName", value);
    }

    /**
     * 动态数据
     */
    public Breadcrumb source(Object value)
    {
        return set("source", value);
    }

    /**
     * 浮窗提示位置
     */
    public Breadcrumb tooltipPosition(Object value)
    {
        return set("tooltipPosition", value);
    }

    /**
     * 指定为 breadcrumb 渲染器。
     */
    public Breadcrumb type(Object value)
    {
        return set("type", value);
    }

    public Breadcrumb set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
