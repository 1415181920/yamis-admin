package io.xiaoyu.common.yaims;



/**
 * FieldSet 表单项集合 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/fieldset
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class FieldSetControl extends BaseRenderer 
{
    public FieldSetControl()
    {
        set("type", "fieldset");
        set("titlePosition", "top");

    }

    /**
     * 内容区域
     */
    public FieldSetControl body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public FieldSetControl bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public FieldSetControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public FieldSetControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可折叠
     */
    public FieldSetControl collapsable(boolean value)
    {
        return set("collapsable", value);
    }

    /**
     * 收起的标题
     */
    public FieldSetControl collapseHeader(Object value)
    {
        return set("collapseHeader", value);
    }

    /**
     * 收起的标题
     */
    public FieldSetControl collapseTitle(Object value)
    {
        return set("collapseTitle", value);
    }

    /**
     * 默认是否折叠
     */
    public FieldSetControl collapsed(boolean value)
    {
        return set("collapsed", value);
    }

    public FieldSetControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public FieldSetControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public FieldSetControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public FieldSetControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public FieldSetControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 自定义切换图标
     */
    public FieldSetControl expandIcon(Object value)
    {
        return set("expandIcon", value);
    }

    /**
     * 标题
     */
    public FieldSetControl header(Object value)
    {
        return set("header", value);
    }

    /**
     * 标题展示位置 可选值: top | bottom
     */
    public FieldSetControl headerPosition(Object value)
    {
        return set("headerPosition", value);
    }

    /**
     * 标题 CSS 类名
     */
    public FieldSetControl headingClassName(Object value)
    {
        return set("headingClassName", value);
    }

    /**
     * 是否隐藏
     */
    public FieldSetControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public FieldSetControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public FieldSetControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public FieldSetControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public FieldSetControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public FieldSetControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public FieldSetControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 标识
     */
    public FieldSetControl key(Object value)
    {
        return set("key", value);
    }

    /**
     * 描述标题
     */
    public FieldSetControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public FieldSetControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public FieldSetControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public FieldSetControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public FieldSetControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public FieldSetControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 点开时才加载内容
     */
    public FieldSetControl mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public FieldSetControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public FieldSetControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public FieldSetControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public FieldSetControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public FieldSetControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public FieldSetControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public FieldSetControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 图标是否展示
     */
    public FieldSetControl showArrow(boolean value)
    {
        return set("showArrow", value);
    }

    /**
     * 控件大小 可选值: xs | sm | md | lg | base
     */
    public FieldSetControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public FieldSetControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public FieldSetControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public FieldSetControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public FieldSetControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public FieldSetControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public FieldSetControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public FieldSetControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public FieldSetControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public FieldSetControl subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public FieldSetControl subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public FieldSetControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 标题
     */
    public FieldSetControl title(Object value)
    {
        return set("title", value);
    }

    /**
     * 标题展示位置 可选值: top | bottom
     */
    public FieldSetControl titlePosition(Object value)
    {
        return set("titlePosition", value);
    }

    /**
     * 指定为表单项集合 可选值: fieldset | fieldSet
     */
    public FieldSetControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片隐藏就销毁内容。
     */
    public FieldSetControl unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 远端校验表单项接口
     */
    public FieldSetControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public FieldSetControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public FieldSetControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public FieldSetControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public FieldSetControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public FieldSetControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public FieldSetControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public FieldSetControl width(Object value)
    {
        return set("width", value);
    }

    public FieldSetControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
