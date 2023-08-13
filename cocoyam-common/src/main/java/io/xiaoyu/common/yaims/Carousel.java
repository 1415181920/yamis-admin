package io.xiaoyu.common.yaims;



/**
 * Carousel 轮播图渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/carousel
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Carousel extends BaseRenderer 
{
    public Carousel()
    {
        set("type", "carousel");

    }

    /**
     * 是否一直显示箭头
     */
    public Carousel alwaysShowArrow(boolean value)
    {
        return set("alwaysShowArrow", value);
    }

    /**
     * 动画类型 可选值: fade | slide
     */
    public Carousel animation(Object value)
    {
        return set("animation", value);
    }

    /**
     * 是否自动播放
     */
    public Carousel auto(boolean value)
    {
        return set("auto", value);
    }

    /**
     * 容器 css 类名
     */
    public Carousel className(Object value)
    {
        return set("className", value);
    }

    /**
     * 配置控件内容
     */
    public Carousel controls(Object value)
    {
        return set("controls", value);
    }

    /**
     *  可选值: light | dark
     */
    public Carousel controlsTheme(Object value)
    {
        return set("controlsTheme", value);
    }

    /**
     * 是否禁用
     */
    public Carousel disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Carousel disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 动画时长
     */
    public Carousel duration(Object value)
    {
        return set("duration", value);
    }

    /**
     * 设置高度
     */
    public Carousel height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public Carousel hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Carousel hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 自定义箭头图标
     */
    public Carousel icons(Object value)
    {
        return set("icons", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Carousel id(Object value)
    {
        return set("id", value);
    }

    /**
     * 轮播间隔时间
     */
    public Carousel interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 配置单条呈现模板
     */
    public Carousel itemSchema(Object value)
    {
        return set("itemSchema", value);
    }

    /**
     * 多图模式配置项
     */
    public Carousel multiple(Object value)
    {
        return set("multiple", value);
    }

    public Carousel name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Carousel onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 配置固定值
     */
    public Carousel options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位
     */
    public Carousel placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否静态展示
     */
    public Carousel staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Carousel staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Carousel staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Carousel staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Carousel staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Carousel staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Carousel staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Carousel style(Object value)
    {
        return set("style", value);
    }

    /**
     * 预览图模式 可选值: contain | cover
     */
    public Carousel thumbMode(Object value)
    {
        return set("thumbMode", value);
    }

    /**
     * 指定为轮播图类型
     */
    public Carousel type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Carousel visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Carousel visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 设置宽度
     */
    public Carousel width(Object value)
    {
        return set("width", value);
    }

    public Carousel set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
