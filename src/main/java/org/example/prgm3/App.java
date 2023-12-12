package org.example.prgm3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {

        // Implementing Spring IoC
        // Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");

        // Getting the bean student
        Student student
                = context.getBean("student", Student.class);

        // Calling the method inside main() method
        student.cheating();
    }
}
