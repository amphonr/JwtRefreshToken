package com.beann;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigRegistry;

import javax.naming.Context;

public class TestBean {
    public static void main (String[] args) {
        AnnotationConfigApplicationContext contaxt = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person1 = contaxt.getBean(PersonOne.class);
        System.out.println(person1.toString());
    }
}
