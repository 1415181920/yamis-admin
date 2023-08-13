package io.xiaoyu.common.yaims;



/**
 * SvgIcon
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SvgIcon extends BaseRenderer 
{
    public SvgIcon()
    {
        set("type", "custom-svg-icon");

    }

    /**
     * 设置图标的类名
     */
    public SvgIcon className(Object value)
    {
        return set("className", value);
    }

    /**
     * 设置图标的名称
     */
    public SvgIcon icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 指定为 custom-svg-icon 渲染器。
     */
    public SvgIcon type(Object value)
    {
        return set("type", value);
    }

    public SvgIcon set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
