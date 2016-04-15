package com.mitsuhide.entity.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zly on 2016/4/15.
 */
//@ComponentScan
@Component("Athlete")
public class Athlete {
    @Autowired
    private Basketball ball;

    public Basketball getBall() {
        return ball;
    }

    public void setBall(Basketball ball) {
        this.ball = ball;
    }

    public String sayHello () {
        String helloWords = "Hi, I am a " + ball.getBallName() + " player";
        return helloWords;
    }

    @PostConstruct
    public void init () {
        System.out.println("Athlete bean is initializing! By mitsuhide.");
    }

    @PreDestroy
    public void destroy () {
        System.out.println("Athlete bean is destroying! By mitsuhide.");
    }
}
