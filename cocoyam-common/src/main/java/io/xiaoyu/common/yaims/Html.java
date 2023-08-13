package io.xiaoyu.common.yaims;



/**
 * <b>Html</b><br/>
 *
 * @link https://aisuda.bce.baidu.com/amis/zh-CN/components/html
 */
class Html extends Tpl
{

    public Html()
    {
        set("type", "html");
    }

    public Html set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
