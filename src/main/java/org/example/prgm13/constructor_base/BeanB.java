package org.example.prgm13.constructor_base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private BeanA beanA;

    @Autowired
    public BeanB(BeanA beanA) {
        this.beanA = beanA;
        //        Investigation
        System.out.println("Bean B constructor is called.");
    }
}