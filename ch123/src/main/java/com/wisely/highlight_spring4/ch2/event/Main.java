package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 11:11 2017/7/5 0005
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");

        context.close();
    }
}
