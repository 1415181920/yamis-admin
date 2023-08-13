package io.xiaoyu.common.yaims;



/**
 * GridNav 宫格导航
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class GridNav extends BaseRenderer 
{
    public GridNav()
    {
        set("type", "grid-nav");

    }

    /**
     * 是否显示列表项边框
     */
    public GridNav border(boolean value)
    {
        return set("border", value);
    }

    /**
     * 是否将列表项内容居中显示
     */
    public GridNav center(boolean value)
    {
        return set("center", value);
    }

    /**
     * 外层 CSS 类名
     */
    public GridNav className(Object value)
    {
        return set("className", value);
    }

    /**
     * 列数
     */
    public GridNav columnNum(Object value)
    {
        return set("columnNum", value);
    }

    /**
     * 列表项内容排列的方向，可选值为 horizontal 、vertical
     */
    public GridNav direction(Object value)
    {
        return set("direction", value);
    }

    /**
     * 列表项之间的间距，默认单位为px
     */
    public GridNav gutter(Object value)
    {
        return set("gutter", value);
    }

    /**
     * 图标宽度占比，单位%
     */
    public GridNav iconRatio(Object value)
    {
        return set("iconRatio", value);
    }

    /**
     * 列表项 css 类名
     */
    public GridNav itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 列表项图标
     */
    public GridNav options(Object value)
    {
        return set("options", value);
    }

    /**
     * 是否调换图标和文本的位置
     */
    public GridNav reverse(boolean value)
    {
        return set("reverse", value);
    }

    /**
     * 数据源
     */
    public GridNav source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否将列表项固定为正方形
     */
    public GridNav square(boolean value)
    {
        return set("square", value);
    }

    /**
     * 指定为 grid-nav 渲染器。
     */
    public GridNav type(Object value)
    {
        return set("type", value);
    }

    /**
     * 图片数组
     */
    public GridNav value(Object value)
    {
        return set("value", value);
    }

    public GridNav set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
