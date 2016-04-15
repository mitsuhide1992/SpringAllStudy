package com.mitsuhide.context;

import com.mitsuhide.entity.common.EntityManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zly on 2016/4/15.
 */
public class ContextLoader extends AnnotationConfigApplicationContext {
    private ContextLoader () {
        super(EntityManager.class);
    };

    private static ContextLoader instance;

    public static ContextLoader getInstance () {
        return ContextLoaderHolder.instance;
    }

    private static class ContextLoaderHolder {
        private final static ContextLoader instance = new ContextLoader();
    }
}
