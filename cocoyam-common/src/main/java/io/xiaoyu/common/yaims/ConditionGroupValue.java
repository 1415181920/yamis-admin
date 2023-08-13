package io.xiaoyu.common.yaims;



/**
 * ConditionGroupValue
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ConditionGroupValue extends BaseRenderer 
{
    public ConditionGroupValue()
    {
        set("conjunction", "and");

    }

    public ConditionGroupValue children(Object value)
    {
        return set("children", value);
    }

    /**
     *  可选值: and | or
     */
    public ConditionGroupValue conjunction(Object value)
    {
        return set("conjunction", value);
    }

    public ConditionGroupValue id(Object value)
    {
        return set("id", value);
    }

    public ConditionGroupValue not(boolean value)
    {
        return set("not", value);
    }

    public ConditionGroupValue set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
