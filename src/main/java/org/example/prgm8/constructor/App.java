package org.example.prgm8.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config8type3.xml");

        Student student = context.getBean("st", Student.class);

        System.out.println(student);
    }
}
