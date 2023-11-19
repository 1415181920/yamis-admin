package io.xiaoyu.common.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonAdminResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum Status {
        SUCCESS,
        ERROR
    }

    public enum DisplayToast {
        SHOW,
        NOT_SHOW
    }

    private Status status;
    private String message;
    private T data;
    private DisplayToast displayToast;

    public CommonAdminResp(Status status, String message, T data, DisplayToast displayToast) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.displayToast = displayToast;
    }

    public static <T> CommonAdminResp<T> success() {
        return new CommonAdminResp<>(Status.SUCCESS, "操作成功", null, DisplayToast.NOT_SHOW);
    }

    public static <T> CommonAdminResp<T> success(String message) {
        return new CommonAdminResp<>(Status.SUCCESS, message, null, DisplayToast.NOT_SHOW);
    }

    public static <T> CommonAdminResp<T> success(T data) {
        return new CommonAdminResp<>(Status.SUCCESS, "操作成功", data, DisplayToast.NOT_SHOW);
    }

    public static <T> CommonAdminResp<T> success(String message, T data) {
        return new CommonAdminResp<>(Status.SUCCESS, message, data, DisplayToast.NOT_SHOW);
    }

    public static <T> CommonAdminResp<T> successWithToast() {
        return new CommonAdminResp<>(Status.SUCCESS, "操作成功", null, DisplayToast.SHOW);
    }

    public static <T> CommonAdminResp<T> successWithToast(String message) {
        return new CommonAdminResp<>(Status.SUCCESS, message, null, DisplayToast.SHOW);
    }

    public static <T> CommonAdminResp<T> successWithToast(T data) {
        return new CommonAdminResp<>(Status.SUCCESS, "操作成功", data, DisplayToast.SHOW);
    }

    public static <T> CommonAdminResp<T> successWithToast(String message, T data) {
        return new CommonAdminResp<>(Status.SUCCESS, message, data, DisplayToast.SHOW);
    }

    public static <T> CommonAdminResp<T> error() {
        return new CommonAdminResp<>(Status.ERROR, "服务器异常", null, DisplayToast.SHOW);
    }

    public static <T> CommonAdminResp<T> error(String message) {
        return new CommonAdminResp<>(Status.ERROR, message, null, DisplayToast.SHOW);
    }
}
