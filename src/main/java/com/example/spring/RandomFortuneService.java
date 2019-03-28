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


    /*
    * When Spring creates the beans it follows this general process
        1. Construct an instance of class
        2. Inject dependencies
        3. Set properties etc (@Value)

    In your case, when you initialized the array using this code

        // create an array of strings
        private String[] data = { a, b, c, d, e };

    The Spring Bean lifecycle was at step #1 above.
    It created an instance ... but during the assignment of the string array,
    the properties/fields for a, b, c, d, e haven't been set yet using @Value.
    That doesn't happen later until step #3.  So that's why you had null with the field assignment.
    * */
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
