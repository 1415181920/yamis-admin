package io.xiaoyu.common.yaims;



/**
 * TableControl
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TableControl extends BaseRenderer 
{
    public TableControl()
    {
        set("type", "input-table");

    }

    /**
     * 新增 API
     */
    public TableControl addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增按钮图标
     */
    public TableControl addBtnIcon(Object value)
    {
        return set("addBtnIcon", value);
    }

    /**
     * 新增按钮文字
     */
    public TableControl addBtnLabel(Object value)
    {
        return set("addBtnLabel", value);
    }

    /**
     * 可新增
     */
    public TableControl addable(boolean value)
    {
        return set("addable", value);
    }

    /**
     * 是否固定表头
     */
    public TableControl affixHeader(boolean value)
    {
        return set("affixHeader", value);
    }

    /**
     * 底部总结行
     */
    public TableControl affixRow(Object value)
    {
        return set("affixRow", value);
    }

    /**
     * 表格自动计算高度
     */
    public TableControl autoFillHeight(Object value)
    {
        return set("autoFillHeight", value);
    }

    /**
     * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
     */
    public TableControl autoGenerateFilter(Object value)
    {
        return set("autoGenerateFilter", value);
    }

    /**
     * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
     */
    public TableControl canAccessSuperData(boolean value)
    {
        return set("canAccessSuperData", value);
    }

    /**
     * 取消按钮图标
     */
    public TableControl cancelBtnIcon(Object value)
    {
        return set("cancelBtnIcon", value);
    }

    /**
     * 取消按钮文字
     */
    public TableControl cancelBtnLabel(Object value)
    {
        return set("cancelBtnLabel", value);
    }

    /**
     * 容器 css 类名
     */
    public TableControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public TableControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 表格的列信息
     */
    public TableControl columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
     */
    public TableControl columnsTogglable(boolean value)
    {
        return set("columnsTogglable", value);
    }

    /**
     * 合并单元格配置，配置从第几列开始合并。
     */
    public TableControl combineFromIndex(Object value)
    {
        return set("combineFromIndex", value);
    }

    /**
     * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
     */
    public TableControl combineNum(Object value)
    {
        return set("combineNum", value);
    }

    /**
     * 确认按钮图标
     */
    public TableControl confirmBtnIcon(Object value)
    {
        return set("confirmBtnIcon", value);
    }

    /**
     * 确认按钮文字
     */
    public TableControl confirmBtnLabel(Object value)
    {
        return set("confirmBtnLabel", value);
    }

    /**
     * 是否显示复制按钮
     */
    public TableControl copyAddBtn(boolean value)
    {
        return set("copyAddBtn", value);
    }

    /**
     * 复制按钮图标
     */
    public TableControl copyBtnIcon(Object value)
    {
        return set("copyBtnIcon", value);
    }

    /**
     * 复制按钮文字
     */
    public TableControl copyBtnLabel(Object value)
    {
        return set("copyBtnLabel", value);
    }

    /**
     * 可复制新增
     */
    public TableControl copyable(boolean value)
    {
        return set("copyable", value);
    }

    /**
     * 删除的 API
     */
    public TableControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 删除按钮图标
     */
    public TableControl deleteBtnIcon(Object value)
    {
        return set("deleteBtnIcon", value);
    }

    /**
     * 删除按钮文字
     */
    public TableControl deleteBtnLabel(Object value)
    {
        return set("deleteBtnLabel", value);
    }

    /**
     * 删除确认文字
     */
    public TableControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    public TableControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public TableControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public TableControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public TableControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TableControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可以拖拽排序
     */
    public TableControl draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 更新按钮图标
     */
    public TableControl editBtnIcon(Object value)
    {
        return set("editBtnIcon", value);
    }

    /**
     * 更新按钮名称
     */
    public TableControl editBtnLabel(Object value)
    {
        return set("editBtnLabel", value);
    }

    /**
     * 可否编辑
     */
    public TableControl editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 是否开启底部展示功能，适合移动端展示
     */
    public TableControl footable(boolean value)
    {
        return set("footable", value);
    }

    /**
     * 底部新增按钮配置
     */
    public TableControl footerAddBtn(Object value)
    {
        return set("footerAddBtn", value);
    }

    /**
     * 底部外层 CSS 类名
     */
    public TableControl footerClassName(Object value)
    {
        return set("footerClassName", value);
    }

    /**
     * 顶部外层 CSS 类名
     */
    public TableControl headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public TableControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TableControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public TableControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public TableControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TableControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public TableControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public TableControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 行角标
     */
    public TableControl itemBadge(Object value)
    {
        return set("itemBadge", value);
    }

    /**
     * 描述标题
     */
    public TableControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public TableControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public TableControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public TableControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public TableControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 限制最大个数
     */
    public TableControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 限制最小个数
     */
    public TableControl minLength(Object value)
    {
        return set("minLength", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public TableControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public TableControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 是否为确认的编辑模式。
     */
    public TableControl needConfirm(boolean value)
    {
        return set("needConfirm", value);
    }

    /**
     * 事件动作配置
     */
    public TableControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 分页个数，默认不分页
     */
    public TableControl perPage(Object value)
    {
        return set("perPage", value);
    }

    /**
     * 占位符
     */
    public TableControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 顶部总结行
     */
    public TableControl prefixRow(Object value)
    {
        return set("prefixRow", value);
    }

    /**
     * 是否只读
     */
    public TableControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public TableControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public TableControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 可否删除
     */
    public TableControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public TableControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 是否可调整列宽
     */
    public TableControl resizable(boolean value)
    {
        return set("resizable", value);
    }

    /**
     * 行样式表表达式
     */
    public TableControl rowClassNameExpr(Object value)
    {
        return set("rowClassNameExpr", value);
    }

    /**
     * 初始值，新增的时候
     */
    public TableControl scaffold(Object value)
    {
        return set("scaffold", value);
    }

    /**
     * 是否显示底部
     */
    public TableControl showFooter(boolean value)
    {
        return set("showFooter", value);
    }

    /**
     * 是否显示底部新增按钮
     */
    public TableControl showFooterAddBtn(boolean value)
    {
        return set("showFooterAddBtn", value);
    }

    /**
     * 是否显示头部
     */
    public TableControl showHeader(boolean value)
    {
        return set("showHeader", value);
    }

    /**
     * 是否显示序号
     */
    public TableControl showIndex(boolean value)
    {
        return set("showIndex", value);
    }

    /**
     * 是否显示表格操作栏新增按钮
     */
    public TableControl showTableAddBtn(boolean value)
    {
        return set("showTableAddBtn", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public TableControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 数据源：绑定当前环境变量
     */
    public TableControl source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public TableControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TableControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TableControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TableControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TableControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TableControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TableControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public TableControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public TableControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表格 CSS 类名
     */
    public TableControl tableClassName(Object value)
    {
        return set("tableClassName", value);
    }

    /**
     * 标题
     */
    public TableControl title(Object value)
    {
        return set("title", value);
    }

    /**
     * 工具栏 CSS 类名
     */
    public TableControl toolbarClassName(Object value)
    {
        return set("toolbarClassName", value);
    }

    public TableControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 更新 API
     */
    public TableControl updateApi(Object value)
    {
        return set("updateApi", value);
    }

    /**
     * 远端校验表单项接口
     */
    public TableControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public TableControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public TableControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public TableControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public TableControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 值字段
     */
    public TableControl valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public TableControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TableControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public TableControl width(Object value)
    {
        return set("width", value);
    }

    public TableControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
