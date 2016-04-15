package com.mitsuhide.controller;

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
        return "Hello mitsuhide!";
    }
}
