package com.liuwei.yeb.api.controller;

import java.sql.SQLOutput;

import com.liuwei.yeb.api.entity.Student;
import com.liuwei.yeb.api.entity.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    @RequestMapping("/test1")
    public String test1(String name) {
        System.out.println(name);
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2(Student student) {
        System.out.println(student);
        return "test2";
    }

    @RequestMapping("/test3")
    public String test3(Student student, Teacher teacher) {
        System.out.println(student);
        System.out.println(teacher);
        return "test3";
    }
}
