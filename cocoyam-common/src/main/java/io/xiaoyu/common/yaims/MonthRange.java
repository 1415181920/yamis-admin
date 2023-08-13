package io.xiaoyu.common.yaims;



/**
 * MonthRange 月范围控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/month-range
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class MonthRange extends BaseRenderer {

    public MonthRange()
    {
        set("type", "input-month-range");
    }

    /**
     * 是否启用游标动画，默认开启
     */
    public MonthRange animation(boolean value)
    {
        return set("animation", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public MonthRange borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public MonthRange className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public MonthRange clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 分割符, 因为有两个值，开始时间和结束时间，所以要有连接符。默认为英文逗号。
     */
    public MonthRange delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public MonthRange desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public MonthRange description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public MonthRange descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public MonthRange disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public MonthRange disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 开启后变成非弹出模式，即内联模式。
     */
    public MonthRange embed(boolean value)
    {
        return set("embed", value);
    }

    /**
     * 日期范围结束时间-占位符
     */
    public MonthRange endPlaceholder(Object value)
    {
        return set("endPlaceholder", value);
    }

    /**
     * 默认 `X` 即时间戳格式，用来提交的时间格式。更多格式类型请参考 moment.
     */
    public MonthRange format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否隐藏
     */
    public MonthRange hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public MonthRange hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public MonthRange hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public MonthRange horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public MonthRange id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public MonthRange inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public MonthRange inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 默认 `YYYY-MM-DD` 用来配置显示的时间格式。
     */
    public MonthRange inputFormat(Object value)
    {
        return set("inputFormat", value);
    }

    /**
     * 开启后将选中的选项 value 的值用连接符拼接起来，作为当前表单项的值。如： `value1,value2` 否则为 `[value1, value2]`
     */
    public MonthRange joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public MonthRange label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public MonthRange labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public MonthRange labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public MonthRange labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public MonthRange labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 最大日期限制，支持变量 xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
     */
    public MonthRange maxDate(Object value)
    {
        return set("maxDate", value);
    }

    /**
     * 最大跨度，比如 2days
     */
    public MonthRange maxDuration(Object value)
    {
        return set("maxDuration", value);
    }

    /**
     * 最小日期限制，支持变量 xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
     */
    public MonthRange minDate(Object value)
    {
        return set("minDate", value);
    }

    /**
     * 最小跨度，比如 2days
     */
    public MonthRange minDuration(Object value)
    {
        return set("minDuration", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public MonthRange mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public MonthRange name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public MonthRange onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public MonthRange placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 日期范围快捷键
     */
    public MonthRange ranges(Object value)
    {
        return set("ranges", value);
    }

    /**
     * 是否只读
     */
    public MonthRange readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public MonthRange readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public MonthRange remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public MonthRange required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public MonthRange size(Object value)
    {
        return set("size", value);
    }

    /**
     * 日期范围开始时间-占位符
     */
    public MonthRange startPlaceholder(Object value)
    {
        return set("startPlaceholder", value);
    }

    /**
     * 是否静态展示
     */
    public MonthRange staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public MonthRange staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public MonthRange staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public MonthRange staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public MonthRange staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public MonthRange staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public MonthRange staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public MonthRange style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public MonthRange submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    public MonthRange type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public MonthRange validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public MonthRange validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public MonthRange validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public MonthRange validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 这里面 value 需要特殊说明一下，因为支持相对值。* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
     */
    public MonthRange value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public MonthRange visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public MonthRange visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public MonthRange width(Object value)
    {
        return set("width", value);
    }


    public MonthRange set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
