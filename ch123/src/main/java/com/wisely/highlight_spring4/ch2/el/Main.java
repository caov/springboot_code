package com.wisely.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 9:01 2017/7/5 0005
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
