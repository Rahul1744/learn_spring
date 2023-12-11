package org.example.prgm;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Using ApplicationContext tom implement Spring IoC
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // Get the bean
        Sim sim1 = applicationContext.getBean("sim1", Sim.class);

        // Calling the methods
        sim1.calling();
        sim1.data();
        //sim.data();

        // Get the bean
        Sim sim2 = applicationContext.getBean("sim2", Sim.class);

        // Calling the methods
        sim2.calling();
        sim2.data();
        //sim.data();
    }
}
