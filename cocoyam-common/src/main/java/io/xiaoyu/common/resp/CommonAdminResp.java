package io.xiaoyu.common.resp;

import java.io.Serializable;

public class CommonAdminResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_ERROR = 1;


    private int status;


    private String msg;


    private T data;
    
    private Integer doNotDisplayToast;

    public CommonAdminResp() {
    }

    public CommonAdminResp(int status, String msg, T data) {
        this.setStatus(status);
        this.setMsg(msg);
        this.setData(data);
    }

    public CommonAdminResp(T data) {
        this.data = data;
    }

    /**
     * 获取status
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 获取msg
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }
    /**
     * 获取data
     * @return data
     */
    public T getData() {
        return this.data;
    }

    /**
     * 给status赋值，连缀风格
     * @param status status
     * @return 对象自身
     */
    public CommonAdminResp<T> setStatus(int status) {
        this.status = status;
        return this;
    }

    /**
     * 给msg赋值，连缀风格
     * @param msg msg
     * @return 对象自身
     */
    public CommonAdminResp<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 给data赋值，连缀风格
     * @param data data
     * @return 对象自身
     */
    public CommonAdminResp<T> setData(T data) {
        this.data = data;
        return this;
    }


    // ============================  构建  ==================================

    // 构建成功
    public static <T> CommonAdminResp<T> ok() {
        return new CommonAdminResp<>(STATUS_SUCCESS, "操作成功", null);
    }
    public static <T> CommonAdminResp<T> ok(String msg) {
        return new CommonAdminResp<>(STATUS_SUCCESS, msg, null);
    }

    public static <T> CommonAdminResp<T> status(int status) {
        return new CommonAdminResp<>(status, null, null);
    }
    public static <T> CommonAdminResp<T> data(T data) {
        return new CommonAdminResp<>(STATUS_SUCCESS, "操作成功", data);
    }

    // 构建失败
    public static <T> CommonAdminResp<T> error() {
        return new CommonAdminResp<>(STATUS_ERROR, "服务器异常", null);
    }
    public static <T> CommonAdminResp<T> error(String msg) {
        return new CommonAdminResp<>(STATUS_ERROR, msg, null);
    }

    // 构建指定状态码
    public static <T> CommonAdminResp<T> get(int status, String msg, T data) {
        return new CommonAdminResp<>(status, msg, data);
    }

    /*
     * toString()
     */
    @Override
    public String toString() {
        return "{"
                + "\"status\": " + this.getStatus()
                + ", \"msg\": \"" + this.getMsg() + "\""
                + ", \"data\": \"" + this.getData() + "\""
                + "}";
    }

}