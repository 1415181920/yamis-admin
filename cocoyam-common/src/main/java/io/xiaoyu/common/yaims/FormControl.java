package io.xiaoyu.common.yaims;



/**
 * Group 表单集合渲染器，能让多个表单在一行显示 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/group
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class FormControl extends BaseRenderer 
{
    public FormControl()
    {
        set("type", "control");

    }

    /**
     * FormItem 内容
     */
    public FormControl body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public FormControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public FormControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public FormControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public FormControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public FormControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public FormControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public FormControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public FormControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public FormControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public FormControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public FormControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public FormControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public FormControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public FormControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public FormControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public FormControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public FormControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public FormControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public FormControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public FormControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public FormControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public FormControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public FormControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public FormControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public FormControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public FormControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public FormControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public FormControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public FormControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public FormControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public FormControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public FormControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public FormControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public FormControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public FormControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public FormControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public FormControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public FormControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public FormControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public FormControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public FormControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public FormControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public FormControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public FormControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public FormControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public FormControl width(Object value)
    {
        return set("width", value);
    }

    public FormControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
