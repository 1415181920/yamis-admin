package io.xiaoyu.common.yaims;



/**
 * InputArray 数组输入框。 combo 的别名。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/array
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ArrayControl extends BaseRenderer {
    public ArrayControl() {
        set("type", "input-array");
    }

    /**
     * 新增按钮CSS类名
     */
    public ArrayControl addButtonClassName(Object value)
    {
        return set("addButtonClassName", value);
    }

    /**
     * 新增按钮文字
     */
    public ArrayControl addButtonText(Object value)
    {
        return set("addButtonText", value);
    }

    /**
     * 是否可新增
     */
    public ArrayControl addable(boolean value)
    {
        return set("addable", value);
    }

    /**
     * Add at top
     */
    public ArrayControl addattop(boolean value)
    {
        return set("addattop", value);
    }

    /**
     * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
     */
    public ArrayControl canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 容器 css 类名
     */
    public ArrayControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ArrayControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 删除时调用的api
     */
    public ArrayControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 确认删除时的提示
     */
    public ArrayControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 当扁平化开启并且joinValues为true时，用什么分隔符
     */
    public ArrayControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public ArrayControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ArrayControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ArrayControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public ArrayControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ArrayControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可拖拽排序
     */
    public ArrayControl draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 可拖拽排序的提示信息。
     */
    public ArrayControl draggableTip(Object value)
    {
        return set("draggableTip", value);
    }

    /**
     * 是否将结果扁平化(去掉name),只有当controls的length为1且multiple为true的时候才有效
     */
    public ArrayControl flat(boolean value)
    {
        return set("flat", value);
    }

    /**
     * 内部单组表单项的类名
     */
    public ArrayControl formClassName(Object value)
    {
        return set("formClassName", value);
    }

    /**
     * 是否隐藏
     */
    public ArrayControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ArrayControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ArrayControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ArrayControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ArrayControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ArrayControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ArrayControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 成员渲染器配置
     */
    public ArrayControl items(Object value)
    {
        return set("items", value);
    }

    /**
     * 当扁平化开启的时候，是否用分隔符的形式发送给后端，否则采用array的方式
     */
    public ArrayControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public ArrayControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ArrayControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ArrayControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ArrayControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ArrayControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 数据比较多，比较卡时，可以试试开启。
     */
    public ArrayControl lazyLoad(boolean value)
    {
        return set("lazyLoad", value);
    }

    /**
     * 限制最大个数
     */
    public ArrayControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 提示信息
     */
    public ArrayControl messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 限制最小个数
     */
    public ArrayControl minLength(Object value)
    {
        return set("minLength", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ArrayControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否多行模式，默认一行展示完
     */
    public ArrayControl multiLine(boolean value)
    {
        return set("multiLine", value);
    }

    /**
     * 是否可多选
     */
    public ArrayControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ArrayControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 是否含有边框
     */
    public ArrayControl noBorder(boolean value)
    {
        return set("noBorder", value);
    }

    /**
     * 允许为空，如果子表单项里面配置验证器，且又是单条模式。可以允许用户选择清空（不填）。
     */
    public ArrayControl nullable(boolean value)
    {
        return set("nullable", value);
    }

    /**
     * 事件动作配置
     */
    public ArrayControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 没有成员时显示。
     */
    public ArrayControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public ArrayControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ArrayControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ArrayControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public ArrayControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public ArrayControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 新增成员时的默认值
     */
    public ArrayControl scaffold(Object value)
    {
        return set("scaffold", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public ArrayControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public ArrayControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ArrayControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ArrayControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ArrayControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ArrayControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ArrayControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ArrayControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 严格模式，为了性能默认不开的。
     */
    public ArrayControl strictMode(boolean value)
    {
        return set("strictMode", value);
    }

    /**
     * 组件样式
     */
    public ArrayControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public ArrayControl subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 子表单的模式。 可选值: normal | horizontal | inline
     */
    public ArrayControl subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ArrayControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 配置同步字段。只有 `strictMode` 为 `false` 时有效。 如果 Combo 层级比较深，底层的获取外层的数据可能不同步。 但是给 combo 配置这个属性就能同步下来。输入格式：`["os"]`
     */
    public ArrayControl syncFields(Object value)
    {
        return set("syncFields", value);
    }

    /**
     * 选项卡标题的生成模板。
     */
    public ArrayControl tabsLabelTpl(Object value)
    {
        return set("tabsLabelTpl", value);
    }

    /**
     * 采用 Tabs 展示方式？
     */
    public ArrayControl tabsMode(boolean value)
    {
        return set("tabsMode", value);
    }

    /**
     * Tabs 的展示模式。 可选值:  | line | card | radio
     */
    public ArrayControl tabsStyle(Object value)
    {
        return set("tabsStyle", value);
    }

    /**
     * 指定为数组输入框类型
     */
    public ArrayControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否可切换条件，配合`conditions`使用
     */
    public ArrayControl typeSwitchable(boolean value)
    {
        return set("typeSwitchable", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ArrayControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ArrayControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ArrayControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ArrayControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ArrayControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public ArrayControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ArrayControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ArrayControl width(Object value)
    {
        return set("width", value);
    }

    public ArrayControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
