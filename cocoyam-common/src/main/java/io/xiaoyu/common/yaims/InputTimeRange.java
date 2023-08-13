package io.xiaoyu.common.yaims;



/**
 * InputTimeRange 时间范围
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputTimeRange extends BaseRenderer 
{
    public InputTimeRange()
    {
        set("type", "input-time-range");

    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputTimeRange autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputTimeRange className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否可清除。
     */
    public InputTimeRange clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 表单项描述
     */
    public InputTimeRange description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputTimeRange disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputTimeRange disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否内联模式。
     */
    public InputTimeRange embed(boolean value)
    {
        return set("embed", value);
    }

    /**
     * 时间范围选择器值格式
     */
    public InputTimeRange format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否内联
     */
    public InputTimeRange inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputTimeRange inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 时间范围选择器显示格式
     */
    public InputTimeRange inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 表单项标签
     */
    public InputTimeRange label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputTimeRange labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputTimeRange labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputTimeRange labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputTimeRange name(Object value)
    {
        return set("name", value);
    }

    /**
     * 占位文本
     */
    public InputTimeRange placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否必填
     */
    public InputTimeRange required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputTimeRange requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputTimeRange submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 时间范围选择器值格式
     */
    public InputTimeRange timeFormat(Object value)
    {
        return set("timeFormat", value);
    }

    /**
     * 指定为 input-time-range 渲染器。
     */
    public InputTimeRange type(Object value)
    {
        return set("type", value);
    }

    /**
     * 表单校验接口
     */
    public InputTimeRange validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputTimeRange validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputTimeRange value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否可见
     */
    public InputTimeRange visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputTimeRange visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputTimeRange set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
