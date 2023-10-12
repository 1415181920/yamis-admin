package io.xiaoyu.common.yaims;



/**
 * Options 选择器表单项
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Options extends BaseRenderer 
{
    public Options()
    {
        set("type","options");
    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public Options autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public Options className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项描述
     */
    public Options description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public Options disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public Options disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否把选中的值从数组中提取出来，只有当 joinValues 为 true 时生效
     */
    public Options extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否内联
     */
    public Options inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public Options inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 每个选项的高度，用于虚拟渲染
     */
    public Options itemHeight(Object value)
    {
        return set("itemHeight", value);
    }

    /**
     * 多选时，是否把选中的值用逗号拼接成字符串
     */
    public Options joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 表单项标签
     */
    public Options label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public Options labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public Options labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 标识选项中哪个字段是label值
     */
    public Options labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 表单项标签描述
     */
    public Options labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 是否支持多选
     */
    public Options multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public Options name(Object value)
    {
        return set("name", value);
    }

    /**
     * 选项组，供用户选择
     */
    public Options options(Object value)
    {
        return set("options", value);
    }

    /**
     * 是否必填
     */
    public Options required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public Options requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 选项组源，可通过数据映射获取当前数据域变量、或者配置 API 对象
     */
    public Options source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public Options submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单校验接口
     */
    public Options validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public Options validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public Options value(Object value)
    {
        return set("value", value);
    }

    /**
     * 标识选项中哪个字段是value值
     */
    public Options valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 默认情况下多选所有选项都会显示，通过这个可以最多显示一行，超出的部分变成 ...
     */
    public Options valuesNoWrap(boolean value)
    {
        return set("valuesNoWrap", value);
    }

    /**
     * 在选项数量超过多少时开启虚拟渲染
     */
    public Options virtualThreshold(Object value)
    {
        return set("virtualThreshold", value);
    }

    /**
     * 是否可见
     */
    public Options visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public Options visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Options set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
