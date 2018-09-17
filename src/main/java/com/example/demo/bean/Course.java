package com.example.demo.bean;

import com.example.demo.entity.Student;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class Course {
    @Resource
    private Student student;
    @Resource
    private Teacher teacher;

    @Override
    public String toString() {
        return "Course{" +
                "学生=" + student +
                ", 教师=" + teacher +
                '}';
    }
}
