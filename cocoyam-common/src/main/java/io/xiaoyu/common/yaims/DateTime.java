package io.xiaoyu.common.yaims;



/**
 * Datetime日期时间选择控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/datetime
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class DateTime extends BaseRenderer {

    public DateTime()
    {
        set("type", "input-datetime");
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public DateTime borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public DateTime className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public DateTime clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否显示清除按钮
     */
    public DateTime clearable(boolean value)
    {
        return set("clearable", value);
    }

    public DateTime desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public DateTime description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public DateTime descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public DateTime disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public DateTime disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否为内联模式？
     */
    public DateTime emebed(boolean value)
    {
        return set("emebed", value);
    }

    /**
     * 日期存储格式
     */
    public DateTime format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否隐藏
     */
    public DateTime hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public DateTime hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public DateTime hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public DateTime horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public DateTime id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public DateTime inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public DateTime inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 日期展示格式
     */
    public DateTime inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 描述标题
     */
    public DateTime label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public DateTime labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public DateTime labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public DateTime labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public DateTime labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 限制最大日期
     */
    public DateTime maxDate(Object value)
    {
        return set("maxDate", value);
    }

    /**
     * 限制最小日期
     */
    public DateTime minDate(Object value)
    {
        return set("minDate", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public DateTime mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public DateTime name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public DateTime onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public DateTime placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public DateTime readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public DateTime readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public DateTime remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public DateTime required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public DateTime size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public DateTime staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public DateTime staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public DateTime staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public DateTime staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public DateTime staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public DateTime staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public DateTime staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public DateTime style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public DateTime submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 时间输入范围限制
     */
    public DateTime timeConstraints(Object value)
    {
        return set("timeConstraints", value);
    }

    /**
     * 时间的格式。
     */
    public DateTime timeFormat(Object value)
    {
        return set("timeFormat", value);
    }

    /**
     * 指定为日期时间选择控件
     */
    public DateTime type(Object value)
    {
        return set("type", value);
    }

    /**
     * 设定是否存储 utc 时间。
     */
    public DateTime utc(boolean value)
    {
        return set("utc", value);
    }

    /**
     * 远端校验表单项接口
     */
    public DateTime validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public DateTime validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public DateTime validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public DateTime validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public DateTime value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public DateTime visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public DateTime visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public DateTime width(Object value)
    {
        return set("width", value);
    }


    public DateTime set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
