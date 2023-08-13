package io.xiaoyu.common.yaims;



/**
 * 分页容器功能性渲染器。详情请见：https://aisuda.bce.baidu.com/amis/zh-CN/components/pagination-wrapper
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class PaginationWrapper extends BaseRenderer 
{
    public PaginationWrapper()
    {
        set("type", "pagination-wrapper");

    }

    /**
     * 内容区域
     */
    public PaginationWrapper body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public PaginationWrapper className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public PaginationWrapper disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public PaginationWrapper disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public PaginationWrapper hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public PaginationWrapper hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public PaginationWrapper id(Object value)
    {
        return set("id", value);
    }

    /**
     * 输入字段名
     */
    public PaginationWrapper inputName(Object value)
    {
        return set("inputName", value);
    }

    /**
     * 最多显示多少个分页按钮。
     */
    public PaginationWrapper maxButtons(Object value)
    {
        return set("maxButtons", value);
    }

    /**
     * 事件动作配置
     */
    public PaginationWrapper onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 输出字段名
     */
    public PaginationWrapper outputName(Object value)
    {
        return set("outputName", value);
    }

    /**
     * 每页显示多条数据。
     */
    public PaginationWrapper perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 分页显示位置，如果配置为 none 则需要自己在内容区域配置 pagination 组件，否则不显示。 可选值: top | bottom | none
     */
    public PaginationWrapper position(Object value)
    {
        return set("position", value);
    }

    /**
     * 是否显示快速跳转输入框
     */
    public PaginationWrapper showPageInput(boolean value)
    {
        return set("showPageInput", value);
    }

    /**
     * 是否静态展示
     */
    public PaginationWrapper staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public PaginationWrapper staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public PaginationWrapper staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public PaginationWrapper staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public PaginationWrapper staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public PaginationWrapper staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public PaginationWrapper staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public PaginationWrapper style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为分页容器功能性渲染器
     */
    public PaginationWrapper type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public PaginationWrapper visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public PaginationWrapper visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public PaginationWrapper set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
