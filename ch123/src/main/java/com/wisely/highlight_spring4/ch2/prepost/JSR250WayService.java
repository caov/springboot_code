package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 9:53 2017/7/5 0005
 */
public class JSR250WayService {

    @PostConstruct //在构造函数执行完之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造方法-JSR250WayService");
    }

    @PreDestroy //在Bean销毁之前执行
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
