package com.example.spring;

public class SadFortuneService implements FortuneService {

    @Override
    public String getMyFortune() {
        return "Today is a sad day :( ..!";
    }
}
