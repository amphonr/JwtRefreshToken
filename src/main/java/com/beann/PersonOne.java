package com.beann;

import org.springframework.stereotype.Component;

@Component
public class PersonOne extends Person {

    public PersonOne() {
        super("Harold", "Finch");
    }
}
