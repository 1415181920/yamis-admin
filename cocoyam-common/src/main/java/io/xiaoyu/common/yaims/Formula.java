package io.xiaoyu.common.yaims;



/**
 * 公式功能控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/formula
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Formula extends BaseRenderer {

    public Formula()
    {
        set("type", "formula");
    }

    /**
     * 是否自动应用
     */
    public Formula autoSet(boolean value)
    {
        return set("autoSet", value);
    }

    /**
     * 容器 css 类名
     */
    public Formula className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Formula clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 触发公式的作用条件，如 data.xxx == "a" 或者 {xx}
     */
    public Formula condition(Object value)
    {
        return set("condition", value);
    }

    public Formula desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Formula description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Formula descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Formula disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Formula disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 公式
     */
    public Formula formula(Object value)
    {
        return set("formula", value);
    }

    /**
     * 是否隐藏
     */
    public Formula hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Formula hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Formula hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Formula horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 当某个按钮的目标指定为此值后，会触发一次公式应用。这个机制可以在 autoSet 为 false 时用来手动触发
     */
    public Formula id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否初始应用
     */
    public Formula initSet(boolean value)
    {
        return set("initSet", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Formula inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Formula inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public Formula label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Formula labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Formula labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Formula labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Formula labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Formula mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，公式结果将作用到此处指定的变量中去
     */
    public Formula name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Formula onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Formula placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Formula readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Formula readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Formula remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Formula required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Formula size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Formula staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Formula staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Formula staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Formula staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Formula staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Formula staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Formula staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Formula style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Formula submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为公式功能控件。
     */
    public Formula type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Formula validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Formula validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Formula validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Formula validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Formula value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Formula visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Formula visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Formula width(Object value)
    {
        return set("width", value);
    }


    public Formula set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
