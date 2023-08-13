package io.xiaoyu.common.yaims;



/**
 * Pagination
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Pagination extends BaseRenderer 
{
    public Pagination()
    {
        set("type", "pagination");

    }

    /**
     * 当前页数
     */
    public Pagination activePage(Object value)
    {
        return set("activePage", value);
    }

    /**
     * 容器 css 类名
     */
    public Pagination className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Pagination disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Pagination disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public Pagination hasNext(boolean value)
    {
        return set("hasNext", value);
    }

    /**
     * 是否隐藏
     */
    public Pagination hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Pagination hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Pagination id(Object value)
    {
        return set("id", value);
    }

    /**
     * 最后一页，总页数（如果传入了total，会重新计算lastPage）
     */
    public Pagination lastPage(Object value)
    {
        return set("lastPage", value);
    }

    /**
     * 通过控制layout属性的顺序，调整分页结构 total,perPage,pager,go
     */
    public Pagination layout(Object value)
    {
        return set("layout", value);
    }

    /**
     * 最多显示多少个分页按钮。
     */
    public Pagination maxButtons(Object value)
    {
        return set("maxButtons", value);
    }

    /**
     * 模式，默认normal，如果只想简单显示可以配置成 `simple`。
     */
    public Pagination mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 事件动作配置
     */
    public Pagination onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 每页显示条数
     */
    public Pagination perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 指定每页可以显示多少条
     */
    public Pagination perPageAvailable(boolean value)
    {
        return set("perPageAvailable", value);
    }

    /**
     * 弹层挂载节点
     */
    public Pagination popOverContainerSelector(Object value)
    {
        return set("popOverContainerSelector", value);
    }

    /**
     * 是否显示快速跳转输入框
     */
    public Pagination showPageInput(boolean value)
    {
        return set("showPageInput", value);
    }

    /**
     * 是否展示分页切换，也同时受layout控制
     */
    public Pagination showPerPage(boolean value)
    {
        return set("showPerPage", value);
    }

    /**
     * 是否静态展示
     */
    public Pagination staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Pagination staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Pagination staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Pagination staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Pagination staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Pagination staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Pagination staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Pagination style(Object value)
    {
        return set("style", value);
    }

    /**
     * 总条数
     */
    public Pagination total(Object value)
    {
        return set("total", value);
    }

    public Pagination type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Pagination visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Pagination visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Pagination set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
