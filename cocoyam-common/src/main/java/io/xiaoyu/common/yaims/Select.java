package io.xiaoyu.common.yaims;



/**
 * Select 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/select
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Select extends BaseRenderer {

    public Select()
    {
        set("type", "select");
    }

    /**
     * 添加时调用的接口
     */
    public Select addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public Select addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public Select addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 是否自动选中子节点
     */
    public Select autoCheckChildren(Object value)
    {
        return set("autoCheckChildren", value);
    }

    /**
     * 自动完成 API，当输入部分文字的时候，会将这些文字通过 {term} 可以取到，发送给接口。 接口可以返回匹配到的选项，帮助用户输入。
     */
    public Select autoComplete(Object value)
    {
        return set("autoComplete", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public Select autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public Select borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 可多选条件下，是否可全选
     */
    public Select checkAll(boolean value)
    {
        return set("checkAll", value);
    }

    /**
     * 可多选条件下，全选项文案，默认 ”全选“
     */
    public Select checkAllLabel(Object value)
    {
        return set("checkAllLabel", value);
    }

    /**
     * 容器 css 类名
     */
    public Select className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Select clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public Select clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 当 selectMode 为 table 时定义表格列信息。
     */
    public Select columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 是否可以新增
     */
    public Select creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public Select createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 可多选条件下，是否默认全选中所有值
     */
    public Select defaultCheckAll(boolean value)
    {
        return set("defaultCheckAll", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public Select deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public Select deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public Select deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public Select delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public Select desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Select description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Select descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Select disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Select disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public Select editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public Select editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public Select editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public Select editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public Select extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public Select hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Select hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Select hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Select horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Select id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public Select initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public Select initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Select inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Select inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单个选项的高度，主要用于虚拟渲染
     */
    public Select itemHeight(Object value)
    {
        return set("itemHeight", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public Select joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public Select label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Select labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Select labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 设置label字段
     */
    public Select labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Select labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Select labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选择模式 可选值: tree | list
     */
    public Select leftMode(Object value)
    {
        return set("leftMode", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选项
     */
    public Select leftOptions(Object value)
    {
        return set("leftOptions", value);
    }

    public Select loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
     */
    public Select maxTagCount(Object value)
    {
        return set("maxTagCount", value);
    }

    /**
     * 可以自定义菜单展示。
     */
    public Select menuTpl(Object value)
    {
        return set("menuTpl", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Select mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public Select multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Select name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Select onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项的自定义CSS类名
     */
    public Select optionClassName(Object value)
    {
        return set("optionClassName", value);
    }

    /**
     * 选项集合
     */
    public Select options(Object value)
    {
        return set("options", value);
    }

    /**
     * 收纳标签的Popover配置
     */
    public Select overflowTagPopover(Object value)
    {
        return set("overflowTagPopover", value);
    }

    /**
     * 下拉框 Popover 设置
     */
    public Select overlay(Object value)
    {
        return set("overlay", value);
    }

    /**
     * 占位符
     */
    public Select placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Select readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Select readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Select remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public Select removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public Select required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public Select resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义右侧的选择模式 可选值: table | list | tree | chained
     */
    public Select rightMode(Object value)
    {
        return set("rightMode", value);
    }

    /**
     * 搜索 API
     */
    public Select searchApi(Object value)
    {
        return set("searchApi", value);
    }

    /**
     * 当 searchResultMode 为 table 时定义表格列信息。
     */
    public Select searchResultColumns(Object value)
    {
        return set("searchResultColumns", value);
    }

    /**
     * 搜索结果展示模式 可选值: table | list | tree | chained
     */
    public Select searchResultMode(Object value)
    {
        return set("searchResultMode", value);
    }

    /**
     * 是否可搜索
     */
    public Select searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public Select selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 勾选展示模式 可选值: table | group | tree | chained | associated
     */
    public Select selectMode(Object value)
    {
        return set("selectMode", value);
    }

    /**
     * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
     */
    public Select showInvalidMatch(boolean value)
    {
        return set("showInvalidMatch", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Select size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public Select source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Select staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Select staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Select staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Select staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Select staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Select staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Select staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Select style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Select submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型 可选值: select | multi-select
     */
    public Select type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Select validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Select validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Select validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Select validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Select value(Object value)
    {
        return set("value", value);
    }

    /**
     * 设置value字段
     */
    public Select valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 在选项数量达到多少时开启虚拟渲染
     */
    public Select virtualThreshold(Object value)
    {
        return set("virtualThreshold", value);
    }

    /**
     * 是否显示
     */
    public Select visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Select visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Select width(Object value)
    {
        return set("width", value);
    }


    public Select set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
