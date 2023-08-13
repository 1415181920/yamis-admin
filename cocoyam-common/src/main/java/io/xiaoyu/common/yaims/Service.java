package io.xiaoyu.common.yaims;



/**
 * Service 服务类控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/service
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Service extends BaseRenderer 
{
    public Service()
    {
        set("type", "service");

    }

    /**
     * 页面初始化的时候，可以设置一个 API 让其取拉取，发送数据会携带当前 data 数据（包含地址栏参数），获取得数据会合并到 data 中，供组件内使用。
     */
    public Service api(Object value)
    {
        return set("api", value);
    }

    /**
     * 内容区域
     */
    public Service body(Object value)
    {
        return set("body", value);
    }

    /**
     * 容器 css 类名
     */
    public Service className(Object value)
    {
        return set("className", value);
    }

    /**
     * 通过调用外部函数来获取数据
     */
    public Service dataProvider(Object value)
    {
        return set("dataProvider", value);
    }

    /**
     * 是否禁用
     */
    public Service disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Service disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    public Service fetchOn(Object value)
    {
        return set("fetchOn", value);
    }

    /**
     * 是否隐藏
     */
    public Service hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Service hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Service id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否默认就拉取？
     */
    public Service initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 是否默认就拉取？通过表达式来决定.
     */
    public Service initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 是否默认加载 schemaApi
     */
    public Service initFetchSchema(boolean value)
    {
        return set("initFetchSchema", value);
    }

    /**
     * 用表达式来配置。
     */
    public Service initFetchSchemaOn(Object value)
    {
        return set("initFetchSchemaOn", value);
    }

    /**
     * 是否轮询拉取
     */
    public Service interval(Object value)
    {
        return set("interval", value);
    }

    public Service loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public Service messages(Object value)
    {
        return set("messages", value);
    }

    public Service name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Service onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 用来获取远程 Schema 的 api
     */
    public Service schemaApi(Object value)
    {
        return set("schemaApi", value);
    }

    /**
     * 是否以Alert的形式显示api接口响应的错误信息，默认展示
     */
    public Service showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * 是否静默拉取
     */
    public Service silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 是否静态展示
     */
    public Service staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Service staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Service staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Service staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Service staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Service staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Service staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 关闭轮询的条件。
     */
    public Service stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 组件样式
     */
    public Service style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为 Service 数据拉取控件。
     */
    public Service type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Service visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Service visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * WebScocket 地址，用于实时获取数据
     */
    public Service ws(Object value)
    {
        return set("ws", value);
    }

    public Service set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
