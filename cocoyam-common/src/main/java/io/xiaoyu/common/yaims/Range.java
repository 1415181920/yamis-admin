package io.xiaoyu.common.yaims;



/**
 * RangeControl
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Range extends BaseRenderer {

    public Range()
    {
        set("type", "input-range");
    }

    /**
     * 容器 css 类名
     */
    public Range className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Range clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 输入框是否可清除
     */
    public Range clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 分隔符
     */
    public Range delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public Range desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Range description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Range descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Range disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Range disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Range hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Range hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Range hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Range horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Range id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Range inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Range inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 是否通过分隔符连接
     */
    public Range joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public Range label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Range labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Range labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Range labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Range labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 刻度
     */
    public Range marks(Object value)
    {
        return set("marks", value);
    }

    /**
     * 最大值
     */
    public Range max(Object value)
    {
        return set("max", value);
    }

    /**
     * 最小值
     */
    public Range min(Object value)
    {
        return set("min", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Range mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为双滑块
     */
    public Range multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Range name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Range onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 分割块数
     */
    public Range parts(Object value)
    {
        return set("parts", value);
    }

    /**
     * 占位符
     */
    public Range placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Range readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Range readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Range remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Range required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 是否展示输入框
     */
    public Range showInput(boolean value)
    {
        return set("showInput", value);
    }

    /**
     * 是否展示步长
     */
    public Range showSteps(boolean value)
    {
        return set("showSteps", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Range size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Range staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Range staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Range staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Range staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Range staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Range staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Range staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 步长
     */
    public Range step(Object value)
    {
        return set("step", value);
    }

    /**
     * 组件样式
     */
    public Range style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Range submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 标签方向
     */
    public Range tooltipPlacement(Object value)
    {
        return set("tooltipPlacement", value);
    }

    /**
     * 是否展示标签
     */
    public Range tooltipVisible(boolean value)
    {
        return set("tooltipVisible", value);
    }

    /**
     * 表单项类型
     */
    public Range type(Object value)
    {
        return set("type", value);
    }

    /**
     * 单位
     */
    public Range unit(Object value)
    {
        return set("unit", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Range validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Range validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Range validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Range validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 滑块值
     */
    public Range value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Range visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Range visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Range width(Object value)
    {
        return set("width", value);
    }


    public Range set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
