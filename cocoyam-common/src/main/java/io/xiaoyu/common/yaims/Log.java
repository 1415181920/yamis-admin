package io.xiaoyu.common.yaims;



/**
 * Log 实时日志
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Log extends BaseRenderer 
{
    public Log()
    {
        set("type", "log");

    }

    /**
     * 是否自动滚动到底部
     */
    public Log autoScroll(Object value)
    {
        return set("autoScroll", value);
    }

    /**
     * 外层 CSS 类名
     */
    public Log className(Object value)
    {
        return set("className", value);
    }

    /**
     * 关闭 ANSI 颜色支持
     */
    public Log disableColor(Object value)
    {
        return set("disableColor", value);
    }

    /**
     * 返回内容的字符编码
     */
    public Log encoding(Object value)
    {
        return set("encoding", value);
    }

    /**
     * 展示区域高度
     */
    public Log height(Object value)
    {
        return set("height", value);
    }

    /**
     * 最大显示行数
     */
    public Log maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 可选日志操作：["stop", "clear", "showLineNumber", "filter"]
     */
    public Log operation(Object value)
    {
        return set("operation", value);
    }

    /**
     * 加载中的文字
     */
    public Log placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 设置每行高度，将会开启虚拟渲染
     */
    public Log rowHeight(Object value)
    {
        return set("rowHeight", value);
    }

    /**
     * 接口
     */
    public Log source(Object value)
    {
        return set("source", value);
    }

    /**
     * 指定为 log 渲染器。
     */
    public Log type(Object value)
    {
        return set("type", value);
    }

    public Log set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
