package io.xiaoyu.common.yaims;



/**
 * AutoGenerateFilter
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class AutoGenerateFilter extends BaseRenderer 
{
    public AutoGenerateFilter()
    {

    }

    /**
     * 过滤条件单行列数
     */
    public AutoGenerateFilter columnsNum(Object value)
    {
        return set("columnsNum", value);
    }

    /**
     * 是否显示设置查询字段
     */
    public AutoGenerateFilter showBtnToolbar(boolean value)
    {
        return set("showBtnToolbar", value);
    }

    public AutoGenerateFilter set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
