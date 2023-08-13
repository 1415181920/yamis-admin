package io.xiaoyu.common.yaims;



/**
 * Tree 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tree
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tree extends BaseRenderer {

    public Tree()
    {
        set("type", "input-tree");
    }

    /**
     * 添加时调用的接口
     */
    public Tree addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public Tree addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public Tree addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * ui级联关系，true代表级联选中，false代表不级联，默认为true
     */
    public Tree autoCheckChildren(boolean value)
    {
        return set("autoCheckChildren", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public Tree autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 该属性代表数据级联关系，autoCheckChildren为true时生效，默认为false，具体数据级联关系如下： 1.casacde为false，ui行为为级联选中子节点，子节点禁用；值只包含父节点的值 2.cascade为false，withChildren为true，ui行为为级联选中子节点，子节点禁用；值包含父子节点的值 3.cascade为true，ui行为级联选中子节点，子节点可反选，值包含父子节点的值，此时withChildren属性失效 4.cascade不论为true还是false，onlyChildren为true，ui行为级联选中子节点，子节点可反选，值只包含子节点的值
     */
    public Tree cascade(boolean value)
    {
        return set("cascade", value);
    }

    /**
     * 容器 css 类名
     */
    public Tree className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Tree clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public Tree clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public Tree creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public Tree createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public Tree deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public Tree deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public Tree deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public Tree delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public Tree desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Tree description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Tree descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Tree disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tree disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public Tree editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public Tree editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public Tree editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public Tree editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 是否为选项添加默认的Icon，默认值为true
     */
    public Tree enableDefaultIcon(boolean value)
    {
        return set("enableDefaultIcon", value);
    }

    /**
     * 是否开启节点路径模式
     */
    public Tree enableNodePath(boolean value)
    {
        return set("enableNodePath", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public Tree extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 高度自动增长？
     */
    public Tree heightAuto(boolean value)
    {
        return set("heightAuto", value);
    }

    /**
     * 是否隐藏
     */
    public Tree hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tree hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏顶级
     */
    public Tree hideRoot(boolean value)
    {
        return set("hideRoot", value);
    }

    /**
     * 需要高亮的字符串
     */
    public Tree highlightTxt(Object value)
    {
        return set("highlightTxt", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Tree hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Tree horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tree id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public Tree initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public Tree initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Tree inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Tree inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public Tree joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public Tree label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Tree labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Tree labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Tree labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Tree labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Tree mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public Tree multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Tree name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Tree onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选父级的时候，是否只把子节点的值包含在内
     */
    public Tree onlyChildren(boolean value)
    {
        return set("onlyChildren", value);
    }

    /**
     * 单选时，只运行选择叶子节点
     */
    public Tree onlyLeaf(boolean value)
    {
        return set("onlyLeaf", value);
    }

    /**
     * 选项集合
     */
    public Tree options(Object value)
    {
        return set("options", value);
    }

    /**
     * 开启节点路径模式后，节点路径的分隔符
     */
    public Tree pathSeparator(Object value)
    {
        return set("pathSeparator", value);
    }

    /**
     * 占位符
     */
    public Tree placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Tree readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Tree readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Tree remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public Tree removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public Tree required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public Tree resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 顶级节点是否可以创建子节点
     */
    public Tree rootCreatable(boolean value)
    {
        return set("rootCreatable", value);
    }

    /**
     * 顶级选项的名称
     */
    public Tree rootLabel(Object value)
    {
        return set("rootLabel", value);
    }

    /**
     * 顶级选项的值
     */
    public Tree rootValue(Object value)
    {
        return set("rootValue", value);
    }

    /**
     * 搜索框的配置
     */
    public Tree searchConfig(Object value)
    {
        return set("searchConfig", value);
    }

    /**
     * 是否开启搜索
     */
    public Tree searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public Tree selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 显示图标
     */
    public Tree showIcon(boolean value)
    {
        return set("showIcon", value);
    }

    /**
     * 是否显示展开线
     */
    public Tree showOutline(boolean value)
    {
        return set("showOutline", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Tree size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public Tree source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Tree staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tree staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tree staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tree staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tree staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tree staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tree staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Tree style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Tree submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public Tree type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Tree validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Tree validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Tree validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Tree validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Tree value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Tree visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tree visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Tree width(Object value)
    {
        return set("width", value);
    }

    /**
     * 选父级的时候是否把子节点的值也包含在内。
     */
    public Tree withChildren(boolean value)
    {
        return set("withChildren", value);
    }


    public Tree set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
