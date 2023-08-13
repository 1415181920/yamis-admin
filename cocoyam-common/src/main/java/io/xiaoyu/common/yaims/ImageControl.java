package io.xiaoyu.common.yaims;



/**
 * Image 图片上传控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/image
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ImageControl extends BaseRenderer 
{
//    use Uploader;

    public ImageControl()
    {
        set("type", "input-image");

//        this->receiver(this->uploadImagePath());
    }

    /**
     * 配置接收的图片类型建议直接填写文件后缀 如：.txt,.csv多个类型用逗号隔开。
     */
    public ImageControl accept(Object value)
    {
        return set("accept", value);
    }

    /**
     * 默认都是通过用户选择图片后上传返回图片地址，如果开启此选项，则可以允许用户图片地址。
     */
    public ImageControl allowInput(boolean value)
    {
        return set("allowInput", value);
    }

    /**
     * 上传后把其他字段同步到表单内部。
     */
    public ImageControl autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 是否自动开始上传
     */
    public ImageControl autoUpload(boolean value)
    {
        return set("autoUpload", value);
    }

    /**
     * 选择图片按钮的 CSS 类名
     */
    public ImageControl btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 上传按钮的 CSS 类名
     */
    public ImageControl btnUploadClassName(Object value)
    {
        return set("btnUploadClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public ImageControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ImageControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    public ImageControl compress(boolean value)
    {
        return set("compress", value);
    }

    public ImageControl compressOptions(Object value)
    {
        return set("compressOptions", value);
    }

    public ImageControl crop(Object value)
    {
        return set("crop", value);
    }

    /**
     * 裁剪后的图片类型
     */
    public ImageControl cropFormat(Object value)
    {
        return set("cropFormat", value);
    }

    /**
     * 裁剪后的质量
     */
    public ImageControl cropQuality(Object value)
    {
        return set("cropQuality", value);
    }

    /**
     * 分割符
     */
    public ImageControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public ImageControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ImageControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ImageControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public ImageControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ImageControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 图片上传完毕是否进入裁剪模式
     */
    public ImageControl dropCrop(boolean value)
    {
        return set("dropCrop", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public ImageControl extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否开启固定尺寸
     */
    public ImageControl fixedSize(boolean value)
    {
        return set("fixedSize", value);
    }

    /**
     * 固定尺寸的 CSS类名
     */
    public ImageControl fixedSizeClassName(Object value)
    {
        return set("fixedSizeClassName", value);
    }

    /**
     * 默认占位图图片地址
     */
    public ImageControl frameImage(Object value)
    {
        return set("frameImage", value);
    }

    /**
     * 是否隐藏
     */
    public ImageControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ImageControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏上传按钮
     */
    public ImageControl hideUploadButton(boolean value)
    {
        return set("hideUploadButton", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ImageControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ImageControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ImageControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 默认展示图片的类名
     */
    public ImageControl imageClassName(Object value)
    {
        return set("imageClassName", value);
    }

    /**
     * 初始化时是否把其他字段同步到表单内部。
     */
    public ImageControl initAutoFill(boolean value)
    {
        return set("initAutoFill", value);
    }

    /**
     * 初始化时是否打开裁剪模式
     */
    public ImageControl initCrop(boolean value)
    {
        return set("initCrop", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ImageControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ImageControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public ImageControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public ImageControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ImageControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ImageControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ImageControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ImageControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 限制图片大小，超出不让上传。
     */
    public ImageControl limit(Object value)
    {
        return set("limit", value);
    }

    /**
     * 最多的个数
     */
    public ImageControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 默认没有限制，当设置后，文件大小大于此值将不允许上传。
     */
    public ImageControl maxSize(Object value)
    {
        return set("maxSize", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ImageControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选
     */
    public ImageControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ImageControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public ImageControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public ImageControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否允许二次裁剪。
     */
    public ImageControl reCropable(boolean value)
    {
        return set("reCropable", value);
    }

    /**
     * 是否只读
     */
    public ImageControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ImageControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 默认 `/api/upload` 如果想自己存储，请设置此选项。
     */
    public ImageControl receiver(Object value)
    {
        return set("receiver", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ImageControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public ImageControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 清除时设置的值
     */
    public ImageControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认为 false, 开启后，允许用户输入压缩选项。
     */
    public ImageControl showCompressOptions(boolean value)
    {
        return set("showCompressOptions", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public ImageControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 默认展示图片的链接
     */
    public ImageControl src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public ImageControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ImageControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ImageControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ImageControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ImageControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ImageControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ImageControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ImageControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ImageControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 缩路图展示模式 可选值: w-full | h-full | contain | cover
     */
    public ImageControl thumbMode(Object value)
    {
        return set("thumbMode", value);
    }

    /**
     * 缩路图展示比率。 可选值: 1:1 | 4:3 | 16:9
     */
    public ImageControl thumbRatio(Object value)
    {
        return set("thumbRatio", value);
    }

    /**
     * 指定为图片上传控件
     */
    public ImageControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 上传按钮文案
     */
    public ImageControl uploadBtnText(Object value)
    {
        return set("uploadBtnText", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ImageControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ImageControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ImageControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ImageControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ImageControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public ImageControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ImageControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ImageControl width(Object value)
    {
        return set("width", value);
    }

    public ImageControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
