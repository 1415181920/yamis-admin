
package io.xiaoyu.core.handler;

import cn.dev33.satoken.exception.SaTokenException;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpStatus;
import io.xiaoyu.common.pojo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.exceptions.PersistenceException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import java.util.List;

/**
 * 全局异常处理工具类，将异常转为通用结果
 *
-
 */
@Slf4j
public class GlobalExceptionUtil {
//
//    /**
//     * 根据错误类型获取对应的CommonResult
//     *
//     * @author xuyuxiang
//     * @date 2021/10/11 15:52
//     **/
//    public static CommonResult<String> getCommonResult(Exception e) {
//        CommonResult<String> commonResult;
//        if (e instanceof HttpRequestMethodNotSupportedException) {
//
//            // 如果是请求方法异常 405
//            String method = CommonServletUtil.getRequest().getMethod();
//            if (HttpMethod.GET.toString().equals(method)) {
//                commonResult = CommonResult.get(HttpStatus.HTTP_BAD_METHOD, "请求方法应为POST", null);
//            } else if(HttpMethod.POST.toString().equals(method)) {
//                commonResult = CommonResult.get(HttpStatus.HTTP_BAD_METHOD, "请求方法应为GET", null);
//            } else {
//                commonResult = CommonResult.get(HttpStatus.HTTP_BAD_METHOD, "请求方法仅支持GET或POST", null);
//            }
//        } else if (e instanceof HttpMessageNotReadableException) {
//            log.error(">>> 参数传递格式异常：", e);
//            // 如果是参数传递格式不支持异常 415
//            if (e.getMessage().contains("JSON parse error")) {
//                //JSON格式转换错误特殊提示
//                commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, "参数格式错误", null);
//            } else {
//                commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, "请使用JSON方式传参", null);
//            }
//        } else if (e instanceof HttpMediaTypeNotSupportedException) {
//            log.error(">>> 参数传递格式异常：", e);
//            // 如果是JSON参数格式错误异常 415
//            commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, "参数格式错误", null);
//        } else if (e instanceof MethodArgumentNotValidException) {
//
//            // 如果是参数校验异常（MethodArgumentNotValidException） 415
//            MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException) e;
//            commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, getArgNotValidMessage(methodArgumentNotValidException.getBindingResult()), null);
//        } else if (e instanceof BindException) {
//
//            // 如果是参数校验异常（BindException） 415
//            BindException bindException = (BindException) e;
//            commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, getArgNotValidMessage(bindException.getBindingResult()), null);
//        } else if (e instanceof ConstraintViolationException) {
//
//            // 如果是参数校验异常（ConstraintViolationException） 415
//            ConstraintViolationException constraintViolationException = (ConstraintViolationException) e;
//            commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, getArgNotValidMessage(constraintViolationException.getConstraintViolations()), null);
//        } else if (e instanceof MissingServletRequestParameterException) {
//
//            // 如果是参数校验异常（MissingServletRequestParameterException） 415
//            MissingServletRequestParameterException missingServletRequestParameterException = (MissingServletRequestParameterException) e;
//            commonResult = CommonResult.get(HttpStatus.HTTP_UNSUPPORTED_TYPE, missingServletRequestParameterException.getMessage(), null);
//        }
//        else if (e instanceof MultipartException) {
//            log.error(">>> 文件上传参数异常：", e);
//            //文件上传错误特殊提示
//            commonResult = CommonResult.error("请使用multipart/form-data方式上传文件");
//        } else if (e instanceof MissingServletRequestPartException) {
//            log.error(">>> 文件上传参数异常：", e);
//            //文件上传错误特殊提示
//            commonResult = CommonResult.error("请选择要上传的文件并检查文件参数名称是否正确");
//        } else if (e instanceof SaTokenException) {
//
//            // 如果是SaToken相关异常，则由AuthExceptionUtil处理
//            return AuthExceptionUtil.getCommonResult(e);
//        } else if(e instanceof MyBatisSystemException) {
//
//            // 如果是MyBatisSystemException
//            Throwable cause = e.getCause();
//            if (cause instanceof PersistenceException) {
//                Throwable secondCause = cause.getCause();
//                if (secondCause instanceof CommonException) {
//                    CommonException commonException = (CommonException) secondCause;
//                    commonResult = CommonResult.get(commonException.getCode(), commonException.getMsg(), null);
//                } else {
//                    log.error(">>> 数据操作异常：", e);
//                    commonResult = CommonResult.error("数据操作异常");
//                }
//            } else {
//                log.error(">>> 数据操作异常：", e);
//                commonResult = CommonResult.error("数据操作异常");
//            }
//        } else if (e instanceof CommonException) {
//
//            // 通用业务异常，直接返回给前端
//            CommonException commonException = (CommonException) e;
//            commonResult = CommonResult.get(commonException.getCode(), commonException.getMsg(), null);
//        }  else {
//            // 未知异常打印详情
//            log.error(">>> 服务器未知异常，请求地址：{}，具体信息：", CommonServletUtil.getRequest().getRequestURL(), e);
//            // 未知异常返回服务器异常
//            commonResult = CommonResult.error();
//        }
//        return commonResult;
//    }
//
//    /**
//     * 获取请求参数不正确的提示信息，多个信息，拼接成用逗号分隔的形式
//     *
//     * @author xuyuxiang
//     * @date 2021/10/12 11:14
//     **/
//    public static String getArgNotValidMessage(Set<ConstraintViolation<?>> constraintViolationSet) {
//        if (ObjectUtil.isEmpty(constraintViolationSet)) {
//            return "";
//        }
//        StringBuilder stringBuilder = StrUtil.builder();
//
//        // 多个错误用逗号分隔
//        for (ConstraintViolation<?> constraintViolation : constraintViolationSet) {
//            stringBuilder.append(StrUtil.COMMA).append(constraintViolation.getMessage());
//        }
//
//        // 最终把首部的逗号去掉
//        return StrUtil.removePrefix(stringBuilder.toString(), StrUtil.COMMA);
//    }
//
//    /**
//     * 获取请求参数不正确的提示信息，多个信息，拼接成用逗号分隔的形式
//     *
//     * @author xuyuxiang
//     * @date 2021/10/12 11:14
//     **/
//    public static String getArgNotValidMessage(BindingResult bindingResult) {
//        if (ObjectUtil.isNull(bindingResult)) {
//            return "";
//        }
//        StringBuilder stringBuilder = StrUtil.builder();
//
//        // 多个错误用逗号分隔
//        List<ObjectError> allErrorInfos = bindingResult.getAllErrors();
//        for (ObjectError error : allErrorInfos) {
//            stringBuilder.append(StrUtil.COMMA).append(error.getDefaultMessage());
//        }
//
//        // 最终把首部的逗号去掉
//        return StrUtil.removePrefix(stringBuilder.toString(), StrUtil.COMMA);
//    }
}
