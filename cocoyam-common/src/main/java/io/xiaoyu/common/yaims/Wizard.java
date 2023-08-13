package io.xiaoyu.common.yaims;



/**
 * 表单向导 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/wizard
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Wizard extends BaseRenderer 
{
    public Wizard()
    {
        set("type", "wizard");

    }

    /**
     * 配置按钮 className
     */
    public Wizard actionClassName(Object value)
    {
        return set("actionClassName", value);
    }

    /**
     * 完成按钮的文字描述
     */
    public Wizard actionFinishLabel(Object value)
    {
        return set("actionFinishLabel", value);
    }

    /**
     * 下一步按钮的文字描述
     */
    public Wizard actionNextLabel(Object value)
    {
        return set("actionNextLabel", value);
    }

    /**
     * 下一步并且保存按钮的文字描述
     */
    public Wizard actionNextSaveLabel(Object value)
    {
        return set("actionNextSaveLabel", value);
    }

    /**
     * 上一步按钮的文字描述
     */
    public Wizard actionPrevLabel(Object value)
    {
        return set("actionPrevLabel", value);
    }

    /**
     * 是否将底部按钮固定在底部。
     */
    public Wizard affixFooter(Object value)
    {
        return set("affixFooter", value);
    }

    /**
     * Wizard 用来保存数据的 api。 [详情](https://baidu.github.io/amis/docs/api#wizard)
     */
    public Wizard api(Object value)
    {
        return set("api", value);
    }

    /**
     * 是否合并后再提交
     */
    public Wizard bulkSubmit(boolean value)
    {
        return set("bulkSubmit", value);
    }

    /**
     * 容器 css 类名
     */
    public Wizard className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Wizard disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Wizard disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Wizard hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Wizard hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Wizard id(Object value)
    {
        return set("id", value);
    }

    /**
     * Wizard 用来获取初始数据的 api。
     */
    public Wizard initApi(Object value)
    {
        return set("initApi", value);
    }

    public Wizard loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 展示模式 可选值: vertical | horizontal
     */
    public Wizard mode(Object value)
    {
        return set("mode", value);
    }

    public Wizard name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Wizard onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否为只读模式。
     */
    public Wizard readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 保存完后，可以指定跳转地址，支持相对路径和组内绝对路径，同时可以通过 xxx 使用变量
     */
    public Wizard redirect(Object value)
    {
        return set("redirect", value);
    }

    public Wizard reload(Object value)
    {
        return set("reload", value);
    }

    public Wizard startStep(Object value)
    {
        return set("startStep", value);
    }

    /**
     * 是否静态展示
     */
    public Wizard staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Wizard staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Wizard staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Wizard staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Wizard staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Wizard staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Wizard staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    public Wizard steps(Object value)
    {
        return set("steps", value);
    }

    /**
     * 组件样式
     */
    public Wizard style(Object value)
    {
        return set("style", value);
    }

    /**
     * 默认表单提交自己会通过发送 api 保存数据，但是也可以设定另外一个 form 的 name 值，或者另外一个 `CRUD` 模型的 name 值。 如果 target 目标是一个 `Form` ，则目标 `Form` 会重新触发 `initApi` 和 `schemaApi`，api 可以拿到当前 form 数据。如果目标是一个 `CRUD` 模型，则目标模型会重新触发搜索，参数为当前 Form 数据。
     */
    public Wizard target(Object value)
    {
        return set("target", value);
    }

    /**
     * 指定为表单向导
     */
    public Wizard type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Wizard visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Wizard visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Wizard set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
