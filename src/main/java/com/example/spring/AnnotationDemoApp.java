package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read the soring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("../resources/applicationContext.xml");

        // get the bean
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call the method
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();
    }


}
