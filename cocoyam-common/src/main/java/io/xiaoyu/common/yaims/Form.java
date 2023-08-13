package io.xiaoyu.common.yaims;



/**
 * Form 表单渲染器。说明：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/index
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Form extends BaseRenderer 
{
    public Form()
    {
        set("type", "form");

    }

    /**
     * 按钮集合，会固定在底部显示。
     */
    public Form actions(Object value)
    {
        return set("actions", value);
    }

    /**
     * 是否固定底下的按钮在底部。
     */
    public Form affixFooter(boolean value)
    {
        return set("affixFooter", value);
    }

    /**
     * Form 用来保存数据的 api。详情：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/index#%E8%A1%A8%E5%8D%95%E6%8F%90%E4%BA%A4
     */
    public Form api(Object value)
    {
        return set("api", value);
    }

    /**
     * 设置此属性后，表单提交发送保存接口后，还会继续轮询请求该接口，直到返回 finished 属性为 true 才 结束。
     */
    public Form asyncApi(Object value)
    {
        return set("asyncApi", value);
    }

    /**
     * 是否自动将第一个表单元素聚焦。
     */
    public Form autoFocus(boolean value)
    {
        return set("autoFocus", value);
    }

    /**
     * 表单项集合
     */
    public Form body(Object value)
    {
        return set("body", value);
    }

    /**
     * 轮询请求的时间间隔，默认为 3秒。设置 asyncApi 才有效
     */
    public Form checkInterval(Object value)
    {
        return set("checkInterval", value);
    }

    /**
     * 容器 css 类名
     */
    public Form className(Object value)
    {
        return set("className", value);
    }

    /**
     * 提交后清空表单
     */
    public Form clearAfterSubmit(boolean value)
    {
        return set("clearAfterSubmit", value);
    }

    /**
     * 提交成功后清空本地缓存
     */
    public Form clearPersistDataAfterSubmit(boolean value)
    {
        return set("clearPersistDataAfterSubmit", value);
    }

    /**
     * 表单项显示为几列
     */
    public Form columnCount(Object value)
    {
        return set("columnCount", value);
    }

    public Form data(Object value)
    {
        return set("data", value);
    }

    /**
     * 是否开启调试，开启后会在顶部实时显示表单项数据。
     */
    public Form debug(boolean value)
    {
        return set("debug", value);
    }

    /**
     * Debug面板配置
     */
    public Form debugConfig(Object value)
    {
        return set("debugConfig", value);
    }

    /**
     * 是否禁用
     */
    public Form disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Form disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * Form 也可以配置 feedback。
     */
    public Form feedback(Object value)
    {
        return set("feedback", value);
    }

    public Form fieldSet(Object value)
    {
        return set("fieldSet", value);
    }

    /**
     * 如果决定结束的字段名不是 `finished` 请设置此属性，比如 `is_success`
     */
    public Form finishedField(Object value)
    {
        return set("finishedField", value);
    }

    /**
     * 是否隐藏
     */
    public Form hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Form hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
     */
    public Form horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Form id(Object value)
    {
        return set("id", value);
    }

    /**
     * 用来初始化表单数据
     */
    public Form initApi(Object value)
    {
        return set("initApi", value);
    }

    /**
     * Form 用来获取初始数据的 api,与initApi不同的是，会一直轮询请求该接口，直到返回 finished 属性为 true 才 结束。
     */
    public Form initAsyncApi(Object value)
    {
        return set("initAsyncApi", value);
    }

    /**
     * 设置了initAsyncApi以后，默认拉取的时间间隔
     */
    public Form initCheckInterval(Object value)
    {
        return set("initCheckInterval", value);
    }

    /**
     * 是否初始加载
     */
    public Form initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 建议改成 api 的 sendOn 属性。
     */
    public Form initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 设置了initAsyncApi后，默认会从返回数据的data.finished来判断是否完成，也可以设置成其他的xxx，就会从data.xxx中获取
     */
    public Form initFinishedField(Object value)
    {
        return set("initFinishedField", value);
    }

    /**
     * 设置后将轮询调用 initApi
     */
    public Form interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 表单label的对齐方式
     */
    public Form labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public Form labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 消息文案配置，记住这个优先级是最低的，如果你的接口返回了 msg，接口返回的优先。
     */
    public Form messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 配置表单项默认的展示方式。 可选值: normal | inline | horizontal
     */
    public Form mode(Object value)
    {
        return set("mode", value);
    }

    public Form name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Form onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 配置容器 panel className
     */
    public Form panelClassName(Object value)
    {
        return set("panelClassName", value);
    }

    /**
     * 是否开启本地缓存
     */
    public Form persistData(Object value)
    {
        return set("persistData", value);
    }

    /**
     * 开启本地缓存后限制保存哪些 key
     */
    public Form persistDataKeys(Object value)
    {
        return set("persistDataKeys", value);
    }

    /**
     * 禁用回车提交
     */
    public Form preventEnterSubmit(boolean value)
    {
        return set("preventEnterSubmit", value);
    }

    /**
     * 设置主键 id, 当设置后，检测表单是否完成时（asyncApi），只会携带此数据。
     */
    public Form primaryField(Object value)
    {
        return set("primaryField", value);
    }

    /**
     * 页面离开提示，为了防止页面不小心跳转而导致表单没有保存。
     */
    public Form promptPageLeave(boolean value)
    {
        return set("promptPageLeave", value);
    }

    /**
     * 具体的提示信息，选填。
     */
    public Form promptPageLeaveMessage(Object value)
    {
        return set("promptPageLeaveMessage", value);
    }

    public Form redirect(Object value)
    {
        return set("redirect", value);
    }

    public Form reload(Object value)
    {
        return set("reload", value);
    }

    /**
     * 提交完后重置表单
     */
    public Form resetAfterSubmit(boolean value)
    {
        return set("resetAfterSubmit", value);
    }

    /**
     * 组合校验规则，选填
     */
    public Form rules(Object value)
    {
        return set("rules", value);
    }

    /**
     * 是否静默拉取
     */
    public Form silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 展示态时的className
     */
    public Form staticAmis(boolean value)
    {
        return set("static", value);
    }

    public Form staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Form staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Form staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    public Form staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Form staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Form staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 配置停止轮询的条件
     */
    public Form stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 组件样式
     */
    public Form style(Object value)
    {
        return set("style", value);
    }

    /**
     * 修改的时候是否直接提交表单。
     */
    public Form submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单初始先提交一次，联动的时候有用
     */
    public Form submitOnInit(boolean value)
    {
        return set("submitOnInit", value);
    }

    /**
     * 默认的提交按钮名称，如果设置成空，则可以把默认按钮去掉。
     */
    public Form submitText(Object value)
    {
        return set("submitText", value);
    }

    public Form tabs(Object value)
    {
        return set("tabs", value);
    }

    /**
     * 默认表单提交自己会通过发送 api 保存数据，但是也可以设定另外一个 form 的 name 值，或者另外一个 `CRUD` 模型的 name 值。 如果 target 目标是一个 `Form` ，则目标 `Form` 会重新触发 `initApi` 和 `schemaApi`，api 可以拿到当前 form 数据。如果目标是一个 `CRUD` 模型，则目标模型会重新触发搜索，参数为当前 Form 数据。
     */
    public Form target(Object value)
    {
        return set("target", value);
    }

    /**
     * 表单标题
     */
    public Form title(Object value)
    {
        return set("title", value);
    }

    /**
     * 指定为表单渲染器。
     */
    public Form type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Form visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Form visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 是否用 panel 包裹起来
     */
    public Form wrapWithPanel(boolean value)
    {
        return set("wrapWithPanel", value);
    }

    public Form set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
