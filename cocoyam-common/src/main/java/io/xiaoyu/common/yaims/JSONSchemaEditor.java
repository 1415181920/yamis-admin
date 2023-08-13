package io.xiaoyu.common.yaims;



/**
 * JSON Schema Editor 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/json-schema-editor
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class JSONSchemaEditor extends BaseRenderer {

    public JSONSchemaEditor()
    {
        set("type", "json-schema-editor");
    }

    /**
     * 自定义详情配置面板如：{   boolean: [      {type: "input-text", name: "aa", label: "AA" }   ] }当配置布尔字段详情时，就会出现以上配置
     */
    public JSONSchemaEditor advancedSettings(Object value)
    {
        return set("advancedSettings", value);
    }

    /**
     * 容器 css 类名
     */
    public JSONSchemaEditor className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public JSONSchemaEditor clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 可以理解为类型模板，方便快速定义复杂类型
     */
    public JSONSchemaEditor definitions(Object value)
    {
        return set("definitions", value);
    }

    public JSONSchemaEditor desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public JSONSchemaEditor description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public JSONSchemaEditor descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public JSONSchemaEditor disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public JSONSchemaEditor disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 禁用类型，默认禁用了 null 类型
     */
    public JSONSchemaEditor disabledTypes(Object value)
    {
        return set("disabledTypes", value);
    }

    /**
     * 开启详情配置
     */
    public JSONSchemaEditor enableAdvancedSetting(boolean value)
    {
        return set("enableAdvancedSetting", value);
    }

    /**
     * 是否隐藏
     */
    public JSONSchemaEditor hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public JSONSchemaEditor hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public JSONSchemaEditor hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public JSONSchemaEditor horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public JSONSchemaEditor id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public JSONSchemaEditor inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public JSONSchemaEditor inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public JSONSchemaEditor label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public JSONSchemaEditor labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public JSONSchemaEditor labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public JSONSchemaEditor labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public JSONSchemaEditor labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public JSONSchemaEditor mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public JSONSchemaEditor name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public JSONSchemaEditor onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 各属性输入控件的占位提示文本{   key: "key placeholder",   title: "title placeholder",   description: "description placeholder",   default: "default placeholder" }
     */
    public JSONSchemaEditor placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public JSONSchemaEditor readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public JSONSchemaEditor readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public JSONSchemaEditor remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public JSONSchemaEditor required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 顶层是否允许修改类型
     */
    public JSONSchemaEditor rootTypeMutable(boolean value)
    {
        return set("rootTypeMutable", value);
    }

    /**
     * 顶层类型信息是否隐藏
     */
    public JSONSchemaEditor showRootInfo(boolean value)
    {
        return set("showRootInfo", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public JSONSchemaEditor size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public JSONSchemaEditor staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public JSONSchemaEditor staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public JSONSchemaEditor staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public JSONSchemaEditor staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public JSONSchemaEditor staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public JSONSchemaEditor staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public JSONSchemaEditor staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public JSONSchemaEditor style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public JSONSchemaEditor submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 JSON Schema Editor
     */
    public JSONSchemaEditor type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public JSONSchemaEditor validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public JSONSchemaEditor validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public JSONSchemaEditor validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public JSONSchemaEditor validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public JSONSchemaEditor value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public JSONSchemaEditor visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public JSONSchemaEditor visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public JSONSchemaEditor width(Object value)
    {
        return set("width", value);
    }


    public JSONSchemaEditor set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
