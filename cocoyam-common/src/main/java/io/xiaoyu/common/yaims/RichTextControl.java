package io.xiaoyu.common.yaims;


/**
 * RichText 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/input-rich-text
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class RichTextControl extends BaseRenderer{

    public RichTextControl()
    {
        set("type", "input-rich-text");
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public RichTextControl borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public RichTextControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public RichTextControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public RichTextControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public RichTextControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public RichTextControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public RichTextControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public RichTextControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 接收器的字段名
     */
    public RichTextControl fileField(Object value)
    {
        return set("fileField", value);
    }

    /**
     * 是否隐藏
     */
    public RichTextControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public RichTextControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public RichTextControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public RichTextControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public RichTextControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public RichTextControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public RichTextControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public RichTextControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public RichTextControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public RichTextControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public RichTextControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public RichTextControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public RichTextControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public RichTextControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public RichTextControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * tinymce 或 froala 的配置
     */
    public RichTextControl options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public RichTextControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public RichTextControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public RichTextControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 图片保存 API
     */
    public RichTextControl receiver(Object value)
    {
        return set("receiver", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public RichTextControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public RichTextControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public RichTextControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public RichTextControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public RichTextControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public RichTextControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public RichTextControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public RichTextControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public RichTextControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public RichTextControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public RichTextControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public RichTextControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public RichTextControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public RichTextControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public RichTextControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public RichTextControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public RichTextControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public RichTextControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 编辑器类型 可选值: froala | tinymce
     */
    public RichTextControl vendor(Object value)
    {
        return set("vendor", value);
    }

    /**
     * 视频保存 API
     */
    public RichTextControl videoReceiver(Object value)
    {
        return set("videoReceiver", value);
    }

    /**
     * 是否显示
     */
    public RichTextControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public RichTextControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public RichTextControl width(Object value)
    {
        return set("width", value);
    }

    public RichTextControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
