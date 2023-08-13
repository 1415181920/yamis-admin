package io.xiaoyu.common.yaims;



/**
 * 视频播放器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/video
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Video extends BaseRenderer 
{
    public Video()
    {
        set("type", "video");

    }

    /**
     * 视频比率 可选值: auto | 4:3 | 16:9
     */
    public Video aspectRatio(Object value)
    {
        return set("aspectRatio", value);
    }

    /**
     * 是否自动播放
     */
    public Video autoPlay(boolean value)
    {
        return set("autoPlay", value);
    }

    /**
     * 容器 css 类名
     */
    public Video className(Object value)
    {
        return set("className", value);
    }

    /**
     * 如果显示切帧，通过此配置项可以控制每行显示多少帧
     */
    public Video columnsCount(Object value)
    {
        return set("columnsCount", value);
    }

    /**
     * 是否禁用
     */
    public Video disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Video disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 设置后，可以显示切帧.点击帧的时候会将视频跳到对应时间。frames: {  "01:22": "http://domain/xxx.jpg" }
     */
    public Video frames(Object value)
    {
        return set("frames", value);
    }

    /**
     * 配置帧列表容器className
     */
    public Video framesClassName(Object value)
    {
        return set("framesClassName", value);
    }

    /**
     * 是否隐藏
     */
    public Video hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Video hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Video id(Object value)
    {
        return set("id", value);
    }

    /**
     * 如果是实时的，请标记一下
     */
    public Video isLive(boolean value)
    {
        return set("isLive", value);
    }

    /**
     * 跳转到帧时，往前多少秒。
     */
    public Video jumpBufferDuration(Object value)
    {
        return set("jumpBufferDuration", value);
    }

    /**
     * 点击帧画面时是否跳转视频对应的点
     */
    public Video jumpFrame(boolean value)
    {
        return set("jumpFrame", value);
    }

    /**
     * 是否初始静音
     */
    public Video muted(boolean value)
    {
        return set("muted", value);
    }

    /**
     * 事件动作配置
     */
    public Video onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 配置播放器 className
     */
    public Video playerClassName(Object value)
    {
        return set("playerClassName", value);
    }

    /**
     * 视频封面地址
     */
    public Video poster(Object value)
    {
        return set("poster", value);
    }

    /**
     * 视频速率
     */
    public Video rates(Object value)
    {
        return set("rates", value);
    }

    /**
     * 是否将视频和封面分开显示
     */
    public Video splitPoster(boolean value)
    {
        return set("splitPoster", value);
    }

    /**
     * 视频播放地址
     */
    public Video src(Object value)
    {
        return set("src", value);
    }

    /**
     * 是否静态展示
     */
    public Video staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Video staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Video staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Video staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Video staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Video staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Video staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 默认播放的时候到了下一帧会继续播放，同时高亮下一帧。 如果配置这个则会停止播放，等待用户选择新的区间再播放。
     */
    public Video stopOnNextFrame(boolean value)
    {
        return set("stopOnNextFrame", value);
    }

    /**
     * 组件样式
     */
    public Video style(Object value)
    {
        return set("style", value);
    }

    /**
     * 指定为视频类型
     */
    public Video type(Object value)
    {
        return set("type", value);
    }

    /**
     * 视频类型如： video/x-flv
     */
    public Video videoType(Object value)
    {
        return set("videoType", value);
    }

    /**
     * 是否显示
     */
    public Video visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Video visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Video set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
