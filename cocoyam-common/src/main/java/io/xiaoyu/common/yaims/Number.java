package io.xiaoyu.common.yaims;



/**
 * 数字输入框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/number
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Number extends BaseRenderer {

    public Number()
    {
        set("type", "input-number");
    }

    /**
     * 是否是大数，如果是的话输入输出都将是字符串
     */
    public Number big(boolean value)
    {
        return set("big", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public Number borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public Number className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Number clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public Number desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Number description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Number descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Number disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Number disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 输入框为基础输入框还是加强输入框 可选值: base | enhance
     */
    public Number displayMode(Object value)
    {
        return set("displayMode", value);
    }

    /**
     * 是否隐藏
     */
    public Number hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Number hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Number hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Number horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Number id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Number inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Number inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 是否启用键盘行为
     */
    public Number keyboard(boolean value)
    {
        return set("keyboard", value);
    }

    /**
     * 是否千分分隔
     */
    public Number kilobitSeparator(boolean value)
    {
        return set("kilobitSeparator", value);
    }

    /**
     * 描述标题
     */
    public Number label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Number labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Number labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Number labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Number labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 最大值
     */
    public Number max(Object value)
    {
        return set("max", value);
    }

    /**
     * 最小值
     */
    public Number min(Object value)
    {
        return set("min", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Number mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Number name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Number onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Number placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 精度
     */
    public Number precision(Object value)
    {
        return set("precision", value);
    }

    /**
     * 前缀
     */
    public Number prefix(Object value)
    {
        return set("prefix", value);
    }

    /**
     * 只读
     */
    public Number readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Number readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Number remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Number required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 默认当然是
     */
    public Number showSteps(boolean value)
    {
        return set("showSteps", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Number size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Number staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Number staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Number staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Number staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Number staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Number staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Number staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 步长
     */
    public Number step(Object value)
    {
        return set("step", value);
    }

    /**
     * 组件样式
     */
    public Number style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Number submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 后缀
     */
    public Number suffix(Object value)
    {
        return set("suffix", value);
    }

    /**
     * 表单项类型
     */
    public Number type(Object value)
    {
        return set("type", value);
    }

    /**
     * 单位列表
     */
    public Number unitOptions(Object value)
    {
        return set("unitOptions", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Number validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Number validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Number validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Number validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Number value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Number visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Number visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Number width(Object value)
    {
        return set("width", value);
    }

    public Number set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
