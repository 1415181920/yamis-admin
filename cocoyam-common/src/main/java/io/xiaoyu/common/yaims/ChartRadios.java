package io.xiaoyu.common.yaims;



/**
 * ChartRadios 图表单选框
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ChartRadios extends BaseRenderer 
{
    public ChartRadios()
    {
        set("type", "chart-radios");

    }

    /**
     * 图表数值字段名
     */
    public ChartRadios chartValueField(Object value)
    {
        return set("chartValueField", value);
    }

    /**
     * 图表配置
     */
    public ChartRadios config(Object value)
    {
        return set("config", value);
    }

    /**
     * 高亮的时候是否显示 tooltip
     */
    public ChartRadios showTooltipOnHighlight(boolean value)
    {
        return set("showTooltipOnHighlight", value);
    }

    /**
     * 指定为 chart-radios 渲染器。
     */
    public ChartRadios type(Object value)
    {
        return set("type", value);
    }

    public ChartRadios set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
