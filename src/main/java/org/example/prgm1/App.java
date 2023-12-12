package org.example.prgm1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    // Main driver method
    public static void main(String[] args) {

        // Creating object in a spring container (Beans)
        BeanFactory factory = new ClassPathXmlApplicationContext("config1.xml");
        Student student = (Student) factory.getBean("student");

        System.out.println(student);

        Student student1 = (Student) factory.getBean("student1");

    }
}
