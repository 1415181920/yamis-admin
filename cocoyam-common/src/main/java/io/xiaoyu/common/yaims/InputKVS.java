package io.xiaoyu.common.yaims;



/**
 * InputKVS 键值对象
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputKVS extends BaseRenderer 
{
    public InputKVS()
    {
        set("type", "input-kvs");

    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputKVS autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputKVS className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项描述
     */
    public InputKVS description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputKVS disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputKVS disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否内联
     */
    public InputKVS inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputKVS inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 表单项标签
     */
    public InputKVS label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputKVS labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputKVS labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputKVS labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputKVS name(Object value)
    {
        return set("name", value);
    }

    /**
     * 表单项描述
     */
    public InputKVS placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否必填
     */
    public InputKVS required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputKVS requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputKVS submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 input-kvs 渲染器。
     */
    public InputKVS type(Object value)
    {
        return set("type", value);
    }

    /**
     * 表单校验接口
     */
    public InputKVS validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputKVS validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputKVS value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否可见
     */
    public InputKVS visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputKVS visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputKVS set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
