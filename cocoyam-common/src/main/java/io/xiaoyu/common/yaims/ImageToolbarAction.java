package io.xiaoyu.common.yaims;



/**
 * ImageToolbarAction
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ImageToolbarAction extends BaseRenderer 
{
    public ImageToolbarAction()
    {
        set("key", "ROTATE_RIGHT");

    }

    public ImageToolbarAction disabled(boolean value)
    {
        return set("disabled", value);
    }

    public ImageToolbarAction icon(Object value)
    {
        return set("icon", value);
    }

    public ImageToolbarAction iconClassName(Object value)
    {
        return set("iconClassName", value);
    }

    /**
     *  可选值: ROTATE_RIGHT | ROTATE_LEFT | ZOOM_IN | ZOOM_OUT | SCALE_ORIGIN
     */
    public ImageToolbarAction key(Object value)
    {
        return set("key", value);
    }

    public ImageToolbarAction label(Object value)
    {
        return set("label", value);
    }

    public ImageToolbarAction set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
