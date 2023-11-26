package io.xiaoyu.core.handler;

import io.xiaoyu.common.exception.CommonException;
import io.xiaoyu.common.pojo.CommonResult;
import io.xiaoyu.common.resp.CommonAdminResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理器
 *
 * @author xuyuxiang
 * @date 2021/10/9 14:59
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 不同异常返回不同结果
     *
     * @author xiaoyu
     * @date 2022/7/28 16:54
     **/
    @ResponseBody
    @ExceptionHandler
    public CommonAdminResp<String> handleException(Exception e) {

        log.error(">>> 全局异常捕获：", e);
        System.err.println("报错类：" + e.getClass().getName());
        System.err.println("报错信息：" + e.getMessage());
        if (e instanceof CommonException) {
            return CommonAdminResp.error(e.getMessage());
        }else if (e instanceof DuplicateKeyException){
            return CommonAdminResp.error("值存在重复!");
        }else if (e instanceof SQLException){
            return CommonAdminResp.error("SQL异常");
        }else if (e instanceof NullPointerException){
            return CommonAdminResp.error("空指针异常");
        }else if (e instanceof RuntimeException){
            return CommonAdminResp.error("运行时异常");
        }

        return CommonAdminResp.error();
    }
}