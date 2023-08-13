package io.xiaoyu.common.yaims;



/**
 * Switch 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/switch
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Switch extends BaseRenderer {

    public Switch()
    {
        set("type", "switch");
    }

    /**
     * 容器 css 类名
     */
    public Switch className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Switch clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public Switch desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Switch description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Switch descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Switch disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Switch disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 未勾选值
     */
    public Switch falseValue(Object value)
    {
        return set("falseValue", value);
    }

    /**
     * 是否隐藏
     */
    public Switch hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Switch hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Switch hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Switch horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Switch id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Switch inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Switch inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public Switch label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Switch labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Switch labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Switch labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Switch labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Switch mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Switch name(Object value)
    {
        return set("name", value);
    }

    /**
     * 关闭时显示的内容
     */
    public Switch offText(Object value)
    {
        return set("offText", value);
    }

    /**
     * 事件动作配置
     */
    public Switch onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 开启时显示的内容
     */
    public Switch onText(Object value)
    {
        return set("onText", value);
    }

    /**
     * 选项说明
     */
    public Switch option(Object value)
    {
        return set("option", value);
    }

    /**
     * 占位符
     */
    public Switch placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Switch readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Switch readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Switch remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Switch required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 开关尺寸 可选值: sm | md
     */
    public Switch size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Switch staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Switch staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Switch staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Switch staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Switch staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Switch staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Switch staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Switch style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Switch submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 勾选值
     */
    public Switch trueValue(Object value)
    {
        return set("trueValue", value);
    }

    /**
     * 指定为多行文本输入框
     */
    public Switch type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Switch validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Switch validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Switch validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Switch validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Switch value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Switch visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Switch visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Switch width(Object value)
    {
        return set("width", value);
    }


    public Switch set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
