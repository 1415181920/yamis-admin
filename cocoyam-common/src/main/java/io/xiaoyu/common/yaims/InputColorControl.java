package io.xiaoyu.common.yaims;



/**
 * Color 颜色选择框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/color
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputColorControl extends BaseRenderer 
{
    public InputColorControl()
    {
        set("type", "input-color");

    }

    /**
     * 是否允许用户输入颜色。
     */
    public InputColorControl allowCustomColor(boolean value)
    {
        return set("allowCustomColor", value);
    }

    /**
     * 容器 css 类名
     */
    public InputColorControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public InputColorControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否显示清除按钮
     */
    public InputColorControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 选中颜色后是否关闭弹出层。
     */
    public InputColorControl closeOnSelect(boolean value)
    {
        return set("closeOnSelect", value);
    }

    public InputColorControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public InputColorControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public InputColorControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public InputColorControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public InputColorControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 颜色格式 可选值: hex | rgb | rgba | hsl
     */
    public InputColorControl format(Object value)
    {
        return set("format", value);
    }

    /**
     * 是否隐藏
     */
    public InputColorControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public InputColorControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public InputColorControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public InputColorControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public InputColorControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public InputColorControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public InputColorControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public InputColorControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public InputColorControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public InputColorControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public InputColorControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public InputColorControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public InputColorControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public InputColorControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public InputColorControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public InputColorControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 预设颜色，用户可以直接从预设中选。
     */
    public InputColorControl presetColors(Object value)
    {
        return set("presetColors", value);
    }

    /**
     * 是否只读
     */
    public InputColorControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public InputColorControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public InputColorControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public InputColorControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public InputColorControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public InputColorControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public InputColorControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public InputColorControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public InputColorControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public InputColorControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public InputColorControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public InputColorControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public InputColorControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public InputColorControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为颜色选择框
     */
    public InputColorControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public InputColorControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public InputColorControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public InputColorControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public InputColorControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public InputColorControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public InputColorControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public InputColorControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public InputColorControl width(Object value)
    {
        return set("width", value);
    }

    public InputColorControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
