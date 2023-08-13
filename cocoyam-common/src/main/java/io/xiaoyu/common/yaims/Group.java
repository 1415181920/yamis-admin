package io.xiaoyu.common.yaims;



/**
 * Group 表单集合渲染器，能让多个表单在一行显示 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/group
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Group extends BaseRenderer {

    public Group()
    {
        set("type", "group");
    }

    /**
     * FormItem 集合
     */
    public Group body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Group className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Group clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public Group desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Group description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Group descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 配置时垂直摆放还是左右摆放。 可选值: horizontal | vertical
     */
    public Group direction(Object value)
    {
        return set("direction", value);
    }

    /**
     * 是否禁用
     */
    public Group disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Group disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 间隔 可选值: xs | sm | normal
     */
    public Group gap(Object value)
    {
        return set("gap", value);
    }

    /**
     * 是否隐藏
     */
    public Group hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Group hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Group hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Group horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Group id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Group inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Group inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public Group label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Group labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Group labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Group labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Group labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Group mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Group name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Group onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Group placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Group readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Group readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Group remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Group required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Group size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Group staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Group staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Group staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Group staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Group staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Group staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Group staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Group style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public Group subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 配置子表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public Group subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Group submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public Group type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Group validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Group validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Group validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Group validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Group value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Group visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Group visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Group width(Object value)
    {
        return set("width", value);
    }


    public Group set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
