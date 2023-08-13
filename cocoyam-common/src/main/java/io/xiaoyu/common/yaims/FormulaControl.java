package io.xiaoyu.common.yaims;



/**
 * 公式功能控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/formula
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class FormulaControl extends BaseRenderer 
{
    public FormulaControl()
    {
        set("type", "formula");

    }

    /**
     * 是否自动应用
     */
    public FormulaControl autoSet(boolean value)
    {
        return set("autoSet", value);
    }

    /**
     * 容器 css 类名
     */
    public FormulaControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public FormulaControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 触发公式的作用条件，如 data.xxx == "a" 或者 {xx}
     */
    public FormulaControl condition(Object value)
    {
        return set("condition", value);
    }

    public FormulaControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public FormulaControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public FormulaControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public FormulaControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public FormulaControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 公式
     */
    public FormulaControl formula(Object value)
    {
        return set("formula", value);
    }

    /**
     * 是否隐藏
     */
    public FormulaControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public FormulaControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public FormulaControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public FormulaControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 当某个按钮的目标指定为此值后，会触发一次公式应用。这个机制可以在 autoSet 为 false 时用来手动触发
     */
    public FormulaControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否初始应用
     */
    public FormulaControl initSet(boolean value)
    {
        return set("initSet", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public FormulaControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public FormulaControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public FormulaControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public FormulaControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public FormulaControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public FormulaControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public FormulaControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public FormulaControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，公式结果将作用到此处指定的变量中去
     */
    public FormulaControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public FormulaControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public FormulaControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public FormulaControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public FormulaControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public FormulaControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public FormulaControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public FormulaControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public FormulaControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public FormulaControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public FormulaControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public FormulaControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public FormulaControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public FormulaControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public FormulaControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public FormulaControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public FormulaControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为公式功能控件。
     */
    public FormulaControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public FormulaControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public FormulaControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public FormulaControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public FormulaControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public FormulaControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public FormulaControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public FormulaControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public FormulaControl width(Object value)
    {
        return set("width", value);
    }

    public FormulaControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
