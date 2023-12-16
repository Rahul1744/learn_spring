package org.example.prgm13.setter_base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    BeanA() {
        System.out.println("BeanA constructor called !!!");
    }

    private BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        System.out.println("Setting property beanB of BeanA instance");
        this.beanB = beanB;
    }
}