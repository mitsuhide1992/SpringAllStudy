package com.mitsuhide.entity.processor;

import com.mitsuhide.entity.common.Athlete;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by zly on 2016/4/15.
 */
@Component
public class PlayerPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Athlete) {
            Athlete ath = (Athlete)bean;
            System.out.println("Bean 后处理器，before: " + ath.getBall().getBallName());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Athlete) {
            Athlete ath = (Athlete)bean;
            System.out.println("Bean 后处理器，after: " + ath.getBall().getBallName());
        }
        return bean;
    }
}
