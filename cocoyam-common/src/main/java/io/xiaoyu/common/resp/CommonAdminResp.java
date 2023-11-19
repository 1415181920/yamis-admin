package io.xiaoyu.common.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonAdminResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_ERROR = 1;


    private Integer status;

    private String msg;

    private T data;

    private Integer doNotDisplayToast;

    public CommonAdminResp(int status, String msg, T data, int doNotDisplayToast) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.doNotDisplayToast = doNotDisplayToast;
    }

    // 构建成功
    public static <T> CommonAdminResp<T> ok() {
        return new CommonAdminResp<>(STATUS_SUCCESS, "操作成功", null,0);
    }
    public static <T> CommonAdminResp<T> ok(String msg) {
        return new CommonAdminResp<>(STATUS_SUCCESS, msg, null,0);
    }

    public static <T> CommonAdminResp<T> ok(T data) {
        return new CommonAdminResp<>(STATUS_SUCCESS, "操作成功", data,0);
    }

    public static <T> CommonAdminResp<T> ok(String msg,T data) {
        return new CommonAdminResp<>(STATUS_SUCCESS, msg, data,0);
    }


    // 构建失败
    public static <T> CommonAdminResp<T> error() {
        return new CommonAdminResp<>(STATUS_ERROR, "服务器异常", null,1);
    }

    public static <T> CommonAdminResp<T> error(String msg) {
        return new CommonAdminResp<>(STATUS_ERROR, msg, null,1);
    }

}