package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.example.spring")
public class SportConfig {

    // define bean for sad fortune service
    // Method name will be the bean id
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for swim coach and inject the dependency for it
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
