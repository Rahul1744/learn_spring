package org.example.prgm7.component_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // Create an application context using annotation-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Student instance from the context
        Student student = context.getBean(Student.class);

        // Access the name and age from the Student
        String name = student.getName();
        int age = student.getAge();

        // Print the student details
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
