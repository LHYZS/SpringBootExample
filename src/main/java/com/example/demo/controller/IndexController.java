package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/*
单例注解
 */
@Controller
//@Service
//@Component
//@Configuration
public class IndexController {
    @Resource
    private List<Student> studentList;
    @GetMapping(value = "/index")
    public String index(ModelMap map){
        studentList =new ArrayList<Student>();
        Student student=new Student();
        student.setName("huan");
        student.setAge(20);
        student.setMale("male");
        Student student1=new Student();
        student1.setName("sheng");
        student1.setAge(19);
        student1.setMale("female");
        studentList.add(student);
        studentList.add(student1);
        map.addAttribute("studentList",studentList);
        return "index";
    }

}
