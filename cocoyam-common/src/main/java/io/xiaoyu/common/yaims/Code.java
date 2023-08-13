package io.xiaoyu.common.yaims;



/**
 * Code 代码高亮
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Code extends BaseRenderer 
{
    public Code()
    {
        set("type", "code");

    }

    /**
     * 外层 CSS 类名
     */
    public Code className(Object value)
    {
        return set("className", value);
    }

    /**
     * 主题，还有 "vs-dark"
     */
    public Code editorTheme(Object value)
    {
        return set("editorTheme", value);
    }

    /**
     * 所使用的高亮语言，默认是 plaintext
     */
    public Code language(Object value)
    {
        return set("language", value);
    }

    /**
     * 在其他组件中，时，用作变量映射
     */
    public Code name(Object value)
    {
        return set("name", value);
    }

    /**
     * 默认 tab 大小
     */
    public Code tabSize(Object value)
    {
        return set("tabSize", value);
    }

    /**
     * 指定为 code 渲染器。
     */
    public Code type(Object value)
    {
        return set("type", value);
    }

    /**
     * 显示的颜色值
     */
    public Code value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否折行
     */
    public Code wordWrap(boolean value)
    {
        return set("wordWrap", value);
    }

    public Code set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
