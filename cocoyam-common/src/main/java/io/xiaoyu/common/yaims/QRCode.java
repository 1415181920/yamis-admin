package io.xiaoyu.common.yaims;



/**
 * 二维码展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/qrcode
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class QRCode extends BaseRenderer 
{
    public QRCode()
    {
        set("type", "qrcode");

    }

    /**
     * 背景色
     */
    public QRCode backgroundColor(Object value)
    {
        return set("backgroundColor", value);
    }

    /**
     * 容器 css 类名
     */
    public QRCode className(Object value)
    {
        return set("className", value);
    }

    /**
     * 二维码的宽高大小，默认 128
     */
    public QRCode codeSize(Object value)
    {
        return set("codeSize", value);
    }

    /**
     * 是否禁用
     */
    public QRCode disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public QRCode disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 前景色
     */
    public QRCode foregroundColor(Object value)
    {
        return set("foregroundColor", value);
    }

    /**
     * 是否隐藏
     */
    public QRCode hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public QRCode hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public QRCode id(Object value)
    {
        return set("id", value);
    }

    /**
     * 图片配置
     */
    public QRCode imageSettings(Object value)
    {
        return set("imageSettings", value);
    }

    /**
     * 二维码复杂级别 可选值: L | M | Q | H
     */
    public QRCode level(Object value)
    {
        return set("level", value);
    }

    /**
     * 关联字段名。
     */
    public QRCode name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public QRCode onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public QRCode placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * css 类名
     */
    public QRCode qrcodeClassName(Object value)
    {
        return set("qrcodeClassName", value);
    }

    /**
     * 是否静态展示
     */
    public QRCode staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public QRCode staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public QRCode staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public QRCode staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public QRCode staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public QRCode staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public QRCode staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public QRCode style(Object value)
    {
        return set("style", value);
    }

    /**
     *  可选值: qrcode | qr-code
     */
    public QRCode type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public QRCode visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public QRCode visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public QRCode set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
