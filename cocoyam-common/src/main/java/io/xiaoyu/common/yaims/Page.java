package io.xiaoyu.common.yaims;



/**
 * amis Page 渲染器。详情请见：https://aisuda.bce.baidu.com/amis/zh-CN/components/page
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Page extends BaseRenderer
{
    public Page()
    {
        set("type", "page");

    }

    /**
     * 边栏区域
     */
    public Page aside(Object value)
    {
        return set("aside", value);
    }

    /**
     * 边栏区 css 类名
     */
    public Page asideClassName(Object value)
    {
        return set("asideClassName", value);
    }

    /**
     * 边栏最小宽度
     */
    public Page asideMaxWidth(Object value)
    {
        return set("asideMaxWidth", value);
    }

    /**
     * 边栏最小宽度
     */
    public Page asideMinWidth(Object value)
    {
        return set("asideMinWidth", value);
    }

    /**
     * 边栏是否允许拖动
     */
    public Page asideResizor(boolean value)
    {
        return set("asideResizor", value);
    }

    /**
     * 边栏内容是否粘住，即不跟随滚动。
     */
    public Page asideSticky(boolean value)
    {
        return set("asideSticky", value);
    }

    /**
     * 内容区域
     */
    public Page body(Object value)
    {
        return set("body", value);
    }

    /**
     * 内容区 css 类名
     */
    public Page bodyClassName(Object value)
    {
        return set("bodyClassName", value);
    }

    /**
     * 配置容器 className
     */
    public Page className(Object value)
    {
        return set("className", value);
    }

    /**
     * 自定义页面级别样式表
     */
    public Page css(Object value)
    {
        return set("css", value);
    }

    /**
     * css 变量
     */
    public Page cssVars(Object value)
    {
        return set("cssVars", value);
    }

    /**
     * 页面级别的初始数据
     */
    public Page data(Object value)
    {
        return set("data", value);
    }

    public Page definitions(Object value)
    {
        return set("definitions", value);
    }

    /**
     * 是否禁用
     */
    public Page disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Page disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 配置 header 容器 className
     */
    public Page headerClassName(Object value)
    {
        return set("headerClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Page hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Page hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Page id(Object value)
    {
        return set("id", value);
    }

    /**
     * 页面初始化的时候，可以设置一个 API 让其取拉取，发送数据会携带当前 data 数据（包含地址栏参数），获取得数据会合并到 data 中，供组件内使用。
     */
    public Page initApi(Object value)
    {
        return set("initApi", value);
    }

    /**
     * 是否默认就拉取？
     */
    public Page initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 是否默认就拉取表达式
     */
    public Page initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 配置轮询间隔，配置后 initApi 将轮询加载。
     */
    public Page interval(Object value)
    {
        return set("interval", value);
    }

    public Page loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    public Page messages(Object value)
    {
        return set("messages", value);
    }

    /**
     * 移动端下的样式表
     */
    public Page mobileCSS(Object value)
    {
        return set("mobileCSS", value);
    }

    public Page name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Page onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 下拉刷新配置
     */
    public Page pullRefresh(Object value)
    {
        return set("pullRefresh", value);
    }

    /**
     * 默认不设置自动感觉内容来决定要不要展示这些区域 如果配置了，以配置为主。
     */
    public Page regions(Object value)
    {
        return set("regions", value);
    }

    /**
     * 页面描述, 标题旁边会出现个小图标，放上去会显示这个属性配置的内容。
     */
    public Page remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否显示错误信息，默认是显示的。
     */
    public Page showErrorMsg(boolean value)
    {
        return set("showErrorMsg", value);
    }

    /**
     * 是否要静默加载，也就是说不显示进度
     */
    public Page silentPolling(boolean value)
    {
        return set("silentPolling", value);
    }

    /**
     * 是否静态展示
     */
    public Page staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Page staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Page staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Page staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Page staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Page staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Page staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 配置停止轮询的条件。
     */
    public Page stopAutoRefreshWhen(Object value)
    {
        return set("stopAutoRefreshWhen", value);
    }

    /**
     * 自定义样式
     */
    public Page style(Object value)
    {
        return set("style", value);
    }

    /**
     * 页面副标题
     */
    public Page subTitle(Object value)
    {
        return set("subTitle", value);
    }

    /**
     * 页面标题
     */
    public Page title(Object value)
    {
        return set("title", value);
    }

    /**
     * 页面顶部区域，当存在 title 时在右上角显示。
     */
    public Page toolbar(Object value)
    {
        return set("toolbar", value);
    }

    /**
     * 配置 toolbar 容器 className
     */
    public Page toolbarClassName(Object value)
    {
        return set("toolbarClassName", value);
    }

    /**
     * 指定为 page 渲染器。
     */
    public Page type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Page visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Page visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Page set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
