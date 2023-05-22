package com.beann;

import org.springframework.stereotype.Component;

@Component
public class PersonTwo extends Person {

    public PersonTwo() {
        super("John", "Reese");
    }
}