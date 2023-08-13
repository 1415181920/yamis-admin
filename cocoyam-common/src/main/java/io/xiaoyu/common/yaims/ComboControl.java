package io.xiaoyu.common.yaims;



/**
 * Combo 组合输入框类型 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/combo
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ComboControl extends BaseRenderer 
{
    public ComboControl()
    {
        set("type", "combo");

    }

    /**
     * 新增按钮CSS类名
     */
    public ComboControl addButtonClassName(Object value)
    {
        return set("addButtonClassName", value);
    }

    /**
     * 新增按钮文字
     */
    public ComboControl addButtonText(Object value)
    {
        return set("addButtonText", value);
    }

    /**
     * 是否可新增
     */
    public ComboControl addable(boolean value)
    {
        return set("addable", value);
    }

    /**
     * Add at top
     */
    public ComboControl addattop(boolean value)
    {
        return set("addattop", value);
    }

    /**
     * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
     */
    public ComboControl canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 容器 css 类名
     */
    public ComboControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ComboControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 符合某类条件后才渲染的schema
     */
    public ComboControl conditions(Object value)
    {
        return set("conditions", value);
    }

    /**
     * 删除时调用的api
     */
    public ComboControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 确认删除时的提示
     */
    public ComboControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 当扁平化开启并且joinValues为true时，用什么分隔符
     */
    public ComboControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public ComboControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ComboControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ComboControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public ComboControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ComboControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可拖拽排序
     */
    public ComboControl draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 可拖拽排序的提示信息。
     */
    public ComboControl draggableTip(Object value)
    {
        return set("draggableTip", value);
    }

    /**
     * 是否将结果扁平化(去掉name),只有当controls的length为1且multiple为true的时候才有效
     */
    public ComboControl flat(boolean value)
    {
        return set("flat", value);
    }

    /**
     * 内部单组表单项的类名
     */
    public ComboControl formClassName(Object value)
    {
        return set("formClassName", value);
    }

    /**
     * 是否隐藏
     */
    public ComboControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ComboControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ComboControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ComboControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ComboControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ComboControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ComboControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 数组输入框的子项
     */
    public ComboControl items(Object value)
    {
        return set("items", value);
    }

    /**
     * 当扁平化开启的时候，是否用分隔符的形式发送给后端，否则采用array的方式
     */
    public ComboControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public ComboControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ComboControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ComboControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ComboControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ComboControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 数据比较多，比较卡时，可以试试开启。
     */
    public ComboControl lazyLoad(boolean value)
    {
        return set("lazyLoad", value);
    }

    /**
     * 限制最大个数
     */
    public ComboControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 提示信息
     */
    public ComboControl messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 限制最小个数
     */
    public ComboControl minLength(Object value)
    {
        return set("minLength", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ComboControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否多行模式，默认一行展示完
     */
    public ComboControl multiLine(boolean value)
    {
        return set("multiLine", value);
    }

    /**
     * 是否可多选
     */
    public ComboControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ComboControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 是否含有边框
     */
    public ComboControl noBorder(boolean value)
    {
        return set("noBorder", value);
    }

    /**
     * 允许为空，如果子表单项里面配置验证器，且又是单条模式。可以允许用户选择清空（不填）。
     */
    public ComboControl nullable(boolean value)
    {
        return set("nullable", value);
    }

    /**
     * 事件动作配置
     */
    public ComboControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 没有成员时显示。
     */
    public ComboControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public ComboControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ComboControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ComboControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public ComboControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public ComboControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 单组表单项初始值。默认为 `{}`
     */
    public ComboControl scaffold(Object value)
    {
        return set("scaffold", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public ComboControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public ComboControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ComboControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ComboControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ComboControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ComboControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ComboControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ComboControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 严格模式，为了性能默认不开的。
     */
    public ComboControl strictMode(boolean value)
    {
        return set("strictMode", value);
    }

    /**
     * 组件样式
     */
    public ComboControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public ComboControl subFormHorizontal(Object value)
    {
        return set("subFormHorizontal", value);
    }

    /**
     * 子表单的模式。 可选值: normal | horizontal | inline
     */
    public ComboControl subFormMode(Object value)
    {
        return set("subFormMode", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ComboControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 配置同步字段。只有 `strictMode` 为 `false` 时有效。 如果 Combo 层级比较深，底层的获取外层的数据可能不同步。 但是给 combo 配置这个属性就能同步下来。输入格式：`["os"]`
     */
    public ComboControl syncFields(Object value)
    {
        return set("syncFields", value);
    }

    /**
     * 选项卡标题的生成模板。
     */
    public ComboControl tabsLabelTpl(Object value)
    {
        return set("tabsLabelTpl", value);
    }

    /**
     * 采用 Tabs 展示方式？
     */
    public ComboControl tabsMode(boolean value)
    {
        return set("tabsMode", value);
    }

    /**
     * Tabs 的展示模式。 可选值:  | line | card | radio
     */
    public ComboControl tabsStyle(Object value)
    {
        return set("tabsStyle", value);
    }

    /**
     * 指定为组合输入框类型
     */
    public ComboControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否可切换条件，配合`conditions`使用
     */
    public ComboControl typeSwitchable(boolean value)
    {
        return set("typeSwitchable", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ComboControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ComboControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ComboControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ComboControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ComboControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public ComboControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ComboControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ComboControl width(Object value)
    {
        return set("width", value);
    }

    public ComboControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
