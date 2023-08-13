package io.xiaoyu.common.yaims;



/**
 * Matrix 选择控件。适合做权限勾选。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/matrix
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Matrix extends BaseRenderer {

    public Matrix()
    {
        set("type", "matrix-checkboxes");
    }

    /**
     * 容器 css 类名
     */
    public Matrix className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public Matrix clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public Matrix columns(Object value)
    {
        return set("columns", value);
    }

    public Matrix desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public Matrix description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public Matrix descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public Matrix disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Matrix disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Matrix hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Matrix hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public Matrix hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public Matrix horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Matrix id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public Matrix inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public Matrix inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public Matrix label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public Matrix labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public Matrix labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public Matrix labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Matrix labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public Matrix mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 配置singleSelectMode时设置为false
     */
    public Matrix multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public Matrix name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Matrix onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Matrix placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public Matrix readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public Matrix readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public Matrix remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public Matrix required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 行标题说明
     */
    public Matrix rowLabel(Object value)
    {
        return set("rowLabel", value);
    }

    public Matrix rows(Object value)
    {
        return set("rows", value);
    }

    /**
     * 设置单选模式，multiple为false时有效
     */
    public Matrix singleSelectMode(boolean value)
    {
        return set("singleSelectMode", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public Matrix size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public Matrix source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Matrix staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Matrix staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Matrix staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Matrix staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Matrix staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Matrix staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Matrix staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Matrix style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public Matrix submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public Matrix type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public Matrix validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public Matrix validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public Matrix validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public Matrix validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public Matrix value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public Matrix visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Matrix visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public Matrix width(Object value)
    {
        return set("width", value);
    }


    public Matrix set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
