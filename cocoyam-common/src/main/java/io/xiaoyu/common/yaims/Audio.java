package io.xiaoyu.common.yaims;



/**
 * Audio 音频渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/audio
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Audio extends BaseRenderer 
{
    public Audio()
    {
        set("type", "audio");
    }

    /**
     * 是否自动播放
     */
    public Audio autoPlay(boolean value)
    {
        return set("autoPlay", value);
    }

    /**
     * 容器 css 类名
     */
    public Audio className(Object value)
    {
        return set("className", value);
    }

    /**
     * 可以配置控制器
     */
    public Audio controls(Object value)
    {
        return set("controls", value);
    }

    /**
     * 是否禁用
     */
    public Audio disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Audio disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public Audio hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Audio hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Audio id(Object value)
    {
        return set("id", value);
    }

    /**
     * 是否是内联模式
     */
    public Audio inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 是否循环播放
     */
    public Audio loop(boolean value)
    {
        return set("loop", value);
    }

    /**
     * 事件动作配置
     */
    public Audio onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 配置可选播放倍速
     */
    public Audio rates(Object value)
    {
        return set("rates", value);
    }

    /**
     * "视频播放地址, 支持  取变量。
     */
    public Audio src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public Audio staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Audio staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Audio staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Audio staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Audio staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Audio staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Audio staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public Audio style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为音频播放器
     */
    public Audio type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public Audio visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Audio visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Audio set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
