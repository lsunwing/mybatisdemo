package com.liuwei.yeb.api.common;

import java.util.HashMap;

public class YebResponse<T> {
    private static final long serialVersionUID = -8400788480891230056L;

    String code;
    String msg;
    T data;

    public YebResponse() {
    }

    public YebResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public YebResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
