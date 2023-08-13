package io.xiaoyu.common.yaims;



/**
 * ListItem
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ListItem extends BaseRenderer 
{
    public ListItem()
    {

    }

    public ListItem actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 操作位置，默认在右侧，可以设置成左侧。 可选值: left | right
     */
    public ListItem actionsPosition(Object value)
    {
        return set("actionsPosition", value);
    }

    /**
     * 图片地址
     */
    public ListItem avatar(Object value)
    {
        return set("avatar", value);
    }

    /**
     * 内容区域
     */
    public ListItem body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public ListItem className(Object value)
    {
        return set("className", value);
    }

    /**
     * 描述
     */
    public ListItem desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 是否禁用
     */
    public ListItem disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ListItem disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public ListItem hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ListItem hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ListItem id(Object value)
    {
        return set("id", value);
    }

    /**
     * 事件动作配置
     */
    public ListItem onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * tooltip 说明
     */
    public ListItem remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否静态展示
     */
    public ListItem staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ListItem staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ListItem staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ListItem staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ListItem staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ListItem staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ListItem staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ListItem style(Object value)
    {
        return set("style", value);
    }

    /**
     * 副标题
     */
    public ListItem subTitle(Object value)
    {
        return set("subTitle", value);
    }

    /**
     * 标题
     */
    public ListItem title(Object value)
    {
        return set("title", value);
    }

    /**
     * 是否显示
     */
    public ListItem visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ListItem visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public ListItem set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
