package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

    @Override
    public String getMyFortune() {
        return "Today is my Lucky day...!";
    }
}
