package io.xiaoyu.common.yaims;



/**
 * 年份选择控件
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Year extends BaseRenderer {

    public Year()
    {
        set("type", "input-year");
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public Year borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public Year className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Year clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否显示清除按钮
     */
    public Year clearable(boolean value)
    {
        return set("clearable", value);
    }

    public Year desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Year description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Year descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Year disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Year disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否为内联模式？
     */
    public Year emebed(boolean value)
    {
        return set("emebed", value);
    }

    /**
     * 月份存储格式
     */
    public Year format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否隐藏
     */
    public Year hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Year hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Year hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Year horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Year id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Year inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Year inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 月份展示格式
     */
    public Year inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 描述标题
     */
    public Year label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Year labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Year labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Year labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Year labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Year mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Year name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Year onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Year placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Year readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Year readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Year remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Year required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Year size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Year staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Year staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Year staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Year staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Year staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Year staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Year staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Year style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Year submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为月份时间选择控件
     */
    public Year type(String value)
    {
        return set("type", value);
    }

    /**
     * 设定是否存储 utc 时间。
     */
    public Year utc(boolean value)
    {
        return set("utc", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Year validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Year validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Year validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Year validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Year value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Year visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Year visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Year width(Object value)
    {
        return set("width", value);
    }


    public Year set(String key, Object value) {
        super.set(key, value);
        return this;
    }


}
