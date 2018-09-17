package com.example.demo.controller;

import com.example.demo.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CourseController {
    @Resource
    private Course course;
    @GetMapping("/course")
    public String getCourse(){
        return course.toString();
    }
}
