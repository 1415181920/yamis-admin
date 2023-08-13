package io.xiaoyu.common.yaims;



/**
 * 按钮组控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/button-group
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ButtonGroupControl extends BaseRenderer 
{
    public ButtonGroupControl()
    {
        set("type", "button-group-select");

    }

    /**
     * 添加时调用的接口
     */
    public ButtonGroupControl addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public ButtonGroupControl addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public ButtonGroupControl addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public ButtonGroupControl autoFill(Object value)
    {
        return set("autoFill", value);
    }

    public ButtonGroupControl btnActiveClassName(Object value)
    {
        return set("btnActiveClassName", value);
    }

    /**
     * 按钮选中的样式级别
     */
    public ButtonGroupControl btnActiveLevel(Object value)
    {
        return set("btnActiveLevel", value);
    }

    public ButtonGroupControl btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 按钮样式级别
     */
    public ButtonGroupControl btnLevel(Object value)
    {
        return set("btnLevel", value);
    }

    /**
     * 按钮集合
     */
    public ButtonGroupControl buttons(Object value)
    {
        return set("buttons", value);
    }

    /**
     * 容器 css 类名
     */
    public ButtonGroupControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ButtonGroupControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public ButtonGroupControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public ButtonGroupControl creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public ButtonGroupControl createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public ButtonGroupControl deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public ButtonGroupControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public ButtonGroupControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public ButtonGroupControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public ButtonGroupControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ButtonGroupControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ButtonGroupControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否为禁用状态。
     */
    public ButtonGroupControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 通过 JS 表达式来配置当前表单项的禁用状态。
     */
    public ButtonGroupControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public ButtonGroupControl editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public ButtonGroupControl editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public ButtonGroupControl editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public ButtonGroupControl editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public ButtonGroupControl extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public ButtonGroupControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ButtonGroupControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ButtonGroupControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ButtonGroupControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ButtonGroupControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public ButtonGroupControl initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public ButtonGroupControl initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ButtonGroupControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ButtonGroupControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public ButtonGroupControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public ButtonGroupControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ButtonGroupControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ButtonGroupControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ButtonGroupControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ButtonGroupControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ButtonGroupControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public ButtonGroupControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ButtonGroupControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public ButtonGroupControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项集合
     */
    public ButtonGroupControl options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public ButtonGroupControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public ButtonGroupControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ButtonGroupControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ButtonGroupControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public ButtonGroupControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public ButtonGroupControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public ButtonGroupControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public ButtonGroupControl selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 按钮大小 可选值: xs | sm | md | lg
     */
    public ButtonGroupControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public ButtonGroupControl source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public ButtonGroupControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ButtonGroupControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ButtonGroupControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ButtonGroupControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ButtonGroupControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ButtonGroupControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ButtonGroupControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ButtonGroupControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ButtonGroupControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 平铺展示？
     */
    public ButtonGroupControl tiled(boolean value)
    {
        return set("tiled", value);
    }

    public ButtonGroupControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ButtonGroupControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ButtonGroupControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ButtonGroupControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ButtonGroupControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ButtonGroupControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 垂直展示？
     */
    public ButtonGroupControl vertical(boolean value)
    {
        return set("vertical", value);
    }

    /**
     * 是否显示
     */
    public ButtonGroupControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 通过 JS 表达式来配置当前表单项是否显示
     */
    public ButtonGroupControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ButtonGroupControl width(Object value)
    {
        return set("width", value);
    }

    public ButtonGroupControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
