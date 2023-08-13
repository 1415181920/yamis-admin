package io.xiaoyu.common.yaims;



/**
 * TabsTransfer 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tabs-transfer
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TabsTransfer extends BaseRenderer {

    public TabsTransfer()
    {
        set("type", "tabs-transfer");
    }

    /**
     * 添加时调用的接口
     */
    public TabsTransfer addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public TabsTransfer addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public TabsTransfer addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public TabsTransfer autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 容器 css 类名
     */
    public TabsTransfer className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public TabsTransfer clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public TabsTransfer clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 当 selectMode 为 table 时定义表格列信息。
     */
    public TabsTransfer columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 是否可以新增
     */
    public TabsTransfer creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public TabsTransfer createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public TabsTransfer deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public TabsTransfer deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public TabsTransfer deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public TabsTransfer delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public TabsTransfer desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public TabsTransfer description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public TabsTransfer descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public TabsTransfer disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TabsTransfer disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public TabsTransfer editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public TabsTransfer editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public TabsTransfer editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public TabsTransfer editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public TabsTransfer extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public TabsTransfer hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TabsTransfer hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public TabsTransfer hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public TabsTransfer horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TabsTransfer id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public TabsTransfer initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public TabsTransfer initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public TabsTransfer inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public TabsTransfer inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单个选项的高度，主要用于虚拟渲染
     */
    public TabsTransfer itemHeight(Object value)
    {
        return set("itemHeight", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public TabsTransfer joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public TabsTransfer label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public TabsTransfer labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public TabsTransfer labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public TabsTransfer labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public TabsTransfer labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选择模式 可选值: tree | list
     */
    public TabsTransfer leftMode(Object value)
    {
        return set("leftMode", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选项
     */
    public TabsTransfer leftOptions(Object value)
    {
        return set("leftOptions", value);
    }

    public TabsTransfer loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 用来丰富选项展示
     */
    public TabsTransfer menuTpl(Object value)
    {
        return set("menuTpl", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public TabsTransfer mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public TabsTransfer multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public TabsTransfer name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public TabsTransfer onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 树形模式下，仅选中子节点
     */
    public TabsTransfer onlyChildren(boolean value)
    {
        return set("onlyChildren", value);
    }

    /**
     * 选项集合
     */
    public TabsTransfer options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public TabsTransfer placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public TabsTransfer readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public TabsTransfer readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public TabsTransfer remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public TabsTransfer removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public TabsTransfer required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public TabsTransfer resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 结果面板是否追踪显示
     */
    public TabsTransfer resultListModeFollowSelect(boolean value)
    {
        return set("resultListModeFollowSelect", value);
    }

    /**
     * 右侧列表搜索框提示
     */
    public TabsTransfer resultSearchPlaceholder(Object value)
    {
        return set("resultSearchPlaceholder", value);
    }

    /**
     * 结果（右则）列表的检索功能，当设置为true时，可以通过输入检索模糊匹配检索内容
     */
    public TabsTransfer resultSearchable(boolean value)
    {
        return set("resultSearchable", value);
    }

    /**
     * 右侧结果的标题文字
     */
    public TabsTransfer resultTitle(Object value)
    {
        return set("resultTitle", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义右侧的选择模式 可选值: table | list | tree | chained
     */
    public TabsTransfer rightMode(Object value)
    {
        return set("rightMode", value);
    }

    /**
     * 搜索 API
     */
    public TabsTransfer searchApi(Object value)
    {
        return set("searchApi", value);
    }

    /**
     * 左侧列表搜索框提示
     */
    public TabsTransfer searchPlaceholder(Object value)
    {
        return set("searchPlaceholder", value);
    }

    /**
     * 当 searchResultMode 为 table 时定义表格列信息。
     */
    public TabsTransfer searchResultColumns(Object value)
    {
        return set("searchResultColumns", value);
    }

    /**
     * 搜索结果展示模式 可选值: table | list | tree | chained
     */
    public TabsTransfer searchResultMode(Object value)
    {
        return set("searchResultMode", value);
    }

    /**
     * 可搜索？
     */
    public TabsTransfer searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public TabsTransfer selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 勾选展示模式 可选值: table | list | tree | chained | associated
     */
    public TabsTransfer selectMode(Object value)
    {
        return set("selectMode", value);
    }

    /**
     * 左侧的标题文字
     */
    public TabsTransfer selectTitle(Object value)
    {
        return set("selectTitle", value);
    }

    /**
     * 是否显示剪头
     */
    public TabsTransfer showArrow(boolean value)
    {
        return set("showArrow", value);
    }

    /**
     * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
     */
    public TabsTransfer showInvalidMatch(boolean value)
    {
        return set("showInvalidMatch", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public TabsTransfer size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可排序？
     */
    public TabsTransfer sortable(boolean value)
    {
        return set("sortable", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public TabsTransfer source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public TabsTransfer staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TabsTransfer staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TabsTransfer staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TabsTransfer staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TabsTransfer staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TabsTransfer staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TabsTransfer staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 统计数字
     */
    public TabsTransfer statistics(boolean value)
    {
        return set("statistics", value);
    }

    /**
     * 组件样式
     */
    public TabsTransfer style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public TabsTransfer submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    public TabsTransfer type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public TabsTransfer validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public TabsTransfer validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public TabsTransfer validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public TabsTransfer validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public TabsTransfer value(Object value)
    {
        return set("value", value);
    }

    /**
     * 用来丰富值的展示
     */
    public TabsTransfer valueTpl(Object value)
    {
        return set("valueTpl", value);
    }

    /**
     * 在选项数量达到多少时开启虚拟渲染
     */
    public TabsTransfer virtualThreshold(Object value)
    {
        return set("virtualThreshold", value);
    }

    /**
     * 是否显示
     */
    public TabsTransfer visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TabsTransfer visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public TabsTransfer width(Object value)
    {
        return set("width", value);
    }


    public TabsTransfer set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
