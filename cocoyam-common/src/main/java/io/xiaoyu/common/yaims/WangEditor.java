package io.xiaoyu.common.yaims;


/**
 * WangEditor
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class WangEditor extends BaseRenderer 
{


    public WangEditor()
    {
        set("type", "custom-wang-editor");
    }

    /**
     * 自动填充
     */
    public WangEditor autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 自动获取焦点
     */
    public WangEditor autoFocus(boolean value)
    {
        return set("autoFocus", value);
    }

    /**
     * 设置类名
     */
    public WangEditor className(Object value)
    {
        return set("className", value);
    }

    /**
     * 当前表单项隐藏时是否清除值
     */
    public WangEditor clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 描述
     */
    public WangEditor description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public WangEditor disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public WangEditor disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 排除按钮
     */
    public WangEditor excludeKeys(Object value)
    {
        return set("excludeKeys", value);
    }

    /**
     * 编辑器高度 px
     */
    public WangEditor height(Object value)
    {
        return set("height", value);
    }

    /**
     * 插入按钮
     */
    public WangEditor insertKeys(Object value)
    {
        return set("insertKeys", value);
    }

    /**
     * 字段标签
     */
    public WangEditor label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public WangEditor labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 表单项标签描述
     */
    public WangEditor labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 最大长度
     */
    public WangEditor maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 字段名
     */
    public WangEditor name(Object value)
    {
        return set("name", value);
    }

    /**
     * 占位符
     */
    public WangEditor placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 备注
     */
    public WangEditor remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否必填
     */
    public WangEditor required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 是否必填的条件
     */
    public WangEditor requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否静态展示
     */
    public WangEditor staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 工具栏按钮
     */
    public WangEditor toolbarKeys(Object value)
    {
        return set("toolbarKeys", value);
    }

    /**
     * 指定为 custom-wang-editor 渲染器。
     */
    public WangEditor type(Object value)
    {
        return set("type", value);
    }

    /**
     * 上传图片的最大数量 默认 100
     */
    public WangEditor uploadImageMaxNumber(Object value)
    {
        return set("uploadImageMaxNumber", value);
    }

    /**
     * 上传图片的最大大小 单位: K 默认 2M
     */
    public WangEditor uploadImageMaxSize(Object value)
    {
        return set("uploadImageMaxSize", value);
    }

    /**
     * 上传图片的服务器地址
     */
    public WangEditor uploadImageServer(Object value)
    {
        return set("uploadImageServer", value);
    }

    /**
     * 上传视频的最大数量 默认 5
     */
    public WangEditor uploadVideoMaxNumber(Object value)
    {
        return set("uploadVideoMaxNumber", value);
    }

    /**
     * 上传视频的最大大小 单位: K 默认 10M
     */
    public WangEditor uploadVideoMaxSize(Object value)
    {
        return set("uploadVideoMaxSize", value);
    }

    /**
     * 上传视频的服务器地址
     */
    public WangEditor uploadVideoServer(Object value)
    {
        return set("uploadVideoServer", value);
    }

    /**
     * 校验接口
     */
    public WangEditor validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 校验错误信息
     */
    public WangEditor validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    /**
     * 校验规则
     */
    public WangEditor validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值
     */
    public WangEditor value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public WangEditor visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否显示的条件
     */
    public WangEditor visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public WangEditor set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
