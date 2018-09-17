package com.example.demo.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Configuration
@Data
public class Student {
    private String name;
    private int age;
    private String male;
    private String studentNo;
}
