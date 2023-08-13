package io.xiaoyu.common.yaims;



/**
 * FieldSet 表单项集合 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/fieldset
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class FieldSet extends BaseRenderer {

    public FieldSet()
    {
        set("type", "fieldset");
        set("titlePosition", "top");
    }

    /**
     * 内容区域
     */
    public FieldSet body(Object value)
    {
        return set("body", value);
    }

    /**
     * 配置 Body 容器 className
     */
    public FieldSet bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public FieldSet className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public FieldSet clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可折叠
     */
    public FieldSet collapsable(boolean value)
    {
        return set("collapsable", value);
    }

    /**
     * 收起的标题
     */
    public FieldSet collapseHeader(Object value)
    {
        return set("collapseHeader", value);
    }

    /**
     * 收起的标题
     */
    public FieldSet collapseTitle(Object value)
    {
        return set("collapseTitle", value);
    }

    /**
     * 默认是否折叠
     */
    public FieldSet collapsed(boolean value)
    {
        return set("collapsed", value);
    }

    public FieldSet desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public FieldSet description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public FieldSet descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public FieldSet disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public FieldSet disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 自定义切换图标
     */
    public FieldSet expandIcon(Object value)
    {
        return set("expandIcon", value);
    }

    /**
     * 标题
     */
    public FieldSet header(Object value)
    {
        return set("header", value);
    }

    /**
     * 标题展示位置 可选值: top | bottom
     */
    public FieldSet headerPosition(Object value)
    {
        return set("headerPosition", value);
    }

    /**
     * 标题 CSS 类名
     */
    public FieldSet headingClassName(Object value)
    {
        return set("headingClassName", value);
    }

    /**
     * 是否隐藏
     */
    public FieldSet hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public FieldSet hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public FieldSet hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public FieldSet horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public FieldSet id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public FieldSet inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public FieldSet inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 标识
     */
    public FieldSet key(Object value)
    {
        return set("key", value);
    }

    /**
     * 描述标题
     */
    public FieldSet label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public FieldSet labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public FieldSet labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public FieldSet labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public FieldSet labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public FieldSet mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 点开时才加载内容
     */
    public FieldSet mountOnEnter(boolean value)
    {
        return set("mountOnEnter", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public FieldSet name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public FieldSet onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public FieldSet placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public FieldSet readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public FieldSet readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public FieldSet remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public FieldSet required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 图标是否展示
     */
    public FieldSet showArrow(boolean value)
    {
        return set("showArrow", value);
    }

    /**
     * 控件大小 可选值: xs | sm | md | lg | base
     */
    public FieldSet size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public FieldSet staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public FieldSet staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public FieldSet staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public FieldSet staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public FieldSet staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public FieldSet staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public FieldSet staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public FieldSet style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public FieldSet subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public FieldSet subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public FieldSet submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 标题
     */
    public FieldSet title(Object value)
    {
        return set("title", value);
    }

    /**
     * 标题展示位置 可选值: top | bottom
     */
    public FieldSet titlePosition(Object value)
    {
        return set("titlePosition", value);
    }

    /**
     * 指定为表单项集合 可选值: fieldset | fieldSet
     */
    public FieldSet type(Object value)
    {
        return set("type", value);
    }

    /**
     * 卡片隐藏就销毁内容。
     */
    public FieldSet unmountOnExit(boolean value)
    {
        return set("unmountOnExit", value);
    }

    /**
     * 远端校验表单项接口
     */
    public FieldSet validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public FieldSet validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public FieldSet validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public FieldSet validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public FieldSet value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public FieldSet visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public FieldSet visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public FieldSet width(Object value)
    {
        return set("width", value);
    }

    public FieldSet set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
