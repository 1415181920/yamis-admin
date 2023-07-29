package io.xiaoyu.core.handler;

import io.xiaoyu.common.pojo.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 *
 * @author xuyuxiang
 * @date 2021/10/9 14:59
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 不同异常返回不同结果
     *
     * @author xiaoyu
     * @date 2022/7/28 16:54
     **/
    @ResponseBody
    @ExceptionHandler
    public CommonResult<String> handleException(Exception e) {
        return CommonResult.error(e.getMessage());
    }
}