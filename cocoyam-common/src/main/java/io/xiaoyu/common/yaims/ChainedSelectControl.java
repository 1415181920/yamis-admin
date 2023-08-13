package io.xiaoyu.common.yaims;



/**
 * 链式下拉框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/chained-select
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ChainedSelectControl extends BaseRenderer 
{
    public ChainedSelectControl()
    {
        set("type", "chained-select");

    }

    /**
     * 添加时调用的接口
     */
    public ChainedSelectControl addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public ChainedSelectControl addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public ChainedSelectControl addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public ChainedSelectControl autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 容器 css 类名
     */
    public ChainedSelectControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ChainedSelectControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public ChainedSelectControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public ChainedSelectControl creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public ChainedSelectControl createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public ChainedSelectControl deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public ChainedSelectControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public ChainedSelectControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public ChainedSelectControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public ChainedSelectControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ChainedSelectControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ChainedSelectControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public ChainedSelectControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ChainedSelectControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public ChainedSelectControl editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public ChainedSelectControl editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public ChainedSelectControl editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public ChainedSelectControl editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public ChainedSelectControl extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public ChainedSelectControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ChainedSelectControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ChainedSelectControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ChainedSelectControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ChainedSelectControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public ChainedSelectControl initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public ChainedSelectControl initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ChainedSelectControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ChainedSelectControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public ChainedSelectControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public ChainedSelectControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ChainedSelectControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ChainedSelectControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ChainedSelectControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ChainedSelectControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ChainedSelectControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public ChainedSelectControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ChainedSelectControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public ChainedSelectControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项集合
     */
    public ChainedSelectControl options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public ChainedSelectControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public ChainedSelectControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ChainedSelectControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ChainedSelectControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public ChainedSelectControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public ChainedSelectControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public ChainedSelectControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public ChainedSelectControl selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public ChainedSelectControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public ChainedSelectControl source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public ChainedSelectControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ChainedSelectControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ChainedSelectControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ChainedSelectControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ChainedSelectControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ChainedSelectControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ChainedSelectControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ChainedSelectControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ChainedSelectControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public ChainedSelectControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ChainedSelectControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ChainedSelectControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ChainedSelectControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ChainedSelectControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ChainedSelectControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public ChainedSelectControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ChainedSelectControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ChainedSelectControl width(Object value)
    {
        return set("width", value);
    }

    public ChainedSelectControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
