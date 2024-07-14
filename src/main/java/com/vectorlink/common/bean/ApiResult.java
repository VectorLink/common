package com.vectorlink.common.bean;

public class ApiResult<T> extends BasicResult {
    public static final String SUCCESS_STR = "SUCCESS";
    private T data;

    public ApiResult() {
    }

    public ApiResult(int code) {
        super(code);
    }

    public ApiResult(int code, String message) {
        super(code, message);
    }

    public ApiResult(T data) {
        this.data = data;
    }

    public ApiResult(int code, T data) {
        super(code);
        this.data = data;
    }

    public ApiResult(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public static <T> ApiResult<T> success() {
        return new ApiResult();
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult(data);
    }

    public static <T> ApiResult<T> success(String message) {
        return new ApiResult(0, message);
    }

    public static <T> ApiResult<T> success(String message, T data) {
        return new ApiResult(0, message, data);
    }

    public static <T> ApiResult<T> error(int code, T data) {
        return new ApiResult(code, data);
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
