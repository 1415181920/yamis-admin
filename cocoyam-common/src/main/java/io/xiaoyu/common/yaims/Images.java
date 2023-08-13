package io.xiaoyu.common.yaims;



/**
 * 图片集展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/images
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Images extends BaseRenderer 
{
    public Images()
    {
        set("type", "images");

    }

    /**
     * 外层 CSS 类名
     */
    public Images className(Object value)
    {
        return set("className", value);
    }

    /**
     * 默认图片地址
     */
    public Images defaultImage(Object value)
    {
        return set("defaultImage", value);
    }

    /**
     * 配置值的连接符
     */
    public Images delimiter(Object value)
    {
        return set("delimiter", value);
    }

    /**
     * 是否禁用
     */
    public Images disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Images disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否启动放大功能。
     */
    public Images enlargeAble(boolean value)
    {
        return set("enlargeAble", value);
    }

    /**
     * 是否隐藏
     */
    public Images hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Images hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Images id(Object value)
    {
        return set("id", value);
    }

    /**
     * 放大详情图 CSS 类名
     */
    public Images imageGallaryClassName(Object value)
    {
        return set("imageGallaryClassName", value);
    }

    /**
     * 列表 CSS 类名
     */
    public Images listClassName(Object value)
    {
        return set("listClassName", value);
    }

    /**
     * 关联字段名，也可以直接配置 src
     */
    public Images name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Images onEvent(Object value)
    {
        return set("onEvent", value);
    }

    public Images options(Object value)
    {
        return set("options", value);
    }

    /**
     * 大图地址，不设置用 src 属性，如果不是请配置，如：{imageOriginUrl}
     */
    public Images originalSrc(Object value)
    {
        return set("originalSrc", value);
    }

    /**
     * 列表为空时显示
     */
    public Images placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否显示尺寸。
     */
    public Images showDimensions(boolean value)
    {
        return set("showDimensions", value);
    }

    /**
     * 是否展示图片工具栏
     */
    public Images showToolbar(boolean value)
    {
        return set("showToolbar", value);
    }

    public Images source(Object value)
    {
        return set("source", value);
    }

    /**
     * 图片地址，默认读取数据中的 image 属性，如果不是请配置 ,如  {imageUrl}
     */
    public Images src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public Images staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Images staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Images staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Images staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Images staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Images staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Images staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Images style(Object value)
    {
        return set("style", value);
    }

    /**
     * 预览图模式 可选值: w-full | h-full | contain | cover
     */
    public Images thumbMode(Object value)
    {
        return set("thumbMode", value);
    }

    /**
     * 预览图比率 可选值: 1:1 | 4:3 | 16:9
     */
    public Images thumbRatio(Object value)
    {
        return set("thumbRatio", value);
    }

    /**
     * 工具栏配置
     */
    public Images toolbarActions(Object value)
    {
        return set("toolbarActions", value);
    }

    /**
     * 指定为图片集渲染器 可选值: images | static-images
     */
    public Images type(Object value)
    {
        return set("type", value);
    }

    public Images value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Images visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Images visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Images set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
