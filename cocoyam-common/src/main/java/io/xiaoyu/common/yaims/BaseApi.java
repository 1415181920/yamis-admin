package io.xiaoyu.common.yaims;



/**
 * BaseApi
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class BaseApi extends BaseRenderer 
{
    public BaseApi()
    {

    }

    /**
     * 如果 method 为 get 的接口，设置了 data 信息。 默认 data 会自动附带在 query 里面发送给后端。如果想通过 body 发送给后端，那么请把这个配置成 false。但是，浏览器还不支持啊，设置了只是摆设。除非服务端支持 method-override
     */
    public BaseApi attachDataToQuery(boolean value)
    {
        return set("attachDataToQuery", value);
    }

    /**
     * 是否自动刷新，当 url 中的取值结果变化时，自动刷新数据。
     */
    public BaseApi autoRefresh(boolean value)
    {
        return set("autoRefresh", value);
    }

    /**
     * 如果设置了值，同一个接口，相同参数，指定的时间（单位：ms）内请求将直接走缓存。
     */
    public BaseApi cache(Object value)
    {
        return set("cache", value);
    }

    /**
     * 默认数据映射中的key如果带点，或者带大括号，会转成对象比如：{   "a.b": "123" }经过数据映射后变成 {  a: {   b: "123  } }如果想要关闭此功能，请设置 convertKeyToPath 为 false
     */
    public BaseApi convertKeyToPath(boolean value)
    {
        return set("convertKeyToPath", value);
    }

    /**
     * 用来控制携带数据. 当key 为 `&` 值为 `` 时, 将所有原始数据打平设置到 data 中. 当值为  将所有原始数据赋值到对应的 key 中. 当值为  打头时, 将变量值设置到 key 中.
     */
    public BaseApi data(Object value)
    {
        return set("data", value);
    }

    /**
     * 发送体的格式 可选值: json | form-data | form
     */
    public BaseApi dataType(Object value)
    {
        return set("dataType", value);
    }

    /**
     * 强制将数据附加在 query，默认只有 api 地址中没有用变量的时候 crud 查询接口才会 自动附加数据到 query 部分，如果想强制附加请设置这个属性。 对于那种临时加了个变量但是又不想全部参数写一遍的时候配置很有用。
     */
    public BaseApi forceAppendDataToQuery(boolean value)
    {
        return set("forceAppendDataToQuery", value);
    }

    /**
     * 携带 headers，用法和 data 一样，可以用变量。
     */
    public BaseApi headers(Object value)
    {
        return set("headers", value);
    }

    /**
     * 提示信息
     */
    public BaseApi messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * API 发送类型 可选值: get | post | put | delete | patch | jsonp | js
     */
    public BaseApi method(Object value)
    {
        return set("method", value);
    }

    /**
     * qs 配置项
     */
    public BaseApi qsOptions(Object value)
    {
        return set("qsOptions", value);
    }

    /**
     * 默认都是追加模式，如果想完全替换把这个配置成 true
     */
    public BaseApi replaceData(boolean value)
    {
        return set("replaceData", value);
    }

    /**
     * 用来做接口返回的数据映射。
     */
    public BaseApi responseData(Object value)
    {
        return set("responseData", value);
    }

    /**
     * 如果是文件下载接口，请配置这个。
     */
    public BaseApi responseType(Object value)
    {
        return set("responseType", value);
    }

    /**
     * 设置发送条件
     */
    public BaseApi sendOn(Object value)
    {
        return set("sendOn", value);
    }

    /**
     * autoFill 是否显示自动填充错误提示
     */
    public BaseApi silent(boolean value)
    {
        return set("silent", value);
    }

    /**
     * 当开启自动刷新的时候，默认是 api 的 url 来自动跟踪变量变化的。 如果你希望监控 url 外的变量，请配置 traceExpression。
     */
    public BaseApi trackExpression(Object value)
    {
        return set("trackExpression", value);
    }

    /**
     * API 发送目标地址
     */
    public BaseApi url(Object value)
    {
        return set("url", value);
    }

    public BaseApi set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
