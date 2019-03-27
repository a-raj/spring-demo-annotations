package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getMyFortune() {
        return "Hello Happy Fortune Service";
    }
}
