package io.xiaoyu.common.yaims;



/**
 * 数字输入框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/number
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class NumberControl extends BaseRenderer 
{
    public NumberControl()
    {
        set("type", "input-number");

    }

    /**
     * 是否是大数，如果是的话输入输出都将是字符串
     */
    public NumberControl big(boolean value)
    {
        return set("big", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public NumberControl borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public NumberControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public NumberControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public NumberControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public NumberControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public NumberControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public NumberControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public NumberControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 输入框为基础输入框还是加强输入框 可选值: base | enhance
     */
    public NumberControl displayMode(Object value)
    {
        return set("displayMode", value);
    }

    /**
     * 是否隐藏
     */
    public NumberControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public NumberControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public NumberControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public NumberControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public NumberControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public NumberControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public NumberControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 是否启用键盘行为
     */
    public NumberControl keyboard(boolean value)
    {
        return set("keyboard", value);
    }

    /**
     * 是否千分分隔
     */
    public NumberControl kilobitSeparator(boolean value)
    {
        return set("kilobitSeparator", value);
    }

    /**
     * 描述标题
     */
    public NumberControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public NumberControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public NumberControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public NumberControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public NumberControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 最大值
     */
    public NumberControl max(Object value)
    {
        return set("max", value);
    }

    /**
     * 最小值
     */
    public NumberControl min(Object value)
    {
        return set("min", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public NumberControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public NumberControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public NumberControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public NumberControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 精度
     */
    public NumberControl precision(Object value)
    {
        return set("precision", value);
    }

    /**
     * 前缀
     */
    public NumberControl prefix(Object value)
    {
        return set("prefix", value);
    }

    /**
     * 只读
     */
    public NumberControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public NumberControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public NumberControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public NumberControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 默认当然是
     */
    public NumberControl showSteps(boolean value)
    {
        return set("showSteps", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public NumberControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public NumberControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public NumberControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public NumberControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public NumberControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public NumberControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public NumberControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public NumberControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 步长
     */
    public NumberControl step(Object value)
    {
        return set("step", value);
    }

    /**
     * 组件样式
     */
    public NumberControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public NumberControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 后缀
     */
    public NumberControl suffix(Object value)
    {
        return set("suffix", value);
    }

    /**
     * 表单项类型
     */
    public NumberControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 单位列表
     */
    public NumberControl unitOptions(Object value)
    {
        return set("unitOptions", value);
    }

    /**
     * 远端校验表单项接口
     */
    public NumberControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public NumberControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public NumberControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public NumberControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public NumberControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public NumberControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public NumberControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public NumberControl width(Object value)
    {
        return set("width", value);
    }

    public NumberControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
