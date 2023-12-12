package org.example.prgm7.xml_base;

import org.example.prgm2.Vehicle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    // Main driver method
    public static void main(String[] args) {

        // Creating object in a spring container (Beans)
//        BeanFactory factory = new ClassPathXmlApplicationContext("config7type1.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("config7type1.xml");
        Student obj1 = (Student) context.getBean("student");
        System.out.println(obj1);

        Student obj2 = (Student) context.getBean("student1");
        System.out.println(obj2);
    }
}
