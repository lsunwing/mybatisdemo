package com.liuwei.mybatisdemo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseResult<Map> login(HttpServletRequest request, String userName, String pwd) {
        ResponseResult<Map> responseResult = new ResponseResult<>("10000", "success");
        Map<String, String> map = new HashMap<>();
        map.put("token", "1234567890");
        responseResult.setData(map);
        return responseResult;
    }
}
