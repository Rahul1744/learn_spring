package org.example.prgm7.component_bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int age;

    public Student() {
        this.name = "John Doe";
        this.age = 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
