package com.liuwei.yeb.api.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.生成随机的验证码及图片
        Object[] objs = BufferImage.createImage();
        //2.将验证码存入session
        String imgcode = (String) objs[0];
        HttpSession session = request.getSession();
        session.setAttribute("checkcode", imgcode);
        //3.将图片输出给浏览器
        BufferedImage img = (BufferedImage) objs[1];
        response.setContentType("image/png");
        //服务器自动创建输出流，目标指向浏览器
        OutputStream os = response.getOutputStream();
        ImageIO.write(img, "png", os);
        os.close();
    }
}
