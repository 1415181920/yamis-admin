package io.xiaoyu.common.yaims;



/**
 * InputYearRange 年份范围
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputYearRange extends BaseRenderer 
{
    public InputYearRange()
    {
        set("type", "input-year-range");

    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputYearRange autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputYearRange className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否可清除。
     */
    public InputYearRange clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 表单项描述
     */
    public InputYearRange description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputYearRange disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputYearRange disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否内联模式。
     */
    public InputYearRange embed(boolean value)
    {
        return set("embed", value);
    }

    /**
     * 年份选择器值格式
     */
    public InputYearRange format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否内联
     */
    public InputYearRange inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputYearRange inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 年份选择器显示格式
     */
    public InputYearRange inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 表单项标签
     */
    public InputYearRange label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputYearRange labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputYearRange labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputYearRange labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 限制最大日期，用法同 限制范围
     */
    public InputYearRange maxDate(Object value)
    {
        return set("maxDate", value);
    }

    /**
     * 限制最大跨度，如：4year
     */
    public InputYearRange maxDuration(Object value)
    {
        return set("maxDuration", value);
    }

    /**
     * 限制最小日期，用法同 限制范围
     */
    public InputYearRange minDate(Object value)
    {
        return set("minDate", value);
    }

    /**
     * 限制最小跨度，如： 2year
     */
    public InputYearRange minDuration(Object value)
    {
        return set("minDuration", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputYearRange name(Object value)
    {
        return set("name", value);
    }

    /**
     * 占位文本
     */
    public InputYearRange placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否必填
     */
    public InputYearRange required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputYearRange requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputYearRange submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 input-year-range 渲染器。
     */
    public InputYearRange type(Object value)
    {
        return set("type", value);
    }

    /**
     * 保存 UTC 值
     */
    public InputYearRange utc(boolean value)
    {
        return set("utc", value);
    }

    /**
     * 表单校验接口
     */
    public InputYearRange validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputYearRange validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputYearRange value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否可见
     */
    public InputYearRange visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputYearRange visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputYearRange set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
