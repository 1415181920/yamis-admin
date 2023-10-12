package io.xiaoyu.common.yaims;



/**
 * QRCodeImageSettings
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class QRCodeImageSettings extends BaseRenderer 
{
    public QRCodeImageSettings()
    {
    }

    public QRCodeImageSettings excavate(boolean value)
    {
        return set("excavate", value);
    }

    public QRCodeImageSettings height(Object value)
    {
        return set("height", value);
    }

    public QRCodeImageSettings src(Object value)
    {
        return set("src", value);
    }

    public QRCodeImageSettings width(Object value)
    {
        return set("width", value);
    }

    public QRCodeImageSettings x(Object value)
    {
        return set("x", value);
    }

    public QRCodeImageSettings y(Object value)
    {
        return set("y", value);
    }

    public QRCodeImageSettings set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
