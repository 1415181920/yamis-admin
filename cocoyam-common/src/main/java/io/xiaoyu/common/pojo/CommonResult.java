package io.xiaoyu.common.pojo;

import lombok.Data;

import java.io.Serializable;



@Data
/** 已废弃 */
@Deprecated
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final int CODE_SUCCESS = 200;
    public static final int CODE_ERROR = 500;


    private int code;


    private String msg;


    private int doNotDisplayToast;

    private T data;


    public CommonResult(int code, String msg, T data, int doNotDisplayToast) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
        this.setDoNotDisplayToast(doNotDisplayToast);
    }


    // ============================  构建  ==================================

    // 构建成功
    public static <T> CommonResult<T> ok() {
        return new CommonResult<>(CODE_SUCCESS, "操作成功", null,1);
    }

    public static <T> CommonResult<T> ok(String msg) {
        return new CommonResult<>(CODE_SUCCESS, msg, null,1);
    }

    public static <T> CommonResult<T> ok(T data) {
        return new CommonResult<>(CODE_SUCCESS, "操作成功", data,1);
    }

    // 构建失败
    public static <T> CommonResult<T> error() {
        return new CommonResult<>(CODE_ERROR, "服务器异常", null,0);
    }
    public static <T> CommonResult<T> error(String msg) {
        return new CommonResult<>(CODE_ERROR, msg, null,0);
    }

}