package com.mitsuhide.entity.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zly on 2016/4/15.
 */
@Aspect
public class PlayerAspect {
    @Before("execution(* com.mitsuhide.entity.common.Athlete.sayHello(..))")
    public void before () {
        System.out.println("方法执行前执行...... By mitsuhide aspect.");
    }

    @After("execution(* com.mitsuhide.entity.common.Athlete.sayHello(..))")
    public void after () {
        System.out.println("方法执行后执行...... By mitsuhide aspect.");
    }
}
