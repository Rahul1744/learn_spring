package org.example.prgm13.constructor_base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private BeanB beanB;

    @Autowired
    public BeanA(@Lazy BeanB beanB) {
        this.beanB = beanB;

//        Investigation
        System.out.println("Bean A constructor is called. With @Lazy Annotation.");
    }
}
