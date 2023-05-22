package com.beann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.beann")
public class PersonConfig {
    @Bean
    public Person personOne() {
        return new PersonOne();
    }

    @Bean
    public Person personTwo() {
        return new PersonTwo();
    }
}
