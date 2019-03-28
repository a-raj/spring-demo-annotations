package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    // Field injection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    // do startup Stuff
    @PostConstruct
    private void doMyStartupStuff() {
        System.out.println("TennisCoach: inside doMyStartupStuff()");
    }

    // do my cleanup stuff
    @PreDestroy
    private void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside doMyCleanupStuff");
    }
    /*
    // Constructor Injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*
    // Setter Injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
    */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getMyFortune() {
        return fortuneService.getMyFortune();
    }
}
