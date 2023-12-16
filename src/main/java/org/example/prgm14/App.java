package org.example.prgm14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config14.xml");
        Student s=ctx.getBean("s",Student.class);
        System.out.println(s);
    }
}

