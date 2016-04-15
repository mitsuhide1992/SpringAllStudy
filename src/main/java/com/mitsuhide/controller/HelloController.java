package com.mitsuhide.controller;

import com.mitsuhide.entity.Athlete;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zly on 2016/4/14.
 */
@Controller
@RequestMapping("/mvc")
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String hello () {
        ApplicationContext context = new AnnotationConfigApplicationContext(Athlete.class);
        Athlete zly = context.getBean(Athlete.class);
//        zly.sayHello();
        return zly.sayHello();
    }
}
