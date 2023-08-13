package io.xiaoyu.common.yaims;



/**
 * 消息文案配置，记住这个优先级是最低的，如果你的接口返回了 msg，接口返回的优先。
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SchemaMessage extends BaseRenderer 
{
    public SchemaMessage()
    {

    }

    /**
     * 获取失败时的提示
     */
    public SchemaMessage fetchFailed(Object value)
    {
        return set("fetchFailed", value);
    }

    /**
     * 获取成功的提示，默认为空。
     */
    public SchemaMessage fetchSuccess(Object value)
    {
        return set("fetchSuccess", value);
    }

    /**
     * 保存失败时的提示。
     */
    public SchemaMessage saveFailed(Object value)
    {
        return set("saveFailed", value);
    }

    /**
     * 保存成功时的提示。
     */
    public SchemaMessage saveSuccess(Object value)
    {
        return set("saveSuccess", value);
    }

    public SchemaMessage set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
