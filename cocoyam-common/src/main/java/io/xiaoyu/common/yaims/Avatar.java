package io.xiaoyu.common.yaims;



/**
 * Avatar
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Avatar extends BaseRenderer 
{
    public Avatar()
    {
        set("type", "avatar");
        set("crossOrigin", "anonymous");

    }

    /**
     * 图片无法显示时的替换文字地址
     */
    public Avatar alt(Object value)
    {
        return set("alt", value);
    }

    /**
     * 角标
     */
    public Avatar badge(Object value)
    {
        return set("badge", value);
    }

    /**
     * 类名
     */
    public Avatar className(Object value)
    {
        return set("className", value);
    }

    /**
     * 图片CORS属性 可选值: anonymous | use-credentials | 
     */
    public Avatar crossOrigin(Object value)
    {
        return set("crossOrigin", value);
    }

    /**
     * 是否禁用
     */
    public Avatar disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Avatar disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 图片是否允许拖动
     */
    public Avatar draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 图片相对于容器的缩放方式 可选值: fill | contain | cover | none | scale-down
     */
    public Avatar fit(Object value)
    {
        return set("fit", value);
    }

    /**
     * 字符类型距离左右两侧边界单位像素
     */
    public Avatar gap(Object value)
    {
        return set("gap", value);
    }

    /**
     * 是否隐藏
     */
    public Avatar hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Avatar hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 图标
     */
    public Avatar icon(Object value)
    {
        return set("icon", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Avatar id(Object value)
    {
        return set("id", value);
    }

    /**
     * 图片加载失败的是否默认处理，字符串函数
     */
    public Avatar onError(Object value)
    {
        return set("onError", value);
    }

    /**
     * 事件动作配置
     */
    public Avatar onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 形状 可选值: circle | square | rounded
     */
    public Avatar shape(Object value)
    {
        return set("shape", value);
    }

    /**
     * 大小
     */
    public Avatar size(Object value)
    {
        return set("size", value);
    }

    /**
     * 图片地址
     */
    public Avatar src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public Avatar staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Avatar staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Avatar staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Avatar staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Avatar staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Avatar staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Avatar staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 自定义样式
     */
    public Avatar style(Object value)
    {
        return set("style", value);
    }

    /**
     * 文本
     */
    public Avatar text(Object value)
    {
        return set("text", value);
    }

    public Avatar type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Avatar visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Avatar visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Avatar set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
