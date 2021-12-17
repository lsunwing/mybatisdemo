package com.liuwei.yeb.api.common;

public class DataResponse<T> {
    private static final long serialVersionUID = -8400788480891230056L;

    String code;
    String msg;
    T data;

    public DataResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public DataResponse(String code, String msg, T data) {
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
