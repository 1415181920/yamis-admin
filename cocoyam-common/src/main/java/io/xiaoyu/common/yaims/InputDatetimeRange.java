package io.xiaoyu.common.yaims;



/**
 * InputDatetimeRange 日期时间范围
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputDatetimeRange extends BaseRenderer 
{
    public InputDatetimeRange()
    {
        set("type", "input-datetime-range");

    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputDatetimeRange autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputDatetimeRange className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否可清除
     */
    public InputDatetimeRange clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 表单项描述
     */
    public InputDatetimeRange description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputDatetimeRange disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputDatetimeRange disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 日期时间选择器值格式
     */
    public InputDatetimeRange format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否内联
     */
    public InputDatetimeRange inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputDatetimeRange inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 日期时间选择器显示格式
     */
    public InputDatetimeRange inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 表单项标签
     */
    public InputDatetimeRange label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputDatetimeRange labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputDatetimeRange labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputDatetimeRange labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 限制最大日期时间，用法同 限制范围
     */
    public InputDatetimeRange maxDate(Object value)
    {
        return set("maxDate", value);
    }

    /**
     * 限制最小日期时间，用法同 限制范围
     */
    public InputDatetimeRange minDate(Object value)
    {
        return set("minDate", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputDatetimeRange name(Object value)
    {
        return set("name", value);
    }

    /**
     * 表单项描述
     */
    public InputDatetimeRange placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 日期范围快捷键
     */
    public InputDatetimeRange ranges(Object value)
    {
        return set("ranges", value);
    }

    /**
     * 是否必填
     */
    public InputDatetimeRange required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputDatetimeRange requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputDatetimeRange submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 input-datetime-range 渲染器。
     */
    public InputDatetimeRange type(Object value)
    {
        return set("type", value);
    }

    /**
     * 保存 UTC 值
     */
    public InputDatetimeRange utc(boolean value)
    {
        return set("utc", value);
    }

    /**
     * 表单校验接口
     */
    public InputDatetimeRange validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputDatetimeRange validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputDatetimeRange value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public InputDatetimeRange visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputDatetimeRange visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputDatetimeRange set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
