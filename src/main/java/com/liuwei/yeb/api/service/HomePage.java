package com.liuwei.yeb.api.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HomePage implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Runtime.getRuntime().exec("cmd  /c start http://localhost:8080/mybatisdemo/user/queryAllUsers");
        Runtime.getRuntime().exec("cmd  /c start http://localhost:8081/api/user/queryAllUsers");
    }
}
