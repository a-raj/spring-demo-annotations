package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("../resources/applicationContext.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        Coach betaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Pointing to the same object: " + (alphaCoach == betaCoach));

        System.out.println("Memory location of alphaCoach: " + alphaCoach);
        System.out.println("Memory location of betaCoach: " + betaCoach);

        context.close();
    }
}
