package io.xiaoyu.common.yaims;



/**
 * SubForm 子表单 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/subform
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SubFormControl extends BaseRenderer 
{
    public SubFormControl()
    {
        set("type", "input-sub-form");

    }

    /**
     * 新增按钮 CSS 类名
     */
    public SubFormControl addButtonClassName(Object value)
    {
        return set("addButtonClassName", value);
    }

    /**
     * 新增按钮文字
     */
    public SubFormControl addButtonText(Object value)
    {
        return set("addButtonText", value);
    }

    /**
     * 是否可新增
     */
    public SubFormControl addable(boolean value)
    {
        return set("addable", value);
    }

    /**
     * 按钮默认名称
     */
    public SubFormControl btnLabel(Object value)
    {
        return set("btnLabel", value);
    }

    /**
     * 容器 css 类名
     */
    public SubFormControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public SubFormControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public SubFormControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public SubFormControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public SubFormControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public SubFormControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public SubFormControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可拖拽排序
     */
    public SubFormControl draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 拖拽提示信息
     */
    public SubFormControl draggableTip(Object value)
    {
        return set("draggableTip", value);
    }

    /**
     * 子表单详情
     */
    public SubFormControl form(Object value)
    {
        return set("form", value);
    }

    /**
     * 是否隐藏
     */
    public SubFormControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public SubFormControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public SubFormControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public SubFormControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public SubFormControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public SubFormControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public SubFormControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 值元素的类名
     */
    public SubFormControl itemClassName(Object value)
    {
        return set("itemClassName", value);
    }

    /**
     * 值列表元素的类名
     */
    public SubFormControl itemsClassName(Object value)
    {
        return set("itemsClassName", value);
    }

    /**
     * 描述标题
     */
    public SubFormControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public SubFormControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public SubFormControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 当值中存在这个字段，则按钮名称将使用此字段的值来展示。
     */
    public SubFormControl labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public SubFormControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public SubFormControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 最多个数
     */
    public SubFormControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 最少个数
     */
    public SubFormControl minLength(Object value)
    {
        return set("minLength", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public SubFormControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否多选
     */
    public SubFormControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public SubFormControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public SubFormControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public SubFormControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public SubFormControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public SubFormControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public SubFormControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public SubFormControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public SubFormControl required(boolean value)
    {
        return set("required", value);
    }

    public SubFormControl scaffold(Object value)
    {
        return set("scaffold", value);
    }

    /**
     * 是否在左下角显示报错信息
     */
    public SubFormControl showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public SubFormControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public SubFormControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public SubFormControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public SubFormControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public SubFormControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public SubFormControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public SubFormControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public SubFormControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public SubFormControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public SubFormControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 SubForm 子表单
     */
    public SubFormControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public SubFormControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public SubFormControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public SubFormControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public SubFormControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public SubFormControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public SubFormControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public SubFormControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public SubFormControl width(Object value)
    {
        return set("width", value);
    }

    public SubFormControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
