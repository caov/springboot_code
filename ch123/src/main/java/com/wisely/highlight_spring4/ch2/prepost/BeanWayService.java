package com.wisely.highlight_spring4.ch2.prepost;

/**
 * @Author:van
 * @Description 使用java配置方式@Bean
 * @Date: Create in 上午 9:49 2017/7/5 0005
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
