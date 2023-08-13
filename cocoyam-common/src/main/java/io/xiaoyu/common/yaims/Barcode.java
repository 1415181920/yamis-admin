package io.xiaoyu.common.yaims;



/**
 * Barcode 条形码 https://aisuda.bce.baidu.com/amis/zh-CN/components/barcode
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Barcode extends BaseRenderer 
{
    public Barcode()
    {
        set("type", "barcode");

    }

    /**
     * 外层类名
     */
    public Barcode className(Object value)
    {
        return set("className", value);
    }

    /**
     * 指定为 barcode 渲染器。
     */
    public Barcode type(Object value)
    {
        return set("type", value);
    }

    public Barcode set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
