package io.xiaoyu.common.yaims;



/**
 * 图片展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/image
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Image extends BaseRenderer 
{
    public Image()
    {
        set("type", "image");

    }

    /**
     * 图片无法显示时的替换文本
     */
    public Image alt(Object value)
    {
        return set("alt", value);
    }

    /**
     * 是否新窗口打开
     */
    public Image blank(boolean value)
    {
        return set("blank", value);
    }

    /**
     * 图片说明文字
     */
    public Image caption(Object value)
    {
        return set("caption", value);
    }

    /**
     * 外层 css 类名
     */
    public Image className(Object value)
    {
        return set("className", value);
    }

    /**
     * 默认图片地址
     */
    public Image defaultImage(Object value)
    {
        return set("defaultImage", value);
    }

    /**
     * 是否禁用
     */
    public Image disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Image disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否启动放大功能。
     */
    public Image enlargeAble(boolean value)
    {
        return set("enlargeAble", value);
    }

    /**
     * 高度
     */
    public Image height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public Image hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Image hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 链接地址
     */
    public Image href(Object value)
    {
        return set("href", value);
    }

    /**
     * 链接的 target
     */
    public Image htmlTarget(Object value)
    {
        return set("htmlTarget", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Image id(Object value)
    {
        return set("id", value);
    }

    /**
     * 图片描述信息
     */
    public Image imageCaption(Object value)
    {
        return set("imageCaption", value);
    }

    /**
     * 图片 css 类名
     */
    public Image imageClassName(Object value)
    {
        return set("imageClassName", value);
    }

    /**
     * 放大详情图 CSS 类名
     */
    public Image imageGallaryClassName(Object value)
    {
        return set("imageGallaryClassName", value);
    }

    /**
     * 图片展示模式，默认为缩略图模式、可以配置成原图模式 可选值: thumb | original
     */
    public Image imageMode(Object value)
    {
        return set("imageMode", value);
    }

    /**
     * 组件内层 css 类名
     */
    public Image innerClassName(Object value)
    {
        return set("innerClassName", value);
    }

    /**
     * 关联字段名，也可以直接配置 src
     */
    public Image name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Image onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 大图地址，不设置用 src
     */
    public Image originalSrc(Object value)
    {
        return set("originalSrc", value);
    }

    /**
     * 是否展示图片工具栏
     */
    public Image showToolbar(boolean value)
    {
        return set("showToolbar", value);
    }

    /**
     * 图片地址，如果配置了 name，这个属性不用配置。
     */
    public Image src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public Image staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Image staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Image staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Image staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Image staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Image staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Image staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Image style(Object value)
    {
        return set("style", value);
    }

    /**
     * 图片缩略图外层 css 类名
     */
    public Image thumbClassName(Object value)
    {
        return set("thumbClassName", value);
    }

    /**
     * 预览图模式 可选值: w-full | h-full | contain | cover
     */
    public Image thumbMode(Object value)
    {
        return set("thumbMode", value);
    }

    /**
     * 预览图比率 可选值: 1:1 | 4:3 | 16:9
     */
    public Image thumbRatio(Object value)
    {
        return set("thumbRatio", value);
    }

    /**
     * 图片标题
     */
    public Image title(Object value)
    {
        return set("title", value);
    }

    /**
     * 工具栏配置
     */
    public Image toolbarActions(Object value)
    {
        return set("toolbarActions", value);
    }

    /**
     * 指定为图片展示类型 可选值: image | static-image
     */
    public Image type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Image visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Image visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 宽度
     */
    public Image width(Object value)
    {
        return set("width", value);
    }

    public Image set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
