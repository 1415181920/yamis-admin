package io.xiaoyu.common.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonAdminResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum Status {
        SUCCESS(0),
        ERROR(1);

        private final int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum DisplayToast {
        SHOW(0),
        NOT_SHOW(1);

        private final int value;

        DisplayToast(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Integer status;
    private String msg;
    private T data;
    private Integer doNotDisplayToast;

    public CommonAdminResp(Integer status, String msg, T data, Integer doNotDisplayToast) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.doNotDisplayToast = doNotDisplayToast;
    }

    public CommonAdminResp(Integer status, String msg, Integer doNotDisplayToast) {
        this.status = status;
        this.msg = msg;
        this.doNotDisplayToast = doNotDisplayToast;
        this.data = (T) new String[0];
    }


    public static <T> CommonAdminResp<T> success() {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), "操作成功",DisplayToast.NOT_SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> success(String message) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), message,DisplayToast.NOT_SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> success(T data) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), "操作成功", data,DisplayToast.NOT_SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> success(String message, T data) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), message, data,DisplayToast.NOT_SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> successWithToast() {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), "操作成功",  DisplayToast.SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> successWithToast(String message) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), message,DisplayToast.SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> successWithToast(T data) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), "操作成功", data, DisplayToast.SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> successWithToast(String message, T data) {
        return new CommonAdminResp<>(Status.SUCCESS.getValue(), message, data, DisplayToast.SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> error() {
        return new CommonAdminResp<>(Status.ERROR.getValue(), "服务器异常", null, DisplayToast.SHOW.getValue());
    }

    public static <T> CommonAdminResp<T> error(String message) {
        return new CommonAdminResp<>(Status.ERROR.getValue(), message, null, DisplayToast.SHOW.getValue());
    }
}
