package io.xiaoyu.common.yaims;


//
//use cocoyam\OwlAdmin\Traits\Uploader;

/**
 * File 文件上传控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/file
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class File extends BaseRenderer {

//    use Uploader;

    public File()
    {
        set("type", "input-file");

//        this->receiver(this->uploadFilePath());
    }

    /**
     * 默认只支持纯文本，要支持其他类型，请配置此属性。建议直接填写文件后缀 如：.txt,.csv多个类型用逗号隔开。
     */
    public File accept(Object value)
    {
        return set("accept", value);
    }

    /**
     * 如果上传的文件比较小可以设置此选项来简单的把文件 base64 的值给 form 一起提交，目前不支持多选。
     */
    public File asBase64(boolean value)
    {
        return set("asBase64", value);
    }

    /**
     * 如果不希望 File 组件上传，可以配置 `asBlob` 或者 `asBase64`，采用这种方式后，组件不再自己上传了，而是直接把文件数据作为表单项的值，文件内容会在 Form 表单提交的接口里面一起带上。
     */
    public File asBlob(boolean value)
    {
        return set("asBlob", value);
    }

    /**
     * 上传后把其他字段同步到表单内部。
     */
    public File autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 是否自动开始上传
     */
    public File autoUpload(boolean value)
    {
        return set("autoUpload", value);
    }

    /**
     * 按钮 CSS 类名
     */
    public File btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 上传文件按钮说明
     */
    public File btnLabel(Object value)
    {
        return set("btnLabel", value);
    }

    /**
     * 上传按钮 CSS 类名
     */
    public File btnUploadClassName(Object value)
    {
        return set("btnUploadClassName", value);
    }

    /**
     * 默认 `/api/upload/chunk` 想自己存储时才需要关注。
     */
    public File chunkApi(Object value)
    {
        return set("chunkApi", value);
    }

    /**
     * 分块大小，默认为 5M.
     */
    public File chunkSize(Object value)
    {
        return set("chunkSize", value);
    }

    /**
     * 容器 css 类名
     */
    public File className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public File clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 分块上传的并发数
     */
    public File concurrency(Object value)
    {
        return set("concurrency", value);
    }

    /**
     * 分割符
     */
    public File delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public File desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public File description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public File descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public File disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public File disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 说明文档链接配置
     */
    public File documentLink(Object value)
    {
        return set("documentLink", value);
    }

    /**
     * 说明文档内容配置
     */
    public File documentation(Object value)
    {
        return set("documentation", value);
    }

    /**
     * 默认显示文件路径的时候会支持直接下载， 可以支持加前缀如：`http://xx.dom/filename=` ， 如果不希望这样，可以把当前配置项设置为 `false`。1.1.6 版本开始将支持变量 {xxx} 来自己拼凑个下载地址，并且支持配置成 post.
     */
    public File downloadUrl(Object value)
    {
        return set("downloadUrl", value);
    }

    /**
     * 是否为拖拽上传
     */
    public File drag(boolean value)
    {
        return set("drag", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public File extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 默认 `file`, 如果你不想自己存储，则可以忽略此属性。
     */
    public File fileField(Object value)
    {
        return set("fileField", value);
    }

    /**
     * 默认 `/api/upload/finishChunkApi` 想自己存储时才需要关注。
     */
    public File finishChunkApi(Object value)
    {
        return set("finishChunkApi", value);
    }

    /**
     * 是否隐藏
     */
    public File hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public File hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏上传按钮
     */
    public File hideUploadButton(boolean value)
    {
        return set("hideUploadButton", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public File hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public File horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public File id(Object value)
    {
        return set("id", value);
    }

    /**
     * 初始化时是否把其他字段同步到表单内部。
     */
    public File initAutoFill(boolean value)
    {
        return set("initAutoFill", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public File inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public File inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 1. 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交， 否则，整个选项对象都会作为该表单项的值提交。 2. 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来， 否则直接将以数组的形式提交值。
     */
    public File joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public File label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public File labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public File labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public File labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public File labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 最多的个数
     */
    public File maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 默认没有限制，当设置后，文件大小大于此值将不允许上传。
     */
    public File maxSize(Object value)
    {
        return set("maxSize", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public File mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选
     */
    public File multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public File name(Object value)
    {
        return set("name", value);
    }

    /**
     * 接口返回的数据中，哪个用来展示文件名
     */
    public File nameField(Object value)
    {
        return set("nameField", value);
    }

    /**
     * 事件动作配置
     */
    public File onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public File placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public File readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public File readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 默认 `/api/upload/file` 如果想自己存储，请设置此选项。
     */
    public File receiver(Object value)
    {
        return set("receiver", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public File remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public File required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 清除时设置的值
     */
    public File resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public File size(Object value)
    {
        return set("size", value);
    }

    /**
     * 默认 `/api/upload/startChunk` 想自己存储时才需要关注。
     */
    public File startChunkApi(Object value)
    {
        return set("startChunkApi", value);
    }

    /**
     * 按钮状态文案配置。
     */
    public File stateTextMap(Object value)
    {
        return set("stateTextMap", value);
    }

    /**
     * 是否静态展示
     */
    public File staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public File staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public File staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public File staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public File staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public File staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public File staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public File style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public File submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 模板下载地址
     */
    public File templateUrl(Object value)
    {
        return set("templateUrl", value);
    }

    /**
     * 指定为文件上传
     */
    public File type(Object value)
    {
        return set("type", value);
    }

    /**
     * 接口返回的数据中哪个用来作为下载地址。
     */
    public File urlField(Object value)
    {
        return set("urlField", value);
    }

    /**
     * 默认为 "auto" amis 所在服务器，限制了文件上传大小不得超出10M，所以 amis 在用户选择大文件的时候，自动会改成分块上传模式。
     */
    public File useChunk(Object value)
    {
        return set("useChunk", value);
    }

    /**
     * 远端校验表单项接口
     */
    public File validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public File validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public File validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public File validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public File value(Object value)
    {
        return set("value", value);
    }

    /**
     * 接口返回的数据中，哪个用来当做值
     */
    public File valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public File visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public File visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public File width(Object value)
    {
        return set("width", value);
    }

    public File set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
