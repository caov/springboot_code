package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 10:25 2017/7/5 0005
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");//先将活动的profile设置为prod
        context.register(ProfileConfig.class);//后置注册Bean配置lei,不然会报Bean未定义的错误
        context.refresh(); //刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
