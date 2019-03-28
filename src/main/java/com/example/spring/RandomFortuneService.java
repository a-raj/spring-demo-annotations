package com.example.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${randomFortune1}")
    private String randomFortune1;

    @Value("${randomFortune2}")
    private String randomFortune2;

    @Value("${randomFortune3}")
    private String randomFortune3;

    private String[] fortunes = new String[3];

    @PostConstruct
    private void setFortunes(){
        fortunes[0] = randomFortune1;
        fortunes[1] = randomFortune2;
        fortunes[2] = randomFortune3;
    }


    private Random random = new Random();

    @Override
    public String getMyFortune() {
         int index = random.nextInt(fortunes.length);
         return fortunes[index];
    }
}
