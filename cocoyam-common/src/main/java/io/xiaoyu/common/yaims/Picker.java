package io.xiaoyu.common.yaims;



/**
 * Picker 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/picker
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Picker extends BaseRenderer {

    public Picker()
    {
        set("type", "picker");
    }

    /**
     * 添加时调用的接口
     */
    public Picker addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public Picker addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public Picker addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public Picker autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 容器 css 类名
     */
    public Picker className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Picker clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public Picker clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public Picker creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public Picker createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public Picker deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public Picker deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public Picker deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public Picker delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public Picker desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Picker description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Picker descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Picker disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Picker disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public Picker editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public Picker editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public Picker editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public Picker editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 内嵌模式，也就是说不弹框了。
     */
    public Picker embed(boolean value)
    {
        return set("embed", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public Picker extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public Picker hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Picker hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Picker hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Picker horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Picker id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public Picker initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public Picker initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Picker inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Picker inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public Picker joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public Picker label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Picker labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Picker labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 建议用 labelTpl 选中一个字段名用来作为值的描述文字
     */
    public Picker labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Picker labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 可用来生成选中的值的描述文字
     */
    public Picker labelTpl(Object value)
    {
        return set("labelTpl", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Picker labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 弹窗模式，dialog 或者 drawer 可选值: dialog | drawer
     */
    public Picker modalMode(Object value)
    {
        return set("modalMode", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Picker mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public Picker multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Picker name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Picker onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项集合
     */
    public Picker options(Object value)
    {
        return set("options", value);
    }

    /**
     * 弹窗选择框详情。
     */
    public Picker pickerSchema(Object value)
    {
        return set("pickerSchema", value);
    }

    /**
     * 占位符
     */
    public Picker placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Picker readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Picker readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Picker remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public Picker removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public Picker required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public Picker resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public Picker selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Picker size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public Picker source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Picker staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Picker staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Picker staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Picker staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Picker staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Picker staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Picker staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Picker style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Picker submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public Picker type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Picker validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Picker validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Picker validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Picker validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Picker value(Object value)
    {
        return set("value", value);
    }

    /**
     * 选一个可以用来作为值的字段。
     */
    public Picker valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public Picker visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Picker visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Picker width(Object value)
    {
        return set("width", value);
    }


    public Picker set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
