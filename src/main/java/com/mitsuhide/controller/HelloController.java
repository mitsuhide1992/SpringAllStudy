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

    /*
     * 返回String的消息
     */
    @RequestMapping("/hello")
    public @ResponseBody String hello () {
//        ContextLoader context = ContextLoader.getInstance();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Athlete zly = context.getBean(Athlete.class);
        Player zly = (Player)context.getBean("Athlete");
//        zly.sayHello();
        return zly.sayHello();
    }

    /*
    定位到jsp视图
     */
    @RequestMapping(value="/test")
    public String test () {
        return "test/hello";
    }

    @RequestMapping(value="/ajaxR")
    public @ResponseBody String ajax () {
        return "hahhaha";
    }

}
