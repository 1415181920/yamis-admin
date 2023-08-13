package io.xiaoyu.common.yaims;



/**
 * Chart 图表渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/carousel
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Chart extends BaseRenderer 
{
    public Chart()
    {
        set("type", "chart");

    }

    /**
     * 图表配置接口
     */
    public Chart api(Object value)
    {
        return set("api", value);
    }

    /**
     * Chart 主题配置
     */
    public Chart chartTheme(Object value)
    {
        return set("chartTheme", value);
    }

    /**
     * 容器 css 类名
     */
    public Chart className(Object value)
    {
        return set("className", value);
    }

    /**
     * 点击行为配置，可以用来满足下钻操作等。
     */
    public Chart clickAction(Object value)
    {
        return set("clickAction", value);
    }

    /**
     * 配置echart的config，支持数据映射。如果用了数据映射，为了同步更新，请设置 trackExpression
     */
    public Chart config(Object value)
    {
        return set("config", value);
    }

    public Chart dataFilter(Object value)
    {
        return set("dataFilter", value);
    }

    /**
     * 默认开启 Config 中的数据映射，如果想关闭，请开启此功能。
     */
    public Chart disableDataMapping(boolean value)
    {
        return set("disableDataMapping", value);
    }

    /**
     * 是否禁用
     */
    public Chart disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Chart disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 高度设置
     */
    public Chart height(Object value)
    {
        return set("height", value);
    }

    /**
     * 是否隐藏
     */
    public Chart hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Chart hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Chart id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否初始加载。
     */
    public Chart initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 是否初始加载用表达式来配置
     */
    public Chart initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 刷新时间
     */
    public Chart interval(Object value)
    {
        return set("interval", value);
    }

    /**
     * 加载百度地图
     */
    public Chart loadBaiduMap(boolean value)
    {
        return set("loadBaiduMap", value);
    }

    /**
     * 地图名称
     */
    public Chart mapName(Object value)
    {
        return set("mapName", value);
    }

    /**
     * 获取 geo json 文件的地址
     */
    public Chart mapURL(Object value)
    {
        return set("mapURL", value);
    }

    public Chart name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Chart onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 默认配置时追加的，如果更新配置想完全替换配置请配置为 true.
     */
    public Chart replaceChartOption(boolean value)
    {
        return set("replaceChartOption", value);
    }

    public Chart source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public Chart staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Chart staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Chart staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Chart staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Chart staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Chart staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Chart staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * style样式
     */
    public Chart style(Object value)
    {
        return set("style", value);
    }

    /**
     * 跟踪表达式，如果这个表达式的运行结果发生变化了，则会更新 Echart，当 config 中用了数据映射时有用。
     */
    public Chart trackExpression(Object value)
    {
        return set("trackExpression", value);
    }

    /**
     * 指定为 chart 类型
     */
    public Chart type(Object value)
    {
        return set("type", value);
    }

    /**
     * 不可见的时候隐藏
     */
    public Chart unMountOnHidden(boolean value)
    {
        return set("unMountOnHidden", value);
    }

    /**
     * 是否显示
     */
    public Chart visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Chart visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 宽度设置
     */
    public Chart width(Object value)
    {
        return set("width", value);
    }

    public Chart set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
