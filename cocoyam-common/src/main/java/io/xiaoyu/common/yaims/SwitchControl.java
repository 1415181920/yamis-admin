package io.xiaoyu.common.yaims;



/**
 * Switch 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/switch
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SwitchControl extends BaseRenderer 
{
    public SwitchControl()
    {
        set("type", "switch");

    }

    /**
     * 容器 css 类名
     */
    public SwitchControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public SwitchControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public SwitchControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public SwitchControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public SwitchControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public SwitchControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public SwitchControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 未勾选值
     */
    public SwitchControl falseValue(Object value)
    {
        return set("falseValue", value);
    }

    /**
     * 是否隐藏
     */
    public SwitchControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public SwitchControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public SwitchControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public SwitchControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public SwitchControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public SwitchControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public SwitchControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public SwitchControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public SwitchControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public SwitchControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public SwitchControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public SwitchControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public SwitchControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public SwitchControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 关闭时显示的内容
     */
    public SwitchControl offText(Object value)
    {
        return set("offText", value);
    }

    /**
     * 事件动作配置
     */
    public SwitchControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 开启时显示的内容
     */
    public SwitchControl onText(Object value)
    {
        return set("onText", value);
    }

    /**
     * 选项说明
     */
    public SwitchControl option(Object value)
    {
        return set("option", value);
    }

    /**
     * 占位符
     */
    public SwitchControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public SwitchControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public SwitchControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public SwitchControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public SwitchControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 开关尺寸 可选值: sm | md
     */
    public SwitchControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public SwitchControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public SwitchControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public SwitchControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public SwitchControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public SwitchControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public SwitchControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public SwitchControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public SwitchControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public SwitchControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 勾选值
     */
    public SwitchControl trueValue(Object value)
    {
        return set("trueValue", value);
    }

    /**
     * 指定为多行文本输入框
     */
    public SwitchControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public SwitchControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public SwitchControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public SwitchControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public SwitchControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public SwitchControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public SwitchControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public SwitchControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public SwitchControl width(Object value)
    {
        return set("width", value);
    }

    public SwitchControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
