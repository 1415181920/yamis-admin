package io.xiaoyu.common.yaims;



/**
 * IconChecked
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class IconChecked extends BaseRenderer 
{
    public IconChecked()
    {

    }

    public IconChecked id(Object value)
    {
        return set("id", value);
    }

    public IconChecked name(Object value)
    {
        return set("name", value);
    }

    public IconChecked svg(Object value)
    {
        return set("svg", value);
    }

    public IconChecked set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
