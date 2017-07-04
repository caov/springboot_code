package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:10 2017/7/4 0004
 */
public class Main {

    public static void main(String[] args){
        //使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
       //获取声明配置的UseFunctionService的Bean
       UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
       System.out.println(useFunctionService.sayHello("di"));

       context.close();
    }
}
