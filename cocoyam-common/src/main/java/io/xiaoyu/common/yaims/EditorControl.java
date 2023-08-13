package io.xiaoyu.common.yaims;



/**
 * Editor 代码编辑器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/editor
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class EditorControl extends BaseRenderer 
{
    public EditorControl()
    {
        set("type", "editor");

    }

    /**
     * 是否展示全屏模式开关
     */
    public EditorControl allowFullscreen(boolean value)
    {
        return set("allowFullscreen", value);
    }

    /**
     * 容器 css 类名
     */
    public EditorControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public EditorControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public EditorControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public EditorControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public EditorControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public EditorControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public EditorControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 获取编辑器底层实例
     */
    public EditorControl editorDidMount(Object value)
    {
        return set("editorDidMount", value);
    }

    /**
     * 是否隐藏
     */
    public EditorControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public EditorControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public EditorControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public EditorControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public EditorControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public EditorControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public EditorControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public EditorControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public EditorControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public EditorControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public EditorControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public EditorControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 语言类型 可选值: bat | c | coffeescript | cpp | csharp | css | dockerfile | fsharp | go | handlebars | html | ini | java | javascript | json | less | lua | markdown | msdax | objective-c | php | plaintext | postiats | powershell | pug | python | r | razor | ruby | sb | scss | shell | sol | sql | swift | typescript | vb | xml | yaml
     */
    public EditorControl language(Object value)
    {
        return set("language", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public EditorControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public EditorControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public EditorControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public EditorControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public EditorControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public EditorControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public EditorControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public EditorControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 编辑器大小 可选值: sm | md | lg | xl | xxl
     */
    public EditorControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public EditorControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public EditorControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public EditorControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public EditorControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public EditorControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public EditorControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public EditorControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public EditorControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public EditorControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     *  可选值: editor | bat-editor | c-editor | coffeescript-editor | cpp-editor | csharp-editor | css-editor | dockerfile-editor | fsharp-editor | go-editor | handlebars-editor | html-editor | ini-editor | java-editor | javascript-editor | json-editor | less-editor | lua-editor | markdown-editor | msdax-editor | objective-c-editor | php-editor | plaintext-editor | postiats-editor | powershell-editor | pug-editor | python-editor | r-editor | razor-editor | ruby-editor | sb-editor | scss-editor | sol-editor | sql-editor | swift-editor | typescript-editor | vb-editor | xml-editor | yaml-editor
     */
    public EditorControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public EditorControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public EditorControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public EditorControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public EditorControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public EditorControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public EditorControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public EditorControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public EditorControl width(Object value)
    {
        return set("width", value);
    }

    public EditorControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
