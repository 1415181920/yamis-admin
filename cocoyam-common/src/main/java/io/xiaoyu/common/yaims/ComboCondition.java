package io.xiaoyu.common.yaims;



/**
 * ComboCondition
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ComboCondition extends BaseRenderer 
{
    public ComboCondition()
    {

    }

    public ComboCondition items(Object value)
    {
        return set("items", value);
    }

    public ComboCondition label(Object value)
    {
        return set("label", value);
    }

    public ComboCondition mode(Object value)
    {
        return set("mode", value);
    }

    public ComboCondition scaffold(Object value)
    {
        return set("scaffold", value);
    }

    public ComboCondition test(Object value)
    {
        return set("test", value);
    }

    public ComboCondition set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
