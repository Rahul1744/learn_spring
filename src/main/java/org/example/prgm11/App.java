package org.example.prgm11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("config11.xml");
        Author author=(Author)context.getBean("author");
        System.out.println("Id :" +author.getId()+ "Name :"+author.getName());
        context.close();
    }
}
