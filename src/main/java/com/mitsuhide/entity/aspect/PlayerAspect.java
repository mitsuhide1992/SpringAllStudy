package com.mitsuhide.entity.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;
import org.springframework.stereotype.Component;

/**
 * Created by zly on 2016/4/15.
 */
@Aspect
@Component
public class PlayerAspect extends CustomizableTraceInterceptor {
    @Pointcut("execution( * com.mitsuhide.entity.common.Athlete.*(..))")
    private void aspectMethod(){}//定义一个切入点

    @Before("aspectMethod()")
    public void before () {
        System.out.println("方法执行前执行...... By mitsuhide aspect.");
    }

    @After("aspectMethod()")
    public void after () {
        System.out.println("方法执行后执行...... By mitsuhide aspect.");
    }
}

