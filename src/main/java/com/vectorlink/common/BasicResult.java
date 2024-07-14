package com.vectorlink.common;

import java.io.Serializable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicResult implements Serializable {
    private BasicResult.Result result = new BasicResult.Result();
    public static final int SUCCESS = 0;
    public static final int ERROR = 500;
    public static final int TOAST_ERROR = -1;
    public static final int ALERT_ERROR = -2;

    public BasicResult() {
    }

    public BasicResult(int code) {
        this.result.code = code;
    }

    public BasicResult(int code, String message) {
        this.result.code = code;
        this.result.message = message;
    }
    @JSONField(
            serialize = false
    )
    @JsonIgnore
    public int getCode() {
        return this.result.code;
    }

    public void setCode(int code) {
        this.result.code = code;
    }

    @JSONField(
            serialize = false
    )
    @JsonIgnore
    public String getMessage() {
        return this.result.message;
    }

    public void setMessage(String message) {
        this.result.message = message;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }

    public BasicResult.Result getResult() {
        return this.result;
    }

    public void setResult(final BasicResult.Result result) {
        this.result = result;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Result implements Serializable {
        private int code = 0;
        private String message;

        public Result() {
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setCode(final int code) {
            this.code = code;
        }

        public void setMessage(final String message) {
            this.message = message;
        }
    }
}
