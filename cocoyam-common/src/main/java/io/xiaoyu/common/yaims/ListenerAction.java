package io.xiaoyu.common.yaims;



/**
 * ListenerAction
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ListenerAction extends BaseRenderer 
{
    public ListenerAction()
    {

    }

    public ListenerAction actionType(Object value)
    {
        return set("actionType", value);
    }

    public ListenerAction args(Object value)
    {
        return set("args", value);
    }

    public ListenerAction componentId(Object value)
    {
        return set("componentId", value);
    }

    public ListenerAction data(Object value)
    {
        return set("data", value);
    }

    /**
     *  可选值: merge | override
     */
    public ListenerAction dataMergeMode(Object value)
    {
        return set("dataMergeMode", value);
    }

    public ListenerAction description(Object value)
    {
        return set("description", value);
    }

    public ListenerAction execOn(Object value)
    {
        return set("execOn", value);
    }

    public ListenerAction expression(Object value)
    {
        return set("expression", value);
    }

    public ListenerAction outputVar(Object value)
    {
        return set("outputVar", value);
    }

    public ListenerAction preventDefault(boolean value)
    {
        return set("preventDefault", value);
    }

    public ListenerAction stopPropagation(boolean value)
    {
        return set("stopPropagation", value);
    }

    public ListenerAction set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
