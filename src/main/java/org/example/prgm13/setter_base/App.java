package org.example.prgm13.setter_base;

import org.example.prgm13.constructor_base.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(org.example.prgm13.setter_base.AppConfig.class);
    }
}