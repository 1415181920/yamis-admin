package io.xiaoyu.common.yaims;



/**
 * NavOverflow
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class NavOverflow extends BaseRenderer 
{
    public NavOverflow()
    {

    }

    /**
     * 是否开启响应式收纳
     */
    public NavOverflow enable(boolean value)
    {
        return set("enable", value);
    }

    /**
     * 导航项目宽度
     */
    public NavOverflow itemWidth(Object value)
    {
        return set("itemWidth", value);
    }

    /**
     * 导航横向布局时，开启开启响应式收纳后最大可显示数量，超出此数量的导航将被收纳到下拉菜单中
     */
    public NavOverflow maxVisibleCount(Object value)
    {
        return set("maxVisibleCount", value);
    }

    /**
     * 菜单触发按钮CSS类名
     */
    public NavOverflow overflowClassName(Object value)
    {
        return set("overflowClassName", value);
    }

    /**
     * 菜单触发按钮的图标
     */
    public NavOverflow overflowIndicator(Object value)
    {
        return set("overflowIndicator", value);
    }

    /**
     * 菜单触发按钮的文字
     */
    public NavOverflow overflowLabel(Object value)
    {
        return set("overflowLabel", value);
    }

    /**
     * 菜单外层CSS类名
     */
    public NavOverflow overflowListClassName(Object value)
    {
        return set("overflowListClassName", value);
    }

    /**
     * Popover浮层CSS类名
     */
    public NavOverflow overflowPopoverClassName(Object value)
    {
        return set("overflowPopoverClassName", value);
    }

    /**
     * 导航列表后缀节点
     */
    public NavOverflow overflowSuffix(Object value)
    {
        return set("overflowSuffix", value);
    }

    /**
     * 菜单DOM挂载点
     */
    public NavOverflow popOverContainer(Object value)
    {
        return set("popOverContainer", value);
    }

    /**
     * 自定义样式
     */
    public NavOverflow style(Object value)
    {
        return set("style", value);
    }

    /**
     * 包裹导航的外层标签名，可以使用其他标签渲染
     */
    public NavOverflow wrapperComponent(Object value)
    {
        return set("wrapperComponent", value);
    }

    public NavOverflow set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
