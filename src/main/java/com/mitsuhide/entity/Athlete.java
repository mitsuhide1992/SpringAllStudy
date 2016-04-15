package com.mitsuhide.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by zly on 2016/4/15.
 */
@Component("Athlete")
@ComponentScan
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
        String helloWords = "Hi, I am " + ball.getBallName() + " player";
        return helloWords;
    }
}
