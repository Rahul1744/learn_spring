package org.example.prgm13.setter_base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    BeanB() {
        System.out.println("BeanB constructor called !!!");
    }

    private BeanA beanA;

    @Autowired
    public void setBeanA(BeanA beanA) {
        System.out.println("Setting property beanA of BeanB instance");
        this.beanA = beanA;
    }
}
