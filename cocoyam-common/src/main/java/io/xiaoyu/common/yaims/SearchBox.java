package io.xiaoyu.common.yaims;



/**
 * 搜索框渲染器
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SearchBox extends BaseRenderer 
{
    public SearchBox()
    {
        set("type", "search-box");

    }

    /**
     * 外层 css 类名
     */
    public SearchBox className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否开启清空内容后立即重新搜索
     */
    public SearchBox clearAndSubmit(boolean value)
    {
        return set("clearAndSubmit", value);
    }

    /**
     * 是否可清除
     */
    public SearchBox clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否禁用
     */
    public SearchBox disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public SearchBox disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否为加强样式
     */
    public SearchBox enhance(boolean value)
    {
        return set("enhance", value);
    }

    /**
     * 是否隐藏
     */
    public SearchBox hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public SearchBox hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public SearchBox id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否为 Mini 样式。
     */
    public SearchBox mini(boolean value)
    {
        return set("mini", value);
    }

    /**
     * 关键字名字。
     */
    public SearchBox name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public SearchBox onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public SearchBox placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否立马搜索。
     */
    public SearchBox searchImediately(boolean value)
    {
        return set("searchImediately", value);
    }

    /**
     * 是否静态展示
     */
    public SearchBox staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public SearchBox staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public SearchBox staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public SearchBox staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public SearchBox staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public SearchBox staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public SearchBox staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public SearchBox style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为搜索框。文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/search-box
     */
    public SearchBox type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public SearchBox visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public SearchBox visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public SearchBox set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
