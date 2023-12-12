package org.example.prgm5.type2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Class
public class App {

    // Main driver method
    public static void main(String[] args)
    {

        // Reading the application-context file
        // from the class-path
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config5type2.xml");

        // Spring check the blueprint for GeeksCourses bean
        // from application-context.xml file and return it
        GeeksCourses geeksCourses = (GeeksCourses)context.getBean("courseId");

        // geeksCourses contain the dependency
        // of GeeksCourses class
        geeksCourses.getCourseDetail();
    }
}
