package io.xiaoyu.common.yaims;



/**
 * Editor 代码编辑器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/editor
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Editor extends BaseRenderer {

    public Editor()
    {
        set("type", "editor");
    }

    /**
     * 是否展示全屏模式开关
     */
    public Editor allowFullscreen(boolean value)
    {
        return set("allowFullscreen", value);
    }

    /**
     * 容器 css 类名
     */
    public Editor className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Editor clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public Editor desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Editor description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Editor descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Editor disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Editor disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 获取编辑器底层实例
     */
    public Editor editorDidMount(Object value)
    {
        return set("editorDidMount", value);
    }

    /**
     * 是否隐藏
     */
    public Editor hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Editor hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Editor hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Editor horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Editor id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Editor inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Editor inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public Editor label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Editor labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Editor labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Editor labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Editor labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 语言类型 可选值: bat | c | coffeescript | cpp | csharp | css | dockerfile | fsharp | go | handlebars | html | ini | java | javascript | json | less | lua | markdown | msdax | objective-c | php | plaintext | postiats | powershell | pug | python | r | razor | ruby | sb | scss | shell | sol | sql | swift | typescript | vb | xml | yaml
     */
    public Editor language(Object value)
    {
        return set("language", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Editor mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Editor name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Editor onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Editor placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Editor readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Editor readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Editor remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Editor required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 编辑器大小 可选值: sm | md | lg | xl | xxl
     */
    public Editor size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public Editor staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Editor staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Editor staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Editor staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Editor staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Editor staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Editor staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Editor style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Editor submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     *  可选值: editor | bat-editor | c-editor | coffeescript-editor | cpp-editor | csharp-editor | css-editor | dockerfile-editor | fsharp-editor | go-editor | handlebars-editor | html-editor | ini-editor | java-editor | javascript-editor | json-editor | less-editor | lua-editor | markdown-editor | msdax-editor | objective-c-editor | php-editor | plaintext-editor | postiats-editor | powershell-editor | pug-editor | python-editor | r-editor | razor-editor | ruby-editor | sb-editor | scss-editor | sol-editor | sql-editor | swift-editor | typescript-editor | vb-editor | xml-editor | yaml-editor
     */
    public Editor type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Editor validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Editor validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Editor validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Editor validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Editor value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Editor visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Editor visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Editor width(Object value)
    {
        return set("width", value);
    }


    public Editor set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
