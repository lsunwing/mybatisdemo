package com.liuwei.yeb.api.entity.response;

public class ResponseUtil {

    public static DataResponse success(Object data) {
        return new DataResponse("0000", "success", data);
    }
}
