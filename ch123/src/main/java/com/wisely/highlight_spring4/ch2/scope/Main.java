package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:27 2017/7/4 0004
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        System.out.println("p1与p2是否相等："+ p1.equals(p2));
        System.out.println("s1与s2是否相等："+ s1.equals(s2));
    }
}
