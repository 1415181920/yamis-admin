package io.xiaoyu.common.yaims;



/**
 * Tasks 渲染器，格式说明 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/tasks
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Tasks extends BaseRenderer 
{
    public Tasks()
    {
        set("type", "tasks");

    }

    public Tasks btnClassName(Object value)
    {
        return set("btnClassName", value);
    }

    /**
     * 操作按钮文字
     */
    public Tasks btnText(Object value)
    {
        return set("btnText", value);
    }

    public Tasks canRetryStatusCode(Object value)
    {
        return set("canRetryStatusCode", value);
    }

    /**
     * 用来获取任务状态的 API，当没有进行时任务时不会发送。
     */
    public Tasks checkApi(Object value)
    {
        return set("checkApi", value);
    }

    /**
     * 容器 css 类名
     */
    public Tasks className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Tasks disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Tasks disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public Tasks errorStatusCode(Object value)
    {
        return set("errorStatusCode", value);
    }

    public Tasks finishStatusCode(Object value)
    {
        return set("finishStatusCode", value);
    }

    /**
     * 是否隐藏
     */
    public Tasks hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Tasks hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Tasks id(Object value)
    {
        return set("id", value);
    }

    public Tasks initialStatusCode(Object value)
    {
        return set("initialStatusCode", value);
    }

    /**
     * 当有任务进行中，会每隔一段时间再次检测，而时间间隔就是通过此项配置，默认 3s。
     */
    public Tasks interval(Object value)
    {
        return set("interval", value);
    }

    public Tasks items(Object value)
    {
        return set("items", value);
    }

    public Tasks loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public Tasks loadingStatusCode(Object value)
    {
        return set("loadingStatusCode", value);
    }

    public Tasks name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Tasks onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 操作列说明
     */
    public Tasks operationLabel(Object value)
    {
        return set("operationLabel", value);
    }

    /**
     * 如果任务失败，且可以重试，提交的时候会使用此 API
     */
    public Tasks reSubmitApi(Object value)
    {
        return set("reSubmitApi", value);
    }

    public Tasks readyStatusCode(Object value)
    {
        return set("readyStatusCode", value);
    }

    /**
     * 备注列说明
     */
    public Tasks remarkLabel(Object value)
    {
        return set("remarkLabel", value);
    }

    /**
     * 配置容器重试按钮 className
     */
    public Tasks retryBtnClassName(Object value)
    {
        return set("retryBtnClassName", value);
    }

    /**
     * 重试操作按钮文字
     */
    public Tasks retryBtnText(Object value)
    {
        return set("retryBtnText", value);
    }

    /**
     * 是否静态展示
     */
    public Tasks staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Tasks staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Tasks staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Tasks staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Tasks staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Tasks staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Tasks staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 状态列说明
     */
    public Tasks statusLabel(Object value)
    {
        return set("statusLabel", value);
    }

    /**
     * 状态显示对应的类名配置。
     */
    public Tasks statusLabelMap(Object value)
    {
        return set("statusLabelMap", value);
    }

    /**
     * 状态显示对应的文字显示配置。
     */
    public Tasks statusTextMap(Object value)
    {
        return set("statusTextMap", value);
    }

    /**
     * 组件样式
     */
    public Tasks style(Object value)
    {
        return set("style", value);
    }

    /**
     * 提交任务使用的 API
     */
    public Tasks submitApi(Object value)
    {
        return set("submitApi", value);
    }

    /**
     * 配置 table className
     */
    public Tasks tableClassName(Object value)
    {
        return set("tableClassName", value);
    }

    /**
     * 任务名称列说明
     */
    public Tasks taskNameLabel(Object value)
    {
        return set("taskNameLabel", value);
    }

    /**
     * 指定为任务类型
     */
    public Tasks type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Tasks visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Tasks visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Tasks set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
