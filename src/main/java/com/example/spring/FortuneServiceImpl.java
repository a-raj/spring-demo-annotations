package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

    public FortuneServiceImpl() {
        System.out.println("FortuneServiceImpl: inside default constructor");
    }

    @Override
    public String getMyFortune() {
        return "Today is my Lucky day...!";
    }
}
