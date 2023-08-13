package io.xiaoyu.common.yaims;



/**
 * 复选框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/checkboxes
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Checkboxes extends BaseRenderer {

    public Checkboxes()
    {
        set("type", "checkboxes");

    }

    /**
     * 添加时调用的接口
     */
    public Checkboxes addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public Checkboxes addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public Checkboxes addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public Checkboxes autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 是否开启全选功能
     */
    public Checkboxes checkAll(boolean value)
    {
        return set("checkAll", value);
    }

    /**
     * 容器 css 类名
     */
    public Checkboxes className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Checkboxes clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public Checkboxes clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 每行显示多少个
     */
    public Checkboxes columnsCount(Object value)
    {
        return set("columnsCount", value);
    }

    /**
     * 是否可以新增
     */
    public Checkboxes creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public Checkboxes createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 是否默认全选
     */
    public Checkboxes defaultCheckAll(boolean value)
    {
        return set("defaultCheckAll", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public Checkboxes deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public Checkboxes deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public Checkboxes deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public Checkboxes delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public Checkboxes desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Checkboxes description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Checkboxes descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Checkboxes disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Checkboxes disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public Checkboxes editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public Checkboxes editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public Checkboxes editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public Checkboxes editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public Checkboxes extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public Checkboxes hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Checkboxes hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Checkboxes hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Checkboxes horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Checkboxes id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public Checkboxes initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public Checkboxes initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Checkboxes inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Checkboxes inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public Checkboxes joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public Checkboxes label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Checkboxes labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Checkboxes labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Checkboxes labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Checkboxes labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 自定义选项展示
     */
    public Checkboxes menuTpl(Object value)
    {
        return set("menuTpl", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Checkboxes mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public Checkboxes multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Checkboxes name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Checkboxes onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项集合
     */
    public Checkboxes options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public Checkboxes placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Checkboxes readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Checkboxes readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Checkboxes remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public Checkboxes removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public Checkboxes required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public Checkboxes resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public Checkboxes selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Checkboxes size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public Checkboxes source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Checkboxes staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Checkboxes staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Checkboxes staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Checkboxes staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Checkboxes staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Checkboxes staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Checkboxes staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Checkboxes style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Checkboxes submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public Checkboxes type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Checkboxes validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Checkboxes validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Checkboxes validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Checkboxes validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Checkboxes value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Checkboxes visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Checkboxes visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Checkboxes width(Object value)
    {
        return set("width", value);
    }


    public Checkboxes set(String key, Object value) {
        super.set(key, value);
        return this;
    }

}
