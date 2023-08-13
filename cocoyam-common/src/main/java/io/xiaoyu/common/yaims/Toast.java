package io.xiaoyu.common.yaims;



/**
 * Toast 轻提示
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Toast extends BaseRenderer 
{
    public Toast()
    {

    }

    /**
     * 内容
     */
    public Toast body(Object value)
    {
        return set("body", value);
    }

    /**
     * 是否显示关闭按钮
     */
    public Toast closeButton(boolean value)
    {
        return set("closeButton", value);
    }

    /**
     * 轻提示内容
     */
    public Toast items(Object value)
    {
        return set("items", value);
    }

    /**
     * 展示图标，可选"info"/"success"/"error"/"warning"
     */
    public Toast level(Object value)
    {
        return set("level", value);
    }

    /**
     * 提示显示位置，可选值: top-right | top-center | top-left | bottom-center | bottom-left | bottom-right | center
     */
    public Toast position(Object value)
    {
        return set("position", value);
    }

    /**
     * 是否显示图标
     */
    public Toast showIcon(boolean value)
    {
        return set("showIcon", value);
    }

    /**
     * 持续时间
     */
    public Toast timeout(Object value)
    {
        return set("timeout", value);
    }

    /**
     * 标题
     */
    public Toast title(Object value)
    {
        return set("title", value);
    }

    public Toast set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
