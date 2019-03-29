package com.example.spring;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Do backstrokes for 15 minutes.";
    }

    @Override
    public String getMyFortune() {
        return fortuneService.getMyFortune();
    }
}
