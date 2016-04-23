package com.mitsuhide.controller;

import com.mitsuhide.context.ContextLoader;
import com.mitsuhide.entity.common.Athlete;
import com.mitsuhide.entity.common.Player.Player;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
//        ContextLoader context = ContextLoader.getInstance();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Athlete zly = context.getBean(Athlete.class);
        Player zly = (Player)context.getBean("Athlete");
//        zly.sayHello();
        return zly.sayHello();
    }
}
