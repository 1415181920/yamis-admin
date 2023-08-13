package io.xiaoyu.common.yaims;



/**
 * TextArea 多行文本输入框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/textarea
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TextareaControl extends BaseRenderer 
{
    public TextareaControl()
    {
        set("type", "textarea");

    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public TextareaControl borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public TextareaControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public TextareaControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 输入内容是否可清除
     */
    public TextareaControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    public TextareaControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public TextareaControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public TextareaControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public TextareaControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TextareaControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public TextareaControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TextareaControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public TextareaControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public TextareaControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TextareaControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public TextareaControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public TextareaControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public TextareaControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public TextareaControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public TextareaControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public TextareaControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public TextareaControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 限制文字个数
     */
    public TextareaControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 最大行数
     */
    public TextareaControl maxRows(Object value)
    {
        return set("maxRows", value);
    }

    /**
     * 最小行数
     */
    public TextareaControl minRows(Object value)
    {
        return set("minRows", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public TextareaControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public TextareaControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public TextareaControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public TextareaControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public TextareaControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public TextareaControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public TextareaControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public TextareaControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 重置值
     */
    public TextareaControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 是否显示计数
     */
    public TextareaControl showCounter(boolean value)
    {
        return set("showCounter", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public TextareaControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public TextareaControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TextareaControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TextareaControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TextareaControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TextareaControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TextareaControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TextareaControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public TextareaControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public TextareaControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为多行文本输入框
     */
    public TextareaControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public TextareaControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public TextareaControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public TextareaControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public TextareaControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public TextareaControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public TextareaControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TextareaControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public TextareaControl width(Object value)
    {
        return set("width", value);
    }

    public TextareaControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
