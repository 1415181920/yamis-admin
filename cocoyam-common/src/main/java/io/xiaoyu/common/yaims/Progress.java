package io.xiaoyu.common.yaims;



/**
 * 进度展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/progress
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class Progress extends BaseRenderer 
{
    public Progress()
    {
        set("type", "progress");
        set("mode", "line");

    }

    /**
     * 是否显示动画（只有在开启的时候才能看出来）
     */
    public Progress animate(boolean value)
    {
        return set("animate", value);
    }

    /**
     * 容器 css 类名
     */
    public Progress className(Object value)
    {
        return set("className", value);
    }

    /**
     * 是否禁用
     */
    public Progress disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public Progress disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 仪表盘进度条缺口角度，可取值 0 ~ 295
     */
    public Progress gapDegree(Object value)
    {
        return set("gapDegree", value);
    }

    /**
     * 仪表盘进度条缺口位置 可选值: top | bottom | left | right
     */
    public Progress gapPosition(Object value)
    {
        return set("gapPosition", value);
    }

    /**
     * 是否隐藏
     */
    public Progress hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public Progress hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public Progress id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置不同的值段，用不同的样式提示用户
     */
    public Progress map(Object value)
    {
        return set("map", value);
    }

    /**
     * 进度条类型 可选值: line | circle | dashboard
     */
    public Progress mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 关联字段名
     */
    public Progress name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public Progress onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public Progress placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 进度条 CSS 类名
     */
    public Progress progressClassName(Object value)
    {
        return set("progressClassName", value);
    }

    /**
     * 是否显示值
     */
    public Progress showLabel(boolean value)
    {
        return set("showLabel", value);
    }

    /**
     * 是否显示阈值数值
     */
    public Progress showThresholdText(boolean value)
    {
        return set("showThresholdText", value);
    }

    /**
     * 是否静态展示
     */
    public Progress staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public Progress staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public Progress staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public Progress staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public Progress staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public Progress staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public Progress staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 是否显示背景间隔
     */
    public Progress stripe(boolean value)
    {
        return set("stripe", value);
    }

    /**
     * 进度条线的宽度
     */
    public Progress strokeWidth(Object value)
    {
        return set("strokeWidth", value);
    }

    /**
     * 组件样式
     */
    public Progress style(Object value)
    {
        return set("style", value);
    }

    /**
     * 阈值
     */
    public Progress threshold(Object value)
    {
        return set("threshold", value);
    }

    public Progress type(Object value)
    {
        return set("type", value);
    }

    /**
     * 进度值
     */
    public Progress value(Object value)
    {
        return set("value", value);
    }

    /**
     * 内容的模板函数
     */
    public Progress valueTpl(Object value)
    {
        return set("valueTpl", value);
    }

    /**
     * 是否显示
     */
    public Progress visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public Progress visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public Progress set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
