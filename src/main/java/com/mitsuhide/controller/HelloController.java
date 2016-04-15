package com.mitsuhide.controller;

import com.mitsuhide.context.ContextLoader;
import com.mitsuhide.entity.common.Athlete;
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
        ContextLoader context = ContextLoader.getInstance();
        Athlete zly = context.getBean(Athlete.class);
//        zly.sayHello();
        return zly.sayHello();
    }
}
